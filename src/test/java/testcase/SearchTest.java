package testcase;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pageobject.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    @DisplayName("Checking search channel/DM")
    //User already has channel and DM started from "te.."
    // We need to check opening chats from the search but we have a bug with failure to open chats
    public void testSearchChats() {

        SearchPage searchPage = new SearchPage(driver);

        // Go to search and start to write word
        searchPage.tapSearchBottomTab()
                .fillTheSearchField()
                // Check that DM and channel chats are displayed on the screen as results
                .checkDMChat()
                .checkChannel();

    }
}
