package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface scd {

    /* JADX INFO: renamed from: scd$a */
    public static final class C12519a {
        @yfb
        public static Map<String, rcd> generateProcessDataMap(@yfb scd scdVar) {
            return scdVar.updateProcessDataMap(xt9.emptyMap());
        }
    }

    @yfb
    Map<String, rcd> generateProcessDataMap();

    int getMyPid();

    @yfb
    String getMyProcessName();

    @yfb
    String getMyUuid();

    boolean isColdStart(@yfb Map<String, rcd> map);

    boolean isMyProcessStale(@yfb Map<String, rcd> map);

    void onSessionGenerated();

    @yfb
    Map<String, rcd> updateProcessDataMap(@gib Map<String, rcd> map);
}
