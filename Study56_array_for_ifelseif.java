package Study0419;

import java.util.Scanner;

public class Study56_array_for_ifelseif 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int kor[] = new int[3];
		int eng[] = new int[3];
		int math[] = new int[3];
		int sum[] = new int[3];
		int avg[] = new int[3];
		
		for(int i=0; i<3; i++)
		{
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
		
		avg[0] = (kor[0]+eng[0]+math[0])/3;
		avg[1] = (kor[1]+eng[1]+math[1])/3;
		avg[2] = (kor[2]+eng[2]+math[2])/3;
		
		for(int i=0; i<3; i++)
		{
		
			if(avg[i]>=90 && avg[i]<=100)
			{
				System.out.println(i+1+"번학생" + " / 학점 " + "A");
			}
			else if(avg[i]>=80 && avg[i]<90)
			{
				System.out.println(i+1+"번학생" + " / 학점 " + "B");
			}
			else if(avg[i]>=70 && avg[i]<80)
			{
				System.out.println(i+1+"번학생" + " / 학점 " + "C");
			}
			else
			{
				System.out.println(i+1+"번학생" + " / 학점 " + "F");
			}
		}
	}

}
