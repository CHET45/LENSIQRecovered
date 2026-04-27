package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class bf1 {

    /* JADX INFO: renamed from: a */
    public int f13598a;

    /* JADX INFO: renamed from: a */
    public final boolean m3089a(int i) {
        return (this.f13598a & i) == i;
    }

    public final void addFlag(int i) {
        this.f13598a = i | this.f13598a;
    }

    public void clear() {
        this.f13598a = 0;
    }

    public final void clearFlag(int i) {
        this.f13598a = (~i) & this.f13598a;
    }

    public final boolean hasSupplementalData() {
        return m3089a(268435456);
    }

    public final boolean isDecodeOnly() {
        return m3089a(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return m3089a(4);
    }

    public final boolean isFirstSample() {
        return m3089a(134217728);
    }

    public final boolean isKeyFrame() {
        return m3089a(1);
    }

    public final boolean isLastSample() {
        return m3089a(536870912);
    }

    public final void setFlags(int i) {
        this.f13598a = i;
    }
}
