public class Exercise {
    public static void main(String[] args){
     
     int a= 20;
     int b= 10;
     int add=a+b;
     int sub=a-b;
     int mul=a*b;
     int div = a/b;
     boolean result= a>b;
    boolean r = a > b && b > 0;
        System.out.printf("Addition: %d%n", add);
        System.out.printf("Subtraction: %d%n", sub);
        System.out.printf("Multiplication: %d%n", mul);
        System.out.printf("Division: %d%n", div);
        System.out.printf("Is a greater than b? %b%n", result);
        System.out.printf("Is a>b and b>0? %b%n", r);
     
     
    }
}