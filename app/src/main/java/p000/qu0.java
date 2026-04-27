package p000;

/* JADX INFO: loaded from: classes4.dex */
public class qu0 implements awh {

    /* JADX INFO: renamed from: a */
    public a5c f75755a;

    /* JADX INFO: renamed from: b */
    public boolean f75756b;

    /* JADX INFO: renamed from: c */
    public boolean f75757c;

    /* JADX INFO: renamed from: d */
    public int f75758d;

    /* JADX INFO: renamed from: e */
    public final mt0<?, ?> f75759e;

    public qu0(@yfb mt0<?, ?> mt0Var) {
        md8.checkParameterIsNotNull(mt0Var, "baseQuickAdapter");
        this.f75759e = mt0Var;
        this.f75758d = 1;
    }

    public final void autoUpFetch$com_github_CymChad_brvah(int i) {
        a5c a5cVar;
        if (!this.f75756b || this.f75757c || i > this.f75758d || (a5cVar = this.f75755a) == null) {
            return;
        }
        a5cVar.onUpFetch();
    }

    public final int getStartUpFetchPosition() {
        return this.f75758d;
    }

    public final boolean isUpFetchEnable() {
        return this.f75756b;
    }

    public final boolean isUpFetching() {
        return this.f75757c;
    }

    @Override // p000.awh
    public void setOnUpFetchListener(@gib a5c a5cVar) {
        this.f75755a = a5cVar;
    }

    public final void setStartUpFetchPosition(int i) {
        this.f75758d = i;
    }

    public final void setUpFetchEnable(boolean z) {
        this.f75756b = z;
    }

    public final void setUpFetching(boolean z) {
        this.f75757c = z;
    }
}
