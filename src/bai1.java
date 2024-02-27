import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) throws Exception {
    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so a=");
    a=sc.nextInt();
    System.out.println("Nhap vao so b=");
    b=sc.nextInt();
    int Tong = a+b;
    int hieu = a-b;
    int tich = a*b;
    float thuong = a/b;
    System.out.println("Tong="+ Tong);
    System.out.println("hieu="+ hieu);
    System.out.println("tich="+tich);
    System.out.println("thuong="+thuong);
    }
}
