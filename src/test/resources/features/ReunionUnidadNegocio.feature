#Author: cardilar@choucairtesting.com or cardilar1234@gmail.com

@tag
Feature: Agendar Reunion con Unidad de Negocio

  @tag2
  Scenario Outline: Agendar Reunion
    Given ingresar a la pagina con "<usuario>" y "<clave>"
    When ir a la opcion de Business Unit 
    And crear una unidad de negocio "<nombre>" y "<Unidad>"
    And ir a la opcion de reuniones
    And Diligenciar el formulario de reuniones
    Then validar la creacion de la reunion  

    Examples: 
    | usuario  | clave | nombre  | Unidad  |
    |admin| serenity | hola| dos|
