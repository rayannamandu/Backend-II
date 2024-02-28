public class classeCompras {
    public String descricao;
    public double valor;
    public int quantidade;

    public classeCompras(String descricao, double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this. quantidade = quantidade;
    }
    public double calcularTotal() {
        return this.valor * this.quantidade;
    }

    public static void main(String[] args) {
        classeCompras compra1 = new classeCompras("Produto 1", 15,5);

        System.out.println("O valor total da compra é: " + compra1.calcularTotal());
    }
}
