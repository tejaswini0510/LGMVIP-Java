package CurrencyConverter;
import java.util.*;
import java.text.DecimalFormat;
public class Currency_Converter {
   
    public static void main(String[] args)
    {
       double rupee,dollar,pound,code,euro,KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("*** Welcome to Currency Converter Project ***\n Enter the currency code\n 1:Rupees\n 2:Dollar\n 3:Pound\n 4:Euro\n 5:Kuwaiti dinar\n");
            code= sc.nextInt();
            if(code == 1)
            {
                System.out.println("enter amount in Rupees:");
                rupee = sc.nextDouble();
                dollar = rupee / 77.34;
                System.out.println("Dollar : "+f.format(dollar));
                pound=rupee/94.46;
                System.out.println("Pound : "+f.format(pound));
                euro=rupee/80.36;
                System.out.println("Euro : "+f.format(euro));
                KWD=rupee/251.92;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
            }
             else if(code == 2)
             {
                System.out.println("enter amount in Dollar:");
                dollar = sc.nextDouble();
                rupee = dollar * 77.34;
                System.out.println("Dollar : "+f.format(dollar));
                pound=dollar* 0.82;
                System.out.println("Pound : "+f.format(pound));
                euro=dollar* 0.96;
                System.out.println("Euro : "+f.format(euro));
                KWD=dollar * 0.31;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
             }
             else if(code == 3)
             {
                System.out.println("enter amount in Pound:");
                pound = sc.nextDouble();
                rupee = pound * 94.43;
                System.out.println("Rupees : "+f.format(rupee));
                dollar=pound* 1.22;
                System.out.println("Dollar : "+f.format(dollar));
                euro=pound* 1.17;
                System.out.println("Euro : "+f.format(euro));
                KWD=pound * 0.3748;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
             }
             else if(code == 4)
             {
                System.out.println("enter amount in Euro:");
                euro = sc.nextDouble();
                rupee = euro*80.43;
                System.out.println("Rupees : "+f.format(rupee));
                dollar=euro*1.04;
                System.out.println("Dollar : "+f.format(dollar));
                pound=euro*0.85;
                System.out.println("Pound : "+f.format(pound));
                KWD=euro*0.318949;
                System.out.println("Kuwaiti dinar : "+f.format(KWD));
   }
   else if(code == 5)
   {
             System.out.println("enter amount in Kuwaiti dinar:");
                KWD = sc.nextDouble();
                rupee = KWD*251.96;
                System.out.println("Rupees : "+f.format(rupee));
                dollar=KWD*3.26;
                System.out.println("Dollar : "+f.format(dollar));
                pound=KWD*2.67;
                System.out.println("Pound : "+f.format(pound));
                euro=KWD*3.13;
                System.out.println("Euro : "+f.format(euro));
   }
   else
   System.out.println("invalid Code!");
        }
        



    //so lets run this program
}
}
