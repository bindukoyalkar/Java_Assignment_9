import java.util.Scanner;
import java.util.regex.*;
// This program checks if given sentence starts with Capital Letter and ends with a full stop or period(.)
public class Regex
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean checkLine= Pattern.matches("^[A-Z].*[.]$", s);
        //boolean checkLine= Pattern.matches("[.]$", s);
        if(checkLine)
            System.out.println("Given sentence starts with Capital Letter and ends with a full stop");
        else
            System.out.println("Given sentence does not start with Capital Letter and end with a full stop");
    }
}
