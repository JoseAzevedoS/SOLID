public class FabricaProcessadorPagamento {
    public static ProcessadorPagamento criar(String tipoPagamento) {
        switch (tipoPagamento.toLowerCase()) {
            case "pix":
                return new PagamentoPix();
            default:
                throw new IllegalArgumentException("Tipo de pagamento não suportado: " + tipoPagamento);
        }
    }
}