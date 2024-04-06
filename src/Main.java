public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int[] expenses = {205, 300, 4893, 32, 754};
        double sum = 0;
        for (int index = 0; index < expenses.length; index++) {
            sum = sum + expenses[index];
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");
        // Exercise 2
        int[] weeklyExpenses = {500, 583, 974, 28838, 888};
        var maxSpent = -1;
        for (int i = 0; i < weeklyExpenses.length; i++) {
            if (weeklyExpenses[i] > maxSpent) {
                maxSpent = weeklyExpenses[i];
            }
        }
        var minSpent = Integer.MAX_VALUE;
        for (final int current : weeklyExpenses) {
            if (current < minSpent) {
                minSpent = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpent + " рублей. Максимальная сумма трат за неделю составила " + maxSpent + " рублей.");
        // Exercise 3
        double[] newArrayYetAgain = {4389, 38, 8389, 23, 4932};
        double anotherSum = 0;
        double medianValue = 0;
        for (final double current : newArrayYetAgain) {
            anotherSum = anotherSum + current;
        }
        medianValue = anotherSum / newArrayYetAgain.length;
        System.out.println("Средняя сумма затрат за месяц составила " + medianValue + " рублей.");
        // Exercise 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}