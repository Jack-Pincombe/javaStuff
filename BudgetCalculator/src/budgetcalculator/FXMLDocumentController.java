/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Window;

/**
 *
 * @author jackpincombe
 */
public class FXMLDocumentController  {
    
    @FXML
    private Label label;
    @FXML
    private Text actiontarget;
    @FXML
    private TextField Income;
    @FXML
    private TextField Rent;
    @FXML
    private TextField Util;
    @FXML
    private TextField Groceries;
    @FXML
    private TextField Travel;
    @FXML
    private TextField Debts;
    @FXML
    private int total;
    
    private boolean empty = true; 
    
    @FXML
    private void handlecalculationButtonAction(ActionEvent event) {
        System.out.println("Calculation Button has been pressed");
        System.out.println(Income.getText());
        validate();
        calculate();
        System.out.println(total);
        //actiontarget.setText(Income);
    }
    
    //func to calculate the total
    public void calculate(){
        System.out.println("Calculate func called");
    }
    
    //Func to validate all fields are given
    public void validate(){
        
        while(empty == true){
             if (Income.getText().isEmpty()) {
            actiontarget.setText("Please enter your income");
            empty = true;
            }
            else if (Rent.getText().isEmpty()) {
            actiontarget.setText("Please enter your Rent");
            empty = true;
            
        }
            else if (Util.getText().isEmpty()) {
            actiontarget.setText("Please enter your Utilities");
            empty = true;
    }
            else if (Groceries.getText().isEmpty()) {
            actiontarget.setText("Please enter your Groceries");
            empty = true;
    }
            else if (Travel.getText().isEmpty()) {
            actiontarget.setText("Please enter your Travel costs");
            empty = true;
        }
            else if (Debts.getText().isEmpty()) {
            actiontarget.setText("Please enter your Debts");
            empty = true;
        }
            else{
                empty = false;
                actiontarget.setText("");
            }
        }}}
    
 

