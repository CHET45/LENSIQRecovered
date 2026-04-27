package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class u71 extends CountDownLatch implements uu2<Throwable>, InterfaceC7776j8 {

    /* JADX INFO: renamed from: a */
    public Throwable f86922a;

    public u71() {
        super(1);
    }

    @Override // p000.InterfaceC7776j8
    public void run() {
        countDown();
    }

    @Override // p000.uu2
    public void accept(Throwable e) {
        this.f86922a = e;
        countDown();
    }
}
