package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p000.a32;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@p7e({p7e.EnumC10826a.f69936c})
public class lxe {

    /* JADX INFO: renamed from: i */
    public static final int f59167i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f59168j = 0;

    /* JADX INFO: renamed from: b */
    @xc7("mLock")
    public HandlerThread f59170b;

    /* JADX INFO: renamed from: c */
    @xc7("mLock")
    public Handler f59171c;

    /* JADX INFO: renamed from: f */
    public final int f59174f;

    /* JADX INFO: renamed from: g */
    public final int f59175g;

    /* JADX INFO: renamed from: h */
    public final String f59176h;

    /* JADX INFO: renamed from: a */
    public final Object f59169a = new Object();

    /* JADX INFO: renamed from: e */
    public Handler.Callback f59173e = new C9031a();

    /* JADX INFO: renamed from: d */
    @xc7("mLock")
    public int f59172d = 0;

    /* JADX INFO: renamed from: lxe$a */
    public class C9031a implements Handler.Callback {
        public C9031a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                lxe.this.m16459a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            lxe.this.m16460b((Runnable) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: lxe$b */
    public class RunnableC9032b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f59178a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Handler f59179b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9034d f59180c;

        /* JADX INFO: renamed from: lxe$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f59182a;

            public a(Object obj) {
                this.f59182a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC9032b.this.f59180c.onReply(this.f59182a);
            }
        }

        public RunnableC9032b(Callable callable, Handler handler, InterfaceC9034d interfaceC9034d) {
            this.f59178a = callable;
            this.f59179b = handler;
            this.f59180c = interfaceC9034d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f59178a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f59179b.post(new a(objCall));
        }
    }

    /* JADX INFO: renamed from: lxe$c */
    public class RunnableC9033c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f59184a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Callable f59185b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReentrantLock f59186c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicBoolean f59187d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Condition f59188e;

        public RunnableC9033c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f59184a = atomicReference;
            this.f59185b = callable;
            this.f59186c = reentrantLock;
            this.f59187d = atomicBoolean;
            this.f59188e = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f59184a.set(this.f59185b.call());
            } catch (Exception unused) {
            }
            this.f59186c.lock();
            try {
                this.f59187d.set(false);
                this.f59188e.signal();
            } finally {
                this.f59186c.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: lxe$d */
    public interface InterfaceC9034d<T> {
        void onReply(T t);
    }

    public lxe(String str, int i, int i2) {
        this.f59176h = str;
        this.f59175g = i;
        this.f59174f = i2;
    }

    private void post(Runnable runnable) {
        synchronized (this.f59169a) {
            try {
                if (this.f59170b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f59176h, this.f59175g);
                    this.f59170b = handlerThread;
                    handlerThread.start();
                    this.f59171c = new Handler(this.f59170b.getLooper(), this.f59173e);
                    this.f59172d++;
                }
                this.f59171c.removeMessages(0);
                Handler handler = this.f59171c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16459a() {
        synchronized (this.f59169a) {
            try {
                if (this.f59171c.hasMessages(1)) {
                    return;
                }
                this.f59170b.quit();
                this.f59170b = null;
                this.f59171c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16460b(Runnable runnable) {
        runnable.run();
        synchronized (this.f59169a) {
            this.f59171c.removeMessages(0);
            Handler handler = this.f59171c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f59174f);
        }
    }

    @fdi
    public int getGeneration() {
        int i;
        synchronized (this.f59169a) {
            i = this.f59172d;
        }
        return i;
    }

    @fdi
    public boolean isRunning() {
        boolean z;
        synchronized (this.f59169a) {
            z = this.f59170b != null;
        }
        return z;
    }

    public <T> void postAndReply(Callable<T> callable, InterfaceC9034d<T> interfaceC9034d) {
        post(new RunnableC9032b(callable, ro1.m21446a(), interfaceC9034d));
    }

    public <T> T postAndWait(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        post(new RunnableC9033c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException(a32.C0034g.f248b);
        } finally {
            reentrantLock.unlock();
        }
    }
}
