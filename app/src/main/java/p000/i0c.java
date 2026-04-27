package p000;

import java.io.EOFException;
import java.util.List;
import okio.Buffer;
import p000.AbstractC9063m0;
import p000.i8c;
import p000.p42;
import p000.rua;

/* JADX INFO: loaded from: classes7.dex */
public class i0c extends AbstractC9063m0 {

    /* JADX INFO: renamed from: p */
    public static final Buffer f45378p = new Buffer();

    /* JADX INFO: renamed from: q */
    public static final int f45379q = -1;

    /* JADX INFO: renamed from: h */
    public final rua<?, ?> f45380h;

    /* JADX INFO: renamed from: i */
    public final String f45381i;

    /* JADX INFO: renamed from: j */
    public final k4g f45382j;

    /* JADX INFO: renamed from: k */
    public String f45383k;

    /* JADX INFO: renamed from: l */
    public final C7097b f45384l;

    /* JADX INFO: renamed from: m */
    public final C7096a f45385m;

    /* JADX INFO: renamed from: n */
    public final sc0 f45386n;

    /* JADX INFO: renamed from: o */
    public boolean f45387o;

    /* JADX INFO: renamed from: i0c$a */
    public class C7096a implements AbstractC9063m0.b {
        public C7096a() {
        }

        @Override // p000.AbstractC9063m0.b
        public void cancel(n4g n4gVar) {
            nng nngVarTraceTask = tnc.traceTask("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (i0c.this.f45384l.f45389A) {
                    i0c.this.f45384l.cancel(n4gVar, true, null);
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

        @Override // p000.AbstractC9063m0.b
        public void writeFrame(tri triVar, boolean z, boolean z2, int i) {
            Buffer bufferM12075a;
            nng nngVarTraceTask = tnc.traceTask("OkHttpClientStream$Sink.writeFrame");
            try {
                if (triVar == null) {
                    bufferM12075a = i0c.f45378p;
                } else {
                    bufferM12075a = ((h1c) triVar).m12075a();
                    int size = (int) bufferM12075a.size();
                    if (size > 0) {
                        i0c.this.m24975c(size);
                    }
                }
                synchronized (i0c.this.f45384l.f45389A) {
                    i0c.this.f45384l.sendBuffer(bufferM12075a, z, z2);
                    i0c.this.m16527g().reportMessageSent(i);
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

        @Override // p000.AbstractC9063m0.b
        public void writeHeaders(fta ftaVar, byte[] bArr) {
            nng nngVarTraceTask = tnc.traceTask("OkHttpClientStream$Sink.writeHeaders");
            try {
                String str = pj4.f71071b + i0c.this.f45380h.getFullMethodName();
                if (bArr != null) {
                    i0c.this.f45387o = true;
                    str = str + "?" + br0.base64().encode(bArr);
                }
                synchronized (i0c.this.f45384l.f45389A) {
                    i0c.this.f45384l.streamReady(ftaVar, str);
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

    /* JADX INFO: renamed from: i0c$b */
    public class C7097b extends vm7 implements i8c.InterfaceC7185b {

        /* JADX INFO: renamed from: A */
        public final Object f45389A;

        /* JADX INFO: renamed from: B */
        @vc7("lock")
        public List<ei7> f45390B;

        /* JADX INFO: renamed from: C */
        @vc7("lock")
        public Buffer f45391C;

        /* JADX INFO: renamed from: D */
        public boolean f45392D;

        /* JADX INFO: renamed from: E */
        public boolean f45393E;

        /* JADX INFO: renamed from: F */
        @vc7("lock")
        public boolean f45394F;

        /* JADX INFO: renamed from: G */
        @vc7("lock")
        public int f45395G;

        /* JADX INFO: renamed from: H */
        @vc7("lock")
        public int f45396H;

        /* JADX INFO: renamed from: I */
        @vc7("lock")
        public final i75 f45397I;

        /* JADX INFO: renamed from: J */
        @vc7("lock")
        public final i8c f45398J;

        /* JADX INFO: renamed from: K */
        @vc7("lock")
        public final j0c f45399K;

        /* JADX INFO: renamed from: L */
        @vc7("lock")
        public boolean f45400L;

        /* JADX INFO: renamed from: M */
        public final plg f45401M;

        /* JADX INFO: renamed from: N */
        @vc7("lock")
        public i8c.C7186c f45402N;

        /* JADX INFO: renamed from: O */
        public int f45403O;

        /* JADX INFO: renamed from: z */
        public final int f45405z;

        public C7097b(int i, k4g k4gVar, Object obj, i75 i75Var, i8c i8cVar, j0c j0cVar, int i2, String str) {
            super(i, k4gVar, i0c.this.m16527g());
            this.f45391C = new Buffer();
            this.f45392D = false;
            this.f45393E = false;
            this.f45394F = false;
            this.f45400L = true;
            this.f45403O = -1;
            this.f45389A = v7d.checkNotNull(obj, "lock");
            this.f45397I = i75Var;
            this.f45398J = i8cVar;
            this.f45399K = j0cVar;
            this.f45395G = i2;
            this.f45396H = i2;
            this.f45405z = i2;
            this.f45401M = tnc.createTag(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @vc7("lock")
        public void cancel(n4g n4gVar, boolean z, fta ftaVar) throws EOFException {
            if (this.f45394F) {
                return;
            }
            this.f45394F = true;
            if (!this.f45400L) {
                this.f45399K.m13656J(m12702E(), n4gVar, p42.EnumC10788a.PROCESSED, z, w45.CANCEL, ftaVar);
                return;
            }
            this.f45399K.m13665S(i0c.this);
            this.f45390B = null;
            this.f45391C.clear();
            this.f45400L = false;
            if (ftaVar == null) {
                ftaVar = new fta();
            }
            transportReportStatus(n4gVar, true, ftaVar);
        }

        @vc7("lock")
        private void onEndOfStream() {
            if (m16535u()) {
                this.f45399K.m13656J(m12702E(), null, p42.EnumC10788a.PROCESSED, false, null, null);
            } else {
                this.f45399K.m13656J(m12702E(), null, p42.EnumC10788a.PROCESSED, false, w45.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @vc7("lock")
        public void sendBuffer(Buffer buffer, boolean z, boolean z2) {
            if (this.f45394F) {
                return;
            }
            if (!this.f45400L) {
                v7d.checkState(m12702E() != -1, "streamId should be set");
                this.f45398J.data(z, this.f45402N, buffer, z2);
            } else {
                this.f45391C.write(buffer, (int) buffer.size());
                this.f45392D |= z;
                this.f45393E |= z2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @vc7("lock")
        public void streamReady(fta ftaVar, String str) {
            this.f45390B = ji7.createRequestHeaders(ftaVar, str, i0c.this.f45383k, i0c.this.f45381i, i0c.this.f45387o, this.f45399K.m13663Q());
            this.f45399K.m13667U(i0c.this);
        }

        /* JADX INFO: renamed from: E */
        public int m12702E() {
            return this.f45403O;
        }

        /* JADX INFO: renamed from: F */
        public plg m12703F() {
            return this.f45401M;
        }

        @Override // p000.gsa.InterfaceC6484b
        @vc7("lock")
        public void bytesRead(int i) {
            int i2 = this.f45396H - i;
            this.f45396H = i2;
            float f = i2;
            int i3 = this.f45405z;
            if (f <= i3 * 0.5f) {
                int i4 = i3 - i2;
                this.f45395G += i4;
                this.f45396H = i2 + i4;
                this.f45397I.windowUpdate(m12702E(), i4);
            }
        }

        @Override // p000.gsa.InterfaceC6484b
        @vc7("lock")
        public void deframeFailed(Throwable th) throws EOFException {
            mo12704w(n4g.fromThrowable(th), true, new fta());
        }

        @Override // p000.vm7, p000.AbstractC9063m0.c, p000.gsa.InterfaceC6484b
        @vc7("lock")
        public void deframerClosed(boolean z) {
            onEndOfStream();
            super.deframerClosed(z);
        }

        public i8c.C7186c getOutboundFlowState() {
            i8c.C7186c c7186c;
            synchronized (this.f45389A) {
                c7186c = this.f45402N;
            }
            return c7186c;
        }

        @Override // p000.AbstractC14912x4.a
        @vc7("lock")
        public void onStreamAllocated() {
            super.onStreamAllocated();
            m24982g().reportLocalStreamStarted();
        }

        @Override // p000.n40.InterfaceC9690d
        @vc7("lock")
        public void runOnTransportThread(Runnable runnable) {
            synchronized (this.f45389A) {
                runnable.run();
            }
        }

        @vc7("lock")
        public void start(int i) {
            v7d.checkState(this.f45403O == -1, "the stream has been started with id %s", i);
            this.f45403O = i;
            this.f45402N = this.f45398J.createState(this, i);
            i0c.this.f45384l.onStreamAllocated();
            if (this.f45400L) {
                this.f45397I.synStream(i0c.this.f45387o, false, this.f45403O, 0, this.f45390B);
                i0c.this.f45382j.clientOutboundHeaders();
                this.f45390B = null;
                if (this.f45391C.size() > 0) {
                    this.f45398J.data(this.f45392D, this.f45402N, this.f45391C, this.f45393E);
                }
                this.f45400L = false;
            }
        }

        @vc7("lock")
        public void transportDataReceived(Buffer buffer, boolean z, int i) throws Throwable {
            int size = this.f45395G - (((int) buffer.size()) + i);
            this.f45395G = size;
            this.f45396H -= i;
            if (size >= 0) {
                super.m24069x(new m0c(buffer), z);
            } else {
                this.f45397I.rstStream(m12702E(), w45.FLOW_CONTROL_ERROR);
                this.f45399K.m13656J(m12702E(), n4g.f63272s.withDescription("Received data size exceeded our receiving window size"), p42.EnumC10788a.PROCESSED, false, null, null);
            }
        }

        @vc7("lock")
        public void transportHeadersReceived(List<ei7> list, boolean z) {
            if (z) {
                m24071z(h1i.convertTrailers(list));
            } else {
                m24070y(h1i.convertHeaders(list));
            }
        }

        @Override // p000.vm7
        @vc7("lock")
        /* JADX INFO: renamed from: w */
        public void mo12704w(n4g n4gVar, boolean z, fta ftaVar) throws EOFException {
            cancel(n4gVar, z, ftaVar);
        }
    }

    public i0c(rua<?, ?> ruaVar, fta ftaVar, i75 i75Var, j0c j0cVar, i8c i8cVar, Object obj, int i, int i2, String str, String str2, k4g k4gVar, rhh rhhVar, rn1 rn1Var, boolean z) {
        super(new i1c(), k4gVar, rhhVar, ftaVar, rn1Var, z && ruaVar.isSafe());
        this.f45385m = new C7096a();
        this.f45387o = false;
        this.f45382j = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
        this.f45380h = ruaVar;
        this.f45383k = str;
        this.f45381i = str2;
        this.f45386n = j0cVar.getAttributes();
        this.f45384l = new C7097b(i, k4gVar, obj, i75Var, i8cVar, j0cVar, i2, ruaVar.getFullMethodName());
    }

    @Override // p000.o42
    public sc0 getAttributes() {
        return this.f45386n;
    }

    public rua.EnumC12303d getType() {
        return this.f45380h.getType();
    }

    @Override // p000.AbstractC9063m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C7096a mo12693e() {
        return this.f45385m;
    }

    @Override // p000.o42
    public void setAuthority(String str) {
        this.f45383k = (String) v7d.checkNotNull(str, "authority");
    }

    @Override // p000.AbstractC9063m0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C7097b mo11340d() {
        return this.f45384l;
    }

    /* JADX INFO: renamed from: v */
    public boolean m12697v() {
        return this.f45387o;
    }
}
