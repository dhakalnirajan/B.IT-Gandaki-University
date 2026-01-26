## Lesson: Introduction to Cryptography

Cryptography, at its core, is the practice and study of techniques for secure communication in the presence of adversaries. It's about transforming information into an unreadable format, ensuring only authorized parties can understand it. Think of it as secret writing!

### Cryptography Techniques

Cryptography employs various techniques to achieve security goals like confidentiality (keeping information secret), integrity (ensuring information isn't altered), and authentication (verifying the sender's identity). Some fundamental techniques include:

* **Substitution:** Replacing characters or groups of characters with others. The Caesar cipher, which your code implements, is a type of substitution cipher.
* **Transposition:** Rearranging the order of characters in a message.
* **Mathematical Operations:** Using complex mathematical functions to transform data. Modern cryptography heavily relies on these.

### Ciphers: The Algorithms of Cryptography

A cipher is an algorithm used to perform encryption or decryption. Ciphers can be broadly categorized:

* **Classical Ciphers:** These are historical ciphers, often simpler and less secure by modern standards. Examples include:
    * **Caesar Cipher:** Shifts each letter in the plaintext a fixed number of positions down the alphabet. Your code implements this!
    * **Vigenere Cipher:** A more sophisticated substitution cipher that uses a keyword.
    * **Transposition Ciphers:** Like the Rail Fence cipher, which writes plaintext diagonally and then reads it row by row.
* **Modern Ciphers:** These are computationally complex algorithms designed to withstand sophisticated attacks. They are the backbone of modern secure communication. Examples include:
    * **Symmetric-key ciphers:** Use the same key for both encryption and decryption (e.g., AES, DES).
    * **Asymmetric-key ciphers (Public-key cryptography):** Use separate keys for encryption and decryption (e.g., RSA, ECC). This allows for secure key exchange and digital signatures.

Your C code demonstrates a very basic symmetric-key cipher, the Caesar cipher, where the `key` is the secret shared between the encryptor and the decryptor.

---

## Code Documentation: Caesar Cipher Implementation in C

This document explains the functionality of the provided C code, which implements a simple Caesar cipher for encrypting and decrypting text.

**Code Overview:**

The C program allows the user to either encrypt or decrypt a string using a Caesar cipher with a fixed key of 3. It presents a menu with three options: encrypt, decrypt, and exit.

**Key Components:**

1.  **Headers:**
    ```c
    #include <stdio.h>
    #include <string.h>
    #include <stdlib.h>
    ```
    * `stdio.h`: Provides standard input/output functions like `printf` and `scanf`.
    * `string.h`: Provides string manipulation functions like `strlen` (though not directly used in this specific version, it's often useful for string handling).
    * `stdlib.h`: Provides general utility functions like `exit` for terminating the program.

2.  **Variables:**
    ```c
    int i, x;
    char str[100];
    int key = 3;
    ```
    * `i`: A loop counter variable.
    * `x`: Stores the user's menu choice.
    * `str[100]`: A character array (string) to store the message entered by the user. It has a fixed size of 100 characters.
    * `key`: An integer variable set to `3`. This is the secret key used for shifting the characters during encryption and decryption.

3.  **Menu and User Input:**
    ```c
    begin:
    printf("\nPlease choose following options:\n");
    printf("1 = Encrypt the string.\n");
    printf("2 = Decrypt the string.\n");
    printf("3 = Exit\n");
    scanf("%d", &x);
    ```
    * The `begin:` label marks the starting point of the main program loop.
    * `printf` statements display the menu options to the user.
    * `scanf("%d", &x)` reads the integer value entered by the user and stores it in the `x` variable.

4.  **`switch` Statement:**
    ```c
    switch (x) {
        case 1:
            // Encryption logic
            break;
        case 2:
            // Decryption logic
            break;
        case 3:
            exit(0);
            break;
        default:
            printf("\nError\n");
            return 0;
    }
    ```
    * The `switch` statement controls the program flow based on the user's choice (`x`).

5.  **Encryption (Case 1):**
    ```c
    case 1:
        printf("Enter a message\n");
        gets(str);
        for (i = 0; i < 100 && str[i] != '\0'; i++) {
            str[i] = str[i] + key; //the key for encryption is added to ASCII value
        }
        printf("\nEncrypted string: %s\n", str);
        goto begin;
        break;
    ```
    * Prompts the user to enter a message using `printf`.
    * `gets(str)` reads the entire line of input from the user and stores it in the `str` array. **Note:** `gets()` is considered unsafe and can lead to buffer overflows. It's generally recommended to use safer alternatives like `fgets()`.
    * The `for` loop iterates through each character of the input string until a null terminator (`\0`) is encountered or the loop reaches the maximum size of the `str` array (100).
    * Inside the loop, `str[i] = str[i] + key;` adds the value of `key` (which is 3) to the ASCII value of each character. This shifts the character three positions down the ASCII table, effectively encrypting it.
    * `printf` displays the encrypted string.
    * `goto begin;` jumps back to the beginning of the menu, allowing the user to perform another operation.

6.  **Decryption (Case 2):**
    ```c
    case 2:
        printf("Enter a message\n");
        gets(str);
        for (i = 0; i < 100 && str[i] != '\0'; i++) {
            str[i] = str[i] - key; //the key for encryption is subtracted to ASCII value
        }
        printf("\nDecrypted string: %s\n", str);
        goto begin;
        break;
    ```
    * This case is very similar to encryption, but instead of adding the `key`, it subtracts it from the ASCII value of each character, reversing the encryption process.

7.  **Exit (Case 3):**
    ```c
    case 3:
        exit(0);
        break;
    ```
    * `exit(0)` terminates the program successfully.

8.  **Default Case:**
    ```c
    default:
        printf("\nError\n");
        return 0;
    ```
    * If the user enters a choice other than 1, 2, or 3, an error message is displayed, and the `main` function returns 0, indicating an error (though the `goto begin;` in the other cases means this part might not be reached in a typical execution flow after an invalid input).

### ASCII Code: The Foundation

[ASCII Code Reference Site](https://ascii-code.com)

Before diving into cryptography, it's helpful to understand how computers represent characters. ASCII (American Standard Code for Information Interchange) is a character encoding standard for electronic communication. Each character (letters, numbers, symbols) is assigned a unique numerical value.

For example:

* 'A' is represented by the decimal value 65.
* 'a' is represented by the decimal value 97.
* '0' is represented by the decimal value 48.
* The space character ' ' is represented by the decimal value 32.

Your [C code](./Digital%20Forensics/caeser-cipher.c) leverages this by adding or subtracting a `key` value directly to the ASCII value of each character to perform encryption and decryption.


**Security Considerations:**

* **Fixed Key:** The key (`key = 3`) is hardcoded in the program. This makes the cipher very easy to break, as anyone can try all 26 possible shifts (for uppercase and lowercase letters).
* **Simple Shift:** The Caesar cipher is a very basic substitution cipher and offers minimal security.
* **`gets()` Function:** As mentioned earlier, `gets()` is unsafe and should be avoided due to the risk of buffer overflows. Use `fgets()` instead for safer input handling.
* **No Handling of Non-Alphabetic Characters:** The code simply shifts all characters, including spaces, punctuation, and numbers. A more robust implementation might handle these differently.
* **Limited String Length:** The `str` array has a fixed size of 100 characters, limiting the length of messages that can be processed.

This code serves as a good educational example of a basic encryption technique but is not suitable for any real-world security applications.
