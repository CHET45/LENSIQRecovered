package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: renamed from: xl */
/* JADX INFO: loaded from: classes4.dex */
public class C15178xl implements nqi {

    /* JADX INFO: renamed from: f */
    public static final String f98327f = "AlarmManagerScheduler";

    /* JADX INFO: renamed from: g */
    public static final String f98328g = "attemptNumber";

    /* JADX INFO: renamed from: h */
    public static final String f98329h = "backendName";

    /* JADX INFO: renamed from: i */
    public static final String f98330i = "priority";

    /* JADX INFO: renamed from: j */
    public static final String f98331j = "extras";

    /* JADX INFO: renamed from: a */
    public final Context f98332a;

    /* JADX INFO: renamed from: b */
    public final t65 f98333b;

    /* JADX INFO: renamed from: c */
    public AlarmManager f98334c;

    /* JADX INFO: renamed from: d */
    public final yoe f98335d;

    /* JADX INFO: renamed from: e */
    public final g52 f98336e;

    public C15178xl(Context context, t65 t65Var, g52 g52Var, yoe yoeVar) {
        this(context, t65Var, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), g52Var, yoeVar);
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public boolean m25264a(Intent intent) {
        return PendingIntent.getBroadcast(this.f98332a, 0, intent, 603979776) != null;
    }

    @Override // p000.nqi
    public void schedule(chh chhVar, int i) {
        schedule(chhVar, i, false);
    }

    @Override // p000.nqi
    public void schedule(chh chhVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", chhVar.getBackendName());
        builder.appendQueryParameter("priority", String.valueOf(gcd.toInt(chhVar.getPriority())));
        if (chhVar.getExtras() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(chhVar.getExtras(), 0));
        }
        Intent intent = new Intent(this.f98332a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && m25264a(intent)) {
            tj9.m22693d(f98327f, "Upload for context %s is already scheduled. Returning...", chhVar);
            return;
        }
        long nextCallTime = this.f98333b.getNextCallTime(chhVar);
        long scheduleDelay = this.f98335d.getScheduleDelay(chhVar.getPriority(), nextCallTime, i);
        tj9.m22695d(f98327f, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", chhVar, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i));
        this.f98334c.set(3, this.f98336e.getTime() + scheduleDelay, PendingIntent.getBroadcast(this.f98332a, 0, intent, 67108864));
    }

    @fdi
    public C15178xl(Context context, t65 t65Var, AlarmManager alarmManager, g52 g52Var, yoe yoeVar) {
        this.f98332a = context;
        this.f98333b = t65Var;
        this.f98334c = alarmManager;
        this.f98336e = g52Var;
        this.f98335d = yoeVar;
    }
}
