package JUnitBahia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ECBahiaTest {
    private ECBahia meuTime;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogador3;

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        meuTime = new ECBahia("EC Bahia");
        jogador1 = new Jogador("Cauly", 8, 300000);
        jogador2 = new Jogador("Ademir", 11, 300000);
        jogador3 = new Jogador("Biel", 10, 400000);

        meuTime.adicionarJogador(jogador1);
        meuTime.adicionarJogador(jogador2);
        meuTime.adicionarJogador(jogador3);

        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testPagarSalarios() {
        meuTime.pagarSalarios();

        String output = outputStream.toString().trim();

        assertTrue(output.contains("Salário pago para Cauly: R$300000.0"));
        assertTrue(output.contains("Salário pago para Ademir: R$300000.0"));
        assertTrue(output.contains("Salário pago para Biel: R$400000.0"));
    }
}
