package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class tue {

    /* JADX INFO: renamed from: g */
    public static final int f86016g = 0;

    /* JADX INFO: renamed from: a */
    public final int f86017a;

    /* JADX INFO: renamed from: b */
    public final int f86018b;

    /* JADX INFO: renamed from: c */
    public final int f86019c;

    /* JADX INFO: renamed from: d */
    public final int f86020d;

    /* JADX INFO: renamed from: e */
    public final int f86021e;

    /* JADX INFO: renamed from: f */
    public final int f86022f;

    public tue(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f86017a = i;
        this.f86018b = i2;
        this.f86019c = i3;
        this.f86020d = i4;
        this.f86021e = i5;
        this.f86022f = i6;
    }

    public static /* synthetic */ tue copy$default(tue tueVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = tueVar.f86017a;
        }
        if ((i7 & 2) != 0) {
            i2 = tueVar.f86018b;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = tueVar.f86019c;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = tueVar.f86020d;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = tueVar.f86021e;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = tueVar.f86022f;
        }
        return tueVar.copy(i, i8, i9, i10, i11, i6);
    }

    public final int component1() {
        return this.f86017a;
    }

    public final int component2() {
        return this.f86018b;
    }

    public final int component3() {
        return this.f86019c;
    }

    public final int component4() {
        return this.f86020d;
    }

    public final int component5() {
        return this.f86021e;
    }

    public final int component6() {
        return this.f86022f;
    }

    @yfb
    public final tue copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new tue(i, i2, i3, i4, i5, i6);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tue)) {
            return false;
        }
        tue tueVar = (tue) obj;
        return this.f86017a == tueVar.f86017a && this.f86018b == tueVar.f86018b && this.f86019c == tueVar.f86019c && this.f86020d == tueVar.f86020d && this.f86021e == tueVar.f86021e && this.f86022f == tueVar.f86022f;
    }

    public final int getBottom() {
        return this.f86022f;
    }

    public final int getEndOffset() {
        return this.f86018b;
    }

    public final int getLeft() {
        return this.f86019c;
    }

    public final int getRight() {
        return this.f86021e;
    }

    public final int getStartOffset() {
        return this.f86017a;
    }

    public final int getTop() {
        return this.f86020d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f86017a) * 31) + Integer.hashCode(this.f86018b)) * 31) + Integer.hashCode(this.f86019c)) * 31) + Integer.hashCode(this.f86020d)) * 31) + Integer.hashCode(this.f86021e)) * 31) + Integer.hashCode(this.f86022f);
    }

    @yfb
    public String toString() {
        return "Segment(startOffset=" + this.f86017a + ", endOffset=" + this.f86018b + ", left=" + this.f86019c + ", top=" + this.f86020d + ", right=" + this.f86021e + ", bottom=" + this.f86022f + ')';
    }
}
