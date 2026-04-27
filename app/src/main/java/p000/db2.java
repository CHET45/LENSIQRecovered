package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class db2<T> extends jmh<T> {

    /* JADX INFO: renamed from: c */
    public final yv9<? super T> f29171c;

    /* JADX INFO: renamed from: db2$a */
    public static final class C4720a<X> {

        /* JADX INFO: renamed from: a */
        public final yv9<? super X> f29172a;

        public C4720a(yv9<? super X> yv9Var) {
            this.f29172a = yv9Var;
        }

        public db2<X> and(yv9<? super X> yv9Var) {
            return new db2(this.f29172a).and(yv9Var);
        }
    }

    /* JADX INFO: renamed from: db2$b */
    public static final class C4721b<X> {

        /* JADX INFO: renamed from: a */
        public final yv9<? super X> f29173a;

        public C4721b(yv9<? super X> yv9Var) {
            this.f29173a = yv9Var;
        }

        /* JADX INFO: renamed from: or */
        public db2<X> m9042or(yv9<? super X> yv9Var) {
            return new db2(this.f29173a).m9041or(yv9Var);
        }
    }

    public db2(yv9<? super T> yv9Var) {
        this.f29171c = yv9Var;
    }

    @io5
    public static <LHS> C4720a<LHS> both(yv9<? super LHS> yv9Var) {
        return new C4720a<>(yv9Var);
    }

    @io5
    public static <LHS> C4721b<LHS> either(yv9<? super LHS> yv9Var) {
        return new C4721b<>(yv9Var);
    }

    private ArrayList<yv9<? super T>> templatedListWith(yv9<? super T> yv9Var) {
        ArrayList<yv9<? super T>> arrayList = new ArrayList<>();
        arrayList.add(this.f29171c);
        arrayList.add(yv9Var);
        return arrayList;
    }

    public db2<T> and(yv9<? super T> yv9Var) {
        return new db2<>(new C16183zm(templatedListWith(yv9Var)));
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendDescriptionOf(this.f29171c);
    }

    @Override // p000.jmh
    public boolean matchesSafely(T t, i74 i74Var) {
        if (this.f29171c.matches(t)) {
            return true;
        }
        this.f29171c.describeMismatch(t, i74Var);
        return false;
    }

    /* JADX INFO: renamed from: or */
    public db2<T> m9041or(yv9<? super T> yv9Var) {
        return new db2<>(new C16325zz(templatedListWith(yv9Var)));
    }
}
