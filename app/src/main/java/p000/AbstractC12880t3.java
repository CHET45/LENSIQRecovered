package p000;

import p000.jvd;
import p000.lm2;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: loaded from: classes7.dex */
@nb8
@dwf({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n475#2,2:116\n477#2,2:119\n82#3:118\n570#4,2:121\n572#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
public abstract class AbstractC12880t3<T> implements lp8<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T decodeSequentially(lm2 lm2Var) {
        return (T) lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), 1, e4d.findPolymorphicSerializer(this, lm2Var, lm2Var.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.t74
    @yfb
    public final T deserialize(@yfb jl3 jl3Var) {
        T t;
        md8.checkNotNullParameter(jl3Var, "decoder");
        f0f descriptor = getDescriptor();
        lm2 lm2VarBeginStructure = jl3Var.beginStructure(descriptor);
        jvd.C8121h c8121h = new jvd.C8121h();
        if (lm2VarBeginStructure.decodeSequentially()) {
            t = (T) decodeSequentially(lm2VarBeginStructure);
        } else {
            t = null;
            while (true) {
                int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        c8121h.f52110a = (T) lm2VarBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) c8121h.f52110a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iDecodeElementIndex);
                            throw new d1f(sb.toString());
                        }
                        T t2 = c8121h.f52110a;
                        if (t2 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        c8121h.f52110a = t2;
                        t = (T) lm2.C8896b.decodeSerializableElement$default(lm2VarBeginStructure, getDescriptor(), iDecodeElementIndex, e4d.findPolymorphicSerializer(this, lm2VarBeginStructure, (String) t2), null, 8, null);
                    }
                } else {
                    if (t == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) c8121h.f52110a)).toString());
                    }
                    md8.checkNotNull(t, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                }
            }
        }
        lm2VarBeginStructure.endStructure(descriptor);
        return t;
    }

    @gib
    @nb8
    public t74<T> findPolymorphicSerializerOrNull(@yfb lm2 lm2Var, @gib String str) {
        md8.checkNotNullParameter(lm2Var, "decoder");
        return lm2Var.getSerializersModule().getPolymorphic((oo8) getBaseClass(), str);
    }

    @yfb
    public abstract oo8<T> getBaseClass();

    @Override // p000.e1f
    public final void serialize(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        e1f<? super T> e1fVarFindPolymorphicSerializer = e4d.findPolymorphicSerializer(this, m15Var, t);
        f0f descriptor = getDescriptor();
        om2 om2VarBeginStructure = m15Var.beginStructure(descriptor);
        om2VarBeginStructure.encodeStringElement(getDescriptor(), 0, e1fVarFindPolymorphicSerializer.getDescriptor().getSerialName());
        f0f descriptor2 = getDescriptor();
        md8.checkNotNull(e1fVarFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        om2VarBeginStructure.encodeSerializableElement(descriptor2, 1, e1fVarFindPolymorphicSerializer, t);
        om2VarBeginStructure.endStructure(descriptor);
    }

    @gib
    @nb8
    public e1f<T> findPolymorphicSerializerOrNull(@yfb m15 m15Var, @yfb T t) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(t, "value");
        return m15Var.getSerializersModule().getPolymorphic(getBaseClass(), t);
    }
}
