package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class mxc {

    /* JADX INFO: renamed from: d */
    public static final int f62710d = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f62712a;

    /* JADX INFO: renamed from: b */
    public final int f62713b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C9605a f62709c = new C9605a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final mxc f62711e = new mxc();

    /* JADX INFO: renamed from: mxc$a */
    public static final class C9605a {
        public /* synthetic */ C9605a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final mxc getDefault() {
            return mxc.f62711e;
        }

        private C9605a() {
        }
    }

    public /* synthetic */ mxc(int i, jt3 jt3Var) {
        this(i);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxc)) {
            return false;
        }
        mxc mxcVar = (mxc) obj;
        return this.f62712a == mxcVar.f62712a && gz4.m29882equalsimpl0(this.f62713b, mxcVar.f62713b);
    }

    /* JADX INFO: renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m31090getEmojiSupportMatch_3YsG6Y() {
        return this.f62713b;
    }

    public final boolean getIncludeFontPadding() {
        return this.f62712a;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f62712a) * 31) + gz4.m29883hashCodeimpl(this.f62713b);
    }

    @yfb
    public final mxc merge(@gib mxc mxcVar) {
        return mxcVar == null ? this : mxcVar;
    }

    @yfb
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f62712a + ", emojiSupportMatch=" + ((Object) gz4.m29884toStringimpl(this.f62713b)) + ')';
    }

    public /* synthetic */ mxc(int i, boolean z, jt3 jt3Var) {
        this(i, z);
    }

    public mxc(boolean z) {
        this.f62712a = z;
        this.f62713b = gz4.f41853b.m29887getDefault_3YsG6Y();
    }

    public /* synthetic */ mxc(boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z);
    }

    public /* synthetic */ mxc(int i, boolean z, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? gz4.f41853b.m29887getDefault_3YsG6Y() : i, (i2 & 2) != 0 ? false : z, (jt3) null);
    }

    private mxc(int i, boolean z) {
        this.f62712a = z;
        this.f62713b = i;
    }

    private mxc(int i) {
        this.f62712a = false;
        this.f62713b = i;
    }

    public /* synthetic */ mxc(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? gz4.f41853b.m29887getDefault_3YsG6Y() : i, (jt3) null);
    }

    public mxc() {
        this(gz4.f41853b.m29887getDefault_3YsG6Y(), false, (jt3) null);
    }
}
