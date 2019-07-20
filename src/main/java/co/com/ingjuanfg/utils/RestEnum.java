package co.com.ingjuanfg.utils;

public enum RestEnum {

    BASE_URL("https://reqres.in/api"),
    CREAR_USUARIO("/users"),
    GET_LISTAR_USUARIO("/users");

    private String uri;

    RestEnum(String uri) {
        this.uri = uri;
    }

    public String getUri(){
        return uri;
    }
}
