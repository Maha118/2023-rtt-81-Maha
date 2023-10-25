package org.perscholas.database.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


	@Entity

	@Table(name = "orders")

	public class Order {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Integer id;
		
		@ManyToOne(fetch = FetchType.EAGER, optional = false)

	   @JoinColumn(name = "customer_id", nullable = false)
        private Customer customer;

		@Column(name = "order_date")
		@Temporal(TemporalType.DATE)
		private Date orderDate;

		@Column(name = "required_date")
		@Temporal(TemporalType.DATE)
		private Date requiredDate;

		@Column(name = "shipped_date")
		@Temporal(TemporalType.DATE)
		private Date shippedDate;

		@Column(name = "status")
		private String status;

		@Column(name = "comments", columnDefinition = "text")
        private String comments;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public Date getRequiredDate() {
			return requiredDate;
		}

		public void setRequiredDate(Date requiredDate) {
			this.requiredDate = requiredDate;
		}

		public Date getShippedDate() {
			return shippedDate;
		}

		public void setShippedDate(Date shippedDate) {
			this.shippedDate = shippedDate;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		
		

	}


