package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum iwd {
    None(0, false, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false, false),
    PullUpToLoad(2, true, false, false, false, false),
    PullDownCanceled(1, false, false, false, false, false),
    PullUpCanceled(2, false, false, false, false, false),
    ReleaseToRefresh(1, true, false, false, false, true),
    ReleaseToLoad(2, true, false, false, false, true),
    ReleaseToTwoLevel(1, true, false, false, true, true),
    TwoLevelReleased(1, false, false, false, true, false),
    RefreshReleased(1, false, false, false, false, false),
    LoadReleased(2, false, false, false, false, false),
    Refreshing(1, false, true, false, false, false),
    Loading(2, false, true, false, false, false),
    TwoLevel(1, false, true, false, true, false),
    RefreshFinish(1, false, false, true, false, false),
    LoadFinish(2, false, false, true, false, false),
    TwoLevelFinish(1, false, false, true, true, false);


    /* JADX INFO: renamed from: a */
    public final boolean f48717a;

    /* JADX INFO: renamed from: b */
    public final boolean f48718b;

    /* JADX INFO: renamed from: c */
    public final boolean f48719c;

    /* JADX INFO: renamed from: d */
    public final boolean f48720d;

    /* JADX INFO: renamed from: e */
    public final boolean f48721e;

    /* JADX INFO: renamed from: f */
    public final boolean f48722f;

    /* JADX INFO: renamed from: m */
    public final boolean f48723m;

    iwd(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f48717a = i == 1;
        this.f48718b = i == 2;
        this.f48720d = z;
        this.f48721e = z2;
        this.f48722f = z3;
        this.f48719c = z4;
        this.f48723m = z5;
    }

    public iwd toFooter() {
        return (!this.f48717a || this.f48719c) ? this : values()[ordinal() + 1];
    }

    public iwd toHeader() {
        return (!this.f48718b || this.f48719c) ? this : values()[ordinal() - 1];
    }
}
