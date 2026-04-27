package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class oxd<E> extends dy7<E> {

    /* JADX INFO: renamed from: L */
    public static final Object[] f69162L;

    /* JADX INFO: renamed from: M */
    public static final oxd<Object> f69163M;

    /* JADX INFO: renamed from: C */
    @gdi
    public final transient Object[] f69164C;

    /* JADX INFO: renamed from: F */
    public final transient int f69165F;

    /* JADX INFO: renamed from: H */
    public final transient int f69166H;

    /* JADX INFO: renamed from: f */
    @gdi
    public final transient Object[] f69167f;

    /* JADX INFO: renamed from: m */
    public final transient int f69168m;

    static {
        Object[] objArr = new Object[0];
        f69162L = objArr;
        f69163M = new oxd<>(objArr, 0, objArr, 0, 0);
    }

    public oxd(Object[] elements, int hashCode, Object[] table, int mask, int size) {
        this.f69167f = elements;
        this.f69168m = hashCode;
        this.f69164C = table;
        this.f69165F = mask;
        this.f69166H = size;
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        System.arraycopy(this.f69167f, 0, dst, offset, this.f69166H);
        return offset + this.f69166H;
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: b */
    public Object[] mo2719b() {
        return this.f69167f;
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: c */
    public int mo2720c() {
        return this.f69166H;
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object target) {
        Object[] objArr = this.f69164C;
        if (target == null || objArr.length == 0) {
            return false;
        }
        int iM25912d = yh7.m25912d(target);
        while (true) {
            int i = iM25912d & this.f69165F;
            Object obj = objArr[i];
            if (obj == null) {
                return false;
            }
            if (obj.equals(target)) {
                return true;
            }
            iM25912d = i + 1;
        }
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: d */
    public int mo2721d() {
        return 0;
    }

    @Override // p000.dy7
    /* JADX INFO: renamed from: h */
    public kx7<E> mo9582h() {
        return kx7.m15109f(this.f69167f, this.f69166H);
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f69168m;
    }

    @Override // p000.dy7
    /* JADX INFO: renamed from: i */
    public boolean mo9583i() {
        return true;
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f69166H;
    }

    @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return asList().iterator();
    }
}
