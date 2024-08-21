package com.bancolombia.co.steps.login;

import com.bancolombia.co.pages.login.CalcularPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class CalcularSteps extends CalcularPage {


    @Step("ingresar al modulo negocio")
    public void ingresaModulo() {
        btnNegocio.click();

    }

    @Step("ingresa al modulo soluciones no financieras")
    public void ingresaModulosoluciones() {
        btn_soluciones_no_financieras.click();
    }

    @Step("click en la opcion de herramientas")
    public void clickherramientas() {
        btn_herramientas.click();
    }

    @Step("click en el boton perfil")
    public void clickmas() {
        btn_mas.click();
    }

    @Step("click en la opcion gestionar finanzas")
    public void clickGestionarFinanzas() {
        btn_gestionar_finanzas.click();
    }

    @Step("click en la opcion calcular tasa")
    public void clickCalcularTasa() {
        Actions actions = new Actions(getDriver());
        actions.scrollToElement(btn_convertidor_tasa);
        btn_convertidor_tasa.click();
    }

    @Step("ingresar informacion")
    public void diligenciarFormulario() {
        Actions actions = new Actions(getDriver());
        actions.scrollToElement(texto);
        txt_interes.sendKeys("15");
        btn_periodicidad.click();
        opc_periodicidad.click();
        btn_capitalizacion.click();
        opc_capitalizacion.click();
    }
}
