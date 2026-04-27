package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1#2:113\n11102#3:114\n11437#3,3:115\n12671#3,3:132\n1971#4,14:118\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n41#1:114\n41#1:115,3\n78#1:132,3\n59#1:118,14\n*E\n"})
public final class w75 {

    /* JADX INFO: renamed from: a */
    public static final int f93441a = fieldsCountOrDefault(Throwable.class, -1);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final j93 f93442b;

    /* JADX INFO: renamed from: w75$a */
    public static final class C14447a implements qy6 {

        /* JADX INFO: renamed from: a */
        public static final C14447a f93443a = new C14447a();

        @Override // p000.qy6
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    static {
        j93 j93Var;
        try {
            j93Var = qp5.getANDROID_DETECTED() ? cii.f16666a : s12.f80361a;
        } catch (Throwable unused) {
            j93Var = cii.f16666a;
        }
        f93442b = j93Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> qy6<Throwable, Throwable> createConstructor(Class<E> cls) {
        Object next;
        qy6<Throwable, Throwable> qy6Var;
        scc sccVarM24050to;
        C14447a c14447a = C14447a.f93443a;
        if (f93441a != fieldsCountOrDefault(cls, 0)) {
            return c14447a;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            next = null;
            if (i >= length) {
                break;
            }
            final Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                sccVarM24050to = vkh.m24050to(safeCtor(new qy6() { // from class: v75
                    @Override // p000.qy6
                    public final Object invoke(Object obj) {
                        return w75.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                    }
                }), 0);
            } else if (length2 != 1) {
                sccVarM24050to = length2 != 2 ? vkh.m24050to(null, -1) : (md8.areEqual(parameterTypes[0], String.class) && md8.areEqual(parameterTypes[1], Throwable.class)) ? vkh.m24050to(safeCtor(new qy6() { // from class: s75
                    @Override // p000.qy6
                    public final Object invoke(Object obj) {
                        return w75.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                    }
                }), 3) : vkh.m24050to(null, -1);
            } else {
                Class<?> cls2 = parameterTypes[0];
                sccVarM24050to = md8.areEqual(cls2, String.class) ? vkh.m24050to(safeCtor(new qy6() { // from class: t75
                    @Override // p000.qy6
                    public final Object invoke(Object obj) {
                        return w75.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                    }
                }), 2) : md8.areEqual(cls2, Throwable.class) ? vkh.m24050to(safeCtor(new qy6() { // from class: u75
                    @Override // p000.qy6
                    public final Object invoke(Object obj) {
                        return w75.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                    }
                }), 1) : vkh.m24050to(null, -1);
            }
            arrayList.add(sccVarM24050to);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((scc) next).getSecond()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((scc) next2).getSecond()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        }
        scc sccVar = (scc) next;
        return (sccVar == null || (qy6Var = (qy6) sccVar.getFirst()) == null) ? c14447a : qy6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage(), th);
        md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage());
        md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th);
        md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m24368f(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object objM32723constructorimpl;
        hn8.getKotlinClass(cls);
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(Integer.valueOf(m24368f(cls, 0, 1, null)));
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(i);
        if (v7e.m32729isFailureimpl(objM32723constructorimpl)) {
            objM32723constructorimpl = numValueOf;
        }
        return ((Number) objM32723constructorimpl).intValue();
    }

    private static final qy6<Throwable, Throwable> safeCtor(final qy6<? super Throwable, ? extends Throwable> qy6Var) {
        return new qy6() { // from class: r75
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return w75.safeCtor$lambda$9(qy6Var, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable safeCtor$lambda$9(qy6 qy6Var, Throwable th) {
        Object objM32723constructorimpl;
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            Throwable th2 = (Throwable) qy6Var.invoke(th);
            if (!md8.areEqual(th.getMessage(), th2.getMessage()) && !md8.areEqual(th2.getMessage(), th.toString())) {
                th2 = null;
            }
            objM32723constructorimpl = v7e.m32723constructorimpl(th2);
        } catch (Throwable th3) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th3));
        }
        return (Throwable) (v7e.m32729isFailureimpl(objM32723constructorimpl) ? null : objM32723constructorimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public static final <E extends Throwable> E tryCopyException(@yfb E e) {
        Object objM32723constructorimpl;
        if (!(e instanceof h03)) {
            return (E) f93442b.get(e.getClass()).invoke(e);
        }
        try {
            v7e.C13927a c13927a = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(((h03) e).createCopy());
        } catch (Throwable th) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            objM32723constructorimpl = v7e.m32723constructorimpl(y7e.createFailure(th));
        }
        if (v7e.m32729isFailureimpl(objM32723constructorimpl)) {
            objM32723constructorimpl = null;
        }
        return (E) objM32723constructorimpl;
    }
}
