package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.r2f;
import p000.vy2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n381#2,7:273\n381#2,7:280\n1#3:287\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n197#1:273,7\n199#1:280,7\n*E\n"})
public final class o2f implements r2f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<oo8<?>, vy2> f66347a = new HashMap();

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<oo8<?>, Map<oo8<?>, lp8<?>>> f66348b = new HashMap();

    /* JADX INFO: renamed from: c */
    @yfb
    public final Map<oo8<?>, qy6<?, e1f<?>>> f66349c = new HashMap();

    /* JADX INFO: renamed from: d */
    @yfb
    public final Map<oo8<?>, Map<String, lp8<?>>> f66350d = new HashMap();

    /* JADX INFO: renamed from: e */
    @yfb
    public final Map<oo8<?>, qy6<String, t74<?>>> f66351e = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f66352f;

    @yjd
    public o2f() {
    }

    public static /* synthetic */ void registerPolymorphicSerializer$default(o2f o2fVar, oo8 oo8Var, oo8 oo8Var2, lp8 lp8Var, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        o2fVar.registerPolymorphicSerializer(oo8Var, oo8Var2, lp8Var, z);
    }

    public static /* synthetic */ void registerSerializer$default(o2f o2fVar, oo8 oo8Var, vy2 vy2Var, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        o2fVar.registerSerializer(oo8Var, vy2Var, z);
    }

    @yfb
    @yjd
    public final n2f build() {
        return new v0f(this.f66347a, this.f66348b, this.f66349c, this.f66350d, this.f66351e, this.f66352f);
    }

    @Override // p000.r2f
    public <T> void contextual(@yfb oo8<T> oo8Var, @yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(lp8Var, "serializer");
        registerSerializer$default(this, oo8Var, new vy2.C14295a(lp8Var), false, 4, null);
    }

    public final void include(@yfb n2f n2fVar) {
        md8.checkNotNullParameter(n2fVar, "module");
        n2fVar.dumpTo(this);
    }

    @Override // p000.r2f
    public <Base, Sub extends Base> void polymorphic(@yfb oo8<Base> oo8Var, @yfb oo8<Sub> oo8Var2, @yfb lp8<Sub> lp8Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(oo8Var2, "actualClass");
        md8.checkNotNullParameter(lp8Var, "actualSerializer");
        registerPolymorphicSerializer$default(this, oo8Var, oo8Var2, lp8Var, false, 8, null);
    }

    @Override // p000.r2f
    @q64(level = u64.f86865a, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @i2e(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public <Base> void polymorphicDefault(@yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
        r2f.C11853a.polymorphicDefault(this, oo8Var, qy6Var);
    }

    @Override // p000.r2f
    public <Base> void polymorphicDefaultDeserializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "defaultDeserializerProvider");
        registerDefaultPolymorphicDeserializer(oo8Var, qy6Var, false);
    }

    @Override // p000.r2f
    public <Base> void polymorphicDefaultSerializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super Base, ? extends e1f<? super Base>> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "defaultSerializerProvider");
        registerDefaultPolymorphicSerializer(oo8Var, qy6Var, false);
    }

    @xn8(name = "registerDefaultPolymorphicDeserializer")
    public final <Base> void registerDefaultPolymorphicDeserializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var, boolean z) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "defaultDeserializerProvider");
        qy6<String, t74<?>> qy6Var2 = this.f66351e.get(oo8Var);
        if (qy6Var2 == null || md8.areEqual(qy6Var2, qy6Var) || z) {
            this.f66351e.put(oo8Var, qy6Var);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + oo8Var + " is already registered: " + qy6Var2);
    }

    @xn8(name = "registerDefaultPolymorphicSerializer")
    public final <Base> void registerDefaultPolymorphicSerializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super Base, ? extends e1f<? super Base>> qy6Var, boolean z) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "defaultSerializerProvider");
        qy6<?, e1f<?>> qy6Var2 = this.f66349c.get(oo8Var);
        if (qy6Var2 == null || md8.areEqual(qy6Var2, qy6Var) || z) {
            this.f66349c.put(oo8Var, qy6Var);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + oo8Var + " is already registered: " + qy6Var2);
    }

    @xn8(name = "registerPolymorphicSerializer")
    public final <Base, Sub extends Base> void registerPolymorphicSerializer(@yfb oo8<Base> oo8Var, @yfb oo8<Sub> oo8Var2, @yfb lp8<Sub> lp8Var, boolean z) {
        Object next;
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(oo8Var2, "concreteClass");
        md8.checkNotNullParameter(lp8Var, "concreteSerializer");
        String serialName = lp8Var.getDescriptor().getSerialName();
        Map<oo8<?>, Map<oo8<?>, lp8<?>>> map = this.f66348b;
        Map<oo8<?>, lp8<?>> map2 = map.get(oo8Var);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(oo8Var, map2);
        }
        Map<oo8<?>, lp8<?>> map3 = map2;
        lp8<?> lp8Var2 = map3.get(oo8Var2);
        Map<oo8<?>, Map<String, lp8<?>>> map4 = this.f66350d;
        Map<String, lp8<?>> map5 = map4.get(oo8Var);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(oo8Var, map5);
        }
        Map<String, lp8<?>> map6 = map5;
        if (z) {
            if (lp8Var2 != null) {
                map6.remove(lp8Var2.getDescriptor().getSerialName());
            }
            map3.put(oo8Var2, lp8Var);
            map6.put(serialName, lp8Var);
            return;
        }
        if (lp8Var2 != null) {
            if (!md8.areEqual(lp8Var2, lp8Var)) {
                throw new x1f(oo8Var, oo8Var2);
            }
            map6.remove(lp8Var2.getDescriptor().getSerialName());
        }
        lp8<?> lp8Var3 = map6.get(serialName);
        if (lp8Var3 == null) {
            map3.put(oo8Var2, lp8Var);
            map6.put(serialName, lp8Var);
            return;
        }
        Map<oo8<?>, lp8<?>> map7 = this.f66348b.get(oo8Var);
        md8.checkNotNull(map7);
        Iterator it = zt9.asSequence(map7).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == lp8Var3) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + oo8Var + "' have the same serial name '" + serialName + "': '" + oo8Var2 + "' and '" + ((Map.Entry) next) + '\'');
    }

    @xn8(name = "registerSerializer")
    public final <T> void registerSerializer(@yfb oo8<T> oo8Var, @yfb vy2 vy2Var, boolean z) {
        vy2 vy2Var2;
        md8.checkNotNullParameter(oo8Var, "forClass");
        md8.checkNotNullParameter(vy2Var, "provider");
        if (z || (vy2Var2 = this.f66347a.get(oo8Var)) == null || md8.areEqual(vy2Var2, vy2Var)) {
            this.f66347a.put(oo8Var, vy2Var);
            if (exc.isInterface(oo8Var)) {
                this.f66352f = true;
                return;
            }
            return;
        }
        throw new x1f("Contextual serializer or serializer provider for " + oo8Var + " already registered in this module");
    }

    @Override // p000.r2f
    public <T> void contextual(@yfb oo8<T> oo8Var, @yfb qy6<? super List<? extends lp8<?>>, ? extends lp8<?>> qy6Var) {
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(qy6Var, "provider");
        registerSerializer$default(this, oo8Var, new vy2.C14296b(qy6Var), false, 4, null);
    }
}
