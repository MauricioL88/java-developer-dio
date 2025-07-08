package tratamentoerro;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376503");
            System.out.println(cepFormatado);
        } catch (CapInvalidoException e) {
            System.err.println("O cep não corresponde com as regras de negócio.");
        }
    }

    static String formatarCep(String cep) throws CapInvalidoException{
        if(cep.length() != 8) {
            throw new CapInvalidoException();
        }
        // Simulando um cep formatado
        return "23.765-043";
    }
}
