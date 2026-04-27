package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class qj0 extends z33.AbstractC15960a.a {

    /* JADX INFO: renamed from: a */
    public final String f74557a;

    /* JADX INFO: renamed from: b */
    public final String f74558b;

    /* JADX INFO: renamed from: c */
    public final String f74559c;

    /* JADX INFO: renamed from: qj0$b */
    public static final class C11489b extends z33.AbstractC15960a.a.AbstractC16565a {

        /* JADX INFO: renamed from: a */
        public String f74560a;

        /* JADX INFO: renamed from: b */
        public String f74561b;

        /* JADX INFO: renamed from: c */
        public String f74562c;

        @Override // p000.z33.AbstractC15960a.a.AbstractC16565a
        public z33.AbstractC15960a.a build() {
            String str;
            String str2;
            String str3 = this.f74560a;
            if (str3 != null && (str = this.f74561b) != null && (str2 = this.f74562c) != null) {
                return new qj0(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f74560a == null) {
                sb.append(" arch");
            }
            if (this.f74561b == null) {
                sb.append(" libraryName");
            }
            if (this.f74562c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15960a.a.AbstractC16565a
        public z33.AbstractC15960a.a.AbstractC16565a setArch(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f74560a = str;
            return this;
        }

        @Override // p000.z33.AbstractC15960a.a.AbstractC16565a
        public z33.AbstractC15960a.a.AbstractC16565a setBuildId(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f74562c = str;
            return this;
        }

        @Override // p000.z33.AbstractC15960a.a.AbstractC16565a
        public z33.AbstractC15960a.a.AbstractC16565a setLibraryName(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f74561b = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15960a.a)) {
            return false;
        }
        z33.AbstractC15960a.a aVar = (z33.AbstractC15960a.a) obj;
        return this.f74557a.equals(aVar.getArch()) && this.f74558b.equals(aVar.getLibraryName()) && this.f74559c.equals(aVar.getBuildId());
    }

    @Override // p000.z33.AbstractC15960a.a
    @efb
    public String getArch() {
        return this.f74557a;
    }

    @Override // p000.z33.AbstractC15960a.a
    @efb
    public String getBuildId() {
        return this.f74559c;
    }

    @Override // p000.z33.AbstractC15960a.a
    @efb
    public String getLibraryName() {
        return this.f74558b;
    }

    public int hashCode() {
        return ((((this.f74557a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f74558b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f74559c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f74557a + ", libraryName=" + this.f74558b + ", buildId=" + this.f74559c + "}";
    }

    private qj0(String str, String str2, String str3) {
        this.f74557a = str;
        this.f74558b = str2;
        this.f74559c = str3;
    }
}
