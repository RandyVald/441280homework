package homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // По принципу единственной ответственности перенес лишние функции из этого класса в отдельные UserService и Report
 
}
