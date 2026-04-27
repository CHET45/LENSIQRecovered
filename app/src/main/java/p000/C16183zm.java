package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: zm */
/* JADX INFO: loaded from: classes8.dex */
public class C16183zm<T> extends w94<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<yv9<? super T>> f105444a;

    public C16183zm(Iterable<yv9<? super T>> iterable) {
        this.f105444a = iterable;
    }

    @io5
    public static <T> yv9<T> allOf(Iterable<yv9<? super T>> iterable) {
        return new C16183zm(iterable);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendList(c0b.f15433c, " and ", c0b.f15434d, this.f105444a);
    }

    @Override // p000.w94
    public boolean matches(Object obj, i74 i74Var) {
        for (yv9<? super T> yv9Var : this.f105444a) {
            if (!yv9Var.matches(obj)) {
                i74Var.appendDescriptionOf(yv9Var).appendText(C2473f.f17566z);
                yv9Var.describeMismatch(obj, i74Var);
                return false;
            }
        }
        return true;
    }

    @io5
    public static <T> yv9<T> allOf(yv9<? super T>... yv9VarArr) {
        return allOf(Arrays.asList(yv9VarArr));
    }

    @io5
    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        return allOf(arrayList);
    }

    @io5
    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        return allOf(arrayList);
    }

    @io5
    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        arrayList.add(yv9Var4);
        return allOf(arrayList);
    }

    @io5
    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        arrayList.add(yv9Var4);
        arrayList.add(yv9Var5);
        return allOf(arrayList);
    }

    @io5
    public static <T> yv9<T> allOf(yv9<? super T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5, yv9<? super T> yv9Var6) {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        arrayList.add(yv9Var4);
        arrayList.add(yv9Var5);
        arrayList.add(yv9Var6);
        return allOf(arrayList);
    }
}
