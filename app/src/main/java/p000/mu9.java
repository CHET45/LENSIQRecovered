package p000;

/* JADX INFO: loaded from: classes7.dex */
public class mu9 {

    /* JADX INFO: renamed from: a */
    public final xu9 f62192a;

    /* JADX INFO: renamed from: b */
    public final n90 f62193b;

    /* JADX INFO: renamed from: c */
    public final tig f62194c;

    /* JADX INFO: renamed from: d */
    public final i79 f62195d;

    /* JADX INFO: renamed from: e */
    public final bt7 f62196e;

    /* JADX INFO: renamed from: f */
    public final xv7 f62197f;

    /* JADX INFO: renamed from: g */
    public final vu9 f62198g;

    /* JADX INFO: renamed from: mu9$b */
    public static class C9528b {

        /* JADX INFO: renamed from: a */
        public xu9 f62199a;

        /* JADX INFO: renamed from: b */
        public n90 f62200b;

        /* JADX INFO: renamed from: c */
        public tig f62201c;

        /* JADX INFO: renamed from: d */
        public i79 f62202d;

        /* JADX INFO: renamed from: e */
        public bt7 f62203e;

        /* JADX INFO: renamed from: f */
        public xv7 f62204f;

        /* JADX INFO: renamed from: g */
        public vu9 f62205g;

        @efb
        public C9528b asyncDrawableLoader(@efb n90 n90Var) {
            this.f62200b = n90Var;
            return this;
        }

        @efb
        public mu9 build(@efb xu9 xu9Var, @efb vu9 vu9Var) {
            this.f62199a = xu9Var;
            this.f62205g = vu9Var;
            if (this.f62200b == null) {
                this.f62200b = n90.noOp();
            }
            if (this.f62201c == null) {
                this.f62201c = new uig();
            }
            if (this.f62202d == null) {
                this.f62202d = new j79();
            }
            if (this.f62203e == null) {
                this.f62203e = bt7.noOp();
            }
            if (this.f62204f == null) {
                this.f62204f = new yv7();
            }
            return new mu9(this);
        }

        @efb
        public C9528b imageDestinationProcessor(@efb bt7 bt7Var) {
            this.f62203e = bt7Var;
            return this;
        }

        @efb
        public C9528b imageSizeResolver(@efb xv7 xv7Var) {
            this.f62204f = xv7Var;
            return this;
        }

        @efb
        public C9528b linkResolver(@efb i79 i79Var) {
            this.f62202d = i79Var;
            return this;
        }

        @efb
        public C9528b syntaxHighlight(@efb tig tigVar) {
            this.f62201c = tigVar;
            return this;
        }
    }

    @efb
    public static C9528b builder() {
        return new C9528b();
    }

    @efb
    public n90 asyncDrawableLoader() {
        return this.f62193b;
    }

    @efb
    public bt7 imageDestinationProcessor() {
        return this.f62196e;
    }

    @efb
    public xv7 imageSizeResolver() {
        return this.f62197f;
    }

    @efb
    public i79 linkResolver() {
        return this.f62195d;
    }

    @efb
    public vu9 spansFactory() {
        return this.f62198g;
    }

    @efb
    public tig syntaxHighlight() {
        return this.f62194c;
    }

    @efb
    public xu9 theme() {
        return this.f62192a;
    }

    private mu9(@efb C9528b c9528b) {
        this.f62192a = c9528b.f62199a;
        this.f62193b = c9528b.f62200b;
        this.f62194c = c9528b.f62201c;
        this.f62195d = c9528b.f62202d;
        this.f62196e = c9528b.f62203e;
        this.f62197f = c9528b.f62204f;
        this.f62198g = c9528b.f62205g;
    }
}
