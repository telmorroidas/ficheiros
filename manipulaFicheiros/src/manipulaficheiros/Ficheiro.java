package manipulaficheiros;

import java.io.File;


class Ficheiro {

    static void criaFicheiro() {
       
    }

    static void verificaSeExiste() {
        
    }

    static void escreveNoFinalFicheiro() {
       
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
