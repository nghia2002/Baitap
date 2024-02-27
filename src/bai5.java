import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        int Tong=0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap mot so nguyen (nhap 0 de ket thuc): ");
            int songuyen = sc.nextInt();
            Tong += songuyen;
            if(Tong>100){
                System.out.println("Tong cua cac so da nhap la:"+songuyen);
                break;
            }
            
        }
    }
}
