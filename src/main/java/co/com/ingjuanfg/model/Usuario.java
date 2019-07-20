package co.com.ingjuanfg.model;

import co.com.ingjuanfg.model.builders.UsuarioBuilder;

public class Usuario {

    private String cedula;
    private String name;
    private String job;

    public Usuario(UsuarioBuilder usuarioBuilder) {
        this.name = usuarioBuilder.getName();
        this.job = usuarioBuilder.getJob();
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

}
