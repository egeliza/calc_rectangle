import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcRectArea {
    public static void main(String[] arg){

        int width = 0;
        int length = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the lenght of rectangle: ");
            length = Integer.parseInt(br.readLine());

            System.out.println("Enter the width of rectanlge: ");
            width = Integer.parseInt(br.readLine());
        }
        catch (NumberFormatException ne) {
            System.out.println("Invalid value " + ne);
            System.exit(0);
        }
        catch (IOException ioe) {
            System.out.println("IO error " + ioe);
            System.exit(0);
        }

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("The area of rectangle is: " + area + " and the perimeter is: " + perimeter);
    }
}
