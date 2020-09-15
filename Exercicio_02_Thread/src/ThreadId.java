public class ThreadId extends Thread{

    private int threadId;

    public ThreadId(int threadId){
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println(threadId);
    }
}
