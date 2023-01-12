package clientControllers;

import client.ChatClient;
import client.ClientUI;
import entities.Device;
import entities.Message;
import enums.Request;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ChooseDevice_PickUpController {
	SetSceneController newScreen = new SetSceneController();
	@FXML
	private Button btnBack;

	@FXML
	private Button btnConfirm;

	@FXML
	private Button btnexit1;

	@FXML
	private ComboBox<String> cmbDevice;
	@FXML
	private Label lblError;
    @FXML
    private ImageView ChooseDeviceImage;

	@FXML
	public void initialize() {
		lblError.setVisible(false);
		ClientUI.chat.accept(new Message(Request.Get_Devices_By_Area,
				ChatClient.costumerController.getCostumer().getRegion().toString()));
		for (Device device : ChatClient.deviceController.getAreaDevices()) {
			cmbDevice.getItems().add(device.getDeviceName());
		}
		
		Image image = new Image("/images/PickUpImage.jpeg");
		ChooseDeviceImage.setImage(image);
	}

	@FXML
	void clickOnConfirm(ActionEvent event) {
		if (cmbDevice.getValue() == null) {
			lblError.setVisible(true);
		} else {
			ChatClient.costumerController.getCostumer().setDevice(cmbDevice.getValue());
			((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
			newScreen.setScreen(new Stage(), "/clientGUI/Client_OrderScreen.fxml");
		}
	}

	@FXML
	void getExitBtn(ActionEvent event) {
		newScreen.exitOrLogOut(event, false);
	}

	@FXML
	void clickOnBack(ActionEvent event) {
		// stop counting 15 minutes for order
		ChatClient.checkWindowTimeThread.interrupt();
		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
		newScreen.setScreen(new Stage(), "/clientGUI/Client_OL_MainView.fxml");
	}

}
