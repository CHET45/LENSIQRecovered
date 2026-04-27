package p000;

/* JADX INFO: loaded from: classes3.dex */
public class e2e implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f31608a;

    /* JADX INFO: renamed from: b */
    public final C15326xw f31609b;

    /* JADX INFO: renamed from: c */
    public final C15326xw f31610c;

    /* JADX INFO: renamed from: d */
    public final C8540kx f31611d;

    /* JADX INFO: renamed from: e */
    public final boolean f31612e;

    public e2e(String str, C15326xw c15326xw, C15326xw c15326xw2, C8540kx c8540kx, boolean z) {
        this.f31608a = str;
        this.f31609b = c15326xw;
        this.f31610c = c15326xw2;
        this.f31611d = c8540kx;
        this.f31612e = z;
    }

    public C15326xw getCopies() {
        return this.f31609b;
    }

    public String getName() {
        return this.f31608a;
    }

    public C15326xw getOffset() {
        return this.f31610c;
    }

    public C8540kx getTransform() {
        return this.f31611d;
    }

    public boolean isHidden() {
        return this.f31612e;
    }

    @Override // p000.sw2
    @hib
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new f2e(go9Var, pr0Var, this);
    }
}
