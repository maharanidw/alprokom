package praktikumalpro;
import java.util.Scanner;
public class kategoriBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan berat badan (kg) = ");
        double BB = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m) = ");
        double TB = input.nextDouble();
        
        double BMI = BB/(Math.pow(TB, 2));
           
        System.out.println("Nilai BMI                 = " + BMI);
        
        if (BMI < 18.5) {
            System.out.println("Kategori BMI              = Underweight");
        } else if ( BMI >= 18.5 && BMI < 25) {
            System.out.println("Kategori BMI              = Normal");
        } else if ( BMI >= 25 && BMI < 30) {
            System.out.println("Kategori BMI              = Overweight");
        }  else if ( BMI >= 30) {
            System.out.println("Kategori BMI              = Obesitas");
        }
    }
}
