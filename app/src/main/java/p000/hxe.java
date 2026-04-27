package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class hxe {

    /* JADX INFO: renamed from: c */
    public static final int f45201c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final hki f45202a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final hki f45203b;

    public hxe(@yfb hki hkiVar, @yfb hki hkiVar2) {
        this.f45202a = hkiVar;
        this.f45203b = hkiVar2;
    }

    public static /* synthetic */ hxe copy$default(hxe hxeVar, hki hkiVar, hki hkiVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            hkiVar = hxeVar.f45202a;
        }
        if ((i & 2) != 0) {
            hkiVar2 = hxeVar.f45203b;
        }
        return hxeVar.copy(hkiVar, hkiVar2);
    }

    @yfb
    public final hki component1() {
        return this.f45202a;
    }

    @yfb
    public final hki component2() {
        return this.f45203b;
    }

    @yfb
    public final hxe copy(@yfb hki hkiVar, @yfb hki hkiVar2) {
        return new hxe(hkiVar, hkiVar2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxe)) {
            return false;
        }
        hxe hxeVar = (hxe) obj;
        return this.f45202a == hxeVar.f45202a && this.f45203b == hxeVar.f45203b;
    }

    @yfb
    public final hki getEndAffinity() {
        return this.f45203b;
    }

    @yfb
    public final hki getStartAffinity() {
        return this.f45202a;
    }

    public int hashCode() {
        return (this.f45202a.hashCode() * 31) + this.f45203b.hashCode();
    }

    @yfb
    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f45202a + ", endAffinity=" + this.f45203b + ')';
    }

    public hxe(@yfb hki hkiVar) {
        this(hkiVar, hkiVar);
    }
}
