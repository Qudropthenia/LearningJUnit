package test_1;

import java.util.Scanner;

/**
 * Проба самых элементарных действий
 */
public class Calculator {
	public Calculator() {
		menu();
	}

	public void menu() {
		System.out.println("1. sum;");
		System.out.println("2. subtraction;");
		System.out.print("Select: ");

		Scanner scanner = new Scanner(System.in);
		Integer operation = scanner.nextInt();
		switch (operation) {
			case 1: {
				sumSubtraction(true);
				break;
			}
			case 2: {
				sumSubtraction(false);
				break;
			}
			default: {
				menu();
			}
		}
	}

	private Integer sumSubtraction(boolean za) {
		Scanner scanner = new Scanner(System.in);
		Integer a = scanner.nextInt();
		Integer b = scanner.nextInt();

		if (za)
			return a + b;
		else
			return a - b;
	}

}
