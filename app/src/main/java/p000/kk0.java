package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class kk0 extends z33.AbstractC15965f.d.e.b {

    /* JADX INFO: renamed from: a */
    public final String f54320a;

    /* JADX INFO: renamed from: b */
    public final String f54321b;

    /* JADX INFO: renamed from: kk0$b */
    public static final class C8401b extends z33.AbstractC15965f.d.e.b.a {

        /* JADX INFO: renamed from: a */
        public String f54322a;

        /* JADX INFO: renamed from: b */
        public String f54323b;

        @Override // p000.z33.AbstractC15965f.d.e.b.a
        public z33.AbstractC15965f.d.e.b build() {
            String str;
            String str2 = this.f54322a;
            if (str2 != null && (str = this.f54323b) != null) {
                return new kk0(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f54322a == null) {
                sb.append(" rolloutId");
            }
            if (this.f54323b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.e.b.a
        public z33.AbstractC15965f.d.e.b.a setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f54322a = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.e.b.a
        public z33.AbstractC15965f.d.e.b.a setVariantId(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f54323b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.e.b)) {
            return false;
        }
        z33.AbstractC15965f.d.e.b bVar = (z33.AbstractC15965f.d.e.b) obj;
        return this.f54320a.equals(bVar.getRolloutId()) && this.f54321b.equals(bVar.getVariantId());
    }

    @Override // p000.z33.AbstractC15965f.d.e.b
    @efb
    public String getRolloutId() {
        return this.f54320a;
    }

    @Override // p000.z33.AbstractC15965f.d.e.b
    @efb
    public String getVariantId() {
        return this.f54321b;
    }

    public int hashCode() {
        return ((this.f54320a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f54321b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f54320a + ", variantId=" + this.f54321b + "}";
    }

    private kk0(String str, String str2) {
        this.f54320a = str;
        this.f54321b = str2;
    }
}
