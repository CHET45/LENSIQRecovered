package p000;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/MutableSoftReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
public final class x6b<T> {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public volatile SoftReference<T> f96896a = new SoftReference<>(null);

    public final synchronized T getOrSetWithLock(@yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "factory");
        T t = this.f96896a.get();
        if (t != null) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        this.f96896a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
