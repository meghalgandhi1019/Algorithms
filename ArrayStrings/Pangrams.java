
/*
 * Examples: panagrams
 * 
 *  we promptly judged antique ivory buckles for the next prize.
how razorback jumping frogs can level six piqued gymnasts.
sixty zippers were quickly picked from the woven jute bag.
crazy fredrick bought many very exquisite opal jewels.
jump by vow of quick, lazy strength in oxford.
the quick brown fox jumps over a lazy dog.
pack my box with five dozen liquor jugs.
how quickly daft jumping zebras vex.
sphinx of black quartz judge my vow.
quick zephyrs blow, vexing daft jim.
waltz, nymph, for quick jigs vex bud.
 * */

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Pangrams {
	
	private  Set<Character> remainingLetters = new HashSet<>();
	
	public Pangrams(){
		setLetters();
	}

	 public static void main(String[] args) throws IOException{
	 
		 String[] inputArray  = {"we promptly judged antique ivory buckles for the next prize"
				 }; 
		 Pangrams p1 = new Pangrams();
		 
		 p1.isPangram(inputArray);
		 
		 }
	
	 
	 
	 public void setLetters(){
		 for(char ch = 'a'; ch <= 'z'; ch++){
				remainingLetters.add(ch);
			}
		
	 }
	 
	 
	
    public void isPangram(String[] strings) {

    	String res = null;
    	
	for(int i = 0; i<strings.length; i++){
		
		for(int j=0; j<strings[i].length(); j++){
		remainingLetters.remove(strings[i].charAt(j));
		}
		
		if(remainingLetters.isEmpty()){
			
			res = "Panagrams";
			System.out.println(res);
		}else{
			res = "Not Panagrams";
			System.out.println(remainingLetters.size() + " letters remaining so -  "+ res);
		}
		setLetters();	
	}
   
}
}

