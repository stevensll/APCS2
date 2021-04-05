import java.util.*;
import java.util.Scanner;
public class Calculator {
    /*Evaluate a postfix expression stored in s.
             *Assume valid postfix notation, of ints doubles and operators separated by spaces.
             *Valid operators are + - / * and % (remainder not modulo)
             *All results are doubles even if the operands are both int.
             *@throws IllegalArgumentException when there are too many or too few operands.
             *        Use the string parameter of your exception to indicate what happened.
             */
    public static double eval(String s) throws IllegalArgumentException{
        if(s.equals("")) throw new IllegalArgumentException("input has too few operands");
        
        Scanner iterator = new Scanner(s); 
        Deque<Double> stack = new ArrayDeque<Double>();
        while(iterator.hasNext()){
            if(iterator.hasNextDouble()){
                double val = Double.parseDouble(iterator.next());
                stack.add(val);
            }
            else{
                if(stack.size() < 1) throw new IllegalArgumentException("input has too few operands");
                double o1 = stack.removeLast();
                if(stack.size() < 1) throw new IllegalArgumentException("input has too few operands");
                double o2 = stack.removeLast();
                String operator = iterator.next();
                if(operator.equals("+")){
                    stack.add(o2 + o1);
                } else if(operator.equals("-")){
                    stack.add(o2-o1);
                } else if(operator.equals("*")){
                    stack.add(o2*o1);
                } else if(operator.equals("/")){
                    stack.add(o2/o1);
                } else if(operator.equals("%")){
                    stack.add(o2%o1);
                }
            }
        }
        iterator.close();
        // System.out.println(stack);
        // System.out.println(totalOperands);
        // System.out.println(totalOperators);
        if(stack.size() > 1) throw new IllegalArgumentException(" too many operands");
        return stack.getLast();
    }
}
