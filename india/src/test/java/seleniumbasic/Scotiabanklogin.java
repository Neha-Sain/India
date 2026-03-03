package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scotiabanklogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=CN_9Apr2BrM&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6Ly93d3cuc2NvdGlhYmFuay5jb20vIiwicmFyIjpmYWxzZSwib2F1dGhfa2V5IjoiQ05fOUFwcjJCck0iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6Ly93d3cuc2NvdGlhb25saW5lLnNjb3RpYWJhbmsuY29tL29ubGluZS9sYW5kaW5nL29hdXRobGFuZGluZy5ibnMiLCJleHAiOjE3NzIwNzMzMzAsImlhdCI6MTc3MjA3MjEzMCwianRpIjoiZDRiNjM5YzEtMDMyYS00M2UyLTllNDYtMTUxZmJjNDllNjNkIiwiY2xpZW50X2lkIjoiOGVlOTBjMzktMWM1Mi00ZmY0LThhZTYtYTdiNTRjNTM5OTMzIiwiY2xpZW50X21ldGFkYXRhIjp7IkNoYW5uZWxJRCI6IlNPTCIsIkFwcGxpY2F0aW9uQ29kZSI6Ikg3In0sImlzc3VlciI6Imh0dHBzOi8vcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.GAQDa4jNycaZ5P1Gs_RJ9BnuCjTf7hGtTQTSdJ6hEakeA6ur2ILDuOgTlfhPXO2q47r4QDVYRwMIcheDHTt5Fy7sDhkun3-C_pMFWqDLla4hfcikmaZI6cvVVSpmhKQXDC3fQ2IfbhVUvK9d_a7GMgDkRu0mb02JSv3_aOtpHaFbwzWPVPgYfzVrL8bQK5zgjWckVGEIFBMiMj4i0VFtzxEhFehK5ZuJcDJOSlmAj9f9bYD0KTZotcJt9z9GO6ifmLAdoK9kqN0tHk7Oy_5GlwVMkiZ-6r3cUjRYJD7qWuibmy8ZKyaBGsN5D7iJ0KQJJZCX33-wMAeyTtw4nbp4wg&preferred_environment=");
        driver.findElement(By.name("usernameInput")).sendKeys("abcdefgh");
        driver.findElement(By.name("password")).sendKeys("abcdefgh");
        driver.findElement(By.xpath("//span[@class='ButtonCorestyle__StyledButtonCoreBlock-canvas-core__sc-v39ho0-1 bfdKLe ButtonCore__block']")).click();
    }
}
