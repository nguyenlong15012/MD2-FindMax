import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] taiSan;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();

            if (size>20){
                System.out.println("Không nhập trên 20");
            }
        }
        while (size>20);
        taiSan = new int[size];
        for (int i = 0; i< taiSan.length; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            taiSan[i] += sc.nextInt();
        }
        System.out.printf("Danh sách tài sản: " );
        for (int j =0; j< taiSan.length; j++){
            System.out.print(taiSan[j] + "\t");
        }

        int max = taiSan[0];
        int index = 1;
        for (int j = 0 ; j< taiSan.length; j++){
            if (max < taiSan[j]) {
                max = taiSan[j];
                index = j + 1;
            }
        }
        System.out.println("Số tài sản lớn nhất là: " + max + " nằm ở vị trí số: " +index);

    }
}
