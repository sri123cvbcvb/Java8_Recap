package Default_Static_Methods;

public interface Vehicle {

    void start();

    static void isMotorized(){
        System.out.println("static method");
    }
}
