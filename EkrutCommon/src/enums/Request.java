package enums;

public enum Request {

	Connect_request {
		public String toString() {
			return "Request connect";
		}
	},
	Disconnect_request {
		public String toString() {
			return "Request Disconnect";
		}
	},
	Connected {
		public String toString() {
			return "Client Connected";
		}
	},
	Disconnected {

		public String toString() {
			return "Client Connected";
		}

	},
	Login_Request {

		public String toString() {
			return "Client request Login";
		}

	},
	LoggedIn_Succses {

		public String toString() {
			return "log in succsess";
		}

	},
	LoggedIn_UnsuccsesAlreadyLoggedIn {

		public String toString() {
			return "User is already logged in";
		}

	},
	Unsuccsesful_LogIn {
		public String toString() {
			return "Error! Wrong username OR password";
		}
	},
	Logout_request {
		public String toString() {
			return "Request Logout";
		}
	},
	LoggedOut {
		public String toString() {
			return "User Logged out";
		}
	},
	Get_Devices_By_Area {
		public String toString() {
			return "Request devices";
		}
	},
	Devices_Imported {
		public String toString() {
			return "Devices imported successfully!";
		}
	},
	GetOrdersReportData {
		public String toString() {
			return "Request orders";
		}

	},
	OrdersReportData_Imported {
		public String toString() {
			return "Orders data imported successfully!";
		}
	},
	Threshold_Update_Request {
		public String toString() {
			return "Request update threshold";
		}
	},
	Threshold_Updated {
		public String toString() {
			return "Threshold updated successfully!";
		}
	},
	Get_Products {
		public String toString() {
			return "Request updated Products!";
		}
	},
	Products_Imported {
		public String toString() {
			return "Products updated successfully!";
		}
	},
	Get_Costumer {
		public String toString() {
			return "Request update Costumer";
		}
	},
	Costumer_Imported {
		public String toString() {
			return "Costumer imported succsesfuly!";
		}
	},
}
