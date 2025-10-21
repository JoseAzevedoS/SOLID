public class ECommerce {
    public static void main(String[] args) {
        RepositorioPedido repositorio = new MySQLRepositorio();
        NotificadorEmail notificador = new NotificadorEmail();
        CalculadoraTotal calculadora = new CalculadoraTotal();
        
        ProcessadorDePedidos processador = new ProcessadorDePedidos(repositorio, notificador, calculadora);
        
        System.out.println("\n--- Processando com PIX ---");
        Pedido pedidoPix = new Pedido();
        pedidoPix.adicionarItem(new Item("Monitor", 800.0));
        pedidoPix.setTipoPagamento("pix");
        processador.processar(pedidoPix);
    }
}