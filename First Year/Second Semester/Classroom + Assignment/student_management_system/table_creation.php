<?php
// Database configuration
$hostname = 'localhost';  // MySQL server hostname
$username = 'root'; // MySQL username
$password = ''; // MySQL password
$databaseName = 'gandaki'; // Database name

// Create a connection
$connection = new mysqli($hostname, $username, $password, $databaseName);

// Check the connection
if ($connection->connect_error) {
    die("Connection failed: " . $connection->connect_error);
}



// SQL query to create the "student" table
$sql_create_table = "CREATE TABLE IF NOT EXISTS student (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT(3) NOT NULL,
    photo VARCHAR(255) NOT NULL
)";

if ($connection->query($query) === TRUE) {
    echo "Table 'student' created successfully";
} else {
    echo "Error creating table: student: " . $connection->error;
}

// Close the connection
$connection->close();
?>