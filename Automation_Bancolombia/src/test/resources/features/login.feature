@Suite @Login
Feature: CP01 - Validar la conversion  de tasas

  Background:  Validar la conversion  de tasas

    Given el usuario navega al sitio web

  @ValidCredential
  Scenario: 1 - Validar la conversion  de tasas
    And selecciona la opcion Convertidor de tasas de interés
    When ingresa la informacion en el formulario
    Then la aplicacion debe mostrar el el resultado de la tasa

