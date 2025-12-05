package testsBasicFeatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Condition.focused;
import static com.codeborne.selenide.Selenide.*;

//page_url = https://demo.vaadin.com/sampler/#ui/basic-features/keyboard-shortcuts
public class ShortcutTests {
    private Actions actions;

    @BeforeEach
    public void setUp() {
        open("https://demo.vaadin.com/sampler/#ui/basic-features/keyboard-shortcuts");
        WebDriver driver = WebDriverRunner.getWebDriver();
        actions = new Actions(driver);
    }

    public void wait(int secs){
        try{
            Thread.sleep(secs*1000);
        }
        catch(Exception e){
        }
    }
    @Test
    public void selectLeft(){ //should select top left box (quando faco manualmente e o que acontece)
        wait(2);
        actions.keyDown(Keys.SHIFT).keyDown(Keys.ALT).keyDown("l").perform();
        actions.keyUp("l").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();

        wait(2);
        $("#gwt-uid-3").shouldBe(focused); //gwt-uid-3= id de top left
    }

    @Test
    public void selectLeftTop(){ //should select top left box
        wait(2);
        actions.keyDown(Keys.SHIFT).keyDown(Keys.ALT).keyDown("l").perform();
        actions.keyUp("l").perform();
        wait(1);
        actions.keyDown("u").perform();
        actions.keyUp("u").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();

        wait(2);
        $("#gwt-uid-3").shouldBe(focused);
    }

    @Test
    public void selectLeftBottom(){ //should select bottom left box
        wait(2);
        actions.keyDown(Keys.SHIFT).keyDown(Keys.ALT).keyDown("l").perform();
        actions.keyUp("l").perform();
        wait(1);
        actions.keyDown("d").perform();
        actions.keyUp("d").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();

        wait(2);
        $("#gwt-uid-5").shouldBe(focused); //gwt-uid-5= id de bottom left
    }

    @Test
    public void selectRight(){ //should select top right box
        wait(2);
        actions.keyDown(Keys.SHIFT).keyDown(Keys.ALT).keyDown("r").perform();
        actions.keyUp("r").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();

        wait(2);
        $("#gwt-uid-7").shouldBe(focused); //gwt-uid-7= id de top right
    }

    @Test
    public void selectRightTop(){ //should select top right box
        wait(2);
        actions.keyDown(Keys.SHIFT).keyDown(Keys.ALT).keyDown("r").perform();
        actions.keyUp("r").perform();
        wait(1);
        actions.keyDown("u").perform();
        actions.keyUp("u").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();

        wait(2);
        $("#gwt-uid-7").shouldBe(focused);
    }

    @Test
    public void selectRightBottom(){ //should select bottom right box
        wait(2);
        actions.keyDown(Keys.SHIFT).keyDown(Keys.ALT).keyDown("r").perform();
        actions.keyUp("r").perform();
        wait(1);
        actions.keyDown("d").perform();
        actions.keyUp("d").keyUp(Keys.ALT).keyUp(Keys.SHIFT).perform();

        wait(2);
        $("#gwt-uid-9").shouldBe(focused); //gwt-uid-9= id de bottom right
    }
}