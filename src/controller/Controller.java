package controller;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import com.jfoenix.controls.JFXTextArea;

public class Controller {
	
	public void hideAll() {
		ancStart.setVisible(false);
		ancBrazil.setVisible(false);
		ancCuba.setVisible(false);
		ancDominicanRepublic.setVisible(false);
		ancTrinidadAndTobago.setVisible(false);
	}
	
///////////////////////// START MENU ////////////////////////////
	
	@FXML
	private Label lblDestinationMenu;
	@FXML
	private AnchorPane ancMenu;
	@FXML
	private AnchorPane ancSeparatorMenu;
	@FXML
	private ImageView imgPlaneMenu;
	@FXML
	private ImageView imgDestinationMenu;
	@FXML
	private ImageView imgPalmMenu;
	@FXML
	private JFXButton btnBrazil;
	@FXML
	private JFXButton btnCuba;
	@FXML
	private JFXButton btnDominicanRepublic;
	@FXML
	private JFXButton btnTrinidadAndTobago;
	@FXML
	private JFXButton btnDansresorAB;
	
	
///////////////////////// START START //////////////////////////////
	
	public void btnDansresorAB_Click(ActionEvent event) {
		hideAll();
		ancStart.setVisible(true);
	}

	@FXML
	private AnchorPane ancStart;
	@FXML
	private Label lblStartStart;
	@FXML
	private Label lblChooseYourLocationStart;
	@FXML
	private ImageView imgPalm;

//////////////////////// START BRAZIL //////////////////////////////
	
	public void btnBrazil_Click(ActionEvent event) {
		hideAll();
		ancBrazil.setVisible(true);
	}
	
	@FXML
	private AnchorPane ancBrazil;
	@FXML
	private Label lblBrazilBrazil;
	@FXML
	private JFXTextArea areaAgentsBrazil;
	@FXML
	private JFXTextArea areaTourGuidesBrazil;
	@FXML
	private Label lblAgentsBrazil;
	@FXML
	private Label lblTourGuidesBrazil;
	@FXML
	private AnchorPane ancSeparatorBrazil;
	@FXML
	private ImageView imgPalmBrazil;
	
////////////////////////// START CUBA ///////////////////////////////
	
	public void btnCuba_Click(ActionEvent event) {
		hideAll();
		ancCuba.setVisible(true);
	}
	
	@FXML
	private AnchorPane ancCuba;
	@FXML
	private Label lblCubaCuba;
	@FXML
	private JFXTextArea areaAgentsCuba;
	@FXML
	private JFXTextArea areaTourGuidesCuba;
	@FXML
	private Label lblAgentsCuba;
	@FXML
	private Label lblTourGuidesCuba;
	@FXML
	private AnchorPane ancSeparatorCuba;
	@FXML
	private ImageView imgPalmCuba;
	
//////////////////////// START DOMINICAN REPUBLIC /////////////////////
	
	public void btnDominicanRepublic_Click(ActionEvent event) {
		hideAll();
		ancDominicanRepublic.setVisible(true);
	}
	
	@FXML
	private AnchorPane ancDominicanRepublic;
	@FXML
	private Label lblDominicanRepublic;
	@FXML
	private JFXTextArea areaAgentsDominicanRepublic;
	@FXML
	private JFXTextArea areaTourGuidesDominicanRepublic;
	@FXML
	private Label lblAgentsDominicanRepublic;
	@FXML
	private Label lblTourGuidesDominicanRepublic;
	@FXML
	private AnchorPane ancSeparatorDominicanRepublic;
	@FXML
	private ImageView imgPalmDominicanRepublic;
	
/////////////////////// START TRINIDAD AND TOBAGO //////////////////////
	
	public void btnTrinidadAndTobago_Click(ActionEvent event) {
		hideAll();
		ancTrinidadAndTobago.setVisible(true);
	}
	
	@FXML
	private AnchorPane ancTrinidadAndTobago;
	@FXML
	private Label lblTrinidadAndTobago;
	@FXML
	private JFXTextArea areaAgentsTrinidadAndTobago;
	@FXML
	private JFXTextArea areaTourGuidesTrinidadAndTobago;
	@FXML
	private Label lblAgentsTrinidadAndTobago;
	@FXML
	private Label lblTourGuidesTrinidadAndTobago;
	@FXML
	private AnchorPane ancSeparatorTrinidadAndTobago;
	@FXML
	private ImageView imgPalmTrinidadAndTobago;
	
}
