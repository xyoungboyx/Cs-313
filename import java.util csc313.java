import java.util.Scanner;
public class ChristmasExercises {

    public static void main(String[] args) {
        for (int i = 1; i <= 48; i++) {
            if (i == 5 i == 6 i == 7 i == 😍 {
                System.out.print("=");
            } else if (i == 17 i == 18 i == 19 i == 20) {
                System.out.print("=");
            } else if (i == 29 i == 30 i == 31 i == 32) {
                System.out.print("=");
            } else if (i == 41 i == 42 i == 43 i == 44) {
                System.out.print("=");
            } else {
                System.out.print("*");
            }
            if (i % 12 == 0) {
                System.out.print("\n");
            }
        }

        System.out.print("\n\n");

        for (int row = 1; row <= 4; row++) {

            for (int col = 1; col <= 12; col++) {
                if (col == 5 col == 6 col == 7 col == 😍 {
                    System.out.print("=");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n\n");

        for (int i = 1; i <= 66; i++) {

            if ((i<=4) (i>=12 && i<=15) (i>=23 && i<=26)) {
                System.out.print("*");
            } else if(i==39 i==50 || i==61) {
                System.out.print(" ");
            }else {
                System.out.print("=");
            }

            if (i % 11 == 0) {
                System.out.print("\n");
            }
        }
        
        System.out.print("\n\n");
        
        for(int row=1; row<=6; row++){
            for(int col=1; col<=11; col++){
                
                if((row<=3) &&(col<=4)) {
                    System.out.print("*"); 
                }else if((row>=4 && row<=6) && (col == 6)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("=");
                }
                
               
            }
            System.out.print("\n");
        }
        
        System.out.print("\n\n");
        
        double sumNum = 0;
        int [] arr = {2,5,5,9,4,7,0,9,6,11,12};
        for(int i=0; i<arr.length; i++) {
            sumNum += arr[i];
            
            
        }
        double mean = sumNum/arr.length;
        System.out.print("Mean: " + mean);
        System.out.print("\nMedian: " + arr[5]);
        
        double variance = 0;
        
        for(int i=0; i<arr.length; i++){
            variance += Math.pow((arr[i] - mean), 2);
        }
        
        variance = variance/arr.length;
        double standardDeviation = Math.sqrt(variance);
        
        System.out.print("\nStandard Deviation: " + standardDeviation);
        
       
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<numbers.length; i++){
            System.out.print("\nEnter a number for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("You entered the following numbers: ");
        for(int num: numbers) {
            System.out.println(num + "");
        }
        
        
        
        System.out.print("\n\n");
        
        
        int[][] array = new int[10][10];
       
        System.out.println("Enter values for the 2D array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt(); // Accept input for each element
            }
        }
         System.out.println("The values you entered are:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Print a new line after each row
        }
        
        
        
    }
}