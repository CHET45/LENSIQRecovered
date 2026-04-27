package p000;

/* JADX INFO: renamed from: fo */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C5897fo {

    /* JADX INFO: renamed from: b */
    public static final int f37204b = 8;

    /* JADX INFO: renamed from: a */
    public int f37205a;

    public C5897fo(int i) {
        this.f37205a = i;
    }

    public final int getLocation$runtime_release() {
        return this.f37205a;
    }

    public final boolean getValid() {
        return this.f37205a != Integer.MIN_VALUE;
    }

    public final void setLocation$runtime_release(int i) {
        this.f37205a = i;
    }

    public final int toIndexFor(@yfb mrf mrfVar) {
        return mrfVar.anchorIndex(this);
    }

    @yfb
    public String toString() {
        return super.toString() + "{ location = " + this.f37205a + " }";
    }

    public final int toIndexFor(@yfb prf prfVar) {
        return prfVar.anchorIndex(this);
    }
}
