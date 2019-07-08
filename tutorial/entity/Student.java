package net.javaguides.springboot.tutorial.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;
    
    @Column(name = "age")
    private String age;
    
    @Column(name = "gender")
    private String gender;
    
    @Column(name = "Zodiac")
    private String zodiac;
    
    @Column(name = "Profession")
    private String profession;
    
    
    
    
     
    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private long phoneNo;
    
    public Student() {}

    public Student(String name,String age,String gender,String zodiac,String profession, String email) {
        this.name = name;
        this.age=age;
        this.gender=gender;
        this.zodiac=zodiac;
        this.profession=profession;
        
        this.email = email;
             
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getZodiac() {
		return zodiac;
	}

	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	

	
	
	
}