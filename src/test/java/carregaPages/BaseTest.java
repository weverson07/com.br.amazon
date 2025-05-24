package carregaPages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setup() {
        System.out.println("""
              #                            #                                                               ######                                                                                                     #     #
      #                            #
      #   ##   #    #   ##        # #   #    # #####  ####  #    #   ##   ##### #  ####  #    #
      #  #  #  #    #  #  #      #   #  #    #   #   #    # ##  ##  #  #    #   # #    # ##   #
      # #    # #    # #    #    #     # #    #   #   #    # # ## # #    #   #   # #    # # #  #
#     # ###### #    # ######    ####### #    #   #   #    # #    # ######   #   # #    # #  # #
#     # #    #  #  #  #    #    #     # #    #   #   #    # #    # #    #   #   # #    # #   ##
 #####  #    #   ##   #    #    #     #  ####    #    ####  #    # #    #   #   #  ####  #    #


######
#     # ######  ####  ###### #    # #    #  ####  #      #    # # #####   ####
#     # #      #      #      ##   # #    # #    # #      #    # # #    # #    #
#     # #####   ####  #####  # #  # #    # #    # #      #    # # #    # #    #
#     # #           # #      #  # # #    # #    # #      #    # # #    # #    #
#     # #      #    # #      #   ##  #  #  #    # #       #  #  # #    # #    #
######  ######  ####  ###### #    #   ##    ####  ######   ##   # #####   ####


                        #     #
#####   ####  #####     #  #  # ###### #    # ###### #####   ####   ####  #    #
#    # #    # #    #    #  #  # #      #    # #      #    # #      #    # ##   #
#    # #    # #    #    #  #  # #####  #    # #####  #    #  ####  #    # # #  #
#####  #    # #####     #  #  # #      #    # #      #####       # #    # #  # #
#      #    # #   #     #  #  # #       #  #  #      #   #  #    # #    # #   ##
#       ####  #    #     ## ##  ######   ##   ###### #    #  ####   ####  #    #


        """);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
