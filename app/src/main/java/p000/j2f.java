package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerializersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n11165#2:202\n11500#2,3:203\n1557#3:206\n1628#3,3:207\n37#4,2:210\n1#5:212\n*S KotlinDebug\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n*L\n113#1:202\n113#1:203,3\n140#1:206\n140#1:207,3\n169#1:210,2\n*E\n"})
public final /* synthetic */ class j2f {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ lp8 m13703a(n2f n2fVar, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(n2fVar, type, z);
    }

    private static final lp8<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(n2f n2fVar, GenericArrayType genericArrayType, boolean z) {
        lp8<Object> lp8VarSerializerOrNull;
        oo8 kotlinClass;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            md8.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) e80.first(upperBounds);
        }
        md8.checkNotNull(genericComponentType);
        if (z) {
            lp8VarSerializerOrNull = i2f.serializer(n2fVar, genericComponentType);
        } else {
            lp8VarSerializerOrNull = i2f.serializerOrNull(n2fVar, genericComponentType);
            if (lp8VarSerializerOrNull == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            md8.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kotlinClass = hn8.getKotlinClass((Class) rawType);
        } else {
            if (!(genericComponentType instanceof oo8)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + vvd.getOrCreateKotlinClass(genericComponentType.getClass()));
            }
            kotlinClass = (oo8) genericComponentType;
        }
        md8.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        lp8<Object> lp8VarArraySerializer = hg1.ArraySerializer(kotlinClass, lp8VarSerializerOrNull);
        md8.checkNotNull(lp8VarArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return lp8VarArraySerializer;
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            md8.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            md8.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objFirst = e80.first(upperBounds);
            md8.checkNotNullExpressionValue(objFirst, "first(...)");
            return prettyClass$SerializersKt__SerializersJvmKt((Type) objFirst);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            md8.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + vvd.getOrCreateKotlinClass(type.getClass()));
    }

    private static final <T> lp8<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(n2f n2fVar, Class<T> cls, List<? extends lp8<Object>> list) {
        lp8[] lp8VarArr = (lp8[]) list.toArray(new lp8[0]);
        lp8<T> lp8VarConstructSerializerForGivenTypeArgs = exc.constructSerializerForGivenTypeArgs(cls, (lp8<Object>[]) Arrays.copyOf(lp8VarArr, lp8VarArr.length));
        if (lp8VarConstructSerializerForGivenTypeArgs != null) {
            return lp8VarConstructSerializerForGivenTypeArgs;
        }
        oo8<T> kotlinClass = hn8.getKotlinClass(cls);
        lp8<T> lp8VarBuiltinSerializerOrNull = ubd.builtinSerializerOrNull(kotlinClass);
        if (lp8VarBuiltinSerializerOrNull != null) {
            return lp8VarBuiltinSerializerOrNull;
        }
        lp8<T> contextual = n2fVar.getContextual(kotlinClass, list);
        if (contextual != null) {
            return contextual;
        }
        if (cls.isInterface()) {
            return new d4d(hn8.getKotlinClass(cls));
        }
        return null;
    }

    @yfb
    public static final lp8<Object> serializer(@yfb Type type) {
        md8.checkNotNullParameter(type, "type");
        return i2f.serializer(p2f.EmptySerializersModule(), type);
    }

    private static final lp8<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(n2f n2fVar, Type type, boolean z) {
        ArrayList<lp8> arrayList;
        if (type instanceof GenericArrayType) {
            return genericArraySerializer$SerializersKt__SerializersJvmKt(n2fVar, (GenericArrayType) type, z);
        }
        if (type instanceof Class) {
            return typeSerializer$SerializersKt__SerializersJvmKt(n2fVar, (Class) type, z);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                md8.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                Object objFirst = e80.first(upperBounds);
                md8.checkNotNullExpressionValue(objFirst, "first(...)");
                return m13703a(n2fVar, (Type) objFirst, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + vvd.getOrCreateKotlinClass(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        md8.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        md8.checkNotNull(actualTypeArguments);
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                md8.checkNotNull(type2);
                arrayList.add(i2f.serializer(n2fVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                md8.checkNotNull(type3);
                lp8<Object> lp8VarSerializerOrNull = i2f.serializerOrNull(n2fVar, type3);
                if (lp8VarSerializerOrNull == null) {
                    return null;
                }
                arrayList.add(lp8VarSerializerOrNull);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            lp8<Object> lp8VarSetSerializer = hg1.SetSerializer((lp8) arrayList.get(0));
            md8.checkNotNull(lp8VarSetSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return lp8VarSetSerializer;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            lp8<Object> lp8VarListSerializer = hg1.ListSerializer((lp8) arrayList.get(0));
            md8.checkNotNull(lp8VarListSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return lp8VarListSerializer;
        }
        if (Map.class.isAssignableFrom(cls)) {
            lp8<Object> lp8VarMapSerializer = hg1.MapSerializer((lp8) arrayList.get(0), (lp8) arrayList.get(1));
            md8.checkNotNull(lp8VarMapSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return lp8VarMapSerializer;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            lp8<Object> lp8VarMapEntrySerializer = hg1.MapEntrySerializer((lp8) arrayList.get(0), (lp8) arrayList.get(1));
            md8.checkNotNull(lp8VarMapEntrySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return lp8VarMapEntrySerializer;
        }
        if (scc.class.isAssignableFrom(cls)) {
            lp8<Object> lp8VarPairSerializer = hg1.PairSerializer((lp8) arrayList.get(0), (lp8) arrayList.get(1));
            md8.checkNotNull(lp8VarPairSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return lp8VarPairSerializer;
        }
        if (djh.class.isAssignableFrom(cls)) {
            lp8<Object> lp8VarTripleSerializer = hg1.TripleSerializer((lp8) arrayList.get(0), (lp8) arrayList.get(1), (lp8) arrayList.get(2));
            md8.checkNotNull(lp8VarTripleSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return lp8VarTripleSerializer;
        }
        ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(arrayList, 10));
        for (lp8 lp8Var : arrayList) {
            md8.checkNotNull(lp8Var, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(lp8Var);
        }
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt(n2fVar, cls, arrayList2);
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb Type type) {
        md8.checkNotNullParameter(type, "type");
        return i2f.serializerOrNull(p2f.EmptySerializersModule(), type);
    }

    private static final lp8<Object> typeSerializer$SerializersKt__SerializersJvmKt(n2f n2fVar, Class<?> cls, boolean z) {
        lp8<Object> lp8VarSerializerOrNull;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return reflectiveOrContextual$SerializersKt__SerializersJvmKt(n2fVar, cls, l82.emptyList());
        }
        Class<?> componentType = cls.getComponentType();
        md8.checkNotNullExpressionValue(componentType, "getComponentType(...)");
        if (z) {
            lp8VarSerializerOrNull = i2f.serializer(n2fVar, componentType);
        } else {
            lp8VarSerializerOrNull = i2f.serializerOrNull(n2fVar, componentType);
            if (lp8VarSerializerOrNull == null) {
                return null;
            }
        }
        oo8 kotlinClass = hn8.getKotlinClass(componentType);
        md8.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        lp8<Object> lp8VarArraySerializer = hg1.ArraySerializer(kotlinClass, lp8VarSerializerOrNull);
        md8.checkNotNull(lp8VarArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return lp8VarArraySerializer;
    }

    @yfb
    public static final lp8<Object> serializer(@yfb n2f n2fVar, @yfb Type type) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(type, "type");
        lp8<Object> lp8VarSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(n2fVar, type, true);
        if (lp8VarSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return lp8VarSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        exc.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        throw new us8();
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb n2f n2fVar, @yfb Type type) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(type, "type");
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(n2fVar, type, false);
    }
}
