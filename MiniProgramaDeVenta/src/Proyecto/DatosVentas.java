
package Proyecto;

public class DatosVentas {
    
    public String cedula;
    public String nombre;
    public int edad;
    public int Area;//posicion
    public String Estudiante;
    public double dscto;
    public double total;
    
    public DatosVentas( String b_cedula, String b_nombre, int b_edad,int b_area, String b_estudio,
                                  double b_dscto, double b_total )
    {
       cedula=b_cedula;
       nombre=b_nombre;
       edad=b_edad;
       Area =b_area;
       Estudiante=b_estudio;
       dscto=b_dscto;
       total=b_total;
    }        
            
    
}
