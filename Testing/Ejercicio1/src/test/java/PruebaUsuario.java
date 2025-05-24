import org.example.Usuario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaUsuario {
    static Usuario usuario;

    @BeforeAll
    static void antesDeTodo() {
        System.out.println("Inicializando");
        usuario = new Usuario();
    }

    @AfterAll
    static void despuesDeTodo() {
        System.out.println("Finalizando");
    }

    @Test
    @DisplayName("Debe establecer y obtener correctamente el nombre")
    void testNombre() {
        usuario.establecerNombre("Momo");
        assertEquals("Momo", usuario.obtenerNombre("Momo"));
    }

    @Test
    @DisplayName("Debe establecer y obtener correctamente la edad")
    void testEdadValida() {
        usuario.establecerEdad(25);
        assertEquals(25, usuario.obtenerEdad(25));
    }

    @Test
    @DisplayName("Debe lanzar excepcion al asignar edad negativa")
    void testEdadNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            usuario.establecerEdad(-5);
        });
        assertEquals("La edad no puede ser negativa", exception.getMessage());
    }
}
