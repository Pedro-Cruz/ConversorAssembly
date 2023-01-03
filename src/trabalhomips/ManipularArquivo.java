package trabalhomips;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/** ESSA CLASSE NÃO ESTA SENDO USADA **/
public class ManipularArquivo {

    public  ArrayList<String> leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        ArrayList<String> instrucoes = new ArrayList();
        while (true) {
            if (linha != null) {
                //System.out.println(linha);
                instrucoes.add(linha);
                
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        
        return instrucoes;
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
}
