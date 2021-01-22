package ejercicioIntegrador2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        DecimalFormat dec = new DecimalFormat("#.000");

        //creacion de opcionalidades
        Opcional techoCorredizo = new Opcional("Techo corredizo", 12.000);
        Opcional aireAcondicionado = new Opcional("Aire acondicionado", 20.000);
        Opcional sistemasDeFrenosAbs = new Opcional("Sistemas de frenos ABS", 14.000);
        Opcional airbag = new Opcional("Airbag",  7.000);
        Opcional llantasDeAleación = new Opcional("Llantas de aleación",  12.000);

        //creacion de variante sin opcionalidad
        Variante basicoFamiliar = new Variante("Básico familiar", 245.000);
        Variante basicoSedan = new Variante("Básico sedán", 230.000);
        Variante basicoCoupe = new Variante("Básico coupé", 270.000);

        //agregamos opcionalidades
        basicoSedan.agregarOpcional(aireAcondicionado);
        basicoSedan.agregarOpcional(airbag);

        basicoCoupe.agregarOpcional(llantasDeAleación);
        basicoCoupe.agregarOpcional(sistemasDeFrenosAbs);
        basicoCoupe.agregarOpcional(techoCorredizo);

        //creacion de calculo
        Calculo calculo1 = new Calculo(basicoSedan);
        Calculo calculo2 = new Calculo(basicoFamiliar);
        Calculo calculo3 = new Calculo(basicoCoupe);

        //creacion lista de calculos
        List<Calculo> listaCalculos = new ArrayList<>();

        //agregarCalculos a la lista
        listaCalculos.add(calculo1);
        listaCalculos.add(calculo2);
        listaCalculos.add(calculo3);

        //mostrar total
        for (Calculo calculo: listaCalculos) {
            System.out.println("--------------°--------------" );
            Variante variante = calculo.getVariante();
            List<Opcional> opcionalidades = variante.getOpcionales();

            System.out.println("Este auto es de variante: " + variante.getVarianteNombre() + ". De un precio basico de: $" + dec.format(variante.getPrecioVentaBasico()));
            if(variante.devolverCantidadOpcionalidades()>0){
                System.out.println("Tiene " + variante.devolverCantidadOpcionalidades() + " opcionalidades:");

                int i = 0;
                for (Opcional opcional:opcionalidades) {
                    i++;
                    System.out.println( i + ") " + opcional.getDescripcion() + ": $" + dec.format(opcional.getPrecio()) );
                }
            }else {
                System.out.println("Tiene 0 opcionalidades.");
            }
            System.out.println("El precio TOTAL es de: $" + dec.format(calculo.devolverCostoTotal()) );

        }
    }
}
