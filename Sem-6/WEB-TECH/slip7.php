<?php
$xml = new DOMDocument();
$xml->load("movie.xml");
$movies = $xml->getElementsByTagName("movie");
foreach($movies as $movie){
    $title = $movie->getElementsByTagName("movieTitle")->item(0)->nodeValue;
    $actor = $movie->getElementsByTagName("actorName")->item(0)->nodeValue;

    echo "Movie title: $title<br>";
    echo "Actor name: $actor<br><br>";

}