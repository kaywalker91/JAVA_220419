package Study0419;

import java.util.Scanner;

public class Study53_sc_pr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int kor1,eng1,math1;
		int kor2,eng2,math2;
		int kor3,eng3,math3;
		String name1,name2,name3;
		
		System.out.print("1���л��̸�:");
		name1 = sc.next();
		System.out.print("1���л���������:");
		kor1 = sc.nextInt();
		System.out.print("1���л���������:");
		eng1 = sc.nextInt();
		System.out.print("1���л���������:");
		math1 = sc.nextInt();
		System.out.println();
		
		System.out.print("2���л��̸�:");
		name2 = sc.next();
		System.out.print("2���л���������:");
		kor2 = sc.nextInt();
		System.out.print("2���л���������:");
		eng2 = sc.nextInt();
		System.out.print("2���л���������:");
		math2 = sc.nextInt();
		System.out.println();
		
		
		System.out.print("3���л��̸�:");
		name3 = sc.next();
		System.out.print("3���л���������:");
		kor3 = sc.nextInt();
		System.out.print("3���л���������:");
		eng3 = sc.nextInt();
		System.out.print("3���л���������:");
		math3 = sc.nextInt();
		System.out.println();
		
		int sum1 = kor1+eng1+math1;
		int sum2 = kor2+eng2+math2;
		int sum3 = kor3+eng3+math3;
		
		System.out.println("1���л� " + name1 + " / ���� " +sum1);
		System.out.println("2���л� " + name2 + " / ���� " +sum2);
		System.out.println("3���л� " + name3 + " / ���� " +sum3);
		
	}
	
}
