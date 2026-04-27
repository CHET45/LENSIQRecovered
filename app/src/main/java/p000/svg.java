package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class svg {

    /* JADX INFO: renamed from: c */
    public static final int f83108c = 0;

    /* JADX INFO: renamed from: a */
    public final long f83109a;

    /* JADX INFO: renamed from: b */
    public final long f83110b;

    public /* synthetic */ svg(long j, long j2, jt3 jt3Var) {
        this(j, j2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svg)) {
            return false;
        }
        svg svgVar = (svg) obj;
        return w82.m32952equalsimpl0(this.f83109a, svgVar.f83109a) && w82.m32952equalsimpl0(this.f83110b, svgVar.f83110b);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m32337getBackgroundColor0d7_KjU() {
        return this.f83110b;
    }

    /* JADX INFO: renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m32338getHandleColor0d7_KjU() {
        return this.f83109a;
    }

    public int hashCode() {
        return (w82.m32958hashCodeimpl(this.f83109a) * 31) + w82.m32958hashCodeimpl(this.f83110b);
    }

    @yfb
    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) w82.m32959toStringimpl(this.f83109a)) + ", selectionBackgroundColor=" + ((Object) w82.m32959toStringimpl(this.f83110b)) + ')';
    }

    private svg(long j, long j2) {
        this.f83109a = j;
        this.f83110b = j2;
    }
}
