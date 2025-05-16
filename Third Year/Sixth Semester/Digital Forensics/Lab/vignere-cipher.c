#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    int a;
    char msg[16], key[16]; // Increased size by 1 to accommodate null terminator

    printf("\n Enter the message with less than length 16: \t");
    fgets(msg, sizeof(msg), stdin); // Use fgets for safer input
    msg[strcspn(msg, "\n")] = 0;   // Remove trailing newline from fgets

    printf("\n Enter the Key: \t");
    fgets(key, sizeof(key), stdin); // Use fgets for safer input
    key[strcspn(key, "\n")] = 0;   // Remove trailing newline from fgets

    int msgLen = strlen(msg), keyLen = strlen(key), i, j;

    for (a = 0; msg[a] != '\0'; a++) {
        msg[a] = toupper(msg[a]);
    }

    char newKey[msgLen + 1], encryptedMsg[msgLen + 1], decryptedMsg[msgLen + 1]; // Increased size by 1 for null terminator

    // generating new key
    for (i = 0, j = 0; i < msgLen; ++i, ++j) {
        if (j == keyLen) {
            j = 0;
        }
        newKey[i] = key[j];
    }
    newKey[i] = '\0';

    // code for encryption
    for (i = 0; i < msgLen; ++i) {
        encryptedMsg[i] = ((msg[i] - 'A' + newKey[i] - 'A') % 26) + 'A';
    }
    encryptedMsg[i] = '\0';

    // code for decryption
    for (i = 0; i < msgLen; ++i) {
        decryptedMsg[i] = (((encryptedMsg[i] - 'A' - (newKey[i] - 'A')) + 26) % 26) + 'A';
    }
    decryptedMsg[i] = '\0';

    // code for displaying message information
    printf("Original Message: %s\n", msg);
    printf("Key: %s\n", key);
    printf("New Generated Key: %s\n", newKey);
    printf("Encrypted Message: %s\n", encryptedMsg);
    printf("Decrypted Message: %s\n", decryptedMsg);

    return 0;
}
