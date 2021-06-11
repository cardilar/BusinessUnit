#Author: cardilar@choucairtesting.com or cardilar1234@gmail.com

@tag
Feature: Agendar Reunion con Unidad de Negocio

  @tag2
  Scenario Outline: Agendar Reunion
    Given ingresar a la pagina con "<usuario>" y "<clave>"
    When ir a la opcion de Business Unit 
    And crear una unidad de negocio "<nombre>"
    And ir a la opcion de reuniones
    And Diligenciar el formulario de reuniones "<nombreReunion>" "<telefono>" "<tipoReunion>"
    And Diligenciar datos de localizacion "<locacion>" "<direccion>"
    And Diligenciar datos de Organizacion "<Titulo>" "<Nombre>" "<Apellido>" "<correo>" "<dominio>"
    Then validar la creacion de la reunion "<Reunion>" 

    Examples: 
    | usuario  | clave | nombre  | nombreReunion  |telefono |tipoReunion | locacion|direccion | Titulo| Nombre|Apellido | correo| dominio|Reunion|
    |admin| serenity |Castropol5| Laboral |31232312 |Ordinaria | Mi casa|calle 100 Cra 2 | General| Lucas|Polo |micasa| hotmail.com|Laboral|
