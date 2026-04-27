package p000;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.scd;

/* JADX INFO: loaded from: classes5.dex */
@qpf
@dwf({"SMAP\nProcessDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1611#2,9:124\n1863#2:133\n1864#2:135\n1620#2:136\n1734#2,3:137\n1#3:134\n1#3:140\n*S KotlinDebug\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n*L\n78#1:124,9\n78#1:133\n78#1:135\n78#1:136\n83#1:137,3\n78#1:134\n*E\n"})
public final class wcd implements scd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f93945a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final fx8 f93946b;

    /* JADX INFO: renamed from: c */
    public final int f93947c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final fx8 f93948d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final fx8 f93949e;

    /* JADX INFO: renamed from: f */
    public boolean f93950f;

    @a28
    public wcd(@yfb Context context, @yfb final n1i n1iVar) {
        md8.checkNotNullParameter(context, "appContext");
        md8.checkNotNullParameter(n1iVar, "uuidGenerator");
        this.f93945a = context;
        this.f93946b = hz8.lazy(new ny6() { // from class: tcd
            @Override // p000.ny6
            public final Object invoke() {
                return wcd.myProcessName_delegate$lambda$0(this.f84273a);
            }
        });
        this.f93947c = Process.myPid();
        this.f93948d = hz8.lazy(new ny6() { // from class: ucd
            @Override // p000.ny6
            public final Object invoke() {
                return wcd.myUuid_delegate$lambda$1(n1iVar);
            }
        });
        this.f93949e = hz8.lazy(new ny6() { // from class: vcd
            @Override // p000.ny6
            public final Object invoke() {
                return wcd.myProcessDetails_delegate$lambda$2(this.f90690a);
            }
        });
    }

    private final List<ycd> getAppProcessDetails() {
        return add.f1167a.getAppProcessDetails(this.f93945a);
    }

    private final ycd getMyProcessDetails() {
        return (ycd) this.f93949e.getValue();
    }

    private final boolean isProcessStale(ycd ycdVar, rcd rcdVar) {
        if (md8.areEqual(getMyProcessName(), ycdVar.getProcessName())) {
            if (ycdVar.getPid() != rcdVar.getPid() || !md8.areEqual(getMyUuid(), rcdVar.getUuid())) {
                return true;
            }
        } else if (ycdVar.getPid() != rcdVar.getPid()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ycd myProcessDetails_delegate$lambda$2(wcd wcdVar) {
        return add.f1167a.getMyProcessDetails(wcdVar.f93945a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myProcessName_delegate$lambda$0(wcd wcdVar) {
        return wcdVar.getMyProcessDetails().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myUuid_delegate$lambda$1(n1i n1iVar) {
        String string = n1iVar.next().toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // p000.scd
    @yfb
    public Map<String, rcd> generateProcessDataMap() {
        return scd.C12519a.generateProcessDataMap(this);
    }

    @Override // p000.scd
    public int getMyPid() {
        return this.f93947c;
    }

    @Override // p000.scd
    @yfb
    public String getMyProcessName() {
        return (String) this.f93946b.getValue();
    }

    @Override // p000.scd
    @yfb
    public String getMyUuid() {
        return (String) this.f93948d.getValue();
    }

    @Override // p000.scd
    public boolean isColdStart(@yfb Map<String, rcd> map) {
        md8.checkNotNullParameter(map, "processDataMap");
        if (this.f93950f) {
            return false;
        }
        List<ycd> appProcessDetails = getAppProcessDetails();
        ArrayList<scc> arrayList = new ArrayList();
        for (ycd ycdVar : appProcessDetails) {
            rcd rcdVar = map.get(ycdVar.getProcessName());
            scc sccVar = rcdVar != null ? new scc(ycdVar, rcdVar) : null;
            if (sccVar != null) {
                arrayList.add(sccVar);
            }
        }
        if (!arrayList.isEmpty()) {
            for (scc sccVar2 : arrayList) {
                if (!isProcessStale((ycd) sccVar2.component1(), (rcd) sccVar2.component2())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p000.scd
    public boolean isMyProcessStale(@yfb Map<String, rcd> map) {
        md8.checkNotNullParameter(map, "processDataMap");
        rcd rcdVar = map.get(getMyProcessName());
        return (rcdVar != null && rcdVar.getPid() == getMyPid() && md8.areEqual(rcdVar.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // p000.scd
    public void onSessionGenerated() {
        this.f93950f = true;
    }

    @Override // p000.scd
    @yfb
    public Map<String, rcd> updateProcessDataMap(@gib Map<String, rcd> map) {
        Map mutableMap;
        if (map != null && (mutableMap = xt9.toMutableMap(map)) != null) {
            mutableMap.put(getMyProcessName(), new rcd(Process.myPid(), getMyUuid()));
            Map<String, rcd> map2 = xt9.toMap(mutableMap);
            if (map2 != null) {
                return map2;
            }
        }
        return wt9.mapOf(vkh.m24050to(getMyProcessName(), new rcd(Process.myPid(), getMyUuid())));
    }
}
