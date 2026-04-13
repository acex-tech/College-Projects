<?php

$xml=simplexml_load_file("book.xml");
foreach($xml->book as $book)
    {
        echo "Book No: $book->bookno<br>";
        echo "Book Name: $book->bookname<br>";
        echo "Author Name: $book->authorname<br>";
        echo "Price: $book->price<br>";
        echo "Year: $book->year<br><br>";
    }