package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class nw7 {

    /* JADX INFO: renamed from: i */
    public static final int f65885i = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f65887a;

    /* JADX INFO: renamed from: b */
    public final int f65888b;

    /* JADX INFO: renamed from: c */
    public final boolean f65889c;

    /* JADX INFO: renamed from: d */
    public final int f65890d;

    /* JADX INFO: renamed from: e */
    public final int f65891e;

    /* JADX INFO: renamed from: f */
    @gib
    public final bxc f65892f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final ye9 f65893g;

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C10091a f65884h = new C10091a(null);

    /* JADX INFO: renamed from: j */
    @yfb
    public static final nw7 f65886j = new nw7(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: nw7$a */
    public static final class C10091a {
        public /* synthetic */ C10091a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final nw7 getDefault() {
            return nw7.f65886j;
        }

        private C10091a() {
        }
    }

    @q64(level = u64.f86867c, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ nw7(boolean z, int i, boolean z2, int i2, int i3, jt3 jt3Var) {
        this(z, i, z2, i2, i3);
    }

    /* JADX INFO: renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ nw7 m31257copyYTHSh70$default(nw7 nw7Var, boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = nw7Var.f65887a;
        }
        if ((i4 & 2) != 0) {
            i = nw7Var.f65888b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = nw7Var.f65889c;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = nw7Var.f65890d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = nw7Var.f65891e;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            bxcVar = nw7Var.f65892f;
        }
        return nw7Var.m31260copyYTHSh70(z, i5, z3, i6, i7, bxcVar);
    }

    /* JADX INFO: renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ nw7 m31258copyuxg59PA$default(nw7 nw7Var, boolean z, int i, boolean z2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = nw7Var.f65887a;
        }
        if ((i4 & 2) != 0) {
            i = nw7Var.f65888b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = nw7Var.f65889c;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = nw7Var.f65890d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = nw7Var.f65891e;
        }
        return nw7Var.m31261copyuxg59PA(z, i5, z3, i6, i3);
    }

    /* JADX INFO: renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ nw7 m31259copywBHncE4$default(nw7 nw7Var, boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar, ye9 ye9Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = nw7Var.f65887a;
        }
        if ((i4 & 2) != 0) {
            i = nw7Var.f65888b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = nw7Var.f65889c;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = nw7Var.f65890d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = nw7Var.f65891e;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            bxcVar = nw7Var.f65892f;
        }
        bxc bxcVar2 = bxcVar;
        if ((i4 & 64) != 0) {
            ye9Var = nw7Var.f65893g;
        }
        return nw7Var.m31262copywBHncE4(z, i5, z3, i6, i7, bxcVar2, ye9Var);
    }

    @q64(level = u64.f86867c, message = "Please use the new copy function that takes optional hintLocales parameter.")
    /* JADX INFO: renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ nw7 m31260copyYTHSh70(boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar) {
        return new nw7(z, i, z2, i2, i3, bxcVar, this.f65893g, (jt3) null);
    }

    @q64(level = u64.f86867c, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* JADX INFO: renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ nw7 m31261copyuxg59PA(boolean z, int i, boolean z2, int i2, int i3) {
        return new nw7(z, i, z2, i2, i3, this.f65892f, this.f65893g, (jt3) null);
    }

    @yfb
    /* JADX INFO: renamed from: copy-wBHncE4, reason: not valid java name */
    public final nw7 m31262copywBHncE4(boolean z, int i, boolean z2, int i2, int i3, @gib bxc bxcVar, @yfb ye9 ye9Var) {
        return new nw7(z, i, z2, i2, i3, bxcVar, ye9Var, (jt3) null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw7)) {
            return false;
        }
        nw7 nw7Var = (nw7) obj;
        return this.f65887a == nw7Var.f65887a && vr8.m32798equalsimpl0(this.f65888b, nw7Var.f65888b) && this.f65889c == nw7Var.f65889c && xr8.m33241equalsimpl0(this.f65890d, nw7Var.f65890d) && mw7.m31068equalsimpl0(this.f65891e, nw7Var.f65891e) && md8.areEqual(this.f65892f, nw7Var.f65892f) && md8.areEqual(this.f65893g, nw7Var.f65893g);
    }

    public final boolean getAutoCorrect() {
        return this.f65889c;
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m31263getCapitalizationIUNYP9k() {
        return this.f65888b;
    }

    @yfb
    public final ye9 getHintLocales() {
        return this.f65893g;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m31264getImeActioneUduSuo() {
        return this.f65891e;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m31265getKeyboardTypePjHm6EE() {
        return this.f65890d;
    }

    @gib
    public final bxc getPlatformImeOptions() {
        return this.f65892f;
    }

    public final boolean getSingleLine() {
        return this.f65887a;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f65887a) * 31) + vr8.m32799hashCodeimpl(this.f65888b)) * 31) + Boolean.hashCode(this.f65889c)) * 31) + xr8.m33242hashCodeimpl(this.f65890d)) * 31) + mw7.m31069hashCodeimpl(this.f65891e)) * 31;
        bxc bxcVar = this.f65892f;
        return ((iHashCode + (bxcVar != null ? bxcVar.hashCode() : 0)) * 31) + this.f65893g.hashCode();
    }

    @yfb
    public String toString() {
        return "ImeOptions(singleLine=" + this.f65887a + ", capitalization=" + ((Object) vr8.m32800toStringimpl(this.f65888b)) + ", autoCorrect=" + this.f65889c + ", keyboardType=" + ((Object) xr8.m33243toStringimpl(this.f65890d)) + ", imeAction=" + ((Object) mw7.m31070toStringimpl(this.f65891e)) + ", platformImeOptions=" + this.f65892f + ", hintLocales=" + this.f65893g + ')';
    }

    @q64(level = u64.f86867c, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public /* synthetic */ nw7(boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar, jt3 jt3Var) {
        this(z, i, z2, i2, i3, bxcVar);
    }

    public /* synthetic */ nw7(boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar, ye9 ye9Var, jt3 jt3Var) {
        this(z, i, z2, i2, i3, bxcVar, ye9Var);
    }

    private nw7(boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar, ye9 ye9Var) {
        this.f65887a = z;
        this.f65888b = i;
        this.f65889c = z2;
        this.f65890d = i2;
        this.f65891e = i3;
        this.f65892f = bxcVar;
        this.f65893g = ye9Var;
    }

    public /* synthetic */ nw7(boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar, ye9 ye9Var, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? vr8.f92051b.m32808getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? xr8.f99029b.m33262getTextPjHm6EE() : i2, (i4 & 16) != 0 ? mw7.f62552b.m31081getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : bxcVar, (i4 & 64) != 0 ? ye9.f101294c.getEmpty() : ye9Var, (jt3) null);
    }

    public /* synthetic */ nw7(boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? vr8.f92051b.m32808getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? xr8.f99029b.m33262getTextPjHm6EE() : i2, (i4 & 16) != 0 ? mw7.f62552b.m31081getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : bxcVar, (jt3) null);
    }

    private nw7(boolean z, int i, boolean z2, int i2, int i3, bxc bxcVar) {
        this(z, i, z2, i2, i3, bxcVar, ye9.f101294c.getEmpty(), (jt3) null);
    }

    public /* synthetic */ nw7(boolean z, int i, boolean z2, int i2, int i3, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? vr8.f92051b.m32808getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? xr8.f99029b.m33262getTextPjHm6EE() : i2, (i4 & 16) != 0 ? mw7.f62552b.m31081getDefaulteUduSuo() : i3, (jt3) null);
    }

    private nw7(boolean z, int i, boolean z2, int i2, int i3) {
        this(z, i, z2, i2, i3, null, null, 64, null);
    }
}
