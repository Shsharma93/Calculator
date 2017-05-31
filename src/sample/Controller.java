package sample;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.text.DecimalFormat;


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
    private Button left;

    @FXML
    private Button right;

    @FXML
    private Button percent;


    String expression = "";

    DoubleEvaluator evaluator = new DoubleEvaluator();
    
    Double answer = 0.0;

    DecimalFormat round = new DecimalFormat("##.##########");


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
            display.setText(display.getText()+"+");
        }

        else if(event.getSource()==subtract) {
            display.setText(display.getText()+"-");
        }

        else if(event.getSource()==multiply) {
            display.setText(display.getText()+"*");
        }

        else if(event.getSource()==divide) {
            display.setText(display.getText()+"/");
        }

        else if(event.getSource()==percent) {
            display.setText(display.getText()+"%");
        }

        else if(event.getSource()==left) {
            display.setText(display.getText()+"(");
        }

        else if(event.getSource()==right) {
            display.setText(display.getText()+")");
        }


        else if(event.getSource()==equal) {
            expression = display.getText();
            answer = new DoubleEvaluator().evaluate(expression);
            display.setText(String.valueOf(round.format(answer)));

        }


    }
}
