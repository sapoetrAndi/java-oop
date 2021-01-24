package abstractmethod23;

public abstract class Animal {//class ini di turunkan ke class cat
    public String name;

    //saat membuat abstract method berarti class turunannya wajib meng-overrride abstract method
    public abstract void run();
}
