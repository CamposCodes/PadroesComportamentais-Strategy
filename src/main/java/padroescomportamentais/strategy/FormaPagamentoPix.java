package padroescomportamentais.strategy;

public class FormaPagamentoPix implements FormaPagamento {

    public float calcular(float valorCompra, float percentualCashback) {
        return valorCompra - (valorCompra * percentualCashback / 100);
    }
}
