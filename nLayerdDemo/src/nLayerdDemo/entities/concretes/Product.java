package nLayerdDemo.entities.concretes;

import nLayerdDemo.entities.abstracts.Entity;

public class Product implements Entity {
	private int id;
	private int categoryId;
	private String Name;
	private double  unitPrice;
	private int unitsInStocl;
	
	public Product() {
		
	}

	public Product(int id, int categoryId, String name, double unitPrice, int unitsInStocl) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		Name = name;
		this.unitPrice = unitPrice;
		this.unitsInStocl = unitsInStocl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStocl() {
		return unitsInStocl;
	}

	public void setUnitsInStocl(int unitsInStocl) {
		this.unitsInStocl = unitsInStocl;
	}
	
}
