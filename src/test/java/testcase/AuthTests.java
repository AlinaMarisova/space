package testcase;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import pageobject.AuthPage;

public class AuthTests extends BaseTest {

    @Test
    @DisplayName("Авторизация пользователем по урлу организации")
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
