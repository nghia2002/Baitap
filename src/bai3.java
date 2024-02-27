import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        String Ten;
        int Tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten:");
        Ten=sc.nextLine();
        System.out.println("Nhap Tuoi");
        Tuoi=sc.nextInt();
        if (Tuoi < 16) {
            System.out.println("Bạn "+Ten+" ở độ tuổi vị thành niên");
            
        }else if(Tuoi>=16 && Tuoi<18) {
            System.out.println("Ban: "+Ten+" o do tuoi truong thanh");
        }
        else if (Tuoi>=18) {
            System.out.println("Ban: "+Ten+" da gia");
            
        }


        
    }
    
}
