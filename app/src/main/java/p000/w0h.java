package p000;

import com.blankj.utilcode.util.C2473f;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class w0h {
    public static long Date2ms(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String dateTosStamp(String str) throws ParseException {
        return String.valueOf(new SimpleDateFormat("ss").parse(str).getTime());
    }

    public static int[] getTime() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        int[] iArr = {i, i2, i3, i4, i5};
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(pj4.f71071b);
        sb.append(i2 + 1);
        sb.append(pj4.f71071b);
        sb.append(i3);
        sb.append(C2473f.f17566z);
        sb.append(i4);
        sb.append(g1i.f38277c);
        sb.append(i5);
        sb.append(g1i.f38277c);
        sb.append(i6);
        return iArr;
    }

    public static String getTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String stampToDate(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    public static String stampToMinute(long j) {
        return new SimpleDateFormat("mm").format(new Date(j));
    }

    public String dateToStamp(String str) throws ParseException {
        return String.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str).getTime());
    }
}
