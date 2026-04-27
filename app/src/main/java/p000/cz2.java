package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@dwf({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class cz2 extends tq0 {

    @gib
    private final e13 _context;

    @gib
    private transient zy2<Object> intercepted;

    public cz2(@gib zy2<Object> zy2Var, @gib e13 e13Var) {
        super(zy2Var);
        this._context = e13Var;
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        e13 e13Var = this._context;
        md8.checkNotNull(e13Var);
        return e13Var;
    }

    @yfb
    public final zy2<Object> intercepted() {
        zy2<Object> zy2VarInterceptContinuation = this.intercepted;
        if (zy2VarInterceptContinuation == null) {
            dz2 dz2Var = (dz2) getContext().get(dz2.f31343s);
            if (dz2Var == null || (zy2VarInterceptContinuation = dz2Var.interceptContinuation(this)) == null) {
                zy2VarInterceptContinuation = this;
            }
            this.intercepted = zy2VarInterceptContinuation;
        }
        return zy2VarInterceptContinuation;
    }

    @Override // p000.tq0
    public void releaseIntercepted() {
        zy2<?> zy2Var = this.intercepted;
        if (zy2Var != null && zy2Var != this) {
            e13.InterfaceC5040b interfaceC5040b = getContext().get(dz2.f31343s);
            md8.checkNotNull(interfaceC5040b);
            ((dz2) interfaceC5040b).releaseInterceptedContinuation(zy2Var);
        }
        this.intercepted = mi2.f61053a;
    }

    public cz2(@gib zy2<Object> zy2Var) {
        this(zy2Var, zy2Var != null ? zy2Var.getContext() : null);
    }
}
