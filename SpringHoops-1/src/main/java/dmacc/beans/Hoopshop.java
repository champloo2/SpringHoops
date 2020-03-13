package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Hoopshop {

	private String shopName;
	private String platform;
	private String igHandle;
	
	public Hoopshop() {
		super();
	}

	public Hoopshop(String shopName) {
		super();
		this.shopName = shopName;
	}

	public Hoopshop(String shopName, String platform, String igHandle) {
		super();
		this.shopName = shopName;
		this.platform = platform;
		this.igHandle = igHandle;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getIgHandle() {
		return igHandle;
	}

	public void setIgHandle(String igHandle) {
		this.igHandle = igHandle;
	}

	@Override
	public String toString() {
		return "Hoopshop [shopName=" + shopName + ", platform=" + platform + ", igHandle=" + igHandle + "]";
	}
	
	
	
}
