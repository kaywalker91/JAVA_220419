package Study0419;

import java.util.Scanner;

public class Study51_sc_pr_for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int count;
			
		System.out.print("반복할 줄 수를 입력하시오:");
		count = sc.nextInt();
		
		for(int i=1; i<=count; i++)
		{
			System.out.println("안녕하세요.");
		}
		
	}

}
