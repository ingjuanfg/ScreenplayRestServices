package co.com.ingjuanfg.stepdefinitions;

import co.com.ingjuanfg.questions.CreacionUsuario;
import co.com.ingjuanfg.tasks.ConsultarUsuario;
import co.com.ingjuanfg.tasks.CrearUsuario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static co.com.ingjuanfg.model.builders.UsuarioBuilder.usuario;
import static co.com.ingjuanfg.utils.RestEnum.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RestStepDefinition {

    private Actor JUAN = Actor.named("Juan");

    @Before
    public void prepararElEscenario(){
        JUAN.whoCan(CallAnApi.at(BASE_URL.getUri()));
    }

    @Cuando("^Juan realiza la creacion de un usuario$")
    public void juanRealizaCreacionUsuario(List<Map<String,String>> datosUsuario) {
        JUAN.attemptsTo(
                CrearUsuario.conDatos(usuario(datosUsuario))
        );
    }

    @Cuando("^Juan realiza la consulta del usuario # (.*)$")
    public void juanRealizaCreacionUsuario(int numeroUsuario) {
        JUAN.attemptsTo(
                ConsultarUsuario.conId(numeroUsuario)
        );
    }

    @Entonces("^el deberia de ver el usuario creado con exito$")
    public void deberiaVerUsuarioCreadoExito() {
        JUAN.should(seeThat(CreacionUsuario.exitoso())
        );
    }

    @Entonces("^el deberia de recibir una respuesta de exito$")
    public void deberiaRecibirRespuestaDeExito() {

    }
}
