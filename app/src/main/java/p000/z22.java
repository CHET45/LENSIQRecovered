package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.rn1;
import p000.w22;

/* JADX INFO: loaded from: classes7.dex */
public final class z22 {

    /* JADX INFO: renamed from: a */
    public static final Logger f103702a = Logger.getLogger(z22.class.getName());

    /* JADX INFO: renamed from: b */
    @gdi
    public static boolean f103703b;

    /* JADX INFO: renamed from: c */
    public static final rn1.C12165c<EnumC15934g> f103704c;

    /* JADX INFO: renamed from: z22$b */
    public static final class C15929b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final BlockingQueue<Object> f103705a = new ArrayBlockingQueue(3);

        /* JADX INFO: renamed from: b */
        public final AbstractC15932e<T> f103706b = new a();

        /* JADX INFO: renamed from: c */
        public final w22<?, T> f103707c;

        /* JADX INFO: renamed from: d */
        public Object f103708d;

        /* JADX INFO: renamed from: z22$b$a */
        public final class a extends AbstractC15932e<T> {

            /* JADX INFO: renamed from: a */
            public boolean f103709a;

            public a() {
                super();
                this.f103709a = false;
            }

            @Override // p000.z22.AbstractC15932e
            /* JADX INFO: renamed from: a */
            public void mo26496a() {
                C15929b.this.f103707c.request(1);
            }

            @Override // p000.w22.AbstractC14364a
            public void onClose(n4g n4gVar, fta ftaVar) {
                v7d.checkState(!this.f103709a, "ClientCall already closed");
                if (n4gVar.isOk()) {
                    C15929b.this.f103705a.add(C15929b.this);
                } else {
                    C15929b.this.f103705a.add(n4gVar.asRuntimeException(ftaVar));
                }
                this.f103709a = true;
            }

            @Override // p000.w22.AbstractC14364a
            public void onHeaders(fta ftaVar) {
            }

            @Override // p000.w22.AbstractC14364a
            public void onMessage(T t) {
                v7d.checkState(!this.f103709a, "ClientCall already closed");
                C15929b.this.f103705a.add(t);
            }
        }

        public C15929b(w22<?, T> w22Var) {
            this.f103707c = w22Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.Object waitForNext() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
            L1:
                java.util.concurrent.BlockingQueue<java.lang.Object> r1 = r5.f103705a     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
                java.lang.Object r1 = r1.take()     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L13
                if (r0 == 0) goto L10
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L10:
                return r1
            L11:
                r1 = move-exception
                goto L22
            L13:
                r0 = move-exception
                r1 = 1
                w22<?, T> r2 = r5.f103707c     // Catch: java.lang.Throwable -> L1e
                java.lang.String r3 = "Thread interrupted"
                r2.cancel(r3, r0)     // Catch: java.lang.Throwable -> L1e
                r0 = r1
                goto L1
            L1e:
                r0 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L22:
                if (r0 == 0) goto L2b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L2b:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.z22.C15929b.waitForNext():java.lang.Object");
        }

        /* JADX INFO: renamed from: c */
        public AbstractC15932e<T> m26495c() {
            return this.f103706b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Object obj;
            while (true) {
                obj = this.f103708d;
                if (obj != null) {
                    break;
                }
                this.f103708d = waitForNext();
            }
            if (!(obj instanceof v4g)) {
                return obj != this;
            }
            v4g v4gVar = (v4g) obj;
            throw v4gVar.getStatus().asRuntimeException(v4gVar.getTrailers());
        }

        @Override // java.util.Iterator
        public T next() {
            Object obj = this.f103708d;
            if (!(obj instanceof v4g) && obj != this) {
                this.f103707c.request(1);
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) this.f103708d;
            this.f103708d = null;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: z22$c */
    public static final class C15930c<ReqT> extends y22<ReqT> {

        /* JADX INFO: renamed from: a */
        public boolean f103711a;

        /* JADX INFO: renamed from: b */
        public final w22<ReqT, ?> f103712b;

        /* JADX INFO: renamed from: c */
        public final boolean f103713c;

        /* JADX INFO: renamed from: d */
        public Runnable f103714d;

        /* JADX INFO: renamed from: e */
        public int f103715e = 1;

        /* JADX INFO: renamed from: f */
        public boolean f103716f = true;

        /* JADX INFO: renamed from: g */
        public boolean f103717g = false;

        /* JADX INFO: renamed from: h */
        public boolean f103718h = false;

        public C15930c(w22<ReqT, ?> w22Var, boolean z) {
            this.f103712b = w22Var;
            this.f103713c = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void freeze() {
            this.f103711a = true;
        }

        @Override // p000.y22
        public void cancel(@eib String str, @eib Throwable th) {
            this.f103712b.cancel(str, th);
        }

        @Override // p000.tn1
        public void disableAutoInboundFlowControl() {
            disableAutoRequestWithInitial(1);
        }

        @Override // p000.y22
        public void disableAutoRequestWithInitial(int i) {
            if (this.f103711a) {
                throw new IllegalStateException("Cannot disable auto flow control after call started. Use ClientResponseObserver");
            }
            v7d.checkArgument(i >= 0, "Initial requests must be non-negative");
            this.f103715e = i;
            this.f103716f = false;
        }

        @Override // p000.y22, p000.tn1
        public boolean isReady() {
            return this.f103712b.isReady();
        }

        @Override // p000.c6g
        public void onCompleted() {
            this.f103712b.halfClose();
            this.f103718h = true;
        }

        @Override // p000.c6g
        public void onError(Throwable th) {
            this.f103712b.cancel("Cancelled by client with StreamObserver.onError()", th);
            this.f103717g = true;
        }

        @Override // p000.c6g
        public void onNext(ReqT reqt) {
            v7d.checkState(!this.f103717g, "Stream was terminated by error, no further calls are allowed");
            v7d.checkState(!this.f103718h, "Stream is already completed, no further calls are allowed");
            this.f103712b.sendMessage(reqt);
        }

        @Override // p000.y22, p000.tn1
        public void request(int i) {
            if (this.f103713c || i != 1) {
                this.f103712b.request(i);
            } else {
                this.f103712b.request(2);
            }
        }

        @Override // p000.y22, p000.tn1
        public void setMessageCompression(boolean z) {
            this.f103712b.setMessageCompression(z);
        }

        @Override // p000.y22, p000.tn1
        public void setOnReadyHandler(Runnable runnable) {
            if (this.f103711a) {
                throw new IllegalStateException("Cannot alter onReadyHandler after call started. Use ClientResponseObserver");
            }
            this.f103714d = runnable;
        }
    }

    /* JADX INFO: renamed from: z22$d */
    public static final class C15931d<RespT> extends AbstractC9640n1<RespT> {

        /* JADX INFO: renamed from: F */
        public final w22<?, RespT> f103719F;

        public C15931d(w22<?, RespT> w22Var) {
            this.f103719F = w22Var;
        }

        @Override // p000.AbstractC9640n1
        /* JADX INFO: renamed from: l */
        public void mo14637l() {
            this.f103719F.cancel("GrpcFuture was cancelled", null);
        }

        @Override // p000.AbstractC9640n1
        /* JADX INFO: renamed from: n */
        public String mo2823n() {
            return yya.toStringHelper(this).add("clientCall", this.f103719F).toString();
        }

        @Override // p000.AbstractC9640n1
        public boolean set(@eib RespT respt) {
            return super.set(respt);
        }

        @Override // p000.AbstractC9640n1
        public boolean setException(Throwable th) {
            return super.setException(th);
        }
    }

    /* JADX INFO: renamed from: z22$e */
    public static abstract class AbstractC15932e<T> extends w22.AbstractC14364a<T> {
        private AbstractC15932e() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo26496a();
    }

    /* JADX INFO: renamed from: z22$f */
    public static final class C15933f<ReqT, RespT> extends AbstractC15932e<RespT> {

        /* JADX INFO: renamed from: a */
        public final c6g<RespT> f103720a;

        /* JADX INFO: renamed from: b */
        public final C15930c<ReqT> f103721b;

        /* JADX INFO: renamed from: c */
        public boolean f103722c;

        public C15933f(c6g<RespT> c6gVar, C15930c<ReqT> c15930c) {
            super();
            this.f103720a = c6gVar;
            this.f103721b = c15930c;
            if (c6gVar instanceof k42) {
                ((k42) c6gVar).beforeStart(c15930c);
            }
            c15930c.freeze();
        }

        @Override // p000.z22.AbstractC15932e
        /* JADX INFO: renamed from: a */
        public void mo26496a() {
            if (this.f103721b.f103715e > 0) {
                C15930c<ReqT> c15930c = this.f103721b;
                c15930c.request(c15930c.f103715e);
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onClose(n4g n4gVar, fta ftaVar) {
            if (n4gVar.isOk()) {
                this.f103720a.onCompleted();
            } else {
                this.f103720a.onError(n4gVar.asRuntimeException(ftaVar));
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onHeaders(fta ftaVar) {
        }

        @Override // p000.w22.AbstractC14364a
        public void onMessage(RespT respt) {
            if (this.f103722c && !this.f103721b.f103713c) {
                throw n4g.f63272s.withDescription("More than one responses received for unary or client-streaming call").asRuntimeException();
            }
            this.f103722c = true;
            this.f103720a.onNext(respt);
            if (this.f103721b.f103713c && this.f103721b.f103716f) {
                this.f103721b.request(1);
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onReady() {
            if (this.f103721b.f103714d != null) {
                this.f103721b.f103714d.run();
            }
        }
    }

    /* JADX INFO: renamed from: z22$g */
    public enum EnumC15934g {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    /* JADX INFO: renamed from: z22$h */
    public static final class ExecutorC15935h extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* JADX INFO: renamed from: b */
        public static final Logger f103727b = Logger.getLogger(ExecutorC15935h.class.getName());

        /* JADX INFO: renamed from: c */
        public static final Object f103728c = new Object();

        /* JADX INFO: renamed from: a */
        public volatile Object f103729a;

        private static void runQuietly(Runnable runnable) {
            try {
                runnable.run();
            } catch (Throwable th) {
                f103727b.log(Level.WARNING, "Runnable threw exception", th);
            }
        }

        private static void throwIfInterrupted() throws InterruptedException {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f103729a;
            if (obj != f103728c) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && z22.f103703b) {
                throw new RejectedExecutionException();
            }
        }

        public void shutdown() {
            this.f103729a = f103728c;
            while (true) {
                Runnable runnablePoll = poll();
                if (runnablePoll == null) {
                    return;
                } else {
                    runQuietly(runnablePoll);
                }
            }
        }

        public void waitAndDrain() throws InterruptedException {
            Runnable runnablePoll;
            throwIfInterrupted();
            Runnable runnablePoll2 = poll();
            if (runnablePoll2 == null) {
                this.f103729a = Thread.currentThread();
                while (true) {
                    try {
                        runnablePoll = poll();
                        if (runnablePoll != null) {
                            break;
                        }
                        LockSupport.park(this);
                        throwIfInterrupted();
                    } catch (Throwable th) {
                        this.f103729a = null;
                        throw th;
                    }
                }
                this.f103729a = null;
                runnablePoll2 = runnablePoll;
            }
            do {
                runQuietly(runnablePoll2);
                runnablePoll2 = poll();
            } while (runnablePoll2 != null);
        }
    }

    /* JADX INFO: renamed from: z22$i */
    public static final class C15936i<RespT> extends AbstractC15932e<RespT> {

        /* JADX INFO: renamed from: a */
        public final C15931d<RespT> f103730a;

        /* JADX INFO: renamed from: b */
        public RespT f103731b;

        /* JADX INFO: renamed from: c */
        public boolean f103732c;

        public C15936i(C15931d<RespT> c15931d) {
            super();
            this.f103732c = false;
            this.f103730a = c15931d;
        }

        @Override // p000.z22.AbstractC15932e
        /* JADX INFO: renamed from: a */
        public void mo26496a() {
            this.f103730a.f103719F.request(2);
        }

        @Override // p000.w22.AbstractC14364a
        public void onClose(n4g n4gVar, fta ftaVar) {
            if (!n4gVar.isOk()) {
                this.f103730a.setException(n4gVar.asRuntimeException(ftaVar));
                return;
            }
            if (!this.f103732c) {
                this.f103730a.setException(n4g.f63272s.withDescription("No value received for unary call").asRuntimeException(ftaVar));
            }
            this.f103730a.set(this.f103731b);
        }

        @Override // p000.w22.AbstractC14364a
        public void onHeaders(fta ftaVar) {
        }

        @Override // p000.w22.AbstractC14364a
        public void onMessage(RespT respt) {
            if (this.f103732c) {
                throw n4g.f63272s.withDescription("More than one value received for unary call").asRuntimeException();
            }
            this.f103731b = respt;
            this.f103732c = true;
        }
    }

    static {
        f103703b = !u8g.isNullOrEmpty(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f103704c = rn1.C12165c.create("internal-stub-type");
    }

    private z22() {
    }

    public static <ReqT, RespT> c6g<ReqT> asyncBidiStreamingCall(w22<ReqT, RespT> w22Var, c6g<RespT> c6gVar) {
        v7d.checkNotNull(c6gVar, "responseObserver");
        return asyncStreamingRequestCall(w22Var, c6gVar, true);
    }

    public static <ReqT, RespT> c6g<ReqT> asyncClientStreamingCall(w22<ReqT, RespT> w22Var, c6g<RespT> c6gVar) {
        v7d.checkNotNull(c6gVar, "responseObserver");
        return asyncStreamingRequestCall(w22Var, c6gVar, false);
    }

    public static <ReqT, RespT> void asyncServerStreamingCall(w22<ReqT, RespT> w22Var, ReqT reqt, c6g<RespT> c6gVar) {
        v7d.checkNotNull(c6gVar, "responseObserver");
        asyncUnaryRequestCall(w22Var, reqt, c6gVar, true);
    }

    private static <ReqT, RespT> c6g<ReqT> asyncStreamingRequestCall(w22<ReqT, RespT> w22Var, c6g<RespT> c6gVar, boolean z) {
        C15930c c15930c = new C15930c(w22Var, z);
        startCall(w22Var, new C15933f(c6gVar, c15930c));
        return c15930c;
    }

    public static <ReqT, RespT> void asyncUnaryCall(w22<ReqT, RespT> w22Var, ReqT reqt, c6g<RespT> c6gVar) {
        v7d.checkNotNull(c6gVar, "responseObserver");
        asyncUnaryRequestCall(w22Var, reqt, c6gVar, false);
    }

    private static <ReqT, RespT> void asyncUnaryRequestCall(w22<ReqT, RespT> w22Var, ReqT reqt, c6g<RespT> c6gVar, boolean z) {
        asyncUnaryRequestCall(w22Var, reqt, new C15933f(c6gVar, new C15930c(w22Var, z)));
    }

    public static <ReqT, RespT> Iterator<RespT> blockingServerStreamingCall(w22<ReqT, RespT> w22Var, ReqT reqt) {
        C15929b c15929b = new C15929b(w22Var);
        asyncUnaryRequestCall(w22Var, reqt, c15929b.m26495c());
        return c15929b;
    }

    public static <ReqT, RespT> RespT blockingUnaryCall(w22<ReqT, RespT> w22Var, ReqT reqt) {
        try {
            return (RespT) getUnchecked(futureUnaryCall(w22Var, reqt));
        } catch (Error | RuntimeException e) {
            throw cancelThrow(w22Var, e);
        }
    }

    private static RuntimeException cancelThrow(w22<?, ?> w22Var, Throwable th) {
        try {
            w22Var.cancel(null, th);
        } catch (Error | RuntimeException e) {
            f103702a.log(Level.SEVERE, "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    public static <ReqT, RespT> ja9<RespT> futureUnaryCall(w22<ReqT, RespT> w22Var, ReqT reqt) {
        C15931d c15931d = new C15931d(w22Var);
        asyncUnaryRequestCall(w22Var, reqt, new C15936i(c15931d));
        return c15931d;
    }

    private static <V> V getUnchecked(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw n4g.f63259f.withDescription("Thread interrupted").withCause(e).asRuntimeException();
        } catch (ExecutionException e2) {
            throw toStatusRuntimeException(e2.getCause());
        }
    }

    private static <ReqT, RespT> void startCall(w22<ReqT, RespT> w22Var, AbstractC15932e<RespT> abstractC15932e) {
        w22Var.start(abstractC15932e, new fta());
        abstractC15932e.mo26496a();
    }

    private static v4g toStatusRuntimeException(Throwable th) {
        for (Throwable cause = (Throwable) v7d.checkNotNull(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof q4g) {
                q4g q4gVar = (q4g) cause;
                return new v4g(q4gVar.getStatus(), q4gVar.getTrailers());
            }
            if (cause instanceof v4g) {
                v4g v4gVar = (v4g) cause;
                return new v4g(v4gVar.getStatus(), v4gVar.getTrailers());
            }
        }
        return n4g.f63260g.withDescription("unexpected exception").withCause(th).asRuntimeException();
    }

    private static <ReqT, RespT> void asyncUnaryRequestCall(w22<ReqT, RespT> w22Var, ReqT reqt, AbstractC15932e<RespT> abstractC15932e) {
        startCall(w22Var, abstractC15932e);
        try {
            w22Var.sendMessage(reqt);
            w22Var.halfClose();
        } catch (Error | RuntimeException e) {
            throw cancelThrow(w22Var, e);
        }
    }

    public static <ReqT, RespT> Iterator<RespT> blockingServerStreamingCall(bu1 bu1Var, rua<ReqT, RespT> ruaVar, rn1 rn1Var, ReqT reqt) {
        w22 w22VarNewCall = bu1Var.newCall(ruaVar, rn1Var.withOption(f103704c, EnumC15934g.BLOCKING));
        C15929b c15929b = new C15929b(w22VarNewCall);
        asyncUnaryRequestCall(w22VarNewCall, reqt, c15929b.m26495c());
        return c15929b;
    }

    public static <ReqT, RespT> RespT blockingUnaryCall(bu1 bu1Var, rua<ReqT, RespT> ruaVar, rn1 rn1Var, ReqT reqt) throws Throwable {
        ExecutorC15935h executorC15935h = new ExecutorC15935h();
        w22 w22VarNewCall = bu1Var.newCall(ruaVar, rn1Var.withOption(f103704c, EnumC15934g.BLOCKING).withExecutor(executorC15935h));
        boolean z = false;
        try {
            try {
                ja9 ja9VarFutureUnaryCall = futureUnaryCall(w22VarNewCall, reqt);
                while (!ja9VarFutureUnaryCall.isDone()) {
                    try {
                        executorC15935h.waitAndDrain();
                    } catch (InterruptedException e) {
                        try {
                            w22VarNewCall.cancel("Thread interrupted", e);
                            z = true;
                        } catch (Error e2) {
                            e = e2;
                            throw cancelThrow(w22VarNewCall, e);
                        } catch (RuntimeException e3) {
                            e = e3;
                            throw cancelThrow(w22VarNewCall, e);
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                executorC15935h.shutdown();
                RespT respt = (RespT) getUnchecked(ja9VarFutureUnaryCall);
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return respt;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
