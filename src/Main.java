public class Main {
    public static void main(String[] args) {
        int [] arrayIntegers = {22_222, 15_000, 17_000, 47_000, 37_500};

        //Task 1
        int totalSum = 0;
        for (int i : arrayIntegers) {
            totalSum += i;
        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");

        System.out.println();
        //Task 2
        int minElement = 2_000_000_000;
        int maxElement = -1;
        for (int i : arrayIntegers) {
            if (i < minElement) {
                minElement = i;
            }
            if (i > maxElement) {
                maxElement = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minElement + " рублей.\n" +
                "Максимальная сумма трат за неделю составила " + maxElement + " рублей");

        System.out.println();
        //Task 3
        double averageValue = 0;
        for (int i : arrayIntegers) {
            averageValue += i;
        }
        averageValue /= 5;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

        System.out.println();
        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}