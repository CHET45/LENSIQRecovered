package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.h36;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ya9<T> {

    /* JADX INFO: renamed from: j */
    public static final int f100970j = 1;

    /* JADX INFO: renamed from: a */
    public final j52 f100971a;

    /* JADX INFO: renamed from: b */
    public final oe7 f100972b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15591b<T> f100973c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet<C15592c<T>> f100974d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque<Runnable> f100975e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<Runnable> f100976f;

    /* JADX INFO: renamed from: g */
    public final Object f100977g;

    /* JADX INFO: renamed from: h */
    @xc7("releasedLock")
    public boolean f100978h;

    /* JADX INFO: renamed from: i */
    public boolean f100979i;

    /* JADX INFO: renamed from: ya9$a */
    public interface InterfaceC15590a<T> {
        void invoke(T t);
    }

    /* JADX INFO: renamed from: ya9$b */
    public interface InterfaceC15591b<T> {
        void invoke(T t, h36 h36Var);
    }

    /* JADX INFO: renamed from: ya9$c */
    public static final class C15592c<T> {

        /* JADX INFO: renamed from: a */
        public final T f100980a;

        /* JADX INFO: renamed from: b */
        public h36.C6691b f100981b = new h36.C6691b();

        /* JADX INFO: renamed from: c */
        public boolean f100982c;

        /* JADX INFO: renamed from: d */
        public boolean f100983d;

        public C15592c(T t) {
            this.f100980a = t;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C15592c.class != obj.getClass()) {
                return false;
            }
            return this.f100980a.equals(((C15592c) obj).f100980a);
        }

        public int hashCode() {
            return this.f100980a.hashCode();
        }

        public void invoke(int i, InterfaceC15590a<T> interfaceC15590a) {
            if (this.f100983d) {
                return;
            }
            if (i != -1) {
                this.f100981b.add(i);
            }
            this.f100982c = true;
            interfaceC15590a.invoke(this.f100980a);
        }

        public void iterationFinished(InterfaceC15591b<T> interfaceC15591b) {
            if (this.f100983d || !this.f100982c) {
                return;
            }
            h36 h36VarBuild = this.f100981b.build();
            this.f100981b = new h36.C6691b();
            this.f100982c = false;
            interfaceC15591b.invoke(this.f100980a, h36VarBuild);
        }

        public void release(InterfaceC15591b<T> interfaceC15591b) {
            this.f100983d = true;
            if (this.f100982c) {
                this.f100982c = false;
                interfaceC15591b.invoke(this.f100980a, this.f100981b.build());
            }
        }
    }

    public ya9(Looper looper, j52 j52Var, InterfaceC15591b<T> interfaceC15591b) {
        this(new CopyOnWriteArraySet(), looper, j52Var, interfaceC15591b, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        Iterator<C15592c<T>> it = this.f100974d.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.f100973c);
            if (this.f100972b.hasMessages(1)) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC15590a interfaceC15590a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C15592c) it.next()).invoke(i, interfaceC15590a);
        }
    }

    private void verifyCurrentThread() {
        if (this.f100979i) {
            v80.checkState(Thread.currentThread() == this.f100972b.getLooper().getThread());
        }
    }

    public void add(T t) {
        v80.checkNotNull(t);
        synchronized (this.f100977g) {
            try {
                if (this.f100978h) {
                    return;
                }
                this.f100974d.add(new C15592c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clear() {
        verifyCurrentThread();
        Iterator<C15592c<T>> it = this.f100974d.iterator();
        while (it.hasNext()) {
            it.next().release(this.f100973c);
        }
        this.f100974d.clear();
    }

    @yx1
    public ya9<T> copy(Looper looper, InterfaceC15591b<T> interfaceC15591b) {
        return copy(looper, this.f100971a, interfaceC15591b);
    }

    public void flushEvents() {
        verifyCurrentThread();
        if (this.f100976f.isEmpty()) {
            return;
        }
        if (!this.f100972b.hasMessages(1)) {
            oe7 oe7Var = this.f100972b;
            oe7Var.sendMessageAtFrontOfQueue(oe7Var.obtainMessage(1));
        }
        boolean zIsEmpty = this.f100975e.isEmpty();
        this.f100975e.addAll(this.f100976f);
        this.f100976f.clear();
        if (zIsEmpty) {
            while (!this.f100975e.isEmpty()) {
                this.f100975e.peekFirst().run();
                this.f100975e.removeFirst();
            }
        }
    }

    public void queueEvent(final int i, final InterfaceC15590a<T> interfaceC15590a) {
        verifyCurrentThread();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f100974d);
        this.f100976f.add(new Runnable() { // from class: xa9
            @Override // java.lang.Runnable
            public final void run() {
                ya9.lambda$queueEvent$0(copyOnWriteArraySet, i, interfaceC15590a);
            }
        });
    }

    public void release() {
        verifyCurrentThread();
        synchronized (this.f100977g) {
            this.f100978h = true;
        }
        Iterator<C15592c<T>> it = this.f100974d.iterator();
        while (it.hasNext()) {
            it.next().release(this.f100973c);
        }
        this.f100974d.clear();
    }

    public void remove(T t) {
        verifyCurrentThread();
        for (C15592c<T> c15592c : this.f100974d) {
            if (c15592c.f100980a.equals(t)) {
                c15592c.release(this.f100973c);
                this.f100974d.remove(c15592c);
            }
        }
    }

    public void sendEvent(int i, InterfaceC15590a<T> interfaceC15590a) {
        queueEvent(i, interfaceC15590a);
        flushEvents();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.f100979i = z;
    }

    public int size() {
        verifyCurrentThread();
        return this.f100974d.size();
    }

    private ya9(CopyOnWriteArraySet<C15592c<T>> copyOnWriteArraySet, Looper looper, j52 j52Var, InterfaceC15591b<T> interfaceC15591b, boolean z) {
        this.f100971a = j52Var;
        this.f100974d = copyOnWriteArraySet;
        this.f100973c = interfaceC15591b;
        this.f100977g = new Object();
        this.f100975e = new ArrayDeque<>();
        this.f100976f = new ArrayDeque<>();
        this.f100972b = j52Var.createHandler(looper, new Handler.Callback() { // from class: va9
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f90468a.handleMessage(message);
            }
        });
        this.f100979i = z;
    }

    @yx1
    public ya9<T> copy(Looper looper, j52 j52Var, InterfaceC15591b<T> interfaceC15591b) {
        return new ya9<>(this.f100974d, looper, j52Var, interfaceC15591b, this.f100979i);
    }
}
