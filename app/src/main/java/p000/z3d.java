package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z3d {
    public static final /* synthetic */ <Base, T extends Base> void subclass(y3d<? super Base> y3dVar, lp8<T> lp8Var) {
        md8.checkNotNullParameter(y3dVar, "<this>");
        md8.checkNotNullParameter(lp8Var, "serializer");
        md8.reifiedOperationMarker(4, "T");
        y3dVar.subclass(vvd.getOrCreateKotlinClass(Object.class), lp8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Base, T extends Base> void subclass(y3d<? super Base> y3dVar, oo8<T> oo8Var) {
        md8.checkNotNullParameter(y3dVar, "<this>");
        md8.checkNotNullParameter(oo8Var, "clazz");
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        y3dVar.subclass(oo8Var, i2f.serializer((mp8) null));
    }
}
