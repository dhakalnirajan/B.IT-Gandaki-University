<?php
    session_start();

    // Check if the user is authenticated
    if (!isset($_SESSION["id"])) {
        header("Location: login_form.php"); // Redirect to login page
        exit();
    }
?>
<!DOCTYPE html>
<html>
<head>
    <title>User Information Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1 {
            text-align: center;
        }

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
    </style>
    <link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
    <h1>Student Management System</h1>
    <div class="navbar">
        <a href="dashboard.php">Back to dashboard</a>
        <a href="logout.php">Logout</a>
    </div>
    <h1>User Information Form</h1>
    <form action="add_student_data.php" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
        <br>
        <label for="photo">Photo:</label>
        <input type="file" id="photo" name="photo" required>
        <br>
        <input type="submit" value="Submit">
    </form>
    <script>
        function validateForm() {
            var nameInput = document.getElementById("name");
            var ageInput = document.getElementById("age");
            var photoInput = document.getElementById("photo");

            // Validate Name: Ensure it contains only letters, spaces, and hyphens
            var nameValue = nameInput.value.trim();
            var nameRegex = /^[a-zA-Z\s\-]+$/;
            if (!nameRegex.test(nameValue)) {
                alert("Please enter a valid name (letters, spaces, and hyphens only).");
                nameInput.focus();
                return false;
            }

            // Validate Age: Ensure it is a positive number between 0 and 120
            var ageValue = ageInput.value.trim();
            var ageRegex = /^(?:\d{1,2}|120)$/;
            if (!ageRegex.test(ageValue)) {
                alert("Please enter a valid age between 0 and 120.");
                ageInput.focus();
                return false;
            }

            // Validate Photo: Ensure it is selected and has an image extension
            var photoValue = photoInput.value.trim();
            var photoRegex = /\.(jpg|jpeg|png|gif)$/i;
            if (photoValue === "" || !photoRegex.test(photoValue)) {
                alert("Please select a valid photo (JPG, JPEG, PNG, or GIF).");
                photoInput.focus();
                return false;
            }

            // All validations passed, allow the form submission
            return true;
        }
    </script>
</body>
</html>
