package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class dk0 extends z33.AbstractC15965f.d.a.b.AbstractC16573d {

    /* JADX INFO: renamed from: a */
    public final String f29851a;

    /* JADX INFO: renamed from: b */
    public final String f29852b;

    /* JADX INFO: renamed from: c */
    public final long f29853c;

    /* JADX INFO: renamed from: dk0$b */
    public static final class C4828b extends z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a {

        /* JADX INFO: renamed from: a */
        public String f29854a;

        /* JADX INFO: renamed from: b */
        public String f29855b;

        /* JADX INFO: renamed from: c */
        public long f29856c;

        /* JADX INFO: renamed from: d */
        public byte f29857d;

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a
        public z33.AbstractC15965f.d.a.b.AbstractC16573d build() {
            String str;
            String str2;
            if (this.f29857d == 1 && (str = this.f29854a) != null && (str2 = this.f29855b) != null) {
                return new dk0(str, str2, this.f29856c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f29854a == null) {
                sb.append(" name");
            }
            if (this.f29855b == null) {
                sb.append(" code");
            }
            if ((1 & this.f29857d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a
        public z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a setAddress(long j) {
            this.f29856c = j;
            this.f29857d = (byte) (this.f29857d | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a
        public z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a setCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f29855b = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a
        public z33.AbstractC15965f.d.a.b.AbstractC16573d.AbstractC16574a setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f29854a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a.b.AbstractC16573d)) {
            return false;
        }
        z33.AbstractC15965f.d.a.b.AbstractC16573d abstractC16573d = (z33.AbstractC15965f.d.a.b.AbstractC16573d) obj;
        return this.f29851a.equals(abstractC16573d.getName()) && this.f29852b.equals(abstractC16573d.getCode()) && this.f29853c == abstractC16573d.getAddress();
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16573d
    @efb
    public long getAddress() {
        return this.f29853c;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16573d
    @efb
    public String getCode() {
        return this.f29852b;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16573d
    @efb
    public String getName() {
        return this.f29851a;
    }

    public int hashCode() {
        int iHashCode = (((this.f29851a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f29852b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f29853c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f29851a + ", code=" + this.f29852b + ", address=" + this.f29853c + "}";
    }

    private dk0(String str, String str2, long j) {
        this.f29851a = str;
        this.f29852b = str2;
        this.f29853c = j;
    }
}
