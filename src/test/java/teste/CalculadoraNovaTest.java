package teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

    @Test
    public void deveSomarDoisValores(){
        int valorA = 1;
        int valorB = 2;

        int soma = 0;

        CalculadoraNova calc = new CalculadoraNova();
        soma = calc.somar(valorA, valorB);
        assertEquals(3, soma);
    }

    @Test
    public void deveSomarTresValores(){
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        int soma = 0;

        CalculadoraNova calc = new CalculadoraNova();
        soma = calc.somar(valorA, valorB, valorC);
        assertEquals(6, soma);
    }
}
