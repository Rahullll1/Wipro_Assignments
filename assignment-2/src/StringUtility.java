import java.util.Scanner;

public class StringUtility {
	

	   public int Vowels(String str) {
	        int vowel = 0;
	        str = str.toLowerCase();
	        for (char ch : str.toCharArray()) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowel++;
	            }
	        }
	        return vowel;
	    }
		     
	   
	   public int Consonants(String str) {
	        int conso = 0;
	        str = str.toLowerCase();
	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
	                conso++;
	            }
	        }
	        return conso;
	    }
		     
		    public boolean isPalindrome(String str) {
		        StringBuilder sb = new StringBuilder(str);
		        return str.equals(sb.reverse().toString());
		    }
		  
		    public String reverseString(String str) {
		        return new StringBuilder(str).reverse().toString();
		    }
    
		    public String toUpperCase(String str) {
		        return str.toUpperCase();
		    }
		   
		    public String toLowerCase(String str) {
		        return str.toLowerCase();
		    }
		    
		    public String replaceWord(String str, String oldWord, String newWord) {
		        return str.replace(oldWord, newWord);
		    }

		    
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        StringUtility utility = new StringUtility();
		        char Choice;

		        do {
		            
		            System.out.println("1. Count Vowels and Consonants");
		            System.out.println("2. Check if Palindrome");
		            System.out.println("3. Reverse the String");
		            System.out.println("4. Convert to Uppercase and Lowercase");
		            System.out.println("5. Replace Word in String");
		            System.out.println("6. Exit");
		           
		            int element = s.nextInt();
		            s.nextLine(); 

		            switch (element) {	             		                    
		                    
		                case 1:
		                    System.out.print("Enter a string: ");
		                    String str1 = s.nextLine();
		                    int vowels = utility.Vowels(str1);
		                    int consonants = utility.Consonants(str1);
		                    System.out.println("Vowels: " + vowels);
		                    System.out.println("Consonants: " + consonants);
		                    break;

		                case 2:
		                    System.out.print("Enter a string: ");
		                    String inp2 = s.nextLine();
		                    if (utility.isPalindrome(inp2)) {
		                        System.out.println("Palindrome.");
		                    } else {
		                        System.out.println("Not a Palindrome.");
		                    }
		                    break;

		                case 3:
		                    System.out.print("Enter a string: ");
		                    String input3 = s.nextLine();
		                    System.out.println(utility.reverseString(input3));
		                    break;

		                case 4:
		                    System.out.print("Enter a string: ");
		                    String input4 = s.nextLine();
		                    System.out.println( utility.toUpperCase(input4));
		                    System.out.println( utility.toLowerCase(input4));
		                    break;

		                case 5:
		                    System.out.print("Enter the original string: ");
		                    String original = s.nextLine();
		                    System.out.print("Enter the word to replace: ");
		                    String oldWord = s.nextLine();
		                    System.out.print("Enter the new word: ");
		                    String newWord = s.nextLine();
		                    String result = utility.replaceWord(original, oldWord, newWord);
		                    System.out.println( result);
		                    break;

		                case 6:
		                    System.out.println("Exiting program. Thank you!");
		                    s.close();
		                    return;

		                default:
		                    System.out.println("Invalid choice. Try again.");
		            }

		            s.nextLine(); 
		            System.out.print("Back to Menu? (Y/N): ");
		            Choice = s.nextLine().charAt(0);  

		        } while (Choice == 'Y' || Choice == 'y');

		        System.out.println("END.");
		        s.close();
		
	}

}

		