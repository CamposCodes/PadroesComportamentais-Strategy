package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void devePagarComDinheiroComDesconto() {
        Pedido pedido = new Pedido();
        pedido.pagarComDinheiro(100.0f, 10.0f);
        assertEquals(90.0f, pedido.getValorFinal());
    }

    @Test
    void devePagarComCreditoComJuros() {
        Pedido pedido = new Pedido();
        pedido.pagarComCredito(100.0f, 5.0f);
        assertEquals(105.0f, pedido.getValorFinal());
    }

    @Test
    void devePagarComDebitoComTaxaFixa() {
        Pedido pedido = new Pedido();
        pedido.pagarComDebito(100.0f, 2.5f);
        assertEquals(102.5f, pedido.getValorFinal());
    }

    @Test
    void devePagarComPixComCashback() {
        Pedido pedido = new Pedido();
        pedido.pagarComPix(200.0f, 3.0f);
        assertEquals(194.0f, pedido.getValorFinal());
    }

    @Test
    void devePagarComBoletoSemMulta() {
        Pedido pedido = new Pedido();
        pedido.pagarComBoleto(100.0f, 0.0f);
        assertEquals(100.0f, pedido.getValorFinal());
    }

    @Test
    void devePagarComBoletoComMulta() {
        Pedido pedido = new Pedido();
        pedido.pagarComBoleto(100.0f, 2.0f);
        assertEquals(102.0f, pedido.getValorFinal());
    }

    @Test
    void naoDeveAceitarMultaNegativa() {
        try {
            Pedido pedido = new Pedido();
            pedido.pagarComBoleto(100.0f, -5.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual de multa não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void devePagarComDinheiroDescontoTotal() {
        Pedido pedido = new Pedido();
        pedido.pagarComDinheiro(50.0f, 100.0f);
        assertEquals(0.0f, pedido.getValorFinal());
    }

    @Test
    void devePagarComCreditoJurosAltos() {
        Pedido pedido = new Pedido();
        pedido.pagarComCredito(1000.0f, 15.0f);
        assertEquals(1150.0f, pedido.getValorFinal());
    }

    @Test
    void devePagarComPixCashbackMaximo() {
        Pedido pedido = new Pedido();
        pedido.pagarComPix(500.0f, 5.0f);
        assertEquals(475.0f, pedido.getValorFinal());
    }

}
