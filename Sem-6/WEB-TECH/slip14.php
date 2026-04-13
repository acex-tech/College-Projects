<?php
include 'db.php';
$name = $_GET['name'];

$q = "SELECT * FROM teacher WHERE tname='$name'";

$result = pg_query($conn, $q);

// table output
echo "<table border=1>";
echo "<tr><th>No</th><th>Name</th><th>Qualification</th><th>Salary</th></tr>";

while($row = pg_fetch_assoc($result)){
    echo "<tr>";
    echo "<td>".$row['tno']."</td>";
    echo "<td>".$row['tname']."</td>";
    echo "<td>".$row['qualification']."</td>";
    echo "<td>".$row['salary']."</td>";
    echo "</tr>";
}

echo "</table>";

// close connection
pg_close($conn);

?>