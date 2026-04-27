package p000;

import java.util.concurrent.ExecutorService;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class e32 implements jo5<woe> {

    /* JADX INFO: renamed from: a */
    public final hid<ExecutorService> f31623a;

    public e32(hid<ExecutorService> hidVar) {
        this.f31623a = hidVar;
    }

    public static e32 create(hid<ExecutorService> hidVar) {
        return new e32(hidVar);
    }

    public static woe provideBluetoothInteractionScheduler(ExecutorService executorService) {
        return (woe) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m97i(executorService));
    }

    @Override // p000.hid
    public woe get() {
        return provideBluetoothInteractionScheduler(this.f31623a.get());
    }
}
