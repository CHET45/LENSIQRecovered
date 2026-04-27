package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.b72;
import p000.fta;
import p000.fx2;
import p000.n4g;
import p000.p42;
import p000.rua;
import p000.vr9;
import p000.w22;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public final class x22<ReqT, RespT> extends w22<ReqT, RespT> {

    /* JADX INFO: renamed from: t */
    public static final Logger f96047t = Logger.getLogger(x22.class.getName());

    /* JADX INFO: renamed from: u */
    public static final byte[] f96048u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* JADX INFO: renamed from: v */
    public static final double f96049v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* JADX INFO: renamed from: a */
    public final rua<ReqT, RespT> f96050a;

    /* JADX INFO: renamed from: b */
    public final plg f96051b;

    /* JADX INFO: renamed from: c */
    public final Executor f96052c;

    /* JADX INFO: renamed from: d */
    public final boolean f96053d;

    /* JADX INFO: renamed from: e */
    public final vn1 f96054e;

    /* JADX INFO: renamed from: f */
    public final fx2 f96055f;

    /* JADX INFO: renamed from: g */
    public volatile ScheduledFuture<?> f96056g;

    /* JADX INFO: renamed from: h */
    public final boolean f96057h;

    /* JADX INFO: renamed from: i */
    public rn1 f96058i;

    /* JADX INFO: renamed from: j */
    public o42 f96059j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f96060k;

    /* JADX INFO: renamed from: l */
    public boolean f96061l;

    /* JADX INFO: renamed from: m */
    public boolean f96062m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC14881e f96063n;

    /* JADX INFO: renamed from: p */
    public final ScheduledExecutorService f96065p;

    /* JADX INFO: renamed from: q */
    public boolean f96066q;

    /* JADX INFO: renamed from: o */
    public final x22<ReqT, RespT>.C14882f f96064o = new C14882f();

    /* JADX INFO: renamed from: r */
    public bm3 f96067r = bm3.getDefaultInstance();

    /* JADX INFO: renamed from: s */
    public ho2 f96068s = ho2.getDefaultInstance();

    /* JADX INFO: renamed from: x22$b */
    public class C14878b extends fy2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w22.AbstractC14364a f96069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14878b(w22.AbstractC14364a abstractC14364a) {
            super(x22.this.f96055f);
            this.f96069b = abstractC14364a;
        }

        @Override // p000.fy2
        public void runInContext() {
            x22 x22Var = x22.this;
            x22Var.closeObserver(this.f96069b, ky2.statusFromCancelled(x22Var.f96055f), new fta());
        }
    }

    /* JADX INFO: renamed from: x22$c */
    public class C14879c extends fy2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w22.AbstractC14364a f96071b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f96072c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14879c(w22.AbstractC14364a abstractC14364a, String str) {
            super(x22.this.f96055f);
            this.f96071b = abstractC14364a;
            this.f96072c = str;
        }

        @Override // p000.fy2
        public void runInContext() {
            x22.this.closeObserver(this.f96071b, n4g.f63272s.withDescription(String.format("Unable to find compressor by name %s", this.f96072c)), new fta());
        }
    }

    /* JADX INFO: renamed from: x22$d */
    public class C14880d implements p42 {

        /* JADX INFO: renamed from: a */
        public final w22.AbstractC14364a<RespT> f96074a;

        /* JADX INFO: renamed from: b */
        public n4g f96075b;

        /* JADX INFO: renamed from: x22$d$a */
        public final class a extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f96077b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ fta f96078c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a79 a79Var, fta ftaVar) {
                super(x22.this.f96055f);
                this.f96077b = a79Var;
                this.f96078c = ftaVar;
            }

            private void runInternal() {
                if (C14880d.this.f96075b != null) {
                    return;
                }
                try {
                    C14880d.this.f96074a.onHeaders(this.f96078c);
                } catch (Throwable th) {
                    C14880d.this.exceptionThrown(n4g.f63259f.withCause(th).withDescription("Failed to read headers"));
                }
            }

            @Override // p000.fy2
            public void runInContext() {
                nng nngVarTraceTask = tnc.traceTask("ClientCall$Listener.headersRead");
                try {
                    tnc.attachTag(x22.this.f96051b);
                    tnc.linkIn(this.f96077b);
                    runInternal();
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

        /* JADX INFO: renamed from: x22$d$b */
        public final class b extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f96080b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ y5g.InterfaceC15496a f96081c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a79 a79Var, y5g.InterfaceC15496a interfaceC15496a) {
                super(x22.this.f96055f);
                this.f96080b = a79Var;
                this.f96081c = interfaceC15496a;
            }

            private void runInternal() {
                if (C14880d.this.f96075b != null) {
                    oc7.m18574b(this.f96081c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f96081c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            C14880d.this.f96074a.onMessage(x22.this.f96050a.parseResponse(next));
                            next.close();
                        } catch (Throwable th) {
                            oc7.closeQuietly(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        oc7.m18574b(this.f96081c);
                        C14880d.this.exceptionThrown(n4g.f63259f.withCause(th2).withDescription("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // p000.fy2
            public void runInContext() {
                nng nngVarTraceTask = tnc.traceTask("ClientCall$Listener.messagesAvailable");
                try {
                    tnc.attachTag(x22.this.f96051b);
                    tnc.linkIn(this.f96080b);
                    runInternal();
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

        /* JADX INFO: renamed from: x22$d$c */
        public final class c extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f96083b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ n4g f96084c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ fta f96085d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a79 a79Var, n4g n4gVar, fta ftaVar) {
                super(x22.this.f96055f);
                this.f96083b = a79Var;
                this.f96084c = n4gVar;
                this.f96085d = ftaVar;
            }

            private void runInternal() {
                n4g n4gVar = this.f96084c;
                fta ftaVar = this.f96085d;
                if (C14880d.this.f96075b != null) {
                    n4gVar = C14880d.this.f96075b;
                    ftaVar = new fta();
                }
                x22.this.f96060k = true;
                try {
                    C14880d c14880d = C14880d.this;
                    x22.this.closeObserver(c14880d.f96074a, n4gVar, ftaVar);
                } finally {
                    x22.this.removeContextListenerAndCancelDeadlineFuture();
                    x22.this.f96054e.reportCallEnded(n4gVar.isOk());
                }
            }

            @Override // p000.fy2
            public void runInContext() {
                nng nngVarTraceTask = tnc.traceTask("ClientCall$Listener.onClose");
                try {
                    tnc.attachTag(x22.this.f96051b);
                    tnc.linkIn(this.f96083b);
                    runInternal();
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

        /* JADX INFO: renamed from: x22$d$d */
        public final class d extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f96087b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(a79 a79Var) {
                super(x22.this.f96055f);
                this.f96087b = a79Var;
            }

            private void runInternal() {
                if (C14880d.this.f96075b != null) {
                    return;
                }
                try {
                    C14880d.this.f96074a.onReady();
                } catch (Throwable th) {
                    C14880d.this.exceptionThrown(n4g.f63259f.withCause(th).withDescription("Failed to call onReady."));
                }
            }

            @Override // p000.fy2
            public void runInContext() {
                nng nngVarTraceTask = tnc.traceTask("ClientCall$Listener.onReady");
                try {
                    tnc.attachTag(x22.this.f96051b);
                    tnc.linkIn(this.f96087b);
                    runInternal();
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

        public C14880d(w22.AbstractC14364a<RespT> abstractC14364a) {
            this.f96074a = (w22.AbstractC14364a) v7d.checkNotNull(abstractC14364a, "observer");
        }

        private void closedInternal(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
            sj3 sj3VarEffectiveDeadline = x22.this.effectiveDeadline();
            if (n4gVar.getCode() == n4g.EnumC9694b.CANCELLED && sj3VarEffectiveDeadline != null && sj3VarEffectiveDeadline.isExpired()) {
                y48 y48Var = new y48();
                x22.this.f96059j.appendTimeoutInsight(y48Var);
                n4gVar = n4g.f63262i.augmentDescription("ClientCall was cancelled at or after deadline. " + y48Var);
                ftaVar = new fta();
            }
            x22.this.f96052c.execute(new c(tnc.linkOut(), n4gVar, ftaVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void exceptionThrown(n4g n4gVar) {
            this.f96075b = n4gVar;
            x22.this.f96059j.cancel(n4gVar);
        }

        @Override // p000.p42
        public void closed(n4g n4gVar, p42.EnumC10788a enumC10788a, fta ftaVar) {
            nng nngVarTraceTask = tnc.traceTask("ClientStreamListener.closed");
            try {
                tnc.attachTag(x22.this.f96051b);
                closedInternal(n4gVar, enumC10788a, ftaVar);
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

        @Override // p000.p42
        public void headersRead(fta ftaVar) {
            nng nngVarTraceTask = tnc.traceTask("ClientStreamListener.headersRead");
            try {
                tnc.attachTag(x22.this.f96051b);
                x22.this.f96052c.execute(new a(tnc.linkOut(), ftaVar));
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

        @Override // p000.y5g
        public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
            nng nngVarTraceTask = tnc.traceTask("ClientStreamListener.messagesAvailable");
            try {
                tnc.attachTag(x22.this.f96051b);
                x22.this.f96052c.execute(new b(tnc.linkOut(), interfaceC15496a));
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

        @Override // p000.y5g
        public void onReady() {
            if (x22.this.f96050a.getType().clientSendsOneMessage()) {
                return;
            }
            nng nngVarTraceTask = tnc.traceTask("ClientStreamListener.onReady");
            try {
                tnc.attachTag(x22.this.f96051b);
                x22.this.f96052c.execute(new d(tnc.linkOut()));
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

    /* JADX INFO: renamed from: x22$e */
    public interface InterfaceC14881e {
        o42 newStream(rua<?, ?> ruaVar, rn1 rn1Var, fta ftaVar, fx2 fx2Var);
    }

    /* JADX INFO: renamed from: x22$f */
    public final class C14882f implements fx2.InterfaceC6018g {
        private C14882f() {
        }

        @Override // p000.fx2.InterfaceC6018g
        public void cancelled(fx2 fx2Var) {
            x22.this.f96059j.cancel(ky2.statusFromCancelled(fx2Var));
        }
    }

    /* JADX INFO: renamed from: x22$g */
    public class RunnableC14883g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final long f96090a;

        public RunnableC14883g(long j) {
            this.f96090a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            y48 y48Var = new y48();
            x22.this.f96059j.appendTimeoutInsight(y48Var);
            long jAbs = Math.abs(this.f96090a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f96090a) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f96090a < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            Locale locale = Locale.US;
            sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) x22.this.f96058i.getOption(q42.f73176a)) == null ? 0.0d : r2.longValue() / x22.f96049v)));
            sb.append(y48Var);
            x22.this.f96059j.cancel(n4g.f63262i.augmentDescription(sb.toString()));
        }
    }

    public x22(rua<ReqT, RespT> ruaVar, Executor executor, rn1 rn1Var, InterfaceC14881e interfaceC14881e, ScheduledExecutorService scheduledExecutorService, vn1 vn1Var, @eib ja8 ja8Var) {
        this.f96050a = ruaVar;
        plg plgVarCreateTag = tnc.createTag(ruaVar.getFullMethodName(), System.identityHashCode(this));
        this.f96051b = plgVarCreateTag;
        if (executor == xya.directExecutor()) {
            this.f96052c = new h1f();
            this.f96053d = true;
        } else {
            this.f96052c = new t2f(executor);
            this.f96053d = false;
        }
        this.f96054e = vn1Var;
        this.f96055f = fx2.current();
        this.f96057h = ruaVar.getType() == rua.EnumC12303d.UNARY || ruaVar.getType() == rua.EnumC12303d.SERVER_STREAMING;
        this.f96058i = rn1Var;
        this.f96063n = interfaceC14881e;
        this.f96065p = scheduledExecutorService;
        tnc.event("ClientCall.<init>", plgVarCreateTag);
    }

    private void applyMethodConfig() {
        vr9.C14229b c14229b = (vr9.C14229b) this.f96058i.getOption(vr9.C14229b.f92064g);
        if (c14229b == null) {
            return;
        }
        Long l = c14229b.f92065a;
        if (l != null) {
            sj3 sj3VarAfter = sj3.after(l.longValue(), TimeUnit.NANOSECONDS);
            sj3 deadline = this.f96058i.getDeadline();
            if (deadline == null || sj3VarAfter.compareTo(deadline) < 0) {
                this.f96058i = this.f96058i.withDeadline(sj3VarAfter);
            }
        }
        Boolean bool = c14229b.f92066b;
        if (bool != null) {
            this.f96058i = bool.booleanValue() ? this.f96058i.withWaitForReady() : this.f96058i.withoutWaitForReady();
        }
        if (c14229b.f92067c != null) {
            Integer maxInboundMessageSize = this.f96058i.getMaxInboundMessageSize();
            if (maxInboundMessageSize != null) {
                this.f96058i = this.f96058i.withMaxInboundMessageSize(Math.min(maxInboundMessageSize.intValue(), c14229b.f92067c.intValue()));
            } else {
                this.f96058i = this.f96058i.withMaxInboundMessageSize(c14229b.f92067c.intValue());
            }
        }
        if (c14229b.f92068d != null) {
            Integer maxOutboundMessageSize = this.f96058i.getMaxOutboundMessageSize();
            if (maxOutboundMessageSize != null) {
                this.f96058i = this.f96058i.withMaxOutboundMessageSize(Math.min(maxOutboundMessageSize.intValue(), c14229b.f92068d.intValue()));
            } else {
                this.f96058i = this.f96058i.withMaxOutboundMessageSize(c14229b.f92068d.intValue());
            }
        }
    }

    private void cancelInternal(@eib String str, @eib Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f96047t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f96061l) {
            return;
        }
        this.f96061l = true;
        try {
            if (this.f96059j != null) {
                n4g n4gVar = n4g.f63259f;
                n4g n4gVarWithDescription = str != null ? n4gVar.withDescription(str) : n4gVar.withDescription("Call cancelled without message");
                if (th != null) {
                    n4gVarWithDescription = n4gVarWithDescription.withCause(th);
                }
                this.f96059j.cancel(n4gVarWithDescription);
            }
            removeContextListenerAndCancelDeadlineFuture();
        } catch (Throwable th2) {
            removeContextListenerAndCancelDeadlineFuture();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeObserver(w22.AbstractC14364a<RespT> abstractC14364a, n4g n4gVar, fta ftaVar) {
        abstractC14364a.onClose(n4gVar, ftaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @eib
    public sj3 effectiveDeadline() {
        return min(this.f96058i.getDeadline(), this.f96055f.getDeadline());
    }

    private void halfCloseInternal() {
        v7d.checkState(this.f96059j != null, "Not started");
        v7d.checkState(!this.f96061l, "call was cancelled");
        v7d.checkState(!this.f96062m, "call already half-closed");
        this.f96062m = true;
        this.f96059j.halfClose();
    }

    private static boolean isFirstMin(@eib sj3 sj3Var, @eib sj3 sj3Var2) {
        if (sj3Var == null) {
            return false;
        }
        if (sj3Var2 == null) {
            return true;
        }
        return sj3Var.isBefore(sj3Var2);
    }

    private static void logIfContextNarrowedTimeout(sj3 sj3Var, @eib sj3 sj3Var2, @eib sj3 sj3Var3) {
        Logger logger = f96047t;
        if (logger.isLoggable(Level.FINE) && sj3Var != null && sj3Var.equals(sj3Var2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jMax = Math.max(0L, sj3Var.timeRemaining(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
            if (sj3Var3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(sj3Var3.timeRemaining(timeUnit))));
            }
            logger.fine(sb.toString());
        }
    }

    @gdi
    /* JADX INFO: renamed from: m */
    public static void m24927m(fta ftaVar, bm3 bm3Var, go2 go2Var, boolean z) {
        ftaVar.discardAll(oc7.f67140i);
        fta.AbstractC5971i<String> abstractC5971i = oc7.f67136e;
        ftaVar.discardAll(abstractC5971i);
        if (go2Var != b72.C1761b.f12832a) {
            ftaVar.put(abstractC5971i, go2Var.getMessageEncoding());
        }
        fta.AbstractC5971i<byte[]> abstractC5971i2 = oc7.f67137f;
        ftaVar.discardAll(abstractC5971i2);
        byte[] rawAdvertisedMessageEncodings = ma8.getRawAdvertisedMessageEncodings(bm3Var);
        if (rawAdvertisedMessageEncodings.length != 0) {
            ftaVar.put(abstractC5971i2, rawAdvertisedMessageEncodings);
        }
        ftaVar.discardAll(oc7.f67138g);
        fta.AbstractC5971i<byte[]> abstractC5971i3 = oc7.f67139h;
        ftaVar.discardAll(abstractC5971i3);
        if (z) {
            ftaVar.put(abstractC5971i3, f96048u);
        }
    }

    @eib
    private static sj3 min(@eib sj3 sj3Var, @eib sj3 sj3Var2) {
        return sj3Var == null ? sj3Var2 : sj3Var2 == null ? sj3Var : sj3Var.minimum(sj3Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeContextListenerAndCancelDeadlineFuture() {
        this.f96055f.removeListener(this.f96064o);
        ScheduledFuture<?> scheduledFuture = this.f96056g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void sendMessageInternal(ReqT reqt) {
        v7d.checkState(this.f96059j != null, "Not started");
        v7d.checkState(!this.f96061l, "call was cancelled");
        v7d.checkState(!this.f96062m, "call was half-closed");
        try {
            o42 o42Var = this.f96059j;
            if (o42Var instanceof j8e) {
                ((j8e) o42Var).m13885P(reqt);
            } else {
                o42Var.writeMessage(this.f96050a.streamRequest(reqt));
            }
            if (this.f96057h) {
                return;
            }
            this.f96059j.flush();
        } catch (Error e) {
            this.f96059j.cancel(n4g.f63259f.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.f96059j.cancel(n4g.f63259f.withCause(e2).withDescription("Failed to stream message"));
        }
    }

    private ScheduledFuture<?> startDeadlineTimer(sj3 sj3Var) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jTimeRemaining = sj3Var.timeRemaining(timeUnit);
        return this.f96065p.schedule(new fi9(new RunnableC14883g(jTimeRemaining)), jTimeRemaining, timeUnit);
    }

    private void startInternal(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
        go2 go2VarLookupCompressor;
        v7d.checkState(this.f96059j == null, "Already started");
        v7d.checkState(!this.f96061l, "call was cancelled");
        v7d.checkNotNull(abstractC14364a, "observer");
        v7d.checkNotNull(ftaVar, "headers");
        if (this.f96055f.isCancelled()) {
            this.f96059j = pfb.f70615a;
            this.f96052c.execute(new C14878b(abstractC14364a));
            return;
        }
        applyMethodConfig();
        String compressor = this.f96058i.getCompressor();
        if (compressor != null) {
            go2VarLookupCompressor = this.f96068s.lookupCompressor(compressor);
            if (go2VarLookupCompressor == null) {
                this.f96059j = pfb.f70615a;
                this.f96052c.execute(new C14879c(abstractC14364a, compressor));
                return;
            }
        } else {
            go2VarLookupCompressor = b72.C1761b.f12832a;
        }
        m24927m(ftaVar, this.f96067r, go2VarLookupCompressor, this.f96066q);
        sj3 sj3VarEffectiveDeadline = effectiveDeadline();
        if (sj3VarEffectiveDeadline == null || !sj3VarEffectiveDeadline.isExpired()) {
            logIfContextNarrowedTimeout(sj3VarEffectiveDeadline, this.f96055f.getDeadline(), this.f96058i.getDeadline());
            this.f96059j = this.f96063n.newStream(this.f96050a, this.f96058i, ftaVar, this.f96055f);
        } else {
            q42[] clientStreamTracers = oc7.getClientStreamTracers(this.f96058i, ftaVar, 0, false);
            String str = isFirstMin(this.f96058i.getDeadline(), this.f96055f.getDeadline()) ? "CallOptions" : "Context";
            Long l = (Long) this.f96058i.getOption(q42.f73176a);
            double dTimeRemaining = sj3VarEffectiveDeadline.timeRemaining(TimeUnit.NANOSECONDS);
            double d = f96049v;
            this.f96059j = new dp5(n4g.f63262i.withDescription(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dTimeRemaining / d), Double.valueOf(l == null ? 0.0d : l.longValue() / d))), clientStreamTracers);
        }
        if (this.f96053d) {
            this.f96059j.optimizeForDirectExecutor();
        }
        if (this.f96058i.getAuthority() != null) {
            this.f96059j.setAuthority(this.f96058i.getAuthority());
        }
        if (this.f96058i.getMaxInboundMessageSize() != null) {
            this.f96059j.setMaxInboundMessageSize(this.f96058i.getMaxInboundMessageSize().intValue());
        }
        if (this.f96058i.getMaxOutboundMessageSize() != null) {
            this.f96059j.setMaxOutboundMessageSize(this.f96058i.getMaxOutboundMessageSize().intValue());
        }
        if (sj3VarEffectiveDeadline != null) {
            this.f96059j.setDeadline(sj3VarEffectiveDeadline);
        }
        this.f96059j.setCompressor(go2VarLookupCompressor);
        boolean z = this.f96066q;
        if (z) {
            this.f96059j.setFullStreamDecompression(z);
        }
        this.f96059j.setDecompressorRegistry(this.f96067r);
        this.f96054e.reportCallStarted();
        this.f96059j.start(new C14880d(abstractC14364a));
        this.f96055f.addListener(this.f96064o, xya.directExecutor());
        if (sj3VarEffectiveDeadline != null && !sj3VarEffectiveDeadline.equals(this.f96055f.getDeadline()) && this.f96065p != null) {
            this.f96056g = startDeadlineTimer(sj3VarEffectiveDeadline);
        }
        if (this.f96060k) {
            removeContextListenerAndCancelDeadlineFuture();
        }
    }

    @Override // p000.w22
    public void cancel(@eib String str, @eib Throwable th) {
        nng nngVarTraceTask = tnc.traceTask("ClientCall.cancel");
        try {
            tnc.attachTag(this.f96051b);
            cancelInternal(str, th);
            if (nngVarTraceTask != null) {
                nngVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // p000.w22
    public sc0 getAttributes() {
        o42 o42Var = this.f96059j;
        return o42Var != null ? o42Var.getAttributes() : sc0.f81180c;
    }

    @Override // p000.w22
    public void halfClose() {
        nng nngVarTraceTask = tnc.traceTask("ClientCall.halfClose");
        try {
            tnc.attachTag(this.f96051b);
            halfCloseInternal();
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

    @Override // p000.w22
    public boolean isReady() {
        if (this.f96062m) {
            return false;
        }
        return this.f96059j.isReady();
    }

    /* JADX INFO: renamed from: n */
    public x22<ReqT, RespT> m24928n(ho2 ho2Var) {
        this.f96068s = ho2Var;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public x22<ReqT, RespT> m24929o(bm3 bm3Var) {
        this.f96067r = bm3Var;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public x22<ReqT, RespT> m24930p(boolean z) {
        this.f96066q = z;
        return this;
    }

    @Override // p000.w22
    public void request(int i) {
        nng nngVarTraceTask = tnc.traceTask("ClientCall.request");
        try {
            tnc.attachTag(this.f96051b);
            v7d.checkState(this.f96059j != null, "Not started");
            v7d.checkArgument(i >= 0, "Number requested must be non-negative");
            this.f96059j.request(i);
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

    @Override // p000.w22
    public void sendMessage(ReqT reqt) {
        nng nngVarTraceTask = tnc.traceTask("ClientCall.sendMessage");
        try {
            tnc.attachTag(this.f96051b);
            sendMessageInternal(reqt);
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

    @Override // p000.w22
    public void setMessageCompression(boolean z) {
        v7d.checkState(this.f96059j != null, "Not started");
        this.f96059j.setMessageCompression(z);
    }

    @Override // p000.w22
    public void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
        nng nngVarTraceTask = tnc.traceTask("ClientCall.start");
        try {
            tnc.attachTag(this.f96051b);
            startInternal(abstractC14364a, ftaVar);
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

    public String toString() {
        return yya.toStringHelper(this).add(FirebaseAnalytics.C3552d.f23230v, this.f96050a).toString();
    }
}
