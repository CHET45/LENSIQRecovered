package p000;

import p000.c15;

/* JADX INFO: loaded from: classes4.dex */
public final class n77 {

    /* JADX INFO: renamed from: b */
    public static final n77 f63435b = new C9720a().build();

    /* JADX INFO: renamed from: a */
    public final i5g f63436a;

    /* JADX INFO: renamed from: n77$a */
    public static final class C9720a {

        /* JADX INFO: renamed from: a */
        public i5g f63437a = null;

        public n77 build() {
            return new n77(this.f63437a);
        }

        public C9720a setStorageMetrics(i5g i5gVar) {
            this.f63437a = i5gVar;
            return this;
        }
    }

    public n77(i5g i5gVar) {
        this.f63436a = i5gVar;
    }

    public static n77 getDefaultInstance() {
        return f63435b;
    }

    public static C9720a newBuilder() {
        return new C9720a();
    }

    @c15.InterfaceC2148b
    public i5g getStorageMetrics() {
        i5g i5gVar = this.f63436a;
        return i5gVar == null ? i5g.getDefaultInstance() : i5gVar;
    }

    @jhd(tag = 1)
    @c15.InterfaceC2147a(name = "storageMetrics")
    public i5g getStorageMetricsInternal() {
        return this.f63436a;
    }
}
