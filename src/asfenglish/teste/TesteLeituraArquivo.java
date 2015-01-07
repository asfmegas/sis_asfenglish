/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asfenglish.teste;

import br.com.asfmegas.asfenglish.util.Arquivo;

/**
 *
 * @author asfmegas
 */
public class TesteLeituraArquivo {
    
    public static void main(String[] args) {
        Arquivo a = new Arquivo();
        System.err.println("Conteudo: "+a.openFile(""));
        System.err.println(a.getTitle("D:/files/Two_Night_Stand.txt"));
    }
}
