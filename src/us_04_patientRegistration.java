import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class us_04_patientRegistration extends BaseDriver {
    @Test
    public void registrationTest(){

    driver.get("https://demo.openmrs.org/openmrs/login.htm");

    List<WebElement> locations=driver.findElements(By.xpath("//ul[@class='select']//li"));

    int randomSecim= MyFunc.randomGenerator(locations.size());//random bir sayi uretildi

        String locationAdi=locations.get(randomSecim).getText();//randomdaki locationin adi alindi
        System.out.println("Lokasyon = " + locationAdi);//kontrol icin yazildi
        locations.get(randomSecim).click();

}}
