package com.bancolombia.co.definitions;

import com.bancolombia.co.steps.login.CalcularSteps;
import com.bancolombia.co.utilities.websites.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CaldularTasaDef {
    @Steps(shared = true)
    WebSite url;
    @Steps(shared = true)
    CalcularSteps calcularTasa;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://www.bancolombia.com/personas");
    }

    @And("selecciona la opcion Convertidor de tasas de interés")
    public void ingresaModuloconvertifor() {
        calcularTasa.ingresaModulo();
        calcularTasa.ingresaModulosoluciones();
        calcularTasa.clickherramientas();
        calcularTasa.clickmas();
        calcularTasa.clickGestionarFinanzas();
        calcularTasa.clickCalcularTasa();
    }

    @When("ingresa la informacion en el formulario")
    public void diligenciarFormulario() {
        calcularTasa.diligenciarFormulario();
    }

    @Then("la aplicacion debe mostrar el el resultado de la tasa")
    public void visualizarResultado() {

    }


}