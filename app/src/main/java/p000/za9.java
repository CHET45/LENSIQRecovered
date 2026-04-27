package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.i36;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class za9<T> {

    /* JADX INFO: renamed from: j */
    public static final int f104618j = 0;

    /* JADX INFO: renamed from: a */
    public final h52 f104619a;

    /* JADX INFO: renamed from: b */
    public final pe7 f104620b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16058b<T> f104621c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet<C16059c<T>> f104622d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque<Runnable> f104623e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<Runnable> f104624f;

    /* JADX INFO: renamed from: g */
    public final Object f104625g;

    /* JADX INFO: renamed from: h */
    @xc7("releasedLock")
    public boolean f104626h;

    /* JADX INFO: renamed from: i */
    public boolean f104627i;

    /* JADX INFO: renamed from: za9$a */
    public interface InterfaceC16057a<T> {
        void invoke(T t);
    }

    /* JADX INFO: renamed from: za9$b */
    public interface InterfaceC16058b<T> {
        void invoke(T t, i36 i36Var);
    }

    /* JADX INFO: renamed from: za9$c */
    public static final class C16059c<T> {

        /* JADX INFO: renamed from: a */
        public final T f104628a;

        /* JADX INFO: renamed from: b */
        public i36.C7126b f104629b = new i36.C7126b();

        /* JADX INFO: renamed from: c */
        public boolean f104630c;

        /* JADX INFO: renamed from: d */
        public boolean f104631d;

        public C16059c(T t) {
            this.f104628a = t;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16059c.class != obj.getClass()) {
                return false;
            }
            return this.f104628a.equals(((C16059c) obj).f104628a);
        }

        public int hashCode() {
            return this.f104628a.hashCode();
        }

        public void invoke(int i, InterfaceC16057a<T> interfaceC16057a) {
            if (this.f104631d) {
                return;
            }
            if (i != -1) {
                this.f104629b.add(i);
            }
            this.f104630c = true;
            interfaceC16057a.invoke(this.f104628a);
        }

        public void iterationFinished(InterfaceC16058b<T> interfaceC16058b) {
            if (this.f104631d || !this.f104630c) {
                return;
            }
            i36 i36VarBuild = this.f104629b.build();
            this.f104629b = new i36.C7126b();
            this.f104630c = false;
            interfaceC16058b.invoke(this.f104628a, i36VarBuild);
        }

        public void release(InterfaceC16058b<T> interfaceC16058b) {
            this.f104631d = true;
            if (this.f104630c) {
                this.f104630c = false;
                interfaceC16058b.invoke(this.f104628a, this.f104629b.build());
            }
        }
    }

    public za9(Looper looper, h52 h52Var, InterfaceC16058b<T> interfaceC16058b) {
        this(new CopyOnWriteArraySet(), looper, h52Var, interfaceC16058b, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        Iterator<C16059c<T>> it = this.f104622d.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.f104621c);
            if (this.f104620b.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC16057a interfaceC16057a) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C16059c) it.next()).invoke(i, interfaceC16057a);
        }
    }

    private void verifyCurrentThread() {
        if (this.f104627i) {
            u80.checkState(Thread.currentThread() == this.f104620b.getLooper().getThread());
        }
    }

    public void add(T t) {
        u80.checkNotNull(t);
        synchronized (this.f104625g) {
            try {
                if (this.f104626h) {
                    return;
                }
                this.f104622d.add(new C16059c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clear() {
        verifyCurrentThread();
        this.f104622d.clear();
    }

    @yx1
    public za9<T> copy(Looper looper, InterfaceC16058b<T> interfaceC16058b) {
        return copy(looper, this.f104619a, interfaceC16058b);
    }

    public void flushEvents() {
        verifyCurrentThread();
        if (this.f104624f.isEmpty()) {
            return;
        }
        if (!this.f104620b.hasMessages(0)) {
            pe7 pe7Var = this.f104620b;
            pe7Var.sendMessageAtFrontOfQueue(pe7Var.obtainMessage(0));
        }
        boolean zIsEmpty = this.f104623e.isEmpty();
        this.f104623e.addAll(this.f104624f);
        this.f104624f.clear();
        if (zIsEmpty) {
            while (!this.f104623e.isEmpty()) {
                this.f104623e.peekFirst().run();
                this.f104623e.removeFirst();
            }
        }
    }

    public void queueEvent(final int i, final InterfaceC16057a<T> interfaceC16057a) {
        verifyCurrentThread();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f104622d);
        this.f104624f.add(new Runnable() { // from class: wa9
            @Override // java.lang.Runnable
            public final void run() {
                za9.lambda$queueEvent$0(copyOnWriteArraySet, i, interfaceC16057a);
            }
        });
    }

    public void release() {
        verifyCurrentThread();
        synchronized (this.f104625g) {
            this.f104626h = true;
        }
        Iterator<C16059c<T>> it = this.f104622d.iterator();
        while (it.hasNext()) {
            it.next().release(this.f104621c);
        }
        this.f104622d.clear();
    }

    public void remove(T t) {
        verifyCurrentThread();
        for (C16059c<T> c16059c : this.f104622d) {
            if (c16059c.f104628a.equals(t)) {
                c16059c.release(this.f104621c);
                this.f104622d.remove(c16059c);
            }
        }
    }

    public void sendEvent(int i, InterfaceC16057a<T> interfaceC16057a) {
        queueEvent(i, interfaceC16057a);
        flushEvents();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.f104627i = z;
    }

    public int size() {
        verifyCurrentThread();
        return this.f104622d.size();
    }

    private za9(CopyOnWriteArraySet<C16059c<T>> copyOnWriteArraySet, Looper looper, h52 h52Var, InterfaceC16058b<T> interfaceC16058b, boolean z) {
        this.f104619a = h52Var;
        this.f104622d = copyOnWriteArraySet;
        this.f104621c = interfaceC16058b;
        this.f104625g = new Object();
        this.f104623e = new ArrayDeque<>();
        this.f104624f = new ArrayDeque<>();
        this.f104620b = h52Var.createHandler(looper, new Handler.Callback() { // from class: ua9
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f87294a.handleMessage(message);
            }
        });
        this.f104627i = z;
    }

    @yx1
    public za9<T> copy(Looper looper, h52 h52Var, InterfaceC16058b<T> interfaceC16058b) {
        return new za9<>(this.f104622d, looper, h52Var, interfaceC16058b, this.f104627i);
    }
}
