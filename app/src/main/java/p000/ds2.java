package p000;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class ds2 implements jo5<cs2> {

    /* JADX INFO: renamed from: a */
    public final hid<String> f30524a;

    /* JADX INFO: renamed from: b */
    public final hid<he4> f30525b;

    /* JADX INFO: renamed from: c */
    public final hid<ExecutorService> f30526c;

    /* JADX INFO: renamed from: d */
    public final hid<woe> f30527d;

    public ds2(hid<String> hidVar, hid<he4> hidVar2, hid<ExecutorService> hidVar3, hid<woe> hidVar4) {
        this.f30524a = hidVar;
        this.f30525b = hidVar2;
        this.f30526c = hidVar3;
        this.f30527d = hidVar4;
    }

    public static ds2 create(hid<String> hidVar, hid<he4> hidVar2, hid<ExecutorService> hidVar3, hid<woe> hidVar4) {
        return new ds2(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static cs2 newInstance(String str, he4 he4Var, ExecutorService executorService, woe woeVar) {
        return new cs2(str, he4Var, executorService, woeVar);
    }

    @Override // p000.hid
    public cs2 get() {
        return newInstance(this.f30524a.get(), this.f30525b.get(), this.f30526c.get(), this.f30527d.get());
    }
}
