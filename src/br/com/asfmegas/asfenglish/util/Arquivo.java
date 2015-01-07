package br.com.asfmegas.asfenglish.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexsandro Façanha
 * @since 07/01/2014
 * Baseado nas vídeo aulas da Universidade XTI
 */
public class Arquivo {
    
    public String openFile(String caminho){
        try{
            Path path = Paths.get(caminho);
            byte[] b = Files.readAllBytes(path);
            return new String(b);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro ao ler documento\n"+e.getMessage());
        }
        return "";
    }
    
    public String getTitle(String caminho){
        Path path = Paths.get(caminho);
        return path.getFileName().toString();
    }
    
    public void saveFile(String caminho, String texto) throws IOException{
        Path path = Paths.get(caminho);
        byte[] b = texto.getBytes();

        Files.write(path, b);
    }
}
