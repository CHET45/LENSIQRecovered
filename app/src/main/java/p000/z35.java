package p000;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes7.dex */
public final class z35<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15969a f103965b = new C15969a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Class<E> f103966a;

    /* JADX INFO: renamed from: z35$a */
    public static final class C15969a {
        public /* synthetic */ C15969a(jt3 jt3Var) {
            this();
        }

        private C15969a() {
        }
    }

    public z35(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "entries");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        md8.checkNotNull(cls);
        this.f103966a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f103966a.getEnumConstants();
        md8.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return x35.enumEntries(enumConstants);
    }
}
