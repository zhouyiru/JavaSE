package com.code.test;
import java.util.*;
public class caishuyouxi {

	private static Scanner a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int guess = -1;
			int count = 0;
			int num = (int) (int)(Math.random()*100)+1;
	        a = new Scanner(System.in);
			do {
				System.out.println("������1-100֮�������");
				guess = a.nextInt();
				if (guess > num) {

					System.out.println("���ǣ�̫����");
				} else if (guess < num) {

					System.out.println("���ǣ�̫С��");
				} else {

					System.out.println("��ϲ������");
				}
				count++;
			} while (num != guess);
			System.out.println("��²��������:" + num + "�²���" + count + "��");
		}
	}

