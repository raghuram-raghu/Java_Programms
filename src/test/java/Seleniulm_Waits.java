public class Seleniulm_Waits {


    public static void main(){


//
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//
////        Alternative Using Duration (Recommended for Selenium 4+)
////
////        If you're using Selenium 4, it's better to use Duration:
////
////
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//
//
////    Explicitly Wait Syntax
//
//       WebdriverWait wait = new WebdriverWait(driver,Duration.ofSeconds(10));
//       WebElement element = wait.utill(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element_id")));
//
//

//        Condition                                     	Purpose
//        visibilityOfElementLocated(By locator)----	Waits for an element to be visible
//        presenceOfElementLocated(By locator)-----	Waits for an element to exist in DOM
//        elementToBeClickable(By locator)--------	Waits for an element to be clickable
//        invisibilityOfElementLocated(By locator)----Waits for an element to disappear
//        stalenessOf(WebElement element)	------------Waits until an element is no longer attached to the DOM
//        textToBePresentInElement(By locator, String text)--Waits for text to appear in an element
//        alertIsPresent()    ---------------------	Waits for an alert to pop up
//        frameToBeAvailableAndSwitchToIt(By locator)-Waits for a frame and switches to it
//        numberOfWindowsToBe(int number)    ---------Waits for a specific number of windows to be open
//


//        Fluent wait syntax

//
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(Exception.class);


    }
}
