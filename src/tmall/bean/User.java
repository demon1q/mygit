package tmall.bean;

import java.util.Date;

/*User 用户
id:编号
username:用户名
password:密码
name:姓名
idcard:身份证
sex:性别
telephone:电话
balance:余额
birthday:生日
email:邮箱
icon:头像名称
auth:权限
getAnonymousName():获得匿名名称
*/
public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private String idcard;
	private String sex;
	private String telephone;
	private double balance;
	private Date birthday;
	private String email;
	private String icon;
	private String auth;
	
	public User() {
		super();
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	//获得匿名名称
	//只有一个字符 显示*
	//两个字符显示 a*
	//超过两个字符显示a***z
	public String getAnonymousName(){
        if(null==name)
            return null;
         
        if(name.length()<=1)
            return "*";
         
        if(name.length()==2)
            return name.substring(0,1) +"*";
         
        char[] cs =name.toCharArray();
        for (int i = 1; i < cs.length-1; i++) {
            cs[i]='*';
        }
        return new String(cs);
    }

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	
}
