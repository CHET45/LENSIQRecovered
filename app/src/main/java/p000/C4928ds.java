package p000;

import android.os.Looper;
import java.util.List;

/* JADX INFO: renamed from: ds */
/* JADX INFO: loaded from: classes7.dex */
public final class C4928ds implements er9 {
    @Override // p000.er9
    @yfb
    public dr9 createDispatcher(@yfb List<? extends er9> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new ge7(je7.asHandler(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p000.er9
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // p000.er9
    @yfb
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
