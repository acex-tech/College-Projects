<?php
$name=$_GET['q'];
if($name=="")
    {
        echo "stranger please enter your name";
    }
else{
    $knownname=array("virat","sachin","dhoni");
    if(in_array($name,$knownname))
        {
            echo "hello master ".$name." welcome back";
        }
        else{
            echo "i dont know you ".$name;
        }
}
?>
