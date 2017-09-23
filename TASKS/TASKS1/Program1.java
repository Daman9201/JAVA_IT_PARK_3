import java.util.Scanner;
class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        if (money < 0 )
                {
                    System.out.println("Введено отрицательное значение");
                } else {

            int x5000 = money / 5000;
            int diff = money % 5000;

            int x1000 = diff / 1000;
            diff = diff % 1000;

            int x500 = diff / 500;
            diff = diff % 500;

            int x100 = diff / 100;
            diff = diff % 100;

            int x50 = diff / 50;
            diff = diff % 50;

            int x10 = diff / 10;
            diff = diff % 10;

            int x5 = diff / 5;
            diff = diff % 5;

            int x2 = diff / 2;
            diff = diff % 2;


            int x1 = diff / 1;
            diff = diff % 1;


            System.out.println("Запросил  - " + money + "\n"
                    + " 5000 - " + "\t" + x5000 + "\n"
                    + " 1000 - " + "\t" + x1000 + "\n"
                    + " 500 - " + "\t" + "\t" + x500 + "\n"
                    + " 100 - " + "\t" + "\t" + x100 + "\n"
                    + " 50 - " + "\t" + "\t" + x50 + "\n"
                    + " 10 -" + "\t" + "\t" + x10 + "\n"
                    + " 5 - " + "\t" + "\t" + x5 + "\n"
                    + " 2 - " + "\t" + "\t" + x2 + "\n"
                    + " 1 - " + "\t" + "\t" + x1 + "\n");

            int Sum = x5000*5000 + x1000*1000 + x500*500 + x100*100 + x50*50 +x10*10 + x5*5 + x2*2 + x1*1;
                System.out.println("выдано " + Sum);
        }
    }
}