package p000;

/* JADX INFO: renamed from: u3 */
/* JADX INFO: loaded from: classes7.dex */
public final class C13341u3 {
    @yfb
    @xn8(name = "throwSubtypeNotRegistered")
    public static final Void throwSubtypeNotRegistered(@gib String str, @yfb oo8<?> oo8Var) {
        String str2;
        md8.checkNotNullParameter(oo8Var, "baseClass");
        String str3 = "in the polymorphic scope of '" + oo8Var.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + a18.f100c;
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + oo8Var.getSimpleName() + "' has to be sealed and '@Serializable'.";
        }
        throw new d1f(str2);
    }

    @yfb
    @xn8(name = "throwSubtypeNotRegistered")
    public static final Void throwSubtypeNotRegistered(@yfb oo8<?> oo8Var, @yfb oo8<?> oo8Var2) {
        md8.checkNotNullParameter(oo8Var, "subClass");
        md8.checkNotNullParameter(oo8Var2, "baseClass");
        String simpleName = oo8Var.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(oo8Var);
        }
        throwSubtypeNotRegistered(simpleName, oo8Var2);
        throw new us8();
    }
}
