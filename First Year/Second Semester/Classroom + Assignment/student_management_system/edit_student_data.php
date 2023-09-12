<?php
session_start();

// Check if the user is authenticated
if (!isset($_SESSION["id"])) {
    header("Location: login_form.php"); // Redirect to login page
    exit();
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Student Data</title>
    <link rel="stylesheet" type="text/css" href="./css/styles.css"> <!-- Include the styles.css file -->
    <style type="text/css">
        /*form css*/
        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="number"],
        input[type="file"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        img{
            width: 400px;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        h1 {
            text-align: left;
            padding: 10px;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <?php
        if (isset($_GET['id'])) {
            $student_id = intval($_GET['id']); // Convert the ID to an integer for security

            $servername = "localhost";
            $username = "root";
            $password = "";
            $database = "gandaki";

            $conn = new mysqli($servername, $username, $password, $database);

            if ($conn->connect_error) {
                die("Connection failed: " . $conn->connect_error);
            }

            if ($_SERVER["REQUEST_METHOD"] == "POST") {
                if (isset($_POST['submit'])){
                    // Validate and retrieve the updated student data from the form fields
                    $updated_name = isset($_POST['updated_name']) ? trim($_POST['updated_name']) : '';
                    $updated_age = isset($_POST['updated_age']) ? trim($_POST['updated_age']) : '';

                    // Validate required fields
                    if (empty($updated_name) || empty($updated_age)) {
                        echo "Name and Age are required fields.";
                    }  else {
                        // Check if a new photo is uploaded
                        if ($_FILES['new_photo']['error'] === 0) {
                            $new_photo_tmp = $_FILES['new_photo']['tmp_name'];
                            $new_photo_name = $_FILES['new_photo']['name'];
                            $new_photo_destination = "photos/" . $new_photo_name;

                            // Move the uploaded photo to the "uploads" directory
                            if (move_uploaded_file($new_photo_tmp, $new_photo_destination)) {
                                // UPDATE query to update the data in the "student" table with the new photo path
                                $sql = "UPDATE student SET name='$updated_name', age='$updated_age', photo='$new_photo_destination' WHERE id='$student_id'";
                            } else {
                                echo "Error uploading photo.";
                            }
                        } else {
                            // UPDATE query to update the data in the "student" table without changing the photo path
                            $sql = "UPDATE student SET name='$updated_name', age='$updated_age' WHERE id='$student_id'";
                        }

                        // After the query is executed successfully, display the success message and redirect
                        if (!empty($sql) && $conn->query($sql) === TRUE) {
                            echo "Data updated successfully.";
                            $conn->close();

                            // Redirect to dashboard.php
                            header("Location: dashboard.php");
                            exit;
                        } else {
                            echo "Error updating data: " . $conn->error;
                        }
                    }
                }
            }

            $sql = "SELECT * FROM student WHERE id = $student_id";
            $result = $conn->query($sql);

            if ($result && $result->num_rows == 1) {
                $row = $result->fetch_assoc();
        ?>
                <h1>Student Management System</h1>
                <div class="navbar">
                    <a href="dashboard.php">Back to dashboard</a>
                    <a href="student_form.php">Add Data</a>
                    <a href="logout.php">Logout</a>
                </div>
                <h2>Edit Student Data</h2>
                <form action="edit_student_data.php?id=<?php echo $student_id; ?>" method="post" enctype="multipart/form-data">
                    <input type="hidden" name="edit_id" value="<?php echo $row["id"]; ?>">
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" name="updated_name" value="<?php echo $row["name"]; ?>" required>
                    </div>
                    <div class="form-group">
                        <label for="age">Age:</label>
                        <input type="text" name="updated_age" value="<?php echo $row["age"]; ?>" required>
                    </div>
                    <div class="form-group">
                        <label for="current_photo">Current Photo:</label>
                        <img src="<?php echo $row["photo"]; ?>" alt="Current Photo">
                    </div>
                    <div class="form-group">
                        <label for="new_photo">New Photo:</label>
                        <input type="file" name="new_photo">
                    </div>
                    <div class="form-group">
                        <input type="submit" name="submit" value="Update">
                    </div>
                </form>
        <?php
            } else {
                echo "Student not found.";
            }

            $conn->close();
        } else {
            echo "Invalid request.";
        }
        ?>
    </div>
</body>
</html>
