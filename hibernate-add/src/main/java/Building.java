

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Building {
	@Id
	private int bid;
	private String name;
	private int floor;
	@OneToOne
	private Address a;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}

}
