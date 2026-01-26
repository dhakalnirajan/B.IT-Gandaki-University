#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#define MAX_LENGTH 16
int i;

// Function to convert a string to uppercase
void toUpperCase(char *str) {
    for (i = 0; str[i]; i++) {
        str[i] = toupper(str[i]);
    }
}

// Function to generate the key of the same length as the message
void generateKey(char *message, char *key, char *generatedKey) {
    int messageLen = strlen(message);
    int keyLen = strlen(key);

    /*
     * This loop iterates through each character of the message.
     * For each character, it takes a corresponding character from the key.
     * The key is repeated using the modulo operator (%) if it's shorter than the message,
     * ensuring a key character for every message character.
     */
    for (i = 0; i < messageLen; i++) {
        generatedKey[i] = key[i % keyLen];
    }
    generatedKey[messageLen] = '\0'; // Null-terminate the generated key.
}

// Function to encrypt the message using Vigenere Cipher
void encrypt(char *message, char *key, char *encryptedMessage) {
    int messageLen = strlen(message);
    
    for (i = 0; i < messageLen; i++) {
        if (isalpha(message[i])) {
            char base = 'A';
            /*
             * The Vigenere encryption for an uppercase letter involves:
             * 1. Converting the message letter to a 0-25 range (A=0, B=1, ..., Z=25) by subtracting 'A'.
             * 2. Converting the corresponding key letter to a 0-25 range similarly.
             * 3. Adding these two values.
             * 4. Taking the modulo 26 of the sum to wrap around the alphabet if necessary.
             * 5. Adding 'A' back to convert the 0-25 result to an uppercase character.
             */
            encryptedMessage[i] = (message[i] - base + key[i] - base) % 26 + base;
        } else {
            encryptedMessage[i] = message[i]; // Non-alphabetic characters remain unchanged.
        }
    }
    encryptedMessage[messageLen] = '\0'; // Null-terminate the encrypted message.
}

// Function to decrypt the message using Vigenere Cipher
void decrypt(char *encryptedMessage, char *key, char *decryptedMessage) {
    int encryptedLen = strlen(encryptedMessage);

    for (i = 0; i < encryptedLen; i++) {
        if (isalpha(encryptedMessage[i])) {
            char base = 'A';
            /*
             * The Vigenere decryption for an uppercase letter involves:
             * 1. Converting the ciphertext letter to a 0-25 range by subtracting 'A'.
             * 2. Converting the corresponding key letter to a 0-25 range.
             * 3. Subtracting the key value from the ciphertext value.
             * 4. Adding 26 before taking the modulo 26 to ensure a positive result in case of subtraction leading to a negative value.
             * 5. Taking the modulo 26 of the result.
             * 6. Adding 'A' back to convert the 0-25 result to an uppercase character.
             */
            decryptedMessage[i] = (encryptedMessage[i] - base - (key[i] - base) + 26) % 26 + base;
        } else {
            decryptedMessage[i] = encryptedMessage[i]; // Non-alphabetic characters remain unchanged.
        }
    }
    decryptedMessage[encryptedLen] = '\0'; // Null-terminate the decrypted message.
}

int main() {
    char message[MAX_LENGTH];
    char key[MAX_LENGTH];
    char generatedKey[MAX_LENGTH];
    char encryptedMessage[MAX_LENGTH];
    char decryptedMessage[MAX_LENGTH];

    printf("Enter the message (less than 16 characters): ");
    fgets(message, sizeof(message), stdin);
    message[strcspn(message, "\n")] = 0; // Remove trailing newline from input.
    toUpperCase(message);                // Convert the input message to uppercase.

    if (strlen(message) >= MAX_LENGTH) {
        printf("Message length exceeds the limit.\n");
        return 1; // Indicate an error if the message is too long.
    }

    printf("Enter the key: ");
    fgets(key, sizeof(key), stdin);
    key[strcspn(key, "\n")] = 0;     // Remove trailing newline from key input.
    toUpperCase(key);                 // Convert the input key to uppercase.

    generateKey(message, key, generatedKey);
    encrypt(message, generatedKey, encryptedMessage);
    decrypt(encryptedMessage, generatedKey, decryptedMessage);

    printf("\nOriginal Message: %s\n", message);
    printf("Key: %s\n", key);
    printf("Generated Key: %s\n", generatedKey);
    printf("Encrypted Message: %s\n", encryptedMessage);
    printf("Decrypted Message: %s\n", decryptedMessage);

    return 0;
}
