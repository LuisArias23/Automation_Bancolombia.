package com.bancolombia.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CalcularPage extends PageObject {

    @FindBy(xpath = "(//ul/li)[2]")
    protected WebElementFacade btnNegocio;
    @FindBy(id = "menu-productos-finan")
    protected WebElementFacade btn_soluciones_no_financieras;
    @FindBy(xpath = "(//a[@href=\"/negocios/herramientas\"])[1]")
    protected WebElementFacade btn_herramientas;
    @FindBy(xpath = "(//button[@class=\"bc-fab-button bc-fab-button-mini\"])[1]")
    protected WebElementFacade btn_mas;
    @FindBy(xpath = "(//div[@class=\"swiper-slide tools-menu-item\"])[4]")
    protected WebElementFacade btn_gestionar_finanzas;
    @FindBy(xpath = "(//div[@class=\"bc-card bc-card-tools bc-direction-column bc-h-100\"])[5]")
    protected WebElementFacade btn_convertidor_tasa;
    @FindBy(xpath = "//h2[text()= \"De tasa nominal a efectiva\"]")
    protected WebElementFacade texto;
    @FindBy(id = "interes")
    protected WebElementFacade txt_interes;
    @FindBy(id = "periodicidad-deseada")
    protected WebElementFacade btn_periodicidad;
    @FindBy(xpath = "//select[@id=\"periodicidad-deseada\"]/option[text()=\"Semestral\"]")
    protected WebElementFacade opc_periodicidad;
    @FindBy(id = "capitalizacion")
    protected WebElementFacade btn_capitalizacion;
    @FindBy(xpath = "//select[@id=\"capitalizacion\"]/option[text()=\"Semestral\"]")
    protected WebElementFacade opc_capitalizacion;

}
