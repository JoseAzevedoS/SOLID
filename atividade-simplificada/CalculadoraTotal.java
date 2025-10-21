public class CalculadoraTotal {
    public double calcularTotal(Pedido pedido) {
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido: " + total);
        return total;
    }
}