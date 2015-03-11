import java.util.*;

class UI {
   private Logic logic;

   public static void main(String[] args) {
      Logic logic = new Logic();
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String out = logic.execute(sc.nextLine());

      System.out.println(out);
   }
}
