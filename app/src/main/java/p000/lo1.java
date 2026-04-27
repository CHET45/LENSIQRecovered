package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class lo1 {

    /* JADX INFO: renamed from: lo1$a */
    public static final class C8911a<T> {

        /* JADX INFO: renamed from: a */
        public Object f58343a;

        /* JADX INFO: renamed from: b */
        public C8914d<T> f58344b;

        /* JADX INFO: renamed from: c */
        public o5e<Void> f58345c = o5e.create();

        /* JADX INFO: renamed from: d */
        public boolean f58346d;

        private void setCompletedNormally() {
            this.f58343a = null;
            this.f58344b = null;
            this.f58345c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m16261a() {
            this.f58343a = null;
            this.f58344b = null;
            this.f58345c.set(null);
        }

        public void addCancellationListener(@efb Runnable runnable, @efb Executor executor) {
            o5e<Void> o5eVar = this.f58345c;
            if (o5eVar != null) {
                o5eVar.addListener(runnable, executor);
            }
        }

        public void finalize() {
            o5e<Void> o5eVar;
            C8914d<T> c8914d = this.f58344b;
            if (c8914d != null && !c8914d.isDone()) {
                c8914d.m16264c(new C8912b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f58343a));
            }
            if (this.f58346d || (o5eVar = this.f58345c) == null) {
                return;
            }
            o5eVar.set(null);
        }

        public boolean set(T t) {
            this.f58346d = true;
            C8914d<T> c8914d = this.f58344b;
            boolean z = c8914d != null && c8914d.m16263b(t);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public boolean setCancelled() {
            this.f58346d = true;
            C8914d<T> c8914d = this.f58344b;
            boolean z = c8914d != null && c8914d.m16262a(true);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public boolean setException(@efb Throwable th) {
            this.f58346d = true;
            C8914d<T> c8914d = this.f58344b;
            boolean z = c8914d != null && c8914d.m16264c(th);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: lo1$b */
    public static final class C8912b extends Throwable {
        public C8912b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: lo1$c */
    public interface InterfaceC8913c<T> {
        @hib
        Object attachCompleter(@efb C8911a<T> c8911a) throws Exception;
    }

    /* JADX INFO: renamed from: lo1$d */
    public static final class C8914d<T> implements ja9<T> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<C8911a<T>> f58347a;

        /* JADX INFO: renamed from: b */
        public final AbstractC15958z3<T> f58348b = new a();

        /* JADX INFO: renamed from: lo1$d$a */
        public class a extends AbstractC15958z3<T> {
            public a() {
            }

            @Override // p000.AbstractC15958z3
            /* JADX INFO: renamed from: h */
            public String mo16265h() {
                C8911a<T> c8911a = C8914d.this.f58347a.get();
                if (c8911a == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + c8911a.f58343a + "]";
            }
        }

        public C8914d(C8911a<T> c8911a) {
            this.f58347a = new WeakReference<>(c8911a);
        }

        /* JADX INFO: renamed from: a */
        public boolean m16262a(boolean z) {
            return this.f58348b.cancel(z);
        }

        @Override // p000.ja9
        public void addListener(@efb Runnable runnable, @efb Executor executor) {
            this.f58348b.addListener(runnable, executor);
        }

        /* JADX INFO: renamed from: b */
        public boolean m16263b(T t) {
            return this.f58348b.set(t);
        }

        /* JADX INFO: renamed from: c */
        public boolean m16264c(Throwable th) {
            return this.f58348b.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C8911a<T> c8911a = this.f58347a.get();
            boolean zCancel = this.f58348b.cancel(z);
            if (zCancel && c8911a != null) {
                c8911a.m16261a();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f58348b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f58348b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f58348b.isDone();
        }

        public String toString() {
            return this.f58348b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, @efb TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f58348b.get(j, timeUnit);
        }
    }

    private lo1() {
    }

    @efb
    public static <T> ja9<T> getFuture(@efb InterfaceC8913c<T> interfaceC8913c) {
        C8911a<T> c8911a = new C8911a<>();
        C8914d<T> c8914d = new C8914d<>(c8911a);
        c8911a.f58344b = c8914d;
        c8911a.f58343a = interfaceC8913c.getClass();
        try {
            Object objAttachCompleter = interfaceC8913c.attachCompleter(c8911a);
            if (objAttachCompleter != null) {
                c8911a.f58343a = objAttachCompleter;
            }
        } catch (Exception e) {
            c8914d.m16264c(e);
        }
        return c8914d;
    }
}
