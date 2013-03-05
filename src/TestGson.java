import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class TestGson {

	public static void main(String[] args) {
		Gson gson = new Gson();
		String json = "[{\"runsheetId\": 1,\"shipments\": [{\"shipmentId\": \"AB11\",\"customer\": {\"customerId\": 11}},{\"shipmentId\": \"AB12\",\"customer\": {\"customerId\": 12}}]},{\"runsheetId\": 2,\"shipments\": [{\"shipmentId\": \"AB21\",\"customer\": {\"customerId\": 21}},{\"shipmentId\": \"AB22\",\"customer\": {\"customerId\": 22}}]}]";
		System.out.println(json);
		Type type = new TypeToken<ArrayList<Runsheet>>(){}.getType();
		ArrayList<Runsheet> runsheets = gson.fromJson(json, type);
		
		
		for(int i = 0; i< runsheets.size();i++) {			
			System.out.println("-->Runsheet :"+ runsheets.get(i).getRunsheetId());
			ArrayList<Shipment> shipments = runsheets.get(i).getShipments();
			for(int j = 0; j<shipments.size(); j++) {
				System.out.println("---->Shipment :"+ shipments.get(j).getShipmentId());
				Customer customer = shipments.get(j).getCustomer();
				System.out.println("-------->Customer :"+ customer.getCustomerId()); 
			}
			
		}
	}
}


class Runsheet {
	private int runsheetId;
	private ArrayList<Shipment> shipments;
	public int getRunsheetId() {
		return runsheetId;
	}
	public void setRunsheetId(int runsheetId) {
		this.runsheetId = runsheetId;
	}
	public ArrayList<Shipment> getShipments() {
		return shipments;
	}
	public void setShipments(ArrayList<Shipment> shipments) {
		this.shipments = shipments;
	}
}

class Shipment {
	private String shipmentId;
	private Customer customer;
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}

class Customer {
	private int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}



