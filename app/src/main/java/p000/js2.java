package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class js2 {

    /* JADX INFO: renamed from: d */
    public static final int f51649d = 30;

    /* JADX INFO: renamed from: a */
    public final boolean f51650a;

    /* JADX INFO: renamed from: b */
    public final boolean f51651b;

    /* JADX INFO: renamed from: c */
    public final w1h f51652c;

    /* JADX INFO: renamed from: js2$a */
    public static class C8045a {

        /* JADX INFO: renamed from: a */
        public boolean f51653a = false;

        /* JADX INFO: renamed from: b */
        public boolean f51654b = false;

        /* JADX INFO: renamed from: c */
        public w1h f51655c = new w1h(30, TimeUnit.SECONDS);

        public js2 build() {
            return new js2(this.f51653a, this.f51654b, this.f51655c);
        }

        public C8045a setAutoConnect(boolean z) {
            this.f51653a = z;
            return this;
        }

        public C8045a setOperationTimeout(w1h w1hVar) {
            this.f51655c = w1hVar;
            return this;
        }

        public C8045a setSuppressIllegalOperationCheck(boolean z) {
            this.f51654b = z;
            return this;
        }
    }

    public js2(boolean z, boolean z2, w1h w1hVar) {
        this.f51650a = z;
        this.f51651b = z2;
        this.f51652c = w1hVar;
    }
}
