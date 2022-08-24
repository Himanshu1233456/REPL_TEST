import java.util.*;

public class RPNCalculator implements RPN {
    private ArrayList<String> expression;

    //You must use the provided LinkedList stack in this assessment any other data structure is not valid
    LinkedListStack<Double> expressionStack;

    /**
     * Create a constructor for the class that initialises the fields
     */
    public RPNCalculator() {
        expression = new ArrayList<>();
        expressionStack = new LinkedListStack<>();
    }

    /**
     * Create a method that checks that a String is a valid double
     * @param num
     * @return either null or the actual double
     */
    public Double validDouble(String num) {
      try{
        Double.parseDouble(number);
      }catch(NumberFormatException e)
      
        Double numValue = null;
        return numValue;
    }

    /**
     * Create a method that checks if an expression is valid.
     * A valid expression only contains doubles and the validTerms listed above separated by space characters
     * @param expressionArray
     * @return
     */
    public boolean checkValidExpression(String[] expressionArray) {
        boolean expressionOK = true;
        return expressionOK;
    }

    /**
     * Create a method that prints out the text String
     * "Enter a valid expression in RPNCalculator, uses spaces to split the terms"
     * If the expression is valid (tested using checkValidExpression) then add it to the ArrayList expression
     * If the expression is not valid loop until it is
     */
    public void getExpression() {
      
        
    }

    /**
     * Write the main method to perform the calculation of the RPNCalculator expression using the LinkedListStack
     * @return the final result of the calculation
     */
    public double evaluateExpression() {
        double result = 0.0;
        return result;
    }

    /**
     * Use this method for the main menu
     * @return
     */
    public boolean calculate() {
        System.out.println("Select 1 to enter an expression or 0 to quit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            getExpression();
            System.out.println(evaluateExpression());
        } else if (choice.equals("0")) {
            return false;
        } else {
            System.out.println(choice + " is not a valid choice!");
        }
        return true;
    }

    /**
     * Main loop
     */
    public void calculateRPN() {
        boolean calculating = true;
        while (calculating) {
            calculating = calculate();
        }
    }

    public double testExpression(String expressionStr) {
        String[] expressionArray = expressionStr.split(" ");
        Collections.addAll(expression, expressionArray);
        return evaluateExpression();
    }
}
