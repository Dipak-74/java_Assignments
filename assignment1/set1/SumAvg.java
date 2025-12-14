import java.util.Scanner;

class SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            num = sc.nextInt();
            sum = sum + num;
        }
        double avg = sum / 10.0;
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
    }
}
