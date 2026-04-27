package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class wye<T> extends xye<T> implements Iterator<T>, zy2<bth>, uo8 {

    /* JADX INFO: renamed from: a */
    public int f95792a;

    /* JADX INFO: renamed from: b */
    @gib
    public T f95793b;

    /* JADX INFO: renamed from: c */
    @gib
    public Iterator<? extends T> f95794c;

    /* JADX INFO: renamed from: d */
    @gib
    public zy2<? super bth> f95795d;

    private final Throwable exceptionalState() {
        int i = this.f95792a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f95792a);
    }

    private final T nextNotReady() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return a05.f2a;
    }

    @gib
    public final zy2<bth> getNextStep() {
        return this.f95795d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.f95792a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw exceptionalState();
                }
                Iterator<? extends T> it = this.f95794c;
                md8.checkNotNull(it);
                if (it.hasNext()) {
                    this.f95792a = 2;
                    return true;
                }
                this.f95794c = null;
            }
            this.f95792a = 5;
            zy2<? super bth> zy2Var = this.f95795d;
            md8.checkNotNull(zy2Var);
            this.f95795d = null;
            v7e.C13927a c13927a = v7e.f90266b;
            zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i = this.f95792a;
        if (i == 0 || i == 1) {
            return nextNotReady();
        }
        if (i == 2) {
            this.f95792a = 1;
            Iterator<? extends T> it = this.f95794c;
            md8.checkNotNull(it);
            return it.next();
        }
        if (i != 3) {
            throw exceptionalState();
        }
        this.f95792a = 0;
        T t = this.f95793b;
        this.f95793b = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000.zy2
    public void resumeWith(@yfb Object obj) {
        y7e.throwOnFailure(obj);
        this.f95792a = 4;
    }

    public final void setNextStep(@gib zy2<? super bth> zy2Var) {
        this.f95795d = zy2Var;
    }

    @Override // p000.xye
    @gib
    public Object yield(T t, @yfb zy2<? super bth> zy2Var) {
        this.f95793b = t;
        this.f95792a = 3;
        this.f95795d = zy2Var;
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return coroutine_suspended == pd8.getCOROUTINE_SUSPENDED() ? coroutine_suspended : bth.f14751a;
    }

    @Override // p000.xye
    @gib
    public Object yieldAll(@yfb Iterator<? extends T> it, @yfb zy2<? super bth> zy2Var) {
        if (!it.hasNext()) {
            return bth.f14751a;
        }
        this.f95794c = it;
        this.f95792a = 2;
        this.f95795d = zy2Var;
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return coroutine_suspended == pd8.getCOROUTINE_SUSPENDED() ? coroutine_suspended : bth.f14751a;
    }
}
