package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.oye;

/* JADX INFO: loaded from: classes4.dex */
public final class ul0 extends oye {

    /* JADX INFO: renamed from: a */
    public final chh f88269a;

    /* JADX INFO: renamed from: b */
    public final String f88270b;

    /* JADX INFO: renamed from: c */
    public final p55<?> f88271c;

    /* JADX INFO: renamed from: d */
    public final leh<?, byte[]> f88272d;

    /* JADX INFO: renamed from: e */
    public final q15 f88273e;

    /* JADX INFO: renamed from: ul0$b */
    public static final class C13570b extends oye.AbstractC10720a {

        /* JADX INFO: renamed from: a */
        public chh f88274a;

        /* JADX INFO: renamed from: b */
        public String f88275b;

        /* JADX INFO: renamed from: c */
        public p55<?> f88276c;

        /* JADX INFO: renamed from: d */
        public leh<?, byte[]> f88277d;

        /* JADX INFO: renamed from: e */
        public q15 f88278e;

        @Override // p000.oye.AbstractC10720a
        /* JADX INFO: renamed from: a */
        public oye.AbstractC10720a mo19101a(q15 q15Var) {
            if (q15Var == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f88278e = q15Var;
            return this;
        }

        @Override // p000.oye.AbstractC10720a
        /* JADX INFO: renamed from: b */
        public oye.AbstractC10720a mo19102b(p55<?> p55Var) {
            if (p55Var == null) {
                throw new NullPointerException("Null event");
            }
            this.f88276c = p55Var;
            return this;
        }

        @Override // p000.oye.AbstractC10720a
        public oye build() {
            String str = "";
            if (this.f88274a == null) {
                str = " transportContext";
            }
            if (this.f88275b == null) {
                str = str + " transportName";
            }
            if (this.f88276c == null) {
                str = str + " event";
            }
            if (this.f88277d == null) {
                str = str + " transformer";
            }
            if (this.f88278e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new ul0(this.f88274a, this.f88275b, this.f88276c, this.f88277d, this.f88278e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.oye.AbstractC10720a
        /* JADX INFO: renamed from: c */
        public oye.AbstractC10720a mo19103c(leh<?, byte[]> lehVar) {
            if (lehVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f88277d = lehVar;
            return this;
        }

        @Override // p000.oye.AbstractC10720a
        public oye.AbstractC10720a setTransportContext(chh chhVar) {
            if (chhVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f88274a = chhVar;
            return this;
        }

        @Override // p000.oye.AbstractC10720a
        public oye.AbstractC10720a setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f88275b = str;
            return this;
        }
    }

    @Override // p000.oye
    /* JADX INFO: renamed from: a */
    public p55<?> mo19099a() {
        return this.f88271c;
    }

    @Override // p000.oye
    /* JADX INFO: renamed from: b */
    public leh<?, byte[]> mo19100b() {
        return this.f88272d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oye)) {
            return false;
        }
        oye oyeVar = (oye) obj;
        return this.f88269a.equals(oyeVar.getTransportContext()) && this.f88270b.equals(oyeVar.getTransportName()) && this.f88271c.equals(oyeVar.mo19099a()) && this.f88272d.equals(oyeVar.mo19100b()) && this.f88273e.equals(oyeVar.getEncoding());
    }

    @Override // p000.oye
    public q15 getEncoding() {
        return this.f88273e;
    }

    @Override // p000.oye
    public chh getTransportContext() {
        return this.f88269a;
    }

    @Override // p000.oye
    public String getTransportName() {
        return this.f88270b;
    }

    public int hashCode() {
        return ((((((((this.f88269a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f88270b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f88271c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f88272d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f88273e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f88269a + ", transportName=" + this.f88270b + ", event=" + this.f88271c + ", transformer=" + this.f88272d + ", encoding=" + this.f88273e + "}";
    }

    private ul0(chh chhVar, String str, p55<?> p55Var, leh<?, byte[]> lehVar, q15 q15Var) {
        this.f88269a = chhVar;
        this.f88270b = str;
        this.f88271c = p55Var;
        this.f88272d = lehVar;
        this.f88273e = q15Var;
    }
}
