package p000;

/* JADX INFO: loaded from: classes6.dex */
public class hch {

    /* JADX INFO: renamed from: a */
    public vfe f43157a;

    /* JADX INFO: renamed from: hch$b */
    public static class C6799b {

        /* JADX INFO: renamed from: a */
        public static final String f43158a = "SP_KEY_AI_CHAT_SAVE_DATA";
    }

    /* JADX INFO: renamed from: hch$c */
    public static class C6800c {

        /* JADX INFO: renamed from: a */
        public static final hch f43159a = new hch();

        private C6800c() {
        }
    }

    public static hch getInstance() {
        return C6800c.f43159a;
    }

    public String getString(String key) {
        return this.f43157a.getString(key);
    }

    public void putString(String key, String value) {
        this.f43157a.putString(key, value);
    }

    private hch() {
        this.f43157a = vfe.getInstance();
    }
}
