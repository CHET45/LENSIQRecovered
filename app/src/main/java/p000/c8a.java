package p000;

import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import p000.md6;

/* JADX INFO: loaded from: classes7.dex */
public final class c8a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final CompletionStage<T> f15966a;

    /* JADX INFO: renamed from: c8a$a */
    public static final class C2236a<T> implements lf4, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f15967a;

        /* JADX INFO: renamed from: b */
        public final md6.C9313a<T> f15968b;

        public C2236a(k9a<? super T> downstream, md6.C9313a<T> whenReference) {
            this.f15967a = downstream;
            this.f15968b = whenReference;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f15968b.set(null);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f15968b.get() == null;
        }

        @Override // java.util.function.BiConsumer
        public void accept(T item, Throwable error) {
            if (error != null) {
                this.f15967a.onError(error);
            } else if (item != null) {
                this.f15967a.onSuccess(item);
            } else {
                this.f15967a.onComplete();
            }
        }
    }

    public c8a(CompletionStage<T> stage) {
        this.f15966a = stage;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        md6.C9313a c9313a = new md6.C9313a();
        C2236a c2236a = new C2236a(observer, c9313a);
        c9313a.lazySet(c2236a);
        observer.onSubscribe(c2236a);
        this.f15966a.whenComplete(c9313a);
    }
}
