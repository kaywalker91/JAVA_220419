package Study0419;

import java.util.Scanner;

public class Study52_sc_pr_while 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int cnt;
			
		System.out.print("�ݺ��� �� ���� �Է��Ͻÿ�:");
		cnt = sc.nextInt();
		
		while (i <= cnt) 
		{
			System.out.println("�ȳ��ϼ���.");
			i++;
		}

	}

}
