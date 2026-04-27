package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class yj0 extends z33.AbstractC15965f.d {

    /* JADX INFO: renamed from: a */
    public final long f101768a;

    /* JADX INFO: renamed from: b */
    public final String f101769b;

    /* JADX INFO: renamed from: c */
    public final z33.AbstractC15965f.d.a f101770c;

    /* JADX INFO: renamed from: d */
    public final z33.AbstractC15965f.d.c f101771d;

    /* JADX INFO: renamed from: e */
    public final z33.AbstractC15965f.d.AbstractC16579d f101772e;

    /* JADX INFO: renamed from: f */
    public final z33.AbstractC15965f.d.f f101773f;

    /* JADX INFO: renamed from: yj0$b */
    public static final class C15689b extends z33.AbstractC15965f.d.b {

        /* JADX INFO: renamed from: a */
        public long f101774a;

        /* JADX INFO: renamed from: b */
        public String f101775b;

        /* JADX INFO: renamed from: c */
        public z33.AbstractC15965f.d.a f101776c;

        /* JADX INFO: renamed from: d */
        public z33.AbstractC15965f.d.c f101777d;

        /* JADX INFO: renamed from: e */
        public z33.AbstractC15965f.d.AbstractC16579d f101778e;

        /* JADX INFO: renamed from: f */
        public z33.AbstractC15965f.d.f f101779f;

        /* JADX INFO: renamed from: g */
        public byte f101780g;

        @Override // p000.z33.AbstractC15965f.d.b
        public z33.AbstractC15965f.d build() {
            String str;
            z33.AbstractC15965f.d.a aVar;
            z33.AbstractC15965f.d.c cVar;
            if (this.f101780g == 1 && (str = this.f101775b) != null && (aVar = this.f101776c) != null && (cVar = this.f101777d) != null) {
                return new yj0(this.f101774a, str, aVar, cVar, this.f101778e, this.f101779f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f101780g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f101775b == null) {
                sb.append(" type");
            }
            if (this.f101776c == null) {
                sb.append(" app");
            }
            if (this.f101777d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.b
        public z33.AbstractC15965f.d.b setApp(z33.AbstractC15965f.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f101776c = aVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.b
        public z33.AbstractC15965f.d.b setDevice(z33.AbstractC15965f.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f101777d = cVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.b
        public z33.AbstractC15965f.d.b setLog(z33.AbstractC15965f.d.AbstractC16579d abstractC16579d) {
            this.f101778e = abstractC16579d;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.b
        public z33.AbstractC15965f.d.b setRollouts(z33.AbstractC15965f.d.f fVar) {
            this.f101779f = fVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.b
        public z33.AbstractC15965f.d.b setTimestamp(long j) {
            this.f101774a = j;
            this.f101780g = (byte) (this.f101780g | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.b
        public z33.AbstractC15965f.d.b setType(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f101775b = str;
            return this;
        }

        public C15689b() {
        }

        private C15689b(z33.AbstractC15965f.d dVar) {
            this.f101774a = dVar.getTimestamp();
            this.f101775b = dVar.getType();
            this.f101776c = dVar.getApp();
            this.f101777d = dVar.getDevice();
            this.f101778e = dVar.getLog();
            this.f101779f = dVar.getRollouts();
            this.f101780g = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        z33.AbstractC15965f.d.AbstractC16579d abstractC16579d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d)) {
            return false;
        }
        z33.AbstractC15965f.d dVar = (z33.AbstractC15965f.d) obj;
        if (this.f101768a == dVar.getTimestamp() && this.f101769b.equals(dVar.getType()) && this.f101770c.equals(dVar.getApp()) && this.f101771d.equals(dVar.getDevice()) && ((abstractC16579d = this.f101772e) != null ? abstractC16579d.equals(dVar.getLog()) : dVar.getLog() == null)) {
            z33.AbstractC15965f.d.f fVar = this.f101773f;
            if (fVar == null) {
                if (dVar.getRollouts() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.getRollouts())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.d
    @efb
    public z33.AbstractC15965f.d.a getApp() {
        return this.f101770c;
    }

    @Override // p000.z33.AbstractC15965f.d
    @efb
    public z33.AbstractC15965f.d.c getDevice() {
        return this.f101771d;
    }

    @Override // p000.z33.AbstractC15965f.d
    @hib
    public z33.AbstractC15965f.d.AbstractC16579d getLog() {
        return this.f101772e;
    }

    @Override // p000.z33.AbstractC15965f.d
    @hib
    public z33.AbstractC15965f.d.f getRollouts() {
        return this.f101773f;
    }

    @Override // p000.z33.AbstractC15965f.d
    public long getTimestamp() {
        return this.f101768a;
    }

    @Override // p000.z33.AbstractC15965f.d
    @efb
    public String getType() {
        return this.f101769b;
    }

    public int hashCode() {
        long j = this.f101768a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101769b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101770c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f101771d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.d.AbstractC16579d abstractC16579d = this.f101772e;
        int iHashCode2 = (iHashCode ^ (abstractC16579d == null ? 0 : abstractC16579d.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.d.f fVar = this.f101773f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    @Override // p000.z33.AbstractC15965f.d
    public z33.AbstractC15965f.d.b toBuilder() {
        return new C15689b(this);
    }

    public String toString() {
        return "Event{timestamp=" + this.f101768a + ", type=" + this.f101769b + ", app=" + this.f101770c + ", device=" + this.f101771d + ", log=" + this.f101772e + ", rollouts=" + this.f101773f + "}";
    }

    private yj0(long j, String str, z33.AbstractC15965f.d.a aVar, z33.AbstractC15965f.d.c cVar, @hib z33.AbstractC15965f.d.AbstractC16579d abstractC16579d, @hib z33.AbstractC15965f.d.f fVar) {
        this.f101768a = j;
        this.f101769b = str;
        this.f101770c = aVar;
        this.f101771d = cVar;
        this.f101772e = abstractC16579d;
        this.f101773f = fVar;
    }
}
