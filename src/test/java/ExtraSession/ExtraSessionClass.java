package ExtraSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtraSessionClass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        System.out.println("Extra Session GitBash - first commit");

        //clone the project
        
        //sending message from gitHub remote repos
    }

    //HoverOver
    public void hoverOverTest() {
        driver.get("https://demo.automationtesting.in/Register.html");
        WebElement switchTo = driver.findElement(By.xpath("//*[contains(text(),'SwitchTo')]"));
        WebElement window = driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));

        Actions action = new Actions(driver);

        action.moveToElement(switchTo).moveToElement(window).click().build().perform();

        System.out.println("Done");
    }
    
    public void newStuff(){
        int sum =20; 
        //correct one
        {
}
