package p000;

import androidx.core.app.NotificationCompat;
import java.util.List;
import okio.Buffer;
import p000.AbstractC6114g4;
import p000.c1c;
import p000.i8c;

/* JADX INFO: loaded from: classes7.dex */
public class u0c extends AbstractC6114g4 {

    /* JADX INFO: renamed from: f */
    public final String f86504f;

    /* JADX INFO: renamed from: g */
    public final C13310b f86505g;

    /* JADX INFO: renamed from: h */
    public final C13309a f86506h;

    /* JADX INFO: renamed from: i */
    public final rhh f86507i;

    /* JADX INFO: renamed from: j */
    public final sc0 f86508j;

    /* JADX INFO: renamed from: u0c$a */
    public class C13309a implements AbstractC6114g4.a {
        public C13309a() {
        }

        @Override // p000.AbstractC6114g4.a
        public void cancel(n4g n4gVar) {
            nng nngVarTraceTask = tnc.traceTask("OkHttpServerStream$Sink.cancel");
            try {
                synchronized (u0c.this.f86505g.f86516u) {
                    u0c.this.f86505g.cancel(w45.CANCEL, n4gVar);
                }
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p000.AbstractC6114g4.a
        public void writeFrame(tri triVar, boolean z, int i) {
            nng nngVarTraceTask = tnc.traceTask("OkHttpServerStream$Sink.writeFrame");
            try {
                Buffer bufferM12075a = ((h1c) triVar).m12075a();
                int size = (int) bufferM12075a.size();
                if (size > 0) {
                    u0c.this.m24975c(size);
                }
                synchronized (u0c.this.f86505g.f86516u) {
                    u0c.this.f86505g.sendBuffer(bufferM12075a, z);
                    u0c.this.f86507i.reportMessageSent(i);
                }
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p000.AbstractC6114g4.a
        public void writeHeaders(fta ftaVar, boolean z) {
            nng nngVarTraceTask = tnc.traceTask("OkHttpServerStream$Sink.writeHeaders");
            try {
                List<ei7> listCreateResponseHeaders = ji7.createResponseHeaders(ftaVar);
                synchronized (u0c.this.f86505g.f86516u) {
                    u0c.this.f86505g.sendHeaders(listCreateResponseHeaders);
                }
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p000.AbstractC6114g4.a
        public void writeTrailers(fta ftaVar, boolean z, n4g n4gVar) {
            nng nngVarTraceTask = tnc.traceTask("OkHttpServerStream$Sink.writeTrailers");
            try {
                List<ei7> listCreateResponseTrailers = ji7.createResponseTrailers(ftaVar, z);
                synchronized (u0c.this.f86505g.f86516u) {
                    u0c.this.f86505g.sendTrailers(listCreateResponseTrailers);
                }
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u0c$b */
    public static class C13310b extends AbstractC6114g4.b implements i8c.InterfaceC7185b, c1c.InterfaceC2156f {

        /* JADX INFO: renamed from: A */
        @vc7("lock")
        public boolean f86510A;

        /* JADX INFO: renamed from: B */
        public final plg f86511B;

        /* JADX INFO: renamed from: C */
        public final i8c.C7186c f86512C;

        /* JADX INFO: renamed from: r */
        @vc7("lock")
        public final c1c f86513r;

        /* JADX INFO: renamed from: s */
        public final int f86514s;

        /* JADX INFO: renamed from: t */
        public final int f86515t;

        /* JADX INFO: renamed from: u */
        public final Object f86516u;

        /* JADX INFO: renamed from: v */
        @vc7("lock")
        public boolean f86517v;

        /* JADX INFO: renamed from: w */
        @vc7("lock")
        public int f86518w;

        /* JADX INFO: renamed from: x */
        @vc7("lock")
        public int f86519x;

        /* JADX INFO: renamed from: y */
        @vc7("lock")
        public final i75 f86520y;

        /* JADX INFO: renamed from: z */
        @vc7("lock")
        public final i8c f86521z;

        public C13310b(c1c c1cVar, int i, int i2, k4g k4gVar, Object obj, i75 i75Var, i8c i8cVar, int i3, rhh rhhVar, String str) {
            super(i2, k4gVar, rhhVar);
            this.f86517v = false;
            this.f86513r = (c1c) v7d.checkNotNull(c1cVar, NotificationCompat.CATEGORY_TRANSPORT);
            this.f86514s = i;
            this.f86516u = v7d.checkNotNull(obj, "lock");
            this.f86520y = i75Var;
            this.f86521z = i8cVar;
            this.f86518w = i3;
            this.f86519x = i3;
            this.f86515t = i3;
            this.f86511B = tnc.createTag(str);
            this.f86512C = i8cVar.createState(this, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @vc7("lock")
        public void cancel(w45 w45Var, n4g n4gVar) {
            if (this.f86517v) {
                return;
            }
            this.f86517v = true;
            this.f86520y.rstStream(this.f86514s, w45Var);
            transportReportStatus(n4gVar);
            this.f86513r.m3627S(this.f86514s, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @vc7("lock")
        public void sendBuffer(Buffer buffer, boolean z) {
            if (this.f86517v) {
                return;
            }
            this.f86521z.data(false, this.f86512C, buffer, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @vc7("lock")
        public void sendHeaders(List<ei7> list) {
            this.f86520y.synReply(false, this.f86514s, list);
            this.f86520y.flush();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @vc7("lock")
        public void sendTrailers(final List<ei7> list) {
            this.f86521z.notifyWhenNoPendingData(this.f86512C, new Runnable() { // from class: v0c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89624a.lambda$sendTrailers$0(list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: sendTrailersAfterFlowControlled, reason: merged with bridge method [inline-methods] */
        public void lambda$sendTrailers$0(List<ei7> list) {
            synchronized (this.f86516u) {
                try {
                    this.f86520y.synReply(true, this.f86514s, list);
                    if (!this.f86510A) {
                        this.f86520y.rstStream(this.f86514s, w45.NO_ERROR);
                    }
                    this.f86513r.m3627S(this.f86514s, true);
                    complete();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.gsa.InterfaceC6484b
        @vc7("lock")
        public void bytesRead(int i) {
            int i2 = this.f86519x - i;
            this.f86519x = i2;
            float f = i2;
            int i3 = this.f86515t;
            if (f <= i3 * 0.5f) {
                int i4 = i3 - i2;
                this.f86518w += i4;
                this.f86519x = i2 + i4;
                this.f86520y.windowUpdate(this.f86514s, i4);
                this.f86520y.flush();
            }
        }

        @Override // p000.gsa.InterfaceC6484b
        @vc7("lock")
        public void deframeFailed(Throwable th) {
            cancel(w45.INTERNAL_ERROR, n4g.fromThrowable(th));
        }

        @Override // p000.c1c.InterfaceC2156f
        public i8c.C7186c getOutboundFlowState() {
            return this.f86512C;
        }

        @Override // p000.c1c.InterfaceC2156f
        public boolean hasReceivedEndOfStream() {
            boolean z;
            synchronized (this.f86516u) {
                z = this.f86510A;
            }
            return z;
        }

        @Override // p000.c1c.InterfaceC2156f
        public void inboundDataReceived(Buffer buffer, int i, int i2, boolean z) {
            synchronized (this.f86516u) {
                try {
                    tnc.event("OkHttpServerTransport$FrameHandler.data", this.f86511B);
                    if (z) {
                        this.f86510A = true;
                    }
                    this.f86518w -= i + i2;
                    this.f86519x -= i2;
                    super.inboundDataReceived(new m0c(buffer), z);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.c1c.InterfaceC2156f
        public void inboundRstReceived(n4g n4gVar) {
            tnc.event("OkHttpServerTransport$FrameHandler.rstStream", this.f86511B);
            transportReportStatus(n4gVar);
        }

        @Override // p000.c1c.InterfaceC2156f
        public int inboundWindowAvailable() {
            int i;
            synchronized (this.f86516u) {
                i = this.f86518w;
            }
            return i;
        }

        @Override // p000.n40.InterfaceC9690d
        @vc7("lock")
        public void runOnTransportThread(Runnable runnable) {
            synchronized (this.f86516u) {
                runnable.run();
            }
        }
    }

    public u0c(C13310b c13310b, sc0 sc0Var, String str, k4g k4gVar, rhh rhhVar) {
        super(new i1c(), k4gVar);
        this.f86506h = new C13309a();
        this.f86505g = (C13310b) v7d.checkNotNull(c13310b, "state");
        this.f86508j = (sc0) v7d.checkNotNull(sc0Var, "transportAttrs");
        this.f86504f = str;
        this.f86507i = (rhh) v7d.checkNotNull(rhhVar, "transportTracer");
    }

    @Override // p000.AbstractC6114g4, p000.w3f
    public sc0 getAttributes() {
        return this.f86508j;
    }

    @Override // p000.AbstractC6114g4, p000.w3f
    public String getAuthority() {
        return this.f86504f;
    }

    @Override // p000.AbstractC6114g4
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C13309a mo11341e() {
        return this.f86506h;
    }

    @Override // p000.AbstractC6114g4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C13310b mo11340d() {
        return this.f86505g;
    }

    @Override // p000.w3f
    public int streamId() {
        return this.f86505g.f86514s;
    }
}
