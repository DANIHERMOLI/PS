import  java.util.List ;
import  java.util.LinkedList ;
import  java.util.Scanner ;

package Supermercado ;

/ **
 * *
* @autor Daniela
 * /
public class Supermercado {
Scanner teclado =  new  Scanner ( System . in );
    
    public  static  void  main ( String [] args )
    {
         List < empleado > empleado =  new  LinkedList <> ();
        
        int opcion;
        
        do {
           System.out.println ( " 0. Salir " );
           System.out.println  ( " 1.Agregar un nuevo empleado " );
           System.out.println  ( " 2.Lista de empleados " );
           System.out.println ( " 3.Lista de empleados por departamento " );
           System.out.println ( " 4.Incremento del 10% del salario a cada empleado " );
           System.out.println  ( " 5.Suma de todos los salarios " );
           opcion = teclado . nextInt ();
           switch(opción) {
               
           }
               case  1 :
                  empleado new empleado = new empleado ();
                  System.out.println ( " Ingrese el nombre del empleado " );
                  nom = teclado . next.Line();
                  System.out.println  ( " Ingrese el departamento donde trabaja el empleado " );
                  dep = teclado . next.Line();
                  System.out.println  ( " Ingrese el cargo del empleado " );
                  c = teclado . next.Line();
                  System.out.println ( " Ingresos el salario del empleado " );
                  s = teclado . nextDouble ();
                          break ;
               case  2 :
                  List < empleado > empleado =  new  LinkedList <> ();
                  System.out.println  ( " La lista de empleados es "  + List<empleado>);
                   
                   break;
               case  3 :
               List < departamento > departamento =  new  LinkedList <> ();
                  System.out.println ( " Escriba el departamento " );
                   int contador =  0 ;  
                  System.out.println  ( " el departamento "  +  " dep "  +  " tiene "  + contador +  " empleados " );
                   break ;
               case  4 :
               List < salario > salario =  new  LinkedList <> ();
                   s = List <salario> *  0.10 ;
                          System.out.println  ( " El incremento de los salarios es de " + s);
                   break;
               case  5 :
               List < salario > salario =  new  LinkedList <> ();
                   salariostotal = salario + List<salario>;
                   System.out.println  ( " La suma de los salarios es "  + salariostotal);
                   break;
                   
           } while (opción ! = 0 )
        
            
    }

    
    
    