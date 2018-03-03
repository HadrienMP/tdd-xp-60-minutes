package fr.hadrienmp.tdd.xp._60.minutes;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest {
    @Test
    public void le_nombre_est_pair() {
        GenerateurNombre generateurNombre = new GenerateurNombre();
        int nombre = generateurNombre.nombre();
        assertThat(nombre % 2).isEqualTo(0);
    }
}
