package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l98 {
    private l98() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @j5e(xnc.f98591P)
    public static Intent getCallIntent(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'phoneNumber' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        return getIntent(new Intent("android.intent.action.CALL", Uri.parse("tel:" + Uri.encode(str))), true);
    }

    public static Intent getCaptureIntent(Uri uri) {
        return getCaptureIntent(uri, false);
    }

    public static Intent getComponentIntent(String str, String str2) {
        return getComponentIntent(str, str2, null, false);
    }

    public static Intent getDialIntent(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'phoneNumber' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        return getIntent(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str))), true);
    }

    public static Intent getInstallAppIntent(String str) {
        return getInstallAppIntent(C2481n.m4258O(str));
    }

    private static Intent getIntent(Intent intent, boolean z) {
        return z ? intent.addFlags(268435456) : intent;
    }

    public static Intent getLaunchAppDetailsSettingsIntent(String str) {
        return getLaunchAppDetailsSettingsIntent(str, false);
    }

    public static Intent getLaunchAppIntent(String str) {
        String strM4278Y = C2481n.m4278Y(str);
        if (C2481n.m4235C0(strM4278Y)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClassName(str, strM4278Y);
        return intent.addFlags(268435456);
    }

    public static Intent getSendSmsIntent(@efb String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Argument 'phoneNumber' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + Uri.encode(str)));
        intent.putExtra("sms_body", str2);
        return getIntent(intent, true);
    }

    public static Intent getShareImageIntent(String str) {
        return getShareTextImageIntent("", str);
    }

    public static Intent getShareTextImageIntent(@hib String str, String str2) {
        return getShareTextImageIntent(str, C2481n.m4258O(str2));
    }

    public static Intent getShareTextIntent(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return getIntent(Intent.createChooser(intent, ""), true);
    }

    public static Intent getShutdownIntent() {
        Intent intent = new Intent("com.android.internal.intent.action.REQUEST_SHUTDOWN");
        intent.putExtra("android.intent.extra.KEY_CONFIRM", false);
        return intent.addFlags(268435456);
    }

    public static Intent getUninstallAppIntent(String str) {
        Intent intent = new Intent("android.intent.action.DELETE");
        intent.setData(Uri.parse("package:" + str));
        return intent.addFlags(268435456);
    }

    public static boolean isIntentAvailable(Intent intent) {
        return C2479l.getApp().getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static Intent getCaptureIntent(Uri uri, boolean z) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.addFlags(1);
        return getIntent(intent, z);
    }

    public static Intent getComponentIntent(String str, String str2, boolean z) {
        return getComponentIntent(str, str2, null, z);
    }

    public static Intent getInstallAppIntent(File file) {
        if (!C2481n.m4328t0(file)) {
            return null;
        }
        return getInstallAppIntent(FileProvider.getUriForFile(C2479l.getApp(), C2479l.getApp().getPackageName() + ".utilcode.fileprovider", file));
    }

    public static Intent getLaunchAppDetailsSettingsIntent(String str, boolean z) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        return getIntent(intent, z);
    }

    public static Intent getShareImageIntent(File file) {
        return getShareTextImageIntent("", file);
    }

    public static Intent getShareTextImageIntent(@hib String str, File file) {
        return getShareTextImageIntent(str, C2481n.m4232B(file));
    }

    public static Intent getComponentIntent(String str, String str2, Bundle bundle) {
        return getComponentIntent(str, str2, bundle, false);
    }

    public static Intent getShareImageIntent(Uri uri) {
        return getShareTextImageIntent("", uri);
    }

    public static Intent getShareTextImageIntent(@hib String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/*");
        return getIntent(Intent.createChooser(intent, ""), true);
    }

    public static Intent getComponentIntent(String str, String str2, Bundle bundle, boolean z) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        return getIntent(intent, z);
    }

    public static Intent getShareImageIntent(LinkedList<String> linkedList) {
        return getShareTextImageIntent("", linkedList);
    }

    public static Intent getShareImageIntent(List<File> list) {
        return getShareTextImageIntent("", list);
    }

    public static Intent getInstallAppIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.setFlags(1);
        return intent.addFlags(268435456);
    }

    public static Intent getShareImageIntent(ArrayList<Uri> arrayList) {
        return getShareTextImageIntent("", arrayList);
    }

    public static Intent getShareTextImageIntent(@hib String str, LinkedList<String> linkedList) {
        ArrayList arrayList = new ArrayList();
        if (linkedList != null) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                File fileM4258O = C2481n.m4258O(it.next());
                if (fileM4258O != null) {
                    arrayList.add(fileM4258O);
                }
            }
        }
        return getShareTextImageIntent(str, (List<File>) arrayList);
    }

    public static Intent getShareTextImageIntent(@hib String str, List<File> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                Uri uriM4232B = C2481n.m4232B(it.next());
                if (uriM4232B != null) {
                    arrayList.add(uriM4232B);
                }
            }
        }
        return getShareTextImageIntent(str, (ArrayList<Uri>) arrayList);
    }

    public static Intent getShareTextImageIntent(@hib String str, ArrayList<Uri> arrayList) {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        intent.setType("image/*");
        return getIntent(Intent.createChooser(intent, ""), true);
    }
}
