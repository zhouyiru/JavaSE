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
				System.out.println("请输入1-100之间的数字");
				guess = a.nextInt();
				if (guess > num) {

					System.out.println("哥们，太大了");
				} else if (guess < num) {

					System.out.println("哥们，太小了");
				} else {

					System.out.println("恭喜，中啦");
				}
				count++;
			} while (num != guess);
			System.out.println("你猜测的数字是:" + num + "猜测了" + count + "次");
		}
	}

