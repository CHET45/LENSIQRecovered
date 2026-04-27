package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class edc {

    /* JADX INFO: renamed from: d */
    public static final int f32708d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final fdc f32709a;

    /* JADX INFO: renamed from: b */
    public final int f32710b;

    /* JADX INFO: renamed from: c */
    public final int f32711c;

    public edc(@yfb fdc fdcVar, int i, int i2) {
        this.f32709a = fdcVar;
        this.f32710b = i;
        this.f32711c = i2;
    }

    public static /* synthetic */ edc copy$default(edc edcVar, fdc fdcVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            fdcVar = edcVar.f32709a;
        }
        if ((i3 & 2) != 0) {
            i = edcVar.f32710b;
        }
        if ((i3 & 4) != 0) {
            i2 = edcVar.f32711c;
        }
        return edcVar.copy(fdcVar, i, i2);
    }

    @yfb
    public final fdc component1() {
        return this.f32709a;
    }

    public final int component2() {
        return this.f32710b;
    }

    public final int component3() {
        return this.f32711c;
    }

    @yfb
    public final edc copy(@yfb fdc fdcVar, int i, int i2) {
        return new edc(fdcVar, i, i2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edc)) {
            return false;
        }
        edc edcVar = (edc) obj;
        return md8.areEqual(this.f32709a, edcVar.f32709a) && this.f32710b == edcVar.f32710b && this.f32711c == edcVar.f32711c;
    }

    public final int getEndIndex() {
        return this.f32711c;
    }

    @yfb
    public final fdc getIntrinsics() {
        return this.f32709a;
    }

    public final int getStartIndex() {
        return this.f32710b;
    }

    public int hashCode() {
        return (((this.f32709a.hashCode() * 31) + Integer.hashCode(this.f32710b)) * 31) + Integer.hashCode(this.f32711c);
    }

    @yfb
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f32709a + ", startIndex=" + this.f32710b + ", endIndex=" + this.f32711c + ')';
    }
}
