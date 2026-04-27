package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mo0<T> {

    /* JADX INFO: renamed from: a */
    public final oe7 f61590a;

    /* JADX INFO: renamed from: b */
    public final oe7 f61591b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9428a<T> f61592c;

    /* JADX INFO: renamed from: d */
    public T f61593d;

    /* JADX INFO: renamed from: e */
    public T f61594e;

    /* JADX INFO: renamed from: f */
    public int f61595f;

    /* JADX INFO: renamed from: mo0$a */
    public interface InterfaceC9428a<T> {
        void onStateChanged(T t, T t2);
    }

    public mo0(T t, Looper looper, Looper looper2, j52 j52Var, InterfaceC9428a<T> interfaceC9428a) {
        this.f61590a = j52Var.createHandler(looper, null);
        this.f61591b = j52Var.createHandler(looper2, null);
        this.f61593d = t;
        this.f61594e = t;
        this.f61592c = interfaceC9428a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$setStateInBackground$2(Object obj) {
        if (this.f61595f == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$updateStateAsync$0(Object obj) {
        int i = this.f61595f - 1;
        this.f61595f = i;
        if (i == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateAsync$1(lz6 lz6Var) {
        final T t = (T) lz6Var.apply(this.f61594e);
        this.f61594e = t;
        runInForeground(new Runnable() { // from class: lo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f58341a.lambda$updateStateAsync$0(t);
            }
        });
    }

    private void runInForeground(Runnable runnable) {
        if (this.f61591b.getLooper().getThread().isAlive()) {
            this.f61591b.post(runnable);
        }
    }

    private void updateStateInForeground(T t) {
        T t2 = this.f61593d;
        this.f61593d = t;
        if (t2.equals(t)) {
            return;
        }
        this.f61592c.onStateChanged(t2, t);
    }

    public T get() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f61591b.getLooper()) {
            return this.f61593d;
        }
        v80.checkState(looperMyLooper == this.f61590a.getLooper());
        return this.f61594e;
    }

    public void runInBackground(Runnable runnable) {
        if (this.f61590a.getLooper().getThread().isAlive()) {
            this.f61590a.post(runnable);
        }
    }

    public void setStateInBackground(final T t) {
        this.f61594e = t;
        runInForeground(new Runnable() { // from class: ko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f54822a.lambda$setStateInBackground$2(t);
            }
        });
    }

    public void updateStateAsync(lz6<T, T> lz6Var, final lz6<T, T> lz6Var2) {
        v80.checkState(Looper.myLooper() == this.f61591b.getLooper());
        this.f61595f++;
        runInBackground(new Runnable() { // from class: jo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f51318a.lambda$updateStateAsync$1(lz6Var2);
            }
        });
        updateStateInForeground(lz6Var.apply(this.f61593d));
    }
}
