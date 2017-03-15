package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class Controller {

    @FXML
    private TextField display;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button add;

    @FXML
    private Button subtract;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button clear;

    @FXML
    private Button equal;

    @FXML
    private Button decimal;

    @FXML
    private Button percent;


    double n1=0.0;

    double ans = 0.0;

    int operation;


    public void click (ActionEvent event) throws Exception {

        if(event.getSource()==one) {
            display.setText(display.getText()+"1");
        }

        else if(event.getSource()==two) {
            display.setText(display.getText()+"2");
        }

        else if(event.getSource()==three) {
            display.setText(display.getText()+"3");
        }

        else if(event.getSource()==four) {
            display.setText(display.getText()+"4");
        }

        else if(event.getSource()==five) {
            display.setText(display.getText()+"5");
        }

        else if(event.getSource()==six) {
            display.setText(display.getText()+"6");
        }

        else if(event.getSource()==seven) {
            display.setText(display.getText()+"7");
        }

        else if(event.getSource()==eight) {
            display.setText(display.getText()+"8");
        }

        else if(event.getSource()==nine) {
            display.setText(display.getText()+"9");
        }

        else if(event.getSource()==zero) {
            display.setText(display.getText()+"0");
        }

        else if(event.getSource()==decimal) {
            display.setText(display.getText()+".");
        }


        else if(event.getSource()==clear) {
            display.setText("");
        }

        else if(event.getSource()==add) {
            n1 = Double.parseDouble(display.getText());
            operation=1;
            display.setText("");
        }

        else if(event.getSource()==subtract) {
            n1 = Double.parseDouble(display.getText());
            operation=2;
            display.setText("");
        }

        else if(event.getSource()==multiply) {
            n1 = Double.parseDouble(display.getText());
            operation=3;
            display.setText("");
        }

        else if(event.getSource()==divide) {
            n1 = Double.parseDouble(display.getText());
            operation=4;
            display.setText("");
        }

        else if(event.getSource()==percent) {
            n1 = Double.parseDouble(display.getText());
            operation=5;
            display.setText("");
        }


        else if(event.getSource()==equal) {
            double n2 = Double.parseDouble(display.getText());


            if(operation==1){
                ans = n1+n2;
            }

            else if(operation==2){
                ans = n1-n2;
            }

            else if(operation==3){
                ans = n1*n2;
            }

            else if(operation==4) {
                ans = n1 / n2;
                display.setText("Error");

            }

            else if(operation==5) {
                ans = (n1*n2)/100;
                display.setText("Error");

            }

            display.setText(String.valueOf(ans));

        }




    }
}
