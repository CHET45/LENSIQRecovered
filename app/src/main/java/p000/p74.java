package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n381#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
public final class p74 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<f0f, Map<C10811a<Object>, Object>> f69868a = y53.createMapForCache(16);

    /* JADX INFO: renamed from: p74$a */
    public static final class C10811a<T> {
    }

    @gib
    public final <T> T get(@yfb f0f f0fVar, @yfb C10811a<T> c10811a) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(c10811a, "key");
        Map<C10811a<Object>, Object> map = this.f69868a.get(f0fVar);
        Object obj = map != null ? map.get(c10811a) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    @yfb
    public final <T> T getOrPut(@yfb f0f f0fVar, @yfb C10811a<T> c10811a, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(c10811a, "key");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        T t = (T) get(f0fVar, c10811a);
        if (t != null) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        set(f0fVar, c10811a, tInvoke);
        return tInvoke;
    }

    public final <T> void set(@yfb f0f f0fVar, @yfb C10811a<T> c10811a, @yfb T t) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(c10811a, "key");
        md8.checkNotNullParameter(t, "value");
        Map<f0f, Map<C10811a<Object>, Object>> map = this.f69868a;
        Map<C10811a<Object>, Object> mapCreateMapForCache = map.get(f0fVar);
        if (mapCreateMapForCache == null) {
            mapCreateMapForCache = y53.createMapForCache(2);
            map.put(f0fVar, mapCreateMapForCache);
        }
        mapCreateMapForCache.put(c10811a, t);
    }
}
