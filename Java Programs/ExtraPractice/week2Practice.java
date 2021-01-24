class week2Practice {
    public static void main (String args[]) {
        System.out.println("Integer Arithmetic");
        int i = 1 + 1;
        int n = i * 3;
        int m = n / 4;
        int p = m - i;
        int q = -p;

        System.out.println("i= " + i);
        System.out.println("n= " + n);
        System.out.println("m= " + m);
        System.out.println("p= " + p);
        System.out.println("q= " + q);

        System.out.println("Floating Point Arithmetic");
        double a = 1 + 1;
        double b = a * 3;
        double c = b / 4;
        double d = c - a;
        double e = -d;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);
        System.out.println("e= " + e);

        System.out.println("Modulus Example");
        int x = 123;
        System.out.println(x%10);
        x /= 10;
        System.out.println(x%10);
        x /= 10;
        System.out.println(x%10);
        System.out.println("Go!");

        int xx = -1;
        xx--;
        System.out.println(xx);
        System.out.println(xx--);

        int xxx = 26;
        double y = xxx;//automatic/Widening
        System.out.println("Int Value " + xxx);
        System.out.println("Double Value " + y);

        double aa = 100.04;
        int bb = (int)a; //explicit/Narrowing
        System.out.println("Double value "+ aa);
        System.out.println("Int value "+ bb); //decimal part lost

        char ch = 'c';
        int num = 88;
        ch = (char)num;
        System.out.println(ch);

        int xxxx = 3.5;
        int yyy = (int)3.5;
        int z = (int)3.99;
    }
}
