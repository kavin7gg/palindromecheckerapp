

public class UseCase11PalindromeCheckerApp {

   
    public static void main(String[] args) {

        String input = "madam";

       
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

    public boolean checkPalindrome(String input) {

        if (input == null || input.length() <= 1)
            return true;

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
