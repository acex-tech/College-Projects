<?php
$fp=fopen("contact.dat",'r');
echo "<table border=1>";
   echo"<tr><th>no.</th><th>name</th><th>res no.</th><th>mo. no. </th><th>address</th></tr>";
        while($row=fscanf($fp,"%s %s %s %s %s"))
        {
            echo "<tr>";
            foreach($row as $r)
                {
                echo "<td>$r</td>";
            }
            echo "</tr>";
        }
        echo "</table>";
       fclose($fp);
       ?>
