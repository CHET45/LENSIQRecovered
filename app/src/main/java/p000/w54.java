package p000;

/* JADX INFO: loaded from: classes8.dex */
public class w54 implements y54 {

    /* JADX INFO: renamed from: a */
    public final zpg f93274a;

    /* JADX INFO: renamed from: b */
    public final char f93275b;

    /* JADX INFO: renamed from: c */
    public final boolean f93276c;

    /* JADX INFO: renamed from: d */
    public final boolean f93277d;

    /* JADX INFO: renamed from: e */
    public w54 f93278e;

    /* JADX INFO: renamed from: f */
    public w54 f93279f;

    /* JADX INFO: renamed from: g */
    public int f93280g = 1;

    /* JADX INFO: renamed from: h */
    public int f93281h = 1;

    public w54(zpg zpgVar, char c, boolean z, boolean z2, w54 w54Var) {
        this.f93274a = zpgVar;
        this.f93275b = c;
        this.f93276c = z;
        this.f93277d = z2;
        this.f93278e = w54Var;
    }

    @Override // p000.y54
    public boolean canClose() {
        return this.f93277d;
    }

    @Override // p000.y54
    public boolean canOpen() {
        return this.f93276c;
    }

    @Override // p000.y54
    public int length() {
        return this.f93280g;
    }

    @Override // p000.y54
    public int originalLength() {
        return this.f93281h;
    }
}
