package p000;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes7.dex */
public final class opb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final CompletionStage<T> f68269a;

    /* JADX INFO: renamed from: opb$a */
    public static final class C10493a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

        @Override // java.util.function.BiConsumer
        public void accept(T t, Throwable u) {
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(t, u);
            }
        }
    }

    /* JADX INFO: renamed from: opb$b */
    public static final class C10494b<T> extends d34<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;

        /* JADX INFO: renamed from: C */
        public final C10493a<T> f68270C;

        public C10494b(pxb<? super T> downstream, C10493a<T> whenReference) {
            super(downstream);
            this.f68270C = whenReference;
        }

        @Override // p000.d34, p000.lf4
        public void dispose() {
            super.dispose();
            this.f68270C.set(null);
        }

        @Override // java.util.function.BiConsumer
        public void accept(T item, Throwable error) {
            if (error != null) {
                this.f28317a.onError(error);
            } else if (item != null) {
                complete(item);
            } else {
                this.f28317a.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }
    }

    public opb(CompletionStage<T> stage) {
        this.f68269a = stage;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        C10493a c10493a = new C10493a();
        C10494b c10494b = new C10494b(observer, c10493a);
        c10493a.lazySet(c10494b);
        observer.onSubscribe(c10494b);
        this.f68269a.whenComplete(c10493a);
    }
}
