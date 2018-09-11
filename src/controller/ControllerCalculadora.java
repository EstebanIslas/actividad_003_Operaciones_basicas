package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelCalculadora;
import view.ViewCalculadora;
import extras.DataValidation;

public class ControllerCalculadora {

    ModelCalculadora modelCalculadora;
    ViewCalculadora viewCalculadora;
    DataValidation dataValidation = new DataValidation();

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewCalculadora.jb_suma) {
                jb_suma_action_Performed();
            }else if (e.getSource() == viewCalculadora.jb_resta){
                jb_resta_action_Performed();
            }else if (e.getSource() == viewCalculadora.jb_multiplicacion){
                jb_multiplicacion_action_Performed();
            }else if(e.getSource() == viewCalculadora.jb_division){
                jb_division_action_Performed();
            }else if (e.getSource() == viewCalculadora.jb_modulo){
                jb_modulo_action_Performed();
            }
        }
    };

    public ControllerCalculadora(ModelCalculadora modelCalculadora, ViewCalculadora viewCalculadora) {
        this.modelCalculadora = modelCalculadora;
        this.viewCalculadora = viewCalculadora;
        initComponents();
        this.viewCalculadora.jb_suma.addActionListener(actionListener);
        this.viewCalculadora.jb_resta.addActionListener(actionListener);
        this.viewCalculadora.jb_multiplicacion.addActionListener(actionListener);
        this.viewCalculadora.jb_division.addActionListener(actionListener);
        this.viewCalculadora.jb_modulo.addActionListener(actionListener);
    }

    public void jb_suma_action_Performed() {
        modelCalculadora.setNum1(dataValidation.string2float(viewCalculadora.jtf_num1.getText()));
        modelCalculadora.setNum2(dataValidation.string2float(viewCalculadora.jtf_num2.getText()));
        viewCalculadora.jl_resultado.setText(String.valueOf(modelCalculadora.Suma()));
    }
    public void jb_resta_action_Performed(){
        modelCalculadora.setNum1_resta(dataValidation.string2int(viewCalculadora.jtf_num1.getText()));
        modelCalculadora.setNum2_resta(dataValidation.string2int(viewCalculadora.jtf_num2.getText()));
        viewCalculadora.jl_resultado.setText(String.valueOf(modelCalculadora.Resta())); //Hace la operacion traida del modelo
        
    }
    public void jb_multiplicacion_action_Performed(){
        modelCalculadora.setNum1(dataValidation.string2float(viewCalculadora.jtf_num1.getText()));
        modelCalculadora.setNum2(dataValidation.string2float(viewCalculadora.jtf_num2.getText()));
        viewCalculadora.jl_resultado.setText(String.valueOf(modelCalculadora.Multiplicacion()));
    }
    
    public void jb_division_action_Performed(){
        modelCalculadora.setNum1_div(dataValidation.string2double(viewCalculadora.jtf_num1.getText()));
        modelCalculadora.setNum2_div(dataValidation.string2double(viewCalculadora.jtf_num2.getText()));
        viewCalculadora.jl_resultado.setText(String.valueOf(modelCalculadora.Division()));
        
    }
    public void jb_modulo_action_Performed(){
        modelCalculadora.setNum1(dataValidation.string2float(viewCalculadora.jtf_num1.getText()));
        modelCalculadora.setNum2(dataValidation.string2float(viewCalculadora.jtf_num2.getText()));
        viewCalculadora.jl_resultado.setText(String.valueOf(modelCalculadora.Modulo()));
    }

    public void initComponents() {
        viewCalculadora.setVisible(true);
        viewCalculadora.setLocationRelativeTo(null);
    }
}
