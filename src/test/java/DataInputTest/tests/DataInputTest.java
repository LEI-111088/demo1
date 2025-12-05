package DataInputTest.tests;

import DataInputTest.pages.DataInputPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DataInputTest {

    private DataInputPage page;

    @BeforeEach
    void setup() {
        Configuration.browserSize = "1200x800";
        open("https://the-internet.herokuapp.com/inputs");
        page = new DataInputPage();
    }

    @Test
    void positiveNumberInput() {
        page.type("150");
        page.shouldHaveValue("150");
    }

    @Test
    void negativeNumberInput() {
        page.type("-10");
        page.shouldHaveValue("-10");
    }

    @Test
    void decimalNumberInput() {
        page.type("3.14");
        page.shouldHaveValue("3.14");
    }

    @Test
    void invalidTextInput() {
        page.type("abc");
        page.shouldHaveValue("");
    }

    @Test
    void largeNumberInput() {
        page.type("999999999999");
        page.shouldHaveValue("999999999999");
    }
}
