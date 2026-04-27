package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class gk0 extends z33.AbstractC15965f.d.a.c {

    /* JADX INFO: renamed from: a */
    public final String f39971a;

    /* JADX INFO: renamed from: b */
    public final int f39972b;

    /* JADX INFO: renamed from: c */
    public final int f39973c;

    /* JADX INFO: renamed from: d */
    public final boolean f39974d;

    /* JADX INFO: renamed from: gk0$b */
    public static final class C6347b extends z33.AbstractC15965f.d.a.c.AbstractC16578a {

        /* JADX INFO: renamed from: a */
        public String f39975a;

        /* JADX INFO: renamed from: b */
        public int f39976b;

        /* JADX INFO: renamed from: c */
        public int f39977c;

        /* JADX INFO: renamed from: d */
        public boolean f39978d;

        /* JADX INFO: renamed from: e */
        public byte f39979e;

        @Override // p000.z33.AbstractC15965f.d.a.c.AbstractC16578a
        public z33.AbstractC15965f.d.a.c build() {
            String str;
            if (this.f39979e == 7 && (str = this.f39975a) != null) {
                return new gk0(str, this.f39976b, this.f39977c, this.f39978d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f39975a == null) {
                sb.append(" processName");
            }
            if ((this.f39979e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f39979e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f39979e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.c.AbstractC16578a
        public z33.AbstractC15965f.d.a.c.AbstractC16578a setDefaultProcess(boolean z) {
            this.f39978d = z;
            this.f39979e = (byte) (this.f39979e | 4);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.c.AbstractC16578a
        public z33.AbstractC15965f.d.a.c.AbstractC16578a setImportance(int i) {
            this.f39977c = i;
            this.f39979e = (byte) (this.f39979e | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.c.AbstractC16578a
        public z33.AbstractC15965f.d.a.c.AbstractC16578a setPid(int i) {
            this.f39976b = i;
            this.f39979e = (byte) (this.f39979e | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.c.AbstractC16578a
        public z33.AbstractC15965f.d.a.c.AbstractC16578a setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f39975a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a.c)) {
            return false;
        }
        z33.AbstractC15965f.d.a.c cVar = (z33.AbstractC15965f.d.a.c) obj;
        return this.f39971a.equals(cVar.getProcessName()) && this.f39972b == cVar.getPid() && this.f39973c == cVar.getImportance() && this.f39974d == cVar.isDefaultProcess();
    }

    @Override // p000.z33.AbstractC15965f.d.a.c
    public int getImportance() {
        return this.f39973c;
    }

    @Override // p000.z33.AbstractC15965f.d.a.c
    public int getPid() {
        return this.f39972b;
    }

    @Override // p000.z33.AbstractC15965f.d.a.c
    @efb
    public String getProcessName() {
        return this.f39971a;
    }

    public int hashCode() {
        return ((((((this.f39971a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f39972b) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f39973c) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f39974d ? 1231 : 1237);
    }

    @Override // p000.z33.AbstractC15965f.d.a.c
    public boolean isDefaultProcess() {
        return this.f39974d;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f39971a + ", pid=" + this.f39972b + ", importance=" + this.f39973c + ", defaultProcess=" + this.f39974d + "}";
    }

    private gk0(String str, int i, int i2, boolean z) {
        this.f39971a = str;
        this.f39972b = i;
        this.f39973c = i2;
        this.f39974d = z;
    }
}
