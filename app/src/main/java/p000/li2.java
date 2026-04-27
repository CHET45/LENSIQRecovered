package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n1#2:702\n*E\n"})
public final class li2<R> {

    /* JADX INFO: renamed from: a */
    @un8
    public final R f57658a;

    /* JADX INFO: renamed from: b */
    @gib
    @un8
    public final tp1 f57659b;

    /* JADX INFO: renamed from: c */
    @gib
    @un8
    public final kz6<Throwable, R, e13, bth> f57660c;

    /* JADX INFO: renamed from: d */
    @gib
    @un8
    public final Object f57661d;

    /* JADX INFO: renamed from: e */
    @gib
    @un8
    public final Throwable f57662e;

    /* JADX WARN: Multi-variable type inference failed */
    public li2(R r, @gib tp1 tp1Var, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var, @gib Object obj, @gib Throwable th) {
        this.f57658a = r;
        this.f57659b = tp1Var;
        this.f57660c = kz6Var;
        this.f57661d = obj;
        this.f57662e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ li2 copy$default(li2 li2Var, Object obj, tp1 tp1Var, kz6 kz6Var, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = li2Var.f57658a;
        }
        if ((i & 2) != 0) {
            tp1Var = li2Var.f57659b;
        }
        tp1 tp1Var2 = tp1Var;
        if ((i & 4) != 0) {
            kz6Var = li2Var.f57660c;
        }
        kz6 kz6Var2 = kz6Var;
        if ((i & 8) != 0) {
            obj2 = li2Var.f57661d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = li2Var.f57662e;
        }
        return li2Var.copy(obj, tp1Var2, kz6Var2, obj4, th);
    }

    public final R component1() {
        return this.f57658a;
    }

    @gib
    public final tp1 component2() {
        return this.f57659b;
    }

    @gib
    public final kz6<Throwable, R, e13, bth> component3() {
        return this.f57660c;
    }

    @gib
    public final Object component4() {
        return this.f57661d;
    }

    @gib
    public final Throwable component5() {
        return this.f57662e;
    }

    @yfb
    public final li2<R> copy(R r, @gib tp1 tp1Var, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var, @gib Object obj, @gib Throwable th) {
        return new li2<>(r, tp1Var, kz6Var, obj, th);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        return md8.areEqual(this.f57658a, li2Var.f57658a) && md8.areEqual(this.f57659b, li2Var.f57659b) && md8.areEqual(this.f57660c, li2Var.f57660c) && md8.areEqual(this.f57661d, li2Var.f57661d) && md8.areEqual(this.f57662e, li2Var.f57662e);
    }

    public final boolean getCancelled() {
        return this.f57662e != null;
    }

    public int hashCode() {
        R r = this.f57658a;
        int iHashCode = (r == null ? 0 : r.hashCode()) * 31;
        tp1 tp1Var = this.f57659b;
        int iHashCode2 = (iHashCode + (tp1Var == null ? 0 : tp1Var.hashCode())) * 31;
        kz6<Throwable, R, e13, bth> kz6Var = this.f57660c;
        int iHashCode3 = (iHashCode2 + (kz6Var == null ? 0 : kz6Var.hashCode())) * 31;
        Object obj = this.f57661d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.f57662e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void invokeHandlers(@yfb fq1<?> fq1Var, @yfb Throwable th) {
        tp1 tp1Var = this.f57659b;
        if (tp1Var != null) {
            fq1Var.callCancelHandler(tp1Var, th);
        }
        kz6<Throwable, R, e13, bth> kz6Var = this.f57660c;
        if (kz6Var != null) {
            fq1Var.callOnCancellation(kz6Var, th, this.f57658a);
        }
    }

    @yfb
    public String toString() {
        return "CompletedContinuation(result=" + this.f57658a + ", cancelHandler=" + this.f57659b + ", onCancellation=" + this.f57660c + ", idempotentResume=" + this.f57661d + ", cancelCause=" + this.f57662e + ')';
    }

    public /* synthetic */ li2(Object obj, tp1 tp1Var, kz6 kz6Var, Object obj2, Throwable th, int i, jt3 jt3Var) {
        this(obj, (i & 2) != 0 ? null : tp1Var, (i & 4) != 0 ? null : kz6Var, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
