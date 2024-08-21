package com.bancolombia.co.utilities.websites;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {
    @Steps(shared = true)
    PageObject bancolombia;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        bancolombia.setDefaultBaseUrl(url);
        bancolombia.open();
    }
}
