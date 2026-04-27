package p000;

/* JADX INFO: loaded from: classes.dex */
public interface gn2 extends fn2 {

    /* JADX INFO: renamed from: gn2$a */
    public static final class C6433a {
        @gib
        @Deprecated
        public static gn2 find(@yfb gn2 gn2Var, @yfb Object obj) {
            return gn2.super.find(obj);
        }

        @Deprecated
        public static int getGroupSize(@yfb gn2 gn2Var) {
            return gn2.super.getGroupSize();
        }

        @gib
        @Deprecated
        public static Object getIdentity(@yfb gn2 gn2Var) {
            return gn2.super.getIdentity();
        }

        @Deprecated
        public static int getSlotsSize(@yfb gn2 gn2Var) {
            return gn2.super.getSlotsSize();
        }
    }

    @yfb
    Iterable<Object> getData();

    default int getGroupSize() {
        return 0;
    }

    @gib
    default Object getIdentity() {
        return null;
    }

    @yfb
    Object getKey();

    @gib
    Object getNode();

    default int getSlotsSize() {
        return 0;
    }

    @gib
    String getSourceInfo();
}
