public class test {
    public static void main(String[] args){
        byte mybyte = 100;
        short myshort = 500;
        int myint = 1000;
        long mylong = 50000 + (10*(myint+mybyte+myshort));
        System.out.println(mylong);
    }
}
