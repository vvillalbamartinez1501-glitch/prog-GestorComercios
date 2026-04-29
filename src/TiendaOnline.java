public class TiendaOnline extends Comercio{
    private boolean tieneEnvioInternacional;
    public final int COSTE_BASE = 500;
    public final int COSTE_SI_ENVIO_INTER = 150;

    public TiendaOnline(String ID, String nombre, String ciudad, TipoComercio tipoComercio, boolean tieneEnvioInternacional) {
        super(ID, nombre, ciudad, tipoComercio);
        this.tieneEnvioInternacional = tieneEnvioInternacional;
    }


    // Base: 500
    @Override
    public double calcularCosteOperacion(){
        double resultado = COSTE_BASE;
        if (tieneEnvioInternacional){
            resultado += COSTE_SI_ENVIO_INTER;
        }

        return resultado;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\tTienda Online");
        if (tieneEnvioInternacional){
            sb.append("\tTiene envío internacional");
        } else{
            sb.append("\tNo tiene envío internacional");
        }

        return sb.toString();
    }

}
