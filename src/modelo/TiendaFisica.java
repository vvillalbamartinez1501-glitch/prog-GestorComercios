package modelo;

public class TiendaFisica extends Comercio {

    private int numeroEmpleados;
    public final int COSTE_BASE = 1000;
    public final int COSTE_SI_EMP_5 = 200;


    public TiendaFisica(String ID, String nombre, String ciudad, TipoComercio tipoComercio, int numeroEmpleados){
        super(ID,nombre,ciudad,tipoComercio);
        this.numeroEmpleados = numeroEmpleados;
    }

    public int getNumeroEmpleados(){
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados){
        this.numeroEmpleados = numeroEmpleados;
    }

    // Base: 1000
    @Override
    public double calcularCosteOperacion(){
        double costeFinal;

        // numeroEmpleados > 5 ? costeFinal = COSTE_BASE + COSTE_SI_EMP_5 : costeFinal = COSTE_BASE;
        // variable valor de: condicion ? si verdadero :  si falso
        costeFinal = numeroEmpleados > 5 ? COSTE_BASE + COSTE_SI_EMP_5 : COSTE_BASE;

        /*
        costeFinal = COSTE_BASE;
        if (numeroEMpleados > 5 ){
            costeFinal += COSTE_SI_EMP_5
        }
         */

        return costeFinal;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\tTienda Física");
        sb.append(String.format("\tNumero de empleados: %d",numeroEmpleados));
        sb.append(String.format("Precio final: %.2f",calcularCosteOperacion()));
        return sb.toString();
    }
}
