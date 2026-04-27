package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class wwe {

    /* JADX INFO: renamed from: l */
    public static final int f95624l = 8;

    /* JADX INFO: renamed from: a */
    public final long f95625a;

    /* JADX INFO: renamed from: b */
    public final long f95626b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final mv8 f95627c;

    /* JADX INFO: renamed from: d */
    public final boolean f95628d;

    /* JADX INFO: renamed from: e */
    @gib
    public final gwe f95629e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Comparator<Long> f95630f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final r5b f95631g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final List<ewe> f95632h;

    /* JADX INFO: renamed from: i */
    public int f95633i;

    /* JADX INFO: renamed from: j */
    public int f95634j;

    /* JADX INFO: renamed from: k */
    public int f95635k;

    /* JADX INFO: renamed from: wwe$a */
    public /* synthetic */ class C14817a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95636a;

        static {
            int[] iArr = new int[pd4.values().length];
            try {
                iArr[pd4.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pd4.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pd4.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f95636a = iArr;
        }
    }

    public /* synthetic */ wwe(long j, long j2, mv8 mv8Var, boolean z, gwe gweVar, Comparator comparator, jt3 jt3Var) {
        this(j, j2, mv8Var, z, gweVar, comparator);
    }

    private final int updateSlot(int i, pd4 pd4Var, pd4 pd4Var2) {
        if (i != -1) {
            return i;
        }
        int i2 = C14817a.f95636a[xwe.resolve2dDirection(pd4Var, pd4Var2).ordinal()];
        if (i2 == 1) {
            return this.f95635k - 1;
        }
        if (i2 == 2) {
            return this.f95635k;
        }
        if (i2 == 3) {
            return i;
        }
        throw new ceb();
    }

    @yfb
    public final ewe appendInfo(long j, int i, @yfb pd4 pd4Var, @yfb pd4 pd4Var2, int i2, @yfb pd4 pd4Var3, @yfb pd4 pd4Var4, int i3, @yfb hug hugVar) {
        this.f95635k += 2;
        ewe eweVar = new ewe(j, this.f95635k, i, i2, i3, hugVar);
        this.f95633i = updateSlot(this.f95633i, pd4Var, pd4Var2);
        this.f95634j = updateSlot(this.f95634j, pd4Var3, pd4Var4);
        this.f95631g.set(j, this.f95632h.size());
        this.f95632h.add(eweVar);
        return eweVar;
    }

    @yfb
    public final vwe build() {
        int i = this.f95635k + 1;
        int size = this.f95632h.size();
        if (size == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size == 1) {
            ewe eweVar = (ewe) v82.single((List) this.f95632h);
            int i2 = this.f95633i;
            int i3 = i2 == -1 ? i : i2;
            int i4 = this.f95634j;
            return new nof(this.f95628d, i3, i4 == -1 ? i : i4, this.f95629e, eweVar);
        }
        r5b r5bVar = this.f95631g;
        List<ewe> list = this.f95632h;
        int i5 = this.f95633i;
        int i6 = i5 == -1 ? i : i5;
        int i7 = this.f95634j;
        return new f3b(r5bVar, list, i6, i7 == -1 ? i : i7, this.f95628d, this.f95629e);
    }

    @yfb
    public final mv8 getContainerCoordinates() {
        return this.f95627c;
    }

    /* JADX INFO: renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name */
    public final long m33120getCurrentPositionF1C5BW0() {
        return this.f95625a;
    }

    /* JADX INFO: renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name */
    public final long m33121getPreviousHandlePositionF1C5BW0() {
        return this.f95626b;
    }

    @gib
    public final gwe getPreviousSelection() {
        return this.f95629e;
    }

    @yfb
    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.f95630f;
    }

    public final boolean isStartHandle() {
        return this.f95628d;
    }

    private wwe(long j, long j2, mv8 mv8Var, boolean z, gwe gweVar, Comparator<Long> comparator) {
        this.f95625a = j;
        this.f95626b = j2;
        this.f95627c = mv8Var;
        this.f95628d = z;
        this.f95629e = gweVar;
        this.f95630f = comparator;
        this.f95631g = fl9.mutableLongIntMapOf();
        this.f95632h = new ArrayList();
        this.f95633i = -1;
        this.f95634j = -1;
        this.f95635k = -1;
    }
}
