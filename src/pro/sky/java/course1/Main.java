package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        // Домашнее задание 1.4.
        // Задание 1.
        int i = 1;
        while (i < 11) {
            System.out.print(i);
            i++;
            System.out.print(" ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j);
            System.out.print(" ");
        }

        // Задание 2.
        System.out.println(" ");
        int dataOfFriday = 7; //условно первая пятница месяца
        int numberOfWeek = 1;//Порядковый номер недели в месяце

        while (numberOfWeek < 5) {
            System.out.println("Сегодня пятница, " + dataOfFriday + "-е число. Необходимо подготовить отчет.");
            dataOfFriday += 7;
            numberOfWeek++;
        }

        // Задание 3.
        System.out.println(" ");
        int curentYear = 2022;
        int lastYear = curentYear - 200;
        int futureYear = curentYear + 100;
        int j = lastYear;

        while (j < futureYear) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
            j++;
        }
    }
}

