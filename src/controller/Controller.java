package controller;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import model.Agent;
import model.AgentRegister;
import model.Student;
import model.TourGuide;
import model.TourGuideRegister;
import utilities.Validator;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import com.jfoenix.controls.JFXTextArea;

public class Controller {
	
	AgentRegister agentReg = new AgentRegister();
	TourGuideRegister tourGuideReg = new TourGuideRegister();
	
	public void hideAll() {
		ancStart.setVisible(false);
		ancAdd.setVisible(false);
		ancUpdate.setVisible(false);
		ancFind.setVisible(false);
	}
	
///////////////////////// START MENU ////////////////////////////
	
	@FXML
	private Label lblAgentAndTourGuideMenu;
	@FXML
	private AnchorPane ancMenu;
	@FXML
	private AnchorPane ancSeparatorVerticalMenu;
	@FXML
	private AnchorPane ancSeparatorHorizontalMenu;
	@FXML
	private ImageView imgPlaneMenu;
	@FXML
	private ImageView imgPalmMenu;
	@FXML
	private JFXButton btnUpdateMenu;
	@FXML
	private JFXButton btnAddMenu;
	@FXML
	private JFXButton btnFindMenu;
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
	private ImageView imgPalm;

//////////////////////// START ADD //////////////////////////////
	
	public void btnAddMenu_Click(ActionEvent event) {
		hideAll();
		ancAdd.setVisible(true);
	}
	public void btnAddAgent_Click(ActionEvent event) {
		String name = txtNameAgentAdd.getText();
		String age = txtAgeAgentAdd.getText();
		String mail  = txtEMailAgentAdd.getText();
		String language = txtLanguageAgentAdd.getText();
		String destination = txtDestinationAgentAdd.getText();
		String phoneNumber = txtTelephoneNumberAgentAdd.getText();
		Agent tmpAgent = new Agent();
		tmpAgent.setName(name);
		tmpAgent.setMail(mail);
		tmpAgent.setAge(age);
		tmpAgent.setLanguage(language);
		tmpAgent.setDestination(destination);
		tmpAgent.setPhoneNumber(phoneNumber);
		tmpAgent.generateEmployeeID();
		txtEmployeeIDAgentAdd.setText(tmpAgent.getEmployeeID());
		agentReg.addAgent(tmpAgent);
	}
	
	public void btnAddTourGuide_Click(ActionEvent event) {
		String name = txtNameTourGuideAdd.getText();
		String age = txtAgeTourGuideAdd.getText();
		String mail  = txtEMailTourGuideAdd.getText();
		String language = txtLanguageTourGuideAdd.getText();
		String destination = txtDestinationTourGuideAdd.getText();
		String phoneNumber = txtTelephoneNumberTourGuideAdd.getText();
		TourGuide tmpTourGuide = new TourGuide();
		tmpTourGuide.setName(name);
		tmpTourGuide.setMail(mail);
		tmpTourGuide.setAge(age);
		tmpTourGuide.setLanguage(language);
		tmpTourGuide.setDestination(destination);
		tmpTourGuide.setPhoneNumber(phoneNumber);
		tmpTourGuide.generateEmployeeID();
		txtEmployeeIDTourGuideAdd.setText(tmpTourGuide.getEmployeeID());
		tourGuideReg.addTourGuide(tmpTourGuide);
	}
	
	@FXML
	private AnchorPane ancAdd;
	@FXML
	private Label lblAddAdd;
	@FXML
	private Label lblAgentAdd;
	@FXML
	private Label lblTourGuideAdd;
	@FXML
	private JFXTextField txtEmployeeIDAgentAdd;
	@FXML
	private JFXTextField txtNameAgentAdd;
	@FXML
	private JFXTextField txtAgeAgentAdd;
	@FXML
	private JFXTextField txtEMailAgentAdd;
	@FXML
	private JFXTextField txtTelephoneNumberAgentAdd;
	@FXML
	private JFXTextField txtLanguageAgentAdd;
	@FXML
	private JFXTextField txtDestinationAgentAdd;
	@FXML
	private JFXTextField txtEmployeeIDTourGuideAdd;
	@FXML
	private JFXTextField txtNameTourGuideAdd;
	@FXML
	private JFXTextField txtAgeTourGuideAdd;
	@FXML
	private JFXTextField txtEMailTourGuideAdd;
	@FXML
	private JFXTextField txtTelephoneNumberTourGuideAdd;
	@FXML
	private JFXTextField txtLanguageTourGuideAdd;
	@FXML
	private JFXTextField txtDestinationTourGuideAdd;
	@FXML
	private AnchorPane ancSeparatorAdd;
	@FXML
	private ImageView imgPalmAdd;
	@FXML
	private JFXButton btnAddAgentAdd;
	@FXML 
	private JFXButton btnAddTourGuideAdd;
	
////////////////////////// START UPDATE ///////////////////////////////
	
	public void btnUpdateMenu_Click(ActionEvent event) {
		hideAll();
		ancUpdate.setVisible(true);
	}
	public void btnFindAgent_Click(ActionEvent event) {
		String employeeID = txtEmployeeIDAgentUpdate.getText();
		int i = 0;
		for (Agent tmpAgent : agentReg.getAgentReg()) {
			if (!tmpAgent.getEmployeeID().equals(employeeID)) {
				i++;
			}
		}
		if (i == agentReg.getAgentReg().size()) {
			employeeID = null;
		}
		for (Agent tmpAgent : agentReg.getAgentReg()) {
			if (tmpAgent.getEmployeeID().equals(employeeID)) {
				txtNameAgentUpdate.setText(tmpAgent.getName());
				txtAgeAgentUpdate.setText(tmpAgent.getAge());
				txtEMailAgentUpdate.setText(tmpAgent.getMail());
				txtTelephoneNumberAgentUpdate.setText(tmpAgent.getPhoneNumber());
				txtLanguageAgentUpdate.setText(tmpAgent.getLanguage());
				txtDestinationAgentUpdate.setText(tmpAgent.getDestination());
	}
		}
			}
	
	public void btnFindTourGuide_Click(ActionEvent event) {
		String employeeID = txtEmployeeIDTourGuideUpdate.getText();
		int i = 0;
		for (TourGuide tmpTourGuide : tourGuideReg.getTourGuideReg()) {
			if (!tmpTourGuide.getEmployeeID().equals(employeeID)) {
				i++;
			}
			if (i == tourGuideReg.getTourGuideReg().size()) {
				employeeID = null;
			}
			for (Agent tmpTourGuide : tourGuideReg.getTourGuideReg()) {
				if (tmpTourGuide.getEmployeeID().equals(employeeID)) {
					txtNameTourGuideUpdate.setText(tmpTourGuide.getName());
					txtAgeTourGuideUpdate.setText(tmpTourGuide.getAge());
					txtEMailTourGuideUpdate.setText(tmpTourGuide.getMail());
					txtTelephoneNumberTourGuideUpdate.setText(tmpTourGuide.getPhoneNumber());
					txtLanguageTourGuideUpdate.setText(tmpTourGuide.getLanguage());
					txtDestinationTourGuideUpdate.setText(tmpTourGuide.getDestination());
				}
			}
		}
	}
	public void btnUpdateAgent_Click(ActionEvent event) {
		String employeeID = txtEmployeeIDAgentUpdate.getText();
		String name = txtNameAgentUpdate.getText();
		String age = txtAgeAgentUpdate.getText();
		String mail = txtEMailAgentUpdate.getText();
		String phoneNumber = txtTelephoneNumberAgentUpdate.getText();
		String language = txtLanguageAgentUpdate.getText();
		String destination = txtDestinationAgentUpdate.getText();

		for (Agent tmpAgent : agentReg.getAgentReg()) {
			if (tmpAgent.getEmployeeID().equals(employeeID)) {
				tmpAgent.setName(txtNameAgentUpdate.getText());
				tmpAgent.setAge(txtAgeAgentUpdate.getText());
				tmpAgent.setMail(txtEMailAgentUpdate.getText());
				tmpAgent.setPhoneNumber(txtTelephoneNumberAgentUpdate.getText());
				tmpAgent.setLanguage(txtLanguageAgentUpdate.getText());
				tmpAgent.setDestination(txtDestinationAgentUpdate.getText());
			}
		}
	}
	public void btnUpdateTourGuide_Click(ActionEvent event) {
		String employeeID = txtEmployeeIDTourGuideUpdate.getText();
		String name = txtNameTourGuideUpdate.getText();
		String age = txtAgeTourGuideUpdate.getText();
		String mail = txtEMailTourGuideUpdate.getText();
		String phoneNumber = txtTelephoneNumberTourGuideUpdate.getText();
		String language = txtLanguageTourGuideUpdate.getText();
		String destination = txtDestinationTourGuideUpdate.getText();

		for (TourGuide tmpTourGuide : tourGuideReg.getTourGuideReg()) {
			if (tmpTourGuide.getEmployeeID().equals(employeeID)) {
				tmpTourGuide.setName(txtNameTourGuideUpdate.getText());
				tmpTourGuide.setAge(txtAgeTourGuideUpdate.getText());
				tmpTourGuide.setMail(txtEMailTourGuideUpdate.getText());
				tmpTourGuide.setPhoneNumber(txtTelephoneNumberTourGuideUpdate.getText());
				tmpTourGuide.setLanguage(txtLanguageTourGuideUpdate.getText());
				tmpTourGuide.setDestination(txtDestinationTourGuideUpdate.getText());
			}
		}
	}
	
	@FXML
	private AnchorPane ancUpdate;
	@FXML
	private Label lblUpdateUpdate;
	@FXML
	private Label lblAgentsUpdate;
	@FXML
	private Label lblTourGuidesUpdate;
	@FXML
	private AnchorPane ancSeparatorUpdate;
	@FXML
	private ImageView imgPalmUpdate;
	@FXML
	private JFXButton btnFindAgentUpdate;
	@FXML
	private JFXButton btnUpdateAgentUpdate;
	@FXML
	private JFXButton btnFindTourGuideUpdate;
	@FXML
	private JFXButton btnUpdateTourGuideUpdate;
	@FXML
	private JFXTextField txtEmployeeIDAgentUpdate;
	@FXML
	private JFXTextField txtNameAgentUpdate;
	@FXML
	private JFXTextField txtAgeAgentUpdate;
	@FXML
	private JFXTextField txtEMailAgentUpdate;
	@FXML
	private JFXTextField txtTelephoneNumberAgentUpdate;
	@FXML
	private JFXTextField txtLanguageAgentUpdate;
	@FXML
	private JFXTextField txtDestinationAgentUpdate;
	@FXML
	private JFXTextField txtEmployeeIDTourGuideUpdate;
	@FXML
	private JFXTextField txtNameTourGuideUpdate;
	@FXML
	private JFXTextField txtAgeTourGuideUpdate;
	@FXML
	private JFXTextField txtEMailTourGuideUpdate;
	@FXML
	private JFXTextField txtTelephoneNumberTourGuideUpdate;
	@FXML
	private JFXTextField txtLanguageTourGuideUpdate;
	@FXML
	private JFXTextField txtDestinationTourGuideUpdate;
	
///////////////////////////START FIND//////////////////////////////
	
	public void btnFindAllAgentsFind_Click(ActionEvent event) {
		areaAgentsFind
	}
	
	public void btnFindAllTourGuides_Click(ActionEvent event) {
		areaTourGuidesFind
	}
	
	@FXML
	private AnchorPane ancFind;
	@FXML
	private AnchorPane ancSeparatorFind;
	@FXML
	private Label lblFindFind;
	@FXML
	private ImageView imgPalmFind;
	@FXML
	private Label lblAgentsFind;
	@FXML
	private Label lblTourGuidesFind;
	@FXML
	private JFXTextArea areaAgentsFind;
	@FXML
	private JFXTextArea areaTourGuidesFind;
	@FXML
	private JFXButton btnFindAllAgentsFind;
	@FXML
	private JFXButton btnFindAllTourGuidesFind;
	
//////////////////////////////////////////////////////////////////
	
	

}
