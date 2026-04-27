package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class rj0 extends z33.AbstractC15963d {

    /* JADX INFO: renamed from: a */
    public final String f78411a;

    /* JADX INFO: renamed from: b */
    public final String f78412b;

    /* JADX INFO: renamed from: rj0$b */
    public static final class C12110b extends z33.AbstractC15963d.a {

        /* JADX INFO: renamed from: a */
        public String f78413a;

        /* JADX INFO: renamed from: b */
        public String f78414b;

        @Override // p000.z33.AbstractC15963d.a
        public z33.AbstractC15963d build() {
            String str;
            String str2 = this.f78413a;
            if (str2 != null && (str = this.f78414b) != null) {
                return new rj0(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f78413a == null) {
                sb.append(" key");
            }
            if (this.f78414b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15963d.a
        public z33.AbstractC15963d.a setKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f78413a = str;
            return this;
        }

        @Override // p000.z33.AbstractC15963d.a
        public z33.AbstractC15963d.a setValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f78414b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15963d)) {
            return false;
        }
        z33.AbstractC15963d abstractC15963d = (z33.AbstractC15963d) obj;
        return this.f78411a.equals(abstractC15963d.getKey()) && this.f78412b.equals(abstractC15963d.getValue());
    }

    @Override // p000.z33.AbstractC15963d
    @efb
    public String getKey() {
        return this.f78411a;
    }

    @Override // p000.z33.AbstractC15963d
    @efb
    public String getValue() {
        return this.f78412b;
    }

    public int hashCode() {
        return ((this.f78411a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f78412b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f78411a + ", value=" + this.f78412b + "}";
    }

    private rj0(String str, String str2) {
        this.f78411a = str;
        this.f78412b = str2;
    }
}
