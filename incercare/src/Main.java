//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public static void main(String[] args) {

    //6.3
    /*
    int maxInt= Integer.MAX_VALUE;
    int minInt= Integer.MIN_VALUE;
    System.out.println((maxInt+1) + " " + (minInt-1));

    byte minByte= Byte.MIN_VALUE;
    byte maxByte= Byte.MAX_VALUE;
    System.out.println((minByte-1) + " " + (maxByte+1));

    float maxFloat= Float.MAX_VALUE;
    System.out.println(2*maxFloat);

    double maxDouble= Double.MAX_VALUE;
    System.out.println(2*maxDouble);

    float myFloat=0.12345678910;
    System.out.println(myFloat);

    //6.4
    int nrIntreg=4;
    //System.out.println(nrIntreg/0);

    float nrNeg=-2;
    float nrPoz=2;
    System.out.println(nrNeg/0);
    System.out.println(nrPoz/0);

    float inf=Float.POSITIVE_INFINITY;
    float infNeg=Float.NEGATIVE_INFINITY;
    System.out.println(inf-infNeg);
    System.out.println(inf*infNeg);

    //boolean intreg=2;
    //int nr=1.0;

    //6.5
    int nrInt;
    float nrFloat;
    Scanner in = new Scanner(System.in);
    nrInt = in.nextInt();
    nrFloat = in.nextFloat();
    System.out.println(nrFloat +" " + nrInt);
    */

    //6.6
    BigInteger total = BigInteger.ZERO;
    for (int i = 0; i <= 63; i++) {
        total = total.add(BigInteger.valueOf(2).pow(i));
    }
    System.out.println(total);
}
