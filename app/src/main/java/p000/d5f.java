package p000;

import p000.w27;

/* JADX INFO: loaded from: classes5.dex */
@x0f
public final class d5f {

    @yfb
    public static final C4621b Companion = new C4621b(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f28477a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f28478b;

    /* JADX INFO: renamed from: c */
    public final int f28479c;

    /* JADX INFO: renamed from: d */
    public final long f28480d;

    /* JADX INFO: renamed from: d5f$a */
    @q64(level = u64.f86867c, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class C4620a implements w27<d5f> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C4620a f28481a;

        @yfb
        private static final f0f descriptor;

        static {
            C4620a c4620a = new C4620a();
            f28481a = c4620a;
            h1d h1dVar = new h1d("com.google.firebase.sessions.SessionDetails", c4620a, 4);
            h1dVar.addElement("sessionId", false);
            h1dVar.addElement("firstSessionId", false);
            h1dVar.addElement("sessionIndex", false);
            h1dVar.addElement("sessionStartTimestampUs", false);
            descriptor = h1dVar;
        }

        private C4620a() {
        }

        @Override // p000.w27
        @yfb
        public final lp8<?>[] childSerializers() {
            i8g i8gVar = i8g.f46073a;
            return new lp8[]{i8gVar, i8gVar, o78.f66598a, wl9.f94628a};
        }

        @Override // p000.t74
        @yfb
        public final d5f deserialize(@yfb jl3 jl3Var) {
            String str;
            int i;
            int iDecodeIntElement;
            String str2;
            long jDecodeLongElement;
            md8.checkNotNullParameter(jl3Var, "decoder");
            f0f f0fVar = descriptor;
            lm2 lm2VarBeginStructure = jl3Var.beginStructure(f0fVar);
            if (lm2VarBeginStructure.decodeSequentially()) {
                String strDecodeStringElement = lm2VarBeginStructure.decodeStringElement(f0fVar, 0);
                String strDecodeStringElement2 = lm2VarBeginStructure.decodeStringElement(f0fVar, 1);
                str = strDecodeStringElement;
                i = 15;
                iDecodeIntElement = lm2VarBeginStructure.decodeIntElement(f0fVar, 2);
                str2 = strDecodeStringElement2;
                jDecodeLongElement = lm2VarBeginStructure.decodeLongElement(f0fVar, 3);
            } else {
                String strDecodeStringElement3 = null;
                String strDecodeStringElement4 = null;
                boolean z = true;
                long jDecodeLongElement2 = 0;
                int i2 = 0;
                int iDecodeIntElement2 = 0;
                while (z) {
                    int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(f0fVar);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement3 = lm2VarBeginStructure.decodeStringElement(f0fVar, 0);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement4 = lm2VarBeginStructure.decodeStringElement(f0fVar, 1);
                        i2 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        iDecodeIntElement2 = lm2VarBeginStructure.decodeIntElement(f0fVar, 2);
                        i2 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new qth(iDecodeElementIndex);
                        }
                        jDecodeLongElement2 = lm2VarBeginStructure.decodeLongElement(f0fVar, 3);
                        i2 |= 8;
                    }
                }
                str = strDecodeStringElement3;
                i = i2;
                iDecodeIntElement = iDecodeIntElement2;
                str2 = strDecodeStringElement4;
                jDecodeLongElement = jDecodeLongElement2;
            }
            lm2VarBeginStructure.endStructure(f0fVar);
            return new d5f(i, str, str2, iDecodeIntElement, jDecodeLongElement, null);
        }

        @Override // p000.lp8, p000.e1f, p000.t74
        @yfb
        public final f0f getDescriptor() {
            return descriptor;
        }

        @Override // p000.e1f
        public final void serialize(@yfb m15 m15Var, @yfb d5f d5fVar) {
            md8.checkNotNullParameter(m15Var, "encoder");
            md8.checkNotNullParameter(d5fVar, "value");
            f0f f0fVar = descriptor;
            om2 om2VarBeginStructure = m15Var.beginStructure(f0fVar);
            d5f.write$Self$com_google_firebase_firebase_sessions(d5fVar, om2VarBeginStructure, f0fVar);
            om2VarBeginStructure.endStructure(f0fVar);
        }

        @Override // p000.w27
        @yfb
        public lp8<?>[] typeParametersSerializers() {
            return w27.C14367a.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: d5f$b */
    public static final class C4621b {
        private C4621b() {
        }

        @yfb
        public final lp8<d5f> serializer() {
            return C4620a.f28481a;
        }

        public /* synthetic */ C4621b(jt3 jt3Var) {
            this();
        }
    }

    public /* synthetic */ d5f(int i, String str, String str2, int i2, long j, c1f c1fVar) {
        if (15 != (i & 15)) {
            c1d.throwMissingFieldException(i, 15, C4620a.f28481a.getDescriptor());
        }
        this.f28477a = str;
        this.f28478b = str2;
        this.f28479c = i2;
        this.f28480d = j;
    }

    public static /* synthetic */ d5f copy$default(d5f d5fVar, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = d5fVar.f28477a;
        }
        if ((i2 & 2) != 0) {
            str2 = d5fVar.f28478b;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = d5fVar.f28479c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = d5fVar.f28480d;
        }
        return d5fVar.copy(str, str3, i3, j);
    }

    @do8
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(d5f d5fVar, om2 om2Var, f0f f0fVar) {
        om2Var.encodeStringElement(f0fVar, 0, d5fVar.f28477a);
        om2Var.encodeStringElement(f0fVar, 1, d5fVar.f28478b);
        om2Var.encodeIntElement(f0fVar, 2, d5fVar.f28479c);
        om2Var.encodeLongElement(f0fVar, 3, d5fVar.f28480d);
    }

    @yfb
    public final String component1() {
        return this.f28477a;
    }

    @yfb
    public final String component2() {
        return this.f28478b;
    }

    public final int component3() {
        return this.f28479c;
    }

    public final long component4() {
        return this.f28480d;
    }

    @yfb
    public final d5f copy(@yfb String str, @yfb String str2, int i, long j) {
        md8.checkNotNullParameter(str, "sessionId");
        md8.checkNotNullParameter(str2, "firstSessionId");
        return new d5f(str, str2, i, j);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5f)) {
            return false;
        }
        d5f d5fVar = (d5f) obj;
        return md8.areEqual(this.f28477a, d5fVar.f28477a) && md8.areEqual(this.f28478b, d5fVar.f28478b) && this.f28479c == d5fVar.f28479c && this.f28480d == d5fVar.f28480d;
    }

    @yfb
    public final String getFirstSessionId() {
        return this.f28478b;
    }

    @yfb
    public final String getSessionId() {
        return this.f28477a;
    }

    public final int getSessionIndex() {
        return this.f28479c;
    }

    public final long getSessionStartTimestampUs() {
        return this.f28480d;
    }

    public int hashCode() {
        return (((((this.f28477a.hashCode() * 31) + this.f28478b.hashCode()) * 31) + Integer.hashCode(this.f28479c)) * 31) + Long.hashCode(this.f28480d);
    }

    @yfb
    public String toString() {
        return "SessionDetails(sessionId=" + this.f28477a + ", firstSessionId=" + this.f28478b + ", sessionIndex=" + this.f28479c + ", sessionStartTimestampUs=" + this.f28480d + ')';
    }

    public d5f(@yfb String str, @yfb String str2, int i, long j) {
        md8.checkNotNullParameter(str, "sessionId");
        md8.checkNotNullParameter(str2, "firstSessionId");
        this.f28477a = str;
        this.f28478b = str2;
        this.f28479c = i;
        this.f28480d = j;
    }
}
