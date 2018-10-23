import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Ignore;
import org.junit.runner.RunWith;

public class RunCucumberTest {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/resourses/finder.feature"},
            glue = {"src/test/java/StepDefinitions"})
    public class RunCukesTest {
    }
}
