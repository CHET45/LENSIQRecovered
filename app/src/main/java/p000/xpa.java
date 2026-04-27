package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 1)
public final class xpa {

    /* JADX INFO: renamed from: c */
    public static final int f98865c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f98871a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15243a f98864b = new C15243a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final xpa f98866d = new xpa("text/*");

    /* JADX INFO: renamed from: e */
    @yfb
    public static final xpa f98867e = new xpa("text/plain");

    /* JADX INFO: renamed from: f */
    @yfb
    public static final xpa f98868f = new xpa("text/html");

    /* JADX INFO: renamed from: g */
    @yfb
    public static final xpa f98869g = new xpa("image/*");

    /* JADX INFO: renamed from: h */
    @yfb
    public static final xpa f98870h = new xpa("*/*");

    /* JADX INFO: renamed from: xpa$a */
    public static final class C15243a {
        public /* synthetic */ C15243a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final xpa getAll() {
            return xpa.f98870h;
        }

        @yfb
        public final xpa getHtmlText() {
            return xpa.f98868f;
        }

        @yfb
        public final xpa getImage() {
            return xpa.f98869g;
        }

        @yfb
        public final xpa getPlainText() {
            return xpa.f98867e;
        }

        @yfb
        public final xpa getText() {
            return xpa.f98866d;
        }

        private C15243a() {
        }
    }

    public xpa(@yfb String str) {
        this.f98871a = str;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xpa) {
            return md8.areEqual(this.f98871a, ((xpa) obj).f98871a);
        }
        return false;
    }

    @yfb
    public final String getRepresentation() {
        return this.f98871a;
    }

    public int hashCode() {
        return this.f98871a.hashCode();
    }

    @yfb
    public String toString() {
        return "MediaType(representation='" + this.f98871a + "')";
    }
}
