package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,79:1\n78#1:81\n78#1:82\n78#2:80\n78#2:83\n78#2:84\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n*L\n22#1:81\n28#1:82\n54#1:80\n28#1:83\n45#1:84\n*E\n"})
public final class h2f {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final y1f<? extends Object> f42134a = bn1.createCache(new qy6() { // from class: b2f
        @Override // p000.qy6
        public final Object invoke(Object obj) {
            return h2f.SERIALIZERS_CACHE$lambda$0((oo8) obj);
        }
    });

    /* JADX INFO: renamed from: b */
    @yfb
    public static final y1f<Object> f42135b = bn1.createCache(new qy6() { // from class: c2f
        @Override // p000.qy6
        public final Object invoke(Object obj) {
            return h2f.SERIALIZERS_CACHE_NULLABLE$lambda$1((oo8) obj);
        }
    });

    /* JADX INFO: renamed from: c */
    @yfb
    public static final ngc<? extends Object> f42136c = bn1.createParametrizedCache(new gz6() { // from class: d2f
        @Override // p000.gz6
        public final Object invoke(Object obj, Object obj2) {
            return h2f.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3((oo8) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: d */
    @yfb
    public static final ngc<Object> f42137d = bn1.createParametrizedCache(new gz6() { // from class: e2f
        @Override // p000.gz6
        public final Object invoke(Object obj, Object obj2) {
            return h2f.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5((oo8) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final lp8 PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(oo8 oo8Var, final List list) {
        md8.checkNotNullParameter(oo8Var, "clazz");
        md8.checkNotNullParameter(list, "types");
        List<lp8<Object>> listSerializersForParameters = i2f.serializersForParameters(p2f.EmptySerializersModule(), list, true);
        md8.checkNotNull(listSerializersForParameters);
        return i2f.parametrizedSerializerOrNull(oo8Var, listSerializersForParameters, new ny6() { // from class: f2f
            @Override // p000.ny6
            public final Object invoke() {
                return h2f.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro8 PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List list) {
        return ((mp8) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lp8 PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(oo8 oo8Var, final List list) {
        lp8 nullable;
        md8.checkNotNullParameter(oo8Var, "clazz");
        md8.checkNotNullParameter(list, "types");
        List<lp8<Object>> listSerializersForParameters = i2f.serializersForParameters(p2f.EmptySerializersModule(), list, true);
        md8.checkNotNull(listSerializersForParameters);
        lp8<? extends Object> lp8VarParametrizedSerializerOrNull = i2f.parametrizedSerializerOrNull(oo8Var, listSerializersForParameters, new ny6() { // from class: g2f
            @Override // p000.ny6
            public final Object invoke() {
                return h2f.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(list);
            }
        });
        if (lp8VarParametrizedSerializerOrNull == null || (nullable = hg1.getNullable(lp8VarParametrizedSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro8 PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List list) {
        return ((mp8) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lp8 SERIALIZERS_CACHE$lambda$0(oo8 oo8Var) {
        md8.checkNotNullParameter(oo8Var, "it");
        lp8 lp8VarSerializerOrNull = i2f.serializerOrNull(oo8Var);
        if (lp8VarSerializerOrNull != null) {
            return lp8VarSerializerOrNull;
        }
        if (exc.isInterface(oo8Var)) {
            return new d4d(oo8Var);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lp8 SERIALIZERS_CACHE_NULLABLE$lambda$1(oo8 oo8Var) {
        lp8 nullable;
        md8.checkNotNullParameter(oo8Var, "it");
        lp8 lp8VarSerializerOrNull = i2f.serializerOrNull(oo8Var);
        if (lp8VarSerializerOrNull == null) {
            lp8VarSerializerOrNull = exc.isInterface(oo8Var) ? new d4d(oo8Var) : null;
        }
        if (lp8VarSerializerOrNull == null || (nullable = hg1.getNullable(lp8VarSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    @gib
    public static final lp8<Object> findCachedSerializer(@yfb oo8<Object> oo8Var, boolean z) {
        md8.checkNotNullParameter(oo8Var, "clazz");
        if (z) {
            return f42135b.get(oo8Var);
        }
        lp8<? extends Object> lp8Var = f42134a.get(oo8Var);
        if (lp8Var != null) {
            return lp8Var;
        }
        return null;
    }

    @yfb
    public static final Object findParametrizedCachedSerializer(@yfb oo8<Object> oo8Var, @yfb List<? extends mp8> list, boolean z) {
        md8.checkNotNullParameter(oo8Var, "clazz");
        md8.checkNotNullParameter(list, "types");
        return !z ? f42136c.mo30879getgIAlus(oo8Var, list) : f42137d.mo30879getgIAlus(oo8Var, list);
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    @yfb
    public static final y1f<? extends Object> getSERIALIZERS_CACHE() {
        return f42134a;
    }

    public static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    @gib
    public static final d4d<? extends Object> polymorphicIfInterface(@yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        if (exc.isInterface(oo8Var)) {
            return new d4d<>(oo8Var);
        }
        return null;
    }
}
