package testsDataPresentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

//PageUrl("about:blank")
public class LabelTests {

    @BeforeEach
    public void setUp(){
        open("https://demo.vaadin.com/sampler/#ui/data-presentation/label");
    }

    @Test
    public void labelTest() {
        SelenideElement label = $("#sampletitle");
        label.shouldHave(cssClass("gwt-Label"));
    }
}