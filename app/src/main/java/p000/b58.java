package p000;

/* JADX INFO: loaded from: classes.dex */
public interface b58 {

    /* JADX INFO: renamed from: b58$a */
    public static final class C1740a {
        @yfb
        @Deprecated
        public static vye<e2i> getInspectableElements(@yfb b58 b58Var) {
            return b58.super.getInspectableElements();
        }

        @gib
        @Deprecated
        public static String getNameFallback(@yfb b58 b58Var) {
            return b58.super.getNameFallback();
        }

        @gib
        @Deprecated
        public static Object getValueOverride(@yfb b58 b58Var) {
            return b58.super.getValueOverride();
        }
    }

    @yfb
    default vye<e2i> getInspectableElements() {
        return ize.emptySequence();
    }

    @gib
    default String getNameFallback() {
        return null;
    }

    @gib
    default Object getValueOverride() {
        return null;
    }
}
