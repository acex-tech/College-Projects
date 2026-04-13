<?php
$fontstyle = $_COOKIE['fontstyle'];
$fontsize = $_COOKIE['fontsize']."px";
$fontcolor = $_COOKIE['fontcolor'];
$bgcolor = $_COOKIE['bgcolor'];
?>

<style>
body {
    font-family: <?php echo $fontstyle ?>;
    font-size: <?php echo $fontsize ?>;
    color: <?php echo $fontcolor ?>;
    background-color: <?php echo $bgcolor ?>;
}
</style>

<body>
    <h1>Welcome to my website</h1>
    <p>This is a sample text to demonstrate the font style, size, color, and background color that you have selected.</p>           
    </body>