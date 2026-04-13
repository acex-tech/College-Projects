<?php
session_start();
if(isset($_POST['submit']))
    {
    $username =$_POST['username'];
    $password =$_POST['password'];

    $corrrect_username = "satyam";
    $correct_password = "password123";

    if($username == $corrrect_username && $password == $correct_password)
        {
        header('location:slip3ii.php');
        }
        else
        {
            if(isset($_SESSION['attempts']))
            {
                $_SESSION['attempts']--;
            }
            else{
                $_SESSION['attempts']=3;
            }

    if($_SESSION['attempts']<=0)
        {
            echo "you have been used all your attempts. Please try again after some time.";
        }
        else
        {
            echo "Invalid username or password. You have ".$_SESSION['attempts']." attempts left.";
        }   
    }
    }
    ?>
    <html>
        <body>
            <form method="post">
                enter username:<input type="text" name="username" required><br>
                enter password:<input type="password" name="password" required><br>
                <input type="submit" name="submit" value="Login">
            </form> 
</body>
</html>