package avaliacaoformatacaodedados;

public class Mascaras {
    
    //Método para mascara de CPF
    public static String formataCPF(String cpf) {

        char[] n = cpf.toCharArray();
        String formataCPF = "";

        for (int i = 0; i < n.length; i++) {
            formataCPF = formataCPF + n[i];

            if (i == 2 | i == 5) {
                formataCPF = formataCPF + ".";
            }
            if (i == 8) {
                formataCPF = formataCPF + "-";
            }
        }
        return formataCPF;
    }

    //Método para mascara de CNPJ
    public static String formataCNPJ(String cnpj) {

        char[] n = cnpj.toCharArray();
        String formataCNPJ = "";

        for (int i = 0; i < n.length; i++) {
            formataCNPJ = formataCNPJ + n[i];

            if (i == 1 | i == 4) {
                formataCNPJ = formataCNPJ + ".";
            }
            if (i == 7) {
                formataCNPJ = formataCNPJ + "/";
            }
            if (i == 11) {
                formataCNPJ = formataCNPJ + "-";
            }
        }
        return formataCNPJ;
    }
    
    //Método para mascara de Telefone
    public static String formataTel(String telefone) {

        char[] n = telefone.toCharArray();
        String formataTel = "";

        for (int i = 0; i < n.length; i++) {
            formataTel = formataTel + n[i];

            if (i == 0) {
                formataTel = "(" + formataTel;
            }
            if (i == 1) {
                formataTel = formataTel + ") ";
            }
            if (i == 6) {
                formataTel = formataTel + "-";
            }
        }
        return formataTel;
    }
    
    //Método para mascara de CEP
    public static String formataCEP(String cep) {

        char[] n = cep.toCharArray();
        String formataCEP = "";

        for (int i = 0; i < n.length; i++) {
            formataCEP = formataCEP + n[i];

            if (i == 2) {
                formataCEP = formataCEP + ".";
            }
            if (i == 5) {
                formataCEP = formataCEP + "-";
            }
        }
        return formataCEP;
    }
    
    //Método para mascara de Placa Veicular
    public static String formataPlaca(String placaVeicular) {
        
        //converter parte de letras em caixa alta
        String placaMaisuculo = placaVeicular.toUpperCase();

        char[] n = placaMaisuculo.toCharArray();
        String formataPlaca = "";

        for (int i = 0; i < n.length; i++) {
            formataPlaca = formataPlaca + n[i];

            if (i == 2) {
                formataPlaca = formataPlaca + "-";
            }
        }
        return formataPlaca;
    }
    
    //Método para contagem de letra em uma String
    public static String contagemLetras(String palavra, char letra) {
        
        //converter String para caixa alta
        String palavraMaiusculo = palavra.toLowerCase();
        char letraMinuscula = letra.toLowerCase();
        
        char[] n = palavraMaiusculo.toCharArray();
        int contador = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == letraMinuscula) {
                contador++;
            }
        }
        return Integer.toString(contador);
    }
}
