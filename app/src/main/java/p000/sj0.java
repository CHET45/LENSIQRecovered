package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class sj0 extends z33.AbstractC15964e {

    /* JADX INFO: renamed from: a */
    public final List<z33.AbstractC15964e.b> f81943a;

    /* JADX INFO: renamed from: b */
    public final String f81944b;

    /* JADX INFO: renamed from: sj0$b */
    public static final class C12609b extends z33.AbstractC15964e.a {

        /* JADX INFO: renamed from: a */
        public List<z33.AbstractC15964e.b> f81945a;

        /* JADX INFO: renamed from: b */
        public String f81946b;

        @Override // p000.z33.AbstractC15964e.a
        public z33.AbstractC15964e build() {
            List<z33.AbstractC15964e.b> list = this.f81945a;
            if (list != null) {
                return new sj0(list, this.f81946b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // p000.z33.AbstractC15964e.a
        public z33.AbstractC15964e.a setFiles(List<z33.AbstractC15964e.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f81945a = list;
            return this;
        }

        @Override // p000.z33.AbstractC15964e.a
        public z33.AbstractC15964e.a setOrgId(String str) {
            this.f81946b = str;
            return this;
        }

        public C12609b() {
        }

        private C12609b(z33.AbstractC15964e abstractC15964e) {
            this.f81945a = abstractC15964e.getFiles();
            this.f81946b = abstractC15964e.getOrgId();
        }
    }

    @Override // p000.z33.AbstractC15964e
    /* JADX INFO: renamed from: a */
    public z33.AbstractC15964e.a mo22023a() {
        return new C12609b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15964e)) {
            return false;
        }
        z33.AbstractC15964e abstractC15964e = (z33.AbstractC15964e) obj;
        if (this.f81943a.equals(abstractC15964e.getFiles())) {
            String str = this.f81944b;
            if (str == null) {
                if (abstractC15964e.getOrgId() == null) {
                    return true;
                }
            } else if (str.equals(abstractC15964e.getOrgId())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15964e
    @efb
    public List<z33.AbstractC15964e.b> getFiles() {
        return this.f81943a;
    }

    @Override // p000.z33.AbstractC15964e
    @hib
    public String getOrgId() {
        return this.f81944b;
    }

    public int hashCode() {
        int iHashCode = (this.f81943a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f81944b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f81943a + ", orgId=" + this.f81944b + "}";
    }

    private sj0(List<z33.AbstractC15964e.b> list, @hib String str) {
        this.f81943a = list;
        this.f81944b = str;
    }
}
