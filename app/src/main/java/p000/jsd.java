package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jsd extends isd {

    /* JADX INFO: renamed from: c */
    @yfb
    public final nsd f51732c;

    public jsd(@yfb nsd nsdVar) {
        this.f51732c = nsdVar;
    }

    public static /* synthetic */ jsd copy$default(jsd jsdVar, nsd nsdVar, int i, Object obj) {
        if ((i & 1) != 0) {
            nsdVar = jsdVar.f51732c;
        }
        return jsdVar.copy(nsdVar);
    }

    @yfb
    public final nsd component1() {
        return this.f51732c;
    }

    @yfb
    public final jsd copy(@yfb nsd nsdVar) {
        return new jsd(nsdVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsd) && md8.areEqual(this.f51732c, ((jsd) obj).f51732c);
    }

    @Override // p000.isd
    @yfb
    public nsd getReceiveContentListener() {
        return this.f51732c;
    }

    public int hashCode() {
        return this.f51732c.hashCode();
    }

    @yfb
    public String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=" + this.f51732c + ')';
    }
}
