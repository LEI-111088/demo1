package pagesInteraction;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.*;

import java.time.Duration;

public class VaadinSamplerButtonPage {
    private final SelenideElement sampleButton =
            $x("//div[@class='sample']//button");

    private final SelenideElement resultText =
            $x("//div[@class='gwt-HTML titlelabel transitioned']");

    public void clickSampleButton() {
        sampleButton.shouldBe(visible, Duration.ofSeconds(15)).click();
    }

    public String getResultText() {
        return resultText.shouldBe(visible, Duration.ofSeconds(15)).getText();
    }
}
