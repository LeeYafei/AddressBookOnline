package entity;

/**
 * Contact entity. @author MyEclipse Persistence Tools
 */

public class Contact implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cname;
	private String moble;
	private String qq;
	private String email;
	private String address;

	// Constructors

	/** default constructor */
	public Contact() {
	}

	/** full constructor */
	public Contact(String cname, String moble, String qq, String email,
			String address) {
		this.cname = cname;
		this.moble = moble;
		this.qq = qq;
		this.email = email;
		this.address = address;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMoble() {
		return this.moble;
	}

	public void setMoble(String moble) {
		this.moble = moble;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}