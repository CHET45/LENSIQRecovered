package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class r71<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends T> f77161a;

    /* JADX INFO: renamed from: r71$a */
    public static final class C11913a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final C11914b<T> f77162a;

        /* JADX INFO: renamed from: b */
        public final zjd<? extends T> f77163b;

        /* JADX INFO: renamed from: c */
        public T f77164c;

        /* JADX INFO: renamed from: d */
        public boolean f77165d = true;

        /* JADX INFO: renamed from: e */
        public boolean f77166e = true;

        /* JADX INFO: renamed from: f */
        public Throwable f77167f;

        /* JADX INFO: renamed from: m */
        public boolean f77168m;

        public C11913a(zjd<? extends T> items, C11914b<T> subscriber) {
            this.f77163b = items;
            this.f77162a = subscriber;
        }

        private boolean moveToNext() {
            try {
                if (!this.f77168m) {
                    this.f77168m = true;
                    this.f77162a.m21077d();
                    l86.fromPublisher(this.f77163b).materialize().subscribe((kj6<? super jgb<T>>) this.f77162a);
                }
                jgb<T> jgbVarTakeNext = this.f77162a.takeNext();
                if (jgbVarTakeNext.isOnNext()) {
                    this.f77166e = false;
                    this.f77164c = jgbVarTakeNext.getValue();
                    return true;
                }
                this.f77165d = false;
                if (jgbVarTakeNext.isOnComplete()) {
                    return false;
                }
                Throwable error = jgbVarTakeNext.getError();
                this.f77167f = error;
                throw k75.wrapOrThrow(error);
            } catch (InterruptedException e) {
                this.f77162a.dispose();
                this.f77167f = e;
                throw k75.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f77167f;
            if (th != null) {
                throw k75.wrapOrThrow(th);
            }
            if (this.f77165d) {
                return !this.f77166e || moveToNext();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f77167f;
            if (th != null) {
                throw k75.wrapOrThrow(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f77166e = true;
            return this.f77164c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: renamed from: r71$b */
    public static final class C11914b<T> extends ng4<jgb<T>> {

        /* JADX INFO: renamed from: b */
        public final BlockingQueue<jgb<T>> f77169b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f77170c = new AtomicInteger();

        /* JADX INFO: renamed from: d */
        public void m21077d() {
            this.f77170c.set(1);
        }

        @Override // p000.ycg
        public void onComplete() {
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            ofe.onError(e);
        }

        public jgb<T> takeNext() throws InterruptedException {
            m21077d();
            s71.verifyNonBlocking();
            return this.f77169b.take();
        }

        @Override // p000.ycg
        public void onNext(jgb<T> args) {
            if (this.f77170c.getAndSet(0) == 1 || !args.isOnNext()) {
                while (!this.f77169b.offer(args)) {
                    jgb<T> jgbVarPoll = this.f77169b.poll();
                    if (jgbVarPoll != null && !jgbVarPoll.isOnNext()) {
                        args = jgbVarPoll;
                    }
                }
            }
        }
    }

    public r71(zjd<? extends T> source) {
        this.f77161a = source;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C11913a(this.f77161a, new C11914b());
    }
}
