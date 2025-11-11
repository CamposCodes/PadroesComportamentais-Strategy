package padroescomportamentais.strategy;

public class FormaPagamentoDebito implements FormaPagamento {

    public float calcular(float valorCompra, float taxaFixa) {
        return valorCompra + taxaFixa;
    }
}
