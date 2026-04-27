package p000;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes7.dex */
public final class md6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final CompletionStage<T> f60665b;

    /* JADX INFO: renamed from: md6$a */
    public static final class C9313a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

        @Override // java.util.function.BiConsumer
        public void accept(T t, Throwable u) {
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(t, u);
            }
        }
    }

    /* JADX INFO: renamed from: md6$b */
    public static final class C9314b<T> extends j34<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;

        /* JADX INFO: renamed from: L */
        public final C9313a<T> f60666L;

        public C9314b(ycg<? super T> downstream, C9313a<T> whenReference) {
            super(downstream);
            this.f60666L = whenReference;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f60666L.set(null);
        }

        @Override // java.util.function.BiConsumer
        public void accept(T item, Throwable error) {
            if (error != null) {
                this.f49483a.onError(error);
            } else if (item != null) {
                complete(item);
            } else {
                this.f49483a.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }
    }

    public md6(CompletionStage<T> stage) {
        this.f60665b = stage;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        C9313a c9313a = new C9313a();
        C9314b c9314b = new C9314b(s, c9313a);
        c9313a.lazySet(c9314b);
        s.onSubscribe(c9314b);
        this.f60665b.whenComplete(c9313a);
    }
}
