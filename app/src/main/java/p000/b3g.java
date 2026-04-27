package p000;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b3g {

    /* JADX INFO: renamed from: a */
    public static final boolean f12588a = false;

    /* JADX INFO: renamed from: b3g$b */
    public static class C1725b extends b3g {

        /* JADX INFO: renamed from: b */
        public volatile RuntimeException f12589b;

        public C1725b() {
            super();
        }

        @Override // p000.b3g
        public void setRecycled(boolean z) {
            if (z) {
                this.f12589b = new RuntimeException("Released");
            } else {
                this.f12589b = null;
            }
        }

        @Override // p000.b3g
        public void throwIfRecycled() {
            if (this.f12589b != null) {
                throw new IllegalStateException("Already released", this.f12589b);
            }
        }
    }

    /* JADX INFO: renamed from: b3g$c */
    public static class C1726c extends b3g {

        /* JADX INFO: renamed from: b */
        public volatile boolean f12590b;

        public C1726c() {
            super();
        }

        @Override // p000.b3g
        public void setRecycled(boolean z) {
            this.f12590b = z;
        }

        @Override // p000.b3g
        public void throwIfRecycled() {
            if (this.f12590b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @efb
    public static b3g newInstance() {
        return new C1726c();
    }

    public abstract void setRecycled(boolean z);

    public abstract void throwIfRecycled();

    private b3g() {
    }
}
