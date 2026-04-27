package p000;

import p000.jl3;
import p000.lm2;

/* JADX INFO: loaded from: classes7.dex */
public interface ok8 extends jl3, lm2 {

    /* JADX INFO: renamed from: ok8$a */
    public static final class C10399a {
        public static int decodeCollectionSize(@yfb ok8 ok8Var, @yfb f0f f0fVar) {
            md8.checkNotNullParameter(f0fVar, "descriptor");
            return lm2.C8896b.decodeCollectionSize(ok8Var, f0fVar);
        }

        @gib
        @ph5
        public static <T> T decodeNullableSerializableValue(@yfb ok8 ok8Var, @yfb t74<? extends T> t74Var) {
            md8.checkNotNullParameter(t74Var, "deserializer");
            return (T) jl3.C7970a.decodeNullableSerializableValue(ok8Var, t74Var);
        }

        @ph5
        public static boolean decodeSequentially(@yfb ok8 ok8Var) {
            return lm2.C8896b.decodeSequentially(ok8Var);
        }

        public static <T> T decodeSerializableValue(@yfb ok8 ok8Var, @yfb t74<? extends T> t74Var) {
            md8.checkNotNullParameter(t74Var, "deserializer");
            return (T) jl3.C7970a.decodeSerializableValue(ok8Var, t74Var);
        }
    }

    @yfb
    sk8 decodeJsonElement();

    @yfb
    bk8 getJson();
}
