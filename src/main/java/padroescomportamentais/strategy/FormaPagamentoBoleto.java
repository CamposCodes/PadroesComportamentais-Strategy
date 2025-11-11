package padroescomportamentais.strategy;

public class FormaPagamentoBoleto implements FormaPagamento {

    public float calcular(float valorCompra, float percentualMulta) {
        if (percentualMulta < 0) {
            throw new IllegalArgumentException("Percentual de multa não pode ser negativo");
        }
        return valorCompra + (valorCompra * percentualMulta / 100);
    }
}
