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
        if(s.equals("")) throw new IllegalArgumentException("empty input");
        
        int totalOperators = 0;
        int totalOperands = 0;
        Scanner counter = new Scanner(s);
        while(counter.hasNext()){
            if(counter.hasNextInt() || counter.hasNextDouble()) totalOperands++;
            else totalOperators++;
            counter.next();
        }
        counter.close();
        if(totalOperands < totalOperators) throw new IllegalArgumentException("input has too few operands");
        if(totalOperators < 1) throw new IllegalArgumentException("input has zero operators");
        
        Scanner iterator = new Scanner(s); 
        Deque<Double> stack = new ArrayDeque<Double>();
        while(iterator.hasNext()){
            if(iterator.hasNextDouble()){
                double val = Double.parseDouble(iterator.next());
                stack.add(val);
            }
            else{
                double o1 = stack.removeLast();
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
        return stack.getLast();
    }
}
