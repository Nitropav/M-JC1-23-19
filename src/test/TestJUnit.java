package test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("TestJUnit. Тестирование математики")
public class TestJUnit {

    @ParameterizedTest(name = "{index} -> a={0}, b={1}, result={2}")
    @DisplayName("Тесты сложения переменных")
    @CsvSource({
            "1, 2, 3",
            "3, 4, 7",
            "3, 4, 8"
    })
    public void plusTest(int a, int b, int result){
        Assertions.assertEquals(result, MyMath.plus(a, b));
    }

    @ParameterizedTest
    @DisplayName("Тесты сложения переменных")
    @CsvSource({
            "1, 2, 3",
            "3, 4, 7",
            "3, 4, 8"
    })
    public void plusTest(@CsvToIntArray Integer... args){
        for (Integer arg : args) {
            System.out.print(arg);
        }
    }



    @BeforeEach
    public void beforeEach(){
        System.out.println("Начинаю тест");
    }

//    @BeforeAll
    public void beforeAll(){
        System.out.println("Начинаю тесты");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Тест завершен");
    }

//    @AfterAll
    public void afterAll(){
        System.out.println("Все тесты завершены");
    }
}
