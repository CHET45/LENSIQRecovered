package p000;

import p000.ki7;

/* JADX INFO: loaded from: classes7.dex */
public final class p3e {

    /* JADX INFO: renamed from: a */
    public final so7 f69580a;

    /* JADX INFO: renamed from: b */
    public final ki7 f69581b;

    /* JADX INFO: renamed from: p3e$b */
    public static class C10783b {

        /* JADX INFO: renamed from: a */
        public so7 f69582a;

        /* JADX INFO: renamed from: b */
        public ki7.C8380b f69583b = new ki7.C8380b();

        public p3e build() {
            if (this.f69582a != null) {
                return new p3e(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C10783b header(String str, String str2) {
            this.f69583b.set(str, str2);
            return this;
        }

        public C10783b url(so7 so7Var) {
            if (so7Var == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f69582a = so7Var;
            return this;
        }
    }

    public ki7 headers() {
        return this.f69581b;
    }

    public so7 httpUrl() {
        return this.f69580a;
    }

    public C10783b newBuilder() {
        return new C10783b();
    }

    public String toString() {
        return "Request{url=" + this.f69580a + '}';
    }

    private p3e(C10783b c10783b) {
        this.f69580a = c10783b.f69582a;
        this.f69581b = c10783b.f69583b.build();
    }
}
