package trabalhomips;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique; Tarcísio
 */
public class TrabalhoMIPS {

    public static void main(String[] args) throws IOException {

        /* LENDO O ARQUIVO E GUARDANDO NO ARRAYLIST */
        //  variaveis para armazenar o caminho dos arquivos. PS: criar a pasta TXT dentro do projeto.
        String localentrada = "./TXT/arquivoentrada.txt";
        String localsaida = "./TXT/arquivosaida.txt";

        // Lendo o arquivo de entrada e armazenando em um ArrayList
        BufferedReader buffRead = new BufferedReader(new FileReader(localentrada));
        String linha = "";
        ArrayList<String> instrucoes = new ArrayList<String>(); //Para armazenar as instrucoes em binario
        ArrayList<Instrucao> instBinary = new ArrayList<Instrucao>();  //Para armazenar as instrucoes prontas para serem gravadas no arquivo

        while (true) {
            String aux = "";
            if (linha != null) {

                for (int i = 0; i < converter.tamanho(linha); i++) {
                    aux = aux.concat(converter.converterBinario(linha.charAt(i)));
                }
                instrucoes.add(aux);
            } else {
                break;
            }
            linha = buffRead.readLine(); //Transferindo conteudo da linha do arquivo para a variável linha
        }
        buffRead.close(); // Fechando a leitura

        System.out.println(instrucoes.get(1)); // Teste

        /**
         * ** SALVANDO CADA BLOCO PARA IDENTIFICAR A INSTRUCAO ****
         */
        // PEGANDO O OPCODE DE CADA UMA E SALVANDO EM instBinary
        String aux = "";
        for (int i = 1; i < instrucoes.size(); i++) {
            aux = "";
            for (int j = 0; j < 6; j++) {
                aux = converter.concatenaComChar(aux, instrucoes.get(i).charAt(j));
            }
            Instrucao ins = new Instrucao(aux, instrucoes.get(i));
            instBinary.add(ins);
        }

        for (int i = 0; i < instBinary.size(); i++) {
            if (instBinary.get(i).getOp().equals("000000")) {
                System.out.println("instrucao (" + i + ") - opcode = " + instBinary.get(i).getOp() + " Assembly = " + instBinary.get(i).getNome() + " " + instBinary.get(i).getIrd() + ", " + instBinary.get(i).getIrs() + ", " + instBinary.get(i).getIrt());
            } else if (instBinary.get(i).getOp().equals("100011") || instBinary.get(i).getOp().equals("101011")) {
                System.out.println("instrucao (" + i + ") - opcode = " + instBinary.get(i).getOp() + " Assembly = " + instBinary.get(i).getNome() + " " + instBinary.get(i).getIrs() + ", " + instBinary.get(i).getIimmediate() + "(" + instBinary.get(i).getIrt() + ")");
            } else {
                System.out.println("instrucao (" + i + ") - opcode = " + instBinary.get(i).getOp() + " Assembly = " + instBinary.get(i).getNome() + " " + instBinary.get(i).getIrs() + ", " + instBinary.get(i).getIrt() + ", " + instBinary.get(i).getIimmediate());

            }
        }
        /** ESCREVENDO NO ARQUIVO **/
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(localsaida));

        for (int i = 0; i < instBinary.size(); i++) {
            if (instBinary.get(i).getOp().equals("000000")) {
                buffWrite.append(instBinary.get(i).getNome() + " " + instBinary.get(i).getIrd() + ", " + instBinary.get(i).getIrs() + ", " + instBinary.get(i).getIrt() + "\r\n");
            } else if (instBinary.get(i).getOp().equals("100011") || instBinary.get(i).getOp().equals("101011")) {
                buffWrite.append(instBinary.get(i).getNome() + " " + instBinary.get(i).getIrs() + ", " + instBinary.get(i).getIimmediate() + "(" + instBinary.get(i).getIrt() + ")\r\n");
            } else {
                buffWrite.append(instBinary.get(i).getNome() + " " + instBinary.get(i).getIrs() + ", " + instBinary.get(i).getIrt() + ", " + instBinary.get(i).getIimmediate() + "\r\n");
            }
        }

        buffWrite.close();
    }

}
