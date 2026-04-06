package model.example1_Palindromo;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println("Palindromo: " + Solution.isPalindrome(125321));
    }
}

class Solution {
    public static boolean isPalindrome(int x) {
        // Casos especiales:
        // 1. Los números negativos no son palíndromos (por el signo '-')
        // 2. Si el número termina en 0, solo es palíndromo si es 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        // Revertimos solo la mitad del número
        while (x > reversedNumber) {
            reversedNumber = (reversedNumber * 10) + (x % 10);
            x /= 10;
        }

        // Si el número es palíndromo, 'x' será igual a 'reversedNumber'
        // O, en caso de números con dígitos impares, eliminamos el dígito central
        // ejemplo: en 121, al final del bucle x = 1, reversedNumber = 12
        // x == reversedNumber / 10 elimina ese 2 central.
        return x == reversedNumber || x == reversedNumber / 10;
    }
}

class Solution2 {
    public boolean isPalindrome(int x) {
        int rev = 0, org = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int lastdigit = x % 10;
            rev = (rev * 10) + lastdigit;
            x /= 10;
        }
        return org == rev;
    }
}