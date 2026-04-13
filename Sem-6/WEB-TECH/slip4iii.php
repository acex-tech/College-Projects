<?php
session_start();
$bsal=$_POST['basicsal'];
$da=$_POST['da'];
$hra=$_POST['hra'];
$total=$bsal+$da+$hra;      
?>

<html>
    <body>
        <h1> Employeee details</h2>
        Employee Numbeer =<?php echo $_SESSION['eno'];?><br><br>
        employee name=<?php echo $_SESSION['ename'];?><br><br>
        employee address: <?php echo $_SESSION['eadd']?><br><br>

        <h2>Salary details</h2>
        Basic salary=<?php echo $bsal;?><br><br>
        da=<?php echo $da;?><br><br>
        hra=<?php echo $hra?><br><br>
        total salary=<?php echo $total;?><br><br>
    </body>
    </html>