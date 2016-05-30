package task0001;

import java.util.Scanner;

public class Task0001 {
	
	private static int a[];
	private static int N = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		a = new int[N];
		
		//����
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		//�ő�l�I��@
		for (int i = 0; i < N; i++) {
			int max = i;
			for (int j = i+1; j < N; j++) {
				if(a[j] > a[max]) {
					max = j;
				}
			}
			int t = a[i];
			a[i] = a[max];
			a[max] = t;
		}
		
		//�o��
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
	}
}
