package padroescomportamentais.strategy;

public class FormaPagamentoDinheiro implements FormaPagamento {

    public float calcular(float valorCompra, float percentualDesconto) {
        return valorCompra - (valorCompra * percentualDesconto / 100);
    }
}
