package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,46:1\n9#2:47\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n25#1:47\n*E\n"})
@xn8(name = "KClasses")
public final class po8 {
    /* JADX WARN: Multi-variable type inference failed */
    @ip9
    @jjf(version = "1.4")
    @yfb
    public static final <T> T cast(@yfb oo8<T> oo8Var, @gib Object obj) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        if (oo8Var.isInstance(obj)) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + oo8Var.getQualifiedName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    @ip9
    @jjf(version = "1.4")
    public static final <T> T safeCast(@yfb oo8<T> oo8Var, @gib Object obj) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        if (!oo8Var.isInstance(obj)) {
            return null;
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
