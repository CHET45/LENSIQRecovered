package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class jk0 extends z33.AbstractC15965f.d.e {

    /* JADX INFO: renamed from: a */
    public final z33.AbstractC15965f.d.e.b f50737a;

    /* JADX INFO: renamed from: b */
    public final String f50738b;

    /* JADX INFO: renamed from: c */
    public final String f50739c;

    /* JADX INFO: renamed from: d */
    public final long f50740d;

    /* JADX INFO: renamed from: jk0$b */
    public static final class C7925b extends z33.AbstractC15965f.d.e.a {

        /* JADX INFO: renamed from: a */
        public z33.AbstractC15965f.d.e.b f50741a;

        /* JADX INFO: renamed from: b */
        public String f50742b;

        /* JADX INFO: renamed from: c */
        public String f50743c;

        /* JADX INFO: renamed from: d */
        public long f50744d;

        /* JADX INFO: renamed from: e */
        public byte f50745e;

        @Override // p000.z33.AbstractC15965f.d.e.a
        public z33.AbstractC15965f.d.e build() {
            z33.AbstractC15965f.d.e.b bVar;
            String str;
            String str2;
            if (this.f50745e == 1 && (bVar = this.f50741a) != null && (str = this.f50742b) != null && (str2 = this.f50743c) != null) {
                return new jk0(bVar, str, str2, this.f50744d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f50741a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f50742b == null) {
                sb.append(" parameterKey");
            }
            if (this.f50743c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f50745e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.e.a
        public z33.AbstractC15965f.d.e.a setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f50742b = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.e.a
        public z33.AbstractC15965f.d.e.a setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f50743c = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.e.a
        public z33.AbstractC15965f.d.e.a setRolloutVariant(z33.AbstractC15965f.d.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f50741a = bVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.e.a
        public z33.AbstractC15965f.d.e.a setTemplateVersion(long j) {
            this.f50744d = j;
            this.f50745e = (byte) (this.f50745e | 1);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.e)) {
            return false;
        }
        z33.AbstractC15965f.d.e eVar = (z33.AbstractC15965f.d.e) obj;
        return this.f50737a.equals(eVar.getRolloutVariant()) && this.f50738b.equals(eVar.getParameterKey()) && this.f50739c.equals(eVar.getParameterValue()) && this.f50740d == eVar.getTemplateVersion();
    }

    @Override // p000.z33.AbstractC15965f.d.e
    @efb
    public String getParameterKey() {
        return this.f50738b;
    }

    @Override // p000.z33.AbstractC15965f.d.e
    @efb
    public String getParameterValue() {
        return this.f50739c;
    }

    @Override // p000.z33.AbstractC15965f.d.e
    @efb
    public z33.AbstractC15965f.d.e.b getRolloutVariant() {
        return this.f50737a;
    }

    @Override // p000.z33.AbstractC15965f.d.e
    @efb
    public long getTemplateVersion() {
        return this.f50740d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f50737a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f50738b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f50739c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f50740d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f50737a + ", parameterKey=" + this.f50738b + ", parameterValue=" + this.f50739c + ", templateVersion=" + this.f50740d + "}";
    }

    private jk0(z33.AbstractC15965f.d.e.b bVar, String str, String str2, long j) {
        this.f50737a = bVar;
        this.f50738b = str;
        this.f50739c = str2;
        this.f50740d = j;
    }
}
