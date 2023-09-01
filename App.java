import java.util.Scanner;

public class App{
    public static void main(String[] args)throws Exception{
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Que tabla de multiplicacion le gustaria ver");
        byte n = lector.nextByte();
        byte x = 1;

        while ( n <= 0){
            System.out.println("No puede ingresar valores menores o igual a 0");
            System.out.println("Que tabla de multiplicacion desea mostar ");

            n = lector.nextByte();
        }

        while(x <= 10){
            System.out.println(n + " x " + x +" = " + n*x);
            x++; 
        }
        System.out.println("Despues del while");
        System.out.println("Fin");
        lector.close();

}
}
