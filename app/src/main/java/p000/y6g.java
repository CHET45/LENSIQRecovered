package p000;

import p000.u0f;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 5 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 6 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n76#2,6:392\n82#2,9:406\n271#3,8:398\n513#4,3:415\n513#4,3:418\n133#5,18:421\n384#6,5:439\n384#6,5:444\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n75#1:392,6\n75#1:406,9\n75#1:398,8\n202#1:415,3\n203#1:418,3\n215#1:421,18\n308#1:439,5\n315#1:444,5\n*E\n"})
public class y6g extends AbstractC14337w0 implements ok8, uz1 {

    /* JADX INFO: renamed from: d */
    @yfb
    public final bk8 f100517d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final csi f100518e;

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public final AbstractC2163c2 f100519f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final n2f f100520g;

    /* JADX INFO: renamed from: h */
    public int f100521h;

    /* JADX INFO: renamed from: i */
    @gib
    public C15506a f100522i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final hk8 f100523j;

    /* JADX INFO: renamed from: k */
    @gib
    public final vk8 f100524k;

    /* JADX INFO: renamed from: y6g$a */
    public static final class C15506a {

        /* JADX INFO: renamed from: a */
        @gib
        @un8
        public String f100525a;

        public C15506a(@gib String str) {
            this.f100525a = str;
        }
    }

    /* JADX INFO: renamed from: y6g$b */
    public /* synthetic */ class C15507b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100526a;

        static {
            int[] iArr = new int[csi.values().length];
            try {
                iArr[csi.f27317d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[csi.f27318e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[csi.f27319f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[csi.f27316c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100526a = iArr;
        }
    }

    public y6g(@yfb bk8 bk8Var, @yfb csi csiVar, @yfb AbstractC2163c2 abstractC2163c2, @yfb f0f f0fVar, @gib C15506a c15506a) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(csiVar, "mode");
        md8.checkNotNullParameter(abstractC2163c2, "lexer");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        this.f100517d = bk8Var;
        this.f100518e = csiVar;
        this.f100519f = abstractC2163c2;
        this.f100520g = bk8Var.getSerializersModule();
        this.f100521h = -1;
        this.f100522i = c15506a;
        hk8 configuration = bk8Var.getConfiguration();
        this.f100523j = configuration;
        this.f100524k = configuration.getExplicitNulls() ? null : new vk8(f0fVar);
    }

    private final void checkLeadingComma() {
        if (this.f100519f.peekNextToken() != 4) {
            return;
        }
        AbstractC2163c2.fail$default(this.f100519f, "Unexpected leading comma", 0, null, 6, null);
        throw new us8();
    }

    private final boolean coerceInputValue(f0f f0fVar, int i) {
        String strPeekString;
        bk8 bk8Var = this.f100517d;
        boolean zIsElementOptional = f0fVar.isElementOptional(i);
        f0f elementDescriptor = f0fVar.getElementDescriptor(i);
        if (zIsElementOptional && !elementDescriptor.isNullable() && this.f100519f.tryConsumeNull(true)) {
            return true;
        }
        if (md8.areEqual(elementDescriptor.getKind(), u0f.C13312b.f86523a) && ((!elementDescriptor.isNullable() || !this.f100519f.tryConsumeNull(false)) && (strPeekString = this.f100519f.peekString(this.f100523j.isLenient())) != null)) {
            int jsonNameIndex = vl8.getJsonNameIndex(elementDescriptor, bk8Var, strPeekString);
            boolean z = !bk8Var.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (jsonNameIndex == -3 && (zIsElementOptional || z)) {
                this.f100519f.consumeString();
                return true;
            }
        }
        return false;
    }

    private final int decodeListIndex() {
        boolean zTryConsumeComma = this.f100519f.tryConsumeComma();
        if (!this.f100519f.canConsumeValue()) {
            if (!zTryConsumeComma || this.f100517d.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            il8.invalidTrailingComma(this.f100519f, "array");
            throw new us8();
        }
        int i = this.f100521h;
        if (i != -1 && !zTryConsumeComma) {
            AbstractC2163c2.fail$default(this.f100519f, "Expected end of the array or comma", 0, null, 6, null);
            throw new us8();
        }
        int i2 = i + 1;
        this.f100521h = i2;
        return i2;
    }

    private final int decodeMapIndex() {
        int i = this.f100521h;
        boolean zTryConsumeComma = false;
        boolean z = i % 2 != 0;
        if (!z) {
            this.f100519f.consumeNextToken(':');
        } else if (i != -1) {
            zTryConsumeComma = this.f100519f.tryConsumeComma();
        }
        if (!this.f100519f.canConsumeValue()) {
            if (!zTryConsumeComma || this.f100517d.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            il8.invalidTrailingComma$default(this.f100519f, null, 1, null);
            throw new us8();
        }
        if (z) {
            if (this.f100521h == -1) {
                AbstractC2163c2 abstractC2163c2 = this.f100519f;
                int i2 = abstractC2163c2.f15565a;
                if (zTryConsumeComma) {
                    AbstractC2163c2.fail$default(abstractC2163c2, "Unexpected leading comma", i2, null, 4, null);
                    throw new us8();
                }
            } else {
                AbstractC2163c2 abstractC2163c22 = this.f100519f;
                int i3 = abstractC2163c22.f15565a;
                if (!zTryConsumeComma) {
                    AbstractC2163c2.fail$default(abstractC2163c22, "Expected comma after the key-value pair", i3, null, 4, null);
                    throw new us8();
                }
            }
        }
        int i4 = this.f100521h + 1;
        this.f100521h = i4;
        return i4;
    }

    private final int decodeObjectIndex(f0f f0fVar) {
        int jsonNameIndex;
        boolean zTryConsumeComma;
        boolean zTryConsumeComma2 = this.f100519f.tryConsumeComma();
        while (true) {
            boolean z = true;
            if (!this.f100519f.canConsumeValue()) {
                if (zTryConsumeComma2 && !this.f100517d.getConfiguration().getAllowTrailingComma()) {
                    il8.invalidTrailingComma$default(this.f100519f, null, 1, null);
                    throw new us8();
                }
                vk8 vk8Var = this.f100524k;
                if (vk8Var != null) {
                    return vk8Var.nextUnmarkedIndex$kotlinx_serialization_json();
                }
                return -1;
            }
            String strDecodeStringKey = decodeStringKey();
            this.f100519f.consumeNextToken(':');
            jsonNameIndex = vl8.getJsonNameIndex(f0fVar, this.f100517d, strDecodeStringKey);
            if (jsonNameIndex == -3) {
                zTryConsumeComma = false;
            } else {
                if (!this.f100523j.getCoerceInputValues() || !coerceInputValue(f0fVar, jsonNameIndex)) {
                    break;
                }
                zTryConsumeComma = this.f100519f.tryConsumeComma();
                z = false;
            }
            zTryConsumeComma2 = z ? handleUnknown(strDecodeStringKey) : zTryConsumeComma;
        }
        vk8 vk8Var2 = this.f100524k;
        if (vk8Var2 != null) {
            vk8Var2.mark$kotlinx_serialization_json(jsonNameIndex);
        }
        return jsonNameIndex;
    }

    private final String decodeStringKey() {
        return this.f100523j.isLenient() ? this.f100519f.consumeStringLenientNotNull() : this.f100519f.consumeKeyString();
    }

    private final boolean handleUnknown(String str) {
        if (this.f100523j.getIgnoreUnknownKeys() || trySkip(this.f100522i, str)) {
            this.f100519f.skipElement(this.f100523j.isLenient());
        } else {
            this.f100519f.failOnUnknownKey(str);
        }
        return this.f100519f.tryConsumeComma();
    }

    private final void skipLeftoverElements(f0f f0fVar) {
        while (decodeElementIndex(f0fVar) != -1) {
        }
    }

    private final boolean trySkip(C15506a c15506a, String str) {
        if (c15506a == null || !md8.areEqual(c15506a.f100525a, str)) {
            return false;
        }
        c15506a.f100525a = null;
        return true;
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    @yfb
    public lm2 beginStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        csi csiVarSwitchMode = dsi.switchMode(this.f100517d, f0fVar);
        this.f100519f.f15566b.pushDescriptor(f0fVar);
        this.f100519f.consumeNextToken(csiVarSwitchMode.f27321a);
        checkLeadingComma();
        int i = C15507b.f100526a[csiVarSwitchMode.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? new y6g(this.f100517d, csiVarSwitchMode, this.f100519f, f0fVar, this.f100522i) : (this.f100518e == csiVarSwitchMode && this.f100517d.getConfiguration().getExplicitNulls()) ? this : new y6g(this.f100517d, csiVarSwitchMode, this.f100519f, f0fVar, this.f100522i);
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public boolean decodeBoolean() {
        return this.f100519f.consumeBooleanLenient();
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public byte decodeByte() {
        long jConsumeNumericLiteral = this.f100519f.consumeNumericLiteral();
        byte b = (byte) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == b) {
            return b;
        }
        AbstractC2163c2.fail$default(this.f100519f, "Failed to parse byte for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new us8();
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public char decodeChar() {
        String strConsumeStringLenient = this.f100519f.consumeStringLenient();
        if (strConsumeStringLenient.length() == 1) {
            return strConsumeStringLenient.charAt(0);
        }
        AbstractC2163c2.fail$default(this.f100519f, "Expected single char, but got '" + strConsumeStringLenient + '\'', 0, null, 6, null);
        throw new us8();
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public double decodeDouble() {
        AbstractC2163c2 abstractC2163c2 = this.f100519f;
        String strConsumeStringLenient = abstractC2163c2.consumeStringLenient();
        try {
            double d = Double.parseDouble(strConsumeStringLenient);
            if (this.f100517d.getConfiguration().getAllowSpecialFloatingPointValues() || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            il8.throwInvalidFloatingPointDecoded(this.f100519f, Double.valueOf(d));
            throw new us8();
        } catch (IllegalArgumentException unused) {
            AbstractC2163c2.fail$default(abstractC2163c2, "Failed to parse type 'double' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new us8();
        }
    }

    @Override // p000.lm2
    public int decodeElementIndex(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        int i = C15507b.f100526a[this.f100518e.ordinal()];
        int iDecodeListIndex = i != 2 ? i != 4 ? decodeListIndex() : decodeObjectIndex(f0fVar) : decodeMapIndex();
        if (this.f100518e != csi.f27318e) {
            this.f100519f.f15566b.updateDescriptorIndex(iDecodeListIndex);
        }
        return iDecodeListIndex;
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public int decodeEnum(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        return vl8.getJsonNameIndexOrThrow(f0fVar, this.f100517d, decodeString(), " at path " + this.f100519f.f15566b.getPath());
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public float decodeFloat() {
        AbstractC2163c2 abstractC2163c2 = this.f100519f;
        String strConsumeStringLenient = abstractC2163c2.consumeStringLenient();
        try {
            float f = Float.parseFloat(strConsumeStringLenient);
            if (this.f100517d.getConfiguration().getAllowSpecialFloatingPointValues() || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            il8.throwInvalidFloatingPointDecoded(this.f100519f, Float.valueOf(f));
            throw new us8();
        } catch (IllegalArgumentException unused) {
            AbstractC2163c2.fail$default(abstractC2163c2, "Failed to parse type '" + ymh.InterfaceC15723b.f102125c + "' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new us8();
        }
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    @yfb
    public jl3 decodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return b7g.isUnsignedNumber(f0fVar) ? new pk8(this.f100519f, this.f100517d) : super.decodeInline(f0fVar);
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public int decodeInt() {
        long jConsumeNumericLiteral = this.f100519f.consumeNumericLiteral();
        int i = (int) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == i) {
            return i;
        }
        AbstractC2163c2.fail$default(this.f100519f, "Failed to parse int for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new us8();
    }

    @Override // p000.ok8
    @yfb
    public sk8 decodeJsonElement() {
        return new wm8(this.f100517d.getConfiguration(), this.f100519f).read();
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public long decodeLong() {
        return this.f100519f.consumeNumericLiteral();
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public boolean decodeNotNullMark() {
        vk8 vk8Var = this.f100524k;
        return ((vk8Var != null ? vk8Var.isUnmarkedNull$kotlinx_serialization_json() : false) || AbstractC2163c2.tryConsumeNull$default(this.f100519f, false, 1, null)) ? false : true;
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    @gib
    public Void decodeNull() {
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.AbstractC14337w0, p000.lm2
    public <T> T decodeSerializableElement(@yfb f0f f0fVar, int i, @yfb t74<? extends T> t74Var, @gib T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(t74Var, "deserializer");
        boolean z = this.f100518e == csi.f27318e && (i & 1) == 0;
        if (z) {
            this.f100519f.f15566b.resetCurrentMapKey();
        }
        T t2 = (T) super.decodeSerializableElement(f0fVar, i, t74Var, t);
        if (z) {
            this.f100519f.f15566b.updateCurrentMapKey(t2);
        }
        return t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a  */
    @Override // p000.AbstractC14337w0, p000.jl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T decodeSerializableValue(@p000.yfb p000.t74<? extends T> r12) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y6g.decodeSerializableValue(t74):java.lang.Object");
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    public short decodeShort() {
        long jConsumeNumericLiteral = this.f100519f.consumeNumericLiteral();
        short s = (short) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == s) {
            return s;
        }
        AbstractC2163c2.fail$default(this.f100519f, "Failed to parse short for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new us8();
    }

    @Override // p000.AbstractC14337w0, p000.jl3
    @yfb
    public String decodeString() {
        return this.f100523j.isLenient() ? this.f100519f.consumeStringLenientNotNull() : this.f100519f.consumeString();
    }

    @Override // p000.uz1
    public void decodeStringChunked(@yfb qy6<? super String, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "consumeChunk");
        this.f100519f.consumeStringChunked(this.f100523j.isLenient(), qy6Var);
    }

    @Override // p000.AbstractC14337w0, p000.lm2
    public void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (this.f100517d.getConfiguration().getIgnoreUnknownKeys() && f0fVar.getElementsCount() == 0) {
            skipLeftoverElements(f0fVar);
        }
        if (this.f100519f.tryConsumeComma() && !this.f100517d.getConfiguration().getAllowTrailingComma()) {
            il8.invalidTrailingComma(this.f100519f, "");
            throw new us8();
        }
        this.f100519f.consumeNextToken(this.f100518e.f27322b);
        this.f100519f.f15566b.popDescriptor();
    }

    @Override // p000.ok8
    @yfb
    public final bk8 getJson() {
        return this.f100517d;
    }

    @Override // p000.jl3, p000.lm2
    @yfb
    public n2f getSerializersModule() {
        return this.f100520g;
    }
}
