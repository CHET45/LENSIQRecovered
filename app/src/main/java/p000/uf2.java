package p000;

import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import p000.md6;

/* JADX INFO: loaded from: classes7.dex */
public final class uf2<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final CompletionStage<T> f87846a;

    /* JADX INFO: renamed from: uf2$a */
    public static final class C13524a<T> implements lf4, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: a */
        public final ch2 f87847a;

        /* JADX INFO: renamed from: b */
        public final md6.C9313a<T> f87848b;

        public C13524a(ch2 downstream, md6.C9313a<T> whenReference) {
            this.f87847a = downstream;
            this.f87848b = whenReference;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f87848b.set(null);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f87848b.get() == null;
        }

        @Override // java.util.function.BiConsumer
        public void accept(T item, Throwable error) {
            if (error != null) {
                this.f87847a.onError(error);
            } else {
                this.f87847a.onComplete();
            }
        }
    }

    public uf2(CompletionStage<T> stage) {
        this.f87846a = stage;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        md6.C9313a c9313a = new md6.C9313a();
        C13524a c13524a = new C13524a(observer, c9313a);
        c9313a.lazySet(c13524a);
        observer.onSubscribe(c13524a);
        this.f87846a.whenComplete(c9313a);
    }
}
