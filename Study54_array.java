package Study0419;

import java.util.Scanner;

public class Study54_array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int kor[] = new int[3];
		int eng[] = new int[3];
		int math[] = new int[3];
		int sum[] = new int[3];
		String name[] = new String[3];
		
		System.out.print("1���л��̸�:");
		name[0] = sc.next();
		System.out.print("1���л���������:");
		kor[0] = sc.nextInt();
		System.out.print("1���л���������:");
		eng[0] = sc.nextInt();
		System.out.print("1���л���������:");
		math[0] = sc.nextInt();
		System.out.println();
		
		System.out.print("2���л��̸�:");
		name[1] = sc.next();
		System.out.print("2���л���������:");
		kor[1] = sc.nextInt();
		System.out.print("2���л���������:");
		eng[1] = sc.nextInt();
		System.out.print("2���л���������:");
		math[1] = sc.nextInt();
		System.out.println();
		
		
		System.out.print("3���л��̸�:");
		name[2] = sc.next();
		System.out.print("3���л���������:");
		kor[2] = sc.nextInt();
		System.out.print("3���л���������:");
		eng[2] = sc.nextInt();
		System.out.print("3���л���������:");
		math[2] = sc.nextInt();
		System.out.println();
		
		sum[0] = kor[0]+eng[0]+math[0];
		sum[1] = kor[1]+eng[1]+math[1];
		sum[2] = kor[2]+eng[2]+math[2];
		
		System.out.println("1���л� " + name[0] + " / ���� " +sum[0]);
		System.out.println("2���л� " + name[1] + " / ���� " +sum[1]);
		System.out.println("3���л� " + name[2] + " / ���� " +sum[2]);
	}

}
