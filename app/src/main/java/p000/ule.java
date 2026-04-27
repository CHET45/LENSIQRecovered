package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ule {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zhd<sle> f88404a = pn2.staticCompositionLocalOf(C13588a.f88405a);

    /* JADX INFO: renamed from: ule$a */
    public static final class C13588a extends tt8 implements ny6<sle> {

        /* JADX INFO: renamed from: a */
        public static final C13588a f88405a = new C13588a();

        public C13588a() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final sle invoke() {
            return null;
        }
    }

    @yfb
    public static final sle SaveableStateRegistry(@gib Map<String, ? extends List<? extends Object>> map, @yfb qy6<Object, Boolean> qy6Var) {
        return new tle(map, qy6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fastIsBlank(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!tw1.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public static final zhd<sle> getLocalSaveableStateRegistry() {
        return f88404a;
    }
}
