package p000;

import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import p000.md6;

/* JADX INFO: loaded from: classes7.dex */
public final class imf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final CompletionStage<T> f47505a;

    /* JADX INFO: renamed from: imf$a */
    public static final class C7506a<T> implements lf4, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f47506a;

        /* JADX INFO: renamed from: b */
        public final md6.C9313a<T> f47507b;

        public C7506a(hnf<? super T> downstream, md6.C9313a<T> whenReference) {
            this.f47506a = downstream;
            this.f47507b = whenReference;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f47507b.set(null);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f47507b.get() == null;
        }

        @Override // java.util.function.BiConsumer
        public void accept(T item, Throwable error) {
            if (error != null) {
                this.f47506a.onError(error);
            } else if (item != null) {
                this.f47506a.onSuccess(item);
            } else {
                this.f47506a.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }
    }

    public imf(CompletionStage<T> stage) {
        this.f47505a = stage;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        md6.C9313a c9313a = new md6.C9313a();
        C7506a c7506a = new C7506a(observer, c9313a);
        c9313a.lazySet(c7506a);
        observer.onSubscribe(c7506a);
        this.f47505a.whenComplete(c9313a);
    }
}
