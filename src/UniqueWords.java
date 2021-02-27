/* Project:  Lab2 
 * Class: CUS1156 Software Design Methods.java
 * *Author: Oluwatosin Alao
 * * Date:February 28, 2021
 * This program counts the number of distinct elements in an ArrayList 
 * */ 

import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++) {
    	  boolean unique = true;
    	  for (int j = 0; j < list.size(); j++) {
    		  if (list.get(i) == list.get(j)) {
    			  unique = true;
    			  if(i!=j) {
    				  unique = false;
    			  }
    		  }
		 }
    	  if (unique)
    		  count++;
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
