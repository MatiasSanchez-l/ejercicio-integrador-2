package ejercicioIntegrador2;

import java.util.List;

public class Calculo {
    private Variante variante;

    public Calculo(Variante variante) {
        this.variante = variante;
    }

    public Double devolverCostoTotal(){
        Double costoTotal = variante.getPrecioVentaBasico();
        List<Opcional> opcionales = variante.getOpcionales();
        if(variante.devolverCantidadOpcionalidades() > 0){
            for (Opcional opcional:opcionales) {
                costoTotal += opcional.getPrecio();
            }
        }

        return costoTotal;
    }

    public Variante getVariante() {
        return variante;
    }

    public void setVariante(Variante variante) {
        this.variante = variante;
    }
}
