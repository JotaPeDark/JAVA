import org.example.Conta_Bancaria;
import org.example.Tipo_Conta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste_Entrega {

    @Test
    public void Teste_Transferencia(){
        Conta_Bancaria contaOrigem = new Conta_Bancaria("Conta Origem", Tipo_Conta.corrente, 1000.0);
        Conta_Bancaria contaDestino = new Conta_Bancaria("Conta Destino", Tipo_Conta.poupanca, 500.0);

        // Realize a transferência de um valor da conta origem para a conta destino
        double valorTransferencia = 200.0;
        contaOrigem.transferirSaldo(contaDestino, valorTransferencia);

        // Verifique se o saldo foi transferido corretamente
        double saldoEsperadoContaOrigem = 1000.0 - valorTransferencia;
        double saldoEsperadoContaDestino = 500.0 + valorTransferencia;

        assertEquals(saldoEsperadoContaOrigem, contaOrigem.getSaldo(), 0.001);
        assertEquals(saldoEsperadoContaDestino, contaDestino.getSaldo(), 0.001);
    }
}
