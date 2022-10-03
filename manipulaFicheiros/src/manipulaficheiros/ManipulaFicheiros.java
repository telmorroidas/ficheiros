
package manipulaficheiros;

import java.util.Scanner;


public class ManipulaFicheiros {

    public static Scanner ler= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int op;
        
        do{
            System.out.println("1- criar ficheiro");
            System.out.println("2- verficar se ficheiro existe");
            System.out.println("3- escrever um ficheiro mantendo dados caso exista");
            System.out.println("4- escrever um novo ficheiros");
            System.out.println("5- ler um ficheiro");
            System.out.println("6- mostrar lista de ficheiros");
            System.out.println("0- sair");
            System.out.println("selecione a opção pretendida");
            op= ler.nextInt();
            switch(op){
                case 1: Ficheiro.criaFicheiro(); break;
                case 2: Ficheiro.criaFicheiro(); break;
                case 3: Ficheiro.criaFicheiro(); break;
                case 4: Ficheiro.criaFicheiro(); break;
                case 5: Ficheiro.criaFicheiro(); break;
                case 6: Ficheiro.criaFicheiro(); break;
                case 0: break;
            }
        }while(op!= 0);

    }
    
}
