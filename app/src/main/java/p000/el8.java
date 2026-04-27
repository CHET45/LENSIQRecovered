package p000;

import p000.m15;
import p000.om2;

/* JADX INFO: loaded from: classes7.dex */
public interface el8 extends m15, om2 {

    /* JADX INFO: renamed from: el8$a */
    public static final class C5366a {
        @yfb
        public static om2 beginCollection(@yfb el8 el8Var, @yfb f0f f0fVar, int i) {
            md8.checkNotNullParameter(f0fVar, "descriptor");
            return m15.C9082a.beginCollection(el8Var, f0fVar, i);
        }

        @ph5
        public static void encodeNotNullMark(@yfb el8 el8Var) {
            m15.C9082a.encodeNotNullMark(el8Var);
        }

        @ph5
        public static <T> void encodeNullableSerializableValue(@yfb el8 el8Var, @yfb e1f<? super T> e1fVar, @gib T t) {
            md8.checkNotNullParameter(e1fVar, "serializer");
            m15.C9082a.encodeNullableSerializableValue(el8Var, e1fVar, t);
        }

        public static <T> void encodeSerializableValue(@yfb el8 el8Var, @yfb e1f<? super T> e1fVar, T t) {
            md8.checkNotNullParameter(e1fVar, "serializer");
            m15.C9082a.encodeSerializableValue(el8Var, e1fVar, t);
        }

        @ph5
        public static boolean shouldEncodeElementDefault(@yfb el8 el8Var, @yfb f0f f0fVar, int i) {
            md8.checkNotNullParameter(f0fVar, "descriptor");
            return om2.C10464a.shouldEncodeElementDefault(el8Var, f0fVar, i);
        }
    }

    void encodeJsonElement(@yfb sk8 sk8Var);

    @yfb
    bk8 getJson();
}
