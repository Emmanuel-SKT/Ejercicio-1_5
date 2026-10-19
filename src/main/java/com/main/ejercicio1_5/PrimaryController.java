package com.main.ejercicio1_5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtAlimentacion;
    @FXML
    private TextField txtRefrigerios;
    @FXML
    private TextField txtTransporte;
    @FXML
    private TextField txtTelefonia;
    @FXML
    private TextField txtOtros;
    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnLimpiar;
    @FXML
    private TextField txtTotalSemanal;
    @FXML
    private TextField txtGastoAlto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void btnCalcularOnAction(ActionEvent event) {
        double alim = Double.parseDouble(txtAlimentacion.getText());
        double refri = Double.parseDouble(txtRefrigerios.getText());
        double trans = Double.parseDouble(txtTransporte.getText());
        double tele = Double.parseDouble(txtTelefonia.getText());
        double otros = Double.parseDouble(txtOtros.getText());
        
        double total = alim + refri + trans + tele + otros;
        
        String mayor = "Alimentación";
        double max = alim;
        
        if (refri > max) {
            max = refri;
            mayor = "Refrigerios";
        }
        if (trans > max) {
            max = trans;
            mayor = "Transporte";
        }
        if (tele > max) {
            max = tele;
            mayor = "Telefonía";
        }
        if (otros > max) {
            max = otros;
            mayor = "Otros";
        }
        
        txtTotalSemanal.setText(String.valueOf(total));
        txtGastoAlto.setText(mayor);
    }

    @FXML
    private void btnLimpiarOnAction(ActionEvent event) {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotalSemanal.setText("");
        txtGastoAlto.setText("");
    }
}
