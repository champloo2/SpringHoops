package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Hulahoop {
	
	private long id;
	 private String color;
	 private double outerDiamInches;
	 private boolean isPolyPro;
	 @Autowired
	 private Hoopshop hoopShop;
	 
	public Hulahoop() {
		super();
	}

	public Hulahoop(String color) {
		super();
		this.color = color;
	}

	public Hulahoop(String color, double outerDiamInches) {
		super();
		this.color = color;
		this.outerDiamInches = outerDiamInches;
	}

	public Hulahoop(String color, double outerDiamInches, boolean isPolyPro) {
		super();
		this.color = color;
		this.outerDiamInches = outerDiamInches;
		this.isPolyPro = isPolyPro;
	}

	public Hulahoop(long id, String color, double outerDiamInches, boolean isPolyPro) {
		super();
		this.id = id;
		this.color = color;
		this.outerDiamInches = outerDiamInches;
		this.isPolyPro = isPolyPro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getOuterDiamInches() {
		return outerDiamInches;
	}

	public void setOuterDiamInches(double outerDiamInches) {
		this.outerDiamInches = outerDiamInches;
	}

	public boolean isPolyPro() {
		return isPolyPro;
	}

	public void setPolyPro(boolean isPolyPro) {
		this.isPolyPro = isPolyPro;
	}

	
	public Hoopshop getHoopShop() {
		return hoopShop;
	}

	public void setHoopShop(Hoopshop hoopShop) {
		this.hoopShop = hoopShop;
	}

	@Override
	public String toString() {
		return "Hulahoop [id=" + id + ", color=" + color + ", outerDiamInches=" + outerDiamInches + ", isPolyPro="
				+ isPolyPro + ", hoopShop=" + hoopShop + "]";
	}

	
	
	

}
