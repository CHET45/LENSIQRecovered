package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class nk0 extends z33.AbstractC15965f.f {

    /* JADX INFO: renamed from: a */
    public final String f64789a;

    /* JADX INFO: renamed from: nk0$b */
    public static final class C9912b extends z33.AbstractC15965f.f.a {

        /* JADX INFO: renamed from: a */
        public String f64790a;

        @Override // p000.z33.AbstractC15965f.f.a
        public z33.AbstractC15965f.f build() {
            String str = this.f64790a;
            if (str != null) {
                return new nk0(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // p000.z33.AbstractC15965f.f.a
        public z33.AbstractC15965f.f.a setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f64790a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z33.AbstractC15965f.f) {
            return this.f64789a.equals(((z33.AbstractC15965f.f) obj).getIdentifier());
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.f
    @efb
    public String getIdentifier() {
        return this.f64789a;
    }

    public int hashCode() {
        return this.f64789a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "User{identifier=" + this.f64789a + "}";
    }

    private nk0(String str) {
        this.f64789a = str;
    }
}
