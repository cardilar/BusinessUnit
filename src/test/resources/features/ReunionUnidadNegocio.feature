#Author: cardilar@choucairtesting.com or cardilar1234@gmail.com
#los valores de UnidadNegocio y Reunion deben ser igual a nombeUnidad y nombreReunion, respectivamente

@tag
Feature: Agendar Reunion con Unidad de Negocio

  @tag2
  Scenario Outline: Agendar Reunion
    Given ingresar a la pagina con "<usuario>" y "<clave>"
    When ir a la opcion de Business Unit 
    And crear una unidad de negocio "<nombreUnidad>"
    And ir a la opcion de reuniones
    And Diligenciar el formulario de reuniones "<nombreReunion>" "<telefono>" "<tipoReunion>"
    And Diligenciar datos de localizacion "<locacion>" "<direccion>"
    And Diligenciar datos de Organizacion "<Titulo>" "<Nombre>" "<Apellido>" "<correo>" "<dominio>" "<UnidadNegocio>"
    Then validar la creacion de la reunion "<Reunion>" 

    Examples: 
    |usuario| clave    | nombreUnidad  |nombreReunion|telefono |tipoReunion|locacion|direccion  |Titulo |Nombre|Apellido|correo     | dominio    |UnidadNegocio|Reunion|
    | admin | serenity |NewYork       | Externa     |31232312 |Ordinaria  | Mi casa|St 100 Av 2|General|Karina|Palacio   |correprueba| hotmail.com|NewYork     |Externa|