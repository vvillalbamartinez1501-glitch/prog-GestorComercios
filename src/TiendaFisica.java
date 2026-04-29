
public class TiendaFisica extends Comercio{

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
        int resultado = COSTE_BASE;
        if (numeroEmpleados > 5){
            resultado += COSTE_SI_EMP_5;
        }

        return resultado;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\tTienda Física");
        sb.append(String.format("\tNumero de empleados: %d",numeroEmpleados));
        return sb.toString();
    }
}
