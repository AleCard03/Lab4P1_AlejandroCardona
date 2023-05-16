/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_alejandrocardona;
import java.util.Scanner;
/**
 *
 * @author jets
 */
public class Lab4P1_AlejandroCardona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        boolean continuar = true;
        while (continuar){
            System.out.println("1. Conjuntos");
            System.out.println("2. Contraseña Mejorada");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion");
            int opcion = read.nextInt();
            switch(opcion){
                case 1: {
//                    read.nextLine();
//                    int cont3 = 0;
//                    String set1, set2, digit;
//                    boolean formato = true; 
//                    boolean digito = true;
//                    System.out.println("Ingrese el primer conjunto:");
//
//                    set1 = read.nextLine();
//                    System.out.println(set1);
//                    String format1;
//                    format1 = "A = {";
//                    while (formato){
//                     
//                        if ( format1.equals(set1)){
//                            formato = false;
//                        }
//
//                    }
//                    formato = true;

//                    while (formato){
//                        for ( int i = 5; i < set1.length() && digito; i+=3){
//                            char r = set1.charAt(i);
//                             digit = Character.toString(r);
//                             int numero = Integer.parseInt(digit);
//                             if (numero >= 65 && numero<= 90 ){
//                                 digito = false;
//                             }
//                             else{
//                                 System.out.print("L");
//                             }
//                        }                            
//                    }
//                    for (int i = 6; i < set1.length();i+=3){
//                        char comp = set1.charAt(i);
//                        if(i < set1.length() - 1){
//                            System.out.print(comp+", ");
//                        }
//                        else {
//                            System.out.println(comp+"}");
//                        }
//                    }//fin for print set 1
//                    System.out.println("Ingrese el segundo conjunto");
//                    set2 = read.next().toLowerCase();
//                    System.out.print("B = {");
//                    for (int i = 0; i < set2.length(); i++){
//                        char comp = set2.charAt(i);
//                        if(i < set2.length() - 1){
//                            System.out.print(comp+", ");
//                        }
//                        else {
//                            System.out.println(comp+"}");
//                        }
//                        
//                    }//fin for print set 2
//                    int cont  = 0;
//                    for ( int j = 0; j<set1.length(); j++){
//                        char x = set1.charAt(j);
//                        for(int k = 0; k <set2.length(); k++){
//                            char y = set2.charAt(k);
//                            if ( x==y ){
//                                cont++;
//                            }//fin if cont
//                        }//fin for k
//                    }//fin for igual
//                    if (cont == set1.length()&&cont == set2.length()){
//                        System.out.println("Ambos conjuntos son iguales");
//                    }//fin  if iguales
//                    else {
//                        System.out.println("Ambos conjuntos no son iguales");
//                        for (int i = 0; i < set1.length(); i++){
//                            int cont2 = 0;
//                            char x = set1.charAt(i);
//                            for (int j = 0; j < set2.length() && cont2==0; j++){
//                                char y = set2.charAt(j);
//                                if ( x == y){
//                                    System.out.println(x);
//                                    cont2++;
//                                }
//                                else{
//                                    System.out.println(x);
//                                    System.out.println(y);
//                                    cont2++;
//                                }//fin else
//                            }//fin for j
//                        }//fin for union
//                        
//                    }//fin else no son iguales
//                    
                }//fin case 1
                break;
                case 2: {
                    boolean chara = false;
                    boolean letra = false;
                    boolean numero = false;
                    int cont  = 0;
                    System.out.println("Ingrese una contraseña");
                    String contraseña;
                    contraseña = read.next();
                    System.out.println("Ingrese un numero");
                    int num = read.nextInt();
                    for ( int i = 0; i <= contraseña.length(); i++){
                        cont++;
                    }
                    
                    for ( int j = 0; j<contraseña.length() || (letra && numero); j++){
                        int digit = contraseña.charAt(j);
                        System.out.println(digit);
                        
                        if ( (digit >= 97 && digit <= 122) ||(digit >=65 && digit <= 90)){
                            letra = true;
                        }
                        if ( digit <= 57 && digit >= 48){
                            numero = true;
                        }
                    
                    }
                    if (letra){
                        System.out.println("");
                    }
                    else{
                        System.out.println("Su contraseña no contiene ni una letra");
                    }
                    if (numero){
                        System.out.println("");
                    }
                    else {
                        System.out.println("Su contraseña no contiene ni un numero");
                    }
                    if ( cont < 8){
                        System.out.println("Su contraseña contiene menos de 8 caracteres");
                    }//fin caracteres
                    else {
                        chara = true;
                    }
                    if (numero && chara && letra){
                        System.out.println("La contraseña es segura");
                    }
                    System.out.println("lol");
                }//fin case 2
                break;
                case 3: {
                    continuar = false;
                }//fin case 3
                break;
            }//fin opcion switch
        }//fin while continuar
        // TODO code application logic here
    }
    
}
