package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.c15;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class uj0 extends z33.AbstractC15965f {

    /* JADX INFO: renamed from: a */
    public final String f88062a;

    /* JADX INFO: renamed from: b */
    public final String f88063b;

    /* JADX INFO: renamed from: c */
    public final String f88064c;

    /* JADX INFO: renamed from: d */
    public final long f88065d;

    /* JADX INFO: renamed from: e */
    public final Long f88066e;

    /* JADX INFO: renamed from: f */
    public final boolean f88067f;

    /* JADX INFO: renamed from: g */
    public final z33.AbstractC15965f.a f88068g;

    /* JADX INFO: renamed from: h */
    public final z33.AbstractC15965f.f f88069h;

    /* JADX INFO: renamed from: i */
    public final z33.AbstractC15965f.e f88070i;

    /* JADX INFO: renamed from: j */
    public final z33.AbstractC15965f.c f88071j;

    /* JADX INFO: renamed from: k */
    public final List<z33.AbstractC15965f.d> f88072k;

    /* JADX INFO: renamed from: l */
    public final int f88073l;

    /* JADX INFO: renamed from: uj0$b */
    public static final class C13548b extends z33.AbstractC15965f.b {

        /* JADX INFO: renamed from: a */
        public String f88074a;

        /* JADX INFO: renamed from: b */
        public String f88075b;

        /* JADX INFO: renamed from: c */
        public String f88076c;

        /* JADX INFO: renamed from: d */
        public long f88077d;

        /* JADX INFO: renamed from: e */
        public Long f88078e;

        /* JADX INFO: renamed from: f */
        public boolean f88079f;

        /* JADX INFO: renamed from: g */
        public z33.AbstractC15965f.a f88080g;

        /* JADX INFO: renamed from: h */
        public z33.AbstractC15965f.f f88081h;

        /* JADX INFO: renamed from: i */
        public z33.AbstractC15965f.e f88082i;

        /* JADX INFO: renamed from: j */
        public z33.AbstractC15965f.c f88083j;

        /* JADX INFO: renamed from: k */
        public List<z33.AbstractC15965f.d> f88084k;

        /* JADX INFO: renamed from: l */
        public int f88085l;

        /* JADX INFO: renamed from: m */
        public byte f88086m;

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f build() {
            String str;
            String str2;
            z33.AbstractC15965f.a aVar;
            if (this.f88086m == 7 && (str = this.f88074a) != null && (str2 = this.f88075b) != null && (aVar = this.f88080g) != null) {
                return new uj0(str, str2, this.f88076c, this.f88077d, this.f88078e, this.f88079f, aVar, this.f88081h, this.f88082i, this.f88083j, this.f88084k, this.f88085l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f88074a == null) {
                sb.append(" generator");
            }
            if (this.f88075b == null) {
                sb.append(" identifier");
            }
            if ((this.f88086m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f88086m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f88080g == null) {
                sb.append(" app");
            }
            if ((this.f88086m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setApp(z33.AbstractC15965f.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f88080g = aVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setAppQualitySessionId(@hib String str) {
            this.f88076c = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setCrashed(boolean z) {
            this.f88079f = z;
            this.f88086m = (byte) (this.f88086m | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setDevice(z33.AbstractC15965f.c cVar) {
            this.f88083j = cVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setEndedAt(Long l) {
            this.f88078e = l;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setEvents(List<z33.AbstractC15965f.d> list) {
            this.f88084k = list;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setGenerator(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f88074a = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setGeneratorType(int i) {
            this.f88085l = i;
            this.f88086m = (byte) (this.f88086m | 4);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f88075b = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setOs(z33.AbstractC15965f.e eVar) {
            this.f88082i = eVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setStartedAt(long j) {
            this.f88077d = j;
            this.f88086m = (byte) (this.f88086m | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.b
        public z33.AbstractC15965f.b setUser(z33.AbstractC15965f.f fVar) {
            this.f88081h = fVar;
            return this;
        }

        public C13548b() {
        }

        private C13548b(z33.AbstractC15965f abstractC15965f) {
            this.f88074a = abstractC15965f.getGenerator();
            this.f88075b = abstractC15965f.getIdentifier();
            this.f88076c = abstractC15965f.getAppQualitySessionId();
            this.f88077d = abstractC15965f.getStartedAt();
            this.f88078e = abstractC15965f.getEndedAt();
            this.f88079f = abstractC15965f.isCrashed();
            this.f88080g = abstractC15965f.getApp();
            this.f88081h = abstractC15965f.getUser();
            this.f88082i = abstractC15965f.getOs();
            this.f88083j = abstractC15965f.getDevice();
            this.f88084k = abstractC15965f.getEvents();
            this.f88085l = abstractC15965f.getGeneratorType();
            this.f88086m = (byte) 7;
        }
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        z33.AbstractC15965f.f fVar;
        z33.AbstractC15965f.e eVar;
        z33.AbstractC15965f.c cVar;
        List<z33.AbstractC15965f.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f)) {
            return false;
        }
        z33.AbstractC15965f abstractC15965f = (z33.AbstractC15965f) obj;
        return this.f88062a.equals(abstractC15965f.getGenerator()) && this.f88063b.equals(abstractC15965f.getIdentifier()) && ((str = this.f88064c) != null ? str.equals(abstractC15965f.getAppQualitySessionId()) : abstractC15965f.getAppQualitySessionId() == null) && this.f88065d == abstractC15965f.getStartedAt() && ((l = this.f88066e) != null ? l.equals(abstractC15965f.getEndedAt()) : abstractC15965f.getEndedAt() == null) && this.f88067f == abstractC15965f.isCrashed() && this.f88068g.equals(abstractC15965f.getApp()) && ((fVar = this.f88069h) != null ? fVar.equals(abstractC15965f.getUser()) : abstractC15965f.getUser() == null) && ((eVar = this.f88070i) != null ? eVar.equals(abstractC15965f.getOs()) : abstractC15965f.getOs() == null) && ((cVar = this.f88071j) != null ? cVar.equals(abstractC15965f.getDevice()) : abstractC15965f.getDevice() == null) && ((list = this.f88072k) != null ? list.equals(abstractC15965f.getEvents()) : abstractC15965f.getEvents() == null) && this.f88073l == abstractC15965f.getGeneratorType();
    }

    @Override // p000.z33.AbstractC15965f
    @efb
    public z33.AbstractC15965f.a getApp() {
        return this.f88068g;
    }

    @Override // p000.z33.AbstractC15965f
    @hib
    public String getAppQualitySessionId() {
        return this.f88064c;
    }

    @Override // p000.z33.AbstractC15965f
    @hib
    public z33.AbstractC15965f.c getDevice() {
        return this.f88071j;
    }

    @Override // p000.z33.AbstractC15965f
    @hib
    public Long getEndedAt() {
        return this.f88066e;
    }

    @Override // p000.z33.AbstractC15965f
    @hib
    public List<z33.AbstractC15965f.d> getEvents() {
        return this.f88072k;
    }

    @Override // p000.z33.AbstractC15965f
    @efb
    public String getGenerator() {
        return this.f88062a;
    }

    @Override // p000.z33.AbstractC15965f
    public int getGeneratorType() {
        return this.f88073l;
    }

    @Override // p000.z33.AbstractC15965f
    @efb
    @c15.InterfaceC2148b
    public String getIdentifier() {
        return this.f88063b;
    }

    @Override // p000.z33.AbstractC15965f
    @hib
    public z33.AbstractC15965f.e getOs() {
        return this.f88070i;
    }

    @Override // p000.z33.AbstractC15965f
    public long getStartedAt() {
        return this.f88065d;
    }

    @Override // p000.z33.AbstractC15965f
    @hib
    public z33.AbstractC15965f.f getUser() {
        return this.f88069h;
    }

    public int hashCode() {
        int iHashCode = (((this.f88062a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f88063b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f88064c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f88065d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        Long l = this.f88066e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f88067f ? 1231 : 1237)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f88068g.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.f fVar = this.f88069h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.e eVar = this.f88070i;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.c cVar = this.f88071j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        List<z33.AbstractC15965f.d> list = this.f88072k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f88073l;
    }

    @Override // p000.z33.AbstractC15965f
    public boolean isCrashed() {
        return this.f88067f;
    }

    @Override // p000.z33.AbstractC15965f
    public z33.AbstractC15965f.b toBuilder() {
        return new C13548b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f88062a + ", identifier=" + this.f88063b + ", appQualitySessionId=" + this.f88064c + ", startedAt=" + this.f88065d + ", endedAt=" + this.f88066e + ", crashed=" + this.f88067f + ", app=" + this.f88068g + ", user=" + this.f88069h + ", os=" + this.f88070i + ", device=" + this.f88071j + ", events=" + this.f88072k + ", generatorType=" + this.f88073l + "}";
    }

    private uj0(String str, String str2, @hib String str3, long j, @hib Long l, boolean z, z33.AbstractC15965f.a aVar, @hib z33.AbstractC15965f.f fVar, @hib z33.AbstractC15965f.e eVar, @hib z33.AbstractC15965f.c cVar, @hib List<z33.AbstractC15965f.d> list, int i) {
        this.f88062a = str;
        this.f88063b = str2;
        this.f88064c = str3;
        this.f88065d = j;
        this.f88066e = l;
        this.f88067f = z;
        this.f88068g = aVar;
        this.f88069h = fVar;
        this.f88070i = eVar;
        this.f88071j = cVar;
        this.f88072k = list;
        this.f88073l = i;
    }
}
