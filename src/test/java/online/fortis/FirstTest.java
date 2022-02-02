package online.fortis;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @Test
    void yandexSearch(){
        //open ya.ru
       open("https://ya.ru/");

       //write a request
       $("#text").setValue("Википедия");
       $("button[type='submit']").click();

       //check result
       $$("#search-result li").first().shouldHave(text("wikipediag.org"));
    }
}
