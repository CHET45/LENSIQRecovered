package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
@dwf({"SMAP\nProcessDetailsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n774#2:95\n865#2,2:96\n1557#2:98\n1628#2,3:99\n1#3:102\n*S KotlinDebug\n*F\n+ 1 ProcessDetailsProvider.kt\ncom/google/firebase/crashlytics/internal/ProcessDetailsProvider\n*L\n43#1:95\n43#1:96,2\n47#1:98\n47#1:99,3\n*E\n"})
public final class bdd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final bdd f13443a = new bdd();

    private bdd() {
    }

    public static /* synthetic */ z33.AbstractC15965f.d.a.c buildProcessDetails$default(bdd bddVar, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return bddVar.buildProcessDetails(str, i, i2, z);
    }

    private final String getProcessName() {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i <= 33) {
            return (i < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        md8.checkNotNull(strMyProcessName);
        return strMyProcessName;
    }

    @yfb
    @yn8
    public final z33.AbstractC15965f.d.a.c buildProcessDetails(@yfb String str) {
        md8.checkNotNullParameter(str, "processName");
        return buildProcessDetails$default(this, str, 0, 0, false, 14, null);
    }

    @yfb
    public final List<z33.AbstractC15965f.d.a.c> getAppProcessDetails(@yfb Context context) {
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
            arrayList2.add(z33.AbstractC15965f.d.a.c.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(md8.areEqual(runningAppProcessInfo.processName, str)).build());
        }
        return arrayList2;
    }

    @yfb
    public final z33.AbstractC15965f.d.a.c getCurrentProcessDetails(@yfb Context context) {
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
            if (((z33.AbstractC15965f.d.a.c) next).getPid() == iMyPid) {
                break;
            }
        }
        z33.AbstractC15965f.d.a.c cVar = (z33.AbstractC15965f.d.a.c) next;
        return cVar == null ? buildProcessDetails$default(this, getProcessName(), iMyPid, 0, false, 12, null) : cVar;
    }

    @yfb
    @yn8
    public final z33.AbstractC15965f.d.a.c buildProcessDetails(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "processName");
        return buildProcessDetails$default(this, str, i, 0, false, 12, null);
    }

    @yfb
    @yn8
    public final z33.AbstractC15965f.d.a.c buildProcessDetails(@yfb String str, int i, int i2) {
        md8.checkNotNullParameter(str, "processName");
        return buildProcessDetails$default(this, str, i, i2, false, 8, null);
    }

    @yfb
    @yn8
    public final z33.AbstractC15965f.d.a.c buildProcessDetails(@yfb String str, int i, int i2, boolean z) {
        md8.checkNotNullParameter(str, "processName");
        z33.AbstractC15965f.d.a.c cVarBuild = z33.AbstractC15965f.d.a.c.builder().setProcessName(str).setPid(i).setImportance(i2).setDefaultProcess(z).build();
        md8.checkNotNullExpressionValue(cVarBuild, "build(...)");
        return cVarBuild;
    }
}
