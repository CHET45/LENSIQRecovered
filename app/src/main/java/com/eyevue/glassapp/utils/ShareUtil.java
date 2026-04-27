package com.eyevue.glassapp.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.watchfun.voicenotes.CommonWebViewActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.dwf;
import p000.e0g;
import p000.m82;
import p000.md8;
import p000.mu5;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nShareUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareUtil.kt\ncom/eyevue/glassapp/utils/ShareUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1557#2:118\n1628#2,3:119\n1863#2,2:122\n*S KotlinDebug\n*F\n+ 1 ShareUtil.kt\ncom/eyevue/glassapp/utils/ShareUtil\n*L\n45#1:118\n45#1:119,3\n56#1:122,2\n*E\n"})
@e0g(parameters = 1)
public final class ShareUtil {
    public static final int $stable = 0;

    @yfb
    public static final ShareUtil INSTANCE = new ShareUtil();

    private ShareUtil() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getMimeType(java.lang.String r3) {
        /*
            r2 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "getDefault(...)"
            p000.md8.checkNotNullExpressionValue(r0, r1)
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            p000.md8.checkNotNullExpressionValue(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case 52316: goto L75;
                case 96980: goto L69;
                case 102340: goto L5d;
                case 105441: goto L51;
                case 106479: goto L45;
                case 108184: goto L39;
                case 108273: goto L30;
                case 111145: goto L24;
                case 3268712: goto L1b;
                default: goto L19;
            }
        L19:
            goto L7d
        L1b:
            java.lang.String r0 = "jpeg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5a
            goto L7d
        L24:
            java.lang.String r0 = "png"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2d
            goto L7d
        L2d:
            java.lang.String r3 = "image/png"
            goto L82
        L30:
            java.lang.String r0 = "mp4"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4e
            goto L7d
        L39:
            java.lang.String r0 = "mkv"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto L7d
        L42:
            java.lang.String r3 = "video/x-matroska"
            goto L82
        L45:
            java.lang.String r0 = "m4v"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4e
            goto L7d
        L4e:
            java.lang.String r3 = "video/mp4"
            goto L82
        L51:
            java.lang.String r0 = "jpg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5a
            goto L7d
        L5a:
            java.lang.String r3 = "image/jpeg"
            goto L82
        L5d:
            java.lang.String r0 = "gif"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L66
            goto L7d
        L66:
            java.lang.String r3 = "image/gif"
            goto L82
        L69:
            java.lang.String r0 = "avi"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L72
            goto L7d
        L72:
            java.lang.String r3 = "video/x-msvideo"
            goto L82
        L75:
            java.lang.String r0 = "3gp"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L80
        L7d:
        */
        //  java.lang.String r3 = "*/*"
        /*
            goto L82
        L80:
            java.lang.String r3 = "video/3gpp"
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.utils.ShareUtil.getMimeType(java.lang.String):java.lang.String");
    }

    private final Uri getUriForFile(Context context, File file) {
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
        md8.checkNotNull(uriForFile);
        return uriForFile;
    }

    public static /* synthetic */ void shareFile$default(ShareUtil shareUtil, Context context, File file, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "分享";
        }
        shareUtil.shareFile(context, file, str);
    }

    public static /* synthetic */ void shareMedia$default(ShareUtil shareUtil, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "分享";
        }
        shareUtil.shareMedia(context, str, str2);
    }

    public static /* synthetic */ void shareMultipleFiles$default(ShareUtil shareUtil, Context context, List list, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "分享";
        }
        shareUtil.shareMultipleFiles(context, list, str);
    }

    public static /* synthetic */ void shareMultipleMedia$default(ShareUtil shareUtil, Context context, List list, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "分享";
        }
        shareUtil.shareMultipleMedia(context, list, str);
    }

    public static /* synthetic */ void shareText$default(ShareUtil shareUtil, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "分享";
        }
        shareUtil.shareText(context, str, str2);
    }

    public final void shareFile(@yfb Context context, @yfb File file, @yfb String str) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(file, "file");
        md8.checkNotNullParameter(str, CommonWebViewActivity.f26185L);
        Uri uriForFile = getUriForFile(context, file);
        String mimeType = getMimeType(mu5.getExtension(file));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(mimeType);
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        context.startActivity(Intent.createChooser(intent, str));
    }

    public final void shareMedia(@yfb Context context, @yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "filePath");
        md8.checkNotNullParameter(str2, CommonWebViewActivity.f26185L);
        shareFile(context, new File(str), str2);
    }

    public final void shareMultipleFiles(@yfb Context context, @yfb List<? extends File> list, @yfb String str) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(list, "files");
        md8.checkNotNullParameter(str, CommonWebViewActivity.f26185L);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        String mimeType = "*/*";
        for (File file : list) {
            ShareUtil shareUtil = INSTANCE;
            arrayList.add(shareUtil.getUriForFile(context, file));
            if (md8.areEqual(mimeType, "*/*")) {
                mimeType = shareUtil.getMimeType(mu5.getExtension(file));
            }
        }
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType(mimeType);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        intent.addFlags(1);
        context.startActivity(Intent.createChooser(intent, str));
    }

    public final void shareMultipleMedia(@yfb Context context, @yfb List<String> list, @yfb String str) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(list, "filePaths");
        md8.checkNotNullParameter(str, CommonWebViewActivity.f26185L);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((String) it.next()));
        }
        shareMultipleFiles(context, arrayList, str);
    }

    public final void shareText(@yfb Context context, @yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "text");
        md8.checkNotNullParameter(str2, CommonWebViewActivity.f26185L);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        context.startActivity(Intent.createChooser(intent, str2));
    }
}
