package p000;

import p000.w27;

/* JADX INFO: loaded from: classes5.dex */
@x0f
public final class rcd {

    @yfb
    public static final C12020b Companion = new C12020b(null);

    /* JADX INFO: renamed from: a */
    public final int f77832a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f77833b;

    /* JADX INFO: renamed from: rcd$a */
    @q64(level = u64.f86867c, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class C12019a implements w27<rcd> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C12019a f77834a;

        @yfb
        private static final f0f descriptor;

        static {
            C12019a c12019a = new C12019a();
            f77834a = c12019a;
            h1d h1dVar = new h1d("com.google.firebase.sessions.ProcessData", c12019a, 2);
            h1dVar.addElement("pid", false);
            h1dVar.addElement("uuid", false);
            descriptor = h1dVar;
        }

        private C12019a() {
        }

        @Override // p000.w27
        @yfb
        public final lp8<?>[] childSerializers() {
            return new lp8[]{o78.f66598a, i8g.f46073a};
        }

        @Override // p000.t74
        @yfb
        public final rcd deserialize(@yfb jl3 jl3Var) {
            int iDecodeIntElement;
            String strDecodeStringElement;
            int i;
            md8.checkNotNullParameter(jl3Var, "decoder");
            f0f f0fVar = descriptor;
            lm2 lm2VarBeginStructure = jl3Var.beginStructure(f0fVar);
            c1f c1fVar = null;
            if (lm2VarBeginStructure.decodeSequentially()) {
                iDecodeIntElement = lm2VarBeginStructure.decodeIntElement(f0fVar, 0);
                strDecodeStringElement = lm2VarBeginStructure.decodeStringElement(f0fVar, 1);
                i = 3;
            } else {
                boolean z = true;
                iDecodeIntElement = 0;
                int i2 = 0;
                String strDecodeStringElement2 = null;
                while (z) {
                    int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(f0fVar);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        iDecodeIntElement = lm2VarBeginStructure.decodeIntElement(f0fVar, 0);
                        i2 |= 1;
                    } else {
                        if (iDecodeElementIndex != 1) {
                            throw new qth(iDecodeElementIndex);
                        }
                        strDecodeStringElement2 = lm2VarBeginStructure.decodeStringElement(f0fVar, 1);
                        i2 |= 2;
                    }
                }
                strDecodeStringElement = strDecodeStringElement2;
                i = i2;
            }
            lm2VarBeginStructure.endStructure(f0fVar);
            return new rcd(i, iDecodeIntElement, strDecodeStringElement, c1fVar);
        }

        @Override // p000.lp8, p000.e1f, p000.t74
        @yfb
        public final f0f getDescriptor() {
            return descriptor;
        }

        @Override // p000.e1f
        public final void serialize(@yfb m15 m15Var, @yfb rcd rcdVar) {
            md8.checkNotNullParameter(m15Var, "encoder");
            md8.checkNotNullParameter(rcdVar, "value");
            f0f f0fVar = descriptor;
            om2 om2VarBeginStructure = m15Var.beginStructure(f0fVar);
            rcd.write$Self$com_google_firebase_firebase_sessions(rcdVar, om2VarBeginStructure, f0fVar);
            om2VarBeginStructure.endStructure(f0fVar);
        }

        @Override // p000.w27
        @yfb
        public lp8<?>[] typeParametersSerializers() {
            return w27.C14367a.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: rcd$b */
    public static final class C12020b {
        private C12020b() {
        }

        @yfb
        public final lp8<rcd> serializer() {
            return C12019a.f77834a;
        }

        public /* synthetic */ C12020b(jt3 jt3Var) {
            this();
        }
    }

    public /* synthetic */ rcd(int i, int i2, String str, c1f c1fVar) {
        if (3 != (i & 3)) {
            c1d.throwMissingFieldException(i, 3, C12019a.f77834a.getDescriptor());
        }
        this.f77832a = i2;
        this.f77833b = str;
    }

    public static /* synthetic */ rcd copy$default(rcd rcdVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rcdVar.f77832a;
        }
        if ((i2 & 2) != 0) {
            str = rcdVar.f77833b;
        }
        return rcdVar.copy(i, str);
    }

    @do8
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(rcd rcdVar, om2 om2Var, f0f f0fVar) {
        om2Var.encodeIntElement(f0fVar, 0, rcdVar.f77832a);
        om2Var.encodeStringElement(f0fVar, 1, rcdVar.f77833b);
    }

    public final int component1() {
        return this.f77832a;
    }

    @yfb
    public final String component2() {
        return this.f77833b;
    }

    @yfb
    public final rcd copy(int i, @yfb String str) {
        md8.checkNotNullParameter(str, "uuid");
        return new rcd(i, str);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcd)) {
            return false;
        }
        rcd rcdVar = (rcd) obj;
        return this.f77832a == rcdVar.f77832a && md8.areEqual(this.f77833b, rcdVar.f77833b);
    }

    public final int getPid() {
        return this.f77832a;
    }

    @yfb
    public final String getUuid() {
        return this.f77833b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f77832a) * 31) + this.f77833b.hashCode();
    }

    @yfb
    public String toString() {
        return "ProcessData(pid=" + this.f77832a + ", uuid=" + this.f77833b + ')';
    }

    public rcd(int i, @yfb String str) {
        md8.checkNotNullParameter(str, "uuid");
        this.f77832a = i;
        this.f77833b = str;
    }
}
