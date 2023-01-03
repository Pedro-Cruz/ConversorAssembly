
package trabalhomips;

/**
 *
 * @author PedroPC
 */
public class BancoDeInstrucoes {
    /** COMANDOS **/
    /** R **/
    private String add = "100000";
    private String and = "100100";
    private String div = "001110";
    private String mult = "011000";
    private String or = "100101";
    private String sll = "000000";
    private String slt = "101010";
    private String srl = "000010";
    private String sub = "100010";
    
    /** I **/
    private String addi = "001000";
    private String andi = "001100";
    private String lw = "100011";
    private String ori = "001101";
    private String slti = "001010";
    private String sw = "101011";
    
    
    /** REGISTRADORES **/
    private String $zero = "00000";
    
    private String $at = "00001";
    
    private String $v0 = "00010";
    private String $v1 = "00011";
    
    private String $a0 = "00100";
    private String $a1 = "00101";
    private String $a2 = "00110";
    private String $a3 = "00111";
    
    private String $t0 = "01000";
    private String $t1 = "01001";
    private String $t2 = "01010";
    private String $t3 = "01011";
    private String $t4 = "01100";
    private String $t5 = "01101";
    private String $t6 = "01110";
    private String $t7 = "01111";
    
    private String $s0 = "10000";
    private String $s1 = "10001";
    private String $s2 = "10010";
    private String $s3 = "10011";
    private String $s4 = "10100";
    private String $s5 = "10101";
    private String $s6 = "10110";
    private String $s7 = "10111";
    
    private String $t8 = "11000";
    private String $t9 = "11001";
    
    private String $k0 = "11010";
    private String $k1 = "11011";
    
    private String $gp = "11100";
    
    private String $sp = "11101";
    
    private String $fp = "11110";
    
    private String $ra = "11111";

    public String getAdd() {
        return add;
    }

    public String getAnd() {
        return and;
    }

    public String getDiv() {
        return div;
    }

    public String getMult() {
        return mult;
    }

    public String getOr() {
        return or;
    }

    public String getSll() {
        return sll;
    }

    public String getSlt() {
        return slt;
    }

    public String getSrl() {
        return srl;
    }

    public String getSub() {
        return sub;
    }

    public String getAddi() {
        return addi;
    }

    public String getAndi() {
        return andi;
    }

    public String getLw() {
        return lw;
    }

    public String getOri() {
        return ori;
    }

    public String getSlti() {
        return slti;
    }

    public String getSw() {
        return sw;
    }

    private String get$zero() {
        return $zero;
    }

    public String get$at() {
        return $at;
    }

    public String get$v0() {
        return $v0;
    }

    public String get$v1() {
        return $v1;
    }

    public String get$a0() {
        return $a0;
    }

    public String get$a1() {
        return $a1;
    }

    public String get$a2() {
        return $a2;
    }

    public String get$a3() {
        return $a3;
    }

    public String get$t0() {
        return $t0;
    }

    public String get$t1() {
        return $t1;
    }

    public String get$t2() {
        return $t2;
    }

    public String get$t3() {
        return $t3;
    }

    public String get$t4() {
        return $t4;
    }

    public String get$t5() {
        return $t5;
    }

    public String get$t6() {
        return $t6;
    }

    public String get$t7() {
        return $t7;
    }

    public String get$s0() {
        return $s0;
    }

    public String get$s1() {
        return $s1;
    }

    public String get$s2() {
        return $s2;
    }

    public String get$s3() {
        return $s3;
    }

    public String get$s4() {
        return $s4;
    }

    public String get$s5() {
        return $s5;
    }

    public String get$s6() {
        return $s6;
    }

    public String get$s7() {
        return $s7;
    }

    public String get$t8() {
        return $t8;
    }

    public String get$t9() {
        return $t9;
    }

    public String get$k0() {
        return $k0;
    }

    public String get$k1() {
        return $k1;
    }

    public String get$gp() {
        return $gp;
    }

    public String get$sp() {
        return $sp;
    }

    public String get$fp() {
        return $fp;
    }

    public String get$ra() {
        return $ra;
    }

  
    
    
    /** Função para retornar o nome da instrução ou do registrador usado dependendo do código **/
    
    
    //PS: O ERRO PODE ESTAR AQUI!!!! ESTÁ MANDANDO REGISTRADORES DIFERENTES DO QUE DEVERIA
    
    public  String retornaInstrucao(String codigo){
       // int aux = converter.converterNumBinario(codigo);
        if(codigo.equals("00000")){
            return "$zero";
        }else if(codigo.equals("00001")){
            return "$at";
        }else if(codigo.equals("00010")){
            return "$v0";
        }else if(codigo.equals("00011")){
            return "$v1";
        }else if(codigo.equals("00100")){
            return "$a0";
        }else if(codigo.equals("00101")){
            return "$a1";
        }else if(codigo.equals("00110")){
            return "$a2";
        }else if(codigo.equals("00111")){
            return "$a3";
        }else if(codigo.equals("01000")){
            return "$t0";
        }else if(codigo.equals("01001")){
            return "$t1";
        }else if(codigo.equals("01010")){
            return "$t2";
        }else if(codigo.equals("01011")){
            return "$t3";
        }else if(codigo.equals("01100")){
            return "$t4";
        }else if(codigo.equals("01101")){
            return "$t5";
        }else if(codigo.equals("01110")){
            return "$t6";
        }else if(codigo.equals("01111")){
            return "$t7";
        }else if(codigo.equals("10000")){
            return "$s0";
        }else if(codigo.equals("10001")){
            return "$s1";
        }else if(codigo.equals("10010")){
            return "$s2";
        }else if(codigo.equals("10011")){
            return "$s3";
        }else if(codigo.equals("10100")){
            return "$s4";
        }else if(codigo.equals("10101")){
            return "$s5";
        }else if(codigo.equals("10110")){
            return "$s6";
        }else if(codigo.equals("10111")){
            return "$s7";
        }else if(codigo.equals("11000")){
            return "$t8";
        }else if(codigo.equals("11001")){
            return "$t9";
        }else if(codigo.equals("11010")){
            return "$k0";
        }else if(codigo.equals("11011")){
            return "$k1";
        }else if(codigo.equals("11100")){
            return "$gp";
        }else if(codigo.equals("11101")){
            return "$sp";
        }else if(codigo.equals("11110")){
            return "$fp";
        }else if(codigo.equals("11111")){
            return "$ra";
        }else if(codigo.equals(getAdd())){
            return "add";
        }else if(codigo.equals(getAddi())){
            return "addi";
        }else if(codigo.equals(getAnd())){
            return "and";
        }else if(codigo.equals(getAndi())){
            return "andi";
        }else if(codigo.equals(getDiv())){
            return "div";
        }else if(codigo.equals(getLw())){
            return "lw";
        }else if(codigo.equals(getMult())){
            return "mult";
        }else if(codigo.equals(getOr())){
            return "or";
        }else if(codigo.equals(getOri())){
            return "ori";
        }else if(codigo.equals(getSll())){
            return "sll";
        }else if(codigo.equals(getSlt())){
            return "slt";
        }else if(codigo.equals(getSlti())){
            return "slti";
        }else if(codigo.equals(getSrl())){
            return "srl";
        }else if(codigo.equals(getSub())){
            return "sub";
        }else if(codigo.equals(getSw())){
            return "sw";
        }else{
        
        /** else if(codigo.equals(get$at())){
            return "xor";
        }else if(codigo.equals(get$at())){
            return "xori";
        } */
        return "COMANDO INVALIDO!";
    }
    }
    
}
