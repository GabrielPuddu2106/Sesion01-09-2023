import java. util. Scanner;

public class EjemploWhile{
    public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    System.out.print("Que tabla de multiplicar desea ver:");
    byte n = lector.nextByte();

    byte x = 1, num= 1;

    while( num <= n) {
        System.out.println(num + " x " + x + " = " + num*x);
        x++;
    }
    lector.close();
} 
}