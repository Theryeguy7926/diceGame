import java.util.Random;  //Import Random class.

public class Die {  //Defines private class Dice.
  Random randGen = null; //Creates Random object.
  private int die1;  //Creates first die variable.
  private int die2;  //Creates second die variable.
  public boolean equalDie;  //Creates boolean variable for equals() method.
  public String stringDie1;
  public String stringDie2;
  
  //Constructor initializes die to zero and instantiates Random object.
  public Die() {
    die1 = 0;  //Create first die variable and initializes to 0.
    die2 = 0;  //Creates second die variable and initializes to 0.

    randGen = new Random();
  }

  //Creates method to use Random object to simulate a dice roll between 1 and 6. Assigns random object to each die.
  public void roll() {
    die1 = randGen.nextInt();
    die2 = randGen.nextInt();
  }

  //Creates method to test if die1 and die2 are equal. Returns boolean as true if both dies have equal values.
  public boolean equals() {
    
    if (die1 == die2) {
      equalDie = true;
    }
      
    else {
      equalDie = false;
    }
    
    return equalDie;
  }

  //Creates method to print die values for users viewing pleasure.
  @Override
  public String toString() {
    switch (die1) {  //Uses switch statement to convert die1 value into a String value that can be printed.
      case 1:
        stringDie1 = "one";
        break;

      case 2:
        stringDie1 = "two";
        break;

      case 3:
        stringDie1 = "three";
        break;

      case 4:
        stringDie1 = "four";
        break;

      case 5:
        stringDie1 = "five";
        break;

      case 6:
        stringDie1 = "six";
        break;

      default:
        stringDie1 = "Error. Fix your code.";
        break;
    }

    switch (die2) {  //Uses switch statement to convert die2 value into a String value that can be printed.
      case 1:
        stringDie2 = "one";
        break;

      case 2:
        stringDie2 = "two";
        break;

      case 3:
        stringDie2 = "three";
        break;

      case 4:
        stringDie2 = "four";
        break;

      case 5:
        stringDie2 = "five";
        break;

      case 6:
        stringDie2 = "six";
        break;

      default:
        stringDie2 = "Error. Fix your code.";
        break;
    }

    //Prints die values for user to see
    return "You rolled a " + stringDie1 + " and " + stringDie2;
  }
}