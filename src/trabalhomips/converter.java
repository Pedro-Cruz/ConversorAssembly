/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhomips;

/**
 *
 * @author PedroPC
 */
public class converter {
    
    /** CONVERTE O VALOR BINARIO PARA 4 BITS **/
    public static String converterBinario(char valor) {
        String retorno;
        switch (valor) {
            case '0':
                retorno = "0000";
                break;
            case '1':
                retorno = "0001";
                break;
            case '2':
                retorno = "0010";
                break;
            case '3':
                retorno = "0011";
                break;
            case '4':
                retorno = "0100";
                break;
            case '5':
                retorno = "0101";
                break;
            case '6':
                retorno = "0110";
                break;
            case '7':
                retorno = "0111";
                break;
            case '8':
                retorno = "1000";
                break;
            case '9':
                retorno = "1001";
                break;
            case 'a':
                retorno = "1010";
                break;
            case 'b':
                retorno = "1011";
                break;
            case 'c':
                retorno = "1100";
                break;
            case 'd':
                retorno = "1101";
                break;
            case 'e':
                retorno = "1110";
                break;
            case 'f':
                retorno = "1111";
                break;
            default:
                return "FALHA NA CONVERSAO!";
        }
        return retorno;
    }

    public static int tamanho(String str) {
        return str.length();
    }
    
    /*** CONCATENA STRING COM CHAR **/
    public static String concatenaComChar(String str1, char char1) {
        return str1 + char1;
    }

    // CONVERTE BINARIO PARA DECIMAL **/
    public static int converterNumBinario(String str) {
        int valor = 0, potencia = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            valor += Math.pow(2, potencia) * Character.getNumericValue(str.charAt(i));
            potencia++;

        }
        return valor;
    }

    
    /** REALIZA O COMPLEMENTO DE 2 **/
    public static String complemento(String str) {
        String valor = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(i)) == 0) {
                valor = converter.concatenaComChar(valor, '1');
            } else {
                valor = converter.concatenaComChar(valor, '0');
            }
        }
        

        int soma;

        soma = Integer.parseInt(valor, 2) + Integer.parseInt("01", 2);//-- Transforma o valor de a e b em número decimal e faz a soma

        valor = Integer.toBinaryString(soma);
        return valor;

    }
}
