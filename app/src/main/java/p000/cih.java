package p000;

import p000.jvd;
import p000.u0f;

/* JADX INFO: loaded from: classes7.dex */
public final class cih {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f16665a = "primitive";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends sk8> T cast(sk8 sk8Var, String str, ny6<String> ny6Var) {
        md8.checkNotNullParameter(sk8Var, "value");
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(ny6Var, "path");
        md8.reifiedOperationMarker(3, "T");
        if (sk8Var != 0) {
            return sk8Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        md8.reifiedOperationMarker(4, "T");
        sb.append(vvd.getOrCreateKotlinClass(sk8.class).getSimpleName());
        sb.append(", but had ");
        sb.append(vvd.getOrCreateKotlinClass(sk8Var.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(str);
        sb.append(" at element: ");
        sb.append(ny6Var.invoke());
        throw il8.JsonDecodingException(-1, sb.toString(), sk8Var.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRequiresTopLevelTag(f0f f0fVar) {
        return (f0fVar.getKind() instanceof jbd) || f0fVar.getKind() == u0f.C13312b.f86523a;
    }

    @jl8
    @yfb
    public static final <T> sk8 writeJson(@yfb bk8 bk8Var, T t, @yfb e1f<? super T> e1fVar) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(e1fVar, "serializer");
        final jvd.C8121h c8121h = new jvd.C8121h();
        new rm8(bk8Var, new qy6() { // from class: bih
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return cih.writeJson$lambda$0(c8121h, (sk8) obj);
            }
        }).encodeSerializableValue(e1fVar, t);
        T t2 = c8121h.f52110a;
        if (t2 != null) {
            return (sk8) t2;
        }
        md8.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final bth writeJson$lambda$0(jvd.C8121h c8121h, sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "it");
        c8121h.f52110a = sk8Var;
        return bth.f14751a;
    }
}
