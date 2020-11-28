


 import java.util.Scanner;
public class Exp
 {
    public static void main(String []args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a single digit  expression, like 2+3-6 ");
        String input=reader.nextLine();
        
        input = input.replace(" ","");

        String parsedInteger = "";
        String operator = "";
        int aggregate = 0;
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i); 
            if (Character.isDigit(c))
            {
                parsedInteger += c;
            }
            if (!Character.isDigit(c) || i == input.length()-1)
            {
                int parsed = Integer.parseInt(parsedInteger);
                switch(operator)
                {
                    case "":
                            aggregate= parsed;
                            break;
                     case "+":
                            aggregate += parsed;
                            break;
                      case "-":
                            aggregate-= parsed;
                            break;
                      case "*":
                             aggregate*= parsed;
                             break;

                      case "/":
                             aggregate/=parsed;
                             break;

                       default:
                         System.out.printf("Error! operator is not correct");
                          return;
                 }
                parsedInteger ="";
                operator = ""+c;
            }
        }
        System.out.println("Sum of " + input+":\r\n" + aggregate);
    }
}