import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	 /*
     * @purpose: Ability to check two strings are of same characters
     * @param: Two different strings of same length
     * @return: Returns true on success and false on failure
     */
    private boolean anagram(String string1, String string2) {
        if(string1.length()!=string2.length())
            return false;
        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);
        char[] array2= string2.toCharArray();
        Arrays.sort(array2);
        for (int i=0;i<array1.length;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  first String ");
        String string1 = scan.next();
        System.out.println("Enter the second String ");
        String string2 = scan.next();
        
        if(anagram.anagram(string1,string2)){
            System.out.println("Strings are anagram");
        }else {
            System.out.println("Strings are not anagram");
        }
    }

   
}