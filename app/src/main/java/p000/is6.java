package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public abstract class is6<V> extends yr6<V> implements ja9<V> {

    /* JADX INFO: renamed from: is6$a */
    public static abstract class AbstractC7582a<V> extends is6<V> {

        /* JADX INFO: renamed from: a */
        public final ja9<V> f48121a;

        public AbstractC7582a(ja9<V> delegate) {
            this.f48121a = (ja9) v7d.checkNotNull(delegate);
        }

        @Override // p000.is6, p000.yr6, p000.zs6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ja9<V> mo8967m() {
            return this.f48121a;
        }
    }

    @Override // p000.ja9
    public void addListener(Runnable listener, Executor exec) {
        mo8967m().addListener(listener, exec);
    }

    @Override // p000.yr6, p000.zs6
    /* JADX INFO: renamed from: b */
    public abstract ja9<? extends V> mo8967m();
}
