package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.c15;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class lk0 extends z33.AbstractC15965f.d.f {

    /* JADX INFO: renamed from: a */
    public final List<z33.AbstractC15965f.d.e> f57749a;

    /* JADX INFO: renamed from: lk0$b */
    public static final class C8842b extends z33.AbstractC15965f.d.f.a {

        /* JADX INFO: renamed from: a */
        public List<z33.AbstractC15965f.d.e> f57750a;

        @Override // p000.z33.AbstractC15965f.d.f.a
        public z33.AbstractC15965f.d.f build() {
            List<z33.AbstractC15965f.d.e> list = this.f57750a;
            if (list != null) {
                return new lk0(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // p000.z33.AbstractC15965f.d.f.a
        public z33.AbstractC15965f.d.f.a setRolloutAssignments(List<z33.AbstractC15965f.d.e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f57750a = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z33.AbstractC15965f.d.f) {
            return this.f57749a.equals(((z33.AbstractC15965f.d.f) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.d.f
    @efb
    @c15.InterfaceC2147a(name = "assignments")
    public List<z33.AbstractC15965f.d.e> getRolloutAssignments() {
        return this.f57749a;
    }

    public int hashCode() {
        return this.f57749a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f57749a + "}";
    }

    private lk0(List<z33.AbstractC15965f.d.e> list) {
        this.f57749a = list;
    }
}
