package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class ak0 extends z33.AbstractC15965f.d.a.b {

    /* JADX INFO: renamed from: a */
    public final List<z33.AbstractC15965f.d.a.b.e> f1780a;

    /* JADX INFO: renamed from: b */
    public final z33.AbstractC15965f.d.a.b.c f1781b;

    /* JADX INFO: renamed from: c */
    public final z33.AbstractC15960a f1782c;

    /* JADX INFO: renamed from: d */
    public final z33.AbstractC15965f.d.a.b.AbstractC16573d f1783d;

    /* JADX INFO: renamed from: e */
    public final List<z33.AbstractC15965f.d.a.b.AbstractC16569a> f1784e;

    /* JADX INFO: renamed from: ak0$b */
    public static final class C0296b extends z33.AbstractC15965f.d.a.b.AbstractC16571b {

        /* JADX INFO: renamed from: a */
        public List<z33.AbstractC15965f.d.a.b.e> f1785a;

        /* JADX INFO: renamed from: b */
        public z33.AbstractC15965f.d.a.b.c f1786b;

        /* JADX INFO: renamed from: c */
        public z33.AbstractC15960a f1787c;

        /* JADX INFO: renamed from: d */
        public z33.AbstractC15965f.d.a.b.AbstractC16573d f1788d;

        /* JADX INFO: renamed from: e */
        public List<z33.AbstractC15965f.d.a.b.AbstractC16569a> f1789e;

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16571b
        public z33.AbstractC15965f.d.a.b build() {
            List<z33.AbstractC15965f.d.a.b.AbstractC16569a> list;
            z33.AbstractC15965f.d.a.b.AbstractC16573d abstractC16573d = this.f1788d;
            if (abstractC16573d != null && (list = this.f1789e) != null) {
                return new ak0(this.f1785a, this.f1786b, this.f1787c, abstractC16573d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1788d == null) {
                sb.append(" signal");
            }
            if (this.f1789e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16571b
        public z33.AbstractC15965f.d.a.b.AbstractC16571b setAppExitInfo(z33.AbstractC15960a abstractC15960a) {
            this.f1787c = abstractC15960a;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16571b
        public z33.AbstractC15965f.d.a.b.AbstractC16571b setBinaries(List<z33.AbstractC15965f.d.a.b.AbstractC16569a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f1789e = list;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16571b
        public z33.AbstractC15965f.d.a.b.AbstractC16571b setException(z33.AbstractC15965f.d.a.b.c cVar) {
            this.f1786b = cVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16571b
        public z33.AbstractC15965f.d.a.b.AbstractC16571b setSignal(z33.AbstractC15965f.d.a.b.AbstractC16573d abstractC16573d) {
            if (abstractC16573d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f1788d = abstractC16573d;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.AbstractC16571b
        public z33.AbstractC15965f.d.a.b.AbstractC16571b setThreads(List<z33.AbstractC15965f.d.a.b.e> list) {
            this.f1785a = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a.b)) {
            return false;
        }
        z33.AbstractC15965f.d.a.b bVar = (z33.AbstractC15965f.d.a.b) obj;
        List<z33.AbstractC15965f.d.a.b.e> list = this.f1780a;
        if (list != null ? list.equals(bVar.getThreads()) : bVar.getThreads() == null) {
            z33.AbstractC15965f.d.a.b.c cVar = this.f1781b;
            if (cVar != null ? cVar.equals(bVar.getException()) : bVar.getException() == null) {
                z33.AbstractC15960a abstractC15960a = this.f1782c;
                if (abstractC15960a != null ? abstractC15960a.equals(bVar.getAppExitInfo()) : bVar.getAppExitInfo() == null) {
                    if (this.f1783d.equals(bVar.getSignal()) && this.f1784e.equals(bVar.getBinaries())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b
    @hib
    public z33.AbstractC15960a getAppExitInfo() {
        return this.f1782c;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b
    @efb
    public List<z33.AbstractC15965f.d.a.b.AbstractC16569a> getBinaries() {
        return this.f1784e;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b
    @hib
    public z33.AbstractC15965f.d.a.b.c getException() {
        return this.f1781b;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b
    @efb
    public z33.AbstractC15965f.d.a.b.AbstractC16573d getSignal() {
        return this.f1783d;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b
    @hib
    public List<z33.AbstractC15965f.d.a.b.e> getThreads() {
        return this.f1780a;
    }

    public int hashCode() {
        List<z33.AbstractC15965f.d.a.b.e> list = this.f1780a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.d.a.b.c cVar = this.f1781b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15960a abstractC15960a = this.f1782c;
        return ((((iHashCode2 ^ (abstractC15960a != null ? abstractC15960a.hashCode() : 0)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f1783d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f1784e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f1780a + ", exception=" + this.f1781b + ", appExitInfo=" + this.f1782c + ", signal=" + this.f1783d + ", binaries=" + this.f1784e + "}";
    }

    private ak0(@hib List<z33.AbstractC15965f.d.a.b.e> list, @hib z33.AbstractC15965f.d.a.b.c cVar, @hib z33.AbstractC15960a abstractC15960a, z33.AbstractC15965f.d.a.b.AbstractC16573d abstractC16573d, List<z33.AbstractC15965f.d.a.b.AbstractC16569a> list2) {
        this.f1780a = list;
        this.f1781b = cVar;
        this.f1782c = abstractC15960a;
        this.f1783d = abstractC16573d;
        this.f1784e = list2;
    }
}
