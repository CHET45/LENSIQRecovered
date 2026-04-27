package p000;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import p000.kkg;
import p000.ox7;
import p000.ty7;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
@tw7(containerOf = {"R", "C", k95.f53074X4})
public final class b64<R, C, V> extends sxd<R, C, V> {

    /* JADX INFO: renamed from: C */
    public final int[] f12766C;

    /* JADX INFO: renamed from: F */
    public final V[][] f12767F;

    /* JADX INFO: renamed from: H */
    public final int[] f12768H;

    /* JADX INFO: renamed from: L */
    public final int[] f12769L;

    /* JADX INFO: renamed from: c */
    public final ox7<R, Integer> f12770c;

    /* JADX INFO: renamed from: d */
    public final ox7<C, Integer> f12771d;

    /* JADX INFO: renamed from: e */
    public final ox7<R, ox7<C, V>> f12772e;

    /* JADX INFO: renamed from: f */
    public final ox7<C, ox7<R, V>> f12773f;

    /* JADX INFO: renamed from: m */
    public final int[] f12774m;

    /* JADX INFO: renamed from: b64$b */
    public final class C1752b extends AbstractC1754d<R, V> {

        /* JADX INFO: renamed from: m */
        public final int f12776m;

        public C1752b(int columnIndex) {
            super(b64.this.f12766C[columnIndex]);
            this.f12776m = columnIndex;
        }

        @Override // p000.ox7
        /* JADX INFO: renamed from: h */
        public boolean mo2953h() {
            return true;
        }

        @Override // p000.b64.AbstractC1754d
        @wx1
        /* JADX INFO: renamed from: l */
        public V mo2954l(int i) {
            return (V) b64.this.f12767F[i][this.f12776m];
        }

        @Override // p000.b64.AbstractC1754d
        /* JADX INFO: renamed from: m */
        public ox7<R, Integer> mo2955m() {
            return b64.this.f12770c;
        }
    }

    /* JADX INFO: renamed from: b64$c */
    public final class C1753c extends AbstractC1754d<C, ox7<R, V>> {
        @Override // p000.ox7
        /* JADX INFO: renamed from: h */
        public boolean mo2953h() {
            return false;
        }

        @Override // p000.b64.AbstractC1754d
        /* JADX INFO: renamed from: m */
        public ox7<C, Integer> mo2955m() {
            return b64.this.f12771d;
        }

        @Override // p000.b64.AbstractC1754d
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ox7<R, V> mo2954l(int keyIndex) {
            return new C1752b(keyIndex);
        }

        private C1753c() {
            super(b64.this.f12766C.length);
        }
    }

    /* JADX INFO: renamed from: b64$d */
    public static abstract class AbstractC1754d<K, V> extends ox7.AbstractC10703b<K, V> {

        /* JADX INFO: renamed from: f */
        public final int f12778f;

        /* JADX INFO: renamed from: b64$d$a */
        public class a extends AbstractC0012a2<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: c */
            public int f12779c = -1;

            /* JADX INFO: renamed from: d */
            public final int f12780d;

            public a() {
                this.f12780d = AbstractC1754d.this.mo2955m().size();
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> computeNext() {
                int i = this.f12779c;
                while (true) {
                    this.f12779c = i + 1;
                    int i2 = this.f12779c;
                    if (i2 >= this.f12780d) {
                        return m25a();
                    }
                    Object objMo2954l = AbstractC1754d.this.mo2954l(i2);
                    if (objMo2954l != null) {
                        return tt9.immutableEntry(AbstractC1754d.this.m2959k(this.f12779c), objMo2954l);
                    }
                    i = this.f12779c;
                }
            }
        }

        public AbstractC1754d(int size) {
            this.f12778f = size;
        }

        private boolean isFull() {
            return this.f12778f == mo2955m().size();
        }

        @Override // p000.ox7.AbstractC10703b, p000.ox7
        /* JADX INFO: renamed from: d */
        public dy7<K> mo2957d() {
            return isFull() ? mo2955m().keySet() : super.mo2957d();
        }

        @Override // p000.ox7, java.util.Map
        @wx1
        public V get(@wx1 Object key) {
            Integer num = mo2955m().get(key);
            if (num == null) {
                return null;
            }
            return mo2954l(num.intValue());
        }

        @Override // p000.ox7.AbstractC10703b
        /* JADX INFO: renamed from: j */
        public quh<Map.Entry<K, V>> mo2958j() {
            return new a();
        }

        /* JADX INFO: renamed from: k */
        public K m2959k(int index) {
            return mo2955m().keySet().asList().get(index);
        }

        @wx1
        /* JADX INFO: renamed from: l */
        public abstract V mo2954l(int keyIndex);

        /* JADX INFO: renamed from: m */
        public abstract ox7<K, Integer> mo2955m();

        @Override // java.util.Map
        public int size() {
            return this.f12778f;
        }
    }

    /* JADX INFO: renamed from: b64$e */
    public final class C1755e extends AbstractC1754d<C, V> {

        /* JADX INFO: renamed from: m */
        public final int f12783m;

        public C1755e(int rowIndex) {
            super(b64.this.f12774m[rowIndex]);
            this.f12783m = rowIndex;
        }

        @Override // p000.ox7
        /* JADX INFO: renamed from: h */
        public boolean mo2953h() {
            return true;
        }

        @Override // p000.b64.AbstractC1754d
        @wx1
        /* JADX INFO: renamed from: l */
        public V mo2954l(int i) {
            return (V) b64.this.f12767F[this.f12783m][i];
        }

        @Override // p000.b64.AbstractC1754d
        /* JADX INFO: renamed from: m */
        public ox7<C, Integer> mo2955m() {
            return b64.this.f12771d;
        }
    }

    /* JADX INFO: renamed from: b64$f */
    public final class C1756f extends AbstractC1754d<R, ox7<C, V>> {
        @Override // p000.ox7
        /* JADX INFO: renamed from: h */
        public boolean mo2953h() {
            return false;
        }

        @Override // p000.b64.AbstractC1754d
        /* JADX INFO: renamed from: m */
        public ox7<R, Integer> mo2955m() {
            return b64.this.f12770c;
        }

        @Override // p000.b64.AbstractC1754d
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ox7<C, V> mo2954l(int keyIndex) {
            return new C1755e(keyIndex);
        }

        private C1756f() {
            super(b64.this.f12774m.length);
        }
    }

    public b64(kx7<kkg.InterfaceC8439a<R, C, V>> kx7Var, dy7<R> dy7Var, dy7<C> dy7Var2) {
        this.f12767F = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, dy7Var.size(), dy7Var2.size()));
        ox7<R, Integer> ox7VarM22795p = tt9.m22795p(dy7Var);
        this.f12770c = ox7VarM22795p;
        ox7<C, Integer> ox7VarM22795p2 = tt9.m22795p(dy7Var2);
        this.f12771d = ox7VarM22795p2;
        this.f12774m = new int[ox7VarM22795p.size()];
        this.f12766C = new int[ox7VarM22795p2.size()];
        int[] iArr = new int[kx7Var.size()];
        int[] iArr2 = new int[kx7Var.size()];
        for (int i = 0; i < kx7Var.size(); i++) {
            kkg.InterfaceC8439a<R, C, V> interfaceC8439a = kx7Var.get(i);
            R rowKey = interfaceC8439a.getRowKey();
            C columnKey = interfaceC8439a.getColumnKey();
            Integer num = this.f12770c.get(rowKey);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f12771d.get(columnKey);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            m22291l(rowKey, columnKey, this.f12767F[iIntValue][iIntValue2], interfaceC8439a.getValue());
            this.f12767F[iIntValue][iIntValue2] = interfaceC8439a.getValue();
            int[] iArr3 = this.f12774m;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f12766C;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.f12768H = iArr;
        this.f12769L = iArr2;
        this.f12772e = new C1756f();
        this.f12773f = new C1753c();
    }

    @Override // p000.ty7, p000.AbstractC1739b5, p000.kkg
    @wx1
    public V get(@wx1 Object rowKey, @wx1 Object columnKey) {
        Integer num = this.f12770c.get(rowKey);
        Integer num2 = this.f12771d.get(columnKey);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f12767F[num.intValue()][num2.intValue()];
    }

    @Override // p000.sxd
    public kkg.InterfaceC8439a<R, C, V> getCell(int index) {
        int i = this.f12768H[index];
        int i2 = this.f12769L[index];
        R r = rowKeySet().asList().get(i);
        C c = columnKeySet().asList().get(i2);
        V v = this.f12767F[i][i2];
        Objects.requireNonNull(v);
        return ty7.m22917f(r, c, v);
    }

    @Override // p000.sxd
    public V getValue(int index) {
        V v = this.f12767F[this.f12768H[index]][this.f12769L[index]];
        Objects.requireNonNull(v);
        return v;
    }

    @Override // p000.ty7
    /* JADX INFO: renamed from: i */
    public ty7.C13287b mo2952i() {
        return ty7.C13287b.m22923a(this, this.f12768H, this.f12769L);
    }

    @Override // p000.kkg
    public int size() {
        return this.f12768H.length;
    }

    @Override // p000.ty7, p000.kkg
    public ox7<C, Map<R, V>> columnMap() {
        return ox7.copyOf((Map) this.f12773f);
    }

    @Override // p000.ty7, p000.kkg
    public ox7<R, Map<C, V>> rowMap() {
        return ox7.copyOf((Map) this.f12772e);
    }
}
