package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "StringUtil")
@p7e({p7e.EnumC10826a.f69936c})
public final class k8g {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public static final String[] f52810a = new String[0];

    public static final void appendPlaceholders(@yfb StringBuilder sb, int i) {
        md8.checkNotNullParameter(sb, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    @gib
    public static final String joinIntoString(@gib List<Integer> list) {
        if (list != null) {
            return v82.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @yfb
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    @gib
    public static final List<Integer> splitToIntList(@gib String str) {
        List listSplit$default;
        Integer numValueOf;
        if (str == null || (listSplit$default = m9g.split$default((CharSequence) str, new char[]{C4584d2.f28238g}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException e) {
                Log.e(tae.f84090b, "Malformed integer list", e);
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
