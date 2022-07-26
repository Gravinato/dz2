public class Main {
    public static void main(String[] args){
        // Задание 1

        int apple = 5;
        byte banana = 3;
        short lemon = 11;
        long orange = 157L;
        double menWeight = 47.5;
        float womanWeight = 107.3f;
        boolean menHeavy = menWeight > 30;
        char bar = 11;

        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий веc боксёров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксёров " + weightDifference);

        // Задание 3
        short bananas =  5;
        short bananasGram = 80;
        short milk = 200;
        short milkGram = 105;
        short icecream = 2;
        short icecreamGram = 100;
        short eggs = 4;
        short eggsGram = 70;
        double weightBreackfast = ((bananas * bananasGram) + ((milk / 100) * milkGram) + (icecream * icecreamGram) + (eggs * eggsGram));
        System.out.println("Общий вес завтрака в граммах " + weightBreackfast);
        double weightBreakfastKg = weightBreackfast / 1000;
        System.out.println("Вес завтрака в килограмах " + weightBreakfastKg);

        // Задание 4
        short planDiet = 7;
        short lossPerDay = 250;
        double lossPerDayKg = lossPerDay * 0.001;
        double weightNorm = (planDiet / lossPerDayKg);
        System.out.println("Первый вариант диеты продлится " + weightNorm + " дней");
        short lossPerDay2 = 500;
        double lossPerDayKg2 = lossPerDay2 * 0.001;
        double weightNorm2 = (planDiet / lossPerDayKg2);
        System.out.println("Второй вариант диеты продлится " + weightNorm2 + " дней");
        double middlePlan = (weightNorm + weightNorm2) * 0.5;
        System.out.println("Среднее время диеты составит " + middlePlan + " день");

        // Задание 5
        int Masha = 67760;
        double newZpMasha = Masha * 1.1;
        int oldZpYear = Masha * 12;
        double newZpYear = newZpMasha * 12;
        double boostDifference = newZpYear - oldZpYear;
        System.out.println("Маша теперь получает " + newZpMasha + " в месяц." + "Годовой доход вырос на " + boostDifference + " рублей в год.");
        int Denis = 83690;
        double newZpDenis = 1.2 * Denis;
        int oldZpYear2 = Denis * 12;
        double newZpYear2 = newZpDenis * 12;
        double boostDifference2 = newZpYear2 - oldZpYear2;
        System.out.println("Денис теперь получает " + newZpDenis + " в месяц." + "Годовой доход вырос на " + boostDifference2 + " рублей в год.");
        int Kristina = 76230;
        double newZpKristina = Kristina * 1.1;
        int oldZpYear3 = Kristina * 12;
        double newZpYear3 = newZpKristina * 12;
        double boostDifference3 = newZpYear3 - oldZpYear3;
        System.out.println("Кристина теперь получает " + newZpKristina + " в месяц." + "Годовой доход вырос на " + boostDifference3 + " рублей в год.");
        }
}