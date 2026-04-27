package p000;

import java.io.Serializable;
import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public final class a05 implements e13, Serializable {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a05 f2a = new a05();
    private static final long serialVersionUID = 0;

    private a05() {
    }

    private final Object readResolve() {
        return f2a;
    }

    @Override // p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        return r;
    }

    @Override // p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        md8.checkNotNullParameter(interfaceC5041c, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        md8.checkNotNullParameter(interfaceC5041c, "key");
        return this;
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        md8.checkNotNullParameter(e13Var, "context");
        return e13Var;
    }

    @yfb
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
