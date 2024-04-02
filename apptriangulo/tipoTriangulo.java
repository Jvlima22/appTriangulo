package apptriangulo;

import java.util.Scanner;

public class tipoTriangulo {
    double a,b,c;
    Scanner entrada = new Scanner(System.in);
    
    
    public double entrarDimensaoA(){
        System.out.print("Entre com o Tamanho do Lado A do Triângulo: ");
        a=entrada.nextDouble();
        
        return a;
        
    }
    public double entrarDimensaoB(){
        System.out.print("Entre com o Tamanho do Lado B do Triângulo: ");
        b=entrada.nextDouble();
        
        return b;
        
    }
    public double entrarDimensaoC(){
        System.out.print("Entre com o Tamanho do Lado C do Triângulo: ");
        c=entrada.nextDouble();
        
        return c;
        
    }  
    
    public int validarDimensoes(double a, double b, double c){
        if((a>0)&&(b>0)&&(c>0)) {
            return 1;
        }
        else{
            return 0;
        }
    }
    public int identificaSeTriangulo(double a, double b, double c){
        if((a>b+c) || (b>a+c)||(c>b+a)){
            System.out.println("As dimensões informadas não formam um triângulo");
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public void descobrirTipoTriangulo(double a, double b, double c){
        if((a==b)&&(b==c)){
            System.out.println("As dimensões "+a+" - " +b+" - " +c+" formam um triângulo EQUILÁTERO");
        }
        else{
            if((a==b)||(b==c)||(c==a)){
                System.out.println("As dimensões "+a+" - " +b+" - " +c+" formam um triângulo ISÓSCELES");
            }
            else{
                System.out.println("As dimensões "+a+" - " +b+" - " +c+" formam um triângulo ESCALENO");
            }
        }
    }
    
}