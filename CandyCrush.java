public class CandyCrush {

       // Method to print the playing field
       public static void printField(String[][] field) {
           for (String[] row : field) {
               for (String cell : row) {
                   System.out.print(cell + " ");
               }
               System.out.println();
           }
       }
   
       // Method to check if a position is valid
       public static boolean isValidPosition(int row, int col, String[][] field) {
           return row >= 0 && row < field.length && col >= 0 && col < field[0].length;
       }
   
       // Method to randomly generate colors in the playing field
       public static void generateRandomColors(String[][] field) {
           String[] colors = {"G", "B", "R", "X"};
           for (int row = 0; row < field.length; row++) {
               for (int col = 0; col < field[row].length; col++) {
                   int randomIndex = (int) (Math.random() * colors.length);
                   field[row][col] = colors[randomIndex];
               }
           }
       }
   
       // Method to check if two fields can be swapped
       public static boolean canBeSwapped(int row1, int col1, int row2, int col2, String[][] field) {
           if (!isValidPosition(row1, col1, field) || !isValidPosition(row2, col2, field)) {
               return false;
           }
           return (row1 == row2 && Math.abs(col1 - col2) == 1) || 
                  (col1 == col2 && Math.abs(row1 - row2) == 1);
       }
   
       // Method to delete an element and move remaining colors down
       public static void deleteAndMoveDown(int row, int col, String[][] field) {
           if (!isValidPosition(row, col, field)) {
               return;
           }
           for (int r = row; r > 0; r--) {
               field[r][col] = field[r - 1][col];
           }
           field[0][col] = " ";
       }
   
       // Main method to demonstrate functionality
       public static void main(String[] args) {
           // Example 5x5 field
           String[][] field = new String[5][5];
   
           // Generate random colors and print the field
           generateRandomColors(field);
           System.out.println("Initial Field:");
           printField(field);
   
           // Check swap validity and perform swap if valid
           System.out.println("\nAttempting to swap (2, 2) and (2, 3):");
           if (canBeSwapped(2, 2, 2, 3, field)) {
               String temp = field[2][2];
               field[2][2] = field[2][3];
               field[2][3] = temp;
               printField(field);
           } else {
               System.out.println("Cannot swap these positions.");
           }
   
           // Delete element and move down
           System.out.println("\nAfter deleting element at (0, 0):");
           deleteAndMoveDown(0, 0, field);
           printField(field);
       }
   }
   