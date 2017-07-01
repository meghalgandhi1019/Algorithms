import java.util.Scanner;

/*
 * input : 
 * 3 (No of inputs below)
 * 1
 * 2
 * 3
 * 
 * output:
 * 1 [1]
 * 1 [1(1) + 2(0) = 1]
 * 4 [1(1) + 2(0) + 3(3) = 4]
 */
 
public class odd_even_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of inputs and actual contents");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int in_arr[] = new int[n];
		for(int i=0; i<n; i++){
			in_arr[i] = sc.nextInt();
		}
		
		odd_even_sum.calculate(in_arr);
		
		sc.close();
	}
	
	public static void calculate(int[] arr){
		int n = arr.length;
		int temp;
		int sum = 0;
		
		
		for(int i = 0; i<n; i++){
			temp = arr[i];
			while(temp > 0 )	{
				if((temp%2) == 0){
					sum = sum + 0;
					temp = temp - 1;
						
				}
			
				if((temp%2) != 0){
					sum = sum + temp;
					temp = temp - 1;
				}
			}
			System.out.println(sum);
			sum = 0;

		}
		
	}

}
