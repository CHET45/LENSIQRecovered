package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.c15;

/* JADX INFO: loaded from: classes4.dex */
public final class f42 {

    /* JADX INFO: renamed from: e */
    public static final f42 f35014e = new C5588a().build();

    /* JADX INFO: renamed from: a */
    public final f1h f35015a;

    /* JADX INFO: renamed from: b */
    public final List<ri9> f35016b;

    /* JADX INFO: renamed from: c */
    public final n77 f35017c;

    /* JADX INFO: renamed from: d */
    public final String f35018d;

    /* JADX INFO: renamed from: f42$a */
    public static final class C5588a {

        /* JADX INFO: renamed from: a */
        public f1h f35019a = null;

        /* JADX INFO: renamed from: b */
        public List<ri9> f35020b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public n77 f35021c = null;

        /* JADX INFO: renamed from: d */
        public String f35022d = "";

        public C5588a addLogSourceMetrics(ri9 ri9Var) {
            this.f35020b.add(ri9Var);
            return this;
        }

        public f42 build() {
            return new f42(this.f35019a, Collections.unmodifiableList(this.f35020b), this.f35021c, this.f35022d);
        }

        public C5588a setAppNamespace(String str) {
            this.f35022d = str;
            return this;
        }

        public C5588a setGlobalMetrics(n77 n77Var) {
            this.f35021c = n77Var;
            return this;
        }

        public C5588a setLogSourceMetricsList(List<ri9> list) {
            this.f35020b = list;
            return this;
        }

        public C5588a setWindow(f1h f1hVar) {
            this.f35019a = f1hVar;
            return this;
        }
    }

    public f42(f1h f1hVar, List<ri9> list, n77 n77Var, String str) {
        this.f35015a = f1hVar;
        this.f35016b = list;
        this.f35017c = n77Var;
        this.f35018d = str;
    }

    public static f42 getDefaultInstance() {
        return f35014e;
    }

    public static C5588a newBuilder() {
        return new C5588a();
    }

    @jhd(tag = 4)
    public String getAppNamespace() {
        return this.f35018d;
    }

    @c15.InterfaceC2148b
    public n77 getGlobalMetrics() {
        n77 n77Var = this.f35017c;
        return n77Var == null ? n77.getDefaultInstance() : n77Var;
    }

    @jhd(tag = 3)
    @c15.InterfaceC2147a(name = "globalMetrics")
    public n77 getGlobalMetricsInternal() {
        return this.f35017c;
    }

    @jhd(tag = 2)
    @c15.InterfaceC2147a(name = "logSourceMetrics")
    public List<ri9> getLogSourceMetricsList() {
        return this.f35016b;
    }

    @c15.InterfaceC2148b
    public f1h getWindow() {
        f1h f1hVar = this.f35015a;
        return f1hVar == null ? f1h.getDefaultInstance() : f1hVar;
    }

    @jhd(tag = 1)
    @c15.InterfaceC2147a(name = "window")
    public f1h getWindowInternal() {
        return this.f35015a;
    }

    public byte[] toByteArray() {
        return dhd.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        dhd.encode(this, outputStream);
    }
}
