import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
	
	static ArrayList<String> findAllConcatenatedWords(ArrayList<String> words)
    {
		
		ArrayList<String> output = new ArrayList<String>();
		output.add("hey");
		return output;
        
    }

	public static void main(String[] args) {
		
		int[][] multiarray=new int[3][3];
		multiarray[0][0]= 1;
		
		ArrayList<String> input = new ArrayList<String>();
		input.add("rat");
		input.add("cat");
		input.add("cats");
		input.add("dog");
		input.add("catsdog");
		input.add("dogcat");
		input.add("dogcatrat");
		
		Iterator<String> it= input.iterator();
		
		it.hasNext();
		
	   System.out.println(findAllConcatenatedWords(input));


	}

}
