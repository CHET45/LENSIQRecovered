package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
@fdi
public final class qx2 {

    /* JADX INFO: renamed from: f */
    public static final int f76227f = 0;

    /* JADX INFO: renamed from: a */
    public final long f76228a;

    /* JADX INFO: renamed from: b */
    public final long f76229b;

    /* JADX INFO: renamed from: c */
    public final long f76230c;

    /* JADX INFO: renamed from: d */
    public final long f76231d;

    /* JADX INFO: renamed from: e */
    public final long f76232e;

    public /* synthetic */ qx2(long j, long j2, long j3, long j4, long j5, jt3 jt3Var) {
        this(j, j2, j3, j4, j5);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qx2)) {
            return false;
        }
        qx2 qx2Var = (qx2) obj;
        return w82.m32952equalsimpl0(this.f76228a, qx2Var.f76228a) && w82.m32952equalsimpl0(this.f76229b, qx2Var.f76229b) && w82.m32952equalsimpl0(this.f76230c, qx2Var.f76230c) && w82.m32952equalsimpl0(this.f76231d, qx2Var.f76231d) && w82.m32952equalsimpl0(this.f76232e, qx2Var.f76232e);
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m32049getBackgroundColor0d7_KjU() {
        return this.f76228a;
    }

    /* JADX INFO: renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m32050getDisabledIconColor0d7_KjU() {
        return this.f76232e;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m32051getDisabledTextColor0d7_KjU() {
        return this.f76231d;
    }

    /* JADX INFO: renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m32052getIconColor0d7_KjU() {
        return this.f76230c;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m32053getTextColor0d7_KjU() {
        return this.f76229b;
    }

    public int hashCode() {
        return (((((((w82.m32958hashCodeimpl(this.f76228a) * 31) + w82.m32958hashCodeimpl(this.f76229b)) * 31) + w82.m32958hashCodeimpl(this.f76230c)) * 31) + w82.m32958hashCodeimpl(this.f76231d)) * 31) + w82.m32958hashCodeimpl(this.f76232e);
    }

    @yfb
    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) w82.m32959toStringimpl(this.f76228a)) + ", textColor=" + ((Object) w82.m32959toStringimpl(this.f76229b)) + ", iconColor=" + ((Object) w82.m32959toStringimpl(this.f76230c)) + ", disabledTextColor=" + ((Object) w82.m32959toStringimpl(this.f76231d)) + ", disabledIconColor=" + ((Object) w82.m32959toStringimpl(this.f76232e)) + ')';
    }

    private qx2(long j, long j2, long j3, long j4, long j5) {
        this.f76228a = j;
        this.f76229b = j2;
        this.f76230c = j3;
        this.f76231d = j4;
        this.f76232e = j5;
    }
}
