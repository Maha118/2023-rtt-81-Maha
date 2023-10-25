package org.perscholas.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private Integer id;

	@Column(name = "product_code")
	private String productCode;

	@Column(name = "product_name")
    private String productName;

	@Column(name = "productline_id")
	private Integer productlineId;

	@Column(name = "product_scale")
	private String productscale;

	@Column(name = "product_vendor")
	private String productvendor;
	

	@Column(name = "buy_price", columnDefinition = "Decimal(10,2)")
	private Double buyPrice;

	@Column(name = "msrp", columnDefinition = "Decimal(10,2)")
	private Double msrp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductlineId() {
		return productlineId;
	}

	public void setProductlineId(Integer productlineId) {
		this.productlineId = productlineId;
	}

	public String getProductscale() {
		return productscale;
	}

	public void setProductscale(String productscale) {
		this.productscale = productscale;
	}

	public String getProductvendor() {
		return productvendor;
	}

	public void setProductvendor(String productvendor) {
		this.productvendor = productvendor;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getMsrp() {
		return msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	
	
}
