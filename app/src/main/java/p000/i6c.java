package p000;

import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public class i6c {

    /* JADX INFO: renamed from: a */
    public final PriorityBlockingQueue<do5> f45854a = new PriorityBlockingQueue<>();

    public void add(do5 do5Var) {
        this.f45854a.add(do5Var);
    }

    public boolean isEmpty() {
        return this.f45854a.isEmpty();
    }

    public boolean remove(do5 do5Var) {
        for (do5 do5Var2 : this.f45854a) {
            if (do5Var2 == do5Var) {
                return this.f45854a.remove(do5Var2);
            }
        }
        return false;
    }

    public do5<?> take() throws InterruptedException {
        return this.f45854a.take();
    }

    public do5<?> takeNow() {
        return this.f45854a.poll();
    }
}
