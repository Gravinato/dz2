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





    }
}
