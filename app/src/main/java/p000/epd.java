package p000;

import android.util.Range;
import p000.a62;

/* JADX INFO: loaded from: classes.dex */
@igg({"ClassVerificationFailure"})
public final class epd {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: epd$a */
    public static final class C5434a<T> implements a62<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Range<T> f33816a;

        public C5434a(Range<T> range) {
            this.f33816a = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // p000.a62, p000.r5c
        public boolean contains(@yfb Comparable comparable) {
            return a62.C0071a.contains(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // p000.a62
        public Comparable getEndInclusive() {
            return this.f33816a.getUpper();
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // p000.a62, p000.r5c
        public Comparable getStart() {
            return this.f33816a.getLower();
        }

        @Override // p000.a62, p000.r5c
        public boolean isEmpty() {
            return a62.C0071a.isEmpty(this);
        }
    }

    @c5e(21)
    @yfb
    public static final <T extends Comparable<? super T>> Range<T> and(@yfb Range<T> range, @yfb Range<T> range2) {
        return range.intersect(range2);
    }

    @c5e(21)
    @yfb
    public static final <T extends Comparable<? super T>> Range<T> plus(@yfb Range<T> range, @yfb T t) {
        return range.extend(t);
    }

    @c5e(21)
    @yfb
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(@yfb T t, @yfb T t2) {
        return new Range<>(t, t2);
    }

    @c5e(21)
    @yfb
    public static final <T extends Comparable<? super T>> a62<T> toClosedRange(@yfb Range<T> range) {
        return new C5434a(range);
    }

    @c5e(21)
    @yfb
    public static final <T extends Comparable<? super T>> Range<T> toRange(@yfb a62<T> a62Var) {
        return new Range<>(a62Var.getStart(), a62Var.getEndInclusive());
    }

    @c5e(21)
    @yfb
    public static final <T extends Comparable<? super T>> Range<T> plus(@yfb Range<T> range, @yfb Range<T> range2) {
        return range.extend(range2);
    }
}
