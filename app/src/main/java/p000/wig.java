package p000;

import android.content.Context;
import androidx.work.impl.background.systemalarm.C1513a;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class wig implements roe {

    /* JADX INFO: renamed from: b */
    public static final String f94369b = cj9.tagWithPrefix("SystemAlarmScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f94370a;

    public wig(@efb Context context) {
        this.f94370a = context.getApplicationContext();
    }

    private void scheduleWorkSpec(@efb oqi workSpec) {
        cj9.get().debug(f94369b, String.format("Scheduling work with workSpecId %s", workSpec.f68337a), new Throwable[0]);
        this.f94370a.startService(C1513a.m2469e(this.f94370a, workSpec.f68337a));
    }

    @Override // p000.roe
    public void cancel(@efb String workSpecId) {
        this.f94370a.startService(C1513a.m2470f(this.f94370a, workSpecId));
    }

    @Override // p000.roe
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // p000.roe
    public void schedule(@efb oqi... workSpecs) {
        for (oqi oqiVar : workSpecs) {
            scheduleWorkSpec(oqiVar);
        }
    }
}
