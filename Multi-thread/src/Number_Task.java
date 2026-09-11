public class Number_Task implements Runnable {

    private int ID;

    public Number_Task(int id) {
        //constructor
        this.ID = id;
    }

    @Override
    public void run() {
        System.out.println("My ID is: " + ID);
    }
}
