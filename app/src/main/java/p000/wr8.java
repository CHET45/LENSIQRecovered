package p000;

import p000.mw7;
import p000.vr8;
import p000.xr8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
@vw7
public final class wr8 {

    /* JADX INFO: renamed from: i */
    public static final int f95197i = 0;

    /* JADX INFO: renamed from: a */
    public final int f95200a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Boolean f95201b;

    /* JADX INFO: renamed from: c */
    public final int f95202c;

    /* JADX INFO: renamed from: d */
    public final int f95203d;

    /* JADX INFO: renamed from: e */
    @gib
    public final bxc f95204e;

    /* JADX INFO: renamed from: f */
    @gib
    public final Boolean f95205f;

    /* JADX INFO: renamed from: g */
    @gib
    public final ye9 f95206g;

    /* JADX INFO: renamed from: h */
    @yfb
    public static final C14755a f95196h = new C14755a(null);

    /* JADX INFO: renamed from: j */
    @yfb
    public static final wr8 f95198j = new wr8(0, (Boolean) null, 0, 0, (bxc) null, (Boolean) null, (ye9) null, 127, (jt3) null);

    /* JADX INFO: renamed from: k */
    @yfb
    public static final wr8 f95199k = new wr8(0, Boolean.FALSE, xr8.f99029b.m33260getPasswordPjHm6EE(), 0, (bxc) null, (Boolean) null, (ye9) null, 121, (jt3) null);

    /* JADX INFO: renamed from: wr8$a */
    public static final class C14755a {
        public /* synthetic */ C14755a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getDefault$annotations() {
        }

        @f0g
        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }

        @yfb
        public final wr8 getDefault() {
            return wr8.f95198j;
        }

        @yfb
        public final wr8 getSecureTextField$foundation_release() {
            return wr8.f95199k;
        }

        private C14755a() {
        }
    }

    public /* synthetic */ wr8(int i, Boolean bool, int i2, int i3, bxc bxcVar, Boolean bool2, ye9 ye9Var, jt3 jt3Var) {
        this(i, bool, i2, i3, bxcVar, bool2, ye9Var);
    }

    /* JADX INFO: renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ wr8 m33097copy3m2b7yw$default(wr8 wr8Var, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = wr8Var.f95200a;
        }
        if ((i4 & 2) != 0) {
            z = wr8Var.getAutoCorrectOrDefault();
        }
        if ((i4 & 4) != 0) {
            i2 = wr8Var.f95202c;
        }
        if ((i4 & 8) != 0) {
            i3 = wr8Var.f95203d;
        }
        return wr8Var.m33103copy3m2b7yw(i, z, i2, i3);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ wr8 m33098copyINvB4aQ$default(wr8 wr8Var, int i, Boolean bool, int i2, int i3, bxc bxcVar, Boolean bool2, ye9 ye9Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = wr8Var.f95200a;
        }
        if ((i4 & 2) != 0) {
            bool = wr8Var.f95201b;
        }
        Boolean bool3 = bool;
        if ((i4 & 4) != 0) {
            i2 = wr8Var.f95202c;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = wr8Var.f95203d;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            bxcVar = wr8Var.f95204e;
        }
        return wr8Var.m33104copyINvB4aQ(i, bool3, i5, i6, bxcVar, (i4 & 32) != 0 ? null : bool2, (i4 & 64) != 0 ? null : ye9Var);
    }

    /* JADX INFO: renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ wr8 m33100copyij11fho$default(wr8 wr8Var, int i, boolean z, int i2, int i3, bxc bxcVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = wr8Var.f95200a;
        }
        if ((i4 & 2) != 0) {
            z = wr8Var.getAutoCorrectOrDefault();
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = wr8Var.f95202c;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = wr8Var.f95203d;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            bxcVar = wr8Var.f95204e;
        }
        return wr8Var.m33106copyij11fho(i, z2, i5, i6, bxcVar);
    }

    @q64(level = u64.f86865a, message = "Please use the autoCorrectEnabled property.")
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.f95201b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m33101getCapitalizationOrDefaultIUNYP9k() {
        vr8 vr8VarM32795boximpl = vr8.m32795boximpl(this.f95200a);
        int iM32801unboximpl = vr8VarM32795boximpl.m32801unboximpl();
        vr8.C14227a c14227a = vr8.f92051b;
        if (vr8.m32798equalsimpl0(iM32801unboximpl, c14227a.m32810getUnspecifiedIUNYP9k())) {
            vr8VarM32795boximpl = null;
        }
        return vr8VarM32795boximpl != null ? vr8VarM32795boximpl.m32801unboximpl() : c14227a.m32808getNoneIUNYP9k();
    }

    private final ye9 getHintLocalesOrDefault() {
        ye9 ye9Var = this.f95206g;
        return ye9Var == null ? ye9.f101294c.getEmpty() : ye9Var;
    }

    /* JADX INFO: renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m33102getKeyboardTypeOrDefaultPjHm6EE() {
        xr8 xr8VarM33238boximpl = xr8.m33238boximpl(this.f95202c);
        int iM33244unboximpl = xr8VarM33238boximpl.m33244unboximpl();
        xr8.C15260a c15260a = xr8.f99029b;
        if (xr8.m33241equalsimpl0(iM33244unboximpl, c15260a.m33263getUnspecifiedPjHm6EE())) {
            xr8VarM33238boximpl = null;
        }
        return xr8VarM33238boximpl != null ? xr8VarM33238boximpl.m33244unboximpl() : c15260a.m33262getTextPjHm6EE();
    }

    @q64(level = u64.f86867c, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private final boolean isCompletelyUnspecified() {
        return vr8.m32798equalsimpl0(this.f95200a, vr8.f92051b.m32810getUnspecifiedIUNYP9k()) && this.f95201b == null && xr8.m33241equalsimpl0(this.f95202c, xr8.f99029b.m33263getUnspecifiedPjHm6EE()) && mw7.m31068equalsimpl0(this.f95203d, mw7.f62552b.m31089getUnspecifiedeUduSuo()) && this.f95204e == null && this.f95205f == null && this.f95206g == null;
    }

    public static /* synthetic */ nw7 toImeOptions$foundation_release$default(wr8 wr8Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nw7.f65884h.getDefault().getSingleLine();
        }
        return wr8Var.toImeOptions$foundation_release(z);
    }

    @q64(level = u64.f86867c, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* JADX INFO: renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ wr8 m33103copy3m2b7yw(int i, boolean z, int i2, int i3) {
        return new wr8(i, Boolean.valueOf(z), i2, i3, this.f95204e, this.f95205f, this.f95206g, (jt3) null);
    }

    @yfb
    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final wr8 m33104copyINvB4aQ(int i, @gib Boolean bool, int i2, int i3, @gib bxc bxcVar, @gib Boolean bool2, @gib ye9 ye9Var) {
        return new wr8(i, bool, i2, i3, bxcVar, bool2, ye9Var, (jt3) null);
    }

    @q64(level = u64.f86867c, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ wr8 m33106copyij11fho(int i, boolean z, int i2, int i3, bxc bxcVar) {
        return new wr8(i, Boolean.valueOf(z), i2, i3, bxcVar, this.f95205f, this.f95206g, (jt3) null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr8)) {
            return false;
        }
        wr8 wr8Var = (wr8) obj;
        return vr8.m32798equalsimpl0(this.f95200a, wr8Var.f95200a) && md8.areEqual(this.f95201b, wr8Var.f95201b) && xr8.m33241equalsimpl0(this.f95202c, wr8Var.f95202c) && mw7.m31068equalsimpl0(this.f95203d, wr8Var.f95203d) && md8.areEqual(this.f95204e, wr8Var.f95204e) && md8.areEqual(this.f95205f, wr8Var.f95205f) && md8.areEqual(this.f95206g, wr8Var.f95206g);
    }

    @f0g
    @yfb
    public final wr8 fillUnspecifiedValuesWith$foundation_release(@gib wr8 wr8Var) {
        if (wr8Var == null || wr8Var.isCompletelyUnspecified() || md8.areEqual(wr8Var, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return wr8Var;
        }
        vr8 vr8VarM32795boximpl = vr8.m32795boximpl(this.f95200a);
        if (vr8.m32798equalsimpl0(vr8VarM32795boximpl.m32801unboximpl(), vr8.f92051b.m32810getUnspecifiedIUNYP9k())) {
            vr8VarM32795boximpl = null;
        }
        int iM32801unboximpl = vr8VarM32795boximpl != null ? vr8VarM32795boximpl.m32801unboximpl() : wr8Var.f95200a;
        Boolean bool = this.f95201b;
        if (bool == null) {
            bool = wr8Var.f95201b;
        }
        Boolean bool2 = bool;
        xr8 xr8VarM33238boximpl = xr8.m33238boximpl(this.f95202c);
        if (xr8.m33241equalsimpl0(xr8VarM33238boximpl.m33244unboximpl(), xr8.f99029b.m33263getUnspecifiedPjHm6EE())) {
            xr8VarM33238boximpl = null;
        }
        int iM33244unboximpl = xr8VarM33238boximpl != null ? xr8VarM33238boximpl.m33244unboximpl() : wr8Var.f95202c;
        mw7 mw7VarM31065boximpl = mw7.m31065boximpl(this.f95203d);
        mw7 mw7Var = mw7.m31068equalsimpl0(mw7VarM31065boximpl.m31071unboximpl(), mw7.f62552b.m31089getUnspecifiedeUduSuo()) ? null : mw7VarM31065boximpl;
        int iM31071unboximpl = mw7Var != null ? mw7Var.m31071unboximpl() : wr8Var.f95203d;
        bxc bxcVar = this.f95204e;
        if (bxcVar == null) {
            bxcVar = wr8Var.f95204e;
        }
        bxc bxcVar2 = bxcVar;
        Boolean bool3 = this.f95205f;
        if (bool3 == null) {
            bool3 = wr8Var.f95205f;
        }
        Boolean bool4 = bool3;
        ye9 ye9Var = this.f95206g;
        return new wr8(iM32801unboximpl, bool2, iM33244unboximpl, iM31071unboximpl, bxcVar2, bool4, ye9Var == null ? wr8Var.f95206g : ye9Var, (jt3) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    @gib
    public final Boolean getAutoCorrectEnabled() {
        return this.f95201b;
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m33107getCapitalizationIUNYP9k() {
        return this.f95200a;
    }

    @gib
    public final ye9 getHintLocales() {
        return this.f95206g;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m33108getImeActioneUduSuo() {
        return this.f95203d;
    }

    /* JADX INFO: renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m33109getImeActionOrDefaulteUduSuo$foundation_release() {
        mw7 mw7VarM31065boximpl = mw7.m31065boximpl(this.f95203d);
        int iM31071unboximpl = mw7VarM31065boximpl.m31071unboximpl();
        mw7.C9571a c9571a = mw7.f62552b;
        if (mw7.m31068equalsimpl0(iM31071unboximpl, c9571a.m31089getUnspecifiedeUduSuo())) {
            mw7VarM31065boximpl = null;
        }
        return mw7VarM31065boximpl != null ? mw7VarM31065boximpl.m31071unboximpl() : c9571a.m31081getDefaulteUduSuo();
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m33110getKeyboardTypePjHm6EE() {
        return this.f95202c;
    }

    @gib
    public final bxc getPlatformImeOptions() {
        return this.f95204e;
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.f95205f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @gib
    public final Boolean getShowKeyboardOnFocus() {
        return this.f95205f;
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        Boolean bool = this.f95205f;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public int hashCode() {
        int iM32799hashCodeimpl = vr8.m32799hashCodeimpl(this.f95200a) * 31;
        Boolean bool = this.f95201b;
        int iHashCode = (((((iM32799hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31) + xr8.m33242hashCodeimpl(this.f95202c)) * 31) + mw7.m31069hashCodeimpl(this.f95203d)) * 31;
        bxc bxcVar = this.f95204e;
        int iHashCode2 = (iHashCode + (bxcVar != null ? bxcVar.hashCode() : 0)) * 31;
        Boolean bool2 = this.f95205f;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        ye9 ye9Var = this.f95206g;
        return iHashCode3 + (ye9Var != null ? ye9Var.hashCode() : 0);
    }

    @yfb
    public final wr8 merge(@gib wr8 wr8Var) {
        wr8 wr8VarFillUnspecifiedValuesWith$foundation_release;
        return (wr8Var == null || (wr8VarFillUnspecifiedValuesWith$foundation_release = wr8Var.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : wr8VarFillUnspecifiedValuesWith$foundation_release;
    }

    @yfb
    public final nw7 toImeOptions$foundation_release(boolean z) {
        return new nw7(z, m33101getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m33102getKeyboardTypeOrDefaultPjHm6EE(), m33109getImeActionOrDefaulteUduSuo$foundation_release(), this.f95204e, getHintLocalesOrDefault(), (jt3) null);
    }

    @yfb
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) vr8.m32800toStringimpl(this.f95200a)) + ", autoCorrectEnabled=" + this.f95201b + ", keyboardType=" + ((Object) xr8.m33243toStringimpl(this.f95202c)) + ", imeAction=" + ((Object) mw7.m31070toStringimpl(this.f95203d)) + ", platformImeOptions=" + this.f95204e + "showKeyboardOnFocus=" + this.f95205f + ", hintLocales=" + this.f95206g + ')';
    }

    @q64(level = u64.f86867c, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ wr8(int i, boolean z, int i2, int i3, jt3 jt3Var) {
        this(i, z, i2, i3);
    }

    @q64(level = u64.f86867c, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @i2e(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ wr8 m33105copyINvB4aQ(int i, boolean z, int i2, int i3, bxc bxcVar, Boolean bool, ye9 ye9Var) {
        return new wr8(i, Boolean.valueOf(z), i2, i3, bxcVar, bool, ye9Var, (jt3) null);
    }

    @q64(level = u64.f86867c, message = "Maintained for binary compat")
    public /* synthetic */ wr8(int i, boolean z, int i2, int i3, bxc bxcVar, jt3 jt3Var) {
        this(i, z, i2, i3, bxcVar);
    }

    @q64(level = u64.f86865a, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @i2e(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ wr8(int i, boolean z, int i2, int i3, bxc bxcVar, Boolean bool, ye9 ye9Var, jt3 jt3Var) {
        this(i, z, i2, i3, bxcVar, bool, ye9Var);
    }

    private wr8(int i, Boolean bool, int i2, int i3, bxc bxcVar, Boolean bool2, ye9 ye9Var) {
        this.f95200a = i;
        this.f95201b = bool;
        this.f95202c = i2;
        this.f95203d = i3;
        this.f95204e = bxcVar;
        this.f95205f = bool2;
        this.f95206g = ye9Var;
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ wr8 m33099copyINvB4aQ$default(wr8 wr8Var, int i, boolean z, int i2, int i3, bxc bxcVar, Boolean bool, ye9 ye9Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = wr8Var.f95200a;
        }
        if ((i4 & 2) != 0) {
            z = wr8Var.getAutoCorrectOrDefault();
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = wr8Var.f95202c;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = wr8Var.f95203d;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            bxcVar = wr8Var.f95204e;
        }
        bxc bxcVar2 = bxcVar;
        if ((i4 & 32) != 0) {
            bool = Boolean.valueOf(wr8Var.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        Boolean bool2 = bool;
        if ((i4 & 64) != 0) {
            ye9Var = wr8Var.f95206g;
        }
        return wr8Var.m33105copyINvB4aQ(i, z2, i5, i6, bxcVar2, bool2, ye9Var);
    }

    public /* synthetic */ wr8(int i, Boolean bool, int i2, int i3, bxc bxcVar, Boolean bool2, ye9 ye9Var, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? vr8.f92051b.m32810getUnspecifiedIUNYP9k() : i, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? xr8.f99029b.m33263getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? mw7.f62552b.m31089getUnspecifiedeUduSuo() : i3, (i4 & 16) != 0 ? null : bxcVar, (i4 & 32) != 0 ? null : bool2, (i4 & 64) == 0 ? ye9Var : null, (jt3) null);
    }

    public /* synthetic */ wr8(int i, boolean z, int i2, int i3, bxc bxcVar, Boolean bool, ye9 ye9Var, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? vr8.f92051b.m32810getUnspecifiedIUNYP9k() : i, z, (i4 & 4) != 0 ? xr8.f99029b.m33263getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? mw7.f62552b.m31089getUnspecifiedeUduSuo() : i3, (i4 & 16) != 0 ? null : bxcVar, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : ye9Var, (jt3) null);
    }

    private wr8(int i, boolean z, int i2, int i3, bxc bxcVar, Boolean bool, ye9 ye9Var) {
        this(i, Boolean.valueOf(z), i2, i3, bxcVar, bool, ye9Var, (jt3) null);
    }

    public /* synthetic */ wr8(int i, boolean z, int i2, int i3, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? vr8.f92051b.m32810getUnspecifiedIUNYP9k() : i, (i4 & 2) != 0 ? f95198j.getAutoCorrectOrDefault() : z, (i4 & 4) != 0 ? xr8.f99029b.m33263getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? mw7.f62552b.m31081getDefaulteUduSuo() : i3, (jt3) null);
    }

    private wr8(int i, boolean z, int i2, int i3) {
        this(i, Boolean.valueOf(z), i2, i3, (bxc) null, (Boolean) null, (ye9) null, 96, (jt3) null);
    }

    public /* synthetic */ wr8(int i, boolean z, int i2, int i3, bxc bxcVar, int i4, jt3 jt3Var) {
        this((i4 & 1) != 0 ? vr8.f92051b.m32808getNoneIUNYP9k() : i, (i4 & 2) != 0 ? f95198j.getAutoCorrectOrDefault() : z, (i4 & 4) != 0 ? xr8.f99029b.m33262getTextPjHm6EE() : i2, (i4 & 8) != 0 ? mw7.f62552b.m31081getDefaulteUduSuo() : i3, (i4 & 16) != 0 ? null : bxcVar, (jt3) null);
    }

    private wr8(int i, boolean z, int i2, int i3, bxc bxcVar) {
        this(i, Boolean.valueOf(z), i2, i3, bxcVar, Boolean.valueOf(f95198j.getShowKeyboardOnFocusOrDefault$foundation_release()), (ye9) null, 64, (jt3) null);
    }
}
