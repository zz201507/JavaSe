package studing2;

public class Thread2 {
    Integer hp = 100;
    public synchronized void add(){
        hp = hp+1;
        if (isDead())
            System.out.println("����");
        else
            System.out.println("ʣ��"+hp);
        this.notify();
    }
    public synchronized void minus() {
        if (hp==1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hp = hp-1;
        if (isDead())
            System.out.println("����");
        else
            System.out.println("ʣ��"+hp);
    }
    public boolean isDead(){
        return hp==0 ? true:false;
    }

}
