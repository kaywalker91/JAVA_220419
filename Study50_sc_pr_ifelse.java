package Study0419;

import java.util.Scanner;

public class Study50_sc_pr_ifelse {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,sum;
			
		System.out.print("����1:");
		num1 = sc.nextInt();
		System.out.print("����2:");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		
		if(100>sum)
		{
			System.out.println("�μ��� ���� " +sum+ "�Դϴ�.");
			System.out.println("100���� �۽��ϴ�.");
		}
		else if(100==sum)
		{
			System.out.println("�μ��� ���� " +sum+ "�Դϴ�.");
			System.out.println("100�Դϴ�!");

		}
		else
		{
			System.out.println("�μ��� ���� " +sum+ "�Դϴ�.");
			System.out.println("100���� Ů�ϴ�.");

		}
	}

}
