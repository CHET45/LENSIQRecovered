package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class oba {

    /* JADX INFO: renamed from: oba$a */
    @c5e(28)
    public static class C10289a {
        private C10289a() {
        }

        /* JADX INFO: renamed from: a */
        public static CharSequence m18552a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = it.next().toLanguageTag();
                i++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private oba() {
    }

    @hib
    public static CharSequence getBestNameForService(@efb Context context, @efb ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C10289a.m18552a(context, serviceInfo);
        }
        return null;
    }
}
