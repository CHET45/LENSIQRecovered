package p000;

import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public final class h4f {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ boolean f42362e = false;

    /* JADX INFO: renamed from: a */
    @eib
    public final q8b.C11373c f42363a;

    /* JADX INFO: renamed from: b */
    public final boolean f42364b;

    /* JADX INFO: renamed from: c */
    @eib
    public q8b.C11373c f42365c;

    /* JADX INFO: renamed from: d */
    public boolean f42366d;

    public h4f(@eib vr9 vr9Var, boolean z) {
        if (vr9Var == null) {
            this.f42363a = null;
        } else {
            this.f42363a = q8b.C11373c.fromConfig(vr9Var);
        }
        this.f42364b = z;
        if (z) {
            return;
        }
        this.f42365c = this.f42363a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m12157a() {
        return this.f42364b;
    }

    @eib
    /* JADX INFO: renamed from: b */
    public q8b.C11373c m12158b() {
        v7d.checkState(!m12159c(), "still waiting on service config");
        return this.f42365c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m12159c() {
        return !this.f42366d && m12157a();
    }

    /* JADX INFO: renamed from: d */
    public void m12160d(@eib q8b.C11373c c11373c) {
        v7d.checkState(m12157a(), "unexpected service config update");
        boolean z = this.f42366d;
        this.f42366d = true;
        if (!z) {
            if (c11373c == null) {
                this.f42365c = this.f42363a;
                return;
            }
            if (c11373c.getError() == null) {
                this.f42365c = c11373c;
                return;
            }
            q8b.C11373c c11373c2 = this.f42363a;
            if (c11373c2 != null) {
                this.f42365c = c11373c2;
                return;
            } else {
                this.f42365c = c11373c;
                return;
            }
        }
        if (c11373c == null) {
            q8b.C11373c c11373c3 = this.f42363a;
            if (c11373c3 != null) {
                this.f42365c = c11373c3;
                return;
            } else {
                this.f42365c = null;
                return;
            }
        }
        if (c11373c.getError() == null) {
            this.f42365c = c11373c;
            return;
        }
        q8b.C11373c c11373c4 = this.f42365c;
        if (c11373c4 == null || c11373c4.getError() == null) {
            return;
        }
        this.f42365c = c11373c;
    }
}
