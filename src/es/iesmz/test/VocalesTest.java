package es.iesmz.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @Test
    public void contarVocales1(){
        assertEquals(4, Vocales.contarVocales("Hola Mundo"));
    }

}