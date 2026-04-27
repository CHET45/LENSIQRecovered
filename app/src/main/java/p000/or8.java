package p000;

import p000.lm2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n570#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
@yjd
public abstract class or8<K, V, R> implements lp8<R> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final lp8<K> f68371a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final lp8<V> f68372b;

    public /* synthetic */ or8(lp8 lp8Var, lp8 lp8Var2, jt3 jt3Var) {
        this(lp8Var, lp8Var2);
    }

    @yfb
    /* JADX INFO: renamed from: a */
    public final lp8<K> m18817a() {
        return this.f68371a;
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final lp8<V> m18818b() {
        return this.f68372b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.t74
    public R deserialize(@yfb jl3 jl3Var) {
        R r;
        md8.checkNotNullParameter(jl3Var, "decoder");
        f0f descriptor = getDescriptor();
        lm2 lm2VarBeginStructure = jl3Var.beginStructure(descriptor);
        if (lm2VarBeginStructure.decodeSequentially()) {
            r = (R) toResult(lm2.C8896b.decodeSerializableElement$default(lm2VarBeginStructure, getDescriptor(), 0, m18817a(), null, 8, null), lm2.C8896b.decodeSerializableElement$default(lm2VarBeginStructure, getDescriptor(), 1, m18818b(), null, 8, null));
        } else {
            Object objDecodeSerializableElement$default = ukh.f88244a;
            Object objDecodeSerializableElement$default2 = ukh.f88244a;
            while (true) {
                int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex != -1) {
                    if (iDecodeElementIndex == 0) {
                        objDecodeSerializableElement$default = lm2.C8896b.decodeSerializableElement$default(lm2VarBeginStructure, getDescriptor(), 0, m18817a(), null, 8, null);
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new d1f("Invalid index: " + iDecodeElementIndex);
                        }
                        objDecodeSerializableElement$default2 = lm2.C8896b.decodeSerializableElement$default(lm2VarBeginStructure, getDescriptor(), 1, m18818b(), null, 8, null);
                    }
                } else {
                    if (objDecodeSerializableElement$default == ukh.f88244a) {
                        throw new d1f("Element 'key' is missing");
                    }
                    if (objDecodeSerializableElement$default2 == ukh.f88244a) {
                        throw new d1f("Element 'value' is missing");
                    }
                    r = (R) toResult(objDecodeSerializableElement$default, objDecodeSerializableElement$default2);
                }
            }
        }
        lm2VarBeginStructure.endStructure(descriptor);
        return r;
    }

    public abstract K getKey(R r);

    public abstract V getValue(R r);

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, R r) {
        md8.checkNotNullParameter(m15Var, "encoder");
        om2 om2VarBeginStructure = m15Var.beginStructure(getDescriptor());
        om2VarBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f68371a, getKey(r));
        om2VarBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f68372b, getValue(r));
        om2VarBeginStructure.endStructure(getDescriptor());
    }

    public abstract R toResult(K k, V v);

    private or8(lp8<K> lp8Var, lp8<V> lp8Var2) {
        this.f68371a = lp8Var;
        this.f68372b = lp8Var2;
    }
}
