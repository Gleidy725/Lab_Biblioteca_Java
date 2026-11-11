public class Main {
    public static void main(String[] args) {

        //Creación libros y revistas
        Libro libro1= new Libro("C15","Cocina conmigo",2000,false,"Papitas","F12T5");
        Revista revista1= new Revista("N13","El tiempo: Deportes",1995,true,15,"Noticias");
        System.out.println(libro1.mostrarInfo());
        System.out.println(revista1.mostrarInfo());


        SistemaBiblioteca sistema = new SistemaBiblioteca();

        //Registro de materiales
        sistema.registrarMaterial(libro1);
        sistema.registrarMaterial(revista1);
        sistema.mostrarCatalogo();

        //Control lista de espera
        sistema.agregarEspera("C15", "Karen");
        sistema.agregarEspera("C15", "Alejandro");
        sistema.agregarEspera("N13", "Alejandro");
        sistema.agregarEspera("N13", "Karen ");

        System.out.println("Siguiente en C15: "+ sistema.siguienteEnEspera("C15"));
        System.out.println("Siguiente en N13: "+ sistema.siguienteEnEspera("N13"));


        //Control membresías
        System.out.println("Se registó el usuario?:"+sistema.registrarMiembro("Leidy"));
        System.out.println("Se registó el usuario?:"+sistema.registrarMiembro("Johanna"));
        System.out.println("Se registó el usuario?:"+sistema.registrarMiembro("Sandra"));

        System.out.println("Tiene membresia:"+sistema.tieneMembresia("Leidy"));
        System.out.println("Tiene membresia:"+sistema.tieneMembresia("Sandra"));
        System.out.println("Tiene membresia:"+sistema.tieneMembresia("Sara"));
    }
}
