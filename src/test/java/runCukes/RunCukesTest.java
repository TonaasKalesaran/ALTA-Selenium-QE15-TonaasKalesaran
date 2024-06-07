package runCukes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {
                "hooks",
                "step_definitions"
        },
        features = {"classpath:features/"},      //features = {"classpath:features/"},
        plugin = {"pretty",
                "html:target/site/cucumber-pretty.html",
                "json:target/cucumber/cucumber.json"
        },
        tags  = "@tugasFull"
        //tags = "@regression or @smoketest", untuk tes certain fitur aja, dipakai di features(contoh di login.feature)
)
public class RunCukesTest {
}
