package p000;

import p000.u0f;
import p000.xag;
import p000.ymh;

/* JADX INFO: renamed from: e2 */
/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 4 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 5 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,334:1\n74#1:359\n74#1:373\n74#1:384\n74#1:394\n75#1:419\n75#1:428\n85#1:437\n75#1:438\n88#1:447\n75#1:448\n89#1,5:457\n88#1:462\n75#1:463\n89#1,5:472\n88#1:477\n75#1:478\n89#1,5:487\n88#1:492\n75#1:493\n89#1,5:502\n88#1:507\n75#1:508\n89#1,5:517\n88#1:522\n75#1:523\n89#1,5:532\n88#1:537\n75#1:538\n89#1,5:547\n88#1:552\n75#1:553\n89#1,5:562\n75#1:567\n85#1:576\n75#1:577\n1#2:335\n76#3,6:336\n82#3,9:350\n271#4,8:342\n271#4,8:360\n271#4,8:374\n271#4,8:385\n271#4,8:395\n271#4,8:403\n271#4,8:411\n271#4,8:420\n271#4,8:429\n271#4,8:439\n271#4,8:449\n271#4,8:464\n271#4,8:479\n271#4,8:494\n271#4,8:509\n271#4,8:524\n271#4,8:539\n271#4,8:554\n271#4,8:568\n271#4,8:578\n36#5,5:368\n41#5,2:382\n44#5:393\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n64#1:359\n67#1:373\n68#1:384\n70#1:394\n85#1:419\n88#1:428\n105#1:437\n105#1:438\n112#1:447\n112#1:448\n112#1:457,5\n114#1:462\n114#1:463\n114#1:472,5\n120#1:477\n120#1:478\n120#1:487,5\n126#1:492\n126#1:493\n126#1:502,5\n127#1:507\n127#1:508\n127#1:517,5\n130#1:522\n130#1:523\n130#1:532,5\n137#1:537\n137#1:538\n137#1:547,5\n143#1:552\n143#1:553\n143#1:562,5\n146#1:567\n159#1:576\n159#1:577\n56#1:336,6\n56#1:350,9\n56#1:342,8\n64#1:360,8\n67#1:374,8\n68#1:385,8\n70#1:395,8\n74#1:403,8\n75#1:411,8\n85#1:420,8\n88#1:429,8\n105#1:439,8\n112#1:449,8\n114#1:464,8\n120#1:479,8\n126#1:494,8\n127#1:509,8\n130#1:524,8\n137#1:539,8\n143#1:554,8\n146#1:568,8\n159#1:578,8\n65#1:368,5\n65#1:382,2\n65#1:393\n*E\n"})
public abstract class AbstractC5049e2 extends g9b implements ok8 {

    /* JADX INFO: renamed from: f */
    @yfb
    public final bk8 f31576f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final sk8 f31577g;

    /* JADX INFO: renamed from: h */
    @gib
    public final String f31578h;

    /* JADX INFO: renamed from: i */
    @un8
    @yfb
    public final hk8 f31579i;

    public /* synthetic */ AbstractC5049e2(bk8 bk8Var, sk8 sk8Var, String str, jt3 jt3Var) {
        this(bk8Var, sk8Var, str);
    }

    private final <T> T getPrimitiveValue(String str, String str2, qy6<? super fm8, ? extends T> qy6Var) {
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                T tInvoke = qy6Var.invoke(fm8Var);
                if (tInvoke != null) {
                    return tInvoke;
                }
                unparsedPrimitive(fm8Var, str2, str);
                throw new us8();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, str2, str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of " + str2 + " at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    private final Void unparsedPrimitive(fm8 fm8Var, String str, String str2) {
        StringBuilder sb;
        String str3;
        if (h9g.startsWith$default(str, "i", false, 2, null)) {
            sb = new StringBuilder();
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        sb.append(str3);
        sb.append(str);
        throw il8.JsonDecodingException(-1, "Failed to parse literal '" + fm8Var + "' as " + sb.toString() + " value at element: " + renderTagStack(str2), m9629p().toString());
    }

    @Override // p000.wlg
    @gib
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Void decodeTaggedNull(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        return null;
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public short decodeTaggedShort(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                int i = uk8.getInt(fm8Var);
                Short shValueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                unparsedPrimitive(fm8Var, "short", str);
                throw new us8();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, "short", str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of short at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    @yfb
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public String decodeTaggedString(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (!(sk8VarMo9628o instanceof fm8)) {
            throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of " + ymh.InterfaceC15723b.f102127e + " at element: " + renderTagStack(str), sk8VarMo9628o.toString());
        }
        fm8 fm8Var = (fm8) sk8VarMo9628o;
        if (!(fm8Var instanceof ql8)) {
            throw il8.JsonDecodingException(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + renderTagStack(str), m9629p().toString());
        }
        ql8 ql8Var = (ql8) fm8Var;
        if (ql8Var.isString() || getJson().getConfiguration().isLenient()) {
            return ql8Var.getContent();
        }
        throw il8.JsonDecodingException(-1, "String literal for key '" + str + "' should be quoted at element: " + renderTagStack(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m9629p().toString());
    }

    @gib
    /* JADX INFO: renamed from: D */
    public final String m9625D() {
        return this.f31578h;
    }

    @yfb
    /* JADX INFO: renamed from: E */
    public final fm8 m9626E(@yfb String str, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        sk8 sk8VarMo9628o = mo9628o(str);
        String serialName = f0fVar.getSerialName();
        if (sk8VarMo9628o instanceof fm8) {
            return (fm8) sk8VarMo9628o;
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg, p000.jl3
    @yfb
    public lm2 beginStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        sk8 sk8VarM9629p = m9629p();
        u0f kind = f0fVar.getKind();
        if (md8.areEqual(kind, xag.C15018b.f97388a) || (kind instanceof w3d)) {
            bk8 json = getJson();
            String serialName = f0fVar.getSerialName();
            if (sk8VarM9629p instanceof ck8) {
                return new sm8(json, (ck8) sk8VarM9629p);
            }
            throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(ck8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarM9629p.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m11447n(), sk8VarM9629p.toString());
        }
        if (!md8.areEqual(kind, xag.C15019c.f97389a)) {
            bk8 json2 = getJson();
            String serialName2 = f0fVar.getSerialName();
            if (sk8VarM9629p instanceof am8) {
                return new qm8(json2, (am8) sk8VarM9629p, this.f31578h, null, 8, null);
            }
            throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(am8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarM9629p.getClass()).getSimpleName() + " as the serialized body of " + serialName2 + " at element: " + m11447n(), sk8VarM9629p.toString());
        }
        bk8 json3 = getJson();
        f0f f0fVarCarrierDescriptor = dsi.carrierDescriptor(f0fVar.getElementDescriptor(0), json3.getSerializersModule());
        u0f kind2 = f0fVarCarrierDescriptor.getKind();
        if ((kind2 instanceof jbd) || md8.areEqual(kind2, u0f.C13312b.f86523a)) {
            bk8 json4 = getJson();
            String serialName3 = f0fVar.getSerialName();
            if (sk8VarM9629p instanceof am8) {
                return new um8(json4, (am8) sk8VarM9629p);
            }
            throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(am8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarM9629p.getClass()).getSimpleName() + " as the serialized body of " + serialName3 + " at element: " + m11447n(), sk8VarM9629p.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw il8.InvalidKeyKindException(f0fVarCarrierDescriptor);
        }
        bk8 json5 = getJson();
        String serialName4 = f0fVar.getSerialName();
        if (sk8VarM9629p instanceof ck8) {
            return new sm8(json5, (ck8) sk8VarM9629p);
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(ck8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarM9629p.getClass()).getSimpleName() + " as the serialized body of " + serialName4 + " at element: " + m11447n(), sk8VarM9629p.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends sk8> T cast(sk8 sk8Var, f0f f0fVar) {
        md8.checkNotNullParameter(sk8Var, "value");
        md8.checkNotNullParameter(f0fVar, "descriptor");
        String serialName = f0fVar.getSerialName();
        md8.reifiedOperationMarker(3, "T");
        if (sk8Var != 0) {
            return sk8Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        md8.reifiedOperationMarker(4, "T");
        sb.append(vvd.getOrCreateKotlinClass(sk8.class).getSimpleName());
        sb.append(", but had ");
        sb.append(vvd.getOrCreateKotlinClass(sk8Var.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(serialName);
        sb.append(" at element: ");
        sb.append(m11447n());
        throw il8.JsonDecodingException(-1, sb.toString(), sk8Var.toString());
    }

    @Override // p000.wlg, p000.jl3
    @yfb
    public jl3 decodeInline(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        return m24660g() != null ? super.decodeInline(f0fVar) : new gm8(getJson(), getValue(), this.f31578h).decodeInline(f0fVar);
    }

    @Override // p000.ok8
    @yfb
    public sk8 decodeJsonElement() {
        return m9629p();
    }

    @Override // p000.wlg, p000.jl3
    public boolean decodeNotNullMark() {
        return !(m9629p() instanceof xl8);
    }

    @Override // p000.wlg, p000.jl3
    public <T> T decodeSerializableValue(@yfb t74<? extends T> t74Var) {
        fm8 jsonPrimitive;
        md8.checkNotNullParameter(t74Var, "deserializer");
        if (!(t74Var instanceof AbstractC12880t3) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return t74Var.deserialize(this);
        }
        AbstractC12880t3 abstractC12880t3 = (AbstractC12880t3) t74Var;
        String strClassDiscriminator = x3d.classDiscriminator(abstractC12880t3.getDescriptor(), getJson());
        sk8 sk8VarDecodeJsonElement = decodeJsonElement();
        String serialName = abstractC12880t3.getDescriptor().getSerialName();
        if (sk8VarDecodeJsonElement instanceof am8) {
            am8 am8Var = (am8) sk8VarDecodeJsonElement;
            sk8 sk8Var = (sk8) am8Var.get((Object) strClassDiscriminator);
            try {
                t74 t74VarFindPolymorphicSerializer = e4d.findPolymorphicSerializer((AbstractC12880t3) t74Var, this, (sk8Var == null || (jsonPrimitive = uk8.getJsonPrimitive(sk8Var)) == null) ? null : uk8.getContentOrNull(jsonPrimitive));
                md8.checkNotNull(t74VarFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) aih.readPolymorphicJson(getJson(), strClassDiscriminator, am8Var, t74VarFindPolymorphicSerializer);
            } catch (d1f e) {
                String message = e.getMessage();
                md8.checkNotNull(message);
                throw il8.JsonDecodingException(-1, message, am8Var.toString());
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(am8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarDecodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + m11447n(), sk8VarDecodeJsonElement.toString());
    }

    @Override // p000.wlg, p000.lm2
    public void endStructure(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
    }

    @Override // p000.ok8
    @yfb
    public bk8 getJson() {
        return this.f31576f;
    }

    @Override // p000.wlg, p000.jl3, p000.lm2
    @yfb
    public n2f getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @yfb
    public sk8 getValue() {
        return this.f31577g;
    }

    @Override // p000.g9b
    @yfb
    /* JADX INFO: renamed from: j */
    public String mo9627j(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "parentName");
        md8.checkNotNullParameter(str2, "childName");
        return str2;
    }

    @yfb
    /* JADX INFO: renamed from: o */
    public abstract sk8 mo9628o(@yfb String str);

    @yfb
    /* JADX INFO: renamed from: p */
    public final sk8 m9629p() {
        sk8 sk8VarMo9628o;
        String strM24660g = m24660g();
        return (strM24660g == null || (sk8VarMo9628o = mo9628o(strM24660g)) == null) ? getValue() : sk8VarMo9628o;
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean decodeTaggedBoolean(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                Boolean booleanOrNull = uk8.getBooleanOrNull(fm8Var);
                if (booleanOrNull != null) {
                    return booleanOrNull.booleanValue();
                }
                unparsedPrimitive(fm8Var, ymh.InterfaceC15723b.f102128f, str);
                throw new us8();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, ymh.InterfaceC15723b.f102128f, str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of " + ymh.InterfaceC15723b.f102128f + " at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public byte decodeTaggedByte(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                int i = uk8.getInt(fm8Var);
                Byte bValueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                unparsedPrimitive(fm8Var, "byte", str);
                throw new us8();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, "byte", str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of byte at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @yfb
    public final String renderTagStack(@yfb String str) {
        md8.checkNotNullParameter(str, "currentTag");
        return m11447n() + a18.f100c + str;
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public char decodeTaggedChar(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                return t9g.single(fm8Var.getContent());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, "char", str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of char at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public double decodeTaggedDouble(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                double d = uk8.getDouble(fm8Var);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || !(Double.isInfinite(d) || Double.isNaN(d))) {
                    return d;
                }
                throw il8.InvalidFloatingPointDecoded(Double.valueOf(d), str, m9629p().toString());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, "double", str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of double at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int decodeTaggedEnum(@yfb String str, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(f0fVar, "enumDescriptor");
        bk8 json = getJson();
        sk8 sk8VarMo9628o = mo9628o(str);
        String serialName = f0fVar.getSerialName();
        if (sk8VarMo9628o instanceof fm8) {
            return vl8.getJsonNameIndexOrThrow$default(f0fVar, json, ((fm8) sk8VarMo9628o).getContent(), null, 4, null);
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public float decodeTaggedFloat(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                float f = uk8.getFloat(fm8Var);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || !(Float.isInfinite(f) || Float.isNaN(f))) {
                    return f;
                }
                throw il8.InvalidFloatingPointDecoded(Float.valueOf(f), str, m9629p().toString());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, ymh.InterfaceC15723b.f102125c, str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of " + ymh.InterfaceC15723b.f102125c + " at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    @yfb
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public jl3 decodeTaggedInline(@yfb String str, @yfb f0f f0fVar) {
        md8.checkNotNullParameter(str, "tag");
        md8.checkNotNullParameter(f0fVar, "inlineDescriptor");
        if (!b7g.isUnsignedNumber(f0fVar)) {
            return super.decodeTaggedInline(str, f0fVar);
        }
        bk8 json = getJson();
        sk8 sk8VarMo9628o = mo9628o(str);
        String serialName = f0fVar.getSerialName();
        if (sk8VarMo9628o instanceof fm8) {
            return new pk8(x7g.StringJsonLexer(json, ((fm8) sk8VarMo9628o).getContent()), getJson());
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int decodeTaggedInt(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                return uk8.getInt(fm8Var);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, "int", str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of int at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public long decodeTaggedLong(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        sk8 sk8VarMo9628o = mo9628o(str);
        if (sk8VarMo9628o instanceof fm8) {
            fm8 fm8Var = (fm8) sk8VarMo9628o;
            try {
                return uk8.getLong(fm8Var);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(fm8Var, "long", str);
                throw new us8();
            }
        }
        throw il8.JsonDecodingException(-1, "Expected " + vvd.getOrCreateKotlinClass(fm8.class).getSimpleName() + ", but had " + vvd.getOrCreateKotlinClass(sk8VarMo9628o.getClass()).getSimpleName() + " as the serialized body of long at element: " + renderTagStack(str), sk8VarMo9628o.toString());
    }

    @Override // p000.wlg
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean decodeTaggedNotNullMark(@yfb String str) {
        md8.checkNotNullParameter(str, "tag");
        return mo9628o(str) != xl8.INSTANCE;
    }

    public /* synthetic */ AbstractC5049e2(bk8 bk8Var, sk8 sk8Var, String str, int i, jt3 jt3Var) {
        this(bk8Var, sk8Var, (i & 4) != 0 ? null : str, null);
    }

    private AbstractC5049e2(bk8 bk8Var, sk8 sk8Var, String str) {
        this.f31576f = bk8Var;
        this.f31577g = sk8Var;
        this.f31578h = str;
        this.f31579i = getJson().getConfiguration();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends sk8> T cast(sk8 sk8Var, String str, String str2) {
        md8.checkNotNullParameter(sk8Var, "value");
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(str2, "tag");
        md8.reifiedOperationMarker(3, "T");
        if (sk8Var != 0) {
            return sk8Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        md8.reifiedOperationMarker(4, "T");
        sb.append(vvd.getOrCreateKotlinClass(sk8.class).getSimpleName());
        sb.append(", but had ");
        sb.append(vvd.getOrCreateKotlinClass(sk8Var.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(str);
        sb.append(" at element: ");
        sb.append(renderTagStack(str2));
        throw il8.JsonDecodingException(-1, sb.toString(), sk8Var.toString());
    }
}
