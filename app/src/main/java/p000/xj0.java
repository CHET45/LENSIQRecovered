package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class xj0 extends z33.AbstractC15965f.c {

    /* JADX INFO: renamed from: a */
    public final int f98135a;

    /* JADX INFO: renamed from: b */
    public final String f98136b;

    /* JADX INFO: renamed from: c */
    public final int f98137c;

    /* JADX INFO: renamed from: d */
    public final long f98138d;

    /* JADX INFO: renamed from: e */
    public final long f98139e;

    /* JADX INFO: renamed from: f */
    public final boolean f98140f;

    /* JADX INFO: renamed from: g */
    public final int f98141g;

    /* JADX INFO: renamed from: h */
    public final String f98142h;

    /* JADX INFO: renamed from: i */
    public final String f98143i;

    /* JADX INFO: renamed from: xj0$b */
    public static final class C15147b extends z33.AbstractC15965f.c.a {

        /* JADX INFO: renamed from: a */
        public int f98144a;

        /* JADX INFO: renamed from: b */
        public String f98145b;

        /* JADX INFO: renamed from: c */
        public int f98146c;

        /* JADX INFO: renamed from: d */
        public long f98147d;

        /* JADX INFO: renamed from: e */
        public long f98148e;

        /* JADX INFO: renamed from: f */
        public boolean f98149f;

        /* JADX INFO: renamed from: g */
        public int f98150g;

        /* JADX INFO: renamed from: h */
        public String f98151h;

        /* JADX INFO: renamed from: i */
        public String f98152i;

        /* JADX INFO: renamed from: j */
        public byte f98153j;

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c build() {
            String str;
            String str2;
            String str3;
            if (this.f98153j == 63 && (str = this.f98145b) != null && (str2 = this.f98151h) != null && (str3 = this.f98152i) != null) {
                return new xj0(this.f98144a, str, this.f98146c, this.f98147d, this.f98148e, this.f98149f, this.f98150g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f98153j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f98145b == null) {
                sb.append(" model");
            }
            if ((this.f98153j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f98153j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f98153j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f98153j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f98153j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f98151h == null) {
                sb.append(" manufacturer");
            }
            if (this.f98152i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setArch(int i) {
            this.f98144a = i;
            this.f98153j = (byte) (this.f98153j | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setCores(int i) {
            this.f98146c = i;
            this.f98153j = (byte) (this.f98153j | 2);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setDiskSpace(long j) {
            this.f98148e = j;
            this.f98153j = (byte) (this.f98153j | 8);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setManufacturer(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f98151h = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setModel(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f98145b = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setModelClass(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f98152i = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setRam(long j) {
            this.f98147d = j;
            this.f98153j = (byte) (this.f98153j | 4);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setSimulator(boolean z) {
            this.f98149f = z;
            this.f98153j = (byte) (this.f98153j | 16);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.c.a
        public z33.AbstractC15965f.c.a setState(int i) {
            this.f98150g = i;
            this.f98153j = (byte) (this.f98153j | 32);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.c)) {
            return false;
        }
        z33.AbstractC15965f.c cVar = (z33.AbstractC15965f.c) obj;
        return this.f98135a == cVar.getArch() && this.f98136b.equals(cVar.getModel()) && this.f98137c == cVar.getCores() && this.f98138d == cVar.getRam() && this.f98139e == cVar.getDiskSpace() && this.f98140f == cVar.isSimulator() && this.f98141g == cVar.getState() && this.f98142h.equals(cVar.getManufacturer()) && this.f98143i.equals(cVar.getModelClass());
    }

    @Override // p000.z33.AbstractC15965f.c
    @efb
    public int getArch() {
        return this.f98135a;
    }

    @Override // p000.z33.AbstractC15965f.c
    public int getCores() {
        return this.f98137c;
    }

    @Override // p000.z33.AbstractC15965f.c
    public long getDiskSpace() {
        return this.f98139e;
    }

    @Override // p000.z33.AbstractC15965f.c
    @efb
    public String getManufacturer() {
        return this.f98142h;
    }

    @Override // p000.z33.AbstractC15965f.c
    @efb
    public String getModel() {
        return this.f98136b;
    }

    @Override // p000.z33.AbstractC15965f.c
    @efb
    public String getModelClass() {
        return this.f98143i;
    }

    @Override // p000.z33.AbstractC15965f.c
    public long getRam() {
        return this.f98138d;
    }

    @Override // p000.z33.AbstractC15965f.c
    public int getState() {
        return this.f98141g;
    }

    public int hashCode() {
        int iHashCode = (((((this.f98135a ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98136b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98137c) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f98138d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j2 = this.f98139e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ (this.f98140f ? 1231 : 1237)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98141g) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98142h.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98143i.hashCode();
    }

    @Override // p000.z33.AbstractC15965f.c
    public boolean isSimulator() {
        return this.f98140f;
    }

    public String toString() {
        return "Device{arch=" + this.f98135a + ", model=" + this.f98136b + ", cores=" + this.f98137c + ", ram=" + this.f98138d + ", diskSpace=" + this.f98139e + ", simulator=" + this.f98140f + ", state=" + this.f98141g + ", manufacturer=" + this.f98142h + ", modelClass=" + this.f98143i + "}";
    }

    private xj0(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f98135a = i;
        this.f98136b = str;
        this.f98137c = i2;
        this.f98138d = j;
        this.f98139e = j2;
        this.f98140f = z;
        this.f98141g = i3;
        this.f98142h = str2;
        this.f98143i = str3;
    }
}
