package login2;

class MemberInfo // 한 명의 회원정보를 저정하기 위한 클래스
{
	private String uid, pwd, name;
	public MemberInfo(String uid, String pwd, String name){
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
	}
	public String getUid(){ return uid; }
	public String getPwd(){ return pwd; }
	public void setPwd(String pwd){ this.pwd = pwd; }
	public String getName(){ return name; }
	public void setName(String name){ this.name = name; }
}
