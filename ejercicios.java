import java.util.Scanner;

public class Ejercicios {
    static Scanner teclado=new Scanner(System.in);
    static void Ejercicio01(){
      //definir variables 
      int edad;
      //datos de entrada
      System.out.print("Ingrese su edad: ");
      edad=teclado.nextInt();
      //proseso y datos de salida
      if (edad>=18){
         System.out.println("SI puede votar");
      }else{
          System.out.println("NO puede votar");;
      }

    }
    static void Ejercicio02(){
      //definir variables
      int puntos=0;
      double montoP=0;
      //datos de entrada
      System.out.print("Ingrese su puntos: ");
      puntos=teclado.nextInt();
      //proseso
      if(puntos<=100){
        montoP=1000;
      }else if(puntos>=101 && puntos<=150){
        montoP=2000;
      }else{
       montoP=3000;
      }
      //datos de salida
      System.out.println("El monto a pagar es:"+montoP);
    } 
    static void Ejercicio03(){
     double dinero;

        System.out.print("Cuato dinero tienes: ");
        dinero=teclado.nextInt();

        if (dinero<=10){
            System.out.println("Puedes regalar una tarjeta!!");
        }    
        else {
            if(dinero>=11 && dinero<=100){
                System.out.println("Puedes regalar Chocolates!!");
            }          
            else{
                if(dinero>=101 && dinero<=250){
                    System.out.println("Puedes regalar flores!!");
                    }
                else{
                    if(dinero>=251){
                        System.out.println("Puedes regalar Anillo!!");
                    } 
                }
            }
        }           
    } 
    static void Ejercicio04(){
        int edad1, edad2, edad3;
        String N1, N2, N3;

        System.out.print("Ingrese un nombre 1: ");
        N1=teclado.nextLine();
        System.out.print("Ingrese un nombre 2: ");
        N2=teclado.nextLine();
        System.out.print("Ingrese un nombre 3: ");
        N3=teclado.nextLine();      
        System.out.print("Ingrese la edad de: "+N1+": ");
        edad1=teclado.nextInt();        
        System.out.print("Ingrese la edad: "+N2+": ");
        edad2=teclado.nextInt();        
        System.out.print("Ingrese la edad: "+N3+": ");
        edad3=teclado.nextInt();

        if (edad1 < edad2 && edad1 < edad3){           
          System.out.println(N1+ "tiene la menor edad");           
        }    
        else {
            if(edad2 < edad1 && edad1 < edad3){
              System.out.println(N2+ "tiene la menor edad");  
            }          
            else{
              System.out.println(N3+ " tiene la menor edad");                  
            }
        }           
    } 
    static void Ejercicio05(){
        double bono=0;
        int años;
        System.out.println("Ingrese cuantos años esta en la empresa:");
        años = teclado.nextInt();
        switch(años){
            case 1:{
                bono=100.0;
            } break;
            case 2:{
                bono=200.0;
            } break;
            case 3:{
                bono=300.0;
            } break;
            case 4:{
                bono=400.0;
            } break;  
        } 
        if(años>4){
            bono=1000.0;
        }
        System.out.println("Su bono es de: "+bono);      
    } 
    static void Ejercicio06(){
        double precio;
        double descuento=0;
        double totalP=0;

       System.out.print("Cuato cuesta el Artículo: ");
        precio=teclado.nextInt();

        if (precio>=200){
            descuento=(precio*0.15);
            totalP=precio - descuento ;            
        }    
        else {
            if(precio>=100 && precio<200){
                descuento=(precio*0.12);
                totalP=precio - descuento; 
            }          
            else{
                if(precio<100){
                    descuento=(precio*0.1);
                    totalP=precio - descuento;
                }
            }
        }
    }
         
    public static void main(String[]arg){
        Ejercicio06();
    }   
} 
   