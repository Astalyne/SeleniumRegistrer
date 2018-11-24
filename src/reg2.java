import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reg2 {
    public static void main(String[] args) {
        Boolean a = true;
        window w1 = new window();

    }




    }

 class window extends JFrame implements ActionListener {
     JTextField midtf1 = new JTextField("Department", 5);
     JTextField midtf2 = new JTextField("CopyCss", 15);
     JTextField midtf3 = new JTextField("CRN", 5);

     JTextField midtf4 = new JTextField("Department", 5);
     JTextField midtf5 = new JTextField("CopyCss", 15);
     JTextField midtf6 = new JTextField("CRN", 5);


     JTextField midtf7 = new JTextField("Department", 5);
     JTextField midtf8 = new JTextField("CopyCss", 15);
     JTextField midtf9 = new JTextField("CRN", 5);
     JButton button = new JButton("Search and change");
   //  JMenuBar men = new JMenuBar();
    // JMenu menud = new JMenu("Help");
     public window() {
         super("Checker");
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setSize(350, 200);
         setLayout(new FlowLayout());

         add(midtf1);
         add(midtf2);
         add(midtf3);
         add(midtf4);
         add(midtf5);
         add(midtf6);
         add(midtf7);
         add(midtf8);
         add(midtf9);
         add(button);


        //setJMenuBar(men);
      //  men.add(menud);

         setVisible(true);
         button.addActionListener(this);


     }

     public void actionPerformed(ActionEvent ae) {
         if (ae.getSource() == button) {
            String c1 = midtf1.getText();
             String s1 = midtf2.getText();
             String crn1= midtf3.getText();
             String c2 = midtf4.getText();
             String s2 = midtf5.getText();
             String crn2 = midtf6.getText();
             String c3 = midtf7.getText();
             String s3 = midtf8.getText();
             String crn3 = midtf9.getText();
             int a =0;
             while (a==0) {
                 method(crn1, crn2, crn3, s1, s2, s3, c1, c2, c3);
             }
         }

     }

     public static void method(String z1, String z2, String z3, String z4, String z5, String z6, String z7, String z8, String z9) {

         System.setProperty("webdriver.chrome.driver", "C:\\Users\\SultanS\\Desktop\\171\\registrer\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
      /*   driver.get("http://ssbweb.kfupm.edu.sa/PROD8/bwskfreg.P_AltPin");
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("sid"))));

         WebElement w1 = driver.findElement(By.name("sid"));

         w1.sendKeys("s201636740");

         WebElement w2 = driver.findElement(By.name("PIN"));
                                                                                 w2.sendKeys("Hexega_123456");
         w2.sendKeys(Keys.RETURN);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bmenu--P_StuMainMnu___UID1")));
         WebElement w3 = driver.findElement(By.cssSelector("#bmenu--P_StuMainMnu___UID1 "));
         w3.click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#bmenu--P_RegMnu___UID1")));
         WebElement e = driver.findElement(By.cssSelector("#bmenu--P_RegMnu___UID1"));
         e.click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#contentItem11")));
         WebElement w5 = driver.findElement(By.cssSelector("#contentItem11"));
         w5.click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#id____UID5")));
         WebElement w6 = driver.findElement(By.cssSelector("#id____UID5"));
         w6.click();*/
         driver.get("https://portal.kfupm.edu.sa");
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username"))));

         WebElement w1= driver.findElement(By.name("username"));

         w1.sendKeys("s201636740");

         WebElement w2 =driver.findElement(By.name("password"));
         w2.sendKeys("Hexega_123456");
         w2.sendKeys(Keys.RETURN);
         driver.get("https://banner-sso.kfupm.edu.sa/ssomanager/c/SSB?pkg=bwskfreg.P_AltPin");
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#id____UID5")));
         WebElement w6 = driver.findElement(By.cssSelector("#id____UID5"));
         w6.click();


         String crn1 = z1;
         String crn2 = z2;
         String crn3 = z3;
         String c1 = z4;
         String c2 = z5;
         String c3 = z6;
         String s1 = z7;
         String s2 = z8;
         String s3 = z9;

         WebDriver mathDriver = new ChromeDriver();
         WebDriverWait waitMath = new WebDriverWait(mathDriver, 10);
         mathDriver.get("http://registrar.kfupm.edu.sa/CourseOffering");
         waitMath.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form1 > div:nth-child(4) > div > div.col-md-12 > div > div:nth-child(1) > h4")));
         Select ss = new Select(mathDriver.findElement(By.cssSelector("#CntntPlcHldr_ddlDept")));
         ss.selectByVisibleText(s1);


         WebDriver ee206 = new ChromeDriver();
         WebDriverWait ee = new WebDriverWait(ee206, 10);
         ee206.get("http://registrar.kfupm.edu.sa/CourseOffering");
         ee.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form1 > div:nth-child(4) > div > div.col-md-12 > div > div:nth-child(1) > h4")));
         Select se = new Select(ee206.findElement(By.cssSelector("#CntntPlcHldr_ddlDept")));
         se.selectByVisibleText(s2);


         WebDriver cours3 = new ChromeDriver();
         WebDriverWait c3c = new WebDriverWait(cours3, 10);
         cours3.get("http://registrar.kfupm.edu.sa/CourseOffering");
         c3c.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form1 > div:nth-child(4) > div > div.col-md-12 > div > div:nth-child(1) > h4")));
         Select seee = new Select(cours3.findElement(By.cssSelector("#CntntPlcHldr_ddlDept")));
         seee.selectByVisibleText(s3);


         int n = 0;
         int a1 = 0;
         int b1 = 0;
         int e1 = 0;
         Boolean f = true;
         while (f == true) {
             try {
                 for (int i = 0; i == 0; ) {
                     //if(driver.findElements(By.cssSelector("#crn_id1")).size()!=1)
                     //  throw new Exception();
                     mathDriver.navigate().refresh();
                     ee206.navigate().refresh();
                     cours3.navigate().refresh();
                     if ((mathDriver.findElements(By.cssSelector(c1)).size() < 1) && a1 != 1) {
                         WebElement w4 = driver.findElement(By.cssSelector("#crn_id1"));
                         w4.sendKeys(crn1);
                         w4.sendKeys(Keys.ENTER);
                         a1 = 1;
                     }

                     if ((ee206.findElements(By.cssSelector(c2)).size() < 1) && b1 != 1) {

                         WebElement w4 = driver.findElement(By.cssSelector("#crn_id1"));
                         w4.sendKeys(crn2);
                         w4.sendKeys(Keys.ENTER);
                         b1 = 1;
                     }
                     if ((cours3.findElements(By.cssSelector(c3)).size() < 1) && e1 != 1) {

                         WebElement w4 = driver.findElement(By.cssSelector("#crn_id1"));
                         w4.sendKeys(crn3);
                         w4.sendKeys(Keys.ENTER);
                         e1 = 1;
                     }

                     n++;
                     if (n == 5) {
                         n = 0;
                         if (driver.findElements(By.cssSelector("#crn_id1")).size() < 1) {
                             throw new NoSuchElementException("e");

                         }
                         driver.navigate().refresh();
                     }
                     if ((ee206.findElements(By.cssSelector("#form1 > div:nth-child(4) > div > div.col-md-12 > div > div.table-list > div:nth-child(56) > div:nth-child(9) > center")).size() < 1) &&
                             (ee206.findElements(By.cssSelector("#form1 > div:nth-child(4) > div > div.col-md-12 > div > div.table-list > div:nth-child(23) > div:nth-child(9) > center")).size() < 1)
                             ) {
                         f = false;
                         break;
                     }

                 }
             } catch (NoSuchElementException b) {
                 driver.quit();
                  mathDriver.quit();
                 ee206.quit();
                 cours3.quit();
                 f = true;
                 return;
             }
         }


     }
 }

