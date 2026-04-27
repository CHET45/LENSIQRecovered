package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p000.bk8;

/* JADX INFO: loaded from: classes5.dex */
@dwf({"SMAP\nSessionConfigs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionConfigs.kt\ncom/google/firebase/sessions/settings/SessionConfigsSerializer\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,59:1\n147#2:60\n*S KotlinDebug\n*F\n+ 1 SessionConfigs.kt\ncom/google/firebase/sessions/settings/SessionConfigsSerializer\n*L\n49#1:60\n*E\n"})
public final class z4f implements w1f<y4f> {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final z4f f104155a = new z4f();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final y4f f104156b = new y4f(null, null, null, null, null);

    private z4f() {
    }

    @Override // p000.w1f
    @gib
    public Object readFrom(@yfb InputStream inputStream, @yfb zy2<? super y4f> zy2Var) throws d23 {
        try {
            bk8.C1927a c1927a = bk8.f13942d;
            String strDecodeToString = h9g.decodeToString(uj1.readBytes(inputStream));
            c1927a.getSerializersModule();
            return (y4f) c1927a.decodeFromString(y4f.Companion.serializer(), strDecodeToString);
        } catch (Exception e) {
            throw new d23("Cannot parse session configs", e);
        }
    }

    @Override // p000.w1f
    public /* bridge */ /* synthetic */ Object writeTo(y4f y4fVar, OutputStream outputStream, zy2 zy2Var) {
        return writeTo2(y4fVar, outputStream, (zy2<? super bth>) zy2Var);
    }

    @Override // p000.w1f
    @yfb
    public y4f getDefaultValue() {
        return f104156b;
    }

    @gib
    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@yfb y4f y4fVar, @yfb OutputStream outputStream, @yfb zy2<? super bth> zy2Var) throws IOException {
        outputStream.write(h9g.encodeToByteArray(bk8.f13942d.encodeToString(y4f.Companion.serializer(), y4fVar)));
        return bth.f14751a;
    }
}
