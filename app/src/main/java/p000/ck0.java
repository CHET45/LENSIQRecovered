package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class ck0 extends z33.AbstractC15965f.d.a.b.c {

    /* JADX INFO: renamed from: a */
    public final String f16784a;

    /* JADX INFO: renamed from: b */
    public final String f16785b;

    /* JADX INFO: renamed from: c */
    public final List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> f16786c;

    /* JADX INFO: renamed from: d */
    public final z33.AbstractC15965f.d.a.b.c f16787d;

    /* JADX INFO: renamed from: e */
    public final int f16788e;

    /* JADX INFO: renamed from: ck0$b */
    public static final class C2339b extends z33.AbstractC15965f.d.a.b.c.AbstractC16572a {

        /* JADX INFO: renamed from: a */
        public String f16789a;

        /* JADX INFO: renamed from: b */
        public String f16790b;

        /* JADX INFO: renamed from: c */
        public List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> f16791c;

        /* JADX INFO: renamed from: d */
        public z33.AbstractC15965f.d.a.b.c f16792d;

        /* JADX INFO: renamed from: e */
        public int f16793e;

        /* JADX INFO: renamed from: f */
        public byte f16794f;

        @Override // p000.z33.AbstractC15965f.d.a.b.c.AbstractC16572a
        public z33.AbstractC15965f.d.a.b.c build() {
            String str;
            List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> list;
            if (this.f16794f == 1 && (str = this.f16789a) != null && (list = this.f16791c) != null) {
                return new ck0(str, this.f16790b, list, this.f16792d, this.f16793e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f16789a == null) {
                sb.append(" type");
            }
            if (this.f16791c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f16794f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.c.AbstractC16572a
        public z33.AbstractC15965f.d.a.b.c.AbstractC16572a setCausedBy(z33.AbstractC15965f.d.a.b.c cVar) {
            this.f16792d = cVar;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.c.AbstractC16572a
        public z33.AbstractC15965f.d.a.b.c.AbstractC16572a setFrames(List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f16791c = list;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.c.AbstractC16572a
        public z33.AbstractC15965f.d.a.b.c.AbstractC16572a setOverflowCount(int i) {
            this.f16793e = i;
            this.f16794f = (byte) (this.f16794f | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.c.AbstractC16572a
        public z33.AbstractC15965f.d.a.b.c.AbstractC16572a setReason(String str) {
            this.f16790b = str;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.c.AbstractC16572a
        public z33.AbstractC15965f.d.a.b.c.AbstractC16572a setType(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f16789a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        z33.AbstractC15965f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a.b.c)) {
            return false;
        }
        z33.AbstractC15965f.d.a.b.c cVar2 = (z33.AbstractC15965f.d.a.b.c) obj;
        return this.f16784a.equals(cVar2.getType()) && ((str = this.f16785b) != null ? str.equals(cVar2.getReason()) : cVar2.getReason() == null) && this.f16786c.equals(cVar2.getFrames()) && ((cVar = this.f16787d) != null ? cVar.equals(cVar2.getCausedBy()) : cVar2.getCausedBy() == null) && this.f16788e == cVar2.getOverflowCount();
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.c
    @hib
    public z33.AbstractC15965f.d.a.b.c getCausedBy() {
        return this.f16787d;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.c
    @efb
    public List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> getFrames() {
        return this.f16786c;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.c
    public int getOverflowCount() {
        return this.f16788e;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.c
    @hib
    public String getReason() {
        return this.f16785b;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.c
    @efb
    public String getType() {
        return this.f16784a;
    }

    public int hashCode() {
        int iHashCode = (this.f16784a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted;
        String str = this.f16785b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f16786c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted;
        z33.AbstractC15965f.d.a.b.c cVar = this.f16787d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f16788e;
    }

    public String toString() {
        return "Exception{type=" + this.f16784a + ", reason=" + this.f16785b + ", frames=" + this.f16786c + ", causedBy=" + this.f16787d + ", overflowCount=" + this.f16788e + "}";
    }

    private ck0(String str, @hib String str2, List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> list, @hib z33.AbstractC15965f.d.a.b.c cVar, int i) {
        this.f16784a = str;
        this.f16785b = str2;
        this.f16786c = list;
        this.f16787d = cVar;
        this.f16788e = i;
    }
}
