package pages;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PageBase {


    public void adBanerRemove(){
    executeJavaScript("document.querySelector('#fixedban').style.display='none';");
    }
}
