package com.example.hw31;

import javafx.application.Application;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventListener;

public class HW3Rucker extends Application implements EventListener{
    @Override
    public void start(Stage primaryStage) throws IOException {
        /** intializing the panes used for both scenes */
        FlowPane flowPane = new FlowPane();
        GridPane gridPane = new GridPane();

        /** structuring the layout of the gridpane */
        ColumnConstraints firstColumn = new ColumnConstraints();
        firstColumn.setPercentWidth(25);
        ColumnConstraints secondColumn = new ColumnConstraints();
        secondColumn.setPercentWidth(50);
        ColumnConstraints thirdColumn = new ColumnConstraints();
        thirdColumn.setPercentWidth(25);
        gridPane.getColumnConstraints().addAll(firstColumn,secondColumn,thirdColumn);
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setHgap(20);
        gridPane.setVgap(5);
        gridPane.add(new Label("Item ID:"), 0, 0);


        ComboBox cBox = new ComboBox();
        cBox.setPrefHeight(10);
        cBox.setPrefWidth(200);
        cBox.setScaleZ(10);
        gridPane.add(cBox,1,0);
        gridPane.add(new Label("Item Name:"), 0, 1);
        gridPane.add(new Label("NA"), 1, 1);

        gridPane.add(new Label("Item Price:"), 0, 2);
        gridPane.add(new Label("$0.00"), 1, 2);

        gridPane.add(new Label("Quantity:"), 0, 3);
        TextField quantity = new TextField();
        quantity.setPrefWidth(65);
        quantity.setPrefHeight(10);
        gridPane.add(quantity,1,3);
        gridPane.add(new Label("Item Total: "), 0, 4);
        gridPane.add(new Label("$0.00"), 1, 4);

        Button addBtn = new Button();
        addBtn.setText("Add");
        addBtn.setPrefWidth(300);



        gridPane.add(addBtn,1,6);

        TextArea textArea = new TextArea();
        textArea.setPrefHeight(200);
        textArea.setPrefWidth(400);
        gridPane.add(textArea,1,7);

        gridPane.add(new Label("Sale Sub Total: "), 0, 8);
        gridPane.add(new Label("$0.00"), 1, 8);

        gridPane.add(new Label("Sale Tax Total (6%): "), 0, 9);
        gridPane.add(new Label("$0.00"), 1, 9);

        gridPane.add(new Label("Tendered:"), 0, 10);
        Button checkoutBtn = new Button();
        checkoutBtn.setText("Checkout");
        checkoutBtn.setPrefWidth(250);
        checkoutBtn.setScaleZ(10);
        gridPane.add(checkoutBtn,2,10);

        gridPane.add(new Label("Change:"), 0, 11);
        gridPane.add(new Label(" $0.00"), 1, 11);





        TextField checkoutBox = new TextField();
        checkoutBox.setPrefWidth(65);
        checkoutBox.setPrefHeight(10);

        gridPane.add(checkoutBox,1,10);
        primaryStage.setTitle("POST Register");

        Button doneBtn = new Button();
        doneBtn.setText("Done");
        doneBtn.setPrefWidth(100);
        gridPane.add(doneBtn,1,13);

        Button saleBtn = new Button();
        saleBtn.setText("New Sale");
        saleBtn.setStyle("-fx-border-color: black;");
        saleBtn.setPrefWidth(150);
        saleBtn.setPrefHeight(35);

        /** Creating the starting scene */
        Label label = new Label();
        label.setText("Welcome to Rucker's Store !!!");
        label.setFont(Font.font("Comic Sans MS",FontWeight.BOLD,15));
        Label label2 = new Label();
        label2.setFont(Font.font("Comic Sans Ms",FontWeight.BOLD,15));
        label2.setText("Total Sale for today is: $0.00");


        /** Adds all the nodes to the pane and aligns it */
        flowPane.getChildren().addAll(label,saleBtn,label2);
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.setVgap(60);
        flowPane.setAlignment(Pos.CENTER);








        /** Creating the scene */

        Scene scene = new Scene(flowPane,300,250);
        Scene scene2 = new Scene(gridPane,600,500);

        /**Event handlers that switches the scene when the buttons are clicked */
        saleBtn.setOnAction((e) -> {
            primaryStage.setScene(scene2);
            primaryStage.setTitle("New Sale");
        });
        doneBtn.setOnAction((e) -> {
            primaryStage.setScene(scene);
            primaryStage.setTitle("POST Register");


        });


        /** Shows the welcome scene */
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}