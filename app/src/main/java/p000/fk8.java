package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,684:1\n1069#2,2:685\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n647#1:685,2\n*E\n"})
public final class fk8 {

    /* JADX INFO: renamed from: a */
    public boolean f36927a;

    /* JADX INFO: renamed from: b */
    public boolean f36928b;

    /* JADX INFO: renamed from: c */
    public boolean f36929c;

    /* JADX INFO: renamed from: d */
    public boolean f36930d;

    /* JADX INFO: renamed from: e */
    public boolean f36931e;

    /* JADX INFO: renamed from: f */
    @yfb
    public String f36932f;

    /* JADX INFO: renamed from: g */
    public boolean f36933g;

    /* JADX INFO: renamed from: h */
    @yfb
    public String f36934h;

    /* JADX INFO: renamed from: i */
    @yfb
    public b12 f36935i;

    /* JADX INFO: renamed from: j */
    public boolean f36936j;

    /* JADX INFO: renamed from: k */
    @gib
    public wl8 f36937k;

    /* JADX INFO: renamed from: l */
    public boolean f36938l;

    /* JADX INFO: renamed from: m */
    public boolean f36939m;

    /* JADX INFO: renamed from: n */
    public boolean f36940n;

    /* JADX INFO: renamed from: o */
    public boolean f36941o;

    /* JADX INFO: renamed from: p */
    public boolean f36942p;

    /* JADX INFO: renamed from: q */
    public boolean f36943q;

    /* JADX INFO: renamed from: r */
    @yfb
    public n2f f36944r;

    public fk8(@yfb bk8 bk8Var) {
        md8.checkNotNullParameter(bk8Var, "json");
        this.f36927a = bk8Var.getConfiguration().getEncodeDefaults();
        this.f36928b = bk8Var.getConfiguration().getExplicitNulls();
        this.f36929c = bk8Var.getConfiguration().getIgnoreUnknownKeys();
        this.f36930d = bk8Var.getConfiguration().isLenient();
        this.f36931e = bk8Var.getConfiguration().getPrettyPrint();
        this.f36932f = bk8Var.getConfiguration().getPrettyPrintIndent();
        this.f36933g = bk8Var.getConfiguration().getCoerceInputValues();
        this.f36934h = bk8Var.getConfiguration().getClassDiscriminator();
        this.f36935i = bk8Var.getConfiguration().getClassDiscriminatorMode();
        this.f36936j = bk8Var.getConfiguration().getUseAlternativeNames();
        this.f36937k = bk8Var.getConfiguration().getNamingStrategy();
        this.f36938l = bk8Var.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.f36939m = bk8Var.getConfiguration().getAllowTrailingComma();
        this.f36940n = bk8Var.getConfiguration().getAllowComments();
        this.f36941o = bk8Var.getConfiguration().getAllowSpecialFloatingPointValues();
        this.f36942p = bk8Var.getConfiguration().getAllowStructuredMapKeys();
        this.f36943q = bk8Var.getConfiguration().getUseArrayPolymorphism();
        this.f36944r = bk8Var.getSerializersModule();
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

    @yfb
    public final hk8 build$kotlinx_serialization_json() {
        if (this.f36943q) {
            if (!md8.areEqual(this.f36934h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f36935i != b12.f12370c) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f36931e) {
            if (!md8.areEqual(this.f36932f, pl8.f71328a)) {
                String str = this.f36932f;
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f36932f).toString());
                    }
                }
            }
        } else if (!md8.areEqual(this.f36932f, pl8.f71328a)) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new hk8(this.f36927a, this.f36929c, this.f36930d, this.f36942p, this.f36931e, this.f36928b, this.f36932f, this.f36933g, this.f36943q, this.f36934h, this.f36941o, this.f36936j, this.f36937k, this.f36938l, this.f36939m, this.f36940n, this.f36935i);
    }

    public final boolean getAllowComments() {
        return this.f36940n;
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.f36941o;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.f36942p;
    }

    public final boolean getAllowTrailingComma() {
        return this.f36939m;
    }

    @yfb
    public final String getClassDiscriminator() {
        return this.f36934h;
    }

    @yfb
    public final b12 getClassDiscriminatorMode() {
        return this.f36935i;
    }

    public final boolean getCoerceInputValues() {
        return this.f36933g;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.f36938l;
    }

    public final boolean getEncodeDefaults() {
        return this.f36927a;
    }

    public final boolean getExplicitNulls() {
        return this.f36928b;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.f36929c;
    }

    @gib
    public final wl8 getNamingStrategy() {
        return this.f36937k;
    }

    public final boolean getPrettyPrint() {
        return this.f36931e;
    }

    @yfb
    public final String getPrettyPrintIndent() {
        return this.f36932f;
    }

    @yfb
    public final n2f getSerializersModule() {
        return this.f36944r;
    }

    public final boolean getUseAlternativeNames() {
        return this.f36936j;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.f36943q;
    }

    public final boolean isLenient() {
        return this.f36930d;
    }

    public final void setAllowComments(boolean z) {
        this.f36940n = z;
    }

    public final void setAllowSpecialFloatingPointValues(boolean z) {
        this.f36941o = z;
    }

    public final void setAllowStructuredMapKeys(boolean z) {
        this.f36942p = z;
    }

    public final void setAllowTrailingComma(boolean z) {
        this.f36939m = z;
    }

    public final void setClassDiscriminator(@yfb String str) {
        md8.checkNotNullParameter(str, "<set-?>");
        this.f36934h = str;
    }

    public final void setClassDiscriminatorMode(@yfb b12 b12Var) {
        md8.checkNotNullParameter(b12Var, "<set-?>");
        this.f36935i = b12Var;
    }

    public final void setCoerceInputValues(boolean z) {
        this.f36933g = z;
    }

    public final void setDecodeEnumsCaseInsensitive(boolean z) {
        this.f36938l = z;
    }

    public final void setEncodeDefaults(boolean z) {
        this.f36927a = z;
    }

    public final void setExplicitNulls(boolean z) {
        this.f36928b = z;
    }

    public final void setIgnoreUnknownKeys(boolean z) {
        this.f36929c = z;
    }

    public final void setLenient(boolean z) {
        this.f36930d = z;
    }

    public final void setNamingStrategy(@gib wl8 wl8Var) {
        this.f36937k = wl8Var;
    }

    public final void setPrettyPrint(boolean z) {
        this.f36931e = z;
    }

    public final void setPrettyPrintIndent(@yfb String str) {
        md8.checkNotNullParameter(str, "<set-?>");
        this.f36932f = str;
    }

    public final void setSerializersModule(@yfb n2f n2fVar) {
        md8.checkNotNullParameter(n2fVar, "<set-?>");
        this.f36944r = n2fVar;
    }

    public final void setUseAlternativeNames(boolean z) {
        this.f36936j = z;
    }

    public final void setUseArrayPolymorphism(boolean z) {
        this.f36943q = z;
    }
}
