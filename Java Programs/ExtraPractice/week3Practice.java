class week3Practice {
    public static void main(String[] args) {
        String a = "hi";
        String b = a;
        System.out.println(a == b);
        b = new String("hi");
        System.out.println(a == b);
        a = a + " bye";
        System.out.println(a);
        a = "hi";
        String c = "hi";
        System.out.println(a == c);

        System.out.println("Backspace      : " + "ABCDE\bFGHIJ");
        System.out.println("Formfeed       : " + "ABCDE\fFGHIJ");
        System.out.println("Linefeed       : " + "ABCDE\nFGHIJ");
        System.out.println("Single Quote   : " + "ABCDE\'FGHIJ");
        System.out.println("Double Quote   : " + "ABCDE\"FGHIJ");
        System.out.println("Backslash      : " + "ABCDE\\FGHIJ");
        System.out.println("Horizontal Tab : " + "ABCDE\tFGHIJ");
        System.out.println("Carriage Return: " + "ABCDE\rFGHIJ");

        String aa = "hi";
        String bb = "bye";
        System.out.println(aa+ "\\" + bb);
        System.out.println(a + "\n" + bb);
        System.out.println(a==b);
        b = "hi";
        System.out.println(a==b);
    }
}
