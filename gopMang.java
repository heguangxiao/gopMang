import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size mang thu 1 :");
        size = scanner.nextInt();

        arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++){
            System.out.println("Nhap gia tri thu "+(i+1));
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Nhap size mang thu 2 :");
        size = scanner.nextInt();

        arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++){
            System.out.println("Nhap gia tri thu "+(i+1));
            arr2[i] = scanner.nextInt();
        }

        arr3 = new int[arr1.length+arr2.length];
        for (int i = 0;i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println(" ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }
        System.out.println(" ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+"\t");
        }
    }
}
