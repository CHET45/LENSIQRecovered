package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@dwf({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n774#2:85\n865#2,2:86\n1557#2:88\n1628#2,3:89\n1#3:92\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/sessions/ProcessDetailsProvider\n*L\n37#1:85\n37#1:86,2\n41#1:88\n41#1:89,3\n*E\n"})
public final class add {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final add f1167a = new add();

    private add() {
    }

    private final String getProcessName() throws Throwable {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            String strMyProcessName = Process.myProcessName();
            md8.checkNotNullExpressionValue(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }

    @yfb
    public final List<ycd> getAppProcessDetails(@yfb Context context) {
        List<ActivityManager.RunningAppProcessInfo> listEmptyList;
        md8.checkNotNullParameter(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listEmptyList = activityManager.getRunningAppProcesses()) == null) {
            listEmptyList = l82.emptyList();
        }
        List listFilterNotNull = v82.filterNotNull(listEmptyList);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            md8.checkNotNullExpressionValue(str2, "processName");
            arrayList2.add(new ycd(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, md8.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @yfb
    public final ycd getMyProcessDetails(@yfb Context context) {
        Object next;
        md8.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ycd) next).getPid() == iMyPid) {
                break;
            }
        }
        ycd ycdVar = (ycd) next;
        return ycdVar == null ? new ycd(getProcessName(), iMyPid, 0, false) : ycdVar;
    }
}
