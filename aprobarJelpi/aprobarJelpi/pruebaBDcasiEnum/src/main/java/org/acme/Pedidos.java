package org.acme;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


@Entity
@Table(name="pedidos")
public class Pedidos {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ord_id")
    private Long id; 
    
    @ManyToOne
	@JoinColumn(name="ord_user")
	private User user;
	
	@JoinColumn(name="ord_product")
	private Products product;

	public Pedidos() {}

	public Pedidos(User user, Products product) {
		this.user = user;
		this.product = product;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public User getUser() {
		return this.user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return this.getUser().getName() + " " + this.getProduct().getName();
	}
}
