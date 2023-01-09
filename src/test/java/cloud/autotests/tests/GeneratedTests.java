package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://top-select-development.com/'", () ->
                open("https://top-select-development.com/"));

        step("Page title should have text 'Top selection'", () -> {
            String expectedTitle = "Top selection";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
    @Test
    @DisplayName("GenerateTests for Top selection")
    void generatedTest() {
        step("Open https://top-select-development.com/", () -> {
            Selenide.open("https://top-select-development.com/");
        });

        step("Checking the main menu", () -> {
            $(".header").shouldBe(visible).shouldHave(text("Main Page"), text("Services"), text("Dedicated teams"), text("Portfolio"), text("Contacts"));
        });

        step("Button Get in touch should be visible", () -> {
            $(".btn__text").shouldBe(visible).shouldHave(text("Get in touch"));
        });

        step("Open page Services", () -> {
            $(byText("Services")).click();
            $(".core-head main").find("Take advantage of software development services and consulting services, the development of");
        });

        step("Open page Dedicated teams", () -> {
            $(byText("Dedicated teams")).click();
            $(".core-head main").find("Dedicated teams");
        });

        step("Open page Portfolio", () -> {
            $(byText("Portfolio")).click();
            $(".core-head main").find("Our projects");
        });

        step("Open page Contacts", () -> {
            $(byText("Contacts")).click();
            $(".core-head main").find("Our contacts");
        });

        step("Open page Main Page", () -> {
            $(byText("Main Page")).click();
            $(".core-head main").find("We create teams of professionals who can lead your business to prosperity");
        });

    }

    @Test
    @DisplayName("Language selection")
    void checkLanguageSelection(){
        step("Open https://top-select-development.com/", () -> {
            Selenide.open("https://top-select-development.com/");
        });

        step("Checking the language selection", () -> {
            $(".header__lang").shouldHave(text("ENG"), text("RU"));
            $(byText("RU")).click();
            $(".core-head main").find("Мы создаем команды профессионалов, способных привести ваш бизнес к процветанию");
            $(byText("ENG")).click();
            $(".core-head main").find("We create teams of professionals who can lead your business to prosperity");
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://top-select-development.com/'", () ->
            open("https://top-select-development.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}