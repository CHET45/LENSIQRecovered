package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class aq4 implements efh<Drawable> {

    /* JADX INFO: renamed from: a */
    public final int f11570a;

    /* JADX INFO: renamed from: b */
    public final boolean f11571b;

    /* JADX INFO: renamed from: c */
    public bq4 f11572c;

    /* JADX INFO: renamed from: aq4$a */
    public static class C1557a {

        /* JADX INFO: renamed from: c */
        public static final int f11573c = 300;

        /* JADX INFO: renamed from: a */
        public final int f11574a;

        /* JADX INFO: renamed from: b */
        public boolean f11575b;

        public C1557a() {
            this(300);
        }

        public aq4 build() {
            return new aq4(this.f11574a, this.f11575b);
        }

        public C1557a setCrossFadeEnabled(boolean z) {
            this.f11575b = z;
            return this;
        }

        public C1557a(int i) {
            this.f11574a = i;
        }
    }

    public aq4(int i, boolean z) {
        this.f11570a = i;
        this.f11571b = z;
    }

    private afh<Drawable> getResourceTransition() {
        if (this.f11572c == null) {
            this.f11572c = new bq4(this.f11570a, this.f11571b);
        }
        return this.f11572c;
    }

    @Override // p000.efh
    public afh<Drawable> build(hh3 hh3Var, boolean z) {
        return hh3Var == hh3.MEMORY_CACHE ? beb.get() : getResourceTransition();
    }
}
