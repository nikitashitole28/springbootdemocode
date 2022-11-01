package demo.testexample.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Employee {
	@Id
private Integer id;
private String name;
private String addr;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer id, String name, String addr) {
	super();
	this.id = id;
	this.name = name;
	this.addr = addr;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
@Override
public int hashCode() {
	return Objects.hash(addr, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(addr, other.addr) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
}

}
