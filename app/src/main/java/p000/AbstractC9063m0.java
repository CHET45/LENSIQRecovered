package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.AbstractC14912x4;
import p000.b72;
import p000.fta;
import p000.jsa;
import p000.p42;
import p000.ymh;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC9063m0 extends AbstractC14912x4 implements o42, jsa.InterfaceC8056d {

    /* JADX INFO: renamed from: g */
    public static final Logger f59490g = Logger.getLogger(AbstractC9063m0.class.getName());

    /* JADX INFO: renamed from: a */
    public final rhh f59491a;

    /* JADX INFO: renamed from: b */
    public final pv6 f59492b;

    /* JADX INFO: renamed from: c */
    public boolean f59493c;

    /* JADX INFO: renamed from: d */
    public boolean f59494d;

    /* JADX INFO: renamed from: e */
    public fta f59495e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f59496f;

    /* JADX INFO: renamed from: m0$a */
    public class a implements pv6 {

        /* JADX INFO: renamed from: a */
        public fta f59497a;

        /* JADX INFO: renamed from: b */
        public boolean f59498b;

        /* JADX INFO: renamed from: c */
        public final k4g f59499c;

        /* JADX INFO: renamed from: d */
        public byte[] f59500d;

        public a(fta ftaVar, k4g k4gVar) {
            this.f59497a = (fta) v7d.checkNotNull(ftaVar, "headers");
            this.f59499c = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
        }

        @Override // p000.pv6
        public void close() {
            this.f59498b = true;
            v7d.checkState(this.f59500d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC9063m0.this.mo12693e().writeHeaders(this.f59497a, this.f59500d);
            this.f59500d = null;
            this.f59497a = null;
        }

        @Override // p000.pv6
        public void dispose() {
            this.f59498b = true;
            this.f59500d = null;
            this.f59497a = null;
        }

        @Override // p000.pv6
        public void flush() {
        }

        @Override // p000.pv6
        public boolean isClosed() {
            return this.f59498b;
        }

        @Override // p000.pv6
        public pv6 setCompressor(go2 go2Var) {
            return this;
        }

        @Override // p000.pv6
        public void setMaxOutboundMessageSize(int i) {
        }

        @Override // p000.pv6
        public pv6 setMessageCompression(boolean z) {
            return this;
        }

        @Override // p000.pv6
        public void writePayload(InputStream inputStream) {
            v7d.checkState(this.f59500d == null, "writePayload should not be called multiple times");
            try {
                this.f59500d = tj1.toByteArray(inputStream);
                this.f59499c.outboundMessage(0);
                k4g k4gVar = this.f59499c;
                byte[] bArr = this.f59500d;
                k4gVar.outboundMessageSent(0, bArr.length, bArr.length);
                this.f59499c.outboundUncompressedSize(this.f59500d.length);
                this.f59499c.outboundWireSize(this.f59500d.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: m0$b */
    public interface b {
        void cancel(n4g n4gVar);

        void writeFrame(@eib tri triVar, boolean z, boolean z2, int i);

        void writeHeaders(fta ftaVar, @eib byte[] bArr);
    }

    /* JADX INFO: renamed from: m0$c */
    public static abstract class c extends AbstractC14912x4.a {

        /* JADX INFO: renamed from: j */
        public final k4g f59502j;

        /* JADX INFO: renamed from: k */
        public boolean f59503k;

        /* JADX INFO: renamed from: l */
        public p42 f59504l;

        /* JADX INFO: renamed from: m */
        public boolean f59505m;

        /* JADX INFO: renamed from: n */
        public bm3 f59506n;

        /* JADX INFO: renamed from: o */
        public boolean f59507o;

        /* JADX INFO: renamed from: p */
        public Runnable f59508p;

        /* JADX INFO: renamed from: q */
        public volatile boolean f59509q;

        /* JADX INFO: renamed from: r */
        public boolean f59510r;

        /* JADX INFO: renamed from: s */
        public boolean f59511s;

        /* JADX INFO: renamed from: m0$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ n4g f59512a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ p42.EnumC10788a f59513b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ fta f59514c;

            public a(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
                this.f59512a = n4gVar;
                this.f59513b = enumC10788a;
                this.f59514c = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.closeListener(this.f59512a, this.f59513b, this.f59514c);
            }
        }

        public c(int i, k4g k4gVar, rhh rhhVar) {
            super(i, k4gVar, rhhVar);
            this.f59506n = bm3.getDefaultInstance();
            this.f59507o = false;
            this.f59502j = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void closeListener(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
            if (this.f59503k) {
                return;
            }
            this.f59503k = true;
            this.f59502j.streamClosed(n4gVar);
            if (m24982g() != null) {
                m24982g().reportStreamClosed(n4gVar.isOk());
            }
            mo11346h().closed(n4gVar, enumC10788a, ftaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDecompressorRegistry(bm3 bm3Var) {
            v7d.checkState(this.f59504l == null, "Already called start");
            this.f59506n = (bm3) v7d.checkNotNull(bm3Var, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFullStreamDecompression(boolean z) {
            this.f59505m = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setOutboundClosed() {
            this.f59509q = true;
        }

        public void deframerClosed(boolean z) {
            v7d.checkState(this.f59510r, "status should have been reported on deframer closed");
            this.f59507o = true;
            if (this.f59511s && z) {
                transportReportStatus(n4g.f63272s.withDescription("Encountered end-of-stream mid-frame"), true, new fta());
            }
            Runnable runnable = this.f59508p;
            if (runnable != null) {
                runnable.run();
                this.f59508p = null;
            }
        }

        /* JADX INFO: renamed from: r */
        public void m16532r(frd frdVar) throws Throwable {
            v7d.checkNotNull(frdVar, ymh.InterfaceC15722a.f102093L);
            boolean z = true;
            try {
                if (this.f59510r) {
                    AbstractC9063m0.f59490g.log(Level.INFO, "Received data on closed stream");
                    frdVar.close();
                    return;
                } else {
                    try {
                        m24981f(frdVar);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (z) {
                frdVar.close();
            }
            throw th;
        }

        /* JADX INFO: renamed from: s */
        public void m16533s(fta ftaVar) {
            boolean z = true;
            v7d.checkState(!this.f59510r, "Received headers on closed stream");
            this.f59502j.clientInboundHeaders();
            String str = (String) ftaVar.get(oc7.f67138g);
            if (!this.f59505m || str == null) {
                z = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                m24986l(new md7());
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    deframeFailed(n4g.f63272s.withDescription(String.format("Can't find full stream decompressor for %s", str)).asRuntimeException());
                    return;
                }
                z = false;
            }
            String str2 = (String) ftaVar.get(oc7.f67136e);
            if (str2 != null) {
                am3 am3VarLookupDecompressor = this.f59506n.lookupDecompressor(str2);
                if (am3VarLookupDecompressor == null) {
                    deframeFailed(n4g.f63272s.withDescription(String.format("Can't find decompressor for %s", str2)).asRuntimeException());
                    return;
                } else if (am3VarLookupDecompressor != b72.C1761b.f12832a) {
                    if (z) {
                        deframeFailed(n4g.f63272s.withDescription("Full stream and gRPC message encoding cannot both be set").asRuntimeException());
                        return;
                    }
                    m24985k(am3VarLookupDecompressor);
                }
            }
            mo11346h().headersRead(ftaVar);
        }

        @gdi
        public final void setListener(p42 p42Var) {
            v7d.checkState(this.f59504l == null, "Already called setListener");
            this.f59504l = (p42) v7d.checkNotNull(p42Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }

        /* JADX INFO: renamed from: t */
        public void m16534t(fta ftaVar, n4g n4gVar) {
            v7d.checkNotNull(n4gVar, "status");
            v7d.checkNotNull(ftaVar, oc7.f67148q);
            if (this.f59510r) {
                AbstractC9063m0.f59490g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{n4gVar, ftaVar});
            } else {
                this.f59502j.clientInboundTrailers(ftaVar);
                transportReportStatus(n4gVar, false, ftaVar);
            }
        }

        public final void transportReportStatus(n4g n4gVar, boolean z, fta ftaVar) {
            transportReportStatus(n4gVar, p42.EnumC10788a.PROCESSED, z, ftaVar);
        }

        /* JADX INFO: renamed from: u */
        public final boolean m16535u() {
            return this.f59509q;
        }

        @Override // p000.AbstractC14912x4.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final p42 mo11346h() {
            return this.f59504l;
        }

        public final void transportReportStatus(n4g n4gVar, p42.EnumC10788a enumC10788a, boolean z, fta ftaVar) {
            v7d.checkNotNull(n4gVar, "status");
            v7d.checkNotNull(ftaVar, oc7.f67148q);
            if (!this.f59510r || z) {
                this.f59510r = true;
                this.f59511s = n4gVar.isOk();
                m24983i();
                if (this.f59507o) {
                    this.f59508p = null;
                    closeListener(n4gVar, enumC10788a, ftaVar);
                } else {
                    this.f59508p = new a(n4gVar, enumC10788a, ftaVar);
                    m24980e(z);
                }
            }
        }
    }

    public AbstractC9063m0(uri uriVar, k4g k4gVar, rhh rhhVar, fta ftaVar, rn1 rn1Var, boolean z) {
        v7d.checkNotNull(ftaVar, "headers");
        this.f59491a = (rhh) v7d.checkNotNull(rhhVar, "transportTracer");
        this.f59493c = oc7.shouldBeCountedForInUse(rn1Var);
        this.f59494d = z;
        if (z) {
            this.f59492b = new a(ftaVar, k4gVar);
        } else {
            this.f59492b = new jsa(this, uriVar, k4gVar);
            this.f59495e = ftaVar;
        }
    }

    @Override // p000.o42
    public final void appendTimeoutInsight(y48 y48Var) {
        y48Var.appendKeyValue("remote_addr", getAttributes().get(cc7.f16232a));
    }

    @Override // p000.AbstractC14912x4
    /* JADX INFO: renamed from: b */
    public final pv6 mo11339b() {
        return this.f59492b;
    }

    @Override // p000.o42
    public final void cancel(n4g n4gVar) {
        v7d.checkArgument(!n4gVar.isOk(), "Should not cancel with OK status");
        this.f59496f = true;
        mo12693e().cancel(n4gVar);
    }

    @Override // p000.jsa.InterfaceC8056d
    public final void deliverFrame(tri triVar, boolean z, boolean z2, int i) {
        v7d.checkArgument(triVar != null || z, "null frame before EOS");
        mo12693e().writeFrame(triVar, z, z2, i);
    }

    /* JADX INFO: renamed from: e */
    public abstract b mo12693e();

    /* JADX INFO: renamed from: g */
    public rhh m16527g() {
        return this.f59491a;
    }

    @Override // p000.AbstractC14912x4
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract c mo11340d();

    @Override // p000.o42
    public final void halfClose() {
        if (mo11340d().m16535u()) {
            return;
        }
        mo11340d().setOutboundClosed();
        m24974a();
    }

    @Override // p000.AbstractC14912x4, p000.n5g
    public final boolean isReady() {
        return super.isReady() && !this.f59496f;
    }

    @Override // p000.o42
    public void setDeadline(sj3 sj3Var) {
        fta ftaVar = this.f59495e;
        fta.AbstractC5971i<Long> abstractC5971i = oc7.f67135d;
        ftaVar.discardAll(abstractC5971i);
        this.f59495e.put(abstractC5971i, Long.valueOf(Math.max(0L, sj3Var.timeRemaining(TimeUnit.NANOSECONDS))));
    }

    @Override // p000.o42
    public final void setDecompressorRegistry(bm3 bm3Var) {
        mo11340d().setDecompressorRegistry(bm3Var);
    }

    @Override // p000.o42
    public final void setFullStreamDecompression(boolean z) {
        mo11340d().setFullStreamDecompression(z);
    }

    @Override // p000.o42
    public void setMaxInboundMessageSize(int i) {
        mo11340d().m24987m(i);
    }

    @Override // p000.o42
    public void setMaxOutboundMessageSize(int i) {
        this.f59492b.setMaxOutboundMessageSize(i);
    }

    public final boolean shouldBeCountedForInUse() {
        return this.f59493c;
    }

    @Override // p000.o42
    public final void start(p42 p42Var) {
        mo11340d().setListener(p42Var);
        if (this.f59494d) {
            return;
        }
        mo12693e().writeHeaders(this.f59495e, null);
        this.f59495e = null;
    }
}
