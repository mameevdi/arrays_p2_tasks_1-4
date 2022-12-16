import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        //int[] arr = {2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,22,21,20,19,18,17}; //для проверки
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1"); //посчитать сумму всех выплат за месяц
        int[] payments = generateRandomArray();
        int amountPayments = 0;
        for (int i = 0; i < payments.length; i++) {
            amountPayments += payments[i];
        }
        System.out.println("Сумма всех выплат за " + payments.length + " дней равна " + amountPayments + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2"); //найти минимальную и максимальную трату за день.
        int[] payments = generateRandomArray();
        int maxPayment = payments[0];
        int minPayment = payments[0];
        for (int i = 1; i < payments.length; i++) {
            if (payments[i] > maxPayment) {
                maxPayment = payments[i];
            }
            if (payments[i] < minPayment) {
                minPayment = payments[i];
            }
        }
        System.out.println("Максимальная трата за месяц составляет " + maxPayment + " рублей");
        System.out.println("Минимальная трата за месяц составляет " + minPayment + " рублей");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3"); //какую в среднем сумму компания тратила в течение 30 дней
        int[] payments = generateRandomArray();
        double amountPayments = 0;
        for (int i = 0; i < payments.length; i++) {
            amountPayments += payments[i];
        }
        double averagePayout = amountPayments / 30;
        String result = String.format("%.2f",averagePayout); //наков после запятой. Источник знаний https://javarush.com/groups/posts/2773-okruglenie-chisel-v-java
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4"); //исправить баг
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

            for (int i = reverseFullName.length-1; i >= 0 ; i--) {
                System.out.print(reverseFullName[i]);
            }
            /*
            Над этим заданием я просидел 4 часа, потому что не прочитал внимательно условие и понял задачу по-своему:D
            Я думал только символ "I" надо поставить в начале слова, для решения такой задачи с нашим багажом знаний понадобится
            несколько вложенных условий и циклов. Только когда мне это удалось я увидел, что "Inav Ivonav" и "Ivanov Ivan" не одно и тоже...
            и тут до меня дошло :D Ну, зато, получилась хорошая тренировка!
            */
    }
}
