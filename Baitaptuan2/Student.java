package Baitaptuan2;


public class Student {
	private String id;
	private String name;
	private String group;
	private String email;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	Student(){
		name="Student";
		id="000";
		group="K59CB";
		email="uet@vnu.edu.vn";
	}
	public Student(String nid, String n, String em) {
		this.id=nid;
		this.name = n;
		this.group="K59CB";
		this.email=em;	
	}

	Student(Student s){
		id=s.id;
		name=s.name;
		group=s.group;
		email=s.email;
	}
	
	
	public String getInfo() {
		return  ("MSSV: "+this.id+" Tên: "+this.name+" Nhom: "+this.group+" Gmail: "+this.email);
		
	}

}
