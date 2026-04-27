package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000.q1h;

/* JADX INFO: loaded from: classes3.dex */
public final class b1d extends AbstractC12381s0 {

    /* JADX INFO: renamed from: h */
    public final int f12408h;

    /* JADX INFO: renamed from: i */
    public final int f12409i;

    /* JADX INFO: renamed from: j */
    public final int[] f12410j;

    /* JADX INFO: renamed from: k */
    public final int[] f12411k;

    /* JADX INFO: renamed from: l */
    public final q1h[] f12412l;

    /* JADX INFO: renamed from: m */
    public final Object[] f12413m;

    /* JADX INFO: renamed from: n */
    public final HashMap<Object, Integer> f12414n;

    /* JADX INFO: renamed from: b1d$a */
    public class C1696a extends yt6 {

        /* JADX INFO: renamed from: f */
        public final q1h.C11272d f12415f;

        public C1696a(q1h q1hVar) {
            super(q1hVar);
            this.f12415f = new q1h.C11272d();
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            q1h.C11270b period = super.getPeriod(i, c11270b, z);
            if (super.getWindow(period.f72946c, this.f12415f).isLive()) {
                period.set(c11270b.f72944a, c11270b.f72945b, c11270b.f72946c, c11270b.f72947d, c11270b.f72948e, C9343mf.f60836l, true);
            } else {
                period.f72949f = true;
            }
            return period;
        }
    }

    public b1d(Collection<? extends ooa> collection, rbf rbfVar) {
        this(getTimelines(collection), getUids(collection), rbfVar);
    }

    private static q1h[] getTimelines(Collection<? extends ooa> collection) {
        q1h[] q1hVarArr = new q1h[collection.size()];
        Iterator<? extends ooa> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            q1hVarArr[i] = it.next().getTimeline();
            i++;
        }
        return q1hVarArr;
    }

    private static Object[] getUids(Collection<? extends ooa> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends ooa> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().getUid();
            i++;
        }
        return objArr;
    }

    @Override // p000.AbstractC12381s0
    /* JADX INFO: renamed from: a */
    public int mo2513a(Object obj) {
        Integer num = this.f12414n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p000.AbstractC12381s0
    /* JADX INFO: renamed from: b */
    public int mo2514b(int i) {
        return t0i.binarySearchFloor(this.f12411k, i + 1, false, false);
    }

    @Override // p000.AbstractC12381s0
    /* JADX INFO: renamed from: c */
    public Object mo2515c(int i) {
        return this.f12413m[i];
    }

    public b1d copyWithPlaceholderTimeline(rbf rbfVar) {
        q1h[] q1hVarArr = new q1h[this.f12412l.length];
        int i = 0;
        while (true) {
            q1h[] q1hVarArr2 = this.f12412l;
            if (i >= q1hVarArr2.length) {
                return new b1d(q1hVarArr, this.f12413m, rbfVar);
            }
            q1hVarArr[i] = new C1696a(q1hVarArr2[i]);
            i++;
        }
    }

    @Override // p000.AbstractC12381s0
    /* JADX INFO: renamed from: d */
    public int mo2516d(int i) {
        return this.f12410j[i];
    }

    @Override // p000.AbstractC12381s0
    /* JADX INFO: renamed from: e */
    public int mo2517e(int i) {
        return this.f12411k[i];
    }

    @Override // p000.AbstractC12381s0
    /* JADX INFO: renamed from: f */
    public q1h mo2518f(int i) {
        return this.f12412l[i];
    }

    /* JADX INFO: renamed from: g */
    public List<q1h> m2789g() {
        return Arrays.asList(this.f12412l);
    }

    @Override // p000.AbstractC12381s0
    public int getChildIndexByPeriodIndex(int i) {
        return t0i.binarySearchFloor(this.f12410j, i + 1, false, false);
    }

    @Override // p000.q1h
    public int getPeriodCount() {
        return this.f12409i;
    }

    @Override // p000.q1h
    public int getWindowCount() {
        return this.f12408h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private b1d(q1h[] q1hVarArr, Object[] objArr, rbf rbfVar) {
        super(false, rbfVar);
        int i = 0;
        int length = q1hVarArr.length;
        this.f12412l = q1hVarArr;
        this.f12410j = new int[length];
        this.f12411k = new int[length];
        this.f12413m = objArr;
        this.f12414n = new HashMap<>();
        int length2 = q1hVarArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i2 = 0;
        while (i < length2) {
            q1h q1hVar = q1hVarArr[i];
            this.f12412l[i2] = q1hVar;
            this.f12411k[i2] = windowCount;
            this.f12410j[i2] = periodCount;
            windowCount += q1hVar.getWindowCount();
            periodCount += this.f12412l[i2].getPeriodCount();
            this.f12414n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f12408h = windowCount;
        this.f12409i = periodCount;
    }
}
