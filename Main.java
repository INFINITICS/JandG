import java.util.Scanner;

public class Main {
        public static void main(String[] args)
        {
                DemoClass Obj = new DemoClass();

               /** Ask the user what domain shall be created **/
                Scanner user = new Scanner(System.in);
                System.out.println("User what domain shall we create?");
                System.out.println("There are two domains, (1)Delta or (2)Beta");
                System.out.println("Please enter either: 1 or 2 ONLY");
                String choice = user.next();

                if(choice.equals("1"))
                {
                      /** Will create domain Delta (Square) **/
                        Obj.Delta();
                        System.out.println("Delta has been initiated");
                }

                else if(choice.equals("2"))
                {
                     /**  Will create domain Beta (Triangle) **/
                        Obj.Beta();
                        System.out.println("Beta has been initiated");
                }
        }
}
