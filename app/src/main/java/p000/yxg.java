package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class yxg implements e13.InterfaceC5041c<wxg<?>> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ThreadLocal<?> f103289a;

    public yxg(@yfb ThreadLocal<?> threadLocal) {
        this.f103289a = threadLocal;
    }

    private final ThreadLocal<?> component1() {
        return this.f103289a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ yxg copy$default(yxg yxgVar, ThreadLocal threadLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal = yxgVar.f103289a;
        }
        return yxgVar.copy(threadLocal);
    }

    @yfb
    public final yxg copy(@yfb ThreadLocal<?> threadLocal) {
        return new yxg(threadLocal);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxg) && md8.areEqual(this.f103289a, ((yxg) obj).f103289a);
    }

    public int hashCode() {
        return this.f103289a.hashCode();
    }

    @yfb
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f103289a + ')';
    }
}
