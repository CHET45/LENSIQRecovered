package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.nae;

/* JADX INFO: loaded from: classes5.dex */
public final class ol0 extends nae {

    /* JADX INFO: renamed from: g */
    public final String f67974g;

    /* JADX INFO: renamed from: h */
    public final String f67975h;

    /* JADX INFO: renamed from: i */
    public final String f67976i;

    /* JADX INFO: renamed from: j */
    public final String f67977j;

    /* JADX INFO: renamed from: k */
    public final long f67978k;

    /* JADX INFO: renamed from: ol0$b */
    public static final class C10446b extends nae.AbstractC9767a {

        /* JADX INFO: renamed from: a */
        public String f67979a;

        /* JADX INFO: renamed from: b */
        public String f67980b;

        /* JADX INFO: renamed from: c */
        public String f67981c;

        /* JADX INFO: renamed from: d */
        public String f67982d;

        /* JADX INFO: renamed from: e */
        public long f67983e;

        /* JADX INFO: renamed from: f */
        public byte f67984f;

        @Override // p000.nae.AbstractC9767a
        public nae build() {
            if (this.f67984f == 1 && this.f67979a != null && this.f67980b != null && this.f67981c != null && this.f67982d != null) {
                return new ol0(this.f67979a, this.f67980b, this.f67981c, this.f67982d, this.f67983e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f67979a == null) {
                sb.append(" rolloutId");
            }
            if (this.f67980b == null) {
                sb.append(" variantId");
            }
            if (this.f67981c == null) {
                sb.append(" parameterKey");
            }
            if (this.f67982d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f67984f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.nae.AbstractC9767a
        public nae.AbstractC9767a setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f67981c = str;
            return this;
        }

        @Override // p000.nae.AbstractC9767a
        public nae.AbstractC9767a setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f67982d = str;
            return this;
        }

        @Override // p000.nae.AbstractC9767a
        public nae.AbstractC9767a setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f67979a = str;
            return this;
        }

        @Override // p000.nae.AbstractC9767a
        public nae.AbstractC9767a setTemplateVersion(long j) {
            this.f67983e = j;
            this.f67984f = (byte) (this.f67984f | 1);
            return this;
        }

        @Override // p000.nae.AbstractC9767a
        public nae.AbstractC9767a setVariantId(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f67980b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nae)) {
            return false;
        }
        nae naeVar = (nae) obj;
        return this.f67974g.equals(naeVar.getRolloutId()) && this.f67975h.equals(naeVar.getVariantId()) && this.f67976i.equals(naeVar.getParameterKey()) && this.f67977j.equals(naeVar.getParameterValue()) && this.f67978k == naeVar.getTemplateVersion();
    }

    @Override // p000.nae
    @efb
    public String getParameterKey() {
        return this.f67976i;
    }

    @Override // p000.nae
    @efb
    public String getParameterValue() {
        return this.f67977j;
    }

    @Override // p000.nae
    @efb
    public String getRolloutId() {
        return this.f67974g;
    }

    @Override // p000.nae
    public long getTemplateVersion() {
        return this.f67978k;
    }

    @Override // p000.nae
    @efb
    public String getVariantId() {
        return this.f67975h;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f67974g.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67975h.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67976i.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67977j.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        long j = this.f67978k;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f67974g + ", variantId=" + this.f67975h + ", parameterKey=" + this.f67976i + ", parameterValue=" + this.f67977j + ", templateVersion=" + this.f67978k + "}";
    }

    private ol0(String str, String str2, String str3, String str4, long j) {
        this.f67974g = str;
        this.f67975h = str2;
        this.f67976i = str3;
        this.f67977j = str4;
        this.f67978k = j;
    }
}
