/**
 * Created by YanMing on 2017/2/22.
 */
public class User {
    private String name;
    private int age;

    public User(){}

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
