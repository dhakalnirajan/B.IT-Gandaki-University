let $books := doc("books.xml")//book[price < 30]
return $books/title
let $books := doc("books.xml")//book[price < 30]
return
  <new_books>
    {
      for $book in $books
      order by $book/title
      return
        <book>
          <title>{$book/title}</title>
          <author>{$book/author}</author>
          <price>{$book/price}</price>
        </book>
    }
  </new_books>

let $books := doc("books.xml")//book
let $total := sum($books/price)
let $count := count($books)
let $average := if ($count > 0) then $total div $count else 0
return $average
