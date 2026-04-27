package p000;

import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i2f {
    @yfb
    @yjd
    public static final lp8<?> moduleThenPolymorphic(@yfb n2f n2fVar, @yfb oo8<?> oo8Var) {
        return m2f.moduleThenPolymorphic(n2fVar, oo8Var);
    }

    @yfb
    @yjd
    public static final lp8<?> noCompiledSerializer(@yfb n2f n2fVar, @yfb oo8<?> oo8Var) {
        return m2f.noCompiledSerializer(n2fVar, oo8Var);
    }

    @gib
    public static final lp8<? extends Object> parametrizedSerializerOrNull(@yfb oo8<Object> oo8Var, @yfb List<? extends lp8<Object>> list, @yfb ny6<? extends ro8> ny6Var) {
        return m2f.parametrizedSerializerOrNull(oo8Var, list, ny6Var);
    }

    public static final /* synthetic */ <T> lp8<T> serializer() {
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return (lp8<T>) serializer((mp8) null);
    }

    @gib
    @nb8
    public static final <T> lp8<T> serializerOrNull(@yfb oo8<T> oo8Var) {
        return m2f.serializerOrNull(oo8Var);
    }

    @gib
    public static final List<lp8<Object>> serializersForParameters(@yfb n2f n2fVar, @yfb List<? extends mp8> list, boolean z) {
        return m2f.serializersForParameters(n2fVar, list, z);
    }

    @yfb
    @yjd
    public static final lp8<?> moduleThenPolymorphic(@yfb n2f n2fVar, @yfb oo8<?> oo8Var, @yfb lp8<?>[] lp8VarArr) {
        return m2f.moduleThenPolymorphic(n2fVar, oo8Var, lp8VarArr);
    }

    @yfb
    @yjd
    public static final lp8<?> noCompiledSerializer(@yfb n2f n2fVar, @yfb oo8<?> oo8Var, @yfb lp8<?>[] lp8VarArr) {
        return m2f.noCompiledSerializer(n2fVar, oo8Var, lp8VarArr);
    }

    @nb8
    @yfb
    public static final <T> lp8<T> serializer(@yfb oo8<T> oo8Var) {
        return m2f.serializer(oo8Var);
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb mp8 mp8Var) {
        return m2f.serializerOrNull(mp8Var);
    }

    @yfb
    @yjd
    public static final lp8<?> noCompiledSerializer(@yfb String str) {
        return m2f.noCompiledSerializer(str);
    }

    @ph5
    @yfb
    public static final lp8<Object> serializer(@yfb oo8<?> oo8Var, @yfb List<? extends lp8<?>> list, boolean z) {
        return m2f.serializer(oo8Var, list, z);
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb n2f n2fVar, @yfb mp8 mp8Var) {
        return m2f.serializerOrNull(n2fVar, mp8Var);
    }

    @yfb
    public static final lp8<Object> serializer(@yfb mp8 mp8Var) {
        return m2f.serializer(mp8Var);
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb n2f n2fVar, @yfb Type type) {
        return j2f.serializerOrNull(n2fVar, type);
    }

    public static final /* synthetic */ <T> lp8<T> serializer(n2f n2fVar) {
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (lp8<T>) serializer(n2fVar, (mp8) null);
    }

    @gib
    public static final lp8<Object> serializerOrNull(@yfb Type type) {
        return j2f.serializerOrNull(type);
    }

    @ph5
    @yfb
    public static final lp8<Object> serializer(@yfb n2f n2fVar, @yfb oo8<?> oo8Var, @yfb List<? extends lp8<?>> list, boolean z) {
        return m2f.serializer(n2fVar, oo8Var, list, z);
    }

    @yfb
    public static final lp8<Object> serializer(@yfb n2f n2fVar, @yfb mp8 mp8Var) {
        return m2f.serializer(n2fVar, mp8Var);
    }

    @yfb
    public static final lp8<Object> serializer(@yfb n2f n2fVar, @yfb Type type) {
        return j2f.serializer(n2fVar, type);
    }

    @yfb
    public static final lp8<Object> serializer(@yfb Type type) {
        return j2f.serializer(type);
    }
}
