package application;

import mundo.*;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class SampleController {

	// Relation model
	private Fornite fr;

	@FXML
	private AnchorPane anchorPrincipal;

	@FXML
	private ImageView wallpaperFortnite;

	@FXML
	private TabPane tabPanePrincipal;

	@FXML
	private Tab topCell;

	@FXML
	private AnchorPane anchorPaneCell;

	@FXML
	private ListView<Player> listCell;

	@FXML
	private ScrollBar scrCell;

	@FXML
	private ToggleButton butStartCell;

	@FXML
	private Tab topPC;

	@FXML
	private AnchorPane anchorPanePC;

	@FXML
	private ListView<Player> listPC;

	@FXML
	private ScrollBar scrPC;

	@FXML
	private ToggleButton butStartPC;

	@FXML
	private Tab topConsole;

	@FXML
	private AnchorPane anchorPaneConsole;

	@FXML
	private ListView<Player> listConsole;

	@FXML
	private ScrollBar scrConsole;

	@FXML
	private ToggleButton butStartConsole;

	@FXML
	private Tab tabSanValentin;

	@FXML
	private AnchorPane anchorPaneSanValentin;

	@FXML
	private ImageView imgSanValentin;

	public void initialize() {
		fr = new Fornite();
	}

	@FXML
	void actionButCell(ActionEvent event) {
		ArrayList<Player> abc = fr.listPlayers();
		abc.add(new Player("Douglas", 0, "", 0, 0, " ", null));
		abc.add(new Player("El papacito", 0, "", 0, 0, " ", null));

		ObservableList<Player> gg = FXCollections.observableArrayList();

		for (int i = 0; i < abc.size(); i++) {
			gg.add(abc.get(i));
		}

		listCell.setItems(gg);
	}

	@FXML
	void actionButConsole(ActionEvent event) {
		ArrayList<Player> abc = fr.listPlayers();
		abc.add(new Player("Laura y Huertas", 0, "", 0, 0, " ", null));
		abc.add(new Player("Juntos x 100 pre", 0, "", 0, 0, " ", null));

		ObservableList<Player> gg = FXCollections.observableArrayList();

		for (int i = 0; i < abc.size(); i++) {
			gg.add(abc.get(i));
		}

		listConsole.setItems(gg);
	}

	@FXML
	void actionButPC(ActionEvent event) {
		ArrayList<Player> abc = fr.listPlayers();
		abc.add(new Player("David Obando y Ruby", 0, "", 0, 0, " ", null));
		abc.add(new Player("Juntos x 100 pre", 0, "", 0, 0, " ", null));

		ObservableList<Player> gg = FXCollections.observableArrayList();

		for (int i = 0; i < abc.size(); i++) {
			gg.add(abc.get(i));
		}

		listPC.setItems(gg);
	}

}
