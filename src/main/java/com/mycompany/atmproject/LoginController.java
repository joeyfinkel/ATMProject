package com.mycompany.atmproject;

import java.io.IOException;
import javafx.fxml.FXML;

public class LoginController {

    /**
     * Switches the page to the register page.
     *
     * @throws IOException
     */
    @FXML
    private void switchToRegister() throws IOException {
        App.setRoot("register");
    }

    /**
     * Switches the page to the login page.
     *
     * @throws IOException
     */
    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }

    /**
     * Switches the page to the login page.
     *
     * @throws IOException
     */
    @FXML
    private void switchToMainPage() throws IOException {
        App.setRoot("mainPage");
    }
}