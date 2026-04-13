<?php

$q = $_GET['q'];

$names = array("Rohit","Virat","Dhoni","Ashwin","Hardik","Rahul");

$suggestion = "";

if($q != ""){
    $q = strtolower($q);
    $len = strlen($q);

    foreach($names as $name){
        if(strtolower(substr($name,0,$len)) == $q){
            $suggestion .= $name."<br>";
        }
    }
}

if($suggestion == ""){
    echo "No suggestion";
}
else{
    echo $suggestion;
}

?>