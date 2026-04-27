package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC8831lj;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@qx4
public abstract class v72<V, C> extends AbstractC8831lj<V, C> {

    /* JADX INFO: renamed from: Z */
    @wx1
    public List<C13897b<V>> f90132Z;

    /* JADX INFO: renamed from: v72$a */
    public static final class C13896a<V> extends v72<V, List<V>> {
        public C13896a(ax7<? extends ja9<? extends V>> futures, boolean allMustSucceed) {
            super(futures, allMustSucceed);
            m16167A();
        }

        @Override // p000.v72
        public List<V> combine(List<C13897b<V>> values) {
            ArrayList arrayListNewArrayListWithCapacity = eb9.newArrayListWithCapacity(values.size());
            Iterator<C13897b<V>> it = values.iterator();
            while (it.hasNext()) {
                C13897b<V> next = it.next();
                arrayListNewArrayListWithCapacity.add(next != null ? next.f90133a : null);
            }
            return Collections.unmodifiableList(arrayListNewArrayListWithCapacity);
        }
    }

    /* JADX INFO: renamed from: v72$b */
    public static final class C13897b<V> {

        /* JADX INFO: renamed from: a */
        @agc
        public final V f90133a;

        public C13897b(@agc V value) {
            this.f90133a = value;
        }
    }

    public v72(ax7<? extends ja9<? extends V>> futures, boolean allMustSucceed) {
        super(futures, allMustSucceed, true);
        List<C13897b<V>> listEmptyList = futures.isEmpty() ? Collections.emptyList() : eb9.newArrayListWithCapacity(futures.size());
        for (int i = 0; i < futures.size(); i++) {
            listEmptyList.add(null);
        }
        this.f90132Z = listEmptyList;
    }

    @Override // p000.AbstractC8831lj
    /* JADX INFO: renamed from: B */
    public void mo14636B(AbstractC8831lj.a reason) {
        super.mo14636B(reason);
        this.f90132Z = null;
    }

    public abstract C combine(List<C13897b<V>> values);

    @Override // p000.AbstractC8831lj
    /* JADX INFO: renamed from: y */
    public final void mo14638y(int index, @agc V returnValue) {
        List<C13897b<V>> list = this.f90132Z;
        if (list != null) {
            list.set(index, new C13897b<>(returnValue));
        }
    }

    @Override // p000.AbstractC8831lj
    /* JADX INFO: renamed from: z */
    public final void mo14639z() {
        List<C13897b<V>> list = this.f90132Z;
        if (list != null) {
            set(combine(list));
        }
    }
}
