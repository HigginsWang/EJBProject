package entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Book
 *
 */
public class Book implements Serializable {

	 
	private int id; 
	private String name; 
	private int num; 
	private double price;
	private static final long serialVersionUID = 1L;	
	public Book() {
		super();
	} 
	   
	public int getId() {
 		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	   
	public String getName() {
 		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	   
	public int getNum() {
 		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	   
	public double getPrice() {
 		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
   
}
