<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Gallery</title>
    <link rel="stylesheet" href="./css/styles.css">
</head>
<body>
<h1>Student Management System</h1>
<div class="navbar">
    <a href="#">Home</a>
    <a href="#">Gallery</a>
    <a href="#">About</a>
    <a href="#">Contact</a>
</div>
<div class="gallery">
    <?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $database = "gandaki";

    // Create a connection to the existing database
    $conn = new mysqli($servername, $username, $password, $database);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // Retrieve student data from the "student" table
    $sql = "SELECT name, age, photo FROM student";
    $result = $conn->query($sql);

    if ($result !== false && $result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            $name = $row['name'];
            $age = $row['age'];
            $photo = $row['photo'];
    ?>
    <div class="student">
        <img src="<?php echo $photo; ?>" alt="<?php echo $name; ?>">
        <h2><?php echo $name; ?></h2>
        <p>Age: <?php echo $age; ?></p>
    </div>
    <?php
        }
    } else {
        echo "No student records found.";
    }

    $conn->close();
    ?>
</div>
</body>
</html>