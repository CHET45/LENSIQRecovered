package p000;

import java.util.Map;
import p000.d5f;
import p000.rcd;
import p000.w27;
import p000.wzg;

/* JADX INFO: loaded from: classes5.dex */
@x0f
public final class a5f {

    @yfb
    public static final C0069b Companion = new C0069b(null);

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public static final lp8<Object>[] f448d = {null, null, new p79(i8g.f46073a, rcd.C12019a.f77834a)};

    /* JADX INFO: renamed from: a */
    @yfb
    public final d5f f449a;

    /* JADX INFO: renamed from: b */
    @gib
    public final wzg f450b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Map<String, rcd> f451c;

    /* JADX INFO: renamed from: a5f$a */
    @q64(level = u64.f86867c, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class C0068a implements w27<a5f> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C0068a f452a;

        @yfb
        private static final f0f descriptor;

        static {
            C0068a c0068a = new C0068a();
            f452a = c0068a;
            h1d h1dVar = new h1d("com.google.firebase.sessions.SessionData", c0068a, 3);
            h1dVar.addElement("sessionDetails", false);
            h1dVar.addElement("backgroundTime", true);
            h1dVar.addElement("processDataMap", true);
            descriptor = h1dVar;
        }

        private C0068a() {
        }

        @Override // p000.w27
        @yfb
        public final lp8<?>[] childSerializers() {
            return new lp8[]{d5f.C4620a.f28481a, hg1.getNullable(wzg.C14851a.f95879a), hg1.getNullable(a5f.f448d[2])};
        }

        @Override // p000.t74
        @yfb
        public final a5f deserialize(@yfb jl3 jl3Var) {
            int i;
            d5f d5fVar;
            wzg wzgVar;
            Map map;
            md8.checkNotNullParameter(jl3Var, "decoder");
            f0f f0fVar = descriptor;
            lm2 lm2VarBeginStructure = jl3Var.beginStructure(f0fVar);
            lp8[] lp8VarArr = a5f.f448d;
            d5f d5fVar2 = null;
            if (lm2VarBeginStructure.decodeSequentially()) {
                d5f d5fVar3 = (d5f) lm2VarBeginStructure.decodeSerializableElement(f0fVar, 0, d5f.C4620a.f28481a, null);
                wzg wzgVar2 = (wzg) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 1, wzg.C14851a.f95879a, null);
                map = (Map) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 2, lp8VarArr[2], null);
                d5fVar = d5fVar3;
                i = 7;
                wzgVar = wzgVar2;
            } else {
                boolean z = true;
                int i2 = 0;
                wzg wzgVar3 = null;
                Map map2 = null;
                while (z) {
                    int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(f0fVar);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        d5fVar2 = (d5f) lm2VarBeginStructure.decodeSerializableElement(f0fVar, 0, d5f.C4620a.f28481a, d5fVar2);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        wzgVar3 = (wzg) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 1, wzg.C14851a.f95879a, wzgVar3);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new qth(iDecodeElementIndex);
                        }
                        map2 = (Map) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 2, lp8VarArr[2], map2);
                        i2 |= 4;
                    }
                }
                i = i2;
                d5fVar = d5fVar2;
                wzgVar = wzgVar3;
                map = map2;
            }
            lm2VarBeginStructure.endStructure(f0fVar);
            return new a5f(i, d5fVar, wzgVar, map, (c1f) null);
        }

        @Override // p000.lp8, p000.e1f, p000.t74
        @yfb
        public final f0f getDescriptor() {
            return descriptor;
        }

        @Override // p000.e1f
        public final void serialize(@yfb m15 m15Var, @yfb a5f a5fVar) {
            md8.checkNotNullParameter(m15Var, "encoder");
            md8.checkNotNullParameter(a5fVar, "value");
            f0f f0fVar = descriptor;
            om2 om2VarBeginStructure = m15Var.beginStructure(f0fVar);
            a5f.write$Self$com_google_firebase_firebase_sessions(a5fVar, om2VarBeginStructure, f0fVar);
            om2VarBeginStructure.endStructure(f0fVar);
        }

        @Override // p000.w27
        @yfb
        public lp8<?>[] typeParametersSerializers() {
            return w27.C14367a.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: a5f$b */
    public static final class C0069b {
        private C0069b() {
        }

        @yfb
        public final lp8<a5f> serializer() {
            return C0068a.f452a;
        }

        public /* synthetic */ C0069b(jt3 jt3Var) {
            this();
        }
    }

    public /* synthetic */ a5f(int i, d5f d5fVar, wzg wzgVar, Map map, c1f c1fVar) {
        if (1 != (i & 1)) {
            c1d.throwMissingFieldException(i, 1, C0068a.f452a.getDescriptor());
        }
        this.f449a = d5fVar;
        if ((i & 2) == 0) {
            this.f450b = null;
        } else {
            this.f450b = wzgVar;
        }
        if ((i & 4) == 0) {
            this.f451c = null;
        } else {
            this.f451c = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a5f copy$default(a5f a5fVar, d5f d5fVar, wzg wzgVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            d5fVar = a5fVar.f449a;
        }
        if ((i & 2) != 0) {
            wzgVar = a5fVar.f450b;
        }
        if ((i & 4) != 0) {
            map = a5fVar.f451c;
        }
        return a5fVar.copy(d5fVar, wzgVar, map);
    }

    @do8
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(a5f a5fVar, om2 om2Var, f0f f0fVar) {
        lp8<Object>[] lp8VarArr = f448d;
        om2Var.encodeSerializableElement(f0fVar, 0, d5f.C4620a.f28481a, a5fVar.f449a);
        if (om2Var.shouldEncodeElementDefault(f0fVar, 1) || a5fVar.f450b != null) {
            om2Var.encodeNullableSerializableElement(f0fVar, 1, wzg.C14851a.f95879a, a5fVar.f450b);
        }
        if (!om2Var.shouldEncodeElementDefault(f0fVar, 2) && a5fVar.f451c == null) {
            return;
        }
        om2Var.encodeNullableSerializableElement(f0fVar, 2, lp8VarArr[2], a5fVar.f451c);
    }

    @yfb
    public final d5f component1() {
        return this.f449a;
    }

    @gib
    public final wzg component2() {
        return this.f450b;
    }

    @gib
    public final Map<String, rcd> component3() {
        return this.f451c;
    }

    @yfb
    public final a5f copy(@yfb d5f d5fVar, @gib wzg wzgVar, @gib Map<String, rcd> map) {
        md8.checkNotNullParameter(d5fVar, "sessionDetails");
        return new a5f(d5fVar, wzgVar, map);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5f)) {
            return false;
        }
        a5f a5fVar = (a5f) obj;
        return md8.areEqual(this.f449a, a5fVar.f449a) && md8.areEqual(this.f450b, a5fVar.f450b) && md8.areEqual(this.f451c, a5fVar.f451c);
    }

    @gib
    public final wzg getBackgroundTime() {
        return this.f450b;
    }

    @gib
    public final Map<String, rcd> getProcessDataMap() {
        return this.f451c;
    }

    @yfb
    public final d5f getSessionDetails() {
        return this.f449a;
    }

    public int hashCode() {
        int iHashCode = this.f449a.hashCode() * 31;
        wzg wzgVar = this.f450b;
        int iHashCode2 = (iHashCode + (wzgVar == null ? 0 : wzgVar.hashCode())) * 31;
        Map<String, rcd> map = this.f451c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "SessionData(sessionDetails=" + this.f449a + ", backgroundTime=" + this.f450b + ", processDataMap=" + this.f451c + ')';
    }

    public a5f(@yfb d5f d5fVar, @gib wzg wzgVar, @gib Map<String, rcd> map) {
        md8.checkNotNullParameter(d5fVar, "sessionDetails");
        this.f449a = d5fVar;
        this.f450b = wzgVar;
        this.f451c = map;
    }

    public /* synthetic */ a5f(d5f d5fVar, wzg wzgVar, Map map, int i, jt3 jt3Var) {
        this(d5fVar, (i & 2) != 0 ? null : wzgVar, (i & 4) != 0 ? null : map);
    }
}
