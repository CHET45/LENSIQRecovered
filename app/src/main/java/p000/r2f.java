package p000;

import java.util.List;
import p000.r2f;

/* JADX INFO: loaded from: classes7.dex */
@ph5
public interface r2f {

    /* JADX INFO: renamed from: r2f$a */
    public static final class C11853a {
        public static <T> void contextual(@yfb r2f r2fVar, @yfb oo8<T> oo8Var, @yfb final lp8<T> lp8Var) {
            md8.checkNotNullParameter(oo8Var, "kClass");
            md8.checkNotNullParameter(lp8Var, "serializer");
            r2fVar.contextual(oo8Var, new qy6() { // from class: q2f
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return r2f.C11853a.contextual$lambda$0(lp8Var, (List) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static lp8 contextual$lambda$0(lp8 lp8Var, List list) {
            md8.checkNotNullParameter(list, "it");
            return lp8Var;
        }

        @q64(level = u64.f86865a, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @i2e(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        public static <Base> void polymorphicDefault(@yfb r2f r2fVar, @yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var) {
            md8.checkNotNullParameter(oo8Var, "baseClass");
            md8.checkNotNullParameter(qy6Var, "defaultDeserializerProvider");
            r2fVar.polymorphicDefaultDeserializer(oo8Var, qy6Var);
        }
    }

    <T> void contextual(@yfb oo8<T> oo8Var, @yfb lp8<T> lp8Var);

    <T> void contextual(@yfb oo8<T> oo8Var, @yfb qy6<? super List<? extends lp8<?>>, ? extends lp8<?>> qy6Var);

    <Base, Sub extends Base> void polymorphic(@yfb oo8<Base> oo8Var, @yfb oo8<Sub> oo8Var2, @yfb lp8<Sub> lp8Var);

    @q64(level = u64.f86865a, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @i2e(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    <Base> void polymorphicDefault(@yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var);

    <Base> void polymorphicDefaultDeserializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super String, ? extends t74<? extends Base>> qy6Var);

    <Base> void polymorphicDefaultSerializer(@yfb oo8<Base> oo8Var, @yfb qy6<? super Base, ? extends e1f<? super Base>> qy6Var);
}
