for $book in doc("books.xml")/library/book
where $book/price < 30
return $book/title