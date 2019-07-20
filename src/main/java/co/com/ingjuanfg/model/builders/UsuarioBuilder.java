package co.com.ingjuanfg.model.builders;

import co.com.ingjuanfg.model.Usuario;
import co.com.ingjuanfg.utils.Builder;

import java.util.List;
import java.util.Map;

public class UsuarioBuilder implements Builder<Usuario> {

    private String cedula;
    private String name;
    private String job;

    private UsuarioBuilder(List<Map<String,String>> datosUsuario){
        this.name =datosUsuario.get(0).get("name");
        this.job =datosUsuario.get(0).get("job");
    }

    public static UsuarioBuilder usuario(List<Map<String,String>> datosUsuario){
        return new UsuarioBuilder(datosUsuario);
    }

    public String getCedula() {
        return cedula;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public Usuario build() {
        return new Usuario(this);
    }
}
