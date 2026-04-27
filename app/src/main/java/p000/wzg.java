package p000;

import androidx.appcompat.widget.C0546a;
import p000.bt4;
import p000.w27;

/* JADX INFO: loaded from: classes5.dex */
@x0f
public final class wzg {

    @yfb
    public static final C14852b Companion = new C14852b(null);

    /* JADX INFO: renamed from: a */
    public final long f95876a;

    /* JADX INFO: renamed from: b */
    public final long f95877b;

    /* JADX INFO: renamed from: c */
    public final long f95878c;

    /* JADX INFO: renamed from: wzg$a */
    @q64(level = u64.f86867c, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class C14851a implements w27<wzg> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C14851a f95879a;

        @yfb
        private static final f0f descriptor;

        static {
            C14851a c14851a = new C14851a();
            f95879a = c14851a;
            h1d h1dVar = new h1d("com.google.firebase.sessions.Time", c14851a, 3);
            h1dVar.addElement("ms", false);
            h1dVar.addElement("us", true);
            h1dVar.addElement("seconds", true);
            descriptor = h1dVar;
        }

        private C14851a() {
        }

        @Override // p000.w27
        @yfb
        public final lp8<?>[] childSerializers() {
            wl9 wl9Var = wl9.f94628a;
            return new lp8[]{wl9Var, wl9Var, wl9Var};
        }

        @Override // p000.t74
        @yfb
        public final wzg deserialize(@yfb jl3 jl3Var) {
            int i;
            long jDecodeLongElement;
            long j;
            long j2;
            md8.checkNotNullParameter(jl3Var, "decoder");
            f0f f0fVar = descriptor;
            lm2 lm2VarBeginStructure = jl3Var.beginStructure(f0fVar);
            if (lm2VarBeginStructure.decodeSequentially()) {
                long jDecodeLongElement2 = lm2VarBeginStructure.decodeLongElement(f0fVar, 0);
                long jDecodeLongElement3 = lm2VarBeginStructure.decodeLongElement(f0fVar, 1);
                jDecodeLongElement = lm2VarBeginStructure.decodeLongElement(f0fVar, 2);
                i = 7;
                j = jDecodeLongElement2;
                j2 = jDecodeLongElement3;
            } else {
                long jDecodeLongElement4 = 0;
                boolean z = true;
                int i2 = 0;
                long jDecodeLongElement5 = 0;
                long jDecodeLongElement6 = 0;
                while (z) {
                    int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(f0fVar);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        jDecodeLongElement5 = lm2VarBeginStructure.decodeLongElement(f0fVar, 0);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        jDecodeLongElement6 = lm2VarBeginStructure.decodeLongElement(f0fVar, 1);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new qth(iDecodeElementIndex);
                        }
                        jDecodeLongElement4 = lm2VarBeginStructure.decodeLongElement(f0fVar, 2);
                        i2 |= 4;
                    }
                }
                i = i2;
                jDecodeLongElement = jDecodeLongElement4;
                j = jDecodeLongElement5;
                j2 = jDecodeLongElement6;
            }
            lm2VarBeginStructure.endStructure(f0fVar);
            return new wzg(i, j, j2, jDecodeLongElement, null);
        }

        @Override // p000.lp8, p000.e1f, p000.t74
        @yfb
        public final f0f getDescriptor() {
            return descriptor;
        }

        @Override // p000.e1f
        public final void serialize(@yfb m15 m15Var, @yfb wzg wzgVar) {
            md8.checkNotNullParameter(m15Var, "encoder");
            md8.checkNotNullParameter(wzgVar, "value");
            f0f f0fVar = descriptor;
            om2 om2VarBeginStructure = m15Var.beginStructure(f0fVar);
            wzg.write$Self$com_google_firebase_firebase_sessions(wzgVar, om2VarBeginStructure, f0fVar);
            om2VarBeginStructure.endStructure(f0fVar);
        }

        @Override // p000.w27
        @yfb
        public lp8<?>[] typeParametersSerializers() {
            return w27.C14367a.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: wzg$b */
    public static final class C14852b {
        private C14852b() {
        }

        @yfb
        public final lp8<wzg> serializer() {
            return C14851a.f95879a;
        }

        public /* synthetic */ C14852b(jt3 jt3Var) {
            this();
        }
    }

    public /* synthetic */ wzg(int i, long j, long j2, long j3, c1f c1fVar) {
        if (1 != (i & 1)) {
            c1d.throwMissingFieldException(i, 1, C14851a.f95879a.getDescriptor());
        }
        this.f95876a = j;
        this.f95877b = (i & 2) == 0 ? ((long) 1000) * j : j2;
        if ((i & 4) == 0) {
            this.f95878c = j / ((long) 1000);
        } else {
            this.f95878c = j3;
        }
    }

    public static /* synthetic */ wzg copy$default(wzg wzgVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = wzgVar.f95876a;
        }
        return wzgVar.copy(j);
    }

    @do8
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(wzg wzgVar, om2 om2Var, f0f f0fVar) {
        om2Var.encodeLongElement(f0fVar, 0, wzgVar.f95876a);
        if (om2Var.shouldEncodeElementDefault(f0fVar, 1) || wzgVar.f95877b != wzgVar.f95876a * ((long) 1000)) {
            om2Var.encodeLongElement(f0fVar, 1, wzgVar.f95877b);
        }
        if (!om2Var.shouldEncodeElementDefault(f0fVar, 2) && wzgVar.f95878c == wzgVar.f95876a / ((long) 1000)) {
            return;
        }
        om2Var.encodeLongElement(f0fVar, 2, wzgVar.f95878c);
    }

    public final long component1() {
        return this.f95876a;
    }

    @yfb
    public final wzg copy(long j) {
        return new wzg(j);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzg) && this.f95876a == ((wzg) obj).f95876a;
    }

    public final long getMs() {
        return this.f95876a;
    }

    public final long getSeconds() {
        return this.f95878c;
    }

    public final long getUs() {
        return this.f95877b;
    }

    public int hashCode() {
        return Long.hashCode(this.f95876a);
    }

    /* JADX INFO: renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m33148minus5sfh64U(@yfb wzg wzgVar) {
        md8.checkNotNullParameter(wzgVar, C0546a.f3357s);
        bt4.C2044a c2044a = bt4.f14711b;
        return ft4.toDuration(this.f95876a - wzgVar.f95876a, lt4.f58683d);
    }

    @yfb
    public String toString() {
        return "Time(ms=" + this.f95876a + ')';
    }

    public wzg(long j) {
        this.f95876a = j;
        long j2 = 1000;
        this.f95877b = j * j2;
        this.f95878c = j / j2;
    }
}
