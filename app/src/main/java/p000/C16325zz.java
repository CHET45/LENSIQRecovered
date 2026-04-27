package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: zz */
/* JADX INFO: loaded from: classes8.dex */
public class C16325zz<T> extends zaf<T> {
    public C16325zz(Iterable<yv9<? super T>> iterable) {
        super(iterable);
    }

    @io5
    public static <T> C16325zz<T> anyOf(Iterable<yv9<? super T>> iterable) {
        return new C16325zz<>(iterable);
    }

    @Override // p000.zaf
    public /* bridge */ /* synthetic */ void describeTo(i74 i74Var, String str) {
        super.describeTo(i74Var, str);
    }

    @Override // p000.zaf, p000.yv9
    public boolean matches(Object obj) {
        return m26633a(obj, true);
    }

    @io5
    public static <T> C16325zz<T> anyOf(yv9<? super T>... yv9VarArr) {
        return anyOf(Arrays.asList(yv9VarArr));
    }

    @Override // p000.zaf, p000.ixe
    public void describeTo(i74 i74Var) {
        describeTo(i74Var, "or");
    }

    @io5
    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        return anyOf(arrayList);
    }

    @io5
    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        return anyOf(arrayList);
    }

    @io5
    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        arrayList.add(yv9Var4);
        return anyOf(arrayList);
    }

    @io5
    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        arrayList.add(yv9Var4);
        arrayList.add(yv9Var5);
        return anyOf(arrayList);
    }

    @io5
    public static <T> C16325zz<T> anyOf(yv9<T> yv9Var, yv9<? super T> yv9Var2, yv9<? super T> yv9Var3, yv9<? super T> yv9Var4, yv9<? super T> yv9Var5, yv9<? super T> yv9Var6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(yv9Var);
        arrayList.add(yv9Var2);
        arrayList.add(yv9Var3);
        arrayList.add(yv9Var4);
        arrayList.add(yv9Var5);
        arrayList.add(yv9Var6);
        return anyOf(arrayList);
    }
}
