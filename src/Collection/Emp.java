package Collection;


public class Emp implements Comparable<Emp>{
	
	private int id;
	private String name;
	private String phone;
	
	@Override
	public int compareTo(Emp o) {
		return this.id-o.id;
	}
	
	
	public Emp(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
