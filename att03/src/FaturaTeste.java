public class FaturaTeste {
    public static void main(String[] args) {
        // Instância de Fatura
        Fatura fatura = new Fatura("F123", "Mouse Óptico", 5, 25.0);

        // Detalhes da fatura
        System.out.println("Detalhes da Fatura:");
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPreco());
        System.out.println("Valor total da fatura: " + fatura.getFaturaTotal());
    }
}