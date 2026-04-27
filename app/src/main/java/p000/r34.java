package p000;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.w22;

/* JADX INFO: loaded from: classes7.dex */
public class r34<ReqT, RespT> extends w22<ReqT, RespT> {

    /* JADX INFO: renamed from: j */
    public static final Logger f76919j = Logger.getLogger(r34.class.getName());

    /* JADX INFO: renamed from: k */
    public static final w22<Object, Object> f76920k = new C11864j();

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ boolean f76921l = false;

    /* JADX INFO: renamed from: a */
    @eib
    public final ScheduledFuture<?> f76922a;

    /* JADX INFO: renamed from: b */
    public final Executor f76923b;

    /* JADX INFO: renamed from: c */
    public final fx2 f76924c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f76925d;

    /* JADX INFO: renamed from: e */
    public w22.AbstractC14364a<RespT> f76926e;

    /* JADX INFO: renamed from: f */
    public w22<ReqT, RespT> f76927f;

    /* JADX INFO: renamed from: g */
    @vc7("this")
    public n4g f76928g;

    /* JADX INFO: renamed from: h */
    @vc7("this")
    public List<Runnable> f76929h = new ArrayList();

    /* JADX INFO: renamed from: i */
    @vc7("this")
    public C11866l<RespT> f76930i;

    /* JADX INFO: renamed from: r34$a */
    public class C11855a extends fy2 {
        public C11855a(fx2 fx2Var) {
            super(fx2Var);
        }

        @Override // p000.fy2
        public void runInContext() {
            r34.this.drainPendingCalls();
        }
    }

    /* JADX INFO: renamed from: r34$b */
    public class RunnableC11856b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StringBuilder f76932a;

        public RunnableC11856b(StringBuilder sb) {
            this.f76932a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            r34.this.cancel(n4g.f63262i.withDescription(this.f76932a.toString()), true);
        }
    }

    /* JADX INFO: renamed from: r34$c */
    public class C11857c extends fy2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C11866l f76934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11857c(C11866l c11866l) {
            super(r34.this.f76924c);
            this.f76934b = c11866l;
        }

        @Override // p000.fy2
        public void runInContext() {
            this.f76934b.m20959b();
        }
    }

    /* JADX INFO: renamed from: r34$d */
    public class RunnableC11858d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w22.AbstractC14364a f76936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fta f76937b;

        public RunnableC11858d(w22.AbstractC14364a abstractC14364a, fta ftaVar) {
            this.f76936a = abstractC14364a;
            this.f76937b = ftaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r34.this.f76927f.start(this.f76936a, this.f76937b);
        }
    }

    /* JADX INFO: renamed from: r34$e */
    public class RunnableC11859e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n4g f76939a;

        public RunnableC11859e(n4g n4gVar) {
            this.f76939a = n4gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r34.this.f76927f.cancel(this.f76939a.getDescription(), this.f76939a.getCause());
        }
    }

    /* JADX INFO: renamed from: r34$f */
    public class RunnableC11860f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f76941a;

        public RunnableC11860f(Object obj) {
            this.f76941a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            r34.this.f76927f.sendMessage(this.f76941a);
        }
    }

    /* JADX INFO: renamed from: r34$g */
    public class RunnableC11861g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f76943a;

        public RunnableC11861g(boolean z) {
            this.f76943a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            r34.this.f76927f.setMessageCompression(this.f76943a);
        }
    }

    /* JADX INFO: renamed from: r34$h */
    public class RunnableC11862h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f76945a;

        public RunnableC11862h(int i) {
            this.f76945a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            r34.this.f76927f.request(this.f76945a);
        }
    }

    /* JADX INFO: renamed from: r34$i */
    public class RunnableC11863i implements Runnable {
        public RunnableC11863i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r34.this.f76927f.halfClose();
        }
    }

    /* JADX INFO: renamed from: r34$j */
    public class C11864j extends w22<Object, Object> {
        @Override // p000.w22
        public void cancel(String str, Throwable th) {
        }

        @Override // p000.w22
        public void halfClose() {
        }

        @Override // p000.w22
        public boolean isReady() {
            return false;
        }

        @Override // p000.w22
        public void request(int i) {
        }

        @Override // p000.w22
        public void sendMessage(Object obj) {
        }

        @Override // p000.w22
        public void start(w22.AbstractC14364a<Object> abstractC14364a, fta ftaVar) {
        }
    }

    /* JADX INFO: renamed from: r34$k */
    public final class C11865k extends fy2 {

        /* JADX INFO: renamed from: b */
        public final w22.AbstractC14364a<RespT> f76948b;

        /* JADX INFO: renamed from: c */
        public final n4g f76949c;

        public C11865k(w22.AbstractC14364a<RespT> abstractC14364a, n4g n4gVar) {
            super(r34.this.f76924c);
            this.f76948b = abstractC14364a;
            this.f76949c = n4gVar;
        }

        @Override // p000.fy2
        public void runInContext() {
            this.f76948b.onClose(this.f76949c, new fta());
        }
    }

    /* JADX INFO: renamed from: r34$l */
    public static final class C11866l<RespT> extends w22.AbstractC14364a<RespT> {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ boolean f76951d = false;

        /* JADX INFO: renamed from: a */
        public final w22.AbstractC14364a<RespT> f76952a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f76953b;

        /* JADX INFO: renamed from: c */
        @vc7("this")
        public List<Runnable> f76954c = new ArrayList();

        /* JADX INFO: renamed from: r34$l$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fta f76955a;

            public a(fta ftaVar) {
                this.f76955a = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11866l.this.f76952a.onHeaders(this.f76955a);
            }
        }

        /* JADX INFO: renamed from: r34$l$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f76957a;

            public b(Object obj) {
                this.f76957a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11866l.this.f76952a.onMessage(this.f76957a);
            }
        }

        /* JADX INFO: renamed from: r34$l$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ n4g f76959a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ fta f76960b;

            public c(n4g n4gVar, fta ftaVar) {
                this.f76959a = n4gVar;
                this.f76960b = ftaVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11866l.this.f76952a.onClose(this.f76959a, this.f76960b);
            }
        }

        /* JADX INFO: renamed from: r34$l$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C11866l.this.f76952a.onReady();
            }
        }

        public C11866l(w22.AbstractC14364a<RespT> abstractC14364a) {
            this.f76952a = abstractC14364a;
        }

        private void delayOrExecute(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f76953b) {
                        runnable.run();
                    } else {
                        this.f76954c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m20959b() {
            List<Runnable> list;
            List<Runnable> arrayList = new ArrayList<>();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f76954c.isEmpty()) {
                            this.f76954c = null;
                            this.f76953b = true;
                            return;
                        } else {
                            list = this.f76954c;
                            this.f76954c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<Runnable> it = list.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                list.clear();
                arrayList = list;
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onClose(n4g n4gVar, fta ftaVar) {
            delayOrExecute(new c(n4gVar, ftaVar));
        }

        @Override // p000.w22.AbstractC14364a
        public void onHeaders(fta ftaVar) {
            if (this.f76953b) {
                this.f76952a.onHeaders(ftaVar);
            } else {
                delayOrExecute(new a(ftaVar));
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onMessage(RespT respt) {
            if (this.f76953b) {
                this.f76952a.onMessage(respt);
            } else {
                delayOrExecute(new b(respt));
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onReady() {
            if (this.f76953b) {
                this.f76952a.onReady();
            } else {
                delayOrExecute(new d());
            }
        }
    }

    public r34(Executor executor, ScheduledExecutorService scheduledExecutorService, @eib sj3 sj3Var) {
        this.f76923b = (Executor) v7d.checkNotNull(executor, "callExecutor");
        v7d.checkNotNull(scheduledExecutorService, "scheduler");
        this.f76924c = fx2.current();
        this.f76922a = scheduleDeadlineIfNeeded(scheduledExecutorService, sj3Var);
    }

    private void delayOrExecute(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f76925d) {
                    runnable.run();
                } else {
                    this.f76929h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0.next().run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drainPendingCalls() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f76929h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f76929h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f76925d = r0     // Catch: java.lang.Throwable -> L24
            r34$l<RespT> r0 = r3.f76930i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f76923b
            r34$c r2 = new r34$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List<java.lang.Runnable> r1 = r3.f76929h     // Catch: java.lang.Throwable -> L24
            r3.f76929h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r34.drainPendingCalls():void");
    }

    private boolean isAbeforeB(@eib sj3 sj3Var, @eib sj3 sj3Var2) {
        if (sj3Var2 == null) {
            return true;
        }
        if (sj3Var == null) {
            return false;
        }
        return sj3Var.isBefore(sj3Var2);
    }

    @eib
    private ScheduledFuture<?> scheduleDeadlineIfNeeded(ScheduledExecutorService scheduledExecutorService, @eib sj3 sj3Var) {
        sj3 deadline = this.f76924c.getDeadline();
        if (sj3Var == null && deadline == null) {
            return null;
        }
        long jTimeRemaining = sj3Var != null ? sj3Var.timeRemaining(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (deadline != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (deadline.timeRemaining(timeUnit) < jTimeRemaining) {
                jTimeRemaining = deadline.timeRemaining(timeUnit);
                Logger logger = f76919j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jTimeRemaining)));
                    if (sj3Var == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(sj3Var.timeRemaining(timeUnit))));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long jAbs = Math.abs(jTimeRemaining);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit2.toNanos(1L);
        long jAbs2 = Math.abs(jTimeRemaining) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str = isAbeforeB(deadline, sj3Var) ? "Context" : "CallOptions";
        if (jTimeRemaining < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str);
            sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb2.append("Deadline ");
            sb2.append(str);
            sb2.append(" will be exceeded in ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new RunnableC11856b(sb2), jTimeRemaining, TimeUnit.NANOSECONDS);
    }

    @vc7("this")
    private void setRealCall(w22<ReqT, RespT> w22Var) {
        w22<ReqT, RespT> w22Var2 = this.f76927f;
        v7d.checkState(w22Var2 == null, "realCall already set to %s", w22Var2);
        ScheduledFuture<?> scheduledFuture = this.f76922a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f76927f = w22Var;
    }

    @Override // p000.w22
    public final void cancel(@eib String str, @eib Throwable th) {
        n4g n4gVar = n4g.f63259f;
        n4g n4gVarWithDescription = str != null ? n4gVar.withDescription(str) : n4gVar.withDescription("Call cancelled without message");
        if (th != null) {
            n4gVarWithDescription = n4gVarWithDescription.withCause(th);
        }
        cancel(n4gVarWithDescription, false);
    }

    /* JADX INFO: renamed from: e */
    public void mo20611e() {
    }

    @gdi
    /* JADX INFO: renamed from: f */
    public final w22<ReqT, RespT> m20957f() {
        return this.f76927f;
    }

    @Override // p000.w22
    public final sc0 getAttributes() {
        w22<ReqT, RespT> w22Var;
        synchronized (this) {
            w22Var = this.f76927f;
        }
        return w22Var != null ? w22Var.getAttributes() : sc0.f81180c;
    }

    @Override // p000.w22
    public final void halfClose() {
        delayOrExecute(new RunnableC11863i());
    }

    @Override // p000.w22
    public final boolean isReady() {
        if (this.f76925d) {
            return this.f76927f.isReady();
        }
        return false;
    }

    @Override // p000.w22
    public final void request(int i) {
        if (this.f76925d) {
            this.f76927f.request(i);
        } else {
            delayOrExecute(new RunnableC11862h(i));
        }
    }

    @Override // p000.w22
    public final void sendMessage(ReqT reqt) {
        if (this.f76925d) {
            this.f76927f.sendMessage(reqt);
        } else {
            delayOrExecute(new RunnableC11860f(reqt));
        }
    }

    public final Runnable setCall(w22<ReqT, RespT> w22Var) {
        synchronized (this) {
            try {
                if (this.f76927f != null) {
                    return null;
                }
                setRealCall((w22) v7d.checkNotNull(w22Var, NotificationCompat.CATEGORY_CALL));
                return new C11855a(this.f76924c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.w22
    public final void setMessageCompression(boolean z) {
        if (this.f76925d) {
            this.f76927f.setMessageCompression(z);
        } else {
            delayOrExecute(new RunnableC11861g(z));
        }
    }

    @Override // p000.w22
    public final void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
        n4g n4gVar;
        boolean z;
        v7d.checkState(this.f76926e == null, "already started");
        synchronized (this) {
            try {
                this.f76926e = (w22.AbstractC14364a) v7d.checkNotNull(abstractC14364a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                n4gVar = this.f76928g;
                z = this.f76925d;
                if (!z) {
                    C11866l<RespT> c11866l = new C11866l<>(abstractC14364a);
                    this.f76930i = c11866l;
                    abstractC14364a = c11866l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n4gVar != null) {
            this.f76923b.execute(new C11865k(abstractC14364a, n4gVar));
        } else if (z) {
            this.f76927f.start(abstractC14364a, ftaVar);
        } else {
            delayOrExecute(new RunnableC11858d(abstractC14364a, ftaVar));
        }
    }

    public String toString() {
        return yya.toStringHelper(this).add("realCall", this.f76927f).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void cancel(n4g n4gVar, boolean z) {
        boolean z2;
        w22.AbstractC14364a<RespT> abstractC14364a;
        synchronized (this) {
            try {
                if (this.f76927f == null) {
                    setRealCall(f76920k);
                    abstractC14364a = this.f76926e;
                    this.f76928g = n4gVar;
                    z2 = false;
                } else {
                    if (z) {
                        return;
                    }
                    z2 = true;
                    abstractC14364a = null;
                }
                if (z2) {
                    delayOrExecute(new RunnableC11859e(n4gVar));
                } else {
                    if (abstractC14364a != null) {
                        this.f76923b.execute(new C11865k(abstractC14364a, n4gVar));
                    }
                    drainPendingCalls();
                }
                mo20611e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
