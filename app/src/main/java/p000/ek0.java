package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class ek0 extends z33.AbstractC15965f.d.a.b.e {

    /* JADX INFO: renamed from: a */
    public final String f33234a;

    /* JADX INFO: renamed from: b */
    public final int f33235b;

    /* JADX INFO: renamed from: c */
    public final List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> f33236c;

    /* JADX INFO: renamed from: ek0$b */
    public static final class C5352b extends z33.AbstractC15965f.d.a.b.e.AbstractC16575a {

        /* JADX INFO: renamed from: a */
        public String f33237a;

        /* JADX INFO: renamed from: b */
        public int f33238b;

        /* JADX INFO: renamed from: c */
        public List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> f33239c;

        /* JADX INFO: renamed from: d */
        public byte f33240d;

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16575a
        public z33.AbstractC15965f.d.a.b.e build() {
            String str;
            List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> list;
            if (this.f33240d == 1 && (str = this.f33237a) != null && (list = this.f33239c) != null) {
                return new ek0(str, this.f33238b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f33237a == null) {
                sb.append(" name");
            }
            if ((1 & this.f33240d) == 0) {
                sb.append(" importance");
            }
            if (this.f33239c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16575a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16575a setFrames(List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f33239c = list;
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16575a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16575a setImportance(int i) {
            this.f33238b = i;
            this.f33240d = (byte) (this.f33240d | 1);
            return this;
        }

        @Override // p000.z33.AbstractC15965f.d.a.b.e.AbstractC16575a
        public z33.AbstractC15965f.d.a.b.e.AbstractC16575a setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f33237a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z33.AbstractC15965f.d.a.b.e)) {
            return false;
        }
        z33.AbstractC15965f.d.a.b.e eVar = (z33.AbstractC15965f.d.a.b.e) obj;
        return this.f33234a.equals(eVar.getName()) && this.f33235b == eVar.getImportance() && this.f33236c.equals(eVar.getFrames());
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e
    @efb
    public List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> getFrames() {
        return this.f33236c;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e
    public int getImportance() {
        return this.f33235b;
    }

    @Override // p000.z33.AbstractC15965f.d.a.b.e
    @efb
    public String getName() {
        return this.f33234a;
    }

    public int hashCode() {
        return ((((this.f33234a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f33235b) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f33236c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f33234a + ", importance=" + this.f33235b + ", frames=" + this.f33236c + "}";
    }

    private ek0(String str, int i, List<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> list) {
        this.f33234a = str;
        this.f33235b = i;
        this.f33236c = list;
    }
}
