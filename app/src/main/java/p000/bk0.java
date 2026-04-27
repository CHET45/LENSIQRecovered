package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.c15;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class bk0 extends z33.AbstractC15965f.d.a.b.AbstractC16569a {

    /* JADX INFO: renamed from: a */
    public final long f13911a;

    /* JADX INFO: renamed from: b */
    public final long f13912b;

    /* JADX INFO: renamed from: c */
    public final String f13913c;

    /* JADX INFO: renamed from: d */
    public final String f13914d;

    /* JADX INFO: renamed from: bk0$b */
    public static final class C1924b extends z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a {

        /* JADX INFO: renamed from: a */
        public long f13915a;

        /* JADX INFO: renamed from: b */
        public long f13916b;

        /* JADX INFO: renamed from: c */
        public String f13917c;

        /* JADX INFO: renamed from: d */
        public String f13918d;

        /* JADX INFO: renamed from: e */
        public byte f13919e;

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a
        public z33.AbstractC15965f.d.a.b.AbstractC16569a build() {
            String str;
            if (this.f13919e == 3 && (str = this.f13917c) != null) {
                return new bk0(this.f13915a, this.f13916b, str, this.f13918d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f13919e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f13919e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f13917c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a
        public z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a setBaseAddress(long j) {
            this.f13915a = j;
            this.f13919e = (byte) (this.f13919e | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a
        public z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f13917c = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a
        public z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a setSize(long j) {
            this.f13916b = j;
            this.f13919e = (byte) (this.f13919e | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a
        public z33.AbstractC15965f.d.a.b.AbstractC16569a.AbstractC16570a setUuid(@hib String str) {
            this.f13918d = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a.b.AbstractC16569a)) {
            return false;
        }
        z33.AbstractC15965f.d.a.b.AbstractC16569a abstractC16569a = (z33.AbstractC15965f.d.a.b.AbstractC16569a) obj;
        if (this.f13911a == abstractC16569a.getBaseAddress() && this.f13912b == abstractC16569a.getSize() && this.f13913c.equals(abstractC16569a.getName())) {
            String str = this.f13914d;
            if (str == null) {
                if (abstractC16569a.getUuid() == null) {
                    return true;
                }
            } else if (str.equals(abstractC16569a.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a
    @efb
    public long getBaseAddress() {
        return this.f13911a;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a
    @efb
    public String getName() {
        return this.f13913c;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a
    public long getSize() {
        return this.f13912b;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16569a
    @hib
    @c15.InterfaceC2148b
    public String getUuid() {
        return this.f13914d;
    }

    public int hashCode() {
        long j = this.f13911a;
        int i = (((int) (j ^ (j >>> 32))) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f13912b;
        int iHashCode = (((i ^ ((int) ((j2 >>> 32) ^ j2))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f13913c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f13914d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f13911a + ", size=" + this.f13912b + ", name=" + this.f13913c + ", uuid=" + this.f13914d + "}";
    }

    private bk0(long j, long j2, String str, @hib String str2) {
        this.f13911a = j;
        this.f13912b = j2;
        this.f13913c = str;
        this.f13914d = str2;
    }
}
