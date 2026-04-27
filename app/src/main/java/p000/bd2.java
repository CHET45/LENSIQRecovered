package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class bd2 {

    /* JADX INFO: renamed from: a */
    public static final bd2 f13387a = new C1838a();

    /* JADX INFO: renamed from: b */
    public static final bd2 f13388b = new C1839b(-1);

    /* JADX INFO: renamed from: c */
    public static final bd2 f13389c = new C1839b(1);

    /* JADX INFO: renamed from: bd2$a */
    public class C1838a extends bd2 {
        public C1838a() {
            super(null);
        }

        @Override // p000.bd2
        public bd2 compare(Comparable<?> left, Comparable<?> right) {
            return m3047d(left.compareTo(right));
        }

        @Override // p000.bd2
        public bd2 compareFalseFirst(boolean left, boolean right) {
            return m3047d(hb1.compare(left, right));
        }

        @Override // p000.bd2
        public bd2 compareTrueFirst(boolean left, boolean right) {
            return m3047d(hb1.compare(right, left));
        }

        /* JADX INFO: renamed from: d */
        public bd2 m3047d(int result) {
            return result < 0 ? bd2.f13388b : result > 0 ? bd2.f13389c : bd2.f13387a;
        }

        @Override // p000.bd2
        public int result() {
            return 0;
        }

        @Override // p000.bd2
        public <T> bd2 compare(@dgc T left, @dgc T right, Comparator<T> comparator) {
            return m3047d(comparator.compare(left, right));
        }

        @Override // p000.bd2
        public bd2 compare(int left, int right) {
            return m3047d(rd8.compare(left, right));
        }

        @Override // p000.bd2
        public bd2 compare(long left, long right) {
            return m3047d(im9.compare(left, right));
        }

        @Override // p000.bd2
        public bd2 compare(float left, float right) {
            return m3047d(Float.compare(left, right));
        }

        @Override // p000.bd2
        public bd2 compare(double left, double right) {
            return m3047d(Double.compare(left, right));
        }
    }

    /* JADX INFO: renamed from: bd2$b */
    public static final class C1839b extends bd2 {

        /* JADX INFO: renamed from: d */
        public final int f13390d;

        public C1839b(int result) {
            super(null);
            this.f13390d = result;
        }

        @Override // p000.bd2
        public bd2 compare(Comparable<?> left, Comparable<?> right) {
            return this;
        }

        @Override // p000.bd2
        public bd2 compareFalseFirst(boolean left, boolean right) {
            return this;
        }

        @Override // p000.bd2
        public bd2 compareTrueFirst(boolean left, boolean right) {
            return this;
        }

        @Override // p000.bd2
        public int result() {
            return this.f13390d;
        }

        @Override // p000.bd2
        public <T> bd2 compare(@dgc T left, @dgc T right, Comparator<T> comparator) {
            return this;
        }

        @Override // p000.bd2
        public bd2 compare(int left, int right) {
            return this;
        }

        @Override // p000.bd2
        public bd2 compare(long left, long right) {
            return this;
        }

        @Override // p000.bd2
        public bd2 compare(float left, float right) {
            return this;
        }

        @Override // p000.bd2
        public bd2 compare(double left, double right) {
            return this;
        }
    }

    public /* synthetic */ bd2(C1838a c1838a) {
        this();
    }

    public static bd2 start() {
        return f13387a;
    }

    public abstract bd2 compare(double left, double right);

    public abstract bd2 compare(float left, float right);

    public abstract bd2 compare(int left, int right);

    public abstract bd2 compare(long left, long right);

    @Deprecated
    public final bd2 compare(Boolean left, Boolean right) {
        return compareFalseFirst(left.booleanValue(), right.booleanValue());
    }

    public abstract bd2 compare(Comparable<?> left, Comparable<?> right);

    public abstract <T> bd2 compare(@dgc T left, @dgc T right, Comparator<T> comparator);

    public abstract bd2 compareFalseFirst(boolean left, boolean right);

    public abstract bd2 compareTrueFirst(boolean left, boolean right);

    public abstract int result();

    private bd2() {
    }
}
