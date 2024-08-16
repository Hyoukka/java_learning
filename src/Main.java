public class Main {
    public static void main(String[] args) {
     double var1 = 20.00d;
     double var2 = 80.00d;
     double result = (var1 + var2) * 100;
     double remainder = result % 40.00;
     boolean isZero = (remainder == 0);

     if(!isZero) {
         System.out.println("got some remainder");
     }
    }
}