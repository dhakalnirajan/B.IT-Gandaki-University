<?php
// Define the regular expressions for form validation
$nameRegex = '/^[A-Za-z\s]+$/'; // Only alphabetic characters and spaces are allowed
$emailRegex = '/^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/'; // Valid email format
$passwordRegex = '/^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/'; // At least 8 characters with at least one letter and one number
$phoneRegex = '/^\d{10}$/'; // 10 digits phone number format

// Retrieve form data
$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];
$repassword = $_POST['repassword'];
$phone = $_POST['phone'];

// Validate form inputs
$errors = array();

if (!preg_match($nameRegex, $name)) {
    $errors[] = 'Invalid name format. Only alphabetic characters and spaces are allowed.';
}

if (!preg_match($emailRegex, $email)) {
    $errors[] = 'Invalid email format.';
}

if (!preg_match($passwordRegex, $password)) {
    $errors[] = 'Invalid password format. It should contain at least 8 characters with at least one letter and one number.';
}


if ($password !== $repassword) {
    $errors[] = 'Passwords do not match.';
}

if (!preg_match($phoneRegex, $phone)) {
    $errors[] = 'Invalid phone number format. It should be a 10-digit number.';
}

// Display validation errors or process form submission
if (count($errors) > 0) {
    // Display validation errors
    foreach ($errors as $error) {
        echo $error . '<br>';
    }
} else {
    // Process form submission
    // ...
    echo 'Form submitted successfully!';
}
?>
