//Write a java program using Hash Map to check two strings are Anagram ornot.
import java.util.HashMap;
import java.util.Scanner;
public class CheckAnagram
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();
		// convert strings to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		// initialize hashmaps
		HashMap<Character,Integer> hmap1=new HashMap<Character,Integer>();
		HashMap<Character, Integer> hmap2 = new HashMap<Character,Integer>();
		//convert string to character array
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		//for loop for first string
		for (int i = 0; i < arr1.length; i++)
		{
			//if character not present add to hashmap
			if (hmap1.get(arr1[i]) == null)
			{
				hmap1.put(arr1[i], 1);
 			} else
 			{
 				Integer c = (int) hmap1.get(arr1[i]);
 				hmap1.put(arr1[i], ++c);
 			}
		}
 		//for loop for second string
		for (int j = 0; j < arr2.length; j++)
		{
			 if (hmap2.get(arr2[j]) == null)
				 hmap2.put(arr2[j], 1);
			 else
 			{
 				Integer d = (int) hmap2.get(arr2[j]);
 				hmap2.put(arr2[j], ++d);
 			}
 		}
			 //check if hmaps are equal
 		if (hmap1.equals(hmap2))
 			System.out.println("The two strings are anagrams");
 		else
 			System.out.println("The two strings are NOT anagrams");
 	}
}