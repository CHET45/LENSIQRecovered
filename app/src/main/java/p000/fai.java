package p000;

import p000.cai;

/* JADX INFO: loaded from: classes3.dex */
public final class fai<T extends cai> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final oo8<T> f35967a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<k63, T> f35968b;

    /* JADX WARN: Multi-variable type inference failed */
    public fai(@yfb oo8<T> oo8Var, @yfb qy6<? super k63, ? extends T> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "clazz");
        md8.checkNotNullParameter(qy6Var, "initializer");
        this.f35967a = oo8Var;
        this.f35968b = qy6Var;
    }

    @yfb
    public final oo8<T> getClazz$lifecycle_viewmodel_release() {
        return this.f35967a;
    }

    @yfb
    public final qy6<k63, T> getInitializer$lifecycle_viewmodel_release() {
        return this.f35968b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fai(@yfb Class<T> cls, @yfb qy6<? super k63, ? extends T> qy6Var) {
        this(hn8.getKotlinClass(cls), qy6Var);
        md8.checkNotNullParameter(cls, "clazz");
        md8.checkNotNullParameter(qy6Var, "initializer");
    }
}
