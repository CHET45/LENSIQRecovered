package p000;

import java.io.InputStream;
import p000.b72;
import p000.gsa;
import p000.m40;
import p000.y5g;

/* JADX INFO: renamed from: x4 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC14912x4 implements n5g {

    /* JADX INFO: renamed from: x4$a */
    public static abstract class a implements m40.InterfaceC9131h, gsa.InterfaceC6484b {

        /* JADX INFO: renamed from: i */
        @gdi
        public static final int f96212i = 32768;

        /* JADX INFO: renamed from: a */
        public m34 f96213a;

        /* JADX INFO: renamed from: b */
        public final Object f96214b = new Object();

        /* JADX INFO: renamed from: c */
        public final k4g f96215c;

        /* JADX INFO: renamed from: d */
        public final rhh f96216d;

        /* JADX INFO: renamed from: e */
        public final gsa f96217e;

        /* JADX INFO: renamed from: f */
        @vc7("onReadyLock")
        public int f96218f;

        /* JADX INFO: renamed from: g */
        @vc7("onReadyLock")
        public boolean f96219g;

        /* JADX INFO: renamed from: h */
        @vc7("onReadyLock")
        public boolean f96220h;

        /* JADX INFO: renamed from: x4$a$a, reason: collision with other inner class name */
        public class RunnableC16553a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ a79 f96221a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f96222b;

            public RunnableC16553a(a79 a79Var, int i) {
                this.f96221a = a79Var;
                this.f96222b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    nng nngVarTraceTask = tnc.traceTask("AbstractStream.request");
                    try {
                        tnc.linkIn(this.f96221a);
                        a.this.f96213a.request(this.f96222b);
                        if (nngVarTraceTask != null) {
                            nngVarTraceTask.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    a.this.deframeFailed(th);
                }
            }
        }

        public a(int i, k4g k4gVar, rhh rhhVar) {
            this.f96215c = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
            this.f96216d = (rhh) v7d.checkNotNull(rhhVar, "transportTracer");
            gsa gsaVar = new gsa(this, b72.C1761b.f12832a, i, k4gVar, rhhVar);
            this.f96217e = gsaVar;
            this.f96213a = gsaVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isReady() {
            boolean z;
            synchronized (this.f96214b) {
                try {
                    z = this.f96219g && this.f96218f < 32768 && !this.f96220h;
                } finally {
                }
            }
            return z;
        }

        private void notifyIfReady() {
            boolean zIsReady;
            synchronized (this.f96214b) {
                zIsReady = isReady();
            }
            if (zIsReady) {
                mo11346h().onReady();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendingBytes(int i) {
            synchronized (this.f96214b) {
                this.f96218f += i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void requestMessagesFromDeframer(int i) {
            if (!(this.f96213a instanceof cyg)) {
                runOnTransportThread(new RunnableC16553a(tnc.linkOut(), i));
                return;
            }
            nng nngVarTraceTask = tnc.traceTask("AbstractStream.request");
            try {
                this.f96213a.request(i);
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

        /* JADX INFO: renamed from: e */
        public final void m24980e(boolean z) {
            if (z) {
                this.f96213a.close();
            } else {
                this.f96213a.closeWhenComplete();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m24981f(frd frdVar) {
            try {
                this.f96213a.deframe(frdVar);
            } catch (Throwable th) {
                deframeFailed(th);
            }
        }

        /* JADX INFO: renamed from: g */
        public rhh m24982g() {
            return this.f96216d;
        }

        public final k4g getStatsTraceContext() {
            return this.f96215c;
        }

        /* JADX INFO: renamed from: h */
        public abstract y5g mo11346h();

        /* JADX INFO: renamed from: i */
        public final void m24983i() {
            synchronized (this.f96214b) {
                this.f96220h = true;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m24984j() {
            this.f96217e.m11835b(this);
            this.f96213a = this.f96217e;
        }

        /* JADX INFO: renamed from: k */
        public final void m24985k(am3 am3Var) {
            this.f96213a.setDecompressor(am3Var);
        }

        /* JADX INFO: renamed from: l */
        public void m24986l(md7 md7Var) {
            this.f96217e.setFullStreamDecompressor(md7Var);
            this.f96213a = new m40(this, this, this.f96217e);
        }

        /* JADX INFO: renamed from: m */
        public final void m24987m(int i) {
            this.f96213a.setMaxInboundMessageSize(i);
        }

        @Override // p000.gsa.InterfaceC6484b
        public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
            mo11346h().messagesAvailable(interfaceC15496a);
        }

        public final void onSentBytes(int i) {
            boolean z;
            synchronized (this.f96214b) {
                v7d.checkState(this.f96219g, "onStreamAllocated was not called, but it seems the stream is active");
                int i2 = this.f96218f;
                z = false;
                boolean z2 = i2 < 32768;
                int i3 = i2 - i;
                this.f96218f = i3;
                boolean z3 = i3 < 32768;
                if (!z2 && z3) {
                    z = true;
                }
            }
            if (z) {
                notifyIfReady();
            }
        }

        public void onStreamAllocated() {
            v7d.checkState(mo11346h() != null);
            synchronized (this.f96214b) {
                v7d.checkState(!this.f96219g, "Already allocated");
                this.f96219g = true;
            }
            notifyIfReady();
        }

        @gdi
        public final void requestMessagesFromDeframerForTesting(int i) {
            requestMessagesFromDeframer(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m24974a() {
        mo11339b().close();
    }

    /* JADX INFO: renamed from: b */
    public abstract pv6 mo11339b();

    /* JADX INFO: renamed from: c */
    public final void m24975c(int i) {
        mo11340d().onSendingBytes(i);
    }

    /* JADX INFO: renamed from: d */
    public abstract a mo11340d();

    @Override // p000.n5g
    public final void flush() {
        if (mo11339b().isClosed()) {
            return;
        }
        mo11339b().flush();
    }

    @Override // p000.n5g
    public boolean isReady() {
        return mo11340d().isReady();
    }

    @Override // p000.n5g
    public void optimizeForDirectExecutor() {
        mo11340d().m24984j();
    }

    @Override // p000.n5g
    public final void request(int i) {
        mo11340d().requestMessagesFromDeframer(i);
    }

    @Override // p000.n5g
    public final void setCompressor(go2 go2Var) {
        mo11339b().setCompressor((go2) v7d.checkNotNull(go2Var, "compressor"));
    }

    @Override // p000.n5g
    public final void setMessageCompression(boolean z) {
        mo11339b().setMessageCompression(z);
    }

    @Override // p000.n5g
    public final void writeMessage(InputStream inputStream) {
        v7d.checkNotNull(inputStream, g55.f38799h);
        try {
            if (!mo11339b().isClosed()) {
                mo11339b().writePayload(inputStream);
            }
        } finally {
            oc7.closeQuietly(inputStream);
        }
    }
}
