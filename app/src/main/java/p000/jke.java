package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class jke<T> extends cz2 implements t66<T>, a23 {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final t66<T> f51033a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final e13 f51034b;

    /* JADX INFO: renamed from: c */
    @un8
    public final int f51035c;

    /* JADX INFO: renamed from: d */
    @gib
    public e13 f51036d;

    /* JADX INFO: renamed from: e */
    @gib
    public zy2<? super bth> f51037e;

    /* JADX WARN: Multi-variable type inference failed */
    public jke(@yfb t66<? super T> t66Var, @yfb e13 e13Var) {
        super(qdb.f74081a, a05.f2a);
        this.f51033a = t66Var;
        this.f51034b = e13Var;
        this.f51035c = ((Number) e13Var.fold(0, new gz6() { // from class: ike
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(jke.collectContextSize$lambda$0(((Integer) obj).intValue(), (e13.InterfaceC5040b) obj2));
            }
        })).intValue();
    }

    private final void checkContext(e13 e13Var, e13 e13Var2, T t) {
        if (e13Var2 instanceof jn4) {
            exceptionTransparencyViolated((jn4) e13Var2, t);
        }
        mke.checkContext(this, e13Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, e13.InterfaceC5040b interfaceC5040b) {
        return i + 1;
    }

    private final void exceptionTransparencyViolated(jn4 jn4Var, Object obj) {
        throw new IllegalStateException(a9g.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + jn4Var.f51286b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p000.t66
    @gib
    public Object emit(T t, @yfb zy2<? super bth> zy2Var) {
        try {
            Object objEmit = emit(zy2Var, t);
            if (objEmit == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return objEmit == pd8.getCOROUTINE_SUSPENDED() ? objEmit : bth.f14751a;
        } catch (Throwable th) {
            this.f51036d = new jn4(th, zy2Var.getContext());
            throw th;
        }
    }

    @Override // p000.tq0, p000.a23
    @gib
    public a23 getCallerFrame() {
        zy2<? super bth> zy2Var = this.f51037e;
        if (zy2Var instanceof a23) {
            return (a23) zy2Var;
        }
        return null;
    }

    @Override // p000.cz2, p000.zy2
    @yfb
    public e13 getContext() {
        e13 e13Var = this.f51036d;
        return e13Var == null ? a05.f2a : e13Var;
    }

    @Override // p000.tq0, p000.a23
    @gib
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p000.tq0
    @yfb
    public Object invokeSuspend(@yfb Object obj) {
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        if (thM32726exceptionOrNullimpl != null) {
            this.f51036d = new jn4(thM32726exceptionOrNullimpl, getContext());
        }
        zy2<? super bth> zy2Var = this.f51037e;
        if (zy2Var != null) {
            zy2Var.resumeWith(obj);
        }
        return pd8.getCOROUTINE_SUSPENDED();
    }

    @Override // p000.cz2, p000.tq0
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(zy2<? super bth> zy2Var, T t) {
        e13 context = zy2Var.getContext();
        oj8.ensureActive(context);
        e13 e13Var = this.f51036d;
        if (e13Var != context) {
            checkContext(context, e13Var, t);
            this.f51036d = context;
        }
        this.f51037e = zy2Var;
        kz6 kz6Var = kke.f54557a;
        t66<T> t66Var = this.f51033a;
        md8.checkNotNull(t66Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        md8.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = kz6Var.invoke(t66Var, t, this);
        if (!md8.areEqual(objInvoke, pd8.getCOROUTINE_SUSPENDED())) {
            this.f51037e = null;
        }
        return objInvoke;
    }
}
