// Newton-Raphson Method

#include <stdio.h>
#include <math.h>
#include <stdlib.h> // for exit() if necessary

#define f(x) (sin(x) + cos(x)) // Corrected with closing parenthesis
#define g(x) (cos(x) - sin(x))
#define e 0.0001

int main() {
    float x0, x1, f0, g0, E;
    
    printf("Initial Guess\t\tRoot\n");
    printf("----------------------------\n");

    // Loop from 1 to 10 for initial guesses
    for (int i = 1; i <= 10; i++) {
        x0 = (float)i; // Set initial guess from 1 to 10
        f0 = f(x0);
        g0 = g(x0);
        
        // Check if the derivative at the initial guess is zero
        if (fabs(g0) < e) {
            printf("Initial guess: %f - No convergence (derivative is zero)\n", x0);
            continue; // Skip this iteration
        }

        // Newton-Raphson iteration
        do {
            f0 = f(x0);
            g0 = g(x0);
            // Calculate the new estimate
            x1 = x0 - (f0 / g0);
            E = fabs((x1 - x0) / x1);
            x0 = x1;
        } while (E > e);
        
        // Print the found root for the current initial guess
        printf("%-12d\t\t%.6f\n", i, x1);
    }
    
    return 0;
}
