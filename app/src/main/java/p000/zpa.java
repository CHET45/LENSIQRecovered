package p000;

import androidx.lifecycle.AbstractC1158q;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zpa<T> extends o5b<T> {

    /* JADX INFO: renamed from: m */
    public rke<AbstractC1158q<?>, C16212a<?>> f105707m;

    /* JADX INFO: renamed from: zpa$a */
    public static class C16212a<V> implements qxb<V> {

        /* JADX INFO: renamed from: a */
        public final AbstractC1158q<V> f105708a;

        /* JADX INFO: renamed from: b */
        public final qxb<? super V> f105709b;

        /* JADX INFO: renamed from: c */
        public int f105710c = -1;

        public C16212a(AbstractC1158q<V> abstractC1158q, qxb<? super V> qxbVar) {
            this.f105708a = abstractC1158q;
            this.f105709b = qxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m26947a() {
            this.f105708a.observeForever(this);
        }

        /* JADX INFO: renamed from: b */
        public void m26948b() {
            this.f105708a.removeObserver(this);
        }

        @Override // p000.qxb
        public void onChanged(@hib V v) {
            if (this.f105710c != this.f105708a.getVersion()) {
                this.f105710c = this.f105708a.getVersion();
                this.f105709b.onChanged(v);
            }
        }
    }

    public zpa() {
        this.f105707m = new rke<>();
    }

    @ir9
    public <S> void addSource(@efb AbstractC1158q<S> abstractC1158q, @efb qxb<? super S> qxbVar) {
        if (abstractC1158q == null) {
            throw new NullPointerException("source cannot be null");
        }
        C16212a<?> c16212a = new C16212a<>(abstractC1158q, qxbVar);
        C16212a<?> c16212aPutIfAbsent = this.f105707m.putIfAbsent(abstractC1158q, c16212a);
        if (c16212aPutIfAbsent != null && c16212aPutIfAbsent.f105709b != qxbVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c16212aPutIfAbsent == null && hasActiveObservers()) {
            c16212a.m26947a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1158q
    @un1
    /* JADX INFO: renamed from: d */
    public void mo317d() {
        Iterator<Map.Entry<AbstractC1158q<?>, C16212a<?>>> it = this.f105707m.iterator();
        while (it.hasNext()) {
            it.next().getValue().m26947a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1158q
    @un1
    /* JADX INFO: renamed from: e */
    public void mo318e() {
        Iterator<Map.Entry<AbstractC1158q<?>, C16212a<?>>> it = this.f105707m.iterator();
        while (it.hasNext()) {
            it.next().getValue().m26948b();
        }
    }

    @ir9
    public <S> void removeSource(@efb AbstractC1158q<S> abstractC1158q) {
        C16212a<?> c16212aRemove = this.f105707m.remove(abstractC1158q);
        if (c16212aRemove != null) {
            c16212aRemove.m26948b();
        }
    }

    public zpa(T t) {
        super(t);
        this.f105707m = new rke<>();
    }
}
