package visual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanelPrincipalTest {

    @Test
    void mostrarHabitat() {
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        assertDoesNotThrow(() -> panelPrincipal.mostrarHabitat("PanelSabana"));
        assertDoesNotThrow(() -> panelPrincipal.mostrarHabitat("PanelAcuario"));
        assertDoesNotThrow(() -> panelPrincipal.mostrarHabitat("PanelSelva"));
        assertDoesNotThrow(() -> panelPrincipal.mostrarHabitat("PanelHumedal"));
        assertDoesNotThrow(() -> panelPrincipal.mostrarHabitat("PanelAviario"));
        assertDoesNotThrow(() -> panelPrincipal.mostrarHabitat("PanelBosque"));
    }

    @Test
    void mostrarVistaTodosHabitats() {
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        assertDoesNotThrow(panelPrincipal::mostrarVistaTodosHabitats);
    }
}
