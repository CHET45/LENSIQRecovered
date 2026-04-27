package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public final class pl8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f71328a = "    ";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f71329b = "type";

    @yfb
    public static final bk8 Json(@yfb bk8 bk8Var, @yfb qy6<? super fk8, bth> qy6Var) {
        md8.checkNotNullParameter(bk8Var, ymh.InterfaceC15729h.f102263c);
        md8.checkNotNullParameter(qy6Var, "builderAction");
        fk8 fk8Var = new fk8(bk8Var);
        qy6Var.invoke(fk8Var);
        return new kl8(fk8Var.build$kotlinx_serialization_json(), fk8Var.getSerializersModule());
    }

    public static /* synthetic */ bk8 Json$default(bk8 bk8Var, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            bk8Var = bk8.f13942d;
        }
        return Json(bk8Var, qy6Var);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(bk8 bk8Var, sk8 sk8Var) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        md8.checkNotNullParameter(sk8Var, "json");
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) bk8Var.decodeFromJsonElement(i2f.serializer(serializersModule, (mp8) null), sk8Var);
    }

    public static final /* synthetic */ <T> sk8 encodeToJsonElement(bk8 bk8Var, T t) {
        md8.checkNotNullParameter(bk8Var, "<this>");
        n2f serializersModule = bk8Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return bk8Var.encodeToJsonElement(i2f.serializer(serializersModule, (mp8) null), t);
    }
}
