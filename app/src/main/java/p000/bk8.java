package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bk8 implements r7g {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C1927a f13942d = new C1927a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final hk8 f13943a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final n2f f13944b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final p74 f13945c;

    /* JADX INFO: renamed from: bk8$a */
    public static final class C1927a extends bk8 {
        public /* synthetic */ C1927a(jt3 jt3Var) {
            this();
        }

        private C1927a() {
            super(new hk8(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), p2f.EmptySerializersModule(), null);
        }
    }

    public /* synthetic */ bk8(hk8 hk8Var, n2f n2fVar, jt3 jt3Var) {
        this(hk8Var, n2fVar);
    }

    @q64(level = u64.f86866b, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @i2e(expression = "schemaCache", imports = {}))
    public static /* synthetic */ void get_schemaCache$kotlinx_serialization_json$annotations() {
    }

    public final <T> T decodeFromJsonElement(@yfb t74<? extends T> t74Var, @yfb sk8 sk8Var) {
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(sk8Var, "element");
        return (T) aih.readJson(this, sk8Var, t74Var);
    }

    public final /* synthetic */ <T> T decodeFromString(@au8(prefix = "", suffix = "", value = "json") String str) {
        md8.checkNotNullParameter(str, ymh.InterfaceC15723b.f102127e);
        n2f serializersModule = getSerializersModule();
        md8.reifiedOperationMarker(6, "T");
        sq9.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromString(i2f.serializer(serializersModule, (mp8) null), str);
    }

    @yfb
    public final <T> sk8 encodeToJsonElement(@yfb e1f<? super T> e1fVar, T t) {
        md8.checkNotNullParameter(e1fVar, "serializer");
        return cih.writeJson(this, t, e1fVar);
    }

    @Override // p000.r7g
    @yfb
    public final <T> String encodeToString(@yfb e1f<? super T> e1fVar, T t) {
        md8.checkNotNullParameter(e1fVar, "serializer");
        om8 om8Var = new om8();
        try {
            mm8.encodeByWriter(this, om8Var, e1fVar, t);
            return om8Var.toString();
        } finally {
            om8Var.release();
        }
    }

    @yfb
    public final hk8 getConfiguration() {
        return this.f13943a;
    }

    @Override // p000.r0f
    @yfb
    public n2f getSerializersModule() {
        return this.f13944b;
    }

    @yfb
    public final p74 get_schemaCache$kotlinx_serialization_json() {
        return this.f13945c;
    }

    @yfb
    public final sk8 parseToJsonElement(@yfb @au8(prefix = "", suffix = "", value = "json") String str) {
        md8.checkNotNullParameter(str, ymh.InterfaceC15723b.f102127e);
        return (sk8) decodeFromString(cl8.f16886a, str);
    }

    private bk8(hk8 hk8Var, n2f n2fVar) {
        this.f13943a = hk8Var;
        this.f13944b = n2fVar;
        this.f13945c = new p74();
    }

    @Override // p000.r7g
    public final <T> T decodeFromString(@yfb t74<? extends T> t74Var, @yfb @au8(prefix = "", suffix = "", value = "json") String str) {
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(str, ymh.InterfaceC15723b.f102127e);
        w7g w7gVarStringJsonLexer = x7g.StringJsonLexer(this, str);
        T t = (T) new y6g(this, csi.f27316c, w7gVarStringJsonLexer, t74Var.getDescriptor(), null).decodeSerializableValue(t74Var);
        w7gVarStringJsonLexer.expectEof();
        return t;
    }
}
