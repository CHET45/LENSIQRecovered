package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hk8 {

    /* JADX INFO: renamed from: a */
    public final boolean f43888a;

    /* JADX INFO: renamed from: b */
    public final boolean f43889b;

    /* JADX INFO: renamed from: c */
    public final boolean f43890c;

    /* JADX INFO: renamed from: d */
    public final boolean f43891d;

    /* JADX INFO: renamed from: e */
    public final boolean f43892e;

    /* JADX INFO: renamed from: f */
    public final boolean f43893f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final String f43894g;

    /* JADX INFO: renamed from: h */
    public final boolean f43895h;

    /* JADX INFO: renamed from: i */
    public final boolean f43896i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final String f43897j;

    /* JADX INFO: renamed from: k */
    public final boolean f43898k;

    /* JADX INFO: renamed from: l */
    public final boolean f43899l;

    /* JADX INFO: renamed from: m */
    @gib
    public final wl8 f43900m;

    /* JADX INFO: renamed from: n */
    public final boolean f43901n;

    /* JADX INFO: renamed from: o */
    public final boolean f43902o;

    /* JADX INFO: renamed from: p */
    public final boolean f43903p;

    /* JADX INFO: renamed from: q */
    @yfb
    public b12 f43904q;

    public hk8() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }

    @ph5
    public static /* synthetic */ void getAllowComments$annotations() {
    }

    @ph5
    public static /* synthetic */ void getAllowTrailingComma$annotations() {
    }

    @ph5
    public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
    }

    @ph5
    public static /* synthetic */ void getDecodeEnumsCaseInsensitive$annotations() {
    }

    @ph5
    public static /* synthetic */ void getNamingStrategy$annotations() {
    }

    @ph5
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }

    public final boolean getAllowComments() {
        return this.f43903p;
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.f43898k;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.f43891d;
    }

    public final boolean getAllowTrailingComma() {
        return this.f43902o;
    }

    @yfb
    public final String getClassDiscriminator() {
        return this.f43897j;
    }

    @yfb
    public final b12 getClassDiscriminatorMode() {
        return this.f43904q;
    }

    public final boolean getCoerceInputValues() {
        return this.f43895h;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.f43901n;
    }

    public final boolean getEncodeDefaults() {
        return this.f43888a;
    }

    public final boolean getExplicitNulls() {
        return this.f43893f;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.f43889b;
    }

    @gib
    public final wl8 getNamingStrategy() {
        return this.f43900m;
    }

    public final boolean getPrettyPrint() {
        return this.f43892e;
    }

    @yfb
    public final String getPrettyPrintIndent() {
        return this.f43894g;
    }

    public final boolean getUseAlternativeNames() {
        return this.f43899l;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.f43896i;
    }

    public final boolean isLenient() {
        return this.f43890c;
    }

    @q64(level = u64.f86866b, message = "JsonConfiguration is not meant to be mutable, and will be made read-only in a future release. The `Json(from = ...) {}` copy builder should be used instead.")
    public final void setClassDiscriminatorMode(@yfb b12 b12Var) {
        md8.checkNotNullParameter(b12Var, "<set-?>");
        this.f43904q = b12Var;
    }

    @yfb
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f43888a + ", ignoreUnknownKeys=" + this.f43889b + ", isLenient=" + this.f43890c + ", allowStructuredMapKeys=" + this.f43891d + ", prettyPrint=" + this.f43892e + ", explicitNulls=" + this.f43893f + ", prettyPrintIndent='" + this.f43894g + "', coerceInputValues=" + this.f43895h + ", useArrayPolymorphism=" + this.f43896i + ", classDiscriminator='" + this.f43897j + "', allowSpecialFloatingPointValues=" + this.f43898k + ", useAlternativeNames=" + this.f43899l + ", namingStrategy=" + this.f43900m + ", decodeEnumsCaseInsensitive=" + this.f43901n + ", allowTrailingComma=" + this.f43902o + ", allowComments=" + this.f43903p + ", classDiscriminatorMode=" + this.f43904q + ')';
    }

    public hk8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @yfb String str, boolean z7, boolean z8, @yfb String str2, boolean z9, boolean z10, @gib wl8 wl8Var, boolean z11, boolean z12, boolean z13, @yfb b12 b12Var) {
        md8.checkNotNullParameter(str, "prettyPrintIndent");
        md8.checkNotNullParameter(str2, "classDiscriminator");
        md8.checkNotNullParameter(b12Var, "classDiscriminatorMode");
        this.f43888a = z;
        this.f43889b = z2;
        this.f43890c = z3;
        this.f43891d = z4;
        this.f43892e = z5;
        this.f43893f = z6;
        this.f43894g = str;
        this.f43895h = z7;
        this.f43896i = z8;
        this.f43897j = str2;
        this.f43898k = z9;
        this.f43899l = z10;
        this.f43900m = wl8Var;
        this.f43901n = z11;
        this.f43902o = z12;
        this.f43903p = z13;
        this.f43904q = b12Var;
    }

    public /* synthetic */ hk8(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, wl8 wl8Var, boolean z11, boolean z12, boolean z13, b12 b12Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? pl8.f71328a : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : wl8Var, (i & 8192) != 0 ? false : z11, (i & 16384) != 0 ? false : z12, (i & 32768) != 0 ? false : z13, (i & 65536) != 0 ? b12.f12370c : b12Var);
    }
}
