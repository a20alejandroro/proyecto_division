package proyecto_division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {

    @Test
    public void testC1() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(1.0F, 1.0F);
        assertEquals(1.0F, resultado, 0);
    }
    @Test
    public void testC2() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(1.0F, 0.0F);

    }
    @Test
    public void testC3() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(2.0F, 2.0F);
        assertEquals(1.0F, resultado, 0);
    }
    @Test
    public void testC4() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(2.0F, 0.0F);
        assertEquals(1.0F, resultado, 0);
    }
    @Test
    public void testC5() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(1.0F, 1.0F);
        assertEquals(1.0F, resultado, 0);
    }
}

