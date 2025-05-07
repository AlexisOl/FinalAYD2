package org.example;

import junit.framework.TestCase;


public class FinalExampleTest extends TestCase {

    // CONSTANTES
    //procesar data
    private static final String DATOS ="hola, saludos, bueno";

    // USUARIOS
    private static final String NOMBRE_USUARIO = "juan";
    private static final String EMAIL = "juan@gmail.com";
    private static final String TELEFONO = "12345678";
    private static final String DIRECCION = "Guatemala 123";
    private static final String CIUDAD = "Quetzaltenango";
    private static final String ZIP = "4321";


    private static final String MENSAJE_EXITO = "User created: ";
    private static final String MENSAJE_FALLIDO_NOMBRE = "Name cannot be empty";
    private static final String MENSAJE_FALLIDO_CORREO = "Invalid email";

    // ORDENES


    // REPORTES
    private static final String CUSTOMER= "Carlos";

    // AREAS
    private static final String SHAPE = "rectangle";
    private static final Double DIMENSION_1 = 3.0;
    private static final Double DIMENSION_2 =4.0;
    private static final Double DIMENSION_AREA =12.0;
    // test process data
    //--------------------------------------

    public void testProcessData() {
        FinalExample instance = new FinalExample();
        instance.processData(DATOS);
    }


    //--------------------------------------
    // para la creacion de usuarios
    // usuario correcto
    public void testUsuarioCorrecto(){
        FinalExample instanciaFinal = new FinalExample();
        String valor = instanciaFinal.createUser(
                NOMBRE_USUARIO, EMAIL, TELEFONO, DIRECCION, CIUDAD, ZIP
        );
        assertEquals(valor, MENSAJE_EXITO+NOMBRE_USUARIO);
    }
    // Escenarios donde deberia de fallar
    public void testNombreFaltante(){
        FinalExample instanciaFinal = new FinalExample();
        String valor = instanciaFinal.createUser(
                null, EMAIL, TELEFONO, DIRECCION, CIUDAD, ZIP
        );
        assertEquals(MENSAJE_FALLIDO_NOMBRE, valor);
    }

    public void testEmailFaltante(){
        FinalExample instanciaFinal = new FinalExample();
        String valor = instanciaFinal.createUser(
                NOMBRE_USUARIO, null, TELEFONO, DIRECCION, CIUDAD, ZIP
        );
        assertEquals(MENSAJE_FALLIDO_CORREO, valor);
    }


    //

    public void testReportGenerator() {}



    // AREAS
    // todo funciona
    public void testCalculateArea() {
        FinalExample instanciaFinal = new FinalExample();
        double areas = instanciaFinal.calculateArea(
                SHAPE,
                DIMENSION_1, DIMENSION_2
        );
        assertEquals(DIMENSION_AREA, areas);
    }

    // caso no venga la forma
    public void testCalculateSinForma() {
        FinalExample instanciaFinal = new FinalExample();
            double areas = instanciaFinal.calculateArea(
                    null,
                    DIMENSION_1, DIMENSION_2
            );
            assertSame(new NullPointerException(), areas);


    }
}