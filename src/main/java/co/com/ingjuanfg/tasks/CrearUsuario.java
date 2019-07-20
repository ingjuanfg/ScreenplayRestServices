package co.com.ingjuanfg.tasks;

import co.com.ingjuanfg.model.Usuario;
import co.com.ingjuanfg.model.builders.UsuarioBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.ingjuanfg.utils.RestEnum.CREAR_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {

    private final Usuario usuario;

    public CrearUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(CREAR_USUARIO.getUri())
                        .with(request -> request.header("Content-Type", "application/json")
                                .body(usuario)
                        )
        );
    }

    public static Performable conDatos(UsuarioBuilder usuario) {
        return instrumented(CrearUsuario.class, usuario.build());
    }
}
