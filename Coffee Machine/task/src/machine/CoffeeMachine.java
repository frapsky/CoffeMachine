package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int howManyCupsNeeded = scanner.nextInt();
        //One cup of coffee consists of 200 ml of water,
        // 50 ml of milk, and 15 g of coffee beans

        int waterPerCup = water/ 200;
        int milkPerCup = milk/ 50;
        int coffeeBeansPerCup = coffeeBeans / 15;


        //Cups able to be done counter
        int cupsCounter = 0;
        while(waterPerCup!=0 && milkPerCup!=0 && coffeeBeansPerCup!=0) {
            waterPerCup -= 1;
            milkPerCup -= 1;
            coffeeBeansPerCup-=1;
            cupsCounter++;
        }
        //System.out.println("That many cups I can make: " + cupsCounter);

        //1st condition
        if(cupsCounter == howManyCupsNeeded)
            System.out.println("Yes, I can make that amount of coffee");


        //2nd condition
        if(cupsCounter < howManyCupsNeeded)
            System.out.println("No, I can make only " + cupsCounter + " cup(s) of coffee");

        //3rd condition
        if(cupsCounter > howManyCupsNeeded)
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsCounter - howManyCupsNeeded)
                    + " more than that)");

    }
}
