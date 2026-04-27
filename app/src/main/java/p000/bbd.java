package p000;

/* JADX INFO: loaded from: classes.dex */
public interface bbd<T> {

    /* JADX INFO: renamed from: bbd$a */
    public static final class C1823a {
        @Deprecated
        public static <T> int getCount(@yfb bbd<T> bbdVar) {
            return bbd.super.getCount();
        }
    }

    default int getCount() {
        return vze.count(getValues());
    }

    @yfb
    vye<T> getValues();
}
