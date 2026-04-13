<?php
session_start();
?>

<html>
    <body>
        <form method="post" action="slip4ii.php">
            enter employeee number:
            <input type="text" name="eno">
            enter employee name:
            <input type="text" name="ename"><br>
            enter employee ADDRESS:
            <input type="text" name="eadd"><br>
            <br>
            <input type="submit" name="submit" value="Submit">
        </form>
    </body> 
</html>