package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class fk0 extends z33.AbstractC15965f.d.a.b.e.AbstractC16576b {

    /* JADX INFO: renamed from: a */
    public final long f36882a;

    /* JADX INFO: renamed from: b */
    public final String f36883b;

    /* JADX INFO: renamed from: c */
    public final String f36884c;

    /* JADX INFO: renamed from: d */
    public final long f36885d;

    /* JADX INFO: renamed from: e */
    public final int f36886e;

    /* JADX INFO: renamed from: fk0$b */
    public static final class C5860b extends z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a {

        /* JADX INFO: renamed from: a */
        public long f36887a;

        /* JADX INFO: renamed from: b */
        public String f36888b;

        /* JADX INFO: renamed from: c */
        public String f36889c;

        /* JADX INFO: renamed from: d */
        public long f36890d;

        /* JADX INFO: renamed from: e */
        public int f36891e;

        /* JADX INFO: renamed from: f */
        public byte f36892f;

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16576b build() {
            String str;
            if (this.f36892f == 7 && (str = this.f36888b) != null) {
                return new fk0(this.f36887a, str, this.f36889c, this.f36890d, this.f36891e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f36892f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f36888b == null) {
                sb.append(" symbol");
            }
            if ((this.f36892f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f36892f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a setFile(String str) {
            this.f36889c = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a setImportance(int i) {
            this.f36891e = i;
            this.f36892f = (byte) (this.f36892f | 4);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a setOffset(long j) {
            this.f36890d = j;
            this.f36892f = (byte) (this.f36892f | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a setPc(long j) {
            this.f36887a = j;
            this.f36892f = (byte) (this.f36892f | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16576b.AbstractC16577a setSymbol(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f36888b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a.b.e.AbstractC16576b)) {
            return false;
        }
        z33.AbstractC15965f.d.a.b.e.AbstractC16576b abstractC16576b = (z33.AbstractC15965f.d.a.b.e.AbstractC16576b) obj;
        return this.f36882a == abstractC16576b.getPc() && this.f36883b.equals(abstractC16576b.getSymbol()) && ((str = this.f36884c) != null ? str.equals(abstractC16576b.getFile()) : abstractC16576b.getFile() == null) && this.f36885d == abstractC16576b.getOffset() && this.f36886e == abstractC16576b.getImportance();
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b
    @hib
    public String getFile() {
        return this.f36884c;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b
    public int getImportance() {
        return this.f36886e;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b
    public long getOffset() {
        return this.f36885d;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b
    public long getPc() {
        return this.f36882a;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16576b
    @efb
    public String getSymbol() {
        return this.f36883b;
    }

    public int hashCode() {
        long j = this.f36882a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f36883b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f36884c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f36885d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f36886e;
    }

    public String toString() {
        return "Frame{pc=" + this.f36882a + ", symbol=" + this.f36883b + ", file=" + this.f36884c + ", offset=" + this.f36885d + ", importance=" + this.f36886e + "}";
    }

    private fk0(long j, String str, @hib String str2, long j2, int i) {
        this.f36882a = j;
        this.f36883b = str;
        this.f36884c = str2;
        this.f36885d = j2;
        this.f36886e = i;
    }
}
