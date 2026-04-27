package p000;

import java.util.List;
import java.util.Map;
import p000.vy2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,245:1\n216#2,2:246\n216#2:248\n216#2:249\n217#2:251\n217#2:252\n216#2,2:253\n216#2,2:255\n78#3:250\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n186#1:246,2\n196#1:248\n197#1:249\n197#1:251\n196#1:252\n206#1:253,2\n210#1:255,2\n201#1:250\n*E\n"})
public final class v0f extends n2f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<oo8<?>, vy2> f89626a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final Map<oo8<?>, Map<oo8<?>, lp8<?>>> f89627b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Map<oo8<?>, qy6<?, e1f<?>>> f89628c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Map<oo8<?>, Map<String, lp8<?>>> f89629d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Map<oo8<?>, qy6<String, t74<?>>> f89630e;

    /* JADX INFO: renamed from: f */
    public final boolean f89631f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0f(@yfb Map<oo8<?>, ? extends vy2> map, @yfb Map<oo8<?>, ? extends Map<oo8<?>, ? extends lp8<?>>> map2, @yfb Map<oo8<?>, ? extends qy6<?, ? extends e1f<?>>> map3, @yfb Map<oo8<?>, ? extends Map<String, ? extends lp8<?>>> map4, @yfb Map<oo8<?>, ? extends qy6<? super String, ? extends t74<?>>> map5, boolean z) {
        super(null);
        md8.checkNotNullParameter(map, "class2ContextualFactory");
        md8.checkNotNullParameter(map2, "polyBase2Serializers");
        md8.checkNotNullParameter(map3, "polyBase2DefaultSerializerProvider");
        md8.checkNotNullParameter(map4, "polyBase2NamedSerializers");
        md8.checkNotNullParameter(map5, "polyBase2DefaultDeserializerProvider");
        this.f89626a = map;
        this.f89627b = map2;
        this.f89628c = map3;
        this.f89629d = map4;
        this.f89630e = map5;
        this.f89631f = z;
    }

    @Override // p000.n2f
    public void dumpTo(@yfb r2f r2fVar) {
        md8.checkNotNullParameter(r2fVar, "collector");
        for (Map.Entry<oo8<?>, vy2> entry : this.f89626a.entrySet()) {
            oo8<?> key = entry.getKey();
            vy2 value = entry.getValue();
            if (value instanceof vy2.C14295a) {
                md8.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                lp8<?> serializer = ((vy2.C14295a) value).getSerializer();
                md8.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                r2fVar.contextual(key, serializer);
            } else {
                if (!(value instanceof vy2.C14296b)) {
                    throw new ceb();
                }
                r2fVar.contextual(key, ((vy2.C14296b) value).getProvider());
            }
        }
        for (Map.Entry<oo8<?>, Map<oo8<?>, lp8<?>>> entry2 : this.f89627b.entrySet()) {
            oo8<?> key2 = entry2.getKey();
            for (Map.Entry<oo8<?>, lp8<?>> entry3 : entry2.getValue().entrySet()) {
                oo8<?> key3 = entry3.getKey();
                lp8<?> value2 = entry3.getValue();
                md8.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                md8.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                md8.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                r2fVar.polymorphic(key2, key3, value2);
            }
        }
        for (Map.Entry<oo8<?>, qy6<?, e1f<?>>> entry4 : this.f89628c.entrySet()) {
            oo8<?> key4 = entry4.getKey();
            qy6<?, e1f<?>> value3 = entry4.getValue();
            md8.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            md8.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            r2fVar.polymorphicDefaultSerializer(key4, (qy6) qlh.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<oo8<?>, qy6<String, t74<?>>> entry5 : this.f89630e.entrySet()) {
            oo8<?> key5 = entry5.getKey();
            qy6<String, t74<?>> value4 = entry5.getValue();
            md8.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            md8.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            r2fVar.polymorphicDefaultDeserializer(key5, (qy6) qlh.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }

    @Override // p000.n2f
    @gib
    public <T> lp8<T> getContextual(@yfb oo8<T> oo8Var, @yfb List<? extends lp8<?>> list) {
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(list, "typeArgumentsSerializers");
        vy2 vy2Var = this.f89626a.get(oo8Var);
        lp8<?> lp8VarInvoke = vy2Var != null ? vy2Var.invoke(list) : null;
        if (lp8VarInvoke != null) {
            return (lp8<T>) lp8VarInvoke;
        }
        return null;
    }

    @Override // p000.n2f
    public boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core() {
        return this.f89631f;
    }

    @Override // p000.n2f
    @gib
    public <T> e1f<T> getPolymorphic(@yfb oo8<? super T> oo8Var, @yfb T t) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(t, "value");
        if (!oo8Var.isInstance(t)) {
            return null;
        }
        Map<oo8<?>, lp8<?>> map = this.f89627b.get(oo8Var);
        lp8<?> lp8Var = map != null ? map.get(vvd.getOrCreateKotlinClass(t.getClass())) : null;
        if (lp8Var == null) {
            lp8Var = null;
        }
        if (lp8Var != null) {
            return lp8Var;
        }
        qy6<?, e1f<?>> qy6Var = this.f89628c.get(oo8Var);
        qy6<?, e1f<?>> qy6Var2 = qlh.isFunctionOfArity(qy6Var, 1) ? qy6Var : null;
        if (qy6Var2 != null) {
            return (e1f) qy6Var2.invoke(t);
        }
        return null;
    }

    @Override // p000.n2f
    @gib
    public <T> t74<T> getPolymorphic(@yfb oo8<? super T> oo8Var, @gib String str) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        Map<String, lp8<?>> map = this.f89629d.get(oo8Var);
        lp8<?> lp8Var = map != null ? map.get(str) : null;
        if (lp8Var == null) {
            lp8Var = null;
        }
        if (lp8Var != null) {
            return lp8Var;
        }
        qy6<String, t74<?>> qy6Var = this.f89630e.get(oo8Var);
        qy6<String, t74<?>> qy6Var2 = qlh.isFunctionOfArity(qy6Var, 1) ? qy6Var : null;
        if (qy6Var2 != null) {
            return (t74) qy6Var2.invoke(str);
        }
        return null;
    }
}
