package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.C1511a;
import androidx.work.impl.WorkDatabase;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class ir7 {

    /* JADX INFO: renamed from: b */
    public static final int f48040b = 0;

    /* JADX INFO: renamed from: c */
    public static final String f48041c = "androidx.work.util.id";

    /* JADX INFO: renamed from: d */
    public static final String f48042d = "next_job_scheduler_id";

    /* JADX INFO: renamed from: e */
    public static final String f48043e = "next_alarm_manager_id";

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f48044a;

    public ir7(@efb WorkDatabase workDatabase) {
        this.f48044a = workDatabase;
    }

    public static void migrateLegacyIdGenerator(@efb Context context, @efb wfg sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f48041c, 0);
        if (sharedPreferences.contains(f48042d) || sharedPreferences.contains(f48042d)) {
            int i = sharedPreferences.getInt(f48042d, 0);
            int i2 = sharedPreferences.getInt(f48043e, 0);
            sqLiteDatabase.beginTransaction();
            try {
                sqLiteDatabase.execSQL(C1511a.f11283v, new Object[]{f48042d, Integer.valueOf(i)});
                sqLiteDatabase.execSQL(C1511a.f11283v, new Object[]{f48043e, Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.setTransactionSuccessful();
            } finally {
                sqLiteDatabase.endTransaction();
            }
        }
    }

    private int nextId(String key) {
        this.f48044a.beginTransaction();
        try {
            Long longValue = this.f48044a.preferenceDao().getLongValue(key);
            int i = 0;
            int iIntValue = longValue != null ? longValue.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            update(key, i);
            this.f48044a.setTransactionSuccessful();
            this.f48044a.endTransaction();
            return iIntValue;
        } catch (Throwable th) {
            this.f48044a.endTransaction();
            throw th;
        }
    }

    private void update(String key, int value) {
        this.f48044a.preferenceDao().insertPreference(new u8d(key, value));
    }

    public int nextAlarmManagerId() {
        int iNextId;
        synchronized (ir7.class) {
            iNextId = nextId(f48043e);
        }
        return iNextId;
    }

    public int nextJobSchedulerIdWithRange(int minInclusive, int maxInclusive) {
        synchronized (ir7.class) {
            int iNextId = nextId(f48042d);
            if (iNextId < minInclusive || iNextId > maxInclusive) {
                update(f48042d, minInclusive + 1);
            } else {
                minInclusive = iNextId;
            }
        }
        return minInclusive;
    }
}
