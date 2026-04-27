package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p000.gsa;
import p000.n40;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public class m40 implements m34 {

    /* JADX INFO: renamed from: a */
    public final gsa.InterfaceC6484b f59842a;

    /* JADX INFO: renamed from: b */
    public final n40 f59843b;

    /* JADX INFO: renamed from: c */
    public final gsa f59844c;

    /* JADX INFO: renamed from: m40$a */
    public class RunnableC9124a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f59845a;

        public RunnableC9124a(int i) {
            this.f59845a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m40.this.f59844c.isClosed()) {
                return;
            }
            try {
                m40.this.f59844c.request(this.f59845a);
            } catch (Throwable th) {
                m40.this.f59843b.deframeFailed(th);
                m40.this.f59844c.close();
            }
        }
    }

    /* JADX INFO: renamed from: m40$b */
    public class RunnableC9125b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ frd f59847a;

        public RunnableC9125b(frd frdVar) {
            this.f59847a = frdVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m40.this.f59844c.deframe(this.f59847a);
            } catch (Throwable th) {
                m40.this.f59843b.deframeFailed(th);
                m40.this.f59844c.close();
            }
        }
    }

    /* JADX INFO: renamed from: m40$c */
    public class C9126c implements Closeable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ frd f59849a;

        public C9126c(frd frdVar) {
            this.f59849a = frdVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f59849a.close();
        }
    }

    /* JADX INFO: renamed from: m40$d */
    public class RunnableC9127d implements Runnable {
        public RunnableC9127d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m40.this.f59844c.closeWhenComplete();
        }
    }

    /* JADX INFO: renamed from: m40$e */
    public class RunnableC9128e implements Runnable {
        public RunnableC9128e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m40.this.f59844c.close();
        }
    }

    /* JADX INFO: renamed from: m40$f */
    public class C9129f extends C9130g implements Closeable {

        /* JADX INFO: renamed from: d */
        public final Closeable f59853d;

        public C9129f(Runnable runnable, Closeable closeable) {
            super(m40.this, runnable, null);
            this.f59853d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f59853d.close();
        }
    }

    /* JADX INFO: renamed from: m40$g */
    public class C9130g implements y5g.InterfaceC15496a {

        /* JADX INFO: renamed from: a */
        public final Runnable f59855a;

        /* JADX INFO: renamed from: b */
        public boolean f59856b;

        public /* synthetic */ C9130g(m40 m40Var, Runnable runnable, RunnableC9124a runnableC9124a) {
            this(runnable);
        }

        private void initialize() {
            if (this.f59856b) {
                return;
            }
            this.f59855a.run();
            this.f59856b = true;
        }

        @Override // p000.y5g.InterfaceC15496a
        @eib
        public InputStream next() {
            initialize();
            return m40.this.f59843b.messageReadQueuePoll();
        }

        private C9130g(Runnable runnable) {
            this.f59856b = false;
            this.f59855a = runnable;
        }
    }

    /* JADX INFO: renamed from: m40$h */
    public interface InterfaceC9131h extends n40.InterfaceC9690d {
    }

    public m40(gsa.InterfaceC6484b interfaceC6484b, InterfaceC9131h interfaceC9131h, gsa gsaVar) {
        szf szfVar = new szf((gsa.InterfaceC6484b) v7d.checkNotNull(interfaceC6484b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER));
        this.f59842a = szfVar;
        n40 n40Var = new n40(szfVar, interfaceC9131h);
        this.f59843b = n40Var;
        gsaVar.m11835b(n40Var);
        this.f59844c = gsaVar;
    }

    @gdi
    /* JADX INFO: renamed from: c */
    public gsa.InterfaceC6484b m16607c() {
        return this.f59843b;
    }

    @Override // p000.m34, java.lang.AutoCloseable
    public void close() {
        this.f59844c.m11836c();
        this.f59842a.messagesAvailable(new C9130g(this, new RunnableC9128e(), null));
    }

    @Override // p000.m34
    public void closeWhenComplete() {
        this.f59842a.messagesAvailable(new C9130g(this, new RunnableC9127d(), null));
    }

    @Override // p000.m34
    public void deframe(frd frdVar) {
        this.f59842a.messagesAvailable(new C9129f(new RunnableC9125b(frdVar), new C9126c(frdVar)));
    }

    @Override // p000.m34
    public void request(int i) {
        this.f59842a.messagesAvailable(new C9130g(this, new RunnableC9124a(i), null));
    }

    @Override // p000.m34
    public void setDecompressor(am3 am3Var) {
        this.f59844c.setDecompressor(am3Var);
    }

    @Override // p000.m34
    public void setFullStreamDecompressor(md7 md7Var) {
        this.f59844c.setFullStreamDecompressor(md7Var);
    }

    @Override // p000.m34
    public void setMaxInboundMessageSize(int i) {
        this.f59844c.setMaxInboundMessageSize(i);
    }
}
