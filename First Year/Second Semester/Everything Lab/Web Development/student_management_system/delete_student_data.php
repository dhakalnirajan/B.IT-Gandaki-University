<?php
    session_start();

    // Check if the user is authenticated
    if (!isset($_SESSION["id"])) {
        header("Location: login_form.php"); // Redirect to login page
        exit();
    }
?>
<?php
if ($_SERVER["REQUEST_METHOD"] === "POST" && isset($_POST["delete_id"])) {
    $delete_id = $_POST["delete_id"];

    $servername = "localhost";
    $username = "root";
    $password = "";
    $database = "gandaki";

    // Create a connection to the existing database
    $conn = new mysqli($servername, $username, $password, $database);

    // Check connection
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // Delete data from the "student" table based on the provided ID
    $sql = "DELETE FROM student WHERE id = $delete_id";

    if ($conn->query($sql) === TRUE) {
        echo "Data updated successfully.";
        $conn->close();

        // Redirect to read_data.php
        header("Location: dashboard.php");
        exit;
    } else {
        echo "Error deleting data: " . $conn->error;
    }

    // Close the database connection
    $conn->close();
} else {
    echo "Invalid request. Please provide a valid student ID to delete.";
}
?>