package homework;

public class Main{
    public static void main(String[] args){
        
        User user = new User("Bob");

        new Report().report(user);
        new UserService().save(user, new Persister(user)); // Принцип обратной зависимости, создал интерфейс Reg, класс  Persister сделал реализующим интерфейс Reg, чтобы 
                                                           // затем передавать любой экземпляр класса реализующий Reg в функцию UserService().save() 
    

        // user.report();
        // user.save();
    }
}