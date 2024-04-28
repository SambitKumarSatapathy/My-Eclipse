

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int id;
	private String name;
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn,inverseJoinColumns = @JoinColumn)
	private List<Child> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Child> getStudents() {
		return students;
	}
	public void setStudents(List<Child> students) {
		this.students = students;
	}
	

}
