package modelo;

public abstract class Comercio {
    private final String ID;
    private String nombre;
    private String ciudad;
    private TipoComercio tipoComercio;

    public Comercio(String ID, String nombre, String ciudad, TipoComercio tipoComercio){
        this.ID = ID;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.tipoComercio = tipoComercio;
    }

    public String getId(){
        return ID;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCiudad(){
        return ciudad;
    }

    public TipoComercio getTipoComercio(){
        return tipoComercio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public void setTipoComercio(TipoComercio tipoComercio){
        this.tipoComercio = tipoComercio;
    }

    // un metodo es abstracto cuando no tiene cuerpo, solo firma
    public abstract double calcularCosteOperacion();

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("[%s] - %s Localidad: %s Tipo de comercio. %s",ID,nombre,ciudad,tipoComercio));

        return sb.toString();
    }
}
