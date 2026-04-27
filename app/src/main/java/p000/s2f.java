package p000;

import java.util.List;
import p000.r2f;
import p000.vy2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,245:1\n31#2,3:246\n31#2,3:249\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n*L\n97#1:246,3\n109#1:249,3\n*E\n"})
public final class s2f {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final n2f f80449a = new v0f(xt9.emptyMap(), xt9.emptyMap(), xt9.emptyMap(), xt9.emptyMap(), xt9.emptyMap(), false);

    /* JADX INFO: renamed from: s2f$a */
    public static final class C12413a implements r2f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ o2f f80450a;

        public C12413a(o2f o2fVar) {
            this.f80450a = o2fVar;
        }

        @Override // p000.r2f
        public <T> void contextual(oo8<T> oo8Var, lp8<T> lp8Var) {
            md8.checkNotNullParameter(oo8Var, "kClass");
            md8.checkNotNullParameter(lp8Var, "serializer");
            this.f80450a.registerSerializer(oo8Var, new vy2.C14295a(lp8Var), true);
        }

        @Override // p000.r2f
        public <Base, Sub extends Base> void polymorphic(oo8<Base> oo8Var, oo8<Sub> oo8Var2, lp8<Sub> lp8Var) {
            md8.checkNotNullParameter(oo8Var, "baseClass");
            md8.checkNotNullParameter(oo8Var2, "actualClass");
            md8.checkNotNullParameter(lp8Var, "actualSerializer");
            this.f80450a.registerPolymorphicSerializer(oo8Var, oo8Var2, lp8Var, true);
        }

        @Override // p000.r2f
        @q64(level = u64.f86865a, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @i2e(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        public <Base> void polymorphicDefault(oo8<Base> oo8Var, qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
            r2f.C11853a.polymorphicDefault(this, oo8Var, qy6Var);
        }

        @Override // p000.r2f
        public <Base> void polymorphicDefaultDeserializer(oo8<Base> oo8Var, qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
            md8.checkNotNullParameter(oo8Var, "baseClass");
            md8.checkNotNullParameter(qy6Var, "defaultDeserializerProvider");
            this.f80450a.registerDefaultPolymorphicDeserializer(oo8Var, qy6Var, true);
        }

        @Override // p000.r2f
        public <Base> void polymorphicDefaultSerializer(oo8<Base> oo8Var, qy6<? super Base, ? extends e1f<? super Base>> qy6Var) {
            md8.checkNotNullParameter(oo8Var, "baseClass");
            md8.checkNotNullParameter(qy6Var, "defaultSerializerProvider");
            this.f80450a.registerDefaultPolymorphicSerializer(oo8Var, qy6Var, true);
        }

        @Override // p000.r2f
        public <T> void contextual(oo8<T> oo8Var, qy6<? super List<? extends lp8<?>>, ? extends lp8<?>> qy6Var) {
            md8.checkNotNullParameter(oo8Var, "kClass");
            md8.checkNotNullParameter(qy6Var, "provider");
            this.f80450a.registerSerializer(oo8Var, new vy2.C14296b(qy6Var), true);
        }
    }

    @yfb
    public static final n2f getEmptySerializersModule() {
        return f80449a;
    }

    @q64(level = u64.f86865a, message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @i2e(expression = "EmptySerializersModule()", imports = {}))
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }

    @yfb
    public static final n2f overwriteWith(@yfb n2f n2fVar, @yfb n2f n2fVar2) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(n2fVar2, "other");
        o2f o2fVar = new o2f();
        o2fVar.include(n2fVar);
        n2fVar2.dumpTo(new C12413a(o2fVar));
        return o2fVar.build();
    }

    @yfb
    public static final n2f plus(@yfb n2f n2fVar, @yfb n2f n2fVar2) {
        md8.checkNotNullParameter(n2fVar, "<this>");
        md8.checkNotNullParameter(n2fVar2, "other");
        o2f o2fVar = new o2f();
        o2fVar.include(n2fVar);
        o2fVar.include(n2fVar2);
        return o2fVar.build();
    }
}
