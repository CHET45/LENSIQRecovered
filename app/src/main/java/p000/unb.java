package p000;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class unb<T, K> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, K> f88608b;

    /* JADX INFO: renamed from: c */
    public final nfg<? extends Collection<? super K>> f88609c;

    /* JADX INFO: renamed from: unb$a */
    public static final class C13614a<T, K> extends lv0<T, T> {

        /* JADX INFO: renamed from: f */
        public final Collection<? super K> f88610f;

        /* JADX INFO: renamed from: m */
        public final sy6<? super T, K> f88611m;

        public C13614a(pxb<? super T> actual, sy6<? super T, K> keySelector, Collection<? super K> collection) {
            super(actual);
            this.f88611m = keySelector;
            this.f88610f = collection;
        }

        @Override // p000.lv0, p000.zif
        public void clear() {
            this.f88610f.clear();
            super.clear();
        }

        @Override // p000.lv0, p000.pxb
        public void onComplete() {
            if (this.f58861d) {
                return;
            }
            this.f58861d = true;
            this.f88610f.clear();
            this.f58858a.onComplete();
        }

        @Override // p000.lv0, p000.pxb
        public void onError(Throwable e) {
            if (this.f58861d) {
                ofe.onError(e);
                return;
            }
            this.f58861d = true;
            this.f88610f.clear();
            this.f58858a.onError(e);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f58861d) {
                return;
            }
            if (this.f58862e != 0) {
                this.f58858a.onNext(null);
                return;
            }
            try {
                K kApply = this.f88611m.apply(t);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (this.f88610f.add(kApply)) {
                    this.f58858a.onNext((Object) t);
                }
            } catch (Throwable th) {
                m16392c(th);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            T tPoll;
            Collection<? super K> collection;
            K kApply;
            do {
                tPoll = this.f58860c.poll();
                if (tPoll == null) {
                    break;
                }
                collection = this.f88610f;
                kApply = this.f88611m.apply(tPoll);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
            } while (!collection.add(kApply));
            return tPoll;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m16393d(mode);
        }
    }

    public unb(wub<T> source, sy6<? super T, K> keySelector, nfg<? extends Collection<? super K>> collectionSupplier) {
        super(source);
        this.f88608b = keySelector;
        this.f88609c = collectionSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        try {
            this.f63101a.subscribe(new C13614a(observer, this.f88608b, (Collection) k75.nullCheck(this.f88609c.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
