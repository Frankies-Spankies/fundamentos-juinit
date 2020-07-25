package franki.cursos;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Antes - Yo soy llamdo una vez!!!");

    }

    @BeforeEach
    void setUp() {
        System.out.println("Antes de cada uno....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }


    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld1("Franki"));

    }

    @AfterEach
    void tearDown() {
        System.out.println("Al final de cada uno....");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("Despues!!!! Yo soy llamdo una vez!!!");

    }

}