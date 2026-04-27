package p000;

import android.content.Context;
import com.watchfun.transcommon.bean.TransLanguageData;
import java.util.Iterator;
import java.util.List;
import p000.ymh;

/* JADX INFO: renamed from: rk */
/* JADX INFO: loaded from: classes7.dex */
public class C12124rk {
    public static String getValue(Context context, List<TransLanguageData> list) {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator<TransLanguageData> it = list.iterator();
            while (it.hasNext()) {
                int identifier = context.getResources().getIdentifier(it.next().getKeyName(), ymh.InterfaceC15723b.f102127e, context.getPackageName());
                sb.append(identifier != 0 ? context.getString(identifier) : "");
                sb.append(" & ");
            }
            if (sb.length() > 0 && (iLastIndexOf = sb.lastIndexOf(" & ")) != -1) {
                sb.delete(iLastIndexOf, sb.length());
            }
        }
        return sb.toString();
    }
}
