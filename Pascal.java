import java.util.ArrayList;
import java.util.Iterator;

public class Pascal {

    /**
     * Creates a pascal triangle using ArrayList , String Builder and Iterator
     *
     * @param row is the number of rows of pascal triangle to be printed
     * @code 3 for loops are used to create the pascal triangle
     * @<code> first_num = first_num * (i - k) / (k + 1) </code> ; This is the formula used to calculated the pascal number
     * @code pascalTriangle is the name of Array List which stores the calculated value of pascal triangle
     * @code Iterator it_pascalTriangle traverses through the ArrayList and prints the pascal triangle
     */

    public static void PrintPascalTriangle(int row) {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        ArrayList<String> pascalTriangle = new ArrayList<String>();
        int first_num = 1;

        for (int i = 0; i < row; i++) {
            for (int j = row; j > i; j--) {
                pascalTriangle.add(sb.toString());
            }
            first_num = 1;
            for (int k = 0; k <= i; k++) {

                pascalTriangle.add(first_num + " ");
                first_num = first_num * (i - k) / (k + 1);
            }

            pascalTriangle.add("\n");
        }

        Iterator<String> it_pascalTriangle = pascalTriangle.iterator();

        while (it_pascalTriangle.hasNext()) {
            System.out.print(it_pascalTriangle.next());
        }
    }

    public static void main(String[] args) {
        int row = 20;
        PrintPascalTriangle(row);
    }

}
