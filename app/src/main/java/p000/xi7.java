package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface xi7 {

    /* JADX INFO: renamed from: xi7$a */
    public enum EnumC15141a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a */
        public final int f98074a;

        EnumC15141a(int i) {
            this.f98074a = i;
        }

        public int getCode() {
            return this.f98074a;
        }
    }

    @efb
    EnumC15141a getHeartBeatCode(@efb String str);
}
