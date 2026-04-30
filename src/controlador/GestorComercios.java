package controlador;

import modelo.Comercio;
import modelo.TiendaFisica;
import modelo.TiendaOnline;
import modelo.TipoComercio;

import java.util.List;
import java.util.ArrayList;

public class GestorComercios {
    // al ser privada, da igual declararlo como Collection o como lista, pero al ser visible para otros, es preferible dejar que vean que es una collection a una Lista o ArrayList
    // cuanto más generico es preferible que algo sea percibido, más primigenio el tipo de dato
    private List<Comercio> comercios;

    public GestorComercios(){
        comercios = new ArrayList<>();
    }

//    añadirComercio(modelo.Comercio c)
    public boolean aniadirComercio(Comercio c){
        boolean resultado = false;
        if(!comercios.contains(c)){
            resultado = true;
            comercios.add(c);
        }
        return resultado;
    }


//    buscarPorId(String id)
    public Comercio buscarComercioPorId(String id){
        Comercio resultado = null;
        Comercio resultadoTemporal;
        int posicionComprobacion = 0;
        int maximo;

        maximo = comercios.size();

        while (maximo > 0 && posicionComprobacion < maximo && resultado == null){
            resultadoTemporal = comercios.get(posicionComprobacion);
            if (resultadoTemporal.getId().equalsIgnoreCase(id)){
                resultado = resultadoTemporal;
            }
            posicionComprobacion++;
        }
        return resultado;
    }

//    buscarPorNombre(String nombre) // coincidencia exacta
    public Comercio buscarComercioPorNombre(String nombre){
    Comercio resultado = null;
    Comercio resultadoTemporal;
    int posicionComprobacion = 0;
    int maximo;

    maximo = comercios.size();

    while (maximo > 0 && posicionComprobacion < maximo && resultado == null){
        resultadoTemporal = comercios.get(posicionComprobacion);
        if (resultadoTemporal.getId().equalsIgnoreCase(nombre)){
            resultado = resultadoTemporal;
        }
        posicionComprobacion++;
    }
    return resultado;
}

//    buscarPorTipoComercio(modelo.TipoComercio tipo)
    public ArrayList<Comercio> buscarPorTipoComercio(TipoComercio tipoComercio){
        ArrayList<Comercio> resultado;

        resultado = new ArrayList<>();
        for (Comercio c : comercios){
            if (c.getTipoComercio() ==  tipoComercio){
                resultado.add(c);
            }
        }
        return resultado;
    }

//    eliminarPorId(String id)
    public boolean eliminarPorId(String id){
        Comercio c;
        boolean resultado = false;

        c = buscarComercioPorId(id);
        if (c != null){
            comercios.remove(c);
            resultado = true;
        }
        return resultado;
    }

//    modificarCiudad(String id, String nuevaCiudad)
    public boolean modificarCiudad(String id, String nuevaCiudad){
        Comercio c;
        boolean resultado = false;

        c =  buscarComercioPorId(id);
        if (c != null){
            c.setCiudad(nuevaCiudad);
            resultado = true;
        }

        return resultado;
    }

//    imprimirTodos()
    public String imprimirTodos(){
        StringBuilder sb = new StringBuilder();
        for (Comercio c : comercios){
            sb.append(c.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

//    imprimirPorTipoComercio(modelo.TipoComercio tipo)
    public String imprimirPorTipoDeComercio(TipoComercio tipo){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Comercios tipo %s: \n", tipo));
        for (Comercio c : comercios){
            if (c.getTipoComercio() == tipo){
                sb.append("\t");
                sb.append(c.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String listarComercios(){
        StringBuilder sb = new StringBuilder();
        sb.append("Comercios: \n");
        for (Comercio c : comercios){
            sb.append("\t");
            sb.append(c.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

// imprimir potTIpoComercio
    public String listarTiendasFisicas(){
        StringBuilder sb = new StringBuilder();
        sb.append("Comercios físicos %s: \n");
        for (Comercio c : comercios){
            if (c instanceof TiendaFisica){
                sb.append("\t");
                sb.append(c.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String listarTiendasOnline(){
        StringBuilder sb = new StringBuilder();
        sb.append("Comercios online %s: \n");
        for (Comercio c : comercios){
            if (c instanceof TiendaOnline){
                sb.append("\t");
                sb.append(c.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String[] listarTiendasPorTipo(){
        String[] lista = new String[2];
        // posicion 0, Tienda Fisica posicion 1 tienda online
        int pFisica = 0;
        int pOnline = 1;
        StringBuilder sbF = new StringBuilder();
        StringBuilder sbO = new StringBuilder();


        for (Comercio c : comercios){
            if (c instanceof TiendaFisica){
                sbF.append(c.toString());
            } else if (c instanceof TiendaOnline){
                sbO.append(c.toString());
            }
        }

        lista[pFisica] += sbF.toString();
        lista[pOnline] += sbF.toString();
        return lista;
    }

}
