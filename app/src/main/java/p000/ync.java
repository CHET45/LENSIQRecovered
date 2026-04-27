package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ync {

    /* JADX INFO: renamed from: a */
    @efb
    public static final doc f102350a;

    static {
        if (C5487ew.m10311g()) {
            f102350a = new qoc();
            return;
        }
        if (C5487ew.m10310f()) {
            f102350a = new poc();
            return;
        }
        if (C5487ew.m10309e()) {
            f102350a = new ooc();
            return;
        }
        if (C5487ew.m10308d()) {
            f102350a = new noc();
            return;
        }
        if (C5487ew.m10307c()) {
            f102350a = new loc();
            return;
        }
        if (C5487ew.m10322r()) {
            f102350a = new koc();
            return;
        }
        if (C5487ew.m10321q()) {
            f102350a = new joc();
            return;
        }
        if (C5487ew.m10318n()) {
            f102350a = new ioc();
            return;
        }
        if (C5487ew.m10316l()) {
            f102350a = new hoc();
            return;
        }
        if (C5487ew.m10315k()) {
            f102350a = new goc();
        } else if (C5487ew.m10314j()) {
            f102350a = new foc();
        } else {
            f102350a = new eoc();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m26227a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (m26238l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m26228b(@efb Context context, @efb List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (!m26236j(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m26229c(@efb List<String> list, @efb int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m26230d(@efb Context context, @efb List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (m26236j(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m26231e(@efb List<String> list, @efb int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 0) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static Intent m26232f(@efb Context context, @efb String str) {
        return f102350a.getPermissionIntent(context, str);
    }

    /* JADX INFO: renamed from: g */
    public static int m26233g(@efb Context context, @efb String str) {
        return m26236j(context, str) ? 0 : -1;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m26234h(@efb Activity activity, @efb String str) {
        return f102350a.isDoNotAskAgainPermission(activity, str);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m26235i(@efb Activity activity, @efb List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (m26234h(activity, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m26236j(@efb Context context, @efb String str) {
        return f102350a.isGrantedPermission(context, str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m26237k(@efb Context context, @efb List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!m26236j(context, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m26238l(@efb String str) {
        return xnc.m25337e(str);
    }
}
