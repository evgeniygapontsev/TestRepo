package pages.BookStore;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

     public RegisterPage newUser() {
         $("#newUser").click();
         return new RegisterPage();
     }

     public LoginPage login(String name, String pass) {
         $("#userName").setValue(name);
         $("#password").setValue(pass);
         $("#login").submit();
         return this;
     }
}
