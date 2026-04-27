package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class b79 {

    /* JADX INFO: renamed from: a */
    public static final int f12889a = 0;

    /* JADX INFO: renamed from: b79$a */
    @e0g(parameters = 0)
    public static final class C1770a extends b79 {

        /* JADX INFO: renamed from: e */
        public static final int f12890e = 8;

        /* JADX INFO: renamed from: b */
        @yfb
        public final String f12891b;

        /* JADX INFO: renamed from: c */
        @gib
        public final rug f12892c;

        /* JADX INFO: renamed from: d */
        @gib
        public final e79 f12893d;

        public /* synthetic */ C1770a(String str, rug rugVar, e79 e79Var, int i, jt3 jt3Var) {
            this(str, (i & 2) != 0 ? null : rugVar, e79Var);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1770a)) {
                return false;
            }
            C1770a c1770a = (C1770a) obj;
            return md8.areEqual(this.f12891b, c1770a.f12891b) && md8.areEqual(getStyles(), c1770a.getStyles()) && md8.areEqual(getLinkInteractionListener(), c1770a.getLinkInteractionListener());
        }

        @Override // p000.b79
        @gib
        public e79 getLinkInteractionListener() {
            return this.f12893d;
        }

        @Override // p000.b79
        @gib
        public rug getStyles() {
            return this.f12892c;
        }

        @yfb
        public final String getTag() {
            return this.f12891b;
        }

        public int hashCode() {
            int iHashCode = this.f12891b.hashCode() * 31;
            rug styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            e79 linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        @yfb
        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f12891b + ')';
        }

        public C1770a(@yfb String str, @gib rug rugVar, @gib e79 e79Var) {
            super(null);
            this.f12891b = str;
            this.f12892c = rugVar;
            this.f12893d = e79Var;
        }
    }

    /* JADX INFO: renamed from: b79$b */
    @e0g(parameters = 0)
    public static final class C1771b extends b79 {

        /* JADX INFO: renamed from: e */
        public static final int f12894e = 8;

        /* JADX INFO: renamed from: b */
        @yfb
        public final String f12895b;

        /* JADX INFO: renamed from: c */
        @gib
        public final rug f12896c;

        /* JADX INFO: renamed from: d */
        @gib
        public final e79 f12897d;

        public /* synthetic */ C1771b(String str, rug rugVar, e79 e79Var, int i, jt3 jt3Var) {
            this(str, (i & 2) != 0 ? null : rugVar, (i & 4) != 0 ? null : e79Var);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1771b)) {
                return false;
            }
            C1771b c1771b = (C1771b) obj;
            return md8.areEqual(this.f12895b, c1771b.f12895b) && md8.areEqual(getStyles(), c1771b.getStyles()) && md8.areEqual(getLinkInteractionListener(), c1771b.getLinkInteractionListener());
        }

        @Override // p000.b79
        @gib
        public e79 getLinkInteractionListener() {
            return this.f12897d;
        }

        @Override // p000.b79
        @gib
        public rug getStyles() {
            return this.f12896c;
        }

        @yfb
        public final String getUrl() {
            return this.f12895b;
        }

        public int hashCode() {
            int iHashCode = this.f12895b.hashCode() * 31;
            rug styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            e79 linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        @yfb
        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f12895b + ')';
        }

        public C1771b(@yfb String str, @gib rug rugVar, @gib e79 e79Var) {
            super(null);
            this.f12895b = str;
            this.f12896c = rugVar;
            this.f12897d = e79Var;
        }
    }

    public /* synthetic */ b79(jt3 jt3Var) {
        this();
    }

    @gib
    public abstract e79 getLinkInteractionListener();

    @gib
    public abstract rug getStyles();

    private b79() {
    }
}
