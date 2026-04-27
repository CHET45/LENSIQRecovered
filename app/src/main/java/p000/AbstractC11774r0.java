package p000;

import android.util.Pair;
import p000.t1h;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class AbstractC11774r0 extends t1h {

    /* JADX INFO: renamed from: C */
    public final boolean f76423C;

    /* JADX INFO: renamed from: f */
    public final int f76424f;

    /* JADX INFO: renamed from: m */
    public final sbf f76425m;

    public AbstractC11774r0(boolean z, sbf sbfVar) {
        this.f76423C = z;
        this.f76425m = sbfVar;
        this.f76424f = sbfVar.getLength();
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
            return this.f76425m.getNextIndex(i);
        }
        if (i < this.f76424f - 1) {
            return i + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i, boolean z) {
        if (z) {
            return this.f76425m.getPreviousIndex(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo18b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract int mo19c(int i);

    /* JADX INFO: renamed from: d */
    public abstract Object mo20d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo21e(int i);

    /* JADX INFO: renamed from: f */
    public abstract int mo22f(int i);

    /* JADX INFO: renamed from: g */
    public abstract t1h mo23g(int i);

    public abstract int getChildIndexByPeriodIndex(int i);

    @Override // p000.t1h
    public int getFirstWindowIndex(boolean z) {
        if (this.f76424f == 0) {
            return -1;
        }
        if (this.f76423C) {
            z = false;
        }
        int firstIndex = z ? this.f76425m.getFirstIndex() : 0;
        while (mo23g(firstIndex).isEmpty()) {
            firstIndex = getNextChildIndex(firstIndex, z);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return mo22f(firstIndex) + mo23g(firstIndex).getFirstWindowIndex(z);
    }

    @Override // p000.t1h
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iMo18b = mo18b(childTimelineUidFromConcatenatedUid);
        if (iMo18b == -1 || (indexOfPeriod = mo23g(iMo18b).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return mo21e(iMo18b) + indexOfPeriod;
    }

    @Override // p000.t1h
    public int getLastWindowIndex(boolean z) {
        int i = this.f76424f;
        if (i == 0) {
            return -1;
        }
        if (this.f76423C) {
            z = false;
        }
        int lastIndex = z ? this.f76425m.getLastIndex() : i - 1;
        while (mo23g(lastIndex).isEmpty()) {
            lastIndex = getPreviousChildIndex(lastIndex, z);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return mo22f(lastIndex) + mo23g(lastIndex).getLastWindowIndex(z);
    }

    @Override // p000.t1h
    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (this.f76423C) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo19c = mo19c(i);
        int iMo22f = mo22f(iMo19c);
        int nextWindowIndex = mo23g(iMo19c).getNextWindowIndex(i - iMo22f, i2 != 2 ? i2 : 0, z);
        if (nextWindowIndex != -1) {
            return iMo22f + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(iMo19c, z);
        while (nextChildIndex != -1 && mo23g(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z);
        }
        if (nextChildIndex != -1) {
            return mo22f(nextChildIndex) + mo23g(nextChildIndex).getFirstWindowIndex(z);
        }
        if (i2 == 2) {
            return getFirstWindowIndex(z);
        }
        return -1;
    }

    @Override // p000.t1h
    public final t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        int iMo22f = mo22f(childIndexByPeriodIndex);
        mo23g(childIndexByPeriodIndex).getPeriod(i - mo21e(childIndexByPeriodIndex), c12849b, z);
        c12849b.f83398c += iMo22f;
        if (z) {
            c12849b.f83397b = getConcatenatedUid(mo20d(childIndexByPeriodIndex), u80.checkNotNull(c12849b.f83397b));
        }
        return c12849b;
    }

    @Override // p000.t1h
    public final t1h.C12849b getPeriodByUid(Object obj, t1h.C12849b c12849b) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iMo18b = mo18b(childTimelineUidFromConcatenatedUid);
        int iMo22f = mo22f(iMo18b);
        mo23g(iMo18b).getPeriodByUid(childPeriodUidFromConcatenatedUid, c12849b);
        c12849b.f83398c += iMo22f;
        c12849b.f83397b = obj;
        return c12849b;
    }

    @Override // p000.t1h
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (this.f76423C) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo19c = mo19c(i);
        int iMo22f = mo22f(iMo19c);
        int previousWindowIndex = mo23g(iMo19c).getPreviousWindowIndex(i - iMo22f, i2 != 2 ? i2 : 0, z);
        if (previousWindowIndex != -1) {
            return iMo22f + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(iMo19c, z);
        while (previousChildIndex != -1 && mo23g(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z);
        }
        if (previousChildIndex != -1) {
            return mo22f(previousChildIndex) + mo23g(previousChildIndex).getLastWindowIndex(z);
        }
        if (i2 == 2) {
            return getLastWindowIndex(z);
        }
        return -1;
    }

    @Override // p000.t1h
    public final Object getUidOfPeriod(int i) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        return getConcatenatedUid(mo20d(childIndexByPeriodIndex), mo23g(childIndexByPeriodIndex).getUidOfPeriod(i - mo21e(childIndexByPeriodIndex)));
    }

    @Override // p000.t1h
    public final t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
        int iMo19c = mo19c(i);
        int iMo22f = mo22f(iMo19c);
        int iMo21e = mo21e(iMo19c);
        mo23g(iMo19c).getWindow(i - iMo22f, c12851d, j);
        Object objMo20d = mo20d(iMo19c);
        if (!t1h.C12851d.f83407M1.equals(c12851d.f83434a)) {
            objMo20d = getConcatenatedUid(objMo20d, c12851d.f83434a);
        }
        c12851d.f83434a = objMo20d;
        c12851d.f83431X += iMo21e;
        c12851d.f83432Y += iMo21e;
        return c12851d;
    }
}
