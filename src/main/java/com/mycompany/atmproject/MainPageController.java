package com.mycompany.atmproject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainPageController {
  @FXML
  Text txtWelcomeMessage;
  @FXML
  Text openAccount1;

  @FXML
  private void openAccount() throws IOException {
    App.setRoot("openAccount");
  }

  @FXML
  private void logout() throws IOException {
    App.setRoot("login");
  }

  private String setWelcomeMessage() {
    int currentHour = Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));

    if (currentHour >= 1 && currentHour < 12) {
      return "Good morning";
    } else if (currentHour >= 12 && currentHour < 17) {
      return "Good afternoon";
    } else if (currentHour >= 17 && currentHour < 20) {
      return "Good evening";
    } else {
      return "Good night";
    }

  }

  public void initialize() throws IOException {
    txtWelcomeMessage.setText(setWelcomeMessage());
  }

}
