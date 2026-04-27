package p000;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.view.alarmclock.EyevueAlarmClockSettingActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.watchfun.voicenotes.CommonWebViewActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class nn1 {

    /* JADX INFO: renamed from: a */
    public static final String f65060a = "CalendarUtils";

    /* JADX INFO: renamed from: b */
    public static String f65061b = "dh";

    /* JADX INFO: renamed from: c */
    public static String f65062c = "dh@dh.com";

    /* JADX INFO: renamed from: d */
    public static String f65063d = "com.android.dh";

    /* JADX INFO: renamed from: e */
    public static String f65064e = "dh";

    public static long addCalendarEvent(Context context, String title, String description, long startTime, long endTime, int remindMinutes) {
        int iCheckAndAddCalendarAccount = checkAndAddCalendarAccount(context);
        if (iCheckAndAddCalendarAccount < 0) {
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(EyevueAlarmClockSettingActivity.f18421Z, Integer.valueOf(iCheckAndAddCalendarAccount));
        contentValues.put(CommonWebViewActivity.f26185L, title);
        contentValues.put("description", description);
        contentValues.put("dtstart", Long.valueOf(startTime));
        contentValues.put("dtend", Long.valueOf(endTime));
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        contentValues.put("hasAlarm", (Integer) 1);
        Uri uriInsert = context.getContentResolver().insert(CalendarContract.Events.CONTENT_URI, contentValues);
        if (uriInsert == null) {
            Log.e(f65060a, "事件插入失败");
            return -1L;
        }
        long id = ContentUris.parseId(uriInsert);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("event_id", Long.valueOf(id));
        contentValues2.put("minutes", Integer.valueOf(remindMinutes));
        contentValues2.put(FirebaseAnalytics.C3552d.f23230v, (Integer) 1);
        context.getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues2);
        return id;
    }

    public static long addWithCalendar(long timestamp, String timeUnit) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        String lowerCase = timeUnit.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals("week")) {
            calendar.add(3, 1);
        } else {
            if (!lowerCase.equals("month")) {
                throw new IllegalArgumentException("不支持的时间单位: " + timeUnit + "。请使用 'week' 或 'month'");
            }
            calendar.add(2, 1);
        }
        return calendar.getTimeInMillis();
    }

    @igg({"Range"})
    public static int checkAndAddCalendarAccount(Context context) {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                C2473f.m4168e(f65060a, "存在现有账户");
                cursorQuery.moveToFirst();
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                cursorQuery.close();
                return i;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            C2473f.m4168e(f65060a, "没有现有账户，尝试添加一个新账户");
            TimeZone timeZone = TimeZone.getDefault();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", f65061b);
            contentValues.put("account_name", f65062c);
            contentValues.put("account_type", f65063d);
            contentValues.put("calendar_displayName", f65064e);
            contentValues.put("visible", (Integer) 1);
            contentValues.put("calendar_color", (Integer) (-16776961));
            contentValues.put("calendar_access_level", (Integer) 700);
            contentValues.put("sync_events", (Integer) 1);
            contentValues.put("calendar_timezone", timeZone.getID());
            contentValues.put("ownerAccount", f65062c);
            contentValues.put("canOrganizerRespond", (Integer) 0);
            Uri uriInsert = context.getContentResolver().insert(Uri.parse("content://com.android.calendar/calendars").buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", f65062c).appendQueryParameter("account_type", f65063d).build(), contentValues);
            if (uriInsert != null) {
                ContentUris.parseId(uriInsert);
            }
            return checkAndAddCalendarAccount(context);
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static String convertTimestampToOnlyHour(long timestamp) {
        try {
            return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(timestamp));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String convertTimestampToString(long timestamp) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(timestamp));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String convertTimestampToStringNoHour(long timestamp) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(timestamp));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long convertToTimestamp(String dateTimeString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(dateTimeString).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static String convertToTimestampMonAndDay(long timestamp, String mon, String day) {
        try {
            return new SimpleDateFormat("MM'" + mon + "'dd'" + day + "' HH:mm", Locale.getDefault()).format(new Date(timestamp));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void deleteCalendarEventById(Context context, long eventId) {
        if (context.getContentResolver().delete(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, eventId), null, null) > 0) {
            C2473f.m4168e(f65060a, "日历事件删除成功, eventId: " + eventId);
            return;
        }
        C2473f.m4168e(f65060a, "未找到对应的事件, eventId: " + eventId);
    }
}
