package co.com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.ingjuanfg.utils.RestEnum.GET_LISTAR_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarUsuario implements Task {

    private int idUsuario;

    public ConsultarUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(GET_LISTAR_USUARIO.getUri())
                        .with(request -> request.pathParam("id", idUsuario))
        );
    }

    public static Performable conId(int idUsuario){
        return instrumented(ConsultarUsuario.class, idUsuario);
    }
}
