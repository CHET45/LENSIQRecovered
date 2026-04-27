package p000;

import java.util.concurrent.ExecutorService;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class n32 implements jo5<a32.InterfaceC0030c> {

    /* JADX INFO: renamed from: a */
    public final hid<ExecutorService> f63109a;

    /* JADX INFO: renamed from: b */
    public final hid<woe> f63110b;

    /* JADX INFO: renamed from: c */
    public final hid<ExecutorService> f63111c;

    public n32(hid<ExecutorService> hidVar, hid<woe> hidVar2, hid<ExecutorService> hidVar3) {
        this.f63109a = hidVar;
        this.f63110b = hidVar2;
        this.f63111c = hidVar3;
    }

    public static n32 create(hid<ExecutorService> hidVar, hid<woe> hidVar2, hid<ExecutorService> hidVar3) {
        return new n32(hidVar, hidVar2, hidVar3);
    }

    public static a32.InterfaceC0030c provideFinalizationCloseable(ExecutorService executorService, woe woeVar, ExecutorService executorService2) {
        return (a32.InterfaceC0030c) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m106r(executorService, woeVar, executorService2));
    }

    @Override // p000.hid
    public a32.InterfaceC0030c get() {
        return provideFinalizationCloseable(this.f63109a.get(), this.f63110b.get(), this.f63111c.get());
    }
}
