package p000;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class pb6<T, K> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, K> f70207c;

    /* JADX INFO: renamed from: d */
    public final nfg<? extends Collection<? super K>> f70208d;

    /* JADX INFO: renamed from: pb6$a */
    public static final class C10878a<T, K> extends nv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final Collection<? super K> f70209f;

        /* JADX INFO: renamed from: m */
        public final sy6<? super T, K> f70210m;

        public C10878a(ycg<? super T> actual, sy6<? super T, K> keySelector, Collection<? super K> collection) {
            super(actual);
            this.f70210m = keySelector;
            this.f70209f = collection;
        }

        @Override // p000.nv0, p000.zif
        public void clear() {
            this.f70209f.clear();
            super.clear();
        }

        @Override // p000.nv0, p000.ycg
        public void onComplete() {
            if (this.f65774d) {
                return;
            }
            this.f65774d = true;
            this.f70209f.clear();
            this.f65771a.onComplete();
        }

        @Override // p000.nv0, p000.ycg
        public void onError(Throwable e) {
            if (this.f65774d) {
                ofe.onError(e);
                return;
            }
            this.f65774d = true;
            this.f70209f.clear();
            this.f65771a.onError(e);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f65774d) {
                return;
            }
            if (this.f65775e != 0) {
                this.f65771a.onNext(null);
                return;
            }
            try {
                K kApply = this.f70210m.apply(t);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (this.f70209f.add(kApply)) {
                    this.f65771a.onNext((Object) t);
                } else {
                    this.f65772b.request(1L);
                }
            } catch (Throwable th) {
                m18144c(th);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll;
            while (true) {
                tPoll = this.f65773c.poll();
                if (tPoll == null) {
                    break;
                }
                Collection<? super K> collection = this.f70209f;
                K kApply = this.f70210m.apply(tPoll);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (collection.add(kApply)) {
                    break;
                }
                if (this.f65775e == 2) {
                    this.f65772b.request(1L);
                }
            }
            return tPoll;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m18145d(mode);
        }
    }

    public pb6(l86<T> source, sy6<? super T, K> keySelector, nfg<? extends Collection<? super K>> collectionSupplier) {
        super(source);
        this.f70207c = keySelector;
        this.f70208d = collectionSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> subscriber) {
        try {
            this.f49321b.subscribe((kj6) new C10878a(subscriber, this.f70207c, (Collection) k75.nullCheck(this.f70208d.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            w05.error(th, subscriber);
        }
    }
}
