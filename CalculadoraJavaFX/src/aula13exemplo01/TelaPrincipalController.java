package aula13exemplo01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaPrincipalController implements Initializable {
    private String valorAntigo;
    private String operacaoAntiga;
    
    @FXML
    Button btn0;
    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    Button btn3;
    @FXML
    Button btn4;
    @FXML
    Button btn5;
    @FXML
    Button btn6;
    @FXML
    Button btn7;
    @FXML
    Button btn8;
    @FXML
    Button btn9;
    @FXML
    Button btnBK;
    @FXML
    Button btnCE;
    @FXML
    Button btnC;
    @FXML
    Button btnDiv;
    @FXML
    Button btnMult;
    @FXML
    Button btnMenos;
    @FXML
    Button btnMais;
    @FXML
    Button btnIgual;
    @FXML
    Button btnPonto;
    @FXML
    Button btnPorc;
    @FXML
    TextField txtDisplay;
    
    @FXML
    private void btn0Action(ActionEvent event){
        String txt = txtDisplay.getText();
        txtDisplay.setText(txt+"0");
    }
    
    @FXML
    private void btn1Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"1");
    }
    
    @FXML
    private void btn2Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"2");
    }
    
    @FXML
    private void btn3Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"3");
    }
    
    @FXML
    private void btn4Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"4");
    }
    
    @FXML
    private void btn5Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"5");
    }
    
    @FXML
    private void btn6Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"6");
    }
    
    @FXML
    private void btn7Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"7");
    }
    
    @FXML
    private void btn8Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"8");
    }
    
    @FXML
    private void btn9Action(ActionEvent event){
        txtDisplay.setText(txtDisplay.getText()+"9");
    }
    
    @FXML
    private void btnBKAction(ActionEvent event){
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnCEAction(ActionEvent event){
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnCAction(ActionEvent event){
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnMaisAction(ActionEvent event){
        valorAntigo = txtDisplay.getText();
        operacaoAntiga = "+";
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnMenosAction(ActionEvent event){
        valorAntigo = txtDisplay.getText();
        operacaoAntiga = "-";
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnDivAction(ActionEvent event){
        valorAntigo = txtDisplay.getText();
        operacaoAntiga = "/";
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnMultAction(ActionEvent event){
        valorAntigo = txtDisplay.getText();
        operacaoAntiga = "x";
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnPorcAction(ActionEvent event){
        valorAntigo = txtDisplay.getText();
        operacaoAntiga = "%";
        txtDisplay.setText("");
    }
    
    @FXML
    private void btnIgualAction(ActionEvent event){
        if(operacaoAntiga.equals("+")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) + Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText(String.valueOf(resultado));
        }else if(operacaoAntiga.equals("-")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) - Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText(String.valueOf(resultado));
        }else if(operacaoAntiga.equals("/")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) / Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText(String.valueOf(resultado));
        }else if(operacaoAntiga.equals("x")){
            double resultado;
            resultado = Double.parseDouble(valorAntigo) * Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText(String.valueOf(resultado));
        }else if(operacaoAntiga.equals("%")){
            double resultado;
            resultado = (Double.parseDouble(valorAntigo) * Double.parseDouble(txtDisplay.getText())) / 100;
            txtDisplay.setText(String.valueOf(resultado));
        }
    }
    
    @FXML
    private void btnPontoAction(ActionEvent event){
        String txt = txtDisplay.getText();
        txtDisplay.setText(txt+".");
    }
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    } 
}
