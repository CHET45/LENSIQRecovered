package p000;

import p000.u0f;
import p000.xag;

/* JADX INFO: renamed from: g2 */
/* JADX INFO: loaded from: classes7.dex */
@ph5
@dwf({"SMAP\nTreeJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,280:1\n21#2,12:281\n35#2,13:294\n1#3:293\n36#4,9:307\n*S KotlinDebug\n*F\n+ 1 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeEncoder\n*L\n84#1:281,12\n84#1:294,13\n84#1:293\n154#1:307,9\n*E\n"})
public abstract class AbstractC6092g2 extends h9b implements el8 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final bk8 f38281b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qy6<sk8, bth> f38282c;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final hk8 f38283d;

    /* JADX INFO: renamed from: e */
    @gib
    public String f38284e;

    /* JADX INFO: renamed from: f */
    @gib
    public String f38285f;

    /* JADX INFO: renamed from: g2$a */
    public static final class a extends AbstractC4578d1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f38287b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ f0f f38288c;

        public a(String str, f0f f0fVar) {
            this.f38287b = str;
            this.f38288c = f0fVar;
        }

        @Override // p000.AbstractC4578d1, p000.m15
        public void encodeString(String str) {
            md8.checkNotNullParameter(str, "value");
            AbstractC6092g2.this.putElement(this.f38287b, new ql8(str, false, this.f38288c));
        }

        @Override // p000.m15, p000.om2
        public n2f getSerializersModule() {
            return AbstractC6092g2.this.getJson().getSerializersModule();
        }
    }

    /* JADX INFO: renamed from: g2$b */
    public static final class b extends AbstractC4578d1 {

        /* JADX INFO: renamed from: a */
        public final n2f f38289a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f38291c;

        public b(String str) {
            this.f38291c = str;
            this.f38289a = AbstractC6092g2.this.getJson().getSerializersModule();
        }

        @Override // p000.AbstractC4578d1, p000.m15
        public void encodeByte(byte b) {
            putUnquotedString(goh.m29830toStringimpl(goh.m29786constructorimpl(b)));
        }

        @Override // p000.AbstractC4578d1, p000.m15
        public void encodeInt(int i) {
            putUnquotedString(Integer.toUnsignedString(woh.m33004constructorimpl(i)));
        }

        @Override // p000.AbstractC4578d1, p000.m15
        public void encodeLong(long j) {
            putUnquotedString(Long.toUnsignedString(oph.m31533constructorimpl(j)));
        }

        @Override // p000.AbstractC4578d1, p000.m15
        public void encodeShort(short s) {
            putUnquotedString(iqh.m30368toStringimpl(iqh.m30324constructorimpl(s)));
        }

        @Override // p000.m15, p000.om2
        public n2f getSerializersModule() {
            return this.f38289a;
        }

        public final void putUnquotedString(String str) {
            md8.checkNotNullParameter(str, "s");
            AbstractC6092g2.this.putElement(this.f38291c, new ql8(str, false, null, 4, null));
        }
    }

    public /* synthetic */ AbstractC6092g2(bk8 bk8Var, qy6 qy6Var, jt3 jt3Var) {
        this(bk8Var, qy6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth beginStructure$lambda$2(AbstractC6092g2 abstractC6092g2, sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "node");
        abstractC6092g2.putElement(abstractC6092g2.m25287c(), sk8Var);
        return bth.f14751a;
    }

    private final a inlineUnquotedLiteralEncoder(String str, f0f f0fVar) {
        return new a(str, f0fVar);
    }

    @ggg
    private final b inlineUnsignedNumberEncoder(String str) {
        return new b(str);
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: b */
    public void mo11319b(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        this.f38282c.invoke(getCurrent());
    }

    @Override // p000.xlg, p000.m15
    @yfb
    public om2 beginStructure(@yfb f0f f0fVar) {
        AbstractC6092g2 tm8Var;
        md8.checkNotNullParameter(f0fVar, "descriptor");
        qy6<sk8, bth> qy6Var = m25288d() == null ? this.f38282c : new qy6() { // from class: f2
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return AbstractC6092g2.beginStructure$lambda$2(this.f34731a, (sk8) obj);
            }
        };
        u0f kind = f0fVar.getKind();
        if (md8.areEqual(kind, xag.C15018b.f97388a) || (kind instanceof w3d)) {
            tm8Var = new tm8(this.f38281b, qy6Var);
        } else if (md8.areEqual(kind, xag.C15019c.f97389a)) {
            bk8 bk8Var = this.f38281b;
            f0f f0fVarCarrierDescriptor = dsi.carrierDescriptor(f0fVar.getElementDescriptor(0), bk8Var.getSerializersModule());
            u0f kind2 = f0fVarCarrierDescriptor.getKind();
            if ((kind2 instanceof jbd) || md8.areEqual(kind2, u0f.C13312b.f86523a)) {
                tm8Var = new vm8(this.f38281b, qy6Var);
            } else {
                if (!bk8Var.getConfiguration().getAllowStructuredMapKeys()) {
                    throw il8.InvalidKeyKindException(f0fVarCarrierDescriptor);
                }
                tm8Var = new tm8(this.f38281b, qy6Var);
            }
        } else {
            tm8Var = new rm8(this.f38281b, qy6Var);
        }
        String str = this.f38284e;
        if (str != null) {
            if (tm8Var instanceof vm8) {
                vm8 vm8Var = (vm8) tm8Var;
                vm8Var.putElement("key", uk8.JsonPrimitive(str));
                String serialName = this.f38285f;
                if (serialName == null) {
                    serialName = f0fVar.getSerialName();
                }
                vm8Var.putElement("value", uk8.JsonPrimitive(serialName));
            } else {
                String serialName2 = this.f38285f;
                if (serialName2 == null) {
                    serialName2 = f0fVar.getSerialName();
                }
                tm8Var.putElement(str, uk8.JsonPrimitive(serialName2));
            }
            this.f38284e = null;
            this.f38285f = null;
        }
        return tm8Var;
    }

    @Override // p000.xlg, p000.m15
    @yfb
    public m15 encodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        if (m25288d() == null) {
            return new hm8(this.f38281b, this.f38282c).encodeInline(f0fVar);
        }
        if (this.f38284e != null) {
            this.f38285f = f0fVar.getSerialName();
        }
        return super.encodeInline(f0fVar);
    }

    @Override // p000.el8
    public void encodeJsonElement(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        if (this.f38284e == null || (sk8Var instanceof am8)) {
            encodeSerializableValue(cl8.f16886a, sk8Var);
        } else {
            x3d.throwJsonElementPolymorphicException(this.f38285f, sk8Var);
            throw new us8();
        }
    }

    @Override // p000.xlg, p000.m15
    public void encodeNotNullMark() {
    }

    @Override // p000.xlg, p000.m15
    public void encodeNull() {
        String strM25288d = m25288d();
        if (strM25288d == null) {
            this.f38282c.invoke(xl8.INSTANCE);
        } else {
            encodeTaggedNull(strM25288d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    @Override // p000.xlg, p000.m15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> void encodeSerializableValue(@p000.yfb p000.e1f<? super T> r4, T r5) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6092g2.encodeSerializableValue(e1f, java.lang.Object):void");
    }

    @Override // p000.h9b
    @yfb
    /* JADX INFO: renamed from: g */
    public String mo11320g(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "parentName");
        md8.checkNotNullParameter(str2, "childName");
        return str2;
    }

    @yfb
    public abstract sk8 getCurrent();

    @Override // p000.el8
    @yfb
    public final bk8 getJson() {
        return this.f38281b;
    }

    @Override // p000.xlg, p000.m15, p000.om2
    @yfb
    public final n2f getSerializersModule() {
        return this.f38281b.getSerializersModule();
    }

    @Override // p000.h9b
    @yfb
    /* JADX INFO: renamed from: h */
    public String mo11321h(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return vl8.getJsonElementName(f0fVar, this.f38281b, i);
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedBoolean(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(Boolean.valueOf(z)));
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedByte(@yfb String str, byte b2) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(Byte.valueOf(b2)));
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedChar(@yfb String str, char c) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(String.valueOf(c)));
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedDouble(@yfb String str, double d) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(Double.valueOf(d)));
        if (this.f38283d.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw il8.InvalidFloatingPointEncoded(Double.valueOf(d), str, getCurrent().toString());
        }
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedEnum(@yfb String str, @yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        putElement(str, uk8.JsonPrimitive(f0fVar.getElementName(i)));
    }

    public abstract void putElement(@yfb String str, @yfb sk8 sk8Var);

    @Override // p000.xlg
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedFloat(@yfb String str, float f) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(Float.valueOf(f)));
        if (this.f38283d.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw il8.InvalidFloatingPointEncoded(Float.valueOf(f), str, getCurrent().toString());
        }
    }

    @Override // p000.xlg
    @yfb
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public m15 encodeTaggedInline(@yfb String str, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(f0fVar, "inlineDescriptor");
        return b7g.isUnsignedNumber(f0fVar) ? inlineUnsignedNumberEncoder(str) : b7g.isUnquotedLiteral(f0fVar) ? inlineUnquotedLiteralEncoder(str, f0fVar) : super.encodeTaggedInline(str, f0fVar);
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedInt(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(Integer.valueOf(i)));
    }

    @Override // p000.xlg, p000.om2
    public boolean shouldEncodeElementDefault(@yfb f0f f0fVar, int i) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return this.f38283d.getEncodeDefaults();
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedLong(@yfb String str, long j) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(Long.valueOf(j)));
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedNull(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, xl8.INSTANCE);
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedShort(@yfb String str, short s) {
        md8.checkNotNullParameter(str, "tag");
        putElement(str, uk8.JsonPrimitive(Short.valueOf(s)));
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedString(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(str2, "value");
        putElement(str, uk8.JsonPrimitive(str2));
    }

    @Override // p000.xlg
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void encodeTaggedValue(@yfb String str, @yfb Object obj) {
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(obj, "value");
        putElement(str, uk8.JsonPrimitive(obj.toString()));
    }

    @yfb
    /* JADX INFO: renamed from: y */
    public final qy6<sk8, bth> m11335y() {
        return this.f38282c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC6092g2(bk8 bk8Var, qy6<? super sk8, bth> qy6Var) {
        this.f38281b = bk8Var;
        this.f38282c = qy6Var;
        this.f38283d = bk8Var.getConfiguration();
    }
}
