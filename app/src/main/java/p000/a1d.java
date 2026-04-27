package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000.t1h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a1d extends AbstractC11774r0 {

    /* JADX INFO: renamed from: F */
    public final int f131F;

    /* JADX INFO: renamed from: H */
    public final int f132H;

    /* JADX INFO: renamed from: L */
    public final int[] f133L;

    /* JADX INFO: renamed from: M */
    public final int[] f134M;

    /* JADX INFO: renamed from: N */
    public final t1h[] f135N;

    /* JADX INFO: renamed from: Q */
    public final Object[] f136Q;

    /* JADX INFO: renamed from: X */
    public final HashMap<Object, Integer> f137X;

    /* JADX INFO: renamed from: a1d$a */
    public class C0011a extends xt6 {

        /* JADX INFO: renamed from: m */
        public final t1h.C12851d f139m;

        public C0011a(t1h t1hVar) {
            super(t1hVar);
            this.f139m = new t1h.C12851d();
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            t1h.C12849b period = super.getPeriod(i, c12849b, z);
            if (super.getWindow(period.f83398c, this.f139m).isLive()) {
                period.set(c12849b.f83396a, c12849b.f83397b, c12849b.f83398c, c12849b.f83399d, c12849b.f83400e, C10354of.f67450M, true);
            } else {
                period.f83401f = true;
            }
            return period;
        }
    }

    public a1d(Collection<? extends noa> collection, sbf sbfVar) {
        this(getTimelines(collection), getUids(collection), sbfVar);
    }

    private static t1h[] getTimelines(Collection<? extends noa> collection) {
        t1h[] t1hVarArr = new t1h[collection.size()];
        Iterator<? extends noa> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            t1hVarArr[i] = it.next().getTimeline();
            i++;
        }
        return t1hVarArr;
    }

    private static Object[] getUids(Collection<? extends noa> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends noa> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().getUid();
            i++;
        }
        return objArr;
    }

    @Override // p000.AbstractC11774r0
    /* JADX INFO: renamed from: b */
    public int mo18b(Object obj) {
        Integer num = this.f137X.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p000.AbstractC11774r0
    /* JADX INFO: renamed from: c */
    public int mo19c(int i) {
        return x0i.binarySearchFloor(this.f134M, i + 1, false, false);
    }

    public a1d copyWithPlaceholderTimeline(sbf sbfVar) {
        t1h[] t1hVarArr = new t1h[this.f135N.length];
        int i = 0;
        while (true) {
            t1h[] t1hVarArr2 = this.f135N;
            if (i >= t1hVarArr2.length) {
                return new a1d(t1hVarArr, this.f136Q, sbfVar);
            }
            t1hVarArr[i] = new C0011a(t1hVarArr2[i]);
            i++;
        }
    }

    @Override // p000.AbstractC11774r0
    /* JADX INFO: renamed from: d */
    public Object mo20d(int i) {
        return this.f136Q[i];
    }

    @Override // p000.AbstractC11774r0
    /* JADX INFO: renamed from: e */
    public int mo21e(int i) {
        return this.f133L[i];
    }

    @Override // p000.AbstractC11774r0
    /* JADX INFO: renamed from: f */
    public int mo22f(int i) {
        return this.f134M[i];
    }

    @Override // p000.AbstractC11774r0
    /* JADX INFO: renamed from: g */
    public t1h mo23g(int i) {
        return this.f135N[i];
    }

    @Override // p000.AbstractC11774r0
    public int getChildIndexByPeriodIndex(int i) {
        return x0i.binarySearchFloor(this.f133L, i + 1, false, false);
    }

    @Override // p000.t1h
    public int getPeriodCount() {
        return this.f132H;
    }

    @Override // p000.t1h
    public int getWindowCount() {
        return this.f131F;
    }

    /* JADX INFO: renamed from: h */
    public List<t1h> m24h() {
        return Arrays.asList(this.f135N);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private a1d(t1h[] t1hVarArr, Object[] objArr, sbf sbfVar) {
        super(false, sbfVar);
        int i = 0;
        int length = t1hVarArr.length;
        this.f135N = t1hVarArr;
        this.f133L = new int[length];
        this.f134M = new int[length];
        this.f136Q = objArr;
        this.f137X = new HashMap<>();
        int length2 = t1hVarArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i2 = 0;
        while (i < length2) {
            t1h t1hVar = t1hVarArr[i];
            this.f135N[i2] = t1hVar;
            this.f134M[i2] = windowCount;
            this.f133L[i2] = periodCount;
            windowCount += t1hVar.getWindowCount();
            periodCount += this.f135N[i2].getPeriodCount();
            this.f137X.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f131F = windowCount;
        this.f132H = periodCount;
    }
}
