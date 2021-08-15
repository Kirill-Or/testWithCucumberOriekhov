import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuildTest {


    BuildPCPageObject buildPCPageObject=new BuildPCPageObject(BaseTest.getDriver());
    @Given("PC assembly with default hardware settings")
    public void pcAssemblyWithDefaultHardwareSettings() {


        BaseTest.getDriver().get("https://demo.nopcommerce.com/build-your-own-computer");
    }

    @When("user is trying to build her own assembly")
    public void userIsTryingToBuildHerOwnAssembly() {
buildPCPageObject.choiceProcessor("2");
buildPCPageObject.choiceRAM("5");
buildPCPageObject.choiceHDD();
buildPCPageObject.choiceOS();
buildPCPageObject.addToCart();
buildPCPageObject.goToCart();
buildPCPageObject.isPCAdded();    }

    @Then("user can add her build to cart")
    public void userCanAddHerBuildToCart() {
    }
}
