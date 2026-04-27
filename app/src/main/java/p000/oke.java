package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@yjd
public final class oke<T> implements zy2<T>, a23 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10401a f67917b = new C10401a(null);

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater<oke<?>, Object> f67918c = AtomicReferenceFieldUpdater.newUpdater(oke.class, Object.class, "result");

    /* JADX INFO: renamed from: a */
    @yfb
    public final zy2<T> f67919a;

    @gib
    private volatile Object result;

    /* JADX INFO: renamed from: oke$a */
    public static final class C10401a {
        public /* synthetic */ C10401a(jt3 jt3Var) {
            this();
        }

        private static /* synthetic */ void getRESULT$annotations() {
        }

        private C10401a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oke(@yfb zy2<? super T> zy2Var, @gib Object obj) {
        md8.checkNotNullParameter(zy2Var, "delegate");
        this.f67919a = zy2Var;
        this.result = obj;
    }

    @Override // p000.a23
    @gib
    public a23 getCallerFrame() {
        zy2<T> zy2Var = this.f67919a;
        if (zy2Var instanceof a23) {
            return (a23) zy2Var;
        }
        return null;
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return this.f67919a.getContext();
    }

    @gib
    @yjd
    public final Object getOrThrow() throws Throwable {
        Object obj = this.result;
        z13 z13Var = z13.f103651b;
        if (obj == z13Var) {
            if (C0051a4.m134a(f67918c, this, z13Var, pd8.getCOROUTINE_SUSPENDED())) {
                return pd8.getCOROUTINE_SUSPENDED();
            }
            obj = this.result;
        }
        if (obj == z13.f103652c) {
            return pd8.getCOROUTINE_SUSPENDED();
        }
        if (obj instanceof v7e.C13928b) {
            throw ((v7e.C13928b) obj).f90268a;
        }
        return obj;
    }

    @Override // p000.a23
    @gib
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p000.zy2
    public void resumeWith(@yfb Object obj) {
        while (true) {
            Object obj2 = this.result;
            z13 z13Var = z13.f103651b;
            if (obj2 == z13Var) {
                if (C0051a4.m134a(f67918c, this, z13Var, obj)) {
                    return;
                }
            } else {
                if (obj2 != pd8.getCOROUTINE_SUSPENDED()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (C0051a4.m134a(f67918c, this, pd8.getCOROUTINE_SUSPENDED(), z13.f103652c)) {
                    this.f67919a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @yfb
    public String toString() {
        return "SafeContinuation for " + this.f67919a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yjd
    public oke(@yfb zy2<? super T> zy2Var) {
        this(zy2Var, z13.f103651b);
        md8.checkNotNullParameter(zy2Var, "delegate");
    }
}
