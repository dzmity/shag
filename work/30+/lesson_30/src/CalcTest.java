

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalcTest {

    @BeforeEach
    void setUp() {
        System.out.println("Перед каждым тестом");
    }


    @AfterEach
    void teardown() {
        System.out.println("После каждого");
    }


    @BeforeAll
    static void beforeAll() {
        System.out.println("Перед тестовым классам");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("После класса");
    }

    @Test
    @Order(1)
    void tesSum() {
        int a = 5;
        int b = 7;

        int result = Calc.sum(a, b);

        assertEquals(12, result);
        System.out.println(1);
    }

    @Test
    @Order(3)
    void sum2() {
        int a = 6;
        int b = 7;

        int result = Calc.sum(a, b);

        assertEquals(13, result);
        System.out.println(2);
    }


    @Order(2)
    @Test
    void divide() {
        int a = 5;
        int b = 2;

        int result = Calc.divide(a, b);

        assertEquals(2, result);
    }

    @Order(4)
    @Test
    void divideByZero() {
        int a = 5;
        int b = 0;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Calc.divide(a, b));
        assertEquals("Нельзя делить на 0", exception.getMessage());
    }
}
