package scenarios;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class GitHubScenario {

    private Response response;

    @Quando("faco a chamada para pegar a ultima versao")
    public void faco_a_chamada_pegar_ultima_versao(){
        //Aqui se fossemos receber várias informações poderíamos mapear utilizando um ObjectMapper
        //Ref: https://www.james-willett.com/rest-assured-serialization-with-json-and-xml/
        response = RestAssured.when().get("/releases/last");
    }

    @Entao("devo receber a ultima versao publicada")
    public void devo_receber_ultima_versao_publicada(){
        response.then().body("release", Matchers.equalTo("Micronaut 1.0.0"));
        response.then().statusCode(200);
    }
}
