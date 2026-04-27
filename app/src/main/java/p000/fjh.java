package p000;

import p000.lm2;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class fjh<A, B, C> implements lp8<djh<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final lp8<A> f36877a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final lp8<B> f36878b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final lp8<C> f36879c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final f0f f36880d;

    public fjh(@yfb lp8<A> lp8Var, @yfb lp8<B> lp8Var2, @yfb lp8<C> lp8Var3) {
        md8.checkNotNullParameter(lp8Var, "aSerializer");
        md8.checkNotNullParameter(lp8Var2, "bSerializer");
        md8.checkNotNullParameter(lp8Var3, "cSerializer");
        this.f36877a = lp8Var;
        this.f36878b = lp8Var2;
        this.f36879c = lp8Var3;
        this.f36880d = n0f.buildClassSerialDescriptor("kotlin.Triple", new f0f[0], new qy6() { // from class: ejh
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return fjh.descriptor$lambda$0(this.f33232a, (l12) obj);
            }
        });
    }

    private final djh<A, B, C> decodeSequentially(lm2 lm2Var) {
        Object objDecodeSerializableElement$default = lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), 0, this.f36877a, null, 8, null);
        Object objDecodeSerializableElement$default2 = lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), 1, this.f36878b, null, 8, null);
        Object objDecodeSerializableElement$default3 = lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), 2, this.f36879c, null, 8, null);
        lm2Var.endStructure(getDescriptor());
        return new djh<>(objDecodeSerializableElement$default, objDecodeSerializableElement$default2, objDecodeSerializableElement$default3);
    }

    private final djh<A, B, C> decodeStructure(lm2 lm2Var) {
        Object objDecodeSerializableElement$default = ukh.f88244a;
        Object objDecodeSerializableElement$default2 = ukh.f88244a;
        Object objDecodeSerializableElement$default3 = ukh.f88244a;
        while (true) {
            int iDecodeElementIndex = lm2Var.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex == -1) {
                lm2Var.endStructure(getDescriptor());
                if (objDecodeSerializableElement$default == ukh.f88244a) {
                    throw new d1f("Element 'first' is missing");
                }
                if (objDecodeSerializableElement$default2 == ukh.f88244a) {
                    throw new d1f("Element 'second' is missing");
                }
                if (objDecodeSerializableElement$default3 != ukh.f88244a) {
                    return new djh<>(objDecodeSerializableElement$default, objDecodeSerializableElement$default2, objDecodeSerializableElement$default3);
                }
                throw new d1f("Element 'third' is missing");
            }
            if (iDecodeElementIndex == 0) {
                objDecodeSerializableElement$default = lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), 0, this.f36877a, null, 8, null);
            } else if (iDecodeElementIndex == 1) {
                objDecodeSerializableElement$default2 = lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), 1, this.f36878b, null, 8, null);
            } else {
                if (iDecodeElementIndex != 2) {
                    throw new d1f("Unexpected index " + iDecodeElementIndex);
                }
                objDecodeSerializableElement$default3 = lm2.C8896b.decodeSerializableElement$default(lm2Var, getDescriptor(), 2, this.f36879c, null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor$lambda$0(fjh fjhVar, l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildClassSerialDescriptor");
        l12.element$default(l12Var, "first", fjhVar.f36877a.getDescriptor(), null, false, 12, null);
        l12.element$default(l12Var, "second", fjhVar.f36878b.getDescriptor(), null, false, 12, null);
        l12.element$default(l12Var, "third", fjhVar.f36879c.getDescriptor(), null, false, 12, null);
        return bth.f14751a;
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return this.f36880d;
    }

    @Override // p000.t74
    @yfb
    public djh<A, B, C> deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        lm2 lm2VarBeginStructure = jl3Var.beginStructure(getDescriptor());
        return lm2VarBeginStructure.decodeSequentially() ? decodeSequentially(lm2VarBeginStructure) : decodeStructure(lm2VarBeginStructure);
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb djh<? extends A, ? extends B, ? extends C> djhVar) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(djhVar, "value");
        om2 om2VarBeginStructure = m15Var.beginStructure(getDescriptor());
        om2VarBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.f36877a, djhVar.getFirst());
        om2VarBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.f36878b, djhVar.getSecond());
        om2VarBeginStructure.encodeSerializableElement(getDescriptor(), 2, this.f36879c, djhVar.getThird());
        om2VarBeginStructure.endStructure(getDescriptor());
    }
}
