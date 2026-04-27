package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
public interface wc8<T> {

    /* JADX INFO: renamed from: wc8$a */
    @dwf({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
    @e0g(parameters = 1)
    public static final class C14548a<T> {

        /* JADX INFO: renamed from: d */
        public static final int f93938d = 0;

        /* JADX INFO: renamed from: a */
        public final int f93939a;

        /* JADX INFO: renamed from: b */
        public final int f93940b;

        /* JADX INFO: renamed from: c */
        public final T f93941c;

        public C14548a(int i, int i2, T t) {
            this.f93939a = i;
            this.f93940b = i2;
            this.f93941c = t;
            if (i < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
            }
            if (i2 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
        }

        public final int getSize() {
            return this.f93940b;
        }

        public final int getStartIndex() {
            return this.f93939a;
        }

        public final T getValue() {
            return this.f93941c;
        }
    }

    static /* synthetic */ void forEach$default(wc8 wc8Var, int i, int i2, qy6 qy6Var, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = wc8Var.getSize() - 1;
        }
        wc8Var.forEach(i, i2, qy6Var);
    }

    void forEach(int i, int i2, @yfb qy6<? super C14548a<? extends T>, bth> qy6Var);

    @yfb
    C14548a<T> get(int i);

    int getSize();
}
