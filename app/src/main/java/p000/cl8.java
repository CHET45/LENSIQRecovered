package p000;

import p000.w3d;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class cl8 implements lp8<sk8> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cl8 f16886a = new cl8();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final f0f f16887b = n0f.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", w3d.C14372b.f93180a, new f0f[0], new qy6() { // from class: wk8
        @Override // p000.qy6
        public final Object invoke(Object obj) {
            return cl8.descriptor$lambda$5((l12) obj);
        }
    });

    private cl8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth descriptor$lambda$5(l12 l12Var) {
        md8.checkNotNullParameter(l12Var, "$this$buildSerialDescriptor");
        l12.element$default(l12Var, "JsonPrimitive", dl8.defer(new ny6() { // from class: xk8
            @Override // p000.ny6
            public final Object invoke() {
                return cl8.descriptor$lambda$5$lambda$0();
            }
        }), null, false, 12, null);
        l12.element$default(l12Var, "JsonNull", dl8.defer(new ny6() { // from class: yk8
            @Override // p000.ny6
            public final Object invoke() {
                return cl8.descriptor$lambda$5$lambda$1();
            }
        }), null, false, 12, null);
        l12.element$default(l12Var, "JsonLiteral", dl8.defer(new ny6() { // from class: zk8
            @Override // p000.ny6
            public final Object invoke() {
                return cl8.descriptor$lambda$5$lambda$2();
            }
        }), null, false, 12, null);
        l12.element$default(l12Var, "JsonObject", dl8.defer(new ny6() { // from class: al8
            @Override // p000.ny6
            public final Object invoke() {
                return cl8.descriptor$lambda$5$lambda$3();
            }
        }), null, false, 12, null);
        l12.element$default(l12Var, "JsonArray", dl8.defer(new ny6() { // from class: bl8
            @Override // p000.ny6
            public final Object invoke() {
                return cl8.descriptor$lambda$5$lambda$4();
            }
        }), null, false, 12, null);
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor$lambda$5$lambda$0() {
        return im8.f47436a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor$lambda$5$lambda$1() {
        return yl8.f102014a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor$lambda$5$lambda$2() {
        return rl8.f78636a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor$lambda$5$lambda$3() {
        return cm8.f16946a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0f descriptor$lambda$5$lambda$4() {
        return ek8.f33245a.getDescriptor();
    }

    @Override // p000.lp8, p000.e1f, p000.t74
    @yfb
    public f0f getDescriptor() {
        return f16887b;
    }

    @Override // p000.t74
    @yfb
    public sk8 deserialize(@yfb jl3 jl3Var) {
        md8.checkNotNullParameter(jl3Var, "decoder");
        return dl8.asJsonDecoder(jl3Var).decodeJsonElement();
    }

    @Override // p000.e1f
    public void serialize(@yfb m15 m15Var, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(m15Var, "encoder");
        md8.checkNotNullParameter(sk8Var, "value");
        dl8.verify(m15Var);
        if (sk8Var instanceof fm8) {
            m15Var.encodeSerializableValue(im8.f47436a, sk8Var);
        } else if (sk8Var instanceof am8) {
            m15Var.encodeSerializableValue(cm8.f16946a, sk8Var);
        } else {
            if (!(sk8Var instanceof ck8)) {
                throw new ceb();
            }
            m15Var.encodeSerializableValue(ek8.f33245a, sk8Var);
        }
    }
}
