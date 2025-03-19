import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @DisplayName("Test 1 comprueba dni")
    @ParameterizedTest()
    @CsvSource({
            "00000000, T, true",
            "12345678, Z, true",
            "87654321, X, false",
            "11111111, H, false",
            "53213,2, false",
            "123, Z, false", // comprueba la longitud del string
            "1234567891, A, false", // comprueba la longitud del string
            "abcdefgh, A, false", // string con solo letras
            "1234abcd, B, false", // comprueba si el string tiene letras y numeros
            "        , C, false", // comprueba si el string esta vacio
            "1234@123, D, false" // comprueba si introduces caracteres especiales
    })
    void comprobarDNI(String dni, char letra, boolean expected) {
        assertEquals(expected, Main.comprobarDNI(dni, letra));
    }

    @DisplayName("Test 2 calcula letra dni")
    @ParameterizedTest(name = "Test calcularLetraDNI with dni={0}, expected={1}")
    @CsvSource({
            "00000000, T",
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "123, ''", // test para la longitud
            "12345678912, ' '", // test para la longitud
            "1231453, 1", // comprueba si el valor no es una letra
            "213as568, Y", // comprueba si el dni es una mezcla de numeros y letras
            " , Z", // test si el dni esta vacio
            "0001, R", //comprueba que aun que el resto concida el dni puede no ser valido
            "00000001, R", // comprobando todas las letras
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P",
            "00000009, D",
            "00000010, X",
            "00000011, B",
            "00000012, N",
            "00000013, J",
            "00000014, Z",
            "00000015, Q",
            "00000016, S",
            "00000017, V",
            "00000018, H",
            "00000019, L",
            "00000020, C",
            "00000021, K",
            "00000022, E"
    })
    void calcularLetraDNI(String dni, char expected) {
        assertEquals(expected, Main.calcularLetraDNI(dni));
    }
}