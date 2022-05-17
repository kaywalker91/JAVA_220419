package Study0419;

import java.util.Scanner;

public class Study55_for_array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int kor[] = new int[3];
		int eng[] = new int[3];
		int math[] = new int[3];
		int sum[] = new int[3];
		String name[] = new String[3];
		
		for(int i=0; i<3; i++)
		{
			System.out.print(i+1+"번학생이름:");
			name[i] = sc.next();
			System.out.print(i+1+"번학생국어점수:");
			kor[i] = sc.nextInt();
			System.out.print(i+1+"번학생영어점수:");
			eng[i] = sc.nextInt();
			System.out.print(i+1+"번학생수학점수:");
			math[i] = sc.nextInt();
			System.out.println();
		}
		
		sum[0] = kor[0]+eng[0]+math[0];
		sum[1] = kor[1]+eng[1]+math[1];
		sum[2] = kor[2]+eng[2]+math[2];
		
		for(int i=0; i<3; i++)
		{
			System.out.println(i+1+"번학생 " + name[i] + " / 총점 " +sum[i]);
		}

	}

}
