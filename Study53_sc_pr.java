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
		
		System.out.print("1번학생이름:");
		name1 = sc.next();
		System.out.print("1번학생국어점수:");
		kor1 = sc.nextInt();
		System.out.print("1번학생영어점수:");
		eng1 = sc.nextInt();
		System.out.print("1번학생수학점수:");
		math1 = sc.nextInt();
		System.out.println();
		
		System.out.print("2번학생이름:");
		name2 = sc.next();
		System.out.print("2번학생국어점수:");
		kor2 = sc.nextInt();
		System.out.print("2번학생영어점수:");
		eng2 = sc.nextInt();
		System.out.print("2번학생수학점수:");
		math2 = sc.nextInt();
		System.out.println();
		
		
		System.out.print("3번학생이름:");
		name3 = sc.next();
		System.out.print("3번학생국어점수:");
		kor3 = sc.nextInt();
		System.out.print("3번학생영어점수:");
		eng3 = sc.nextInt();
		System.out.print("3번학생수학점수:");
		math3 = sc.nextInt();
		System.out.println();
		
		int sum1 = kor1+eng1+math1;
		int sum2 = kor2+eng2+math2;
		int sum3 = kor3+eng3+math3;
		
		System.out.println("1번학생 " + name1 + " / 총점 " +sum1);
		System.out.println("2번학생 " + name2 + " / 총점 " +sum2);
		System.out.println("3번학생 " + name3 + " / 총점 " +sum3);
		
	}
	
}
