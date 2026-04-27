package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class cf1 {

    /* JADX INFO: renamed from: a */
    public int f16399a;

    /* JADX INFO: renamed from: a */
    public final boolean m3932a(int i) {
        return (this.f16399a & i) == i;
    }

    public final void addFlag(int i) {
        this.f16399a = i | this.f16399a;
    }

    @un1
    public void clear() {
        this.f16399a = 0;
    }

    public final void clearFlag(int i) {
        this.f16399a = (~i) & this.f16399a;
    }

    public final boolean hasSupplementalData() {
        return m3932a(268435456);
    }

    public final boolean isEndOfStream() {
        return m3932a(4);
    }

    public final boolean isFirstSample() {
        return m3932a(134217728);
    }

    public final boolean isKeyFrame() {
        return m3932a(1);
    }

    public final boolean isLastSample() {
        return m3932a(536870912);
    }

    public final boolean notDependedOn() {
        return m3932a(67108864);
    }

    public final void setFlags(int i) {
        this.f16399a = i;
    }
}
