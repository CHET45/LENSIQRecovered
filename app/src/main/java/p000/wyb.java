package p000;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class wyb {

    /* JADX INFO: renamed from: a */
    public static final int f95706a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f95707b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f95708c = 2;

    /* JADX INFO: renamed from: d */
    public static final String f95709d = "base";

    /* JADX INFO: renamed from: e */
    public static final String f95710e = "cn";

    /* JADX INFO: renamed from: f */
    public static final String f95711f = "https://offline.watchfun.cn/resource/base.zip";

    /* JADX INFO: renamed from: g */
    public static final String f95712g = "https://offline.watchfun.cn/resource/language/";

    public static boolean checkCnResource() {
        List<vk4> allDownloadData = im4.getInstance().getAllDownloadData();
        String cnResourceUrl = getCnResourceUrl();
        boolean z = false;
        for (vk4 vk4Var : allDownloadData) {
            if (TextUtils.equals(vk4Var.getUrl(), cnResourceUrl) && vk4Var.getDownloadStatus() == zm4.SUCCESS) {
                z = true;
            }
        }
        return z;
    }

    public static boolean checkOfflineBaseResource() {
        boolean z = false;
        for (vk4 vk4Var : im4.getInstance().getAllDownloadData()) {
            if (TextUtils.equals(vk4Var.getUrl(), f95711f) && vk4Var.getDownloadStatus() == zm4.SUCCESS) {
                z = true;
            }
        }
        return z;
    }

    public static int checkOfflineResource(iyb offlineLanguageType) {
        if (offlineLanguageType == null) {
            return 0;
        }
        List<vk4> allDownloadData = im4.getInstance().getAllDownloadData();
        String str = f95712g + offlineLanguageType.getCode() + zyb.f106510h;
        boolean z = false;
        boolean z2 = false;
        for (vk4 vk4Var : allDownloadData) {
            if (TextUtils.equals(vk4Var.getUrl(), str)) {
                if (vk4Var.getDownloadStatus() == zm4.SUCCESS) {
                    z2 = true;
                }
            } else if (TextUtils.equals(vk4Var.getUrl(), f95711f) && vk4Var.getDownloadStatus() == zm4.SUCCESS) {
                z = true;
            }
        }
        if (z) {
            return (z2 && z) ? 1 : 0;
        }
        return 2;
    }

    public static String getCnResourceUrl() {
        return "https://offline.watchfun.cn/resource/language/cn.zip";
    }
}
