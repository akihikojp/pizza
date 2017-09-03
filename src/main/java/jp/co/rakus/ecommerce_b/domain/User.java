package jp.co.rakus.ecommerce_b.domain;

/**
 * @author yahiro
 *ユーザードメイン
 */
public class User {
	
	/**ユーザーid*/
	private Integer id;
	/**ユーザー名*/
	private String name;
	/**アドレス*/
	private String email;
	/**パスワード*/
	private String password;
	/**住所*/
	private String address;
	/**電話番号*/
	private String telephone;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
