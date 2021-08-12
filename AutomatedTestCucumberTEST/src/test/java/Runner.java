import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = {"scenarios"},
        features = {"classpath:github.feature"})
public class Runner {
    public static void main(String[] args){
        io.cucumber.core.cli.Main.main(args);
    }
}
