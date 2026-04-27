package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import p000.d2b;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public class qbe extends d2b {

    /* JADX INFO: renamed from: m */
    public final AtomicInteger f73876m;

    /* JADX INFO: renamed from: n */
    public zb9.AbstractC16074k f73877n;

    /* JADX INFO: renamed from: qbe$a */
    @gdi
    public static final class C11413a extends zb9.AbstractC16074k {
        public boolean equals(Object obj) {
            return obj instanceof C11413a;
        }

        public int hashCode() {
            return C11413a.class.hashCode();
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return zb9.C16070g.withNoResult();
        }
    }

    /* JADX INFO: renamed from: qbe$b */
    @gdi
    public static class C11414b extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final List<zb9.AbstractC16074k> f73878a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f73879b;

        /* JADX INFO: renamed from: c */
        public final int f73880c;

        public C11414b(List<zb9.AbstractC16074k> list, AtomicInteger atomicInteger) {
            v7d.checkArgument(!list.isEmpty(), "empty list");
            this.f73878a = list;
            this.f73879b = (AtomicInteger) v7d.checkNotNull(atomicInteger, "index");
            Iterator<zb9.AbstractC16074k> it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            this.f73880c = iHashCode;
        }

        private int nextIndex() {
            return (this.f73879b.getAndIncrement() & Integer.MAX_VALUE) % this.f73878a.size();
        }

        @gdi
        /* JADX INFO: renamed from: a */
        public List<zb9.AbstractC16074k> m20213a() {
            return this.f73878a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11414b)) {
                return false;
            }
            C11414b c11414b = (C11414b) obj;
            if (c11414b == this) {
                return true;
            }
            return this.f73880c == c11414b.f73880c && this.f73879b == c11414b.f73879b && this.f73878a.size() == c11414b.f73878a.size() && new HashSet(this.f73878a).containsAll(c11414b.f73878a);
        }

        public int hashCode() {
            return this.f73880c;
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return this.f73878a.get(nextIndex()).pickSubchannel(abstractC16071h);
        }

        public String toString() {
            return yya.toStringHelper((Class<?>) C11414b.class).add("subchannelPickers", this.f73878a).toString();
        }
    }

    public qbe(zb9.AbstractC16069f abstractC16069f) {
        super(abstractC16069f);
        this.f73876m = new AtomicInteger(new Random().nextInt());
        this.f73877n = new C11413a();
    }

    private void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
        if (ws2Var == this.f28277k && abstractC16074k.equals(this.f73877n)) {
            return;
        }
        m8829m().updateBalancingState(ws2Var, abstractC16074k);
        this.f28277k = ws2Var;
        this.f73877n = abstractC16074k;
    }

    @Override // p000.d2b
    /* JADX INFO: renamed from: q */
    public zb9.AbstractC16074k mo8833q(Map<Object, zb9.AbstractC16074k> map) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.d2b
    /* JADX INFO: renamed from: w */
    public void mo8839w() {
        List<d2b.C4590c> listM8832p = m8832p();
        if (!listM8832p.isEmpty()) {
            updateBalancingState(ws2.READY, m20212x(listM8832p));
            return;
        }
        Iterator<d2b.C4590c> it = m8827k().iterator();
        while (it.hasNext()) {
            ws2 currentState = it.next().getCurrentState();
            ws2 ws2Var = ws2.CONNECTING;
            if (currentState == ws2Var || currentState == ws2.IDLE) {
                updateBalancingState(ws2Var, new C11413a());
                return;
            }
        }
        updateBalancingState(ws2.TRANSIENT_FAILURE, m20212x(m8827k()));
    }

    /* JADX INFO: renamed from: x */
    public zb9.AbstractC16074k m20212x(Collection<d2b.C4590c> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<d2b.C4590c> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCurrentPicker());
        }
        return new C11414b(arrayList, this.f73876m);
    }
}
