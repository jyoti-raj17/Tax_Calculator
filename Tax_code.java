package Tax_Calculator;
import java.util.*;
public class Tax_code {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        float income=sc.nextFloat();
        float tax=0;
        if(income<=2.5){
            tax=tax+0;
            System.out.printf("No tax");
        }
        else if(income>2.5 && income<=5.0){
            tax= (float) (tax+(0.05*(income-2.5)));
        }
        else if(income>5.0 && income<=10.0){
            tax=(float)(tax+(0.05*(5.0-2.5)));
            tax=(float)(tax+(0.2*(income-5.0)));
            System.out.print(tax);
        }
        else if(income>10.0){
            tax=(float)(tax+(0.05*(5.0-2.5)));
            tax=(float)(tax+(0.2*(10.0-5.0)));
            tax=(float)(tax+(0.3*(income-10.0)));
            System.out.println(tax);
        }
    }
}
