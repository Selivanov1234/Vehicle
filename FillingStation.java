package java2.station;

import java.util.concurrent.Semaphore;

public class FillingStation {
    private Semaphore semaphore;
    private GasPool gasPool;

    public FillingStation() {
        this.gasPool = new GasPool();
        this.semaphore = new Semaphore(3);
    }

    public float refuel(float amount) {
        try {
            semaphore.acquire();
            Thread.sleep(5000);
            float request = gasPool.request(amount);

            System.out.println(gasPool);
            return request;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return 0F;
    }
}
