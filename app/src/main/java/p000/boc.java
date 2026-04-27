package p000;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C11673qt;

/* JADX INFO: loaded from: classes5.dex */
public final class boc {
    /* JADX INFO: renamed from: a */
    public static boolean m3268a(@hib Activity activity, boolean z) {
        if (activity == null) {
            if (z) {
                throw new IllegalArgumentException("The instance of the context must be an activity object");
            }
            return false;
        }
        if (activity.isFinishing()) {
            if (z) {
                throw new IllegalStateException("The activity has been finishing, please manually determine the status of the activity");
            }
            return false;
        }
        if (!C5487ew.m10313i() || !activity.isDestroyed()) {
            return true;
        }
        if (z) {
            throw new IllegalStateException("The activity has been destroyed, please manually determine the status of the activity");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m3269b(@efb List<String> list) {
        if (qpc.m20483g(list, xnc.f98620q)) {
            if (qpc.m20483g(list, xnc.f98620q) && !qpc.m20483g(list, xnc.f98597V)) {
                throw new IllegalArgumentException("Applying for background sensor permissions must contain android.permission.BODY_SENSORS");
            }
            for (String str : list) {
                if (qpc.m20485i(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_BACKGROUND_LOCATION at the same time is not supported");
                }
                if (qpc.m20485i(str, xnc.f98629z)) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_MEDIA_LOCATION at the same time is not supported");
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3270c(@efb List<String> list) {
        if (qpc.m20483g(list, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (qpc.m20483g(list, xnc.f98584I) && !qpc.m20483g(list, xnc.f98583H)) {
                throw new IllegalArgumentException("Applying for background positioning permissions must include android.permission.ACCESS_FINE_LOCATION");
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!qpc.m20484h(new String[]{xnc.f98583H, xnc.f98584I, "android.permission.ACCESS_BACKGROUND_LOCATION"}, it.next())) {
                    throw new IllegalArgumentException("Because it includes background location permissions, do not apply for permissions unrelated to location");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3271d(@efb List<C11673qt.c> list, String str) {
        m3272e(list, str, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: e */
    public static void m3272e(@efb List<C11673qt.c> list, String str, int i) {
        C11673qt.c next;
        String str2;
        Iterator<C11673qt.c> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (TextUtils.equals(next.f75569a, str)) {
                    break;
                }
            }
        }
        if (next == null) {
            throw new IllegalStateException("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"" + str + "\" />");
        }
        int i2 = next.f75570b;
        if (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append("The AndroidManifest.xml file <uses-permission android:name=\"");
            sb.append(str);
            sb.append("\" android:maxSdkVersion=\"");
            sb.append(i2);
            sb.append("\" /> does not meet the requirements, ");
            if (i != Integer.MAX_VALUE) {
                str2 = "the minimum requirement for maxSdkVersion is " + i;
            } else {
                str2 = "please delete the android:maxSdkVersion=\"" + i2 + "\" attribute";
            }
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3273f(@efb Context context, @efb List<String> list, @hib C11673qt c11673qt) {
        int i;
        if (c11673qt == null) {
            return;
        }
        List<C11673qt.c> list2 = c11673qt.f75560c;
        if (list2.isEmpty()) {
            throw new IllegalStateException("No permissions are registered in the AndroidManifest.xml file");
        }
        if (C5487ew.m10319o()) {
            i = context.getApplicationInfo().minSdkVersion;
        } else {
            C11673qt.e eVar = c11673qt.f75559b;
            i = eVar != null ? eVar.f75574a : 14;
        }
        for (String str : list) {
            if (xnc.m25336d(str)) {
                m3271d(list2, str);
                if (qpc.m20485i(str, xnc.f98620q)) {
                    m3271d(list2, xnc.f98597V);
                } else if (qpc.m20485i(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    if (C5487ew.m10306b(context) >= 31) {
                        m3272e(list2, xnc.f98583H, 30);
                        m3271d(list2, xnc.f98584I);
                    } else {
                        m3271d(list2, xnc.f98583H);
                    }
                } else if (qpc.m20485i(str, xnc.f98602a)) {
                    m3271d(list2, "android.permission.QUERY_ALL_PACKAGES");
                } else {
                    if (i >= xnc.m25334b(str)) {
                        return;
                    }
                    if (qpc.m20484h(new String[]{xnc.f98621r, xnc.f98622s, xnc.f98623t}, str)) {
                        m3272e(list2, xnc.f98579D, 32);
                    } else if (qpc.m20485i(str, xnc.f98619p)) {
                        m3272e(list2, xnc.f98583H, 32);
                    } else if (qpc.m20485i(str, xnc.f98624u)) {
                        m3272e(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                        m3272e(list2, xnc.f98583H, 30);
                    } else if (qpc.m20485i(str, xnc.f98625v)) {
                        m3272e(list2, "android.permission.BLUETOOTH", 30);
                    } else if (qpc.m20485i(str, xnc.f98626w)) {
                        m3272e(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                    } else if (qpc.m20485i(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                        m3272e(list2, xnc.f98579D, 29);
                        m3272e(list2, xnc.f98580E, 29);
                    } else if (qpc.m20485i(str, xnc.f98577B)) {
                        m3272e(list2, xnc.f98590O, 25);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3274g(@efb Context context, @efb List<String> list) {
        if (qpc.m20483g(list, xnc.f98629z)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!qpc.m20484h(new String[]{xnc.f98629z, xnc.f98621r, xnc.f98622s, xnc.f98579D, xnc.f98580E, "android.permission.MANAGE_EXTERNAL_STORAGE"}, it.next())) {
                    throw new IllegalArgumentException("Because it includes access media location permissions, do not apply for permissions unrelated to access media location");
                }
            }
            if (C5487ew.m10306b(context) < 33) {
                if (!qpc.m20483g(list, xnc.f98579D) && !qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    throw new IllegalArgumentException("You must add android.permission.READ_EXTERNAL_STORAGE or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
                }
            } else if (!qpc.m20483g(list, xnc.f98621r) && !qpc.m20483g(list, xnc.f98622s) && !qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                throw new IllegalArgumentException("You must add android.permission.READ_MEDIA_IMAGES or android.permission.READ_MEDIA_VIDEO or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m3275h(@efb List<String> list, @hib C11673qt c11673qt) {
        if ((!qpc.m20483g(list, xnc.f98624u) && !qpc.m20483g(list, xnc.f98619p)) || qpc.m20483g(list, xnc.f98583H) || c11673qt == null) {
            return;
        }
        for (C11673qt.c cVar : c11673qt.f75560c) {
            if (qpc.m20484h(new String[]{xnc.f98624u, xnc.f98619p}, cVar.f75569a) && !cVar.m20651a()) {
                String str = cVar.f75570b != Integer.MAX_VALUE ? "android:maxSdkVersion=\"" + cVar.f75570b + "\" " : "";
                throw new IllegalArgumentException("If your app doesn't use " + cVar.f75569a + " to get physical location, please change the <uses-permission android:name=\"" + cVar.f75569a + "\" " + str + "/> node in the manifest file to <uses-permission android:name=\"" + cVar.f75569a + "\" android:usesPermissionFlags=\"neverForLocation\" " + str + "/> node, if your app need use " + cVar.f75569a + " to get physical location, also need to add " + xnc.f98583H + " permissions");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m3276i(@efb List<String> list, @hib C11673qt c11673qt) {
        if (qpc.m20483g(list, xnc.f98614k) && c11673qt != null) {
            List<C11673qt.d> list2 = c11673qt.f75563f;
            for (int i = 0; i < list2.size(); i++) {
                if (TextUtils.equals(list2.get(i).f75573b, xnc.f98614k)) {
                    return;
                }
            }
            throw new IllegalArgumentException("No service registered permission attribute, please register <service android:permission=\"android.permission.BIND_NOTIFICATION_LISTENER_SERVICE\" > in AndroidManifest.xml");
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3277j(@hib List<String> list, boolean z) {
        if (list == null || list.isEmpty()) {
            if (z) {
                throw new IllegalArgumentException("The requested permission cannot be empty");
            }
            return false;
        }
        if (C5487ew.m10305a() <= 33 && z) {
            ArrayList arrayList = new ArrayList();
            Field[] declaredFields = xnc.class.getDeclaredFields();
            if (declaredFields.length == 0) {
                return true;
            }
            for (Field field : declaredFields) {
                if (String.class.equals(field.getType())) {
                    try {
                        arrayList.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (String str : list) {
                if (!qpc.m20483g(arrayList, str)) {
                    throw new IllegalArgumentException("The " + str + " is not a dangerous permission or special permission, please do not request dynamically");
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static void m3278k(@efb Activity activity, @efb List<String> list, @hib C11673qt c11673qt) {
        if (qpc.m20483g(list, xnc.f98608e) && c11673qt != null) {
            List<C11673qt.a> list2 = c11673qt.f75562e;
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).f75565b) {
                    return;
                }
            }
            throw new IllegalArgumentException("No activity registered supportsPictureInPicture attribute, please register \n<activity android:name=\"" + activity.getClass().getName().replace(activity.getPackageName(), "") + "\" android:supportsPictureInPicture=\"true\" > in AndroidManifest.xml");
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m3279l(@efb List<String> list) {
        if (qpc.m20483g(list, xnc.f98617n) && !qpc.m20483g(list, xnc.f98621r) && !qpc.m20483g(list, xnc.f98622s)) {
            throw new IllegalArgumentException("You cannot request the android.permission.READ_MEDIA_VISUAL_USER_SELECTED permission alone. must add either android.permission.READ_MEDIA_IMAGES or android.permission.READ_MEDIA_VIDEO permission, or maybe both");
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m3280m(@efb Context context, @efb List<String> list, @hib C11673qt c11673qt) {
        C11673qt.b bVar;
        if (qpc.m20483g(list, xnc.f98621r) || qpc.m20483g(list, xnc.f98622s) || qpc.m20483g(list, xnc.f98623t) || qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE") || qpc.m20483g(list, xnc.f98579D) || qpc.m20483g(list, xnc.f98580E)) {
            if (C5487ew.m10306b(context) >= 33 && qpc.m20483g(list, xnc.f98579D)) {
                throw new IllegalArgumentException("When targetSdkVersion >= 33 should use android.permission.READ_MEDIA_IMAGES, android.permission.READ_MEDIA_VIDEO, android.permission.READ_MEDIA_AUDIO, rather than android.permission.READ_EXTERNAL_STORAGE");
            }
            if (qpc.m20483g(list, xnc.f98621r) || qpc.m20483g(list, xnc.f98622s) || qpc.m20483g(list, xnc.f98623t)) {
                if (qpc.m20483g(list, xnc.f98579D)) {
                    throw new IllegalArgumentException("If you have applied for media permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions");
                }
                if (qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    throw new IllegalArgumentException("Because the MANAGE_EXTERNAL_STORAGE permission range is very large, you can read media files with it, and there is no need to apply for additional media permissions.");
                }
                return;
            }
            if (qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && (qpc.m20483g(list, xnc.f98579D) || qpc.m20483g(list, xnc.f98580E))) {
                throw new IllegalArgumentException("If you have applied for MANAGE_EXTERNAL_STORAGE permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions");
            }
            if (qpc.m20483g(list, xnc.f98629z) || c11673qt == null || (bVar = c11673qt.f75561d) == null) {
                return;
            }
            boolean zM20493q = qpc.m20493q(context);
            int iM10306b = C5487ew.m10306b(context);
            boolean z = bVar.f75567b;
            if (iM10306b >= 29 && !z && (qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE") || !zM20493q)) {
                throw new IllegalStateException("Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version");
            }
            if (iM10306b >= 30 && !qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && !zM20493q) {
                throw new IllegalArgumentException("The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use android.permission.MANAGE_EXTERNAL_STORAGE to apply for permission");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m3281n(@efb Context context, @efb List<String> list) {
        for (String str : list) {
            int iM25334b = qpc.m20485i(str, xnc.f98617n) ? 33 : qpc.m20484h(new String[]{xnc.f98624u, xnc.f98625v, xnc.f98626w}, str) ? 23 : xnc.m25334b(str);
            if (C5487ew.m10306b(context) < iM25334b) {
                throw new IllegalStateException("Request " + str + " permission, The targetSdkVersion SDK must be " + iM25334b + " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permission");
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m3282o(@efb List<String> list) {
        if (!C5487ew.m10310f()) {
            if (qpc.m20483g(list, xnc.f98618o) && !qpc.m20483g(list, xnc.f98616m)) {
                list.add(xnc.f98616m);
            }
            if (qpc.m20483g(list, xnc.f98619p) && !qpc.m20483g(list, xnc.f98583H)) {
                list.add(xnc.f98583H);
            }
            if ((qpc.m20483g(list, xnc.f98621r) || qpc.m20483g(list, xnc.f98622s) || qpc.m20483g(list, xnc.f98623t)) && !qpc.m20483g(list, xnc.f98579D)) {
                list.add(xnc.f98579D);
            }
        }
        if (!C5487ew.m10309e() && qpc.m20483g(list, xnc.f98624u) && !qpc.m20483g(list, xnc.f98583H)) {
            list.add(xnc.f98583H);
        }
        if (qpc.m20483g(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && !C5487ew.m10308d()) {
            if (!qpc.m20483g(list, xnc.f98579D)) {
                list.add(xnc.f98579D);
            }
            if (!qpc.m20483g(list, xnc.f98580E)) {
                list.add(xnc.f98580E);
            }
        }
        if (!C5487ew.m10307c() && qpc.m20483g(list, xnc.f98628y) && !qpc.m20483g(list, xnc.f98597V)) {
            list.add(xnc.f98597V);
        }
        if (C5487ew.m10321q() || !qpc.m20483g(list, xnc.f98577B) || qpc.m20483g(list, xnc.f98590O)) {
            return;
        }
        list.add(xnc.f98590O);
    }
}
