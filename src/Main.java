public class Main {
    public static void main(String[] args) {
        // задание 1
        int dog = 7;
        byte cat = 5;
        short mouse = 3;
        double sugar = 0.7;
        float salt = 1.5f;
        boolean dogIsAdult = dog > 10;
        long elephant = 100L;

        // задание 2
        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double weightAllBoxer = boxerOne + boxerTwo;
        double weightDifference = boxerTwo - boxerOne;
        System.out.println("общий вес боксеров " + weightAllBoxer);
        System.out.println("разница в весе " + weightDifference);

        //задание 3
        int banana = 5;
        int bananaWeight = 80;

        int milk = 200/100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int total = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);

        int gramms = 1000;
        double totalKg = total / (gramms * 1.0);
        System.out.println(totalKg);

        //Задание 4

        int weight = 7;
        int gramsInKg = 1000;
        int weightInGrams = weight * gramsInKg;

        int minGramsOneDay = 250;
        int maxGramsOneDay = 500;

        int minDays = weightInGrams / maxGramsOneDay;
        int maxDays = weightInGrams / minGramsOneDay;

        double days  = (maxDays + minDays) / (2 * 1.0);
        System.out.println("минимум " + minDays);
        System.out.println("максимум " + maxDays);
        System.out.println(days);

        //задание 5

        int percent = 10;
        double multiplier = percent / (100 * 1.0);

        int mashaSelary = 67_760;
        int denisSelary = 83_690;
        int kristinaSelary = 76_230;

        int mashaNewSelary = (int) (mashaSelary + (mashaSelary * multiplier));
        int denisNewSelary = (int) (denisSelary + (denisSelary * multiplier));
        int kristinaNewSelary = (int) (kristinaSelary + (kristinaSelary * multiplier));

        int mashaDifference = (mashaNewSelary - mashaSelary) * 12;
        int denisDifference = (denisNewSelary - denisSelary) * 12;
        int kristinaDifference = (kristinaNewSelary - kristinaSelary) * 12;

        System.out.println("Маша теперь получает " +  mashaNewSelary + " рублей. Годовой доход вырос на " + mashaDifference + "рублей ");
        System.out.println("Денис теперь получает "+  denisNewSelary + " рублей. Годовой доход вырос на " + denisDifference + "рублей ");
        System.out.println("Кристина теперь получает "+  kristinaNewSelary + " рублей. Годовой доход вырос на " + kristinaDifference + "рублей ");























    }
}