package org.sebas.pooexcepciones.ejemplo;

public class DivisionPorCeroException extends Exception{

    //NOCHEQUET -> Si extendemos de RuntimeException no nos obligados a propagar el error
    //SICHEQUET -> Pero si extendemos de Exception si nos toca progralara
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}
