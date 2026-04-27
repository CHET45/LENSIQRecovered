package p000;

import android.util.Pair;
import p000.q1h;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class AbstractC12381s0 extends q1h {

    /* JADX INFO: renamed from: e */
    public final int f80236e;

    /* JADX INFO: renamed from: f */
    public final rbf f80237f;

    /* JADX INFO: renamed from: g */
    public final boolean f80238g;

    public AbstractC12381s0(boolean z, rbf rbfVar) {
        this.f80238g = z;
        this.f80237f = rbfVar;
        this.f80236e = rbfVar.getLength();
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object getConcatenatedUid(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int getNextChildIndex(int i, boolean z) {
        if (z) {
            return this.f80237f.getNextIndex(i);
        }
        if (i < this.f80236e - 1) {
            return i + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i, boolean z) {
        if (z) {
            return this.f80237f.getPreviousIndex(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo2513a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract int mo2514b(int i);

    /* JADX INFO: renamed from: c */
    public abstract Object mo2515c(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo2516d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo2517e(int i);

    /* JADX INFO: renamed from: f */
    public abstract q1h mo2518f(int i);

    public abstract int getChildIndexByPeriodIndex(int i);

    @Override // p000.q1h
    public int getFirstWindowIndex(boolean z) {
        if (this.f80236e == 0) {
            return -1;
        }
        if (this.f80238g) {
            z = false;
        }
        int firstIndex = z ? this.f80237f.getFirstIndex() : 0;
        while (mo2518f(firstIndex).isEmpty()) {
            firstIndex = getNextChildIndex(firstIndex, z);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return mo2517e(firstIndex) + mo2518f(firstIndex).getFirstWindowIndex(z);
    }

    @Override // p000.q1h
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iMo2513a = mo2513a(childTimelineUidFromConcatenatedUid);
        if (iMo2513a == -1 || (indexOfPeriod = mo2518f(iMo2513a).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return mo2516d(iMo2513a) + indexOfPeriod;
    }

    @Override // p000.q1h
    public int getLastWindowIndex(boolean z) {
        int i = this.f80236e;
        if (i == 0) {
            return -1;
        }
        if (this.f80238g) {
            z = false;
        }
        int lastIndex = z ? this.f80237f.getLastIndex() : i - 1;
        while (mo2518f(lastIndex).isEmpty()) {
            lastIndex = getPreviousChildIndex(lastIndex, z);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return mo2517e(lastIndex) + mo2518f(lastIndex).getLastWindowIndex(z);
    }

    @Override // p000.q1h
    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (this.f80238g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo2514b = mo2514b(i);
        int iMo2517e = mo2517e(iMo2514b);
        int nextWindowIndex = mo2518f(iMo2514b).getNextWindowIndex(i - iMo2517e, i2 != 2 ? i2 : 0, z);
        if (nextWindowIndex != -1) {
            return iMo2517e + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(iMo2514b, z);
        while (nextChildIndex != -1 && mo2518f(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z);
        }
        if (nextChildIndex != -1) {
            return mo2517e(nextChildIndex) + mo2518f(nextChildIndex).getFirstWindowIndex(z);
        }
        if (i2 == 2) {
            return getFirstWindowIndex(z);
        }
        return -1;
    }

    @Override // p000.q1h
    public final q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        int iMo2517e = mo2517e(childIndexByPeriodIndex);
        mo2518f(childIndexByPeriodIndex).getPeriod(i - mo2516d(childIndexByPeriodIndex), c11270b, z);
        c11270b.f72946c += iMo2517e;
        if (z) {
            c11270b.f72945b = getConcatenatedUid(mo2515c(childIndexByPeriodIndex), v80.checkNotNull(c11270b.f72945b));
        }
        return c11270b;
    }

    @Override // p000.q1h
    public final q1h.C11270b getPeriodByUid(Object obj, q1h.C11270b c11270b) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iMo2513a = mo2513a(childTimelineUidFromConcatenatedUid);
        int iMo2517e = mo2517e(iMo2513a);
        mo2518f(iMo2513a).getPeriodByUid(childPeriodUidFromConcatenatedUid, c11270b);
        c11270b.f72946c += iMo2517e;
        c11270b.f72945b = obj;
        return c11270b;
    }

    @Override // p000.q1h
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (this.f80238g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo2514b = mo2514b(i);
        int iMo2517e = mo2517e(iMo2514b);
        int previousWindowIndex = mo2518f(iMo2514b).getPreviousWindowIndex(i - iMo2517e, i2 != 2 ? i2 : 0, z);
        if (previousWindowIndex != -1) {
            return iMo2517e + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(iMo2514b, z);
        while (previousChildIndex != -1 && mo2518f(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z);
        }
        if (previousChildIndex != -1) {
            return mo2517e(previousChildIndex) + mo2518f(previousChildIndex).getLastWindowIndex(z);
        }
        if (i2 == 2) {
            return getLastWindowIndex(z);
        }
        return -1;
    }

    @Override // p000.q1h
    public final Object getUidOfPeriod(int i) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        return getConcatenatedUid(mo2515c(childIndexByPeriodIndex), mo2518f(childIndexByPeriodIndex).getUidOfPeriod(i - mo2516d(childIndexByPeriodIndex)));
    }

    @Override // p000.q1h
    public final q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
        int iMo2514b = mo2514b(i);
        int iMo2517e = mo2517e(iMo2514b);
        int iMo2516d = mo2516d(iMo2514b);
        mo2518f(iMo2514b).getWindow(i - iMo2517e, c11272d, j);
        Object objMo2515c = mo2515c(iMo2514b);
        if (!q1h.C11272d.f72961q.equals(c11272d.f72971a)) {
            objMo2515c = getConcatenatedUid(objMo2515c, c11272d.f72971a);
        }
        c11272d.f72971a = objMo2515c;
        c11272d.f72984n += iMo2516d;
        c11272d.f72985o += iMo2516d;
        return c11272d;
    }
}
