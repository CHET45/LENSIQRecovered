package p000;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {uh5.class})
@jjf(version = "1.9")
public final class k1h<T> {

    /* JADX INFO: renamed from: a */
    public final T f52394a;

    /* JADX INFO: renamed from: b */
    public final long f52395b;

    public /* synthetic */ k1h(Object obj, long j, jt3 jt3Var) {
        this(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ k1h m30626copyRFiDyg4$default(k1h k1hVar, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = k1hVar.f52394a;
        }
        if ((i & 2) != 0) {
            j = k1hVar.f52395b;
        }
        return k1hVar.m30628copyRFiDyg4(obj, j);
    }

    public final T component1() {
        return this.f52394a;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m30627component2UwyO8pc() {
        return this.f52395b;
    }

    @yfb
    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final k1h<T> m30628copyRFiDyg4(T t, long j) {
        return new k1h<>(t, j, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1h)) {
            return false;
        }
        k1h k1hVar = (k1h) obj;
        return md8.areEqual(this.f52394a, k1hVar.f52394a) && bt4.m28064equalsimpl0(this.f52395b, k1hVar.f52395b);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m30629getDurationUwyO8pc() {
        return this.f52395b;
    }

    public final T getValue() {
        return this.f52394a;
    }

    public int hashCode() {
        T t = this.f52394a;
        return ((t == null ? 0 : t.hashCode()) * 31) + bt4.m28080hashCodeimpl(this.f52395b);
    }

    @yfb
    public String toString() {
        return "TimedValue(value=" + this.f52394a + ", duration=" + ((Object) bt4.m28099toStringimpl(this.f52395b)) + ')';
    }

    private k1h(T t, long j) {
        this.f52394a = t;
        this.f52395b = j;
    }
}
