package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class wj0 extends z33.AbstractC15965f.a.b {

    /* JADX INFO: renamed from: a */
    public final String f94373a;

    /* JADX INFO: renamed from: wj0$b */
    public static final class C14632b extends z33.AbstractC15965f.a.b.AbstractC16567a {

        /* JADX INFO: renamed from: a */
        public String f94374a;

        @Override // p000.z33.AbstractC15965f.a.b.AbstractC16567a
        public z33.AbstractC15965f.a.b build() {
            String str = this.f94374a;
            if (str != null) {
                return new wj0(str);
            }
            throw new IllegalStateException("Missing required properties: clsId");
        }

        @Override // p000.z33.AbstractC15965f.a.b.AbstractC16567a
        public z33.AbstractC15965f.a.b.AbstractC16567a setClsId(String str) {
            if (str == null) {
                throw new NullPointerException("Null clsId");
            }
            this.f94374a = str;
            return this;
        }

        public C14632b() {
        }

        private C14632b(z33.AbstractC15965f.a.b bVar) {
            this.f94374a = bVar.getClsId();
        }
    }

    @Override // p000.z33.AbstractC15965f.a.b
    /* JADX INFO: renamed from: a */
    public z33.AbstractC15965f.a.b.AbstractC16567a mo24588a() {
        return new C14632b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z33.AbstractC15965f.a.b) {
            return this.f94373a.equals(((z33.AbstractC15965f.a.b) obj).getClsId());
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.a.b
    @efb
    public String getClsId() {
        return this.f94373a;
    }

    public int hashCode() {
        return this.f94373a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "Organization{clsId=" + this.f94373a + "}";
    }

    private wj0(String str) {
        this.f94373a = str;
    }
}
