package p000;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p000.jm1;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@gd7(emulated = true)
public abstract class jm1<K, V> {

    /* JADX INFO: renamed from: jm1$a */
    public class C7974a extends jm1<K, V> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Executor f51133b;

        public C7974a(final Executor val$executor) {
            this.f51133b = val$executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$reload$0(jm1 jm1Var, Object obj, Object obj2) throws Exception {
            return jm1Var.reload(obj, obj2).get();
        }

        @Override // p000.jm1
        public V load(K k) throws Exception {
            return (V) jm1.this.load(k);
        }

        @Override // p000.jm1
        public Map<K, V> loadAll(Iterable<? extends K> keys) throws Exception {
            return jm1.this.loadAll(keys);
        }

        @Override // p000.jm1
        public ja9<V> reload(final K key, final V oldValue) {
            final jm1 jm1Var = jm1.this;
            ka9 ka9VarCreate = ka9.create(new Callable() { // from class: im1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return jm1.C7974a.lambda$reload$0(jm1Var, key, oldValue);
                }
            });
            this.f51133b.execute(ka9VarCreate);
            return ka9VarCreate;
        }
    }

    /* JADX INFO: renamed from: jm1$b */
    public static final class C7975b<K, V> extends jm1<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lz6<K, V> f51134a;

        public C7975b(lz6<K, V> computingFunction) {
            this.f51134a = (lz6) v7d.checkNotNull(computingFunction);
        }

        @Override // p000.jm1
        public V load(K k) {
            return this.f51134a.apply((K) v7d.checkNotNull(k));
        }
    }

    /* JADX INFO: renamed from: jm1$c */
    public static final class C7976c extends RuntimeException {
        public C7976c(String message) {
            super(message);
        }
    }

    /* JADX INFO: renamed from: jm1$d */
    public static final class C7977d<V> extends jm1<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final lfg<V> f51135a;

        public C7977d(lfg<V> computingSupplier) {
            this.f51135a = (lfg) v7d.checkNotNull(computingSupplier);
        }

        @Override // p000.jm1
        public V load(Object key) {
            v7d.checkNotNull(key);
            return this.f51135a.get();
        }
    }

    /* JADX INFO: renamed from: jm1$e */
    public static final class C7978e extends UnsupportedOperationException {
    }

    @jd7
    public static <K, V> jm1<K, V> asyncReloading(final jm1<K, V> loader, final Executor executor) {
        v7d.checkNotNull(loader);
        v7d.checkNotNull(executor);
        return loader.new C7974a(executor);
    }

    public static <K, V> jm1<K, V> from(lz6<K, V> function) {
        return new C7975b(function);
    }

    public abstract V load(K key) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> keys) throws Exception {
        throw new C7978e();
    }

    @jd7
    public ja9<V> reload(K key, V oldValue) throws Exception {
        v7d.checkNotNull(key);
        v7d.checkNotNull(oldValue);
        return w17.immediateFuture(load(key));
    }

    public static <V> jm1<Object, V> from(lfg<V> supplier) {
        return new C7977d(supplier);
    }
}
