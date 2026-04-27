package p000;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p000.m25;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0093a9 {

    /* JADX INFO: renamed from: a */
    public final boolean f652a;

    /* JADX INFO: renamed from: b */
    public final Executor f653b;

    /* JADX INFO: renamed from: c */
    @fdi
    public final Map<eq8, d> f654c;

    /* JADX INFO: renamed from: d */
    public final ReferenceQueue<m25<?>> f655d;

    /* JADX INFO: renamed from: e */
    public m25.InterfaceC9104a f656e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f657f;

    /* JADX INFO: renamed from: g */
    @hib
    public volatile c f658g;

    /* JADX INFO: renamed from: a9$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a9$a$a, reason: collision with other inner class name */
        public class RunnableC16337a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Runnable f659a;

            public RunnableC16337a(Runnable runnable) {
                this.f659a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f659a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@efb Runnable runnable) {
            return new Thread(new RunnableC16337a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: a9$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0093a9.this.m193b();
        }
    }

    /* JADX INFO: renamed from: a9$c */
    @fdi
    public interface c {
        void onResourceDequeued();
    }

    /* JADX INFO: renamed from: a9$d */
    @fdi
    public static final class d extends WeakReference<m25<?>> {

        /* JADX INFO: renamed from: a */
        public final eq8 f662a;

        /* JADX INFO: renamed from: b */
        public final boolean f663b;

        /* JADX INFO: renamed from: c */
        @hib
        public t5e<?> f664c;

        public d(@efb eq8 eq8Var, @efb m25<?> m25Var, @efb ReferenceQueue<? super m25<?>> referenceQueue, boolean z) {
            super(m25Var, referenceQueue);
            this.f662a = (eq8) t7d.checkNotNull(eq8Var);
            this.f664c = (m25Var.m16582c() && z) ? (t5e) t7d.checkNotNull(m25Var.m16581b()) : null;
            this.f663b = m25Var.m16582c();
        }

        /* JADX INFO: renamed from: a */
        public void m200a() {
            this.f664c = null;
            clear();
        }
    }

    public C0093a9(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m192a(eq8 eq8Var, m25<?> m25Var) {
        d dVarPut = this.f654c.put(eq8Var, new d(eq8Var, m25Var, this.f655d, this.f652a));
        if (dVarPut != null) {
            dVarPut.m200a();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m193b() {
        while (!this.f657f) {
            try {
                m194c((d) this.f655d.remove());
                c cVar = this.f658g;
                if (cVar != null) {
                    cVar.onResourceDequeued();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m194c(@efb d dVar) {
        t5e<?> t5eVar;
        synchronized (this) {
            this.f654c.remove(dVar.f662a);
            if (dVar.f663b && (t5eVar = dVar.f664c) != null) {
                this.f656e.onResourceReleased(dVar.f662a, new m25<>(t5eVar, true, false, dVar.f662a, this.f656e));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m195d(eq8 eq8Var) {
        d dVarRemove = this.f654c.remove(eq8Var);
        if (dVarRemove != null) {
            dVarRemove.m200a();
        }
    }

    @hib
    /* JADX INFO: renamed from: e */
    public synchronized m25<?> m196e(eq8 eq8Var) {
        d dVar = this.f654c.get(eq8Var);
        if (dVar == null) {
            return null;
        }
        m25<?> m25Var = dVar.get();
        if (m25Var == null) {
            m194c(dVar);
        }
        return m25Var;
    }

    @fdi
    /* JADX INFO: renamed from: f */
    public void m197f(c cVar) {
        this.f658g = cVar;
    }

    /* JADX INFO: renamed from: g */
    public void m198g(m25.InterfaceC9104a interfaceC9104a) {
        synchronized (interfaceC9104a) {
            synchronized (this) {
                this.f656e = interfaceC9104a;
            }
        }
    }

    @fdi
    /* JADX INFO: renamed from: h */
    public void m199h() {
        this.f657f = true;
        Executor executor = this.f653b;
        if (executor instanceof ExecutorService) {
            y85.shutdownAndAwaitTermination((ExecutorService) executor);
        }
    }

    @fdi
    public C0093a9(boolean z, Executor executor) {
        this.f654c = new HashMap();
        this.f655d = new ReferenceQueue<>();
        this.f652a = z;
        this.f653b = executor;
        executor.execute(new b());
    }
}
