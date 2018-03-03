package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest {

    private final GenerateurNombre generateurNombre = new GenerateurNombre();

    @Test
    public void le_nombre_est_pair() {
        int nombre = generateurNombre.nombre();
        assertThat(nombre % 2).isEqualTo(0);
    }
    @Test
    public void le_nombre_se_termine_par_2() {
        int nombre = generateurNombre.nombre();
        assertThat(nombre % 10).isEqualTo(2);

    }
    @Test
    public void le_nombre_est_superrieur_a_9() {
        int nombre = generateurNombre.nombre();
        assertThat(nombre ).isGreaterThan(9);

    }
}
