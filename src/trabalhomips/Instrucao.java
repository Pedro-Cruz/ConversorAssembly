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

/* ESSA CLASSE SERVE PARA DEFINIR A INSTRUÇÃO POR INTEIRA, GUARDANDO CADA ATRIBUTO DELA, OS ATRIBUTOS COM O 'i' NO INICIO
    REPRESENTAM OS ATRIBUTOS JA CONVERTIDOS PARA SER ENVIADO AO ARQUIVO */
public class Instrucao {

    private String op = "";
    private String rs = "";
    private String rt = "";
    private String rd = "";
    private String shamt = "";
    private String funct = "";
    private String immediate = "";

    private String nome = "";
    private String irs = "";
    private String irt = "";
    private String ird = "";
    private String ishamt = "";
    private String iimmediate = "";

    public Instrucao(String op, String original) {
        this.op = op;  
        BancoDeInstrucoes inst = new BancoDeInstrucoes();
        if (op.equals("000000")) {                      // Se o opcode for 0, será do tipo R e será organizado de uma maneira específica.
            for (int i = 6; i < 11; i++) {          // 5 bits de rs
                this.rs = converter.concatenaComChar(rs, original.charAt(i));
            }
            for (int i = 11; i < 16; i++) {         //5 bits de rt
                this.rt = converter.concatenaComChar(rt, original.charAt(i));
            }
            for (int i = 16; i < 21; i++) {         // 5 bits de rd
                this.rd = converter.concatenaComChar(rd, original.charAt(i));
            }
            for (int i = 21; i < 26; i++) {         // 5 bits de shamt
                this.shamt = converter.concatenaComChar(shamt, original.charAt(i));
            }
            for (int i = 26; i < 32; i++) {         // 6 bits de funct
                this.funct = converter.concatenaComChar(funct, original.charAt(i));
            }
             /*   */
            this.nome = inst.retornaInstrucao(funct);
            this.irs = inst.retornaInstrucao(rs);
            this.irt = inst.retornaInstrucao(rt);
            this.ird = inst.retornaInstrucao(rd);
            this.ishamt = inst.retornaInstrucao(ishamt);

        } else {
            for (int i = 6; i < 11; i++) {      // 5 bits rs
                this.rs = converter.concatenaComChar(rs, original.charAt(i));
                //System.out.println("teste rs: "+ rs +" inst: " + inst.retornaInstrucao(rs));
            }
            for (int i = 11; i < 16; i++) {         // 5 bits rt
                this.rt = converter.concatenaComChar(rt, original.charAt(i));
               // System.out.println("teste rt: "+ rt +" inst: " + inst.retornaInstrucao(rt));
            }
            /* VERIFICAR, CONVERTER PARA HEXA DEPOIS !!!!*/
            for (int i = 16; i < 32; i++) {         // 16 bits de immediate
                this.immediate = converter.concatenaComChar(immediate, original.charAt(i));
            }

            this.nome = inst.retornaInstrucao(op);
            this.irs = inst.retornaInstrucao(rs);
            this.irt = inst.retornaInstrucao(rt);
            this.ird = inst.retornaInstrucao(rd);
            this.ishamt = inst.retornaInstrucao(ishamt);

            //System.out.println("IM: " + immediate);
            
            /* APLICANDO O COMPLEMENTO CASO O NUMERO FOR SINALIZADO*/
            if (Character.getNumericValue(immediate.charAt(0)) == 1) {
                this.immediate = converter.complemento(immediate);
            }
            
            /** CONVERTENDO O IMMEDIATO DE BINARIO PARA DECIMAL **/
            this.iimmediate = String.valueOf(converter.converterNumBinario(immediate));
            
            /** APLICANDO UMA MASCARA DE '-' PARA SALVAR NO ARQUIVO **/
            if (Character.getNumericValue(immediate.charAt(0)) == 1) {
                this.iimmediate = " -" + iimmediate;
            }
          //  System.out.println("IIM: " + iimmediate);
        }
    }

    public String getIrs() {
        return irs;
    }

    public String getIrt() {
        return irt;
    }

    public String getIrd() {
        return ird;
    }

    public String getIshamt() {
        return ishamt;
    }

    public String getIimmediate() {
        return iimmediate;
    }

    public String getNome() {
        return nome;
    }

    public String getOp() {
        return op;
    }

}
