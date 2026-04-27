package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p000.da8;
import p000.p42;
import p000.r42;
import p000.wr9;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class s34 implements wr9 {

    /* JADX INFO: renamed from: c */
    public final Executor f80493c;

    /* JADX INFO: renamed from: d */
    public final thg f80494d;

    /* JADX INFO: renamed from: e */
    public Runnable f80495e;

    /* JADX INFO: renamed from: f */
    public Runnable f80496f;

    /* JADX INFO: renamed from: g */
    public Runnable f80497g;

    /* JADX INFO: renamed from: h */
    public wr9.InterfaceC14756a f80498h;

    /* JADX INFO: renamed from: j */
    @vc7("lock")
    public n4g f80500j;

    /* JADX INFO: renamed from: k */
    @eib
    @vc7("lock")
    public zb9.AbstractC16074k f80501k;

    /* JADX INFO: renamed from: l */
    @vc7("lock")
    public long f80502l;

    /* JADX INFO: renamed from: a */
    public final cb8 f80491a = cb8.allocate((Class<?>) s34.class, (String) null);

    /* JADX INFO: renamed from: b */
    public final Object f80492b = new Object();

    /* JADX INFO: renamed from: i */
    @ofb
    @vc7("lock")
    public Collection<C12420e> f80499i = new LinkedHashSet();

    /* JADX INFO: renamed from: s34$a */
    public class RunnableC12416a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wr9.InterfaceC14756a f80503a;

        public RunnableC12416a(wr9.InterfaceC14756a interfaceC14756a) {
            this.f80503a = interfaceC14756a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f80503a.transportInUse(true);
        }
    }

    /* JADX INFO: renamed from: s34$b */
    public class RunnableC12417b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wr9.InterfaceC14756a f80505a;

        public RunnableC12417b(wr9.InterfaceC14756a interfaceC14756a) {
            this.f80505a = interfaceC14756a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f80505a.transportInUse(false);
        }
    }

    /* JADX INFO: renamed from: s34$c */
    public class RunnableC12418c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wr9.InterfaceC14756a f80507a;

        public RunnableC12418c(wr9.InterfaceC14756a interfaceC14756a) {
            this.f80507a = interfaceC14756a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f80507a.transportTerminated();
        }
    }

    /* JADX INFO: renamed from: s34$d */
    public class RunnableC12419d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n4g f80509a;

        public RunnableC12419d(n4g n4gVar) {
            this.f80509a = n4gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            s34.this.f80498h.transportShutdown(this.f80509a);
        }
    }

    /* JADX INFO: renamed from: s34$e */
    public class C12420e extends t34 {

        /* JADX INFO: renamed from: k */
        public final zb9.AbstractC16071h f80511k;

        /* JADX INFO: renamed from: l */
        public final fx2 f80512l;

        /* JADX INFO: renamed from: m */
        public final q42[] f80513m;

        public /* synthetic */ C12420e(s34 s34Var, zb9.AbstractC16071h abstractC16071h, q42[] q42VarArr, RunnableC12416a runnableC12416a) {
            this(abstractC16071h, q42VarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable createRealStream(r42 r42Var) {
            fx2 fx2VarAttach = this.f80512l.attach();
            try {
                o42 o42VarNewStream = r42Var.newStream(this.f80511k.getMethodDescriptor(), this.f80511k.getHeaders(), this.f80511k.getCallOptions(), this.f80513m);
                this.f80512l.detach(fx2VarAttach);
                return m22348e(o42VarNewStream);
            } catch (Throwable th) {
                this.f80512l.detach(fx2VarAttach);
                throw th;
            }
        }

        @Override // p000.t34, p000.o42
        public void appendTimeoutInsight(y48 y48Var) {
            if (this.f80511k.getCallOptions().isWaitForReady()) {
                y48Var.append("wait_for_ready");
            }
            super.appendTimeoutInsight(y48Var);
        }

        @Override // p000.t34, p000.o42
        public void cancel(n4g n4gVar) {
            super.cancel(n4gVar);
            synchronized (s34.this.f80492b) {
                try {
                    if (s34.this.f80497g != null) {
                        boolean zRemove = s34.this.f80499i.remove(this);
                        if (!s34.this.hasPendingStreams() && zRemove) {
                            s34.this.f80494d.executeLater(s34.this.f80496f);
                            if (s34.this.f80500j != null) {
                                s34.this.f80494d.executeLater(s34.this.f80497g);
                                s34.this.f80497g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            s34.this.f80494d.drain();
        }

        @Override // p000.t34
        /* JADX INFO: renamed from: d */
        public void mo21684d(n4g n4gVar) {
            for (q42 q42Var : this.f80513m) {
                q42Var.streamClosed(n4gVar);
            }
        }

        private C12420e(zb9.AbstractC16071h abstractC16071h, q42[] q42VarArr) {
            this.f80512l = fx2.current();
            this.f80511k = abstractC16071h;
            this.f80513m = q42VarArr;
        }
    }

    public s34(Executor executor, thg thgVar) {
        this.f80493c = executor;
        this.f80494d = thgVar;
    }

    @vc7("lock")
    private C12420e createPendingStream(zb9.AbstractC16071h abstractC16071h, q42[] q42VarArr) {
        C12420e c12420e = new C12420e(this, abstractC16071h, q42VarArr, null);
        this.f80499i.add(c12420e);
        if (m21679i() == 1) {
            this.f80494d.executeLater(this.f80495e);
        }
        for (q42 q42Var : q42VarArr) {
            q42Var.createPendingStream();
        }
        return c12420e;
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return this.f80491a;
    }

    @Override // p000.xa8
    public ja9<da8.C4695l> getStats() {
        y6f y6fVarCreate = y6f.create();
        y6fVarCreate.set(null);
        return y6fVarCreate;
    }

    public final boolean hasPendingStreams() {
        boolean z;
        synchronized (this.f80492b) {
            z = !this.f80499i.isEmpty();
        }
        return z;
    }

    @gdi
    /* JADX INFO: renamed from: i */
    public final int m21679i() {
        int size;
        synchronized (this.f80492b) {
            size = this.f80499i.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: j */
    public final void m21680j(@eib zb9.AbstractC16074k abstractC16074k) {
        Runnable runnable;
        synchronized (this.f80492b) {
            this.f80501k = abstractC16074k;
            this.f80502l++;
            if (abstractC16074k != null && hasPendingStreams()) {
                ArrayList<C12420e> arrayList = new ArrayList(this.f80499i);
                ArrayList arrayList2 = new ArrayList();
                for (C12420e c12420e : arrayList) {
                    zb9.C16070g c16070gPickSubchannel = abstractC16074k.pickSubchannel(c12420e.f80511k);
                    rn1 callOptions = c12420e.f80511k.getCallOptions();
                    r42 r42VarM18575c = oc7.m18575c(c16070gPickSubchannel, callOptions.isWaitForReady());
                    if (r42VarM18575c != null) {
                        Executor executor = this.f80493c;
                        if (callOptions.getExecutor() != null) {
                            executor = callOptions.getExecutor();
                        }
                        Runnable runnableCreateRealStream = c12420e.createRealStream(r42VarM18575c);
                        if (runnableCreateRealStream != null) {
                            executor.execute(runnableCreateRealStream);
                        }
                        arrayList2.add(c12420e);
                    }
                }
                synchronized (this.f80492b) {
                    try {
                        if (hasPendingStreams()) {
                            this.f80499i.removeAll(arrayList2);
                            if (this.f80499i.isEmpty()) {
                                this.f80499i = new LinkedHashSet();
                            }
                            if (!hasPendingStreams()) {
                                this.f80494d.executeLater(this.f80496f);
                                if (this.f80500j != null && (runnable = this.f80497g) != null) {
                                    this.f80494d.executeLater(runnable);
                                    this.f80497g = null;
                                }
                            }
                            this.f80494d.drain();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // p000.r42
    public final o42 newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) {
        o42 dp5Var;
        try {
            pvc pvcVar = new pvc(ruaVar, ftaVar, rn1Var);
            zb9.AbstractC16074k abstractC16074k = null;
            long j = -1;
            while (true) {
                synchronized (this.f80492b) {
                    if (this.f80500j == null) {
                        zb9.AbstractC16074k abstractC16074k2 = this.f80501k;
                        if (abstractC16074k2 != null) {
                            if (abstractC16074k != null && j == this.f80502l) {
                                dp5Var = createPendingStream(pvcVar, q42VarArr);
                                break;
                            }
                            j = this.f80502l;
                            r42 r42VarM18575c = oc7.m18575c(abstractC16074k2.pickSubchannel(pvcVar), rn1Var.isWaitForReady());
                            if (r42VarM18575c != null) {
                                dp5Var = r42VarM18575c.newStream(pvcVar.getMethodDescriptor(), pvcVar.getHeaders(), pvcVar.getCallOptions(), q42VarArr);
                                break;
                            }
                            abstractC16074k = abstractC16074k2;
                        } else {
                            dp5Var = createPendingStream(pvcVar, q42VarArr);
                            break;
                        }
                    } else {
                        dp5Var = new dp5(this.f80500j, q42VarArr);
                        break;
                    }
                }
            }
            return dp5Var;
        } finally {
            this.f80494d.drain();
        }
    }

    @Override // p000.r42
    public final void ping(r42.InterfaceC11878a interfaceC11878a, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    @Override // p000.wr9
    public final void shutdown(n4g n4gVar) {
        Runnable runnable;
        synchronized (this.f80492b) {
            try {
                if (this.f80500j != null) {
                    return;
                }
                this.f80500j = n4gVar;
                this.f80494d.executeLater(new RunnableC12419d(n4gVar));
                if (!hasPendingStreams() && (runnable = this.f80497g) != null) {
                    this.f80494d.executeLater(runnable);
                    this.f80497g = null;
                }
                this.f80494d.drain();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.wr9
    public final void shutdownNow(n4g n4gVar) {
        Collection<C12420e> collection;
        Runnable runnable;
        shutdown(n4gVar);
        synchronized (this.f80492b) {
            try {
                collection = this.f80499i;
                runnable = this.f80497g;
                this.f80497g = null;
                if (!collection.isEmpty()) {
                    this.f80499i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (C12420e c12420e : collection) {
                Runnable runnableM22348e = c12420e.m22348e(new dp5(n4gVar, p42.EnumC10788a.REFUSED, c12420e.f80513m));
                if (runnableM22348e != null) {
                    runnableM22348e.run();
                }
            }
            this.f80494d.execute(runnable);
        }
    }

    @Override // p000.wr9
    public final Runnable start(wr9.InterfaceC14756a interfaceC14756a) {
        this.f80498h = interfaceC14756a;
        this.f80495e = new RunnableC12416a(interfaceC14756a);
        this.f80496f = new RunnableC12417b(interfaceC14756a);
        this.f80497g = new RunnableC12418c(interfaceC14756a);
        return null;
    }
}
