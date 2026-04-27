package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bt7 {

    /* JADX INFO: renamed from: bt7$b */
    public static class C2047b extends bt7 {
        private C2047b() {
        }

        @Override // p000.bt7
        @efb
        public String process(@efb String str) {
            return str;
        }
    }

    @efb
    public static bt7 noOp() {
        return new C2047b();
    }

    @efb
    public abstract String process(@efb String str);
}
