import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuildPCPageObject extends BasePage  {

private final By processorLocator = By.xpath("//select[@id='product_attribute_1']");
private final By ramLocator = By.xpath("//select[@id='product_attribute_2']");
    private final By hddLocator = By.xpath("//input[@id='product_attribute_3_6']");
    private final By osVistaHomeLocator = By.xpath("//input[@id='product_attribute_3_6']");
    private final By addToCartLocator = By.xpath("//button[normalize-space()='Add to cart']");
    private final By goToCart    = By.xpath("//span[@class='cart-label']");
    private final By isHDDDisplayed = By.xpath("By.xpath(//div[text()[contains(.,\"HDD: 320 GB\")]]");
    private final By isTwoGBRamAdded= By.xpath("By.xpath(//div[text()[contains(.,\"HDD: 320 GB\")]]");



    public BuildPCPageObject(WebDriver driver) {
        super(driver);
    }

    public void choiceProcessor(String value){
        selectByValue(processorLocator, value); //2
}
public void choiceRAM(String value){
    selectByValue(ramLocator,value); //5
}
public void choiceHDD (){
    clickToLocator(hddLocator);
}
public void choiceOS(){
    clickToLocator(osVistaHomeLocator);
}
public void addToCart(){
    clickToLocator(addToCartLocator);
}
public void goToCart(){
        waitFor(goToCart);
    clickToLocator(goToCart);
}
public void isPCAdded (){
    isDisplayed(isHDDDisplayed);

}




}
