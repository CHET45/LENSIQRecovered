package p000;

import android.content.Context;
import com.liulishuo.okdownload.OkDownloadProvider;
import p000.dn4;
import p000.qm4;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class e0c {

    /* JADX INFO: renamed from: j */
    @igg({"StaticFieldLeak"})
    public static volatile e0c f31457j;

    /* JADX INFO: renamed from: a */
    public final el4 f31458a;

    /* JADX INFO: renamed from: b */
    public final go1 f31459b;

    /* JADX INFO: renamed from: c */
    public final gd1 f31460c;

    /* JADX INFO: renamed from: d */
    public final zk4.InterfaceC16165b f31461d;

    /* JADX INFO: renamed from: e */
    public final qm4.InterfaceC11553a f31462e;

    /* JADX INFO: renamed from: f */
    public final cdd f31463f;

    /* JADX INFO: renamed from: g */
    public final bn4 f31464g;

    /* JADX INFO: renamed from: h */
    public final Context f31465h;

    /* JADX INFO: renamed from: i */
    @hib
    public lm4 f31466i;

    /* JADX INFO: renamed from: e0c$a */
    public static class C5036a {

        /* JADX INFO: renamed from: a */
        public el4 f31467a;

        /* JADX INFO: renamed from: b */
        public go1 f31468b;

        /* JADX INFO: renamed from: c */
        public an4 f31469c;

        /* JADX INFO: renamed from: d */
        public zk4.InterfaceC16165b f31470d;

        /* JADX INFO: renamed from: e */
        public cdd f31471e;

        /* JADX INFO: renamed from: f */
        public bn4 f31472f;

        /* JADX INFO: renamed from: g */
        public qm4.InterfaceC11553a f31473g;

        /* JADX INFO: renamed from: h */
        public lm4 f31474h;

        /* JADX INFO: renamed from: i */
        public final Context f31475i;

        public C5036a(@efb Context context) {
            this.f31475i = context.getApplicationContext();
        }

        public e0c build() {
            if (this.f31467a == null) {
                this.f31467a = new el4();
            }
            if (this.f31468b == null) {
                this.f31468b = new go1();
            }
            if (this.f31469c == null) {
                this.f31469c = q0i.createDefaultDatabase(this.f31475i);
            }
            if (this.f31470d == null) {
                this.f31470d = q0i.createDefaultConnectionFactory();
            }
            if (this.f31473g == null) {
                this.f31473g = new dn4.C4876a();
            }
            if (this.f31471e == null) {
                this.f31471e = new cdd();
            }
            if (this.f31472f == null) {
                this.f31472f = new bn4();
            }
            e0c e0cVar = new e0c(this.f31475i, this.f31467a, this.f31468b, this.f31469c, this.f31470d, this.f31473g, this.f31471e, this.f31472f);
            e0cVar.setMonitor(this.f31474h);
            q0i.m19913d("OkDownload", "downloadStore[" + this.f31469c + "] connectionFactory[" + this.f31470d);
            return e0cVar;
        }

        public C5036a callbackDispatcher(go1 go1Var) {
            this.f31468b = go1Var;
            return this;
        }

        public C5036a connectionFactory(zk4.InterfaceC16165b interfaceC16165b) {
            this.f31470d = interfaceC16165b;
            return this;
        }

        public C5036a downloadDispatcher(el4 el4Var) {
            this.f31467a = el4Var;
            return this;
        }

        public C5036a downloadStore(an4 an4Var) {
            this.f31469c = an4Var;
            return this;
        }

        public C5036a downloadStrategy(bn4 bn4Var) {
            this.f31472f = bn4Var;
            return this;
        }

        public C5036a monitor(lm4 lm4Var) {
            this.f31474h = lm4Var;
            return this;
        }

        public C5036a outputStreamFactory(qm4.InterfaceC11553a interfaceC11553a) {
            this.f31473g = interfaceC11553a;
            return this;
        }

        public C5036a processFileStrategy(cdd cddVar) {
            this.f31471e = cddVar;
            return this;
        }
    }

    public e0c(Context context, el4 el4Var, go1 go1Var, an4 an4Var, zk4.InterfaceC16165b interfaceC16165b, qm4.InterfaceC11553a interfaceC11553a, cdd cddVar, bn4 bn4Var) {
        this.f31465h = context;
        this.f31458a = el4Var;
        this.f31459b = go1Var;
        this.f31460c = an4Var;
        this.f31461d = interfaceC16165b;
        this.f31462e = interfaceC11553a;
        this.f31463f = cddVar;
        this.f31464g = bn4Var;
        el4Var.setDownloadStore(q0i.createRemitDatabase(an4Var));
    }

    public static void setSingletonInstance(@efb e0c e0cVar) {
        if (f31457j != null) {
            throw new IllegalArgumentException("OkDownload must be null.");
        }
        synchronized (e0c.class) {
            try {
                if (f31457j != null) {
                    throw new IllegalArgumentException("OkDownload must be null.");
                }
                f31457j = e0cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e0c with() {
        if (f31457j == null) {
            synchronized (e0c.class) {
                try {
                    if (f31457j == null) {
                        Context context = OkDownloadProvider.f24184a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        f31457j = new C5036a(context).build();
                    }
                } finally {
                }
            }
        }
        return f31457j;
    }

    public gd1 breakpointStore() {
        return this.f31460c;
    }

    public go1 callbackDispatcher() {
        return this.f31459b;
    }

    public zk4.InterfaceC16165b connectionFactory() {
        return this.f31461d;
    }

    public Context context() {
        return this.f31465h;
    }

    public el4 downloadDispatcher() {
        return this.f31458a;
    }

    public bn4 downloadStrategy() {
        return this.f31464g;
    }

    @hib
    public lm4 getMonitor() {
        return this.f31466i;
    }

    public qm4.InterfaceC11553a outputStreamFactory() {
        return this.f31462e;
    }

    public cdd processFileStrategy() {
        return this.f31463f;
    }

    public void setMonitor(@hib lm4 lm4Var) {
        this.f31466i = lm4Var;
    }
}
