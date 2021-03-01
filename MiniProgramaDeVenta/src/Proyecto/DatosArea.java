
package Proyecto;


public class DatosArea {
    
    public int codificacion;
    public String area;
    public double valor;
    
    public DatosArea(int p_codificacion, String p_area, double p_valor)
    {
       codificacion = p_codificacion;
       area = p_area;
       valor = p_valor;
    }
    
    public String toString()
    {
      if (codificacion==0)
            return "Seleccione...";
        else
        return area+" $ "+valor;
    }        
    
}
