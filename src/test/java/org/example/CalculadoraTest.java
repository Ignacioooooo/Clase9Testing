package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora c = new Calculadora();
        assertEquals(330, c.sumar(150, 180));
        assertEquals(110, c.dividir(330,3 ));

        //Creamos unas instancia de Calculadora en la cuál con assertEquals le indicamos los valores
        //que se deben calcular dandole las dos varibales y una expectativa, es decír, lo que esperamos
        // que nos dé dicho código
    }

    @Test
    void multiplicar() {
        Calculadora cal = new Calculadora();
        assertEquals(240, cal.multiplicar(80,3));
    }
   /* @Test
    void MultiplicarVarios(){
        Calculadora cal = new Calculadora();
        assertAll(() -> assertEquals(10, cal.multiplicar(2,5)),
                 () -> assertEquals(15, cal.multiplicar(3,5))
        );*/

    @Test
    void restar(){
        Calculadora c = new Calculadora();
        assertAll(() -> assertEquals(40, c.restar(90,50)),
                ()-> assertNotEquals(605, c.multiplicar(40,15))
        );
    }
    @Test
    void SumaryMultiplicar(){
        Calculadora c = new Calculadora();
        assertAll(()-> assertEquals(110, c.sumar(70,40)),
                ()-> assertNotEquals(2700, c.multiplicar(110,25)));

    }
    }