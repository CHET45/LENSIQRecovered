package p000;

import java.util.Comparator;
import java.util.Map;
import p000.yya;

/* JADX INFO: loaded from: classes5.dex */
@w01
@wx4
@tw7
public final class mx4<T> {

    /* JADX INFO: renamed from: a */
    public final EnumC9580b f62620a;

    /* JADX INFO: renamed from: b */
    @wx1
    public final Comparator<T> f62621b;

    /* JADX INFO: renamed from: mx4$a */
    public static /* synthetic */ class C9579a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62622a;

        static {
            int[] iArr = new int[EnumC9580b.values().length];
            f62622a = iArr;
            try {
                iArr[EnumC9580b.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62622a[EnumC9580b.INSERTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62622a[EnumC9580b.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62622a[EnumC9580b.SORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: mx4$b */
    public enum EnumC9580b {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    private mx4(EnumC9580b type, @wx1 Comparator<T> comparator) {
        this.f62620a = (EnumC9580b) v7d.checkNotNull(type);
        this.f62621b = comparator;
        v7d.checkState((type == EnumC9580b.SORTED) == (comparator != null));
    }

    public static <S> mx4<S> insertion() {
        return new mx4<>(EnumC9580b.INSERTION, null);
    }

    public static <S extends Comparable<? super S>> mx4<S> natural() {
        return new mx4<>(EnumC9580b.SORTED, s7c.natural());
    }

    public static <S> mx4<S> sorted(Comparator<S> comparator) {
        return new mx4<>(EnumC9580b.SORTED, (Comparator) v7d.checkNotNull(comparator));
    }

    public static <S> mx4<S> stable() {
        return new mx4<>(EnumC9580b.STABLE, null);
    }

    public static <S> mx4<S> unordered() {
        return new mx4<>(EnumC9580b.UNORDERED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T1 extends T> mx4<T1> m17651a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public <K extends T, V> Map<K, V> m17652b(int expectedSize) {
        int i = C9579a.f62622a[this.f62620a.ordinal()];
        if (i == 1) {
            return tt9.newHashMapWithExpectedSize(expectedSize);
        }
        if (i == 2 || i == 3) {
            return tt9.newLinkedHashMapWithExpectedSize(expectedSize);
        }
        if (i == 4) {
            return tt9.newTreeMap(comparator());
        }
        throw new AssertionError();
    }

    public Comparator<T> comparator() {
        Comparator<T> comparator = this.f62621b;
        if (comparator != null) {
            return comparator;
        }
        throw new UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public boolean equals(@wx1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mx4)) {
            return false;
        }
        mx4 mx4Var = (mx4) obj;
        return this.f62620a == mx4Var.f62620a && okb.equal(this.f62621b, mx4Var.f62621b);
    }

    public int hashCode() {
        return okb.hashCode(this.f62620a, this.f62621b);
    }

    public String toString() {
        yya.C15889b c15889bAdd = yya.toStringHelper(this).add("type", this.f62620a);
        Comparator<T> comparator = this.f62621b;
        if (comparator != null) {
            c15889bAdd.add("comparator", comparator);
        }
        return c15889bAdd.toString();
    }

    public EnumC9580b type() {
        return this.f62620a;
    }
}
