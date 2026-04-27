package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public final class xke<T> implements fx8<T>, Serializable {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C15176a f98303d = new C15176a(null);

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater<xke<?>, Object> f98304e = AtomicReferenceFieldUpdater.newUpdater(xke.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    @gib
    public volatile ny6<? extends T> f98305a;

    /* JADX INFO: renamed from: b */
    @gib
    public volatile Object f98306b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f98307c;

    /* JADX INFO: renamed from: xke$a */
    public static final class C15176a {
        public /* synthetic */ C15176a(jt3 jt3Var) {
            this();
        }

        private C15176a() {
        }
    }

    public xke(@yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "initializer");
        this.f98305a = ny6Var;
        zph zphVar = zph.f105713a;
        this.f98306b = zphVar;
        this.f98307c = zphVar;
    }

    private static /* synthetic */ void getFinal$annotations() {
    }

    private final Object writeReplace() {
        return new u18(getValue());
    }

    @Override // p000.fx8
    public T getValue() {
        T t = (T) this.f98306b;
        zph zphVar = zph.f105713a;
        if (t != zphVar) {
            return t;
        }
        ny6<? extends T> ny6Var = this.f98305a;
        if (ny6Var != null) {
            T tInvoke = ny6Var.invoke();
            if (C0051a4.m134a(f98304e, this, zphVar, tInvoke)) {
                this.f98305a = null;
                return tInvoke;
            }
        }
        return (T) this.f98306b;
    }

    @Override // p000.fx8
    public boolean isInitialized() {
        return this.f98306b != zph.f105713a;
    }

    @yfb
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
