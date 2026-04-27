package p000;

import java.util.concurrent.ExecutorService;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class h32 implements jo5<ExecutorService> {

    /* JADX INFO: renamed from: h32$a */
    public static final class C6689a {

        /* JADX INFO: renamed from: a */
        public static final h32 f42158a = new h32();

        private C6689a() {
        }
    }

    public static h32 create() {
        return C6689a.f42158a;
    }

    public static ExecutorService provideConnectionQueueExecutorService() {
        return (ExecutorService) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m100l());
    }

    @Override // p000.hid
    public ExecutorService get() {
        return provideConnectionQueueExecutorService();
    }
}
