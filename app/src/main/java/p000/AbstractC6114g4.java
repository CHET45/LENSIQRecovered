package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p000.AbstractC14912x4;
import p000.fta;
import p000.jsa;

/* JADX INFO: renamed from: g4 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6114g4 extends AbstractC14912x4 implements w3f, jsa.InterfaceC8056d {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ boolean f38388e = false;

    /* JADX INFO: renamed from: a */
    public final jsa f38389a;

    /* JADX INFO: renamed from: b */
    public final k4g f38390b;

    /* JADX INFO: renamed from: c */
    public boolean f38391c;

    /* JADX INFO: renamed from: d */
    public boolean f38392d;

    /* JADX INFO: renamed from: g4$a */
    public interface a {
        void cancel(n4g n4gVar);

        void writeFrame(tri triVar, boolean z, int i);

        void writeHeaders(fta ftaVar, boolean z);

        void writeTrailers(fta ftaVar, boolean z, n4g n4gVar);
    }

    /* JADX INFO: renamed from: g4$b */
    public static abstract class b extends AbstractC14912x4.a {

        /* JADX INFO: renamed from: j */
        public boolean f38393j;

        /* JADX INFO: renamed from: k */
        public x3f f38394k;

        /* JADX INFO: renamed from: l */
        public final k4g f38395l;

        /* JADX INFO: renamed from: m */
        public boolean f38396m;

        /* JADX INFO: renamed from: n */
        public boolean f38397n;

        /* JADX INFO: renamed from: o */
        public boolean f38398o;

        /* JADX INFO: renamed from: p */
        public Runnable f38399p;

        /* JADX INFO: renamed from: q */
        @eib
        public n4g f38400q;

        /* JADX INFO: renamed from: g4$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ n4g f38401a;

            public a(n4g n4gVar) {
                this.f38401a = n4gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.closeListener(this.f38401a);
            }
        }

        /* JADX INFO: renamed from: g4$b$b, reason: collision with other inner class name */
        public class RunnableC16449b implements Runnable {
            public RunnableC16449b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.closeListener(n4g.f63258e);
            }
        }

        public b(int i, k4g k4gVar, rhh rhhVar) {
            super(i, k4gVar, (rhh) v7d.checkNotNull(rhhVar, "transportTracer"));
            this.f38396m = false;
            this.f38397n = false;
            this.f38398o = false;
            this.f38395l = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void closeListener(n4g n4gVar) {
            v7d.checkState((n4gVar.isOk() && this.f38400q == null) ? false : true);
            if (this.f38393j) {
                return;
            }
            if (n4gVar.isOk()) {
                this.f38395l.streamClosed(this.f38400q);
                m24982g().reportStreamClosed(this.f38400q.isOk());
            } else {
                this.f38395l.streamClosed(n4gVar);
                m24982g().reportStreamClosed(false);
            }
            this.f38393j = true;
            m24983i();
            mo11346h().closed(n4gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClosedStatus(n4g n4gVar) {
            v7d.checkState(this.f38400q == null, "closedStatus can only be set once");
            this.f38400q = n4gVar;
        }

        public void complete() {
            if (this.f38397n) {
                this.f38399p = null;
                closeListener(n4g.f63258e);
            } else {
                this.f38399p = new RunnableC16449b();
                this.f38398o = true;
                m24980e(true);
            }
        }

        @Override // p000.gsa.InterfaceC6484b
        public void deframerClosed(boolean z) {
            this.f38397n = true;
            if (this.f38396m && !this.f38398o) {
                if (z) {
                    deframeFailed(n4g.f63272s.withDescription("Encountered end-of-stream mid-frame").asRuntimeException());
                    this.f38399p = null;
                    return;
                }
                this.f38394k.halfClosed();
            }
            Runnable runnable = this.f38399p;
            if (runnable != null) {
                runnable.run();
                this.f38399p = null;
            }
        }

        public void inboundDataReceived(frd frdVar, boolean z) {
            v7d.checkState(!this.f38396m, "Past end of stream");
            m24981f(frdVar);
            if (z) {
                this.f38396m = true;
                m24980e(false);
            }
        }

        @Override // p000.AbstractC14912x4.a
        public final void onStreamAllocated() {
            super.onStreamAllocated();
            m24982g().reportRemoteStreamStarted();
        }

        @Override // p000.AbstractC14912x4.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public x3f mo11346h() {
            return this.f38394k;
        }

        public final void setListener(x3f x3fVar) {
            v7d.checkState(this.f38394k == null, "setListener should be called only once");
            this.f38394k = (x3f) v7d.checkNotNull(x3fVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }

        public final void transportReportStatus(n4g n4gVar) {
            v7d.checkArgument(!n4gVar.isOk(), "status must not be OK");
            if (this.f38397n) {
                this.f38399p = null;
                closeListener(n4gVar);
            } else {
                this.f38399p = new a(n4gVar);
                this.f38398o = true;
                m24980e(true);
            }
        }
    }

    public AbstractC6114g4(uri uriVar, k4g k4gVar) {
        this.f38390b = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
        this.f38389a = new jsa(this, uriVar, k4gVar);
    }

    private void addStatusToTrailers(fta ftaVar, n4g n4gVar) {
        fta.AbstractC5971i<n4g> abstractC5971i = tb8.f84152b;
        ftaVar.discardAll(abstractC5971i);
        fta.AbstractC5971i<String> abstractC5971i2 = tb8.f84151a;
        ftaVar.discardAll(abstractC5971i2);
        ftaVar.put(abstractC5971i, n4gVar);
        if (n4gVar.getDescription() != null) {
            ftaVar.put(abstractC5971i2, n4gVar.getDescription());
        }
    }

    @Override // p000.w3f
    public final void cancel(n4g n4gVar) {
        mo11341e().cancel(n4gVar);
    }

    @Override // p000.w3f
    public final void close(n4g n4gVar, fta ftaVar) {
        v7d.checkNotNull(n4gVar, "status");
        v7d.checkNotNull(ftaVar, oc7.f67148q);
        if (this.f38391c) {
            return;
        }
        this.f38391c = true;
        m24974a();
        addStatusToTrailers(ftaVar, n4gVar);
        mo11340d().setClosedStatus(n4gVar);
        mo11341e().writeTrailers(ftaVar, this.f38392d, n4gVar);
    }

    @Override // p000.jsa.InterfaceC8056d
    public final void deliverFrame(tri triVar, boolean z, boolean z2, int i) {
        if (triVar == null) {
            return;
        }
        if (z) {
            z2 = false;
        }
        mo11341e().writeFrame(triVar, z2, i);
    }

    /* JADX INFO: renamed from: e */
    public abstract a mo11341e();

    @Override // p000.AbstractC14912x4
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jsa mo11339b() {
        return this.f38389a;
    }

    @Override // p000.AbstractC14912x4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract b mo11340d();

    @Override // p000.w3f
    public sc0 getAttributes() {
        return sc0.f81180c;
    }

    @Override // p000.w3f
    public String getAuthority() {
        return null;
    }

    @Override // p000.AbstractC14912x4, p000.n5g
    public final boolean isReady() {
        return super.isReady();
    }

    @Override // p000.w3f
    public final void setDecompressor(am3 am3Var) {
        mo11340d().m24985k((am3) v7d.checkNotNull(am3Var, "decompressor"));
    }

    @Override // p000.w3f
    public final void setListener(x3f x3fVar) {
        mo11340d().setListener(x3fVar);
    }

    @Override // p000.w3f
    public k4g statsTraceContext() {
        return this.f38390b;
    }

    @Override // p000.w3f
    public final void writeHeaders(fta ftaVar, boolean z) {
        v7d.checkNotNull(ftaVar, "headers");
        this.f38392d = true;
        mo11341e().writeHeaders(ftaVar, z);
    }
}
