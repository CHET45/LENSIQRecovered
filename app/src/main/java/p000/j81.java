package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class j81<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f49807a;

    /* JADX INFO: renamed from: j81$a */
    public static final class C7778a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final C7779b<T> f49808a;

        /* JADX INFO: renamed from: b */
        public final wub<T> f49809b;

        /* JADX INFO: renamed from: c */
        public T f49810c;

        /* JADX INFO: renamed from: d */
        public boolean f49811d = true;

        /* JADX INFO: renamed from: e */
        public boolean f49812e = true;

        /* JADX INFO: renamed from: f */
        public Throwable f49813f;

        /* JADX INFO: renamed from: m */
        public boolean f49814m;

        public C7778a(wub<T> items, C7779b<T> observer) {
            this.f49809b = items;
            this.f49808a = observer;
        }

        private boolean moveToNext() {
            if (!this.f49814m) {
                this.f49814m = true;
                this.f49808a.m13838b();
                new mrb(this.f49809b).subscribe(this.f49808a);
            }
            try {
                jgb<T> jgbVarTakeNext = this.f49808a.takeNext();
                if (jgbVarTakeNext.isOnNext()) {
                    this.f49812e = false;
                    this.f49810c = jgbVarTakeNext.getValue();
                    return true;
                }
                this.f49811d = false;
                if (jgbVarTakeNext.isOnComplete()) {
                    return false;
                }
                Throwable error = jgbVarTakeNext.getError();
                this.f49813f = error;
                throw k75.wrapOrThrow(error);
            } catch (InterruptedException e) {
                this.f49808a.dispose();
                this.f49813f = e;
                throw k75.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.f49813f;
            if (th != null) {
                throw k75.wrapOrThrow(th);
            }
            if (this.f49811d) {
                return !this.f49812e || moveToNext();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f49813f;
            if (th != null) {
                throw k75.wrapOrThrow(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f49812e = true;
            return this.f49810c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: renamed from: j81$b */
    public static final class C7779b<T> extends fg4<jgb<T>> {

        /* JADX INFO: renamed from: b */
        public final BlockingQueue<jgb<T>> f49815b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f49816c = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public void m13838b() {
            this.f49816c.set(1);
        }

        @Override // p000.pxb
        public void onComplete() {
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            ofe.onError(e);
        }

        public jgb<T> takeNext() throws InterruptedException {
            m13838b();
            s71.verifyNonBlocking();
            return this.f49815b.take();
        }

        @Override // p000.pxb
        public void onNext(jgb<T> args) {
            if (this.f49816c.getAndSet(0) == 1 || !args.isOnNext()) {
                while (!this.f49815b.offer(args)) {
                    jgb<T> jgbVarPoll = this.f49815b.poll();
                    if (jgbVarPoll != null && !jgbVarPoll.isOnNext()) {
                        args = jgbVarPoll;
                    }
                }
            }
        }
    }

    public j81(wub<T> source) {
        this.f49807a = source;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C7778a(this.f49807a, new C7779b());
    }
}
