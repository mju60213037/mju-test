package login;

public class User {
    private String id;
    private String password;
    private String name;

    User() {} //기본 생성자
    User(String id,String password,String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
    //각 필드의 Getter, Setter
    void setId(String id) { this.id = id; }
    void setPassword(String password) { this.password = password; }
    void setname(String name) { this.name = name; }
    String getId() { return id;}
    String getPassword() { return password;}
    String getname() { return name;}
}