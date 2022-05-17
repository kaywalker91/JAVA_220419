package Study0419;

import java.util.Scanner;

public class Study50_sc_pr_ifelse {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,sum;
			
		System.out.print("숫자1:");
		num1 = sc.nextInt();
		System.out.print("숫자2:");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		
		if(100>sum)
		{
			System.out.println("두수의 합은 " +sum+ "입니다.");
			System.out.println("100보다 작습니다.");
		}
		else if(100==sum)
		{
			System.out.println("두수의 합은 " +sum+ "입니다.");
			System.out.println("100입니다!");

		}
		else
		{
			System.out.println("두수의 합은 " +sum+ "입니다.");
			System.out.println("100보다 큽니다.");

		}
	}

}
