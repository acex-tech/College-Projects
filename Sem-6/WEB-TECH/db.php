<?php
$conn = pg_connect("host=localhost dbname=tybcs user=postgres password=Pass@123");
if(!$conn)
    {
        echo "Connection failed";
    }
    ?>