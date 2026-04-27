package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class zce {

    /* JADX INFO: renamed from: h */
    public static final int f104794h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f104795i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f104796j = 2;

    /* JADX INFO: renamed from: k */
    public static int f104797k;

    /* JADX INFO: renamed from: c */
    public wki f104800c;

    /* JADX INFO: renamed from: d */
    public wki f104801d;

    /* JADX INFO: renamed from: f */
    public int f104803f;

    /* JADX INFO: renamed from: g */
    public int f104804g;

    /* JADX INFO: renamed from: a */
    public int f104798a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f104799b = false;

    /* JADX INFO: renamed from: e */
    public ArrayList<wki> f104802e = new ArrayList<>();

    public zce(wki wkiVar, int i) {
        this.f104800c = null;
        this.f104801d = null;
        int i2 = f104797k;
        this.f104803f = i2;
        f104797k = i2 + 1;
        this.f104800c = wkiVar;
        this.f104801d = wkiVar;
        this.f104804g = i;
    }

    private boolean defineTerminalWidget(wki wkiVar, int i) {
        p64 p64Var;
        wki wkiVar2;
        p64 p64Var2;
        wki wkiVar3;
        if (!wkiVar.f94563b.f48386g[i]) {
            return false;
        }
        for (j64 j64Var : wkiVar.f94569h.f69827k) {
            if ((j64Var instanceof p64) && (wkiVar3 = (p64Var2 = (p64) j64Var).f69820d) != wkiVar && p64Var2 == wkiVar3.f94569h) {
                if (wkiVar instanceof tt1) {
                    Iterator<wki> it = ((tt1) wkiVar).f85803k.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i);
                    }
                } else if (!(wkiVar instanceof pj7)) {
                    wkiVar.f94563b.f48386g[i] = false;
                }
                defineTerminalWidget(p64Var2.f69820d, i);
            }
        }
        for (j64 j64Var2 : wkiVar.f94570i.f69827k) {
            if ((j64Var2 instanceof p64) && (wkiVar2 = (p64Var = (p64) j64Var2).f69820d) != wkiVar && p64Var == wkiVar2.f94569h) {
                if (wkiVar instanceof tt1) {
                    Iterator<wki> it2 = ((tt1) wkiVar).f85803k.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i);
                    }
                } else if (!(wkiVar instanceof pj7)) {
                    wkiVar.f94563b.f48386g[i] = false;
                }
                defineTerminalWidget(p64Var.f69820d, i);
            }
        }
        return false;
    }

    private long traverseEnd(p64 p64Var, long j) {
        wki wkiVar = p64Var.f69820d;
        if (wkiVar instanceof pj7) {
            return j;
        }
        int size = p64Var.f69827k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            j64 j64Var = p64Var.f69827k.get(i);
            if (j64Var instanceof p64) {
                p64 p64Var2 = (p64) j64Var;
                if (p64Var2.f69820d != wkiVar) {
                    jMin = Math.min(jMin, traverseEnd(p64Var2, ((long) p64Var2.f69822f) + j));
                }
            }
        }
        if (p64Var != wkiVar.f94570i) {
            return jMin;
        }
        long wrapDimension = j - wkiVar.getWrapDimension();
        return Math.min(Math.min(jMin, traverseEnd(wkiVar.f94569h, wrapDimension)), wrapDimension - ((long) wkiVar.f94569h.f69822f));
    }

    private long traverseStart(p64 p64Var, long j) {
        wki wkiVar = p64Var.f69820d;
        if (wkiVar instanceof pj7) {
            return j;
        }
        int size = p64Var.f69827k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            j64 j64Var = p64Var.f69827k.get(i);
            if (j64Var instanceof p64) {
                p64 p64Var2 = (p64) j64Var;
                if (p64Var2.f69820d != wkiVar) {
                    jMax = Math.max(jMax, traverseStart(p64Var2, ((long) p64Var2.f69822f) + j));
                }
            }
        }
        if (p64Var != wkiVar.f94569h) {
            return jMax;
        }
        long wrapDimension = j + wkiVar.getWrapDimension();
        return Math.max(Math.max(jMax, traverseStart(wkiVar.f94570i, wrapDimension)), wrapDimension - ((long) wkiVar.f94570i.f69822f));
    }

    public void add(wki wkiVar) {
        this.f104802e.add(wkiVar);
        this.f104801d = wkiVar;
    }

    public long computeWrapSize(ju2 ju2Var, int i) {
        long wrapDimension;
        int i2;
        wki wkiVar = this.f104800c;
        if (wkiVar instanceof tt1) {
            if (((tt1) wkiVar).f94567f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(wkiVar instanceof rl7)) {
                return 0L;
            }
        } else if (!(wkiVar instanceof k5i)) {
            return 0L;
        }
        p64 p64Var = (i == 0 ? ju2Var.f48382e : ju2Var.f48384f).f94569h;
        p64 p64Var2 = (i == 0 ? ju2Var.f48382e : ju2Var.f48384f).f94570i;
        boolean zContains = wkiVar.f94569h.f69828l.contains(p64Var);
        boolean zContains2 = this.f104800c.f94570i.f69828l.contains(p64Var2);
        long wrapDimension2 = this.f104800c.getWrapDimension();
        if (zContains && zContains2) {
            long jTraverseStart = traverseStart(this.f104800c.f94569h, 0L);
            long jTraverseEnd = traverseEnd(this.f104800c.f94570i, 0L);
            long j = jTraverseStart - wrapDimension2;
            wki wkiVar2 = this.f104800c;
            int i3 = wkiVar2.f94570i.f69822f;
            if (j >= (-i3)) {
                j += (long) i3;
            }
            int i4 = wkiVar2.f94569h.f69822f;
            long j2 = ((-jTraverseEnd) - wrapDimension2) - ((long) i4);
            if (j2 >= i4) {
                j2 -= (long) i4;
            }
            float biasPercent = wkiVar2.f94563b.getBiasPercent(i);
            float f = biasPercent > 0.0f ? (long) ((j2 / biasPercent) + (j / (1.0f - biasPercent))) : 0L;
            long j3 = ((long) ((f * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f * (1.0f - biasPercent)) + 0.5f));
            wki wkiVar3 = this.f104800c;
            wrapDimension = ((long) wkiVar3.f94569h.f69822f) + j3;
            i2 = wkiVar3.f94570i.f69822f;
        } else {
            if (zContains) {
                return Math.max(traverseStart(this.f104800c.f94569h, r12.f69822f), ((long) this.f104800c.f94569h.f69822f) + wrapDimension2);
            }
            if (zContains2) {
                return Math.max(-traverseEnd(this.f104800c.f94570i, r12.f69822f), ((long) (-this.f104800c.f94570i.f69822f)) + wrapDimension2);
            }
            wki wkiVar4 = this.f104800c;
            wrapDimension = ((long) wkiVar4.f94569h.f69822f) + wkiVar4.getWrapDimension();
            i2 = this.f104800c.f94570i.f69822f;
        }
        return wrapDimension - ((long) i2);
    }

    public void defineTerminalWidgets(boolean z, boolean z2) {
        if (z) {
            wki wkiVar = this.f104800c;
            if (wkiVar instanceof rl7) {
                defineTerminalWidget(wkiVar, 0);
            }
        }
        if (z2) {
            wki wkiVar2 = this.f104800c;
            if (wkiVar2 instanceof k5i) {
                defineTerminalWidget(wkiVar2, 1);
            }
        }
    }
}
