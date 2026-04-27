package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface p7f {

    /* JADX INFO: renamed from: p7f$a */
    public static final class C10827a {
        public static boolean isSettingsStale(@yfb p7f p7fVar) {
            return false;
        }

        @gib
        public static Object updateSettings(@yfb p7f p7fVar, @yfb zy2<? super bth> zy2Var) {
            return bth.f14751a;
        }
    }

    @gib
    Double getSamplingRate();

    @gib
    Boolean getSessionEnabled();

    @gib
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    bt4 mo31700getSessionRestartTimeoutFghU774();

    boolean isSettingsStale();

    @gib
    Object updateSettings(@yfb zy2<? super bth> zy2Var);
}
