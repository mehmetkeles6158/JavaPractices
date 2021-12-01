package my.exercises.oop;

public class Bank {
    public float getRateOfinterest() {
       return 0;
    }
    class SBI extends Bank {
        @Override
        public float getRateOfinterest() {
            return 8;
        }
    }
    static class ICICI extends Bank {
        @Override
        public float getRateOfinterest() {
            return 7;
        }
    }

    public static void main(String[] args) {
        ICICI obj = new ICICI();
        System.out.println(obj.getRateOfinterest());
    }
}
