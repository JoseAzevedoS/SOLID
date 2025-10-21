public class ProcessadorDePedidos {
    private final RepositorioPedido repositorio;
    private final NotificadorEmail notificador;
    private final CalculadoraTotal calculadora;
    
    public ProcessadorDePedidos(RepositorioPedido repositorio, NotificadorEmail notificador, CalculadoraTotal calculadora) {
        this.repositorio = repositorio;
        this.notificador = notificador;
        this.calculadora = calculadora;
    }
    
    public void processar(Pedido pedido) {
        calculadora.calcularTotal(pedido);
        ProcessadorPagamento processadorPagamento = FabricaProcessadorPagamento.criar(pedido.getTipoPagamento());
        processadorPagamento.processar(pedido);
        repositorio.salvar(pedido);
        notificador.enviarConfirmacao(pedido);
    }
}