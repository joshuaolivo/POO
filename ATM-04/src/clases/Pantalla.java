// Pantalla.java
// Representa a la pantalla del ATM
package clases;

public class Pantalla
{
   // muestra un mensaje sin un retorno de carro
   public void mostrarMensaje( String mensaje ) 
   {
      System.out.print( mensaje ); 
   } // fin del m�todo mostrarMensaje

   public String Bienvenida( ) 
   {
     return "Bienvenido! enter para continuar"; 
   } 
   // muestra un mensaje con un retorno de carro
   public void mostrarLineaMensaje( String mensaje ) 
   {
      System.out.println( mensaje );   
   } // fin del m�todo mostrarLineaMensaje

   // muestra un monto en d�lares
   public void mostrarMontoDolares( double monto )
   {
      System.out.printf( "$%,.2f", monto );   
   } // fin del m�todo mostrarMontoDolares 
   
   public String principal()
   {
       return "\nMenu principal:  \n1 - Ver mi saldo \n2 - Retirar efectivo \n3 - Depositar fondos \n4 - Salir\n Escriba una opcion: " ;
   }
   
   public String AutentificarUsuario()
   {
       return " ";
   }
} 