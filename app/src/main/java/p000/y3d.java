package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPolymorphicModuleBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,119:1\n1863#2:120\n1864#2:122\n78#3:121\n*S KotlinDebug\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n*L\n88#1:120\n88#1:122\n92#1:121\n*E\n"})
public final class y3d<Base> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final oo8<Base> f100223a;

    /* JADX INFO: renamed from: b */
    @gib
    public final lp8<Base> f100224b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<scc<oo8<? extends Base>, lp8<? extends Base>>> f100225c;

    /* JADX INFO: renamed from: d */
    @gib
    public qy6<? super Base, ? extends e1f<? super Base>> f100226d;

    /* JADX INFO: renamed from: e */
    @gib
    public qy6<? super String, ? extends t74<? extends Base>> f100227e;

    @yjd
    public y3d(@yfb oo8<Base> oo8Var, @gib lp8<Base> lp8Var) {
        md8.checkNotNullParameter(oo8Var, "baseClass");
        this.f100223a = oo8Var;
        this.f100224b = lp8Var;
        this.f100225c = new ArrayList();
    }

    @yjd
    public final void buildTo(@yfb o2f o2fVar) {
        md8.checkNotNullParameter(o2fVar, "builder");
        lp8<Base> lp8Var = this.f100224b;
        if (lp8Var != null) {
            oo8<Base> oo8Var = this.f100223a;
            o2f.registerPolymorphicSerializer$default(o2fVar, oo8Var, oo8Var, lp8Var, false, 8, null);
        }
        Iterator<T> it = this.f100225c.iterator();
        while (it.hasNext()) {
            scc sccVar = (scc) it.next();
            oo8 oo8Var2 = (oo8) sccVar.component1();
            lp8 lp8Var2 = (lp8) sccVar.component2();
            oo8<Base> oo8Var3 = this.f100223a;
            md8.checkNotNull(oo8Var2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            md8.checkNotNull(lp8Var2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            o2f.registerPolymorphicSerializer$default(o2fVar, oo8Var3, oo8Var2, lp8Var2, false, 8, null);
        }
        qy6<? super Base, ? extends e1f<? super Base>> qy6Var = this.f100226d;
        if (qy6Var != null) {
            o2fVar.registerDefaultPolymorphicSerializer(this.f100223a, qy6Var, false);
        }
        qy6<? super String, ? extends t74<? extends Base>> qy6Var2 = this.f100227e;
        if (qy6Var2 != null) {
            o2fVar.registerDefaultPolymorphicDeserializer(this.f100223a, qy6Var2, false);
        }
    }

    @q64(level = u64.f86865a, message = "Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith = @i2e(expression = "defaultDeserializer(defaultSerializerProvider)", imports = {}))
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m33361default(@yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "defaultSerializerProvider");
        defaultDeserializer(qy6Var);
    }

    public final void defaultDeserializer(@yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "defaultDeserializerProvider");
        if (this.f100227e == null) {
            this.f100227e = qy6Var;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.f100223a + ": " + this.f100227e).toString());
    }

    public final <T extends Base> void subclass(@yfb oo8<T> oo8Var, @yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(oo8Var, "subclass");
        md8.checkNotNullParameter(lp8Var, "serializer");
        this.f100225c.add(vkh.m24050to(oo8Var, lp8Var));
    }

    public /* synthetic */ y3d(oo8 oo8Var, lp8 lp8Var, int i, jt3 jt3Var) {
        this(oo8Var, (i & 2) != 0 ? null : lp8Var);
    }
}
