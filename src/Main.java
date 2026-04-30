import controlador.GestorComercios;

import modelo.*;

public class Main {
    public static void main(String[] args){
        // Instanciar GestorComercios
        GestorComercios gestorComercios = new GestorComercios();

        // Instanciar varias TiendaFisica
        Comercio game = new TiendaFisica("1","Game","Navalcarnero",TipoComercio.ELECTRONICA,5000);
        Comercio mercadona = new TiendaFisica("2","Mercadona","Valencia",TipoComercio.ALIMENTACION,500000);
        Comercio fruteria = new TiendaFisica("3","Fruteria de Pepe","Madrid",TipoComercio.ALIMENTACION,10);

        // Instanciar varias TiendaOnline
        Comercio elCorteIngles = new TiendaOnline("4","El Corte Inglés","Madrid",TipoComercio.ELECTRONICA,true);
        Comercio uax = new TiendaOnline("5","Universidad Alfonso X El Sabio","Villanueva de la Cañada",TipoComercio.SERVICIOS,false);
        Comercio peluqueria = new TiendaOnline("6","La peluqueria de Paqui","Navalcarnero",TipoComercio.ALIMENTACION,true);

        // Añadir Comercios
        gestorComercios.aniadirComercio(game);
        gestorComercios.aniadirComercio(mercadona);
        gestorComercios.aniadirComercio(fruteria);

        gestorComercios.aniadirComercio(peluqueria);
        gestorComercios.aniadirComercio(uax);
        gestorComercios.aniadirComercio(uax);


        // Listar todos los comercios
        System.out.println("Listar todos los tipos de comercio");
        System.out.println(gestorComercios.listarComercios());

        // Listar por TipoComercio
        System.out.println("Listar por tipo de comercio");
        System.out.println(gestorComercios.listarTiendasPorTipo());

        // Buscar por ID
        System.out.println("Buscar por id");
        System.out.println(gestorComercios.buscarComercioPorId(uax.getId()));
        System.out.println(gestorComercios.buscarComercioPorId(elCorteIngles.getId()));


        // Buscar por nombre
        System.out.println("Buscar por nombre");
        System.out.println(gestorComercios.buscarComercioPorNombre(uax.getNombre()));
        System.out.println(gestorComercios.buscarComercioPorNombre(elCorteIngles.getNombre()));


        // Buscar por TipoComercio
        System.out.println("Buscar por tipo comercio");

        System.out.println(gestorComercios.buscarPorTipoComercio(TipoComercio.ALIMENTACION));
        System.out.println(gestorComercios.buscarPorTipoComercio(TipoComercio.ELECTRONICA));


        // Modificar la ciudad de un comercio y buscarlo para mostrarlo
        System.out.println("Modificar ciudad y mostrarlo");
        System.out.println(gestorComercios.buscarComercioPorId(uax.getId()));
        uax.setCiudad("Chamberí");
        System.out.println(gestorComercios.buscarComercioPorId(uax.getId()));



    }
}
