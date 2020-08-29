package Main;

public abstract class Person {

	private String name; 
	private String birth; 
	private String graduation; 
	private String cpf; 
	private String street; 
	private String neighbour;
	private String city; 
	private String zip; 
	private String number; 
	private String complement;
	private String email;
	private String phone;
	private Boolean isWhatsapp;
	private String gender; 
	private String category; 
	private String weight; 
	private String height; 
	private int code;
	
	public Person(
			String name,
			String birth,
			String graduation,
			String cpf,
			String street,
			String neighbour,
			String city,
			String zip,
			String number,
			String complement,
			String email,
			String phone,
			Boolean isWhatsapp,
			String gender,
			String category,
			String weight,
			String height,
			int code
			) {
		this.name = name;
		this.birth = birth;
		this.graduation = graduation;
		this.cpf = cpf;
		this.street = street;
		this.neighbour = neighbour;
		this.city = city;
		this.zip = zip;
		this.number = number;
		this.complement = complement;
		this.email = email;
		this.phone = phone;
		this.isWhatsapp = isWhatsapp;
		this.gender = gender;
		this.category = category;
		this.weight = weight;
		this.height = height;
		this.code = code;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIsWhatsapp() {
		return isWhatsapp;
	}

	public void setIsWhatsapp(Boolean isWhatsapp) {
		this.isWhatsapp = isWhatsapp;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}


	public String getNeighbour() {
		return neighbour;
	}


	public void setNeighbour(String neighbour) {
		this.neighbour = neighbour;
	}
	
}
