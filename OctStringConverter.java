public class OctStringConverter {
       public static void main(String[] args) {
           String[] octStrings = { "123", "77", "237112", "6023", "2462" };
           int[] results = new int[octStrings.length]; // Array to store decimal results
   
           // Converting Algorithms
           for (int i = 0; i < octStrings.length; i++) {
               String octString = octStrings[i].trim(); // Trim to remove any spaces
               char[] charArray = octString.toCharArray(); // Convert the string to a char array
   
               int decimalValue = 0; // Initialize decimal value for this octal string
               int length = charArray.length; // Length of the char array
   
               // Iterate over each character in the char array
               for (int j = 0; j < length; j++) {
                   int digit = Integer.parseInt(String.valueOf(charArray[j])); // Convert char to its numeric value
                   int positionFromRight = length - j - 1; // Calculate the position from the right
                   decimalValue += digit * Math.pow(8, positionFromRight); // Calculate the decimal value
               }
   
               results[i] = decimalValue; // Store the result in the results array
           }
   
           // Output of results
           System.out.println("The decimal values of the octal strings are:");
           for (int i = 0; i < results.length; i++) {
               System.out.println(results[i]); // Print each decimal value
           }
       }
   }

