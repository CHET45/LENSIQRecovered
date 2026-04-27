package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.AbstractC1158q;
import androidx.work.impl.C1511a;
import androidx.work.impl.WorkDatabase;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class c9d {

    /* JADX INFO: renamed from: b */
    public static final String f16042b = "androidx.work.util.preferences";

    /* JADX INFO: renamed from: c */
    public static final String f16043c = "last_cancel_all_time_ms";

    /* JADX INFO: renamed from: d */
    public static final String f16044d = "reschedule_needed";

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f16045a;

    /* JADX INFO: renamed from: c9d$a */
    public class C2244a implements f07<Long, Long> {
        public C2244a() {
        }

        @Override // p000.f07
        public Long apply(Long value) {
            return Long.valueOf(value != null ? value.longValue() : 0L);
        }
    }

    public c9d(@efb WorkDatabase workDatabase) {
        this.f16045a = workDatabase;
    }

    public static void migrateLegacyPreferences(@efb Context context, @efb wfg sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f16042b, 0);
        if (sharedPreferences.contains(f16044d) || sharedPreferences.contains(f16043c)) {
            long j = sharedPreferences.getLong(f16043c, 0L);
            long j2 = sharedPreferences.getBoolean(f16044d, false) ? 1L : 0L;
            sqLiteDatabase.beginTransaction();
            try {
                sqLiteDatabase.execSQL(C1511a.f11283v, new Object[]{f16043c, Long.valueOf(j)});
                sqLiteDatabase.execSQL(C1511a.f11283v, new Object[]{f16044d, Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.setTransactionSuccessful();
            } finally {
                sqLiteDatabase.endTransaction();
            }
        }
    }

    public long getLastCancelAllTimeMillis() {
        Long longValue = this.f16045a.preferenceDao().getLongValue(f16043c);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    @efb
    public AbstractC1158q<Long> getLastCancelAllTimeMillisLiveData() {
        return feh.map(this.f16045a.preferenceDao().getObservableLongValue(f16043c), new C2244a());
    }

    public boolean getNeedsReschedule() {
        Long longValue = this.f16045a.preferenceDao().getLongValue(f16044d);
        return longValue != null && longValue.longValue() == 1;
    }

    public void setLastCancelAllTimeMillis(final long timeMillis) {
        this.f16045a.preferenceDao().insertPreference(new u8d(f16043c, timeMillis));
    }

    public void setNeedsReschedule(boolean needsReschedule) {
        this.f16045a.preferenceDao().insertPreference(new u8d(f16044d, needsReschedule));
    }
}
