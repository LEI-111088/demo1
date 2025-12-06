package testsInteraction;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pagesInteraction.VaadinSamplerButtonPage;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InteractionTest {

    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
    }

    @Test
    void testInteractionButton() {

        open("https://demo.vaadin.com/sampler/#ui/interaction/button");

        VaadinSamplerButtonPage page = new VaadinSamplerButtonPage();

        page.clickSampleButton();

        String result = page.getResultText();

        assertTrue(result.contains("Button"));
    }
}
