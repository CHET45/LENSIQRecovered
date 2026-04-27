package p000;

import com.blankj.utilcode.util.C2473f;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,214:1\n208#1,6:251\n208#1,6:257\n208#1,6:263\n208#1,6:269\n208#1,6:275\n208#1,6:281\n1#2:215\n3170#3,11:216\n1310#3,2:227\n3170#3,11:229\n3170#3,11:240\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n193#1:251,6\n197#1:257,6\n198#1:263,6\n199#1:269,6\n200#1:275,6\n203#1:281,6\n73#1:216,11\n81#1:227,2\n151#1:229,11\n156#1:240,11\n*E\n"})
public final class exc {
    private static final Object companionOrNull(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @gib
    public static final <T> lp8<T> compiledSerializerImpl(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        return constructSerializerForGivenTypeArgs(oo8Var, (lp8<Object>[]) new lp8[0]);
    }

    @gib
    public static final <T> lp8<T> constructSerializerForGivenTypeArgs(@yfb oo8<T> oo8Var, @yfb lp8<Object>... lp8VarArr) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        md8.checkNotNullParameter(lp8VarArr, C2473f.f17565y);
        return constructSerializerForGivenTypeArgs(hn8.getJavaClass((oo8) oo8Var), (lp8<Object>[]) Arrays.copyOf(lp8VarArr, lp8VarArr.length));
    }

    private static final <T> lp8<T> createEnumSerializer(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        md8.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        md8.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new f45(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> lp8<T> findInNamedCompanion(Class<T> cls, lp8<Object>... lp8VarArr) {
        Field field;
        lp8<T> lp8VarInvokeSerializerOnCompanion;
        Object objFindNamedCompanionByAnnotation = findNamedCompanionByAnnotation(cls);
        if (objFindNamedCompanionByAnnotation != null && (lp8VarInvokeSerializerOnCompanion = invokeSerializerOnCompanion(objFindNamedCompanionByAnnotation, (lp8[]) Arrays.copyOf(lp8VarArr, lp8VarArr.length))) != null) {
            return lp8VarInvokeSerializerOnCompanion;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            md8.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = declaredClasses[i];
                    if (md8.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                } else if (!z) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof lp8) {
                return (lp8) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final <T> Object findNamedCompanionByAnnotation(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        md8.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (cls2.getAnnotation(x8b.class) != null) {
                break;
            }
            i++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        md8.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return companionOrNull(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> p000.lp8<T> findObjectSerializer(java.lang.Class<T> r11) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = p000.h9g.startsWith$default(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = p000.h9g.startsWith$default(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            p000.md8.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = p000.md8.areEqual(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = p000.md8.areEqual(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r5 = r7
            r6 = r8
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            p000.md8.checkNotNullExpressionValue(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = p000.md8.areEqual(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            p000.md8.checkNotNullExpressionValue(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<lp8> r9 = p000.lp8.class
            boolean r8 = p000.md8.areEqual(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = r7
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof p000.lp8
            if (r0 == 0) goto Lae
            r1 = r11
            lp8 r1 = (p000.lp8) r1
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.exc.findObjectSerializer(java.lang.Class):lp8");
    }

    public static final <T> T getChecked(@yfb T[] tArr, int i) {
        md8.checkNotNullParameter(tArr, "<this>");
        return tArr[i];
    }

    @yfb
    public static final Map<oo8<?>, lp8<?>> initBuiltins() {
        Map mapCreateMapBuilder = wt9.createMapBuilder();
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(String.class), hg1.serializer(l7g.f56714a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Character.TYPE), hg1.serializer(rv1.f79707a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(char[].class), hg1.CharArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Double.TYPE), hg1.serializer(ak4.f1791a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(double[].class), hg1.DoubleArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Float.TYPE), hg1.serializer(d46.f28382a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(float[].class), hg1.FloatArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Long.TYPE), hg1.serializer(wk9.f94509a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(long[].class), hg1.LongArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(oph.class), hg1.serializer(oph.f68284b));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Integer.TYPE), hg1.serializer(f68.f35480a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(int[].class), hg1.IntArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(woh.class), hg1.serializer(woh.f94997b));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Short.TYPE), hg1.serializer(taf.f84093a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(short[].class), hg1.ShortArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(iqh.class), hg1.serializer(iqh.f48005b));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Byte.TYPE), hg1.serializer(kj1.f54244a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(byte[].class), hg1.ByteArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(goh.class), hg1.serializer(goh.f40684b));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Boolean.TYPE), hg1.serializer(va1.f90438a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(boolean[].class), hg1.BooleanArraySerializer());
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(bth.class), hg1.serializer(bth.f14751a));
        mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(Void.class), hg1.NothingSerializer());
        try {
            mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(bt4.class), hg1.serializer(bt4.f14711b));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(pph.class), hg1.ULongArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(fph.class), hg1.UIntArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(jqh.class), hg1.UShortArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(hoh.class), hg1.UByteArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapCreateMapBuilder.put(vvd.getOrCreateKotlinClass(m1i.class), hg1.serializer(m1i.f59664c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return wt9.build(mapCreateMapBuilder);
    }

    private static final <T> lp8<T> invokeSerializerOnCompanion(Object obj, lp8<Object>... lp8VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (lp8VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = lp8VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = lp8.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(lp8VarArr, lp8VarArr.length));
            if (objInvoke instanceof lp8) {
                return (lp8) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> lp8<T> invokeSerializerOnDefaultCompanion(Class<?> cls, lp8<Object>... lp8VarArr) {
        Object objCompanionOrNull = companionOrNull(cls, "Companion");
        if (objCompanionOrNull == null) {
            return null;
        }
        return invokeSerializerOnCompanion(objCompanionOrNull, (lp8[]) Arrays.copyOf(lp8VarArr, lp8VarArr.length));
    }

    public static final <T> boolean isInterface(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        return hn8.getJavaClass((oo8) oo8Var).isInterface();
    }

    private static final <T> boolean isNotAnnotated(Class<T> cls) {
        return cls.getAnnotation(x0f.class) == null && cls.getAnnotation(v3d.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> cls) {
        if (cls.getAnnotation(v3d.class) != null) {
            return true;
        }
        x0f x0fVar = (x0f) cls.getAnnotation(x0f.class);
        return x0fVar != null && md8.areEqual(vvd.getOrCreateKotlinClass(x0fVar.with()), vvd.getOrCreateKotlinClass(d4d.class));
    }

    public static final boolean isReferenceArray(@yfb oo8<Object> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "rootClass");
        return hn8.getJavaClass((oo8) oo8Var).isArray();
    }

    private static final void loadSafe(ny6<bth> ny6Var) {
        try {
            ny6Var.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }

    @yfb
    public static final Void platformSpecificSerializerNotRegistered(@yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        hyc.serializerNotRegistered(oo8Var);
        throw new us8();
    }

    @yfb
    public static final Void serializerNotRegistered(@yfb Class<?> cls) {
        md8.checkNotNullParameter(cls, "<this>");
        throw new d1f(hyc.notRegisteredMessage((oo8<?>) hn8.getKotlinClass(cls)));
    }

    @yfb
    public static final <T, E extends T> E[] toNativeArrayImpl(@yfb ArrayList<E> arrayList, @yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(arrayList, "<this>");
        md8.checkNotNullParameter(oo8Var, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) hn8.getJavaClass((oo8) oo8Var), arrayList.size());
        md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        md8.checkNotNullExpressionValue(eArr, "toArray(...)");
        return eArr;
    }

    @gib
    public static final <T> lp8<T> constructSerializerForGivenTypeArgs(@yfb Class<T> cls, @yfb lp8<Object>... lp8VarArr) {
        md8.checkNotNullParameter(cls, "<this>");
        md8.checkNotNullParameter(lp8VarArr, C2473f.f17565y);
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        lp8<T> lp8VarInvokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion(cls, (lp8[]) Arrays.copyOf(lp8VarArr, lp8VarArr.length));
        if (lp8VarInvokeSerializerOnDefaultCompanion != null) {
            return lp8VarInvokeSerializerOnDefaultCompanion;
        }
        lp8<T> lp8VarFindObjectSerializer = findObjectSerializer(cls);
        if (lp8VarFindObjectSerializer != null) {
            return lp8VarFindObjectSerializer;
        }
        lp8<T> lp8VarFindInNamedCompanion = findInNamedCompanion(cls, (lp8[]) Arrays.copyOf(lp8VarArr, lp8VarArr.length));
        if (lp8VarFindInNamedCompanion != null) {
            return lp8VarFindInNamedCompanion;
        }
        if (isPolymorphicSerializer(cls)) {
            return new d4d(hn8.getKotlinClass(cls));
        }
        return null;
    }

    public static final boolean getChecked(@yfb boolean[] zArr, int i) {
        md8.checkNotNullParameter(zArr, "<this>");
        return zArr[i];
    }
}
