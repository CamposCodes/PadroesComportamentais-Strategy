# Strategy — Sistema de Formas de Pagamento

<p align="center">
  <a href="https://www.ufjf.br/" rel="noopener">
    <img width=261 height=148 src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Logo_da_UFJF.png/640px-Logo_da_UFJF.png" alt="Logo UFJF">
  </a>
</p>

<h3 align="center">DCC078-2025.3-A — Aspectos Avançados em Engenharia de Software (UFJF/ICE)</h3>

---

## 📝 Sumário
- [Sobre](#sobre)
- [Diagrama Nível de Projeto](#diagrama)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Exemplo de Uso](#exemplo)
- [Como Executar e Testes](#testes)
- [Autor](#autor)

## 🧐 Sobre <a name="sobre"></a>
> **Disciplina:** DCC078 – Aspectos Avançados em Engenharia de Software   </br>
> **Projeto:** Sistema de Formas de Pagamento - Strategy   </br>
> **Docente:** Prof. Marco Antônio Pereira Araújo  </br>
> **Data de entrega:** 11/11/2025   </br>
> **Aluno:** [Gabriel Campos Lima Alves](#autor)  </br>

### Padrão Strategy
Implementação do padrão **Strategy** para encapsular diferentes algoritmos de cálculo de formas de pagamento em uma organização.
O **Strategy** é um padrão comportamental que permite selecionar o algoritmo em tempo de execução, demonstrando:
- Desacoplamento entre cliente e estratégias de pagamento
- Algoritmos intercambiáveis (Dinheiro, Crédito, Débito, Pix, Boleto)
- Flexibilidade para adicionar novas formas de pagamento
- Permite que cada estratégia implemente seu cálculo específico
- Elimina a necessidade de switch/if statements para selecionar a forma de pagamento

## 📐 Diagrama de Classe <a name="diagrama"></a>
O diagrama abaixo representa a arquitetura do projeto, destacando a aplicação do padrão **Strategy** no sistema de pagamentos:

<p align="center">
  <img src="./Strategy.png" alt="Diagrama de Classe - Strategy" width="800"/>
</p>

## 🚀 Funcionalidades <a name="funcionalidades"></a>
### Sistema de Formas de Pagamento Implementado
- **FormaPagamento**: Interface para definir estratégias de pagamento
- **FormaPagamentoDinheiro**: Implementação para pagamento em dinheiro com desconto
- **FormaPagamentoCredito**: Implementação para pagamento em crédito com juros
- **FormaPagamentoDebito**: Implementação para pagamento em débito com taxa fixa
- **FormaPagamentoPix**: Implementação para pagamento via Pix com cashback
- **FormaPagamentoBoleto**: Implementação para pagamento via boleto com multa
- **Pedido**: Classe contexto que utiliza as estratégias de pagamento

### Recursos
- ✅ Formas de pagamento intercambiáveis em tempo de execução
- ✅ Cada estratégia implementa seu próprio cálculo de valor final
- ✅ Suporte a descontos (Dinheiro), juros (Crédito), taxas (Débito)
- ✅ Suporte a benefícios (Cashback no Pix)
- ✅ Suporte a multas (Boleto) com validação de valores negativos
- ✅ Fácil extensão para adicionar novas formas de pagamento
- ✅ Desacoplamento entre cliente (Pedido) e estratégias de pagamento
- ✅ Cobertura completa de testes com JUnit 5

##  Tecnologias <a name="tecnologias"></a>
- **Java 11+**
- **JUnit 5** - Framework de testes
- **Maven** - Gerenciamento de dependências
- **Git** - Controle de versão

## 📊 Exemplo de Uso <a name="exemplo"></a>
```java
Pedido pedido = new Pedido();
pedido.pagarComDinheiro(100.0f, 10.0f);
System.out.println(pedido.getValorFinal());

Pedido pedido2 = new Pedido();
pedido2.pagarComCredito(100.0f, 5.0f);
System.out.println(pedido2.getValorFinal());

Pedido pedido3 = new Pedido();
pedido3.pagarComDebito(100.0f, 2.5f);
System.out.println(pedido3.getValorFinal());

Pedido pedido4 = new Pedido();
pedido4.pagarComPix(200.0f, 3.0f);
System.out.println(pedido4.getValorFinal());

Pedido pedido5 = new Pedido();
pedido5.pagarComBoleto(100.0f, 2.0f);
System.out.println(pedido5.getValorFinal());

try {
    Pedido pedidoErro = new Pedido();
    pedidoErro.pagarComBoleto(100.0f, -5.0f);
} catch (IllegalArgumentException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

## 🧪 Como Executar e Testes <a name="testes"></a>
### Cobertura de Testes
- ✅ **Testes de Pagamento em Dinheiro**: Desconto é aplicado corretamente
- ✅ **Testes de Pagamento em Crédito**: Juros são adicionados corretamente
- ✅ **Testes de Pagamento em Débito**: Taxa fixa é adicionada corretamente
- ✅ **Testes de Pagamento em Pix**: Cashback é subtraído corretamente
- ✅ **Testes de Pagamento em Boleto**: Multa é adicionada com validação
- ✅ **Testes de Validação**: Multa negativa é rejeitada com exceção

### Pré-requisitos
- Java 11 ou superior
- Maven 3.6+

### Comandos
```bash
# Compilar o projeto
mvn clean compile

# Executar testes
mvn test

# Executar teste específico
mvn test -Dtest=PedidoTest#devePagarComDinheiroComDesconto

# Empacotar
mvn package
```

## 👨‍💻 Autor <a name="autor"></a>
**Gabriel Campos Lima Alves**
Matrícula: 202176005
Email: campos.gabriel@estudante.ufjf.br
GitHub: [@CamposCodes](https://github.com/CamposCodes)

---

*Projeto de uso acadêmico exclusivo para a disciplina DCC078 - UFJF*
