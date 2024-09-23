import java.util.Scanner;

class App {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            try {
                String line = input.nextLine();
                int num = Integer.parseInt(line);  // Possible exception throw here
                sum += num;
                count += 1;
            } catch(Exception e) {
                break;
            }
        }

        int average = 0;

        if (count == 0) {
            average = 0;
        } else {
            average = Math.toIntExact(Math.round((double) sum / (double) count)); //intelliJ told me to do it this way
        }

        System.out.println("SUM = " + sum + " AVG = " + (int) average);


    }

}