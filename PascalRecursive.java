import java.util.ArrayList;

public class PascalRecursive {
    /**
     * Creates a pascal triangle using Recursive methods with out loops and iterators
     *
     * @param addSpace  is a recursive method which add spaces required to format the triangle
     * @param calculatePascalValues  is a recursive method which calculates the pascal triangle and appends to ArrayList
     * @param IterateRows is a recursive method which calls other recursive methods addSpace & calculatePascalValues
     * @param row is the number of rows of pascal triangle to be printed
     */
    public static ArrayList<String> pascalTriangle = new ArrayList<String>();

    public static void addSpace(int i, int j) {
        if (j > i) {
            pascalTriangle.add(" ");
            j--;
            addSpace(i, j);
        }
    }

    public static void calculatePascalValues(int i, int k, int first_num) {
        if (k <= i) {
            pascalTriangle.add(first_num + " ");
            first_num = first_num * (i - k) / (k + 1);
            k++;
            calculatePascalValues(i, k, first_num);

        }
    }

    public static void IterateRows(int i, int row) {
        if (i < row) {
            int j = row;
            addSpace(i, j);
            int first_num = 1;
            int k = 0;
            calculatePascalValues(i, k, first_num);

            pascalTriangle.add("\n");
            i++;
            IterateRows(i, row);

        }

    }

    public static void main(String[] args) {
        int row = 20;
        int i = 0;
        IterateRows(i, row);
        System.out.print(pascalTriangle.toString().replace(",", "").replace("]", "").replace("[", ""));

    }


}
