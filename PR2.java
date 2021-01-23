package Pr2;

import java.awt.*;

public class PR2 {
    public static void main(String[] args) {
        char symb1=1067;
        char symb2 ='Ы';

        System.out.println("symb1 contains "+ symb1);
        System.out.println("symb2 contains "+ symb2 + "\n");

        /**/
        char ch = 'J';
        int intCh = (int) ch;


        System.out.println("J corresponds with "+ intCh + "\n");

        /**/
        String s1 = "I have ";
        String s2 = " apples ";
        int num = 3;
        String s = s1 + num + s2;
        System.out.println(s + "\n");
        //Преобразования
        /**/
        int i4 = 35;
        String str = Integer.toString(i4);
        System.out.println(str + " int to String\n");

        /**/
        double  i5 = 32.4e10;
        String str1 = Double.toString(i5);
        System.out.println(str1 + " double to String\n");

        /**/
        long  i6 = 3422222;
        String str2 = Long.toString(i6);
        System.out.println(str2 + " long to string \n");

        /**/
        float  i = 3.46f;
        String str3 = Float.toString(i);
        System.out.println(str3 + " float to string \n");

        /**/
        char cha = 'S';

        // c использованием класса Character
        String charToString = Character.toString(cha);
        System.out.println(charToString);
        // с использованием операции добавления класса String
        String str6 = "" + cha;
        System.out.println(str6);
        //с использованием массива
        String fromChar = new String(new char[] { cha });
        System.out.println(fromChar);
        // с использованием метода valueOf класса String
        String valueOfChar = String.valueOf(cha);
        System.out.println(valueOfChar + "\n");

        /**/
        char Char = '9';
        // c использованием метода getNumericValue
        // класса Character
        int in = Character.getNumericValue(Char);
        System.out.println(in);
        // c использованием метода digit класса Character
        int In = Character.digit(Char,10);
        System.out.println(In + "\n");



        /**/
        int i3 = 2015;
        long l = (long) (i3);
        System.out.println(l + " int to long\n");

        /**/
        int i2 = 2015;
        float f = (float) (i2);
        System.out.println(f + " int to float\n");

        /**/
        long l1 = 214748364;
        int i7 = (int) l1;
        System.out.println(i7 + " long to int\n");

        /**/
        double d = 3.14;
        int i1 = (int) d;
        System.out.println(i1 + " double to int \n");

        /*Лекционный код*/
        System.out.println(" \n// Далее будет идти код из лекции \n");
        Point p1 = new Point(3,5);
        Point p2=p1;
        p1 = new Point(7,9);
        System.out.println(p2.x);

        /**/
        int x=300000;
        System.out.println(x*x);   // умножение с точностью 32 бита
        long m=x;
        System.out.println(m*m);   // умножение с точностью 64 бита
        System.out.println(1/(m-i)); // попробуем получить разность
        // значений int и long

        System.out.println(1000*60*60*24*30L);// вычисление для месяца


        byte a=-128;
        System.out.println(-a);

        byte b=127;
        System.out.println(++b);

        int z=1;
        System.out.println("z="+z);

        /**/
        char n='A';
        System.out.println(n);
        System.out.println(n+1);
        System.out.println("n="+n);
        System.out.println('n'+'='+ n);

        System.out.println(1e20f*1e20f);
        System.out.println(-1e200*1e200);

        System.out.println(1e-40f/1e10f);   // underflow для float
        System.out.println(-1e-300/1e100);  // underflow для double
        float flo=1e-6f;
        System.out.println(flo);
        flo+=0.002f;
        System.out.println(flo);
        flo+=3;
        System.out.println(flo);
        flo+=4000;
        System.out.println(flo);

        /**/
        double v = 1e-305 * Math.PI;
        System.out.println(v);
        for (int j = 0; j < 4; j++)
            System.out.println(v /= 100000);

        int xy=3;
        int yz=5;
        System.out.println(xy/yz);
        System.out.println((double)xy/yz);


        long lg=111111111111L;
        float fl = lg;
        lg = (long) fl;
        System.out.println(lg);
    }

}

