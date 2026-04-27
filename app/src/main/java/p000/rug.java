package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class rug {

    /* JADX INFO: renamed from: e */
    public static final int f79695e = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final swf f79696a;

    /* JADX INFO: renamed from: b */
    @gib
    public final swf f79697b;

    /* JADX INFO: renamed from: c */
    @gib
    public final swf f79698c;

    /* JADX INFO: renamed from: d */
    @gib
    public final swf f79699d;

    public rug() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rug)) {
            return false;
        }
        rug rugVar = (rug) obj;
        return md8.areEqual(this.f79696a, rugVar.f79696a) && md8.areEqual(this.f79697b, rugVar.f79697b) && md8.areEqual(this.f79698c, rugVar.f79698c) && md8.areEqual(this.f79699d, rugVar.f79699d);
    }

    @gib
    public final swf getFocusedStyle() {
        return this.f79697b;
    }

    @gib
    public final swf getHoveredStyle() {
        return this.f79698c;
    }

    @gib
    public final swf getPressedStyle() {
        return this.f79699d;
    }

    @gib
    public final swf getStyle() {
        return this.f79696a;
    }

    public int hashCode() {
        swf swfVar = this.f79696a;
        int iHashCode = (swfVar != null ? swfVar.hashCode() : 0) * 31;
        swf swfVar2 = this.f79697b;
        int iHashCode2 = (iHashCode + (swfVar2 != null ? swfVar2.hashCode() : 0)) * 31;
        swf swfVar3 = this.f79698c;
        int iHashCode3 = (iHashCode2 + (swfVar3 != null ? swfVar3.hashCode() : 0)) * 31;
        swf swfVar4 = this.f79699d;
        return iHashCode3 + (swfVar4 != null ? swfVar4.hashCode() : 0);
    }

    public rug(@gib swf swfVar, @gib swf swfVar2, @gib swf swfVar3, @gib swf swfVar4) {
        this.f79696a = swfVar;
        this.f79697b = swfVar2;
        this.f79698c = swfVar3;
        this.f79699d = swfVar4;
    }

    public /* synthetic */ rug(swf swfVar, swf swfVar2, swf swfVar3, swf swfVar4, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : swfVar, (i & 2) != 0 ? null : swfVar2, (i & 4) != 0 ? null : swfVar3, (i & 8) != 0 ? null : swfVar4);
    }
}
