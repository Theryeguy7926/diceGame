import java.util.Scanner;  //Import Scanner class.

public class DoubleDice {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);  //Creates new Scanner object.
    Die diceGame = new Die();  //Creates new Die object.
    double money = 100.00;  //Creates money variable and initializes it to 100.00.
    double input;  //Creates input variable
    boolean diceEqual;  //Creates boolean variable to test if die are equal.
    boolean invalidInput = false;  //Creates boolean variable to test if input is valid.

    System.out.println("You have $" + money);
    System.out.println("How much would you like to bet (Enter 0 to quit)?");
    input = scnr.nextDouble(); //Collects input from user
    
    //Uses while loop to keep the game going until the user is out of money or inputs 0.
    do {  
      //Uses a while loop to make sure that the input is valid.
      while (!invalidInput) {  
        
        //if input is less than 0 or higher than the amount of money the user has, the program prints an error and collects another input from 
        //the user.
        if (input < 0 || input >= money) {  
          System.out.println("Invalid input. You can only bet a number higher than 0.00 and less than or equal to the amount of money you have.");
          input = scnr.nextDouble(); //Collects input from user
          continue;
        }
        
        else {
          invalidInput = true;
        }
      }

      diceGame.roll(); //Uses Die object to roll dice.
      diceGame.toString();  //Uses Die object to print dice rolls.
      diceEqual = diceGame.equals();  //Uses Die object to test if dice have equal values.

      //Uses if/else statement to output result of the dice game and update total money.
      if (diceEqual) {
        System.out.println("You win $" + input);
        money =+ input;
      }

      else {
        System.out.println("You lose $" + input);
        money =- input;
      }

      System.out.println();
      System.out.println("You have $" + money);
      System.out.println("How much would you like to bet (Enter 0 to quit)?");
    } while (input > 0.0001 || money > 0.0001);

    System.out.println();

    //Uses if/else statement to say farewell to the user. Farewell depends on whether the user is out of money or not.
    if (money < 0.0001) {
      System.out.println("You are out of money!");
      System.out.println("Better luck next time.");
    }

    else {
      System.out.println("See you around, winner!");
    }
  }
}