package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import p000.bk8;

/* JADX INFO: loaded from: classes5.dex */
@qpf
@dwf({"SMAP\nSessionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionData.kt\ncom/google/firebase/sessions/SessionDataSerializer\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,59:1\n147#2:60\n*S KotlinDebug\n*F\n+ 1 SessionData.kt\ncom/google/firebase/sessions/SessionDataSerializer\n*L\n49#1:60\n*E\n"})
public final class b5f implements w1f<a5f> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final l5f f12728a;

    @a28
    public b5f(@yfb l5f l5fVar) {
        md8.checkNotNullParameter(l5fVar, "sessionGenerator");
        this.f12728a = l5fVar;
    }

    @Override // p000.w1f
    @gib
    public Object readFrom(@yfb InputStream inputStream, @yfb zy2<? super a5f> zy2Var) throws d23 {
        try {
            bk8.C1927a c1927a = bk8.f13942d;
            String strDecodeToString = h9g.decodeToString(uj1.readBytes(inputStream));
            c1927a.getSerializersModule();
            return (a5f) c1927a.decodeFromString(a5f.Companion.serializer(), strDecodeToString);
        } catch (Exception e) {
            throw new d23("Cannot parse session data", e);
        }
    }

    @Override // p000.w1f
    public /* bridge */ /* synthetic */ Object writeTo(a5f a5fVar, OutputStream outputStream, zy2 zy2Var) {
        return writeTo2(a5fVar, outputStream, (zy2<? super bth>) zy2Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.w1f
    @yfb
    public a5f getDefaultValue() {
        return new a5f(this.f12728a.generateNewSession(null), (wzg) null, (Map) null, 6, (jt3) null);
    }

    @gib
    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@yfb a5f a5fVar, @yfb OutputStream outputStream, @yfb zy2<? super bth> zy2Var) throws IOException {
        outputStream.write(h9g.encodeToByteArray(bk8.f13942d.encodeToString(a5f.Companion.serializer(), a5fVar)));
        return bth.f14751a;
    }
}
