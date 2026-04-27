package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n187#1:235\n187#1:242\n187#1:249\n1735#2,6:223\n1549#3:229\n1620#3,3:230\n1549#3:236\n1620#3,3:237\n1549#3:243\n1620#3,3:244\n1549#3:250\n1620#3,3:251\n37#4,2:233\n37#4,2:240\n37#4,2:247\n37#4,2:254\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n203#1:235\n212#1:242\n213#1:249\n59#1:223,6\n187#1:229\n187#1:230,3\n203#1:236\n203#1:237,3\n212#1:243\n212#1:244,3\n213#1:250\n213#1:251,3\n187#1:233,2\n203#1:240,2\n212#1:247,2\n213#1:254,2\n*E\n"})
@xn8(name = "ComposableMethodKt")
public final class rk2 {

    /* JADX INFO: renamed from: a */
    public static final int f78535a = 31;

    @gib
    public static final qk2 asComposableMethod(@yfb Method method) {
        jk2 composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new qk2(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i + i2)) / 10.0d);
    }

    private static final int defaultParamCount(int i) {
        return (int) Math.ceil(((double) i) / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t, int i) {
        f78 f78VarUntil = kpd.until(0, i);
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil, 10));
        Iterator<Integer> it = f78VarUntil.iterator();
        while (it.hasNext()) {
            ((o68) it).nextInt();
            arrayList.add(t);
        }
        md8.reifiedOperationMarker(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final jk2 getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (md8.areEqual(parameterTypes[length], zl2.class)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return new jk2(false, method.getParameterTypes().length, 0, 0);
        }
        int iChangedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i2 = length + 1 + iChangedParamCount;
        int length2 = method.getParameterTypes().length;
        int iDefaultParamCount = length2 != i2 ? defaultParamCount(length) : 0;
        return new jk2(i2 + iDefaultParamCount == length2, length, iChangedParamCount, iDefaultParamCount);
    }

    @yfb
    public static final qk2 getDeclaredComposableMethod(@yfb Class<?> cls, @yfb String str, @yfb Class<?>... clsArr) throws NoSuchMethodException {
        Method declaredMethod;
        int iChangedParamCount = changedParamCount(clsArr.length, 0);
        try {
            fzf fzfVar = new fzf(3);
            fzfVar.addSpread(clsArr);
            fzfVar.add(zl2.class);
            Class cls2 = Integer.TYPE;
            f78 f78VarUntil = kpd.until(0, iChangedParamCount);
            ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil, 10));
            Iterator<Integer> it = f78VarUntil.iterator();
            while (it.hasNext()) {
                ((o68) it).nextInt();
                arrayList.add(cls2);
            }
            fzfVar.addSpread(arrayList.toArray(new Class[0]));
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) fzfVar.toArray(new Class[fzfVar.size()]));
        } catch (ReflectiveOperationException unused) {
            int iDefaultParamCount = defaultParamCount(clsArr.length);
            try {
                fzf fzfVar2 = new fzf(4);
                fzfVar2.addSpread(clsArr);
                fzfVar2.add(zl2.class);
                Class cls3 = Integer.TYPE;
                f78 f78VarUntil2 = kpd.until(0, iChangedParamCount);
                ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil2, 10));
                Iterator<Integer> it2 = f78VarUntil2.iterator();
                while (it2.hasNext()) {
                    ((o68) it2).nextInt();
                    arrayList2.add(cls3);
                }
                fzfVar2.addSpread(arrayList2.toArray(new Class[0]));
                Class cls4 = Integer.TYPE;
                f78 f78VarUntil3 = kpd.until(0, iDefaultParamCount);
                ArrayList arrayList3 = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil3, 10));
                Iterator<Integer> it3 = f78VarUntil3.iterator();
                while (it3.hasNext()) {
                    ((o68) it3).nextInt();
                    arrayList3.add(cls4);
                }
                fzfVar2.addSpread(arrayList3.toArray(new Class[0]));
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) fzfVar2.toArray(new Class[fzfVar2.size()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            qk2 qk2VarAsComposableMethod = asComposableMethod(declaredMethod);
            md8.checkNotNull(qk2VarAsComposableMethod);
            return qk2VarAsComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + a18.f100c + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals(ymh.InterfaceC15723b.f102128f)) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals(ymh.InterfaceC15723b.f102125c)) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }
}
