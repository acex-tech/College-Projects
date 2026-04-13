<?php
session_start();
$_SESSION['eno'] = $_POST['eno'];
$_SESSION['ename'] = $_POST['ename'];
$_SESSION['eadd']= $_POST['eadd'];
?>
<form method="post" action="slip4iii.php">
enter enployee enaring details:
<br><br>
Basic salary:
<input type="text" name="basicsal"><br><br>
enter DA:
<input type="text" name="da"><br><br>
enter HRA
<input type="text" name="hra"><br><br>

<input type="submit" value="submit">
</form>
</body>
</html>




