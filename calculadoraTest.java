package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class calculadoraTest {

	@Test
	@DisplayName("Test Suma OK")
	protected void testSumarOk() {
		int esperado = 10;
		int actual = calculadora.suma(8, 2);
		assumingThat(esperado == actual,
                () -> System.out.println("Test Sumar OK"));
        System.out.println("El resultado esperado de la Suma es: " + esperado);
        System.out.println("El resultado actual de la Suma es: " + actual);
        assertEquals(esperado, actual);
    }

	@Test
	@DisplayName("Test Resta OK")
	protected void testRestarOk() {
		int esperado = -6;
		int actual = calculadora.resta(2, 8);
        assumingThat(esperado == actual,
                () -> System.out.println("Test Resta OK"));
        System.out.println("El resultado esperado de la Resta es: " + esperado);
        System.out.println("El resultado actual de la Resta es: " + actual);
        assertEquals(esperado, actual);
	}

	@Test
	@DisplayName("Test Suma Fallo")
	protected void testSumaFallo() {
		int esperado = 55;
		int actual = calculadora.suma(8, 2);
		assumingThat(esperado != actual,
                () -> System.out.println("Test Sumar Fallo"));
        System.out.println("El resultado esperado de la Suma es: " + esperado);
        System.out.println("El resultado actual de la Suma es: " + actual);
        assertEquals(esperado, actual);
	}

	@Test
	@DisplayName("Test Resta Fallo")
	protected void testRestaFallo() {
		int esperado = 55;
		int actual = calculadora.resta(8, 2);
        assumingThat(esperado != actual,
                () -> System.out.println("Test Resta Fallo"));
        System.out.println("El resultado esperado de la Resta es: " + esperado);
        System.out.println("El resultado actual de la Resta es: " + actual);
        assertEquals(esperado, actual);
	}

	@Test
	@DisplayName("Test Multiplicación OK")
	protected void testMultiplicacionOk() {
		int esperado = 16;
		int actual = calculadora.multiplica(8, 2);
		assumingThat(esperado == actual,
                () -> System.out.println("Test Multiplicación OK"));
        System.out.println("El resultado esperado de la Multiplicación es: " + esperado);
        System.out.println("El resultado actual de la Multiplicación es: " + actual);
        assertEquals(esperado, actual);
    }

	@Test
	@DisplayName("Test División OK xxxxxxxxx")
	protected void testDivisionOk() {
		int esperado = 4;
		int actual = calculadora.divide(8, 2);
		assumingThat(esperado == actual,
                () -> System.out.println("Test División OK"));
        System.out.println("El resultado esperado de la División es: " + esperado);
        System.out.println("El resultado actual de la División es: " + actual);
        assertEquals(esperado, actual);
    }

	@Test
	@DisplayName("Test Multiplicación Fallo")
	protected void testMultiplicacionFallo() {
		int esperado = 55;
		int actual = calculadora.multiplica(8, 2);
        assumingThat(esperado != actual,
                () -> System.out.println("Test Multiplicación Fallo"));
        System.out.println("El resultado esperado de la Multiplicación es: " + esperado);
        System.out.println("El resultado actual de la Multiplicación es: " + actual);
        assertEquals(esperado, actual);
    }

	@Test
	@DisplayName("Test División Fallo")
	protected void testDivisionFallo() {
		int esperado = 55;
		int actual = calculadora.divide(8, 2);
        assumingThat(esperado != actual,
                () -> System.out.println("Test División Fallo"));
        System.out.println("El resultado esperado de la División es: " + esperado);
        System.out.println("El resultado actual de la División es: " + actual);
        assertEquals(esperado, actual);
    }
	
	@BeforeAll
	protected static void comienzoOperaciones() {
		System.out.println("COMIENZO DE LAS OPERACIONES");
	}
	
	@AfterAll
	protected static void finOperaciones() {
		System.out.println("FIN DE LAS OPERACIONES");
	}
	
	@BeforeEach
	protected void separadorSuperior() {
		System.out.println("----------------------------");
	}
	
	@AfterEach
	protected void seperadorInferior() {
		System.out.println("==================");
	}

	@ParameterizedTest
	@DisplayName("Test Divisible Por 11")
	@ValueSource(ints = {33, 68, 127})
	protected void testDivisiblePor11(int num) {
		System.out.print("El número "+num);
		assumingThat(num%11==0,
				() -> System.out.print(" SI"));
		assumingThat(num%11!=0,
				() -> System.out.print(" NO"));
		System.out.println(" es divisible por 11.");
	}

	@RepeatedTest(10)
	@DisplayName("Tabla de multiplicar del 5")
	protected void testTablaMultplicarDel5(RepetitionInfo ri) {
		System.out.println("5x"+ri.getCurrentRepetition()+"="+calculadora.multiplica(5, ri.getCurrentRepetition()));
	}

}
