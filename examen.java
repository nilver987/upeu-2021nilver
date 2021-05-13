import java.util.Scanner;

public class Examen{

    static Scanner teclado=new Scanner(System.in);
    static void Ejercicio01nsa(){
      //difenir variables
      int unidad1, unidad2, unidad3, notafinal;
      double promediofinal;
      //ingrese datos de entrada
      System.out.print("Ingrese la nota de la unidad 1: ");
      unidad1=teclado.nextInt();
      System.out.print("Ingrese la nota de la unidad 2: ");
      unidad2=teclado.nextInt();
      System.out.print("Ingrese la nota de la unidad 3: ");
      unidad3=teclado.nextInt();
      System.out.print("Ingrese notafinal: ");
      notafinal=teclado.nextInt();
      //proseso
      promediofinal=(unidad1*0.20+unidad2*0.15+unidad3*0.15+notafinal*0.50);
      //datos de salida
      System.out.println("Su promediofinal: "+promediofinal);
    } 

    static void Ejercicio02nsa(){ 
      //definir variables
      int puntos=0;
      double resultadofinal;
      double salario=1000;
      //datos de entrada
      System.out.print("Ingrese puntos de profesor: ");
      puntos=teclado.nextInt();
      //proseso
      if (puntos>=50 && puntos<=100){
        resultadofinal=salario*0.10;
      }
      else{
        if(puntos>=101 && puntos<=150){
          resultadofinal=salario*0.40;
        }
        else{
          if(puntos>=0 && puntos<=49){
            resultadofinal=salario*0.00;
          }
          else{
            resultadofinal=salario*0.50;
          }
        }
      }
      
      //datos de salida
      System.out.println("el bono del profesor es: "+resultadofinal);
    }
    static void Ejercicio03nsa(){
      //variables
      int edad;
      char genero,vacuna=' ';
      //datos de sentrada
      System.out.print("Ingrese su edad: ");
      edad= teclado.nextInt();
      System.out.print("Ingrese su genero H o M: ");
      genero= teclado.next().charAt(0);
      //proceso
      if(edad>70){
        switch(genero){
         case 'H':
           vacuna='C';
           break;
         case 'M':
            vacuna='C';
            break;
       }
      }else if(edad>=16&&edad<=69){
        switch(genero){
          case 'H':
           vacuna='A';
            break;
          case 'M':
            vacuna='B';
            break;
        }     
      }else if(edad<16){
        switch(genero){
          case 'H':
            vacuna='A';
            break;
          case 'M':
            vacuna='A';
            break;
        }     
      }
     //datos de salida
     System.out.println("el tipo de vacuna es: "+vacuna);        
    }
    static void Ejercicio04nsa(){
      //definir variables
        double primerNumero=0, segundoNumero=0;
 
        teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        primerNumero = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        segundoNumero = teclado.nextInt();
 
        System.out.print( "la suma es: " );
        System.out.println( primerNumero+segundoNumero );
        System.out.print( "la resta es: " );
        System.out.println( primerNumero-segundoNumero );
        System.out.print( "la multiplicacion  es: " );
        System.out.println( primerNumero*segundoNumero );
        System.out.print( "la divicion  es: " );
        System.out.println( primerNumero/segundoNumero );
        System.out.print( "la potencia es: " );
        System.out.println( Math.pow( primerNumero, segundoNumero) );
    }
    static void Ejercicio05nsa(){
      //variables
      int numerodeEjercicio;
      //ingreso de datos a las variables
      System.out.print("ingrese del 1 al 4 el ejercicio que quiere ejecutar : ");
      numerodeEjercicio=teclado.nextInt();
      //proceso y resultado
      switch (numerodeEjercicio){
        case 1:
          System.out.println("Has seleccionado el ejercicio 01 de nsa");;
          Ejercicio01nsa();
          break;
        case 2:
          System.out.println("Has seleccionado el ejercicio 02 de nsa");
          Ejercicio02nsa();
          break;
        case 3:
          System.out.println("Has seleccionado el ejercicio 03 de nsa");
          Ejercicio03nsa();
          break;
        case 4:
          System.out.println("Has seleccionado el ejercicio 04 de nsa");
          Ejercicio04nsa();
          break;
        default:
          System.out.println(" Solo ingresar números entre 1 y 4 por fabor" );
        } 
    }
   public static void main(String[]arg){
     Ejercicio05nsa();
   }   
} 
   
    
