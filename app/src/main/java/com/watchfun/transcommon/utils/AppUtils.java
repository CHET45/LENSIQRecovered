package com.watchfun.transcommon.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.google.gson.Gson;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p000.iy2;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class AppUtils {
    private static String DEFAULT_TIME_ZONE = "GMT+08:00";
    private static final String TAG = "AppUtils";
    private static int clickCount;

    public static String ShowDateMMToStr(long j) {
        if (j == 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(DEFAULT_TIME_ZONE));
        if ((j + "").length() == 10) {
            j *= 1000;
        }
        calendar.setTimeInMillis(j);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DEFAULT_TIME_ZONE));
        return simpleDateFormat.format(time);
    }

    public static String ShowDateMonthToStr(long j) {
        if (j == 0) {
            return "";
        }
        yi9.m26094i("群创建时间:", Long.valueOf(j));
        Calendar calendar = Calendar.getInstance();
        String str = j + "";
        if (str.length() == 10) {
            j *= 1000;
        }
        if (str.length() > 13) {
            j /= 1000;
        }
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static String getCollectTime(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getTextFromAssets(android.content.Context r3, java.lang.String r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 == 0) goto L49
            if (r4 != 0) goto L6
            goto L49
        L6:
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.io.InputStream r3 = r3.open(r4)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r3.read(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r3.close()     // Catch: java.io.IOException -> L22
            goto L26
        L22:
            r3 = move-exception
            r3.printStackTrace()
        L26:
            return r1
        L27:
            r4 = move-exception
            r0 = r3
            goto L3e
        L2a:
            r4 = move-exception
            goto L30
        L2c:
            r4 = move-exception
            goto L3e
        L2e:
            r4 = move-exception
            r3 = r0
        L30:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L3d
            r3.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r3 = move-exception
            r3.printStackTrace()
        L3d:
            return r0
        L3e:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r3 = move-exception
            r3.printStackTrace()
        L48:
            throw r4
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.watchfun.transcommon.utils.AppUtils.getTextFromAssets(android.content.Context, java.lang.String):java.lang.String");
    }

    public static TransLanguageData getTransLanguageData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (TransLanguageData) new Gson().fromJson(str, TransLanguageData.class);
    }

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static String secondsToHMS(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j);
        long seconds = j - TimeUnit.HOURS.toSeconds(hours);
        long minutes = timeUnit.toMinutes(seconds);
        return String.format("%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds - TimeUnit.MINUTES.toSeconds(minutes)));
    }

    public static void setupTextWatcher(EditText editText, final TextView textView, final boolean z, final int i, final int i2, final int i3, final int i4) {
        editText.addTextChangedListener(new TextWatcher() { // from class: com.watchfun.transcommon.utils.AppUtils.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                if (charSequence.length() > 0) {
                    textView.setEnabled(true);
                    if (!z) {
                        textView.setTextColor(iy2.getAppContext().getResources().getColor(i3));
                        return;
                    } else {
                        textView.setTextColor(iy2.getAppContext().getResources().getColor(i));
                        textView.setBackgroundResource(i2);
                        return;
                    }
                }
                textView.setEnabled(false);
                if (!z) {
                    textView.setTextColor(iy2.getAppContext().getResources().getColor(C4201R.color.gray_828282));
                } else {
                    textView.setTextColor(iy2.getAppContext().getResources().getColor(C4201R.color.white_8F8F8F));
                    textView.setBackgroundResource(i4);
                }
            }
        });
    }
}
