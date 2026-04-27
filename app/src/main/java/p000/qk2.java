package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1804#2,4:227\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n145#1:223\n145#1:224,3\n146#1:227,4\n*E\n"})
@e0g(parameters = 0)
public final class qk2 {

    /* JADX INFO: renamed from: c */
    public static final int f74730c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Method f74731a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final jk2 f74732b;

    public qk2(@yfb Method method, @yfb jk2 jk2Var) {
        this.f74731a = method;
        this.f74732b = jk2Var;
    }

    @yfb
    public final Method asMethod() {
        return this.f74731a;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof qk2) {
            return md8.areEqual(this.f74731a, ((qk2) obj).f74731a);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.f74732b.getRealParamsCount();
    }

    @yfb
    public final Class<?>[] getParameterTypes() {
        return (Class[]) u70.copyOfRange(this.f74731a.getParameterTypes(), 0, this.f74732b.getRealParamsCount());
    }

    @yfb
    public final Parameter[] getParameters() {
        return (Parameter[]) u70.copyOfRange(this.f74731a.getParameters(), 0, this.f74732b.getRealParamsCount());
    }

    public int hashCode() {
        return this.f74731a.hashCode();
    }

    @gib
    public final Object invoke(@yfb zl2 zl2Var, @gib Object obj, @yfb Object... objArr) {
        Object defaultValue;
        jk2 jk2Var = this.f74732b;
        int iComponent2 = jk2Var.component2();
        int iComponent3 = jk2Var.component3();
        int iComponent4 = jk2Var.component4();
        int length = this.f74731a.getParameterTypes().length;
        int i = iComponent2 + 1;
        int i2 = iComponent3 + i;
        Object[] objArr2 = new Integer[iComponent4];
        int i3 = 0;
        for (int i4 = 0; i4 < iComponent4; i4++) {
            int i5 = i4 * 31;
            f78 f78VarUntil = kpd.until(i5, Math.min(i5 + 31, iComponent2));
            ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil, 10));
            Iterator<Integer> it = f78VarUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((o68) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= objArr.length || objArr[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i6 = 0;
            for (Object obj2 : arrayList) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    l82.throwIndexOverflow();
                }
                iIntValue |= ((Number) obj2).intValue() << i6;
                i6 = i7;
            }
            objArr2[i4] = Integer.valueOf(iIntValue);
        }
        Object[] objArr3 = new Object[length];
        while (i3 < length) {
            if (i3 >= 0 && i3 < iComponent2) {
                defaultValue = (i3 < 0 || i3 > e80.getLastIndex(objArr)) ? rk2.getDefaultValue(this.f74731a.getParameterTypes()[i3]) : objArr[i3];
            } else if (i3 == iComponent2) {
                defaultValue = zl2Var;
            } else if (i3 == i || (iComponent2 + 2 <= i3 && i3 < i2)) {
                defaultValue = 0;
            } else {
                if (i2 > i3 || i3 >= length) {
                    throw new IllegalStateException("Unexpected index");
                }
                defaultValue = objArr2[i3 - i2];
            }
            objArr3[i3] = defaultValue;
            i3++;
        }
        return this.f74731a.invoke(obj, Arrays.copyOf(objArr3, length));
    }
}
