
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{

    private static final int PRIMERAS_APELLIDO_PARA_NOMBRE = 3;
    private static final int DESDE_APELLIDO_PARA_NOMBRE    = 0;
    private static final int PRIMERAS_NOMBRE_PARA_NOMBRE   = 3;
    private static final int DESDE_NOMBRE_PARA_NOMBRE      = 0;

    private static final int PRIMERAS_APELLIDO_PARA_APELLIDO = 2;
    private static final int DESDE_APELLIDO_PARA_APELLIDO    = 0;
    private static final int PRIMERAS_CIUDAD_PARA_APELLIDO   = 3;
    private static final int DESDE_CIUDAD_PARA_APELLIDO      = 0;
    /**
     * genera un nombre y apellido a partir del nombre primer apeliido y ciudad de naciemiento deuna persona
     * @param nombre nombre de la persona
     * @param apellido1 primer apelllido de la persona
     * @param ciudad ciudad de nacimiento
     * @return nombre generado segun george lucas
     */

    public String generateStarWarsName(String nombre, String apellido1, String ciudad){

        return  nombre.substring(DESDE_APELLIDO_PARA_NOMBRE,PRIMERAS_APELLIDO_PARA_NOMBRE) + 
        apellido1.substring(DESDE_NOMBRE_PARA_NOMBRE,PRIMERAS_NOMBRE_PARA_NOMBRE)  + " " +
        apellido1.substring(DESDE_APELLIDO_PARA_APELLIDO,PRIMERAS_APELLIDO_PARA_APELLIDO)+ 
        ciudad.substring(DESDE_CIUDAD_PARA_APELLIDO,PRIMERAS_CIUDAD_PARA_APELLIDO);
    }

}
