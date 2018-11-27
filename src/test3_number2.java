
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
public class test3_number2 {
         double Numb = 0;
        boolean check = true;
        void all_numb() {
            for (double i = 1; i < 10000; i += 1) {

              if (check == true) {
                    Numb += 1/i;
                }
                else {
                    Numb -= 1/i;
                }
                check = !check;
            }
            System.out.print("\nПодсчитанное выражение равно : " + Numb);
    }
            public  void main(String[] args) {
                all_numb();
            }

}
