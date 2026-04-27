package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,272:1\n31#1,3:273\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n15#1:273,3\n*E\n"})
public final class p2f {

    /* JADX INFO: renamed from: p2f$a */
    public static final class C10773a implements qy6<y3d<Object>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C10773a f69510a = new C10773a();

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(y3d<Object> y3dVar) {
            md8.checkNotNullParameter(y3dVar, "<this>");
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(y3d<Object> y3dVar) {
            invoke2(y3dVar);
            return bth.f14751a;
        }
    }

    @yfb
    public static final n2f EmptySerializersModule() {
        return s2f.getEmptySerializersModule();
    }

    @yfb
    public static final n2f SerializersModule(@yfb qy6<? super o2f, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        o2f o2fVar = new o2f();
        qy6Var.invoke(o2fVar);
        return o2fVar.build();
    }

    public static final /* synthetic */ <T> void contextual(o2f o2fVar, lp8<T> lp8Var) {
        md8.checkNotNullParameter(o2fVar, "<this>");
        md8.checkNotNullParameter(lp8Var, "serializer");
        md8.reifiedOperationMarker(4, "T");
        o2fVar.contextual(vvd.getOrCreateKotlinClass(Object.class), lp8Var);
    }

    public static final <Base> void polymorphic(@yfb o2f o2fVar, @yfb oo8<Base> oo8Var, @gib lp8<Base> lp8Var, @yfb qy6<? super y3d<? super Base>, bth> qy6Var) {
        md8.checkNotNullParameter(o2fVar, "<this>");
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        y3d y3dVar = new y3d(oo8Var, lp8Var);
        qy6Var.invoke(y3dVar);
        y3dVar.buildTo(o2fVar);
    }

    public static /* synthetic */ void polymorphic$default(o2f o2fVar, oo8 oo8Var, lp8 lp8Var, qy6 qy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            lp8Var = null;
        }
        if ((i & 4) != 0) {
            qy6Var = C10773a.f69510a;
        }
        md8.checkNotNullParameter(o2fVar, "<this>");
        md8.checkNotNullParameter(oo8Var, "baseClass");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        y3d y3dVar = new y3d(oo8Var, lp8Var);
        qy6Var.invoke(y3dVar);
        y3dVar.buildTo(o2fVar);
    }

    public static final /* synthetic */ <T> n2f serializersModuleOf(lp8<T> lp8Var) {
        md8.checkNotNullParameter(lp8Var, "serializer");
        md8.reifiedOperationMarker(4, "T");
        return serializersModuleOf(vvd.getOrCreateKotlinClass(Object.class), lp8Var);
    }

    @yfb
    public static final <T> n2f serializersModuleOf(@yfb oo8<T> oo8Var, @yfb lp8<T> lp8Var) {
        md8.checkNotNullParameter(oo8Var, "kClass");
        md8.checkNotNullParameter(lp8Var, "serializer");
        o2f o2fVar = new o2f();
        o2fVar.contextual(oo8Var, lp8Var);
        return o2fVar.build();
    }
}
