package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public final class s0f {
    public static final /* synthetic */ <T> T decodeFromByteArray(a21 a21Var, byte[] bArr) {
        md8.checkNotNullParameter(a21Var, "<this>");
        md8.checkNotNullParameter(bArr, "bytes");
        n2f serializersModule = a21Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) a21Var.decodeFromByteArray(i2f.serializer(serializersModule, (mp8) null), bArr);
    }

    public static final <T> T decodeFromHexString(@yfb a21 a21Var, @yfb t74<? extends T> t74Var, @yfb String str) {
        md8.checkNotNullParameter(a21Var, "<this>");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(str, "hex");
        return (T) a21Var.decodeFromByteArray(t74Var, wa8.f93811a.parseHexBinary(str));
    }

    public static final /* synthetic */ <T> T decodeFromString(r7g r7gVar, String str) {
        md8.checkNotNullParameter(r7gVar, "<this>");
        md8.checkNotNullParameter(str, ymh.InterfaceC15723b.f102127e);
        n2f serializersModule = r7gVar.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) r7gVar.decodeFromString(i2f.serializer(serializersModule, (mp8) null), str);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(a21 a21Var, T t) {
        md8.checkNotNullParameter(a21Var, "<this>");
        n2f serializersModule = a21Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return a21Var.encodeToByteArray(i2f.serializer(serializersModule, (mp8) null), t);
    }

    @yfb
    public static final <T> String encodeToHexString(@yfb a21 a21Var, @yfb e1f<? super T> e1fVar, T t) {
        md8.checkNotNullParameter(a21Var, "<this>");
        md8.checkNotNullParameter(e1fVar, "serializer");
        return wa8.f93811a.printHexBinary(a21Var.encodeToByteArray(e1fVar, t), true);
    }

    public static final /* synthetic */ <T> String encodeToString(r7g r7gVar, T t) {
        md8.checkNotNullParameter(r7gVar, "<this>");
        n2f serializersModule = r7gVar.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return r7gVar.encodeToString(i2f.serializer(serializersModule, (mp8) null), t);
    }

    public static final /* synthetic */ <T> T decodeFromHexString(a21 a21Var, String str) {
        md8.checkNotNullParameter(a21Var, "<this>");
        md8.checkNotNullParameter(str, "hex");
        n2f serializersModule = a21Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromHexString(a21Var, i2f.serializer(serializersModule, (mp8) null), str);
    }

    public static final /* synthetic */ <T> String encodeToHexString(a21 a21Var, T t) {
        md8.checkNotNullParameter(a21Var, "<this>");
        n2f serializersModule = a21Var.getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToHexString(a21Var, i2f.serializer(serializersModule, (mp8) null), t);
    }
}
