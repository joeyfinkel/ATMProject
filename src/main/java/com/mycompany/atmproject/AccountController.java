package com.mycompany.atmproject;

import java.io.IOException;

import javafx.fxml.FXML;

public class AccountController {
  @FXML
  private void goBack() throws IOException {
    App.setRoot("mainPage");
  }
}
