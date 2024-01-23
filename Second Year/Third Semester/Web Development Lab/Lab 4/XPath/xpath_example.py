"""
This is an example of using XPath queries with lxml library.

The code demonstrates how to use XPath queries to extract information from an XML document using the lxml library.
It loads an XML file, parses the XML data, and performs various XPath queries to retrieve specific elements and values from the XML.

The example includes the following XPath queries:
- Retrieving the titles of all books in the library
- Retrieving the author of the first book
- Retrieving books with a price less than 30
- Calculating the average price of all books in the library

Note: The XML data used in this example is provided as a string variable for simplicity.
In a real-world scenario, you would typically load the XML data from a file or an API response.
"""
"""
This is an example of using XPath queries with lxml library.
"""

from lxml import etree

# Load the XML file
XML_DATA = """
<!-- books.xml -->
<library>
    <book>
        <title>Introduction to XML</title>
        <author>John Doe</author>
        <price>29.99</price>
    </book>
    <book>
        <title>Web Development Basics</title>
        <author>Jane Smith</author>
        <price>24.95</price>
    </book>
</library>"""

# Parse the XML data
root = etree.XML(XML_DATA)

# Example XPath Queries
title = root.xpath("/library/book/title/text()")
print("Title of All Books: ", title)

first_author = root.xpath("/library/book[1]/author/text()")
print("First Author: ", first_author[0])

cheap_books = root.xpath("/library/book[price < 30]")
print("\nBooks with price less than 30: ")
for book in cheap_books:
    print(book.find("title").text)
    print(book.find("author").text)

average_price = root.xpath("sum(/library/book/price) div count(/library/book/price)")
print("\n Average Price: ", average_price)