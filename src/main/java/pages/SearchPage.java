package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    private ElementsCollection searchResults = $$(By.cssSelector("[class='gsc-webResult gsc-result']"));

    /*
     * Перевіряє, що кількість елементів на сторінці дорівнює size
     * int size - Очікувана кількість видачі на сторінці результатів
     */
    public SearchPage searchHaveSize(int size) {
        searchResults.shouldHaveSize(size);

        return this;
    }

    /*
     * Перевіряє, що в результаті пошуку в позиції position міститься текст text
     * int position - Позиція результату який потрібно перевірити
     * String text - Текст який має бути
     */
    public SearchPage specificSearchResultContainsText(int position, String text) {
        searchResults.get(position).shouldHave(Condition.text(text));

        return this;
    }
}
