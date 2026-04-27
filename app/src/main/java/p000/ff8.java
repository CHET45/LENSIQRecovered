package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class ff8<T> extends jmh<Iterable<? super T>> {

    /* JADX INFO: renamed from: c */
    public final yv9<? super T> f36364c;

    public ff8(yv9<? super T> yv9Var) {
        this.f36364c = yv9Var;
    }

    @io5
    public static <T> yv9<Iterable<? super T>> hasItem(yv9<? super T> yv9Var) {
        return new ff8(yv9Var);
    }

    @io5
    public static <T> yv9<Iterable<T>> hasItems(yv9<? super T>... yv9VarArr) {
        ArrayList arrayList = new ArrayList(yv9VarArr.length);
        for (yv9<? super T> yv9Var : yv9VarArr) {
            arrayList.add(new ff8(yv9Var));
        }
        return C16183zm.allOf(arrayList);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("a collection containing ").appendDescriptionOf(this.f36364c);
    }

    @io5
    public static <T> yv9<Iterable<? super T>> hasItem(T t) {
        return new ff8(mf8.equalTo(t));
    }

    @Override // p000.jmh
    public boolean matchesSafely(Iterable<? super T> iterable, i74 i74Var) {
        boolean z = false;
        for (T t : iterable) {
            if (this.f36364c.matches(t)) {
                return true;
            }
            if (z) {
                i74Var.appendText(", ");
            }
            this.f36364c.describeMismatch(t, i74Var);
            z = true;
        }
        return false;
    }

    @io5
    public static <T> yv9<Iterable<T>> hasItems(T... tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(hasItem(t));
        }
        return C16183zm.allOf(arrayList);
    }
}
