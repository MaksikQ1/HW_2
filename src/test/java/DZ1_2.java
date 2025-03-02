import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Dz1_2 {
    @Test
    void successfulSearchTest() {
        open("https://auth.niffler.qa.guru");
        $("[name=username]").setValue("usr");
        $("[name=password]").setValue("psw").pressEnter();

        $("[id=spendings]").shouldHave(text("Kat1"));
    }
}