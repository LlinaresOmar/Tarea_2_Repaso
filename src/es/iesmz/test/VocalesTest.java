package es.iesmz.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @Test
    public void contarVocales1(){
        assertEquals(4, Vocales.contarVocales("Hola Mundo"));
    }

    @Test
    public void contarVocales2(){
        assertEquals(8, Vocales.contarVocales("Esto Es una cadenA"));
    }

    @Test
    public void contarVocales3(){
        assertEquals(7, Vocales.contarVocales("Java mola MogollOn"));
    }

    @Test
    public void contarVocales4(){
        assertEquals(1, Vocales.contarVocales("4h0r4 s0n num3r0s"));
    }

    @Test
    public void contarVocales5(){
        assertEquals(6, Vocales.contarVocales("Cadena S1n Vocales"));
    }
}