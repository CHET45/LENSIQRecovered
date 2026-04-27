package p000;

import com.iflytek.aikit.core.C3818a;
import p000.emc;

/* JADX INFO: renamed from: uj */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC13546uj {
    int end(C9910nk c9910nk);

    int engineInit(String str);

    int engineInit(String str, C3818a c3818a);

    int engineUnInit(String str);

    int loadData(String str, C3818a c3818a);

    int loadData(String str, C3818a c3818a, Object obj);

    int oneShot(String str, C3818a c3818a, C3818a c3818a2, Object obj);

    int oneShot(String str, C3818a c3818a, Object obj);

    int oneShotAsync(String str, C3818a c3818a);

    C15164xk oneShotSync(String str, C3818a c3818a, Object obj);

    int preProcess(String str, C3818a c3818a);

    int read(String str, C9910nk c9910nk);

    C15164xk readSync(String str, C9910nk c9910nk);

    C9910nk record(String str, C9910nk c9910nk, emc.C5394d c5394d, String str2, Object obj);

    int specifyDataSet(String str, String str2, int[] iArr);

    C9910nk start(String str, C3818a c3818a, Object obj);

    C9910nk start(String str, Object obj);

    int unLoadData(String str, String str2, int i);

    int write(C3818a c3818a, C9910nk c9910nk);
}
