package javacore16;

public class Car {
	
	public String brand;
	public boolean isNew;
	private String ownerName;
	private int coast;
	
	public Car(String brand, boolean isNew) {
		super();
		this.brand = brand;
		this.isNew = isNew;
	}

	public Car(String brand, boolean isNew, String ownerName, int coast) {
		super();
		this.brand = brand;
		this.isNew = isNew;
		this.ownerName = ownerName;
		this.coast = coast;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getCoast() {
		return coast;
	}

	public void setCoast(int coast) {
		this.coast = coast;
	}
	
	public void myMethod(String args) {
		System.out.println("Hello my myMethod");
	}
	
	public void myMethod2(int a, String args) {
		System.out.println("Hello myMethod2");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + coast;
		result = prime * result + (isNew ? 1231 : 1237);
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (coast != other.coast)
			return false;
		if (isNew != other.isNew)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", isNew=" + isNew + ", ownerName=" + ownerName + ", coast=" + coast + "]";
	}
	
	

}
