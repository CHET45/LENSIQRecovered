package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class ik0 extends z33.AbstractC15965f.d.AbstractC16579d {

    /* JADX INFO: renamed from: a */
    public final String f47224a;

    /* JADX INFO: renamed from: ik0$b */
    public static final class C7325b extends z33.AbstractC15965f.d.AbstractC16579d.a {

        /* JADX INFO: renamed from: a */
        public String f47225a;

        @Override // p000.z33.AbstractC15965f.d.AbstractC16579d.a
        public z33.AbstractC15965f.d.AbstractC16579d build() {
            String str = this.f47225a;
            if (str != null) {
                return new ik0(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // p000.z33.AbstractC15965f.d.AbstractC16579d.a
        public z33.AbstractC15965f.d.AbstractC16579d.a setContent(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f47225a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z33.AbstractC15965f.d.AbstractC16579d) {
            return this.f47224a.equals(((z33.AbstractC15965f.d.AbstractC16579d) obj).getContent());
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.d.AbstractC16579d
    @efb
    public String getContent() {
        return this.f47224a;
    }

    public int hashCode() {
        return this.f47224a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "Log{content=" + this.f47224a + "}";
    }

    private ik0(String str) {
        this.f47224a = str;
    }
}
