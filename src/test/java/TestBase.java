import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout =5000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

}
