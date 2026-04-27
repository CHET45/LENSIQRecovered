package p000;

import java.util.concurrent.ExecutorService;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class d32 implements jo5<ExecutorService> {

    /* JADX INFO: renamed from: d32$a */
    public static final class C4594a {

        /* JADX INFO: renamed from: a */
        public static final d32 f28309a = new d32();

        private C4594a() {
        }
    }

    public static d32 create() {
        return C4594a.f28309a;
    }

    public static ExecutorService provideBluetoothInteractionExecutorService() {
        return (ExecutorService) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m96h());
    }

    @Override // p000.hid
    public ExecutorService get() {
        return provideBluetoothInteractionExecutorService();
    }
}
