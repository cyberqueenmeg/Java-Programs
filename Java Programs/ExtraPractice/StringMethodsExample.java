class StringMethodsExample {
    public static void main(String[] args) {
        String s = "Java is fun to learn";
        String s1= "JAVA";		   String s2= "Java";
        String s3 ="Java";		   String s4 = "JAva";

        System.out.println("Checking equals s2 and s1: " +s2.equals(s1));
        System.out.println("Checking Length: "+ s.length());
        System.out.println("Char at index 2(third position): "+s.charAt(2));
        System.out.println("Index of letter f: "+ s.indexOf('f'));
        System.out.println("SubString of s: "+ s.substring(8));
        System.out.println("SubString of s: "+ s.substring(8, 12));
        System.out.println("Converting to lowercase: "+ s.toLowerCase());
        System.out.println("Converting to uppercase: "+ s.toUpperCase());
        System.out.println("Comparing s1 and s2: " + s1.compareTo(s2));
        System.out.println("Comparing s2 and s1: " + s2.compareTo(s1));
        System.out.println("Comparing s2 and s3: " + s2.compareTo(s3));
        System.out.println("Comparing s1 and s4: " + s1.compareTo(s4));
    }
}
