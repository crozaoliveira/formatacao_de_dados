package avaliacaoformatacaodedados;

public class AvaliacaoFormatacaoDeDados {

    public static void main(String[] args) {
        
        String cnpjFormatado = Mascaras.formataCNPJ("03795071000116");
        System.out.println("CNPJ: "+cnpjFormatado);
        
        String cpfFormatado = Mascaras.formataCPF("69589548810");
        System.out.println("CPF: "+cpfFormatado);
        
        String cepFormatado = Mascaras.formataCEP("88352490");
        System.out.println("CEP: "+cepFormatado);
        
        String telFormatado = Mascaras.formataTel("47256251536");
        System.out.println("TEL: "+telFormatado);
        
        String placaFormatada = Mascaras.formataPlaca("ads2357");
        System.out.println("PLACA: "+placaFormatada);
        
        String contadorA = Mascaras.contagemLetras("amandAaAaAa", 'a');
        System.out.println("Contagem de letras: "+contadorA);
    }
    
}
