import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		System.out.println("Введите первое значение X");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
				System.out.println("Введите первое значение Y");
		int y = scanner.nextInt();
		int sumResult = x + y;



		System.out.println(sumResult);
	}
}
