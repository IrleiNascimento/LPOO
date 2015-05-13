/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import UI.Ui;
import java.io.*;

/**
 *
 * @author Irlei
 */
public class ControlArquivo {

    public void salvar(Object object,File file,String ext) {
       if(ext==null || file.getAbsolutePath().contains(Ui.EXT))
           ext="";
        try {
          
            
            try (FileOutputStream arquivoGrav = new FileOutputStream(file+ext); 
                    ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav)) {
                //Grava o objeto cliente no arquivo
                objGravar.writeObject(object);
                objGravar.flush(); // os dados foram salvos  entao vamos "limpar" a memoria               
                arquivoGrav.flush();
            }
            //System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e) {
            ///System.out.println(e.getMessage()); // log do erro
        }
    }
 public Object abrirArquivo(String path) {
        Object cli = null;
        if(!path.contains(Ui.EXT)){
        path+=Ui.EXT;
        }
        try {
          
            try (FileInputStream arquivoLeitura = new FileInputStream( path); 
                    ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura)) {
                cli = (Object) objLeitura.readObject(); // recupara o Objeto 
              objLeitura.close();
            }
            //System.out.println("Objeto recuperado com sucesso!");
            return cli;  // retorna o Objeto do arquivo
        } catch (IOException | ClassNotFoundException e) {
            ////System.out.println(e.getMessage());// log do erro

        }
        return cli; // caso objeto nao exista retorna null
    }
    public Object lerArquivo(File file) {
        Object cli = null;
        try {
            try (FileInputStream arquivoLeitura = new FileInputStream(file); 
                    ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura)) {
                cli = (Object) objLeitura.readObject(); // recupera o Objeto 
           objLeitura.close();
            }
           // System.out.println("Objeto recuperado com sucesso!");
            return cli;  // retorna o Objeto do arquivo
        } catch (IOException | ClassNotFoundException e) {
            //System.out.println(e.getMessage());// log do erro

        }
        return cli; // caso objeto nao exita retorna null
    }
}
