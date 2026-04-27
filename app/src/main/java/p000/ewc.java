package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
@vw7
public final class ewc {

    /* JADX INFO: renamed from: d */
    public static final int f34316d = 0;

    /* JADX INFO: renamed from: a */
    public final long f34317a;

    /* JADX INFO: renamed from: b */
    public final long f34318b;

    /* JADX INFO: renamed from: c */
    public final int f34319c;

    public /* synthetic */ ewc(long j, long j2, int i, jt3 jt3Var) {
        this(j, j2, i);
    }

    /* JADX INFO: renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ ewc m28870copyK8Q__8$default(ewc ewcVar, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = ewcVar.f34317a;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = ewcVar.f34318b;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = ewcVar.f34319c;
        }
        return ewcVar.m28871copyK8Q__8(j3, j4, i);
    }

    @yfb
    /* JADX INFO: renamed from: copy-K8Q-__8, reason: not valid java name */
    public final ewc m28871copyK8Q__8(long j, long j2, int i) {
        return new ewc(j, j2, i, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewc)) {
            return false;
        }
        ewc ewcVar = (ewc) obj;
        return jwg.m30610equalsimpl0(this.f34317a, ewcVar.f34317a) && jwg.m30610equalsimpl0(this.f34318b, ewcVar.f34318b) && nwc.m31271equalsimpl0(this.f34319c, ewcVar.f34319c);
    }

    /* JADX INFO: renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m28872getHeightXSAIIZE() {
        return this.f34318b;
    }

    /* JADX INFO: renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m28873getPlaceholderVerticalAlignJ6kI3mc() {
        return this.f34319c;
    }

    /* JADX INFO: renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m28874getWidthXSAIIZE() {
        return this.f34317a;
    }

    public int hashCode() {
        return (((jwg.m30614hashCodeimpl(this.f34317a) * 31) + jwg.m30614hashCodeimpl(this.f34318b)) * 31) + nwc.m31272hashCodeimpl(this.f34319c);
    }

    @yfb
    public String toString() {
        return "Placeholder(width=" + ((Object) jwg.m30620toStringimpl(this.f34317a)) + ", height=" + ((Object) jwg.m30620toStringimpl(this.f34318b)) + ", placeholderVerticalAlign=" + ((Object) nwc.m31273toStringimpl(this.f34319c)) + ')';
    }

    private ewc(long j, long j2, int i) {
        this.f34317a = j;
        this.f34318b = j2;
        this.f34319c = i;
        if (kwg.m30790isUnspecifiedR2X_6o(j)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (kwg.m30790isUnspecifiedR2X_6o(j2)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
