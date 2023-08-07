package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML private Button botao0;
    @FXML private Button botao1;
    @FXML private Button botao2;
    @FXML private Button botao3;
    @FXML private Button botao4;

    @FXML private Button botao5;

    @FXML
    private Button botao6;

    @FXML
    private Button botao7;

    @FXML
    private Button botao8;

    @FXML
    private Button botao9;

    @FXML
    private Button divisao;

    @FXML
    private Button fatorial;

    @FXML
    private Button igual;

    @FXML
    private Button limpar;

    @FXML
    private Button multiplicacao;

    @FXML
    private Button parenteses1;

    @FXML
    private Button parenteses2;

    @FXML
    private Button pi;

    @FXML
    private Button ponto;

    @FXML
    private Button porcentagem;

    @FXML
    private Button potencia;

    @FXML
    private Button raiz;

    @FXML
    private Button soma;

    @FXML
    private Button subtracao;

    @FXML
    private Label visorLabel;
    private StringBuilder expressao;
    private Calculos calculadora=new Calculos();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.expressao=new StringBuilder();
    }



    @FXML
    protected void botao0OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao0.getText());
        expressao.append(botao0.getText());
    }

    @FXML
    protected  void botao1OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao1.getText());
        expressao.append(botao1.getText());

    }

    @FXML
    protected  void botao2OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao2.getText());
        expressao.append(botao2.getText());

    }

    @FXML
    protected void botao3OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao3.getText());
        expressao.append(botao3.getText());
    }

    @FXML
    protected void botao4OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao4.getText());
        expressao.append(botao4.getText());


    }

    @FXML
    protected void botao5OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao5.getText());
        expressao.append(botao5.getText());


    }

    @FXML
    protected void botao6OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao6.getText());
        expressao.append(botao6.getText());


    }

    @FXML
    protected void botao7Onclick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao7.getText());
        expressao.append(botao7.getText());


    }

    @FXML
    protected  void botao8Onclick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao8.getText());
        expressao.append(botao8.getText());


    }

    @FXML
    protected void botao9Onclick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+botao9.getText());
        expressao.append(botao9.getText());


    }

    @FXML
    protected  void divisaoOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+divisao.getText());
        expressao.append(divisao.getText());

    }

    @FXML
    protected void fatorialOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+fatorial.getText());
        int tamanho= visorLabel.getText().length();
        expressao.replace(tamanho-2,tamanho-1,"");
        expressao.append(calculadora.calculateFatorialInExpression(visorLabel.getText()));
        System.out.println(expressao.toString());
    }

    @FXML
    protected  void igualOnClick(ActionEvent event) {
        visorLabel.setText(calculadora.resultado(expressao.toString()));
        expressao.setLength(0);
    }

    @FXML
    protected void limparOnClick(ActionEvent event) {
        expressao.setLength(0);
        visorLabel.setText("");
    }

    @FXML
    protected void multiplicacaoOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+multiplicacao.getText());
        expressao.append(calculadora.multiplicacao());

    }

    @FXML
    protected void parenteses1OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+parenteses1.getText());
        expressao.append( parenteses1.getText());
    }

    @FXML
    protected  void parenteses2OnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+parenteses2.getText());
        expressao.append( parenteses2.getText());
    }

    @FXML
    protected  void piOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+pi.getText());
        expressao.append(calculadora.pi());

    }

    @FXML
    protected  void pontoOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+ponto.getText());
        expressao.append( ponto.getText());
    }

    @FXML
    protected void porcentagemOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+porcentagem.getText());
        expressao.append(calculadora.porcentagem());

    }

    @FXML
    protected void potenciaOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+potencia.getText()+"2");
        int tamanho=visorLabel.getText().length();
        expressao.replace(tamanho-4, tamanho-1, "");
        expressao.append(calculadora.pow(String.valueOf(visorLabel.getText().charAt(tamanho-4))));
        System.out.println(expressao.toString());

    }

    @FXML
    protected void raizOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+raiz.getText());
        int tamanho=visorLabel.getText().length();
        expressao.replace(tamanho-2, tamanho-1, "");
        expressao.append(calculadora.sqrt(String.valueOf(visorLabel.getText().charAt(tamanho-2))));
        System.out.println(expressao.toString());

    }

    @FXML
    protected void somaOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+soma.getText());
        expressao.append(soma.getText());
    }

    @FXML
    protected void subtracaoOnClick(ActionEvent event) {
        String visor= visorLabel.getText();
        visorLabel.setText(visor+subtracao.getText());
        expressao.append(subtracao.getText());

    }


}

