import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] matrix = {
            "ABC",
            "DEF",
            "GHI"
        };
        
        String[] borderedMatrix = addBorder(matrix);
        
        // Print the bordered matrix
        for (String row : borderedMatrix) {
            System.out.println(row);
        }
    }
    
    public static String[] addBorder(String[] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length();
        
        String[] borderedMatrix = new String[rows + 2];
        
        // Create the first row with asterisks
        char[] firstRow = new char[cols + 2];
        Arrays.fill(firstRow, '*');
        borderedMatrix[0] = new String(firstRow);
        
        // Create rows with original matrix values
        for (int i = 0; i < rows; i++) {
            borderedMatrix[i + 1] = "*" + matrix[i] + "*";
        }
        
        // Create the last row with asterisks
        char[] lastRow = new char[cols + 2];
        Arrays.fill(lastRow, '*');
        borderedMatrix[rows + 1] = new String(lastRow);
        
        return borderedMatrix;
    }
}