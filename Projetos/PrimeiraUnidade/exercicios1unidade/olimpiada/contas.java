package olimpiada;

import java.util.Scanner;

public class contas {
	public static void main(String[] args) {
		int v, a, f, p;
		int menor, meio, maior;

		Scanner input = new Scanner(System.in);
		
		v = input.nextInt();
		a = input.nextInt();
		f = input.nextInt();
		p = input.nextInt();

		if (a < f && a < p) {
			menor = a;
		} else if (f < a && f < p) {
			menor = f;
		} else {
			menor = p;
		}

		if (a < f && a > p) {
			meio = a;
		} else if (a < p && a > f) {
			meio = a;
		} else if (f < a && f > p) {
			meio = f;
		} else if (f < p && f > a) {
			meio = f;
		} else if (p < a && p > f) {
			meio = p;
		} else {
			meio = p;
		}

		if ((a + f + p) < v) {
			System.out.print("3");
		} else if ((menor + meio) < v) {
			System.out.print("2");
		} else if (a < v || f < v || p < v) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}

	}
}
