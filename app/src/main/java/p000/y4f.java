package p000;

import p000.w27;

/* JADX INFO: loaded from: classes5.dex */
@x0f
public final class y4f {

    @yfb
    public static final C15490b Companion = new C15490b(null);

    /* JADX INFO: renamed from: a */
    @gib
    public final Boolean f100345a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Double f100346b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Integer f100347c;

    /* JADX INFO: renamed from: d */
    @gib
    public final Integer f100348d;

    /* JADX INFO: renamed from: e */
    @gib
    public final Long f100349e;

    /* JADX INFO: renamed from: y4f$a */
    @q64(level = u64.f86867c, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class C15489a implements w27<y4f> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C15489a f100350a;

        @yfb
        private static final f0f descriptor;

        static {
            C15489a c15489a = new C15489a();
            f100350a = c15489a;
            h1d h1dVar = new h1d("com.google.firebase.sessions.settings.SessionConfigs", c15489a, 5);
            h1dVar.addElement("sessionsEnabled", false);
            h1dVar.addElement("sessionSamplingRate", false);
            h1dVar.addElement("sessionTimeoutSeconds", false);
            h1dVar.addElement("cacheDurationSeconds", false);
            h1dVar.addElement("cacheUpdatedTimeSeconds", false);
            descriptor = h1dVar;
        }

        private C15489a() {
        }

        @Override // p000.w27
        @yfb
        public final lp8<?>[] childSerializers() {
            lp8<?> nullable = hg1.getNullable(ya1.f100910a);
            lp8<?> nullable2 = hg1.getNullable(fk4.f36907a);
            o78 o78Var = o78.f66598a;
            return new lp8[]{nullable, nullable2, hg1.getNullable(o78Var), hg1.getNullable(o78Var), hg1.getNullable(wl9.f94628a)};
        }

        @Override // p000.t74
        @yfb
        public final y4f deserialize(@yfb jl3 jl3Var) {
            int i;
            Boolean bool;
            Double d;
            Integer num;
            Integer num2;
            Long l;
            md8.checkNotNullParameter(jl3Var, "decoder");
            f0f f0fVar = descriptor;
            lm2 lm2VarBeginStructure = jl3Var.beginStructure(f0fVar);
            Boolean bool2 = null;
            if (lm2VarBeginStructure.decodeSequentially()) {
                Boolean bool3 = (Boolean) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 0, ya1.f100910a, null);
                Double d2 = (Double) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 1, fk4.f36907a, null);
                o78 o78Var = o78.f66598a;
                Integer num3 = (Integer) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 2, o78Var, null);
                bool = bool3;
                num2 = (Integer) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 3, o78Var, null);
                l = (Long) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 4, wl9.f94628a, null);
                num = num3;
                d = d2;
                i = 31;
            } else {
                boolean z = true;
                int i2 = 0;
                Double d3 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l2 = null;
                while (z) {
                    int iDecodeElementIndex = lm2VarBeginStructure.decodeElementIndex(f0fVar);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        bool2 = (Boolean) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 0, ya1.f100910a, bool2);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        d3 = (Double) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 1, fk4.f36907a, d3);
                        i2 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        num4 = (Integer) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 2, o78.f66598a, num4);
                        i2 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        num5 = (Integer) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 3, o78.f66598a, num5);
                        i2 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new qth(iDecodeElementIndex);
                        }
                        l2 = (Long) lm2VarBeginStructure.decodeNullableSerializableElement(f0fVar, 4, wl9.f94628a, l2);
                        i2 |= 16;
                    }
                }
                i = i2;
                bool = bool2;
                d = d3;
                num = num4;
                num2 = num5;
                l = l2;
            }
            lm2VarBeginStructure.endStructure(f0fVar);
            return new y4f(i, bool, d, num, num2, l, null);
        }

        @Override // p000.lp8, p000.e1f, p000.t74
        @yfb
        public final f0f getDescriptor() {
            return descriptor;
        }

        @Override // p000.e1f
        public final void serialize(@yfb m15 m15Var, @yfb y4f y4fVar) {
            md8.checkNotNullParameter(m15Var, "encoder");
            md8.checkNotNullParameter(y4fVar, "value");
            f0f f0fVar = descriptor;
            om2 om2VarBeginStructure = m15Var.beginStructure(f0fVar);
            y4f.write$Self$com_google_firebase_firebase_sessions(y4fVar, om2VarBeginStructure, f0fVar);
            om2VarBeginStructure.endStructure(f0fVar);
        }

        @Override // p000.w27
        @yfb
        public lp8<?>[] typeParametersSerializers() {
            return w27.C14367a.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: y4f$b */
    public static final class C15490b {
        private C15490b() {
        }

        @yfb
        public final lp8<y4f> serializer() {
            return C15489a.f100350a;
        }

        public /* synthetic */ C15490b(jt3 jt3Var) {
            this();
        }
    }

    public /* synthetic */ y4f(int i, Boolean bool, Double d, Integer num, Integer num2, Long l, c1f c1fVar) {
        if (31 != (i & 31)) {
            c1d.throwMissingFieldException(i, 31, C15489a.f100350a.getDescriptor());
        }
        this.f100345a = bool;
        this.f100346b = d;
        this.f100347c = num;
        this.f100348d = num2;
        this.f100349e = l;
    }

    public static /* synthetic */ y4f copy$default(y4f y4fVar, Boolean bool, Double d, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = y4fVar.f100345a;
        }
        if ((i & 2) != 0) {
            d = y4fVar.f100346b;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            num = y4fVar.f100347c;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = y4fVar.f100348d;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            l = y4fVar.f100349e;
        }
        return y4fVar.copy(bool, d2, num3, num4, l);
    }

    @do8
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(y4f y4fVar, om2 om2Var, f0f f0fVar) {
        om2Var.encodeNullableSerializableElement(f0fVar, 0, ya1.f100910a, y4fVar.f100345a);
        om2Var.encodeNullableSerializableElement(f0fVar, 1, fk4.f36907a, y4fVar.f100346b);
        o78 o78Var = o78.f66598a;
        om2Var.encodeNullableSerializableElement(f0fVar, 2, o78Var, y4fVar.f100347c);
        om2Var.encodeNullableSerializableElement(f0fVar, 3, o78Var, y4fVar.f100348d);
        om2Var.encodeNullableSerializableElement(f0fVar, 4, wl9.f94628a, y4fVar.f100349e);
    }

    @gib
    public final Boolean component1() {
        return this.f100345a;
    }

    @gib
    public final Double component2() {
        return this.f100346b;
    }

    @gib
    public final Integer component3() {
        return this.f100347c;
    }

    @gib
    public final Integer component4() {
        return this.f100348d;
    }

    @gib
    public final Long component5() {
        return this.f100349e;
    }

    @yfb
    public final y4f copy(@gib Boolean bool, @gib Double d, @gib Integer num, @gib Integer num2, @gib Long l) {
        return new y4f(bool, d, num, num2, l);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4f)) {
            return false;
        }
        y4f y4fVar = (y4f) obj;
        return md8.areEqual(this.f100345a, y4fVar.f100345a) && md8.areEqual((Object) this.f100346b, (Object) y4fVar.f100346b) && md8.areEqual(this.f100347c, y4fVar.f100347c) && md8.areEqual(this.f100348d, y4fVar.f100348d) && md8.areEqual(this.f100349e, y4fVar.f100349e);
    }

    @gib
    public final Integer getCacheDurationSeconds() {
        return this.f100348d;
    }

    @gib
    public final Long getCacheUpdatedTimeSeconds() {
        return this.f100349e;
    }

    @gib
    public final Double getSessionSamplingRate() {
        return this.f100346b;
    }

    @gib
    public final Integer getSessionTimeoutSeconds() {
        return this.f100347c;
    }

    @gib
    public final Boolean getSessionsEnabled() {
        return this.f100345a;
    }

    public int hashCode() {
        Boolean bool = this.f100345a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f100346b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f100347c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f100348d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f100349e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f100345a + ", sessionSamplingRate=" + this.f100346b + ", sessionTimeoutSeconds=" + this.f100347c + ", cacheDurationSeconds=" + this.f100348d + ", cacheUpdatedTimeSeconds=" + this.f100349e + ')';
    }

    public y4f(@gib Boolean bool, @gib Double d, @gib Integer num, @gib Integer num2, @gib Long l) {
        this.f100345a = bool;
        this.f100346b = d;
        this.f100347c = num;
        this.f100348d = num2;
        this.f100349e = l;
    }
}
