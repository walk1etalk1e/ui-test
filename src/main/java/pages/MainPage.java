package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement searchField = $(By.cssSelector("[class='search-form'] [class='search-bar']"));
    private SelenideElement searchButton = $(By.cssSelector("[class='search-form'] [type='submit']"));

    /*
    * Відкриває браузер та переходить на сторінку meta.ua
    */
    public MainPage open() {
        Selenide.open("https://meta.ua/");

        return this;
    }
    /*
     * Вводить текст в поле пошуку і натискає на кнопку пошуку
     * String text - текст який потрібно шукати
     */
    public SearchPage searchFor(String text) {
        searchField.setValue(text);
        searchButton.click();

        return new SearchPage();

    }
}
