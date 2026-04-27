package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class eqa {

    /* JADX INFO: renamed from: eqa$a */
    public enum EnumC5439a implements dqa<Object> {
        INSTANCE;

        @Override // p000.dqa
        public void injectMembers(Object obj) {
            s7d.checkNotNull(obj, "Cannot inject members into a null reference");
        }
    }

    private eqa() {
    }

    public static <T> dqa<T> noOp() {
        return EnumC5439a.INSTANCE;
    }
}
