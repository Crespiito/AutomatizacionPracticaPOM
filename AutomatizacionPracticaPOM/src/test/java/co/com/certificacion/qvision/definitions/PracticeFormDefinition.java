package co.com.certificacion.qvision.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class PracticeFormDefinition {

    @Dado("que ingreso al modulo de practice form")
    public void queIngresoAlModuloDePracticeForm() {
        System.out.println("entro al dado");
    }

    @Cuando("Envio el Formulario vacio")
    public void envioElFormularioVacio() {
        System.out.println("entro al cuando");
    }
    @Entonces("Valido los campos obligatorios")
    public void validoLosCamposObligatorios() {
        System.out.println("entro al entonces");
    }

}
