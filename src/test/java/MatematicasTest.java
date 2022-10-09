import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatematicasTest {

    private Matematicas matematicas = new Matematicas();

    @Test
    public void testParConNumeroPar(){
        boolean result = matematicas.esPar(2);
        assertTrue(result);
    }

    @Test
    public void testParConNumeroImpar(){
        boolean result = matematicas.esPar(3);
        assertFalse(result);
    }

    @Test
    public void testFactorialConNegativo(){
        int result = matematicas.factorial(-1);
        assertEquals(0,result);
    }

    @Test
    public void testFactorialConUno(){
        int result = matematicas.factorial(1);
        assertEquals(1,result);
    }

    @Test
    public void testFactorialConCuatro(){
        int result = matematicas.factorial(4);
        assertEquals(24,result);
    }

    @Test
    public void testFibonacciConCero(){
        int result = matematicas.fibonacci(0);
        assertEquals(0,result);
    }

    @Test
    public void testFibonacciConCuatro(){
        int result = matematicas.fibonacci(4);
        assertEquals(3,result);
    }
}
