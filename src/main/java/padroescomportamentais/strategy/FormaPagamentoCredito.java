package padroescomportamentais.strategy;

public class FormaPagamentoCredito implements FormaPagamento {

    public float calcular(float valorCompra, float percentualJuros) {
        return valorCompra + (valorCompra * percentualJuros / 100);
    }
}
