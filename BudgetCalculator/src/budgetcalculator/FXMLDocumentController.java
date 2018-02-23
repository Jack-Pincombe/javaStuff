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
    
    public TextField outgoings[] = { Rent,Util,Groceries,Travel,Debts};
    
    private boolean empty = true; 
    
    @FXML
    private void handlecalculationButtonAction(ActionEvent event) {
        System.out.println("Calculation Button has been pressed");
        
        validate();
        calculate();
        System.out.println("Your weekly balance after bills is: " + total);
        actiontarget.setText("Your weekly balance after bills is: " + total);
    }
    
    //func to calculate the total
    public void calculate(){
        int salary = Integer.parseInt(Income.getText());
        int ut = Integer.parseInt(Util.getText());
        int rent = Integer.parseInt(Rent.getText());
        int Groc = Integer.parseInt(Groceries.getText());
        int trav = Integer.parseInt(Travel.getText());
        int debt = Integer.parseInt(Debts.getText());    
    
        int outG = ut + rent + Groc + trav + debt;
        
        total = (salary - outG)/4;
    }
    
    //Func to validate all fields are given
    public void validate(){
        
        while(empty == true){
            
             if (Income.getText().isEmpty()) {
            actiontarget.setText("Please enter your income");
            empty = true;
            validate();
            }
            else if (Rent.getText().isEmpty()) {
            actiontarget.setText("Please enter your Rent");
            empty = true;
            validate();
            
        }
            else if (Util.getText().isEmpty()) {
            actiontarget.setText("Please enter your Utilities");
            empty = true;
            validate();
    }
            else if (Groceries.getText().isEmpty()) {
            actiontarget.setText("Please enter your Groceries");
            empty = true;
            validate();
    }
            else if (Travel.getText().isEmpty()) {
            actiontarget.setText("Please enter your Travel costs");
            empty = true;
            validate();
        }
            else if (Debts.getText().isEmpty()) {
            actiontarget.setText("Please enter your Debts");
            empty = true;
            validate();
        }
            else{
                empty = false;
                actiontarget.setText("");
            }
        }}}
    
 

