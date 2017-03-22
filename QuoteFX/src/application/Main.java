package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Main extends Application {
	TextField txtModel, txtPrice, txtQuantity;
	Button plus, minus, add, total;
	Label getAll, quantity, price, model;
	int num;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			quantity = new Label("Quantity");
			model = new Label("Model");
			price = new Label("Price");
			txtModel = new TextField();
			txtPrice = new TextField();
			txtQuantity = new TextField();
			
			plus = new Button("+");
			minus = new Button("-");
			add = new Button("Add");
			total = new Button("Total");
			
			addAction();
			
			GridPane hardware = new GridPane();
			
			hardware.setAlignment(Pos.CENTER);
			
			setWidths();
			
			hardware.setHgap(10);
			hardware.setVgap(10);
			
			hardware.add(model, 0, 0);
			hardware.add(txtModel, 1, 0, 6, 1);
			hardware.add(price, 0, 1);
			hardware.add(txtPrice, 1, 1, 2, 1);
			hardware.add(quantity, 3, 1);
			hardware.add(txtQuantity, 4, 1, 1, 1);
			hardware.add(plus, 5, 1);
			hardware.add(minus, 6, 1);
			
			BorderPane root = new BorderPane();
			root.setCenter(hardware);
			Scene scene = new Scene(root,600,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setWidths(){
		txtPrice.setPrefWidth(70);
		txtQuantity.setPrefWidth(50);
	}
	
	public void addAction(){
		plus.setOnAction(e -> btnCode(e));
		minus.setOnAction(e -> btnCode(e));
		
		add.setOnAction(e -> btnCode(e));
		total.setOnAction(e ->btnCode(e));
	}
	
	public void btnCode(ActionEvent e){
		
		if (e.getSource() == plus){
			if (txtQuantity.getText()== null && txtQuantity.getText().isEmpty()){
				num = 1;
			}
			else{
				num = Integer.parseInt(txtQuantity.getText());
				num++;
			}
			txtQuantity.setText(Integer.toString(num));
		}
		
		else if(e.getSource() == minus){
			if (txtQuantity.getText()== null && txtQuantity.getText().isEmpty()){
				txtQuantity.setText("");
			}
			else{
				num = Integer.parseInt(txtQuantity.getText());
				if (num != 0){
					num--;
				}
				txtQuantity.setText(Integer.toString(num));
			}
		}
		else if (e.getSource() == add){
			
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
