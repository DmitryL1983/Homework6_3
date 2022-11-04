public class Main {
    //Задание 1
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        // Задание 2
        for (int r = 10; r >= 1; r--)
            System.out.println(r);

    // Задание 3
        for (int t = 0; t < 17; t = t + 2)
            System.out.println(t);

        // Задание 4
        for (int y = 10; y >= -10; y--)
            System.out.println(y);

        // Задание 2-1
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {
                System.out.println(year + "Год является високосным");
            }
        }
        // Задание 2-2
        for (int u = 7; u<=98; u = u + 7) {
            System.out.println(u);
        }
        // Задание 2-3
        System.out.println(1);
        for (int i = 2; i<=512; i = i * 2) {
            System.out.println(i);
        }
        // Задание 3-1
        //int salary = 29000;
        //int total = 0;
        //for (int m = 1; m <= 12; m++) {
        //    total = total + salary;
        //    System.out.println("Месяц " + m + " Сумма накоплений равна " + total);

        //}
        // Задание 3-2
        int salary = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + m + " Сумма накоплений равна " + total);

        }



    }

}