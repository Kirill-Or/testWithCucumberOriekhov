import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuildTest   {

    private BaseTest baseTest;
    BuildPCPageObject buildPCPageObject=new BuildPCPageObject(baseTest.getDriver());



    @Given("PC assembly with default hardware settings")
    public void pcAssemblyWithDefaultHardwareSettings() {


        baseTest.getDriver().get("https://demo.nopcommerce.com/build-your-own-computer");
    }

    @When("user is trying to build her own assembly")
    public void userIsTryingToBuildHerOwnAssembly() {
buildPCPageObject.choiceProcessor("2");
buildPCPageObject.choiceRAM("5");
buildPCPageObject.choiceHDD();
buildPCPageObject.choiceOS();
buildPCPageObject.addToCart();
buildPCPageObject.goToCart();
buildPCPageObject.isPCAdded("“HDD: 320 GB");
    }

    @Then("user can add her build to cart")
    public void userCanAddHerBuildToCart() {
    }
}
