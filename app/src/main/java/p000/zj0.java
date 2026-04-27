package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class zj0 extends z33.AbstractC15965f.d.a {

    /* JADX INFO: renamed from: a */
    public final z33.AbstractC15965f.d.a.b f105209a;

    /* JADX INFO: renamed from: b */
    public final List<z33.AbstractC15963d> f105210b;

    /* JADX INFO: renamed from: c */
    public final List<z33.AbstractC15963d> f105211c;

    /* JADX INFO: renamed from: d */
    public final Boolean f105212d;

    /* JADX INFO: renamed from: e */
    public final z33.AbstractC15965f.d.a.c f105213e;

    /* JADX INFO: renamed from: f */
    public final List<z33.AbstractC15965f.d.a.c> f105214f;

    /* JADX INFO: renamed from: g */
    public final int f105215g;

    /* JADX INFO: renamed from: zj0$b */
    public static final class C16157b extends z33.AbstractC15965f.d.a.AbstractC16568a {

        /* JADX INFO: renamed from: a */
        public z33.AbstractC15965f.d.a.b f105216a;

        /* JADX INFO: renamed from: b */
        public List<z33.AbstractC15963d> f105217b;

        /* JADX INFO: renamed from: c */
        public List<z33.AbstractC15963d> f105218c;

        /* JADX INFO: renamed from: d */
        public Boolean f105219d;

        /* JADX INFO: renamed from: e */
        public z33.AbstractC15965f.d.a.c f105220e;

        /* JADX INFO: renamed from: f */
        public List<z33.AbstractC15965f.d.a.c> f105221f;

        /* JADX INFO: renamed from: g */
        public int f105222g;

        /* JADX INFO: renamed from: h */
        public byte f105223h;

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a build() {
            z33.AbstractC15965f.d.a.b bVar;
            if (this.f105223h == 1 && (bVar = this.f105216a) != null) {
                return new zj0(bVar, this.f105217b, this.f105218c, this.f105219d, this.f105220e, this.f105221f, this.f105222g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f105216a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f105223h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a.AbstractC16568a setAppProcessDetails(@hib List<z33.AbstractC15965f.d.a.c> list) {
            this.f105221f = list;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a.AbstractC16568a setBackground(@hib Boolean bool) {
            this.f105219d = bool;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a.AbstractC16568a setCurrentProcessDetails(@hib z33.AbstractC15965f.d.a.c cVar) {
            this.f105220e = cVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a.AbstractC16568a setCustomAttributes(List<z33.AbstractC15963d> list) {
            this.f105217b = list;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a.AbstractC16568a setExecution(z33.AbstractC15965f.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f105216a = bVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a.AbstractC16568a setInternalKeys(List<z33.AbstractC15963d> list) {
            this.f105218c = list;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.AbstractC16568a
        public z33.AbstractC15965f.d.a.AbstractC16568a setUiOrientation(int i) {
            this.f105222g = i;
            this.f105223h = (byte) (this.f105223h | 1);
            return this;
        }

        public C16157b() {
        }

        private C16157b(z33.AbstractC15965f.d.a aVar) {
            this.f105216a = aVar.getExecution();
            this.f105217b = aVar.getCustomAttributes();
            this.f105218c = aVar.getInternalKeys();
            this.f105219d = aVar.getBackground();
            this.f105220e = aVar.getCurrentProcessDetails();
            this.f105221f = aVar.getAppProcessDetails();
            this.f105222g = aVar.getUiOrientation();
            this.f105223h = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        List<z33.AbstractC15963d> list;
        List<z33.AbstractC15963d> list2;
        Boolean bool;
        z33.AbstractC15965f.d.a.c cVar;
        List<z33.AbstractC15965f.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a)) {
            return false;
        }
        z33.AbstractC15965f.d.a aVar = (z33.AbstractC15965f.d.a) obj;
        return this.f105209a.equals(aVar.getExecution()) && ((list = this.f105210b) != null ? list.equals(aVar.getCustomAttributes()) : aVar.getCustomAttributes() == null) && ((list2 = this.f105211c) != null ? list2.equals(aVar.getInternalKeys()) : aVar.getInternalKeys() == null) && ((bool = this.f105212d) != null ? bool.equals(aVar.getBackground()) : aVar.getBackground() == null) && ((cVar = this.f105213e) != null ? cVar.equals(aVar.getCurrentProcessDetails()) : aVar.getCurrentProcessDetails() == null) && ((list3 = this.f105214f) != null ? list3.equals(aVar.getAppProcessDetails()) : aVar.getAppProcessDetails() == null) && this.f105215g == aVar.getUiOrientation();
    }

    @Override // p000.z33.AbstractC15965f.d.a
    @hib
    public List<z33.AbstractC15965f.d.a.c> getAppProcessDetails() {
        return this.f105214f;
    }

    @Override // p000.z33.AbstractC15965f.d.a
    @hib
    public Boolean getBackground() {
        return this.f105212d;
    }

    @Override // p000.z33.AbstractC15965f.d.a
    @hib
    public z33.AbstractC15965f.d.a.c getCurrentProcessDetails() {
        return this.f105213e;
    }

    @Override // p000.z33.AbstractC15965f.d.a
    @hib
    public List<z33.AbstractC15963d> getCustomAttributes() {
        return this.f105210b;
    }

    @Override // p000.z33.AbstractC15965f.d.a
    @efb
    public z33.AbstractC15965f.d.a.b getExecution() {
        return this.f105209a;
    }

    @Override // p000.z33.AbstractC15965f.d.a
    @hib
    public List<z33.AbstractC15963d> getInternalKeys() {
        return this.f105211c;
    }

    @Override // p000.z33.AbstractC15965f.d.a
    public int getUiOrientation() {
        return this.f105215g;
    }

    public int hashCode() {
        int iHashCode = (this.f105209a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        List<z33.AbstractC15963d> list = this.f105210b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        List<z33.AbstractC15963d> list2 = this.f105211c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        Boolean bool = this.f105212d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.d.a.c cVar = this.f105213e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted;
        List<z33.AbstractC15965f.d.a.c> list3 = this.f105214f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f105215g;
    }

    @Override // p000.z33.AbstractC15965f.d.a
    public z33.AbstractC15965f.d.a.AbstractC16568a toBuilder() {
        return new C16157b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f105209a + ", customAttributes=" + this.f105210b + ", internalKeys=" + this.f105211c + ", background=" + this.f105212d + ", currentProcessDetails=" + this.f105213e + ", appProcessDetails=" + this.f105214f + ", uiOrientation=" + this.f105215g + "}";
    }

    private zj0(z33.AbstractC15965f.d.a.b bVar, @hib List<z33.AbstractC15963d> list, @hib List<z33.AbstractC15963d> list2, @hib Boolean bool, @hib z33.AbstractC15965f.d.a.c cVar, @hib List<z33.AbstractC15965f.d.a.c> list3, int i) {
        this.f105209a = bVar;
        this.f105210b = list;
        this.f105211c = list2;
        this.f105212d = bool;
        this.f105213e = cVar;
        this.f105214f = list3;
        this.f105215g = i;
    }
}
