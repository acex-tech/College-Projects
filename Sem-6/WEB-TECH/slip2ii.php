<?php
if(isset($_POST['submit']))
{
    $fontstyle = $_POST['fontstyle'];
    $fontsize = $_POST['fontsize'];     
    $fontcolor = $_POST['fontcolor'];
    $bgcolor = $_POST['bgcolor'];

    setcookie('fontstyle',$fontstyle,time()+3600);
    setcookie('fontsize',$fontsize,time()+3600);
    setcookie('fontcolor',$fontcolor,time()+3600);
    setcookie('bgcolor',$bgcolor,time()+3600);

    header('location: slip2iii.php');
    exit();
}
?>