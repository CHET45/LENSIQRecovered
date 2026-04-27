package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;
import p000.chh;
import p000.p7e;

/* JADX INFO: loaded from: classes4.dex */
public final class dm0 extends chh {

    /* JADX INFO: renamed from: a */
    public final String f30025a;

    /* JADX INFO: renamed from: b */
    public final byte[] f30026b;

    /* JADX INFO: renamed from: c */
    public final acd f30027c;

    /* JADX INFO: renamed from: dm0$b */
    public static final class C4856b extends chh.AbstractC2316a {

        /* JADX INFO: renamed from: a */
        public String f30028a;

        /* JADX INFO: renamed from: b */
        public byte[] f30029b;

        /* JADX INFO: renamed from: c */
        public acd f30030c;

        @Override // p000.chh.AbstractC2316a
        public chh build() {
            String str = "";
            if (this.f30028a == null) {
                str = " backendName";
            }
            if (this.f30030c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new dm0(this.f30028a, this.f30029b, this.f30030c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.chh.AbstractC2316a
        public chh.AbstractC2316a setBackendName(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f30028a = str;
            return this;
        }

        @Override // p000.chh.AbstractC2316a
        public chh.AbstractC2316a setExtras(@hib byte[] bArr) {
            this.f30029b = bArr;
            return this;
        }

        @Override // p000.chh.AbstractC2316a
        public chh.AbstractC2316a setPriority(acd acdVar) {
            if (acdVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f30030c = acdVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof chh)) {
            return false;
        }
        chh chhVar = (chh) obj;
        if (this.f30025a.equals(chhVar.getBackendName())) {
            if (Arrays.equals(this.f30026b, chhVar instanceof dm0 ? ((dm0) chhVar).f30026b : chhVar.getExtras()) && this.f30027c.equals(chhVar.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.chh
    public String getBackendName() {
        return this.f30025a;
    }

    @Override // p000.chh
    @hib
    public byte[] getExtras() {
        return this.f30026b;
    }

    @Override // p000.chh
    @p7e({p7e.EnumC10826a.f69935b})
    public acd getPriority() {
        return this.f30027c;
    }

    public int hashCode() {
        return ((((this.f30025a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f30026b)) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f30027c.hashCode();
    }

    private dm0(String str, @hib byte[] bArr, acd acdVar) {
        this.f30025a = str;
        this.f30026b = bArr;
        this.f30027c = acdVar;
    }
}
