package padroescomportamentais.strategy;

public class Pedido {

    private FormaPagamento formaPagamento;
    private float valorFinal;

    public void pagarComDinheiro(float valorCompra, float percentualDesconto) {
        this.formaPagamento = new FormaPagamentoDinheiro();
        this.valorFinal = formaPagamento.calcular(valorCompra, percentualDesconto);
    }

    public void pagarComCredito(float valorCompra, float percentualJuros) {
        this.formaPagamento = new FormaPagamentoCredito();
        this.valorFinal = formaPagamento.calcular(valorCompra, percentualJuros);
    }

    public void pagarComDebito(float valorCompra, float taxaFixa) {
        this.formaPagamento = new FormaPagamentoDebito();
        this.valorFinal = formaPagamento.calcular(valorCompra, taxaFixa);
    }

    public void pagarComPix(float valorCompra, float percentualCashback) {
        this.formaPagamento = new FormaPagamentoPix();
        this.valorFinal = formaPagamento.calcular(valorCompra, percentualCashback);
    }

    public void pagarComBoleto(float valorCompra, float percentualMulta) {
        this.formaPagamento = new FormaPagamentoBoleto();
        this.valorFinal = formaPagamento.calcular(valorCompra, percentualMulta);
    }

    public float getValorFinal() {
        return valorFinal;
    }
}
