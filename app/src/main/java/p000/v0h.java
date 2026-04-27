package p000;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class v0h {

    /* JADX INFO: renamed from: c */
    public static final v0h f89635c = new v0h(null, null);

    /* JADX INFO: renamed from: a */
    @hib
    public final Long f89636a;

    /* JADX INFO: renamed from: b */
    @hib
    public final TimeZone f89637b;

    private v0h(@hib Long l, @hib TimeZone timeZone) {
        this.f89636a = l;
        this.f89637b = timeZone;
    }

    /* JADX INFO: renamed from: a */
    public static v0h m23664a(long j) {
        return new v0h(Long.valueOf(j), null);
    }

    /* JADX INFO: renamed from: b */
    public static v0h m23665b(long j, @hib TimeZone timeZone) {
        return new v0h(Long.valueOf(j), timeZone);
    }

    /* JADX INFO: renamed from: e */
    public static v0h m23666e() {
        return f89635c;
    }

    /* JADX INFO: renamed from: c */
    public Calendar m23667c() {
        return m23668d(this.f89637b);
    }

    /* JADX INFO: renamed from: d */
    public Calendar m23668d(@hib TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f89636a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
