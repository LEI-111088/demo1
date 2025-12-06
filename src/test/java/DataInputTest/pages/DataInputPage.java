package DataInputTest.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.value;

public class DataInputPage {

    private final SelenideElement numberInput = $("input[type='number']");

    public void type(String text) {
        numberInput.clear();
        numberInput.sendKeys(text);
    }

    public void shouldHaveValue(String expected) {
        numberInput.shouldHave(value(expected));
    }
}
