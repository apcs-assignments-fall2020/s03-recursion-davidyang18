public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        int sum = 0;
        if (x == 0) {
            return sum;
        }
        else {
            // isolate the last digit with %
            // then throw it away and go through the recursion
            // until run out of number
            sum += (x % 10) + (addDigits(x / 10));
            return sum;
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        // if the string is less or equal to one, it's automatically a palindrome
        if (str.length() <= 1) {
            return true;
        }
        // proceed if most left equals to most right
        // go from sides to middle to test each letter
        else if (str.charAt(0) == (str.charAt(str.length() - 1))) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        else {
            return false;
        }
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if (str.length() <= 1) {
            return str;
        }
        else {
            // create a new string starting from index 1 
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
