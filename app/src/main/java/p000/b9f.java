package p000;

/* JADX INFO: loaded from: classes3.dex */
public class b9f implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f13082a;

    /* JADX INFO: renamed from: b */
    public final int f13083b;

    /* JADX INFO: renamed from: c */
    public final C6011fx f13084c;

    /* JADX INFO: renamed from: d */
    public final boolean f13085d;

    public b9f(String str, int i, C6011fx c6011fx, boolean z) {
        this.f13082a = str;
        this.f13083b = i;
        this.f13084c = c6011fx;
        this.f13085d = z;
    }

    public String getName() {
        return this.f13082a;
    }

    public C6011fx getShapePath() {
        return this.f13084c;
    }

    public boolean isHidden() {
        return this.f13085d;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new q8f(go9Var, pr0Var, this);
    }

    public String toString() {
        return "ShapePath{name=" + this.f13082a + ", index=" + this.f13083b + '}';
    }
}
