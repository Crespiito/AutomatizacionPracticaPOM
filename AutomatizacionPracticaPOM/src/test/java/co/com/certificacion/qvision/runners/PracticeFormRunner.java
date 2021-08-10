package co.com.certificacion.qvision.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/feature/practice_form.feature"},
        glue = {"co.com.certificacion.qvision.definitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PracticeFormRunner {
}
