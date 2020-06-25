package test;

import org.junit.Test;
import pages.MainPage;

public class SearchTest {
    MainPage mainPage = new MainPage();

    @Test
    public void searchTest() {
        String searchData = "form.com";
        String expectedText = "Form.com | Powering Enterprise Form Solutions";
        int expectedSize = 10;
        int position = 0;

        mainPage.open()
                .searchFor(searchData)
                .searchHaveSize(expectedSize)
                .specificSearchResultContainsText(position, expectedText);
    }

}
