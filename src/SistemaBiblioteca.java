import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class SistemaBiblioteca {
    Map<String, Material> catalogo = new HashMap<>();
    Map<String, ArrayList<String>> listaEspera = new HashMap<>();
    Set<String> miembros = new HashSet<>();

    public void agregarEspera(String codigoMaterial, String usuario) {
        if (!listaEspera.containsKey(codigoMaterial)) {
            listaEspera.put(codigoMaterial, new ArrayList<>());
        }

        listaEspera.get(codigoMaterial).add(usuario);
    }

    public String siguienteEnEspera(String codigoMaterial) {
        ArrayList<String> espera = listaEspera.get(codigoMaterial);

        if (espera == null || espera.isEmpty()) {
            return null;
        }

        return espera.remove(0);
    }

    public Material buscarMaterial(String codigo){
        return catalogo.get(codigo);
    }

    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
    }

    public void mostrarCatalogo(){
        for (Map.Entry<String, Material> entry : catalogo.entrySet()) {
            System.out.println(entry.getValue().mostrarInfo());
        }
    }

    public boolean registrarMiembro(String usuario) {
        return miembros.add(usuario);
    }

    public boolean tieneMembresia(String usuario) {
        return miembros.contains(usuario);
    }
}
