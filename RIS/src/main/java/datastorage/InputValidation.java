/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastorage;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javafx.scene.control.Alert;

/**
 *
 * @author 14048
 */
public class InputValidation {

    public static boolean validateName(String name) {
        if (name.isBlank() || !name.matches("^[a-zA-Z]+ [a-zA-Z]+$")) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Please enter a valid full name. \n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateEmail(String email) {
        if (email.isBlank() || !email.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Please enter a valid Email. \n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateConfirm(String confirm) {
        if (!confirm.equals("CONFIRM")) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Please enter 'CONFIRM'.\n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateDate(String date) {
        if (date == null || !date.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$")) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Please enter a valid date.\n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateFuture(String date) {
        if (!validateDate(date)) {
            return false;
        }
        if (LocalDate.parse(date).isBefore(LocalDate.now())) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Date has already past.\nPlease insert a valid date.\n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateAddress(String address) {
        if (address.isBlank()) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Please enter a valid Address.\n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateInsurance(String insurance) {
        if (insurance.isBlank()) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Please enter a valid Insurance.\n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateTime(String time) {
        if (time.isBlank() || !time.matches("(^([0-9]|[0-1][0-9]|[2][0-3]):([0-5][0-9])$)")) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Error");
            a.setHeaderText("Try Again");
            a.setContentText("Please enter a valid Time.\n");
            a.show();
            return false;
        }
        return true;
    }

    public static boolean validateFutureTime(String date, String time) {
        if (!validateTime(time)) {
            return false;
        }
        if (LocalDate.parse(date).isEqual(LocalDate.now())) {
            if (LocalTime.parse(time).isBefore(LocalTime.now())) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Error");
                a.setHeaderText("Try Again");
                a.setContentText("Time Inputted has already past.\nPlease insert a valid time.\n");
                a.show();
                return false;
            }
        }
        return true;
    }

}
