package Study0419;

import java.util.Scanner;

public class Study49_sc_pr 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int time;
		String name,ill,address;
		
		System.out.print("����:");
		ill = sc.next();
		
		System.out.print("�ݸ��Ⱓ:");
		time = sc.nextInt();
		
		System.out.print("���������:");
		address = sc.next();
		
		System.out.print("�̸�:");
		name = sc.next();
		
		System.out.println(name + "���� " + ill + "�� �����Ǿ� ");
		System.out.println(address + "�� " + time + "�ϰ� �ݸ��Ǿ����ϴ�.");
		
		System.out.print("����:");
		ill = sc.next();
		
		System.out.print("�ݸ��Ⱓ:");
		time = sc.nextInt();
		
		System.out.print("���������:");
		address = sc.next();
		
		System.out.print("�̸�:");
		name = sc.next();
		
		System.out.println(name + "���� " + ill + "�� �����Ǿ� ");
		System.out.println(address + "�� " + time + "�ϰ� �ݸ��Ǿ����ϴ�.");
	}

}
