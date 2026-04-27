package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n178#1,2:259\n178#1,2:261\n21#2,12:233\n35#2,13:246\n1#3:245\n1#3:263\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n168#1:259,2\n169#1:261,2\n68#1:233,12\n68#1:246,13\n68#1:245\n*E\n"})
public final class a7g extends AbstractC4578d1 implements el8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final am2 f588a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final bk8 f589b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final csi f590c;

    /* JADX INFO: renamed from: d */
    @gib
    public final el8[] f591d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final n2f f592e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final hk8 f593f;

    /* JADX INFO: renamed from: g */
    public boolean f594g;

    /* JADX INFO: renamed from: h */
    @gib
    public String f595h;

    /* JADX INFO: renamed from: i */
    @gib
    public String f596i;

    /* JADX INFO: renamed from: a7g$a */
    public /* synthetic */ class C0085a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f597a;

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
            f597a = iArr;
        }
    }

    public a7g(@yfb am2 am2Var, @yfb bk8 bk8Var, @yfb csi csiVar, @gib el8[] el8VarArr) {
        md8.checkNotNullParameter(am2Var, "composer");
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(csiVar, "mode");
        this.f588a = am2Var;
        this.f589b = bk8Var;
        this.f590c = csiVar;
        this.f591d = el8VarArr;
        this.f592e = getJson().getSerializersModule();
        this.f593f = getJson().getConfiguration();
        int iOrdinal = csiVar.ordinal();
        if (el8VarArr != null) {
            el8 el8Var = el8VarArr[iOrdinal];
            if (el8Var == null && el8Var == this) {
                return;
            }
            el8VarArr[iOrdinal] = this;
        }
    }

    private final /* synthetic */ <T extends am2> T composerAs(gz6<? super ab8, ? super Boolean, ? extends T> gz6Var) {
        am2 am2Var = this.f588a;
        md8.reifiedOperationMarker(3, "T");
        return am2Var != null ? (T) this.f588a : gz6Var.invoke(this.f588a.f2022a, Boolean.valueOf(this.f594g));
    }

    private final void encodeTypeInfo(String str, String str2) {
        this.f588a.nextItem();
        encodeString(str);
        this.f588a.print(':');
        this.f588a.space();
        encodeString(str2);
    }

    @Override // p000.AbstractC4578d1, p000.m15
    @yfb
    public om2 beginStructure(@yfb f0f f0fVar) {
        el8 el8Var;
        md8.checkNotNullParameter(f0fVar, "descriptor");
        csi csiVarSwitchMode = dsi.switchMode(getJson(), f0fVar);
        char c = csiVarSwitchMode.f27321a;
        if (c != 0) {
            this.f588a.print(c);
            this.f588a.indent();
        }
        String str = this.f595h;
        if (str != null) {
            String serialName = this.f596i;
            if (serialName == null) {
                serialName = f0fVar.getSerialName();
            }
            encodeTypeInfo(str, serialName);
            this.f595h = null;
            this.f596i = null;
        }
        if (this.f590c == csiVarSwitchMode) {
            return this;
        }
        el8[] el8VarArr = this.f591d;
        return (el8VarArr == null || (el8Var = el8VarArr[csiVarSwitchMode.ordinal()]) == null) ? new a7g(this.f588a, getJson(), csiVarSwitchMode, this.f591d) : el8Var;
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeBoolean(boolean z) {
        if (this.f594g) {
            encodeString(String.valueOf(z));
        } else {
            this.f588a.print(z);
        }
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeByte(byte b) {
        if (this.f594g) {
            encodeString(String.valueOf((int) b));
        } else {
            this.f588a.print(b);
        }
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeChar(char c) {
        encodeString(String.valueOf(c));
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeDouble(double d) {
        if (this.f594g) {
            encodeString(String.valueOf(d));
        } else {
            this.f588a.print(d);
        }
        if (this.f593f.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw il8.InvalidFloatingPointEncoded(Double.valueOf(d), this.f588a.f2022a.toString());
        }
    }

    @Override // p000.AbstractC4578d1
    public boolean encodeElement(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        int i2 = C0085a.f597a[this.f590c.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.f588a.getWritingFirst()) {
                        this.f588a.print(C4584d2.f28238g);
                    }
                    this.f588a.nextItem();
                    encodeString(vl8.getJsonElementName(f0fVar, getJson(), i));
                    this.f588a.print(':');
                    this.f588a.space();
                } else {
                    if (i == 0) {
                        this.f594g = true;
                    }
                    if (i == 1) {
                        this.f588a.print(C4584d2.f28238g);
                        this.f588a.space();
                        this.f594g = false;
                    }
                }
            } else if (this.f588a.getWritingFirst()) {
                this.f594g = true;
                this.f588a.nextItem();
            } else {
                if (i % 2 == 0) {
                    this.f588a.print(C4584d2.f28238g);
                    this.f588a.nextItem();
                    z = true;
                } else {
                    this.f588a.print(':');
                    this.f588a.space();
                }
                this.f594g = z;
            }
        } else {
            if (!this.f588a.getWritingFirst()) {
                this.f588a.print(C4584d2.f28238g);
            }
            this.f588a.nextItem();
        }
        return true;
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeEnum(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        encodeString(f0fVar.getElementName(i));
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeFloat(float f) {
        if (this.f594g) {
            encodeString(String.valueOf(f));
        } else {
            this.f588a.print(f);
        }
        if (this.f593f.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw il8.InvalidFloatingPointEncoded(Float.valueOf(f), this.f588a.f2022a.toString());
        }
    }

    @Override // p000.AbstractC4578d1, p000.m15
    @yfb
    public m15 encodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (b7g.isUnsignedNumber(f0fVar)) {
            am2 dm2Var = this.f588a;
            if (!(dm2Var instanceof dm2)) {
                dm2Var = new dm2(dm2Var.f2022a, this.f594g);
            }
            return new a7g(dm2Var, getJson(), this.f590c, (el8[]) null);
        }
        if (b7g.isUnquotedLiteral(f0fVar)) {
            am2 cm2Var = this.f588a;
            if (!(cm2Var instanceof cm2)) {
                cm2Var = new cm2(cm2Var.f2022a, this.f594g);
            }
            return new a7g(cm2Var, getJson(), this.f590c, (el8[]) null);
        }
        if (this.f595h == null) {
            return super.encodeInline(f0fVar);
        }
        this.f596i = f0fVar.getSerialName();
        return this;
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeInt(int i) {
        if (this.f594g) {
            encodeString(String.valueOf(i));
        } else {
            this.f588a.print(i);
        }
    }

    @Override // p000.el8
    public void encodeJsonElement(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        if (this.f595h == null || (sk8Var instanceof am8)) {
            encodeSerializableValue(cl8.f16886a, sk8Var);
        } else {
            x3d.throwJsonElementPolymorphicException(this.f596i, sk8Var);
            throw new us8();
        }
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeLong(long j) {
        if (this.f594g) {
            encodeString(String.valueOf(j));
        } else {
            this.f588a.print(j);
        }
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeNull() {
        this.f588a.print("null");
    }

    @Override // p000.AbstractC4578d1, p000.om2
    public <T> void encodeNullableSerializableElement(@yfb f0f f0fVar, int i, @yfb e1f<? super T> e1fVar, @gib T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(e1fVar, "serializer");
        if (t != null || this.f593f.getExplicitNulls()) {
            super.encodeNullableSerializableElement(f0fVar, i, e1fVar, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // p000.AbstractC4578d1, p000.m15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> void encodeSerializableValue(@p000.yfb p000.e1f<? super T> r4, T r5) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a7g.encodeSerializableValue(e1f, java.lang.Object):void");
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeShort(short s) {
        if (this.f594g) {
            encodeString(String.valueOf((int) s));
        } else {
            this.f588a.print(s);
        }
    }

    @Override // p000.AbstractC4578d1, p000.m15
    public void encodeString(@yfb String str) {
        md8.checkNotNullParameter(str, "value");
        this.f588a.printQuoted(str);
    }

    @Override // p000.AbstractC4578d1, p000.om2
    public void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (this.f590c.f27322b != 0) {
            this.f588a.unIndent();
            this.f588a.nextItemIfNotFirst();
            this.f588a.print(this.f590c.f27322b);
        }
    }

    @Override // p000.el8
    @yfb
    public bk8 getJson() {
        return this.f589b;
    }

    @Override // p000.m15, p000.om2
    @yfb
    public n2f getSerializersModule() {
        return this.f592e;
    }

    @Override // p000.AbstractC4578d1, p000.om2
    public boolean shouldEncodeElementDefault(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this.f593f.getEncodeDefaults();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a7g(@yfb ab8 ab8Var, @yfb bk8 bk8Var, @yfb csi csiVar, @yfb el8[] el8VarArr) {
        this(im2.Composer(ab8Var, bk8Var), bk8Var, csiVar, el8VarArr);
        md8.checkNotNullParameter(ab8Var, "output");
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(csiVar, "mode");
        md8.checkNotNullParameter(el8VarArr, "modeReuseCache");
    }
}
