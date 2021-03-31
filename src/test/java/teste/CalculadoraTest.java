package teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSomar(){
        Calculadora cal = new Calculadora();
        int soma = cal.somar("1+1+2");
        assertEquals(5, soma);
    }
}
