package hackerrank;

public class CountPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "wowpurerocks";
		String input2 = "hellolle";
		System.out.println(countPal(input2));
	}

	static int isPalindrome(String S, int start, int end){
		for(;start<end;start++,end--){
			if(S.charAt(start)!=S.charAt(end)){
				return 0;
			}
		}
		return 1;
		
	}
	static int countPal(String S){
		
		int len = S.length();
		int count = len,i,j,k;
		
		for( i=0;i<len;i++){
			for(j=i+1; j <len;j++ ){
				if(S.charAt(i) == S.charAt(j)){
				if(isPalindrome(S,i,j) == 1){
					count++;
					 for(k=i;k<=j;k++){
	                        System.out.print(S.charAt(k));
					
					 }
					 System.out.println();
					}
				}
			}
			
		}
			return count;
	}
}
