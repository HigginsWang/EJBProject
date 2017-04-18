package entity;

import java.io.Serializable;
import java.lang.String;

/**
 * ID class for entity: Book
 *
 */ 
public class BookPK  implements Serializable {   
   
	         
	private int id;         
	private String name;         
	private int num;         
	private double price;
	private static final long serialVersionUID = 1L;

	public BookPK() {}

	

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
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof BookPK)) {
			return false;
		}
		BookPK other = (BookPK) o;
		return true
			&& getId() == other.getId()
			&& (getName() == null ? other.getName() == null : getName().equals(other.getName()))
			&& getNum() == other.getNum()
			&& (Double.doubleToLongBits(getPrice()) == Double.doubleToLongBits(other.getPrice()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId();
		result = prime * result + (getName() == null ? 0 : getName().hashCode());
		result = prime * result + getNum();
		result = prime * result + ((int) (Double.doubleToLongBits(getPrice() ) ^ (Double.doubleToLongBits(getPrice()) >>> 32)));
		return result;
	}
   
   
}
