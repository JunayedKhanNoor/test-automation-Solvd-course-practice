import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n=scanner.nextInt();
        System.out.println("Enter the numbers: ");
        int[] arr = new int[n];
        for (int a = 0; a <n; a++) {
             arr[a]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                int temp = arr[j];
                if (arr[j]>arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}