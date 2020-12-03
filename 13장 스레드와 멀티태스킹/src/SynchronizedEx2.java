public class SynchronizedEx2 {
    public static void main(String [] args) {
        SharedBoard2 board = new SharedBoard2();
        Thread th1 = new StudentThread2("한승욱", board);
        Thread th2 = new StudentThread2("한승욱2", board);
        th1.start();
        th2.start();
    }
}

class SharedBoard2 {
    private int sum = 0;
    public void add() {
        int n = sum;
        Thread.yield();
        n += 10;
        sum = n;
        System.out.println(Thread.currentThread().getName() + " : " + sum);
    }
    public int getSum() { return sum; }
}

class StudentThread2 extends Thread {
    private SharedBoard2 board;
    public StudentThread2(String name, SharedBoard2 board) {
        super(name);
        this.board = board;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++)
            board.add();
    }
}
