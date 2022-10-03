package manipulaficheiros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


class Ficheiro {

    static void criaFicheiro() {
        String nome;
        System.out.println("insira o nome do ficheiro a criar");
        nome= ManipulaFicheiros.ler.nextLine();
        nome= ManipulaFicheiros.ler.next();
        File ficheiro= new File(nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
       
    }

    static void verificaSeExiste() {
        String nome;
        System.out.println("insira o nome do ficheiro a criar");
        nome= ManipulaFicheiros.ler.nextLine();
        nome= ManipulaFicheiros.ler.next();
        File ficheiro= new File(nome);
        if(!ficheiro.exists()){
            System.out.println("o ficheiro não existe");
        }else{
            System.out.println("o ficheiro existe");
        }
        
    }

    static void escreveNoFinalFicheiro() {
        String nome;
        System.out.println("insira o nome do ficheiro onde vai escrever");
        nome= ManipulaFicheiros.ler.nextLine();
        nome= ManipulaFicheiros.ler.next();
        File ficheiro= new File(nome);
            try{
                if(!ficheiro.exists()){
                ficheiro.createNewFile();               
            }
            FileWriter fw= new FileWriter(ficheiro, true);
            BufferedWriter bw= new BufferedWriter(fw);
            String texto;
            System.out.println("insira o conteúdo");
            texto= ManipulaFicheiros.ler.nextLine();
            texto= ManipulaFicheiros.ler.nextLine();
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();
            }catch (IOException ex){
                ex.printStackTrace();
        }
    }

    static void escreveFicheiroNovo() {
        
    }

    static void mostraConteudoFicheiro() {
      
    }

    static void mostraListaFicheiros() {
    File ficheiro= new File("C:\\Users\\fcorte-real\\Desktop\\ti827-10789\\ficheirosjava\\ficheiros");
    File [] lista= ficheiro.listFiles();
    System.out.println(">>> lista de ficheiros <<<");
    for(int x=0;x<lista.length;x++){
        System.out.println(lista[x].getName());
    }
    }
    
}
