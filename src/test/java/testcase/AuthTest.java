// No available cause we have web part in authorization and for passing the test it needed to create some hard-think ideas

package testcase;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pageobject.AuthPage;

public class AuthTest extends BaseTest {

    @Test
    @DisplayName("URL authorization")
    public void testUserLogin() {

        AuthPage authPage = new AuthPage(driver);

        authPage.typeUrl("alinatest.jetbrains.space")
                .tapLogInButton()
                .typeEmailWeb("alinadrew@mail.ru")
                .typePasswordWeb("zDn8NuW4")
                .tapLogInWebButton()
                .tapAcceptWebButton()
                .tapSkipTheTour();

    }
}
