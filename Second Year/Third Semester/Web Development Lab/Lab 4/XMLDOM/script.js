let xmlString = `
<!-- sample.xml -->
<bookstore>
<book category="Fiction">
<title lang="en">Harry Potter</title>
<author>J.K. Rowling</author>
<price>19.99</price>
</book>
<book category="Non-Fiction">
<title lang="en">Sapiens</title>
<author>Yuval Noah Harari</author>
<price>24.95</price>
</book>
</bookstore>
`;
let xmlDoc = new DOMParser().parseFromString(xmlString, "application/xml");
// Accessing elements and attributes
let titleElement = xmlDoc.querySelector("book title");
console.log("Title: " + titleElement.textContent);
let categoryAttribute = xmlDoc.querySelector("book").getAttribute("category");
console.log("Category: " + categoryAttribute);
// Modifying content
titleElement.textContent = "New Title";
categoryAttribute = "Updated Category";
// Creating new elements
let newBookElement = xmlDoc.createElement("book");
newBookElement.setAttribute("category", "Sci-Fi");
newBookElement.innerHTML = "<title lang='en'>Dune</title><author>Frank Herbert</author><price>29.99</price>";
// Appending the new element to the document
xmlDoc.querySelector("bookstore").appendChild(newBookElement);
// Serializing the modified XML document
let serializedXml = new XMLSerializer().serializeToString(xmlDoc);
console.log(serializedXml);
