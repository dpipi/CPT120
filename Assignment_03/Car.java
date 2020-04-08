package Assignment_03;

// Car Class
public class Car {
	// Create instance(member) variables for title and location
	private String make;
	private String model;
	private String color;

	// Create instance method
	public Car(String carMake, String carModel, String carColor) {
		this.make = carMake;
		this.model = carModel;
		this.color = carColor;
	}

	// Create get method for make
	public String getMake() {
		return this.make;
	}

	// Create get method for model
	public String getModel() {
		return this.model;
	}

	// Create get method for color
	public String getColor() {
		return this.color;
	}

	// Create set method for make
	public void setMake(String carMake) {
		this.make = carMake;
	}

	// Create set method for model
	public void setModel(String carModel) {
		this.model = carModel;
	}

	// Create set method for color
	public void setColor(String carColor) {
		this.color = carColor;
	}

}
