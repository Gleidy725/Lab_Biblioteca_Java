public abstract class Material  implements Catalogable{
    String codigo;
    String titulo;
    int anio;
    boolean disponible;

    public Material(String codigo,String titulo, int anio, boolean disponible) {
        this.codigo=codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract String getTipo();

    public String mostrarInfo(){
        String respuesta;
        String estado = disponible ? "disponible" : "prestado";
        respuesta="["+this.getTipo()+"] "+this.titulo+"("+this.anio+") - "+estado;
        return respuesta;
    }
}
