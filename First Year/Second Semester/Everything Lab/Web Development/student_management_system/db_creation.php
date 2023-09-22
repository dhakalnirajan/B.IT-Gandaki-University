<?php
// Database configuration
$hostname = 'localhost';  // MySQL server hostname
$username = 'root'; // MySQL username
$password = ''; // MySQL password

// Create a connection
$connection = new mysqli($hostname, $username, $password);

// Check the connection
if ($connection->connect_error) {
    die("Connection failed: " . $connection->connect_error);
}

// Create the database
$databaseName = 'gandaki';
$query = "CREATE DATABASE $databaseName";
if ($connection->query($query) === TRUE) {
    echo "Database created successfully";
} else {
    echo "Error creating database: " . $connection->error;
}

// Close the connection
$connection->close();
?>