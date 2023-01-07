package Janela;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Janela extends Application {

	// metodo de Applicatino
	@Override
	public void start(Stage primaryStage) throws Exception {

		// setando o titulo
		primaryStage.setTitle("1º Contato");

		// criando um botão
		Button bta = new Button("Sair");
		Button btb = new Button("B");
		Button btc = new Button("C");
		Button btd = new Button("D");

		// quando clicar no botão A, a aplicação irá fechar
		bta.setOnAction(e -> {
			System.exit(0);
		});

		// quando clicar no botão B, a aplicação irá fechar
		btb.setOnAction(e -> {
			System.out.println("B");
		});

		// quando clicar no botão C, a aplicação irá fechar
		btc.setOnAction(e -> {
			System.out.println("C");
		});

		// quando clicar no botão D, a aplicação irá fechar
		btd.setOnAction(e -> {
			System.out.println("D");
		});

		// criando vertical box
		// VBox box = new VBox();
		// criando hotizontal box
		HBox box = new HBox();

		// utilizando algumas propriedades do vb
		// alinhamento, posição no centro
		box.setAlignment(Pos.CENTER);

		// espaço entre botoes
		box.setSpacing(10);

		// adicionando elementos botões, na vb
		box.getChildren().add(bta);
		box.getChildren().add(btb);
		box.getChildren().add(btc);
		box.getChildren().add(btd);

		// criando a cena e definindo o tamanho(largura, altura)
		Scene unicaCena = new Scene(box, 250, 200);

		// mostrando a cena criada
		primaryStage.setScene(unicaCena);

		// Mostrar primeiro palco 'tela'
		primaryStage.show();

	}

	public void iniciaJanela(String[] args) {
		launch(args);
	}

}
