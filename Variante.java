package ejercicioIntegrador2;

import java.util.ArrayList;
import java.util.List;

public class Variante {
    private String varianteNombre;
    private Double precioVentaBasico;
    private List<Opcional> opcionales;

    public Variante(String varianteNombre, Double precioVentaBasico) {
        this.varianteNombre = varianteNombre;
        this.precioVentaBasico = precioVentaBasico;
        this.opcionales = new ArrayList<>();
    }

    public void agregarOpcional(Opcional opcional){
        if(!opcionales.contains(opcional)){
            opcionales.add(opcional);
        }else {
            System.out.println("El opcional que quiere agregar al modelo ya existe");
        }
    }

    public int devolverCantidadOpcionalidades(){
        int resultado =opcionales.size();
        return resultado;
    }

    public String getVarianteNombre() {
        return varianteNombre;
    }

    public void setVarianteNombre(String varianteNombre) {
        this.varianteNombre = varianteNombre;
    }

    public Double getPrecioVentaBasico() {
        return precioVentaBasico;
    }

    public void setPrecioVentaBasico(Double precioVentaBasico) {
        this.precioVentaBasico = precioVentaBasico;
    }

    public List<Opcional> getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(List<Opcional> opcionales) {
        this.opcionales = opcionales;
    }
}
