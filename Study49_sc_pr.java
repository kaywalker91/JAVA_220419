package Study0419;

import java.util.Scanner;

public class Study49_sc_pr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int time;
		String name,ill,address;
		
		System.out.print("병명:");
		ill = sc.next();
		
		System.out.print("격리기간:");
		time = sc.nextInt();
		
		System.out.print("현재거주지:");
		address = sc.next();
		
		System.out.print("이름:");
		name = sc.next();
		
		System.out.println(name + "님은 " + ill + "에 감염되어 ");
		System.out.println(address + "에 " + time + "일간 격리되었습니다.");
		
		System.out.print("병명:");
		ill = sc.next();
		
		System.out.print("격리기간:");
		time = sc.nextInt();
		
		System.out.print("현재거주지:");
		address = sc.next();
		
		System.out.print("이름:");
		name = sc.next();
		
		System.out.println(name + "님은 " + ill + "에 감염되어 ");
		System.out.println(address + "에 " + time + "일간 격리되었습니다.");
	}

}
