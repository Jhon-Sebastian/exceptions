package org.sebas.pooexcepciones.ejemplo;

public class Calculadora {

    //Si usamos el throw new, nos obligan a propagar la exception al metodo con throws
    //Es una exception SiChequeada, por lo tanto nos va a mandar un error si no lo metemos dentro
    // de un try catch
    //throws -> puede lanzar muchas excepciones seguidos de ('coma')
    public double dividir(int numerador, int denominador) throws DivisionPorCeroException {
        if(denominador == 0){
            throw new DivisionPorCeroException("El denominador no puede ser 0");
        }
        return (double) numerador/denominador;
    }

    public double dividir(String numerador, String denominador)
            throws DivisionPorCeroException, FormatoNumeroException{
        try {
             int a = Integer.parseInt(numerador);
             int b = Integer.parseInt(denominador);
             return this.dividir(a,b);
        } catch (NumberFormatException e){
            throw new FormatoNumeroException("Formato invalido(2), debe ingresar solo numeros");
        }
    }
}
