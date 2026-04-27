package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class v71 extends CountDownLatch implements tu2<Throwable>, InterfaceC7178i8 {

    /* JADX INFO: renamed from: a */
    public Throwable f90131a;

    public v71() {
        super(1);
    }

    @Override // p000.InterfaceC7178i8
    public void run() {
        countDown();
    }

    @Override // p000.tu2
    public void accept(Throwable th) {
        this.f90131a = th;
        countDown();
    }
}
