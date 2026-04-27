package com.eyevue.glassapp.utils.photo;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import cn.watchfun.stylefilter.WQStyleFilter;
import com.eyevue.glassapp.utils.photo.BatchOperationUtil;
import com.eyevue.glassapp.utils.photo.StyleFilterUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p000.bth;
import p000.qy6;
import p000.xrf;

/* JADX INFO: loaded from: classes4.dex */
public class BatchOperationUtil {

    /* JADX INFO: renamed from: com.eyevue.glassapp.utils.photo.BatchOperationUtil$1 */
    public class C26811 implements qy6<StyleFilterUtil.StyleFilterResult, bth> {
        final /* synthetic */ FileOperationCallback val$callback;
        final /* synthetic */ Context val$context;
        final /* synthetic */ boolean val$deleteAfterSave;
        final /* synthetic */ int[] val$deleteCount;
        final /* synthetic */ Uri val$mediaUri;
        final /* synthetic */ List val$messages;
        final /* synthetic */ int[] val$successCount;
        final /* synthetic */ ArrayList val$urisToProcess;
        final /* synthetic */ int[] val$waterMaskCount;

        public C26811(final Context val$context, final int[] val$successCount, final boolean val$deleteAfterSave, final Uri val$mediaUri, final int[] val$deleteCount, final int[] val$waterMaskCount, final ArrayList val$urisToProcess, final List val$messages, final FileOperationCallback val$callback) {
            this.val$context = val$context;
            this.val$successCount = val$successCount;
            this.val$deleteAfterSave = val$deleteAfterSave;
            this.val$mediaUri = val$mediaUri;
            this.val$deleteCount = val$deleteCount;
            this.val$waterMaskCount = val$waterMaskCount;
            this.val$urisToProcess = val$urisToProcess;
            this.val$messages = val$messages;
            this.val$callback = val$callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$invoke$0(int[] iArr, boolean z, int[] iArr2, List list, FileOperationCallback fileOperationCallback, ArrayList arrayList) {
            if (iArr[0] > 0) {
                String str = "已保存 " + iArr[0] + " 个媒体文件到相册";
                if (z && iArr2[0] > 0) {
                    str = str + "，并删除了 " + iArr2[0] + " 个私有媒体文件";
                }
                list.add(str);
            } else {
                list.add("媒体文件保存失败");
            }
            if (fileOperationCallback != null) {
                fileOperationCallback.onOperationComplete(iArr[0], arrayList.size(), list);
            }
        }

        @Override // p000.qy6
        public bth invoke(StyleFilterUtil.StyleFilterResult styleFilterResult) {
            if (styleFilterResult.getErrorCode() == 0) {
                if (FileUtils.saveMediaToAlbum(this.val$context, Uri.fromFile(new File(styleFilterResult.getOutputPath())))) {
                    int[] iArr = this.val$successCount;
                    iArr[0] = iArr[0] + 1;
                    if (this.val$deleteAfterSave && FileUtils.deleteMedia(this.val$mediaUri)) {
                        int[] iArr2 = this.val$deleteCount;
                        iArr2[0] = iArr2[0] + 1;
                    }
                }
            } else if (FileUtils.saveMediaToAlbum(this.val$context, this.val$mediaUri)) {
                int[] iArr3 = this.val$successCount;
                iArr3[0] = iArr3[0] + 1;
                if (this.val$deleteAfterSave && FileUtils.deleteMedia(this.val$mediaUri)) {
                    int[] iArr4 = this.val$deleteCount;
                    iArr4[0] = iArr4[0] + 1;
                }
            }
            int[] iArr5 = this.val$waterMaskCount;
            int i = iArr5[0] + 1;
            iArr5[0] = i;
            if (i != this.val$urisToProcess.size()) {
                return null;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final int[] iArr6 = this.val$successCount;
            final boolean z = this.val$deleteAfterSave;
            final int[] iArr7 = this.val$deleteCount;
            final List list = this.val$messages;
            final FileOperationCallback fileOperationCallback = this.val$callback;
            final ArrayList arrayList = this.val$urisToProcess;
            handler.post(new Runnable() { // from class: com.eyevue.glassapp.utils.photo.a
                @Override // java.lang.Runnable
                public final void run() {
                    BatchOperationUtil.C26811.lambda$invoke$0(iArr6, z, iArr7, list, fileOperationCallback, arrayList);
                }
            });
            return null;
        }
    }

    public static void deleteSelectedMedia(Context context, Set<Uri> selectedPositions, final ArrayList<Uri> mediaUris, final FileOperationCallback callback) {
        if (!selectedPositions.isEmpty()) {
            final int[] iArr = {0};
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList(selectedPositions);
            new Thread(new Runnable() { // from class: xw0
                @Override // java.lang.Runnable
                public final void run() {
                    BatchOperationUtil.lambda$deleteSelectedMedia$1(arrayList2, mediaUris, iArr, arrayList, callback);
                }
            }).start();
            return;
        }
        if (callback != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("请先选择要删除的媒体文件");
            callback.onOperationComplete(0, 0, arrayList3);
        }
    }

    private static File findFilterFile(Uri originalUri) {
        if (originalUri == null) {
            return null;
        }
        try {
            String absolutePath = new File(originalUri.getPath()).getAbsolutePath();
            if (absolutePath.contains("_filter")) {
                new File(absolutePath.replace("_filter", "")).delete();
                new File(absolutePath.replace("edit_", "").replace("_filter", "")).delete();
            }
            int iLastIndexOf = absolutePath.lastIndexOf(".");
            if (iLastIndexOf == -1) {
                File file = new File(absolutePath + "_filter");
                if (file.exists()) {
                    return file;
                }
                return null;
            }
            File file2 = new File(absolutePath.substring(0, iLastIndexOf) + "_filter" + absolutePath.substring(iLastIndexOf));
            if (file2.exists() && file2.isFile()) {
                return file2;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteSelectedMedia$0(int[] iArr, List list, FileOperationCallback fileOperationCallback, ArrayList arrayList) {
        if (iArr[0] > 0) {
            list.add("已删除 " + iArr[0] + " 个媒体文件");
        } else {
            list.add("媒体文件删除失败");
        }
        if (fileOperationCallback != null) {
            fileOperationCallback.onOperationComplete(iArr[0], arrayList.size(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteSelectedMedia$1(final ArrayList arrayList, ArrayList arrayList2, final int[] iArr, final List list, final FileOperationCallback fileOperationCallback) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Uri uri2 = (Uri) it2.next();
                File fileFindFilterFile = findFilterFile(uri);
                if (fileFindFilterFile != null) {
                    fileFindFilterFile.delete();
                }
                if (Objects.equals(uri.getPath(), uri2.getPath()) && FileUtils.deleteMedia(uri2)) {
                    iArr[0] = iArr[0] + 1;
                }
            }
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ww0
            @Override // java.lang.Runnable
            public final void run() {
                BatchOperationUtil.lambda$deleteSelectedMedia$0(iArr, list, fileOperationCallback, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteSelectedMedia$2(int[] iArr, List list, FileOperationCallback fileOperationCallback) {
        if (iArr[0] > 0) {
            list.add("已删除 " + iArr[0] + " 个媒体文件");
        } else {
            list.add("媒体文件删除失败");
        }
        if (fileOperationCallback != null) {
            fileOperationCallback.onOperationComplete(iArr[0], 1, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteSelectedMedia$3(Uri uri, final int[] iArr, final List list, final FileOperationCallback fileOperationCallback) {
        if (FileUtils.deleteMedia(uri)) {
            iArr[0] = iArr[0] + 1;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yw0
            @Override // java.lang.Runnable
            public final void run() {
                BatchOperationUtil.lambda$deleteSelectedMedia$2(iArr, list, fileOperationCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveSelectedMediaToAlbum$4(int[] iArr, boolean z, int[] iArr2, List list, FileOperationCallback fileOperationCallback, ArrayList arrayList) {
        if (iArr[0] > 0) {
            String str = "已保存 " + iArr[0] + " 个媒体文件到相册";
            if (z && iArr2[0] > 0) {
                str = str + "，并删除了 " + iArr2[0] + " 个私有媒体文件";
            }
            list.add(str);
        } else {
            list.add("媒体文件保存失败");
        }
        if (fileOperationCallback != null) {
            fileOperationCallback.onOperationComplete(iArr[0], arrayList.size(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveSelectedMediaToAlbum$5(final ArrayList arrayList, ArrayList arrayList2, Context context, final int[] iArr, final boolean z, final int[] iArr2, final List list, final FileOperationCallback fileOperationCallback) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Uri uri2 = (Uri) it2.next();
                if (Objects.equals(uri.getPath(), uri2.getPath()) && FileUtils.saveMediaToAlbum(context, uri2)) {
                    iArr[0] = iArr[0] + 1;
                    if (z && FileUtils.deleteMedia(uri2)) {
                        iArr2[0] = iArr2[0] + 1;
                    }
                }
            }
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: zw0
            @Override // java.lang.Runnable
            public final void run() {
                BatchOperationUtil.lambda$saveSelectedMediaToAlbum$4(iArr, z, iArr2, list, fileOperationCallback, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveSelectedMediaToAlbum$6(int[] iArr, boolean z, int[] iArr2, List list, FileOperationCallback fileOperationCallback) {
        if (iArr[0] > 0) {
            String str = "已保存 " + iArr[0] + " 个媒体文件到相册";
            if (z && iArr2[0] > 0) {
                str = str + "，并删除了 " + iArr2[0] + " 个私有媒体文件";
            }
            list.add(str);
        } else {
            list.add("媒体文件保存失败");
        }
        if (fileOperationCallback != null) {
            fileOperationCallback.onOperationComplete(iArr[0], 1, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveSelectedMediaToAlbum$7(Context context, Uri uri, final int[] iArr, final boolean z, final int[] iArr2, final List list, final FileOperationCallback fileOperationCallback) {
        if (FileUtils.saveMediaToAlbum(context, uri)) {
            iArr[0] = iArr[0] + 1;
            if (z && FileUtils.deleteMedia(uri)) {
                iArr2[0] = iArr2[0] + 1;
            }
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sw0
            @Override // java.lang.Runnable
            public final void run() {
                BatchOperationUtil.lambda$saveSelectedMediaToAlbum$6(iArr, z, iArr2, list, fileOperationCallback);
            }
        });
    }

    public static void saveSelectedMediaToAlbum(final Context context, Set<Uri> selectedPositions, final ArrayList<Uri> mediaUris, final boolean deleteAfterSave, final FileOperationCallback callback) {
        if (selectedPositions.isEmpty()) {
            if (callback != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("请先选择要保存的媒体文件");
                callback.onOperationComplete(0, 0, arrayList);
                return;
            }
            return;
        }
        final int[] iArr = {0};
        final int[] iArr2 = {0};
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList(selectedPositions);
        new Thread(new Runnable() { // from class: tw0
            @Override // java.lang.Runnable
            public final void run() {
                BatchOperationUtil.lambda$saveSelectedMediaToAlbum$5(arrayList3, mediaUris, context, iArr, deleteAfterSave, iArr2, arrayList2, callback);
            }
        }).start();
    }

    public static void saveSelectedMediaWithWaterMaskToAlbum(Context context, Set<Uri> selectedPositions, ArrayList<Uri> mediaUris, boolean deleteAfterSave, StyleFilterUtil waterMaskUtil, boolean isMaskOpen, FileOperationCallback callback) {
        if (isMaskOpen) {
            saveSelectedMediaWithWaterMaskToAlbum(context, selectedPositions, mediaUris, deleteAfterSave, waterMaskUtil, callback);
        } else {
            saveSelectedMediaToAlbum(context, selectedPositions, mediaUris, deleteAfterSave, callback);
        }
    }

    public static void saveSelectedMediaWithWaterMaskToAlbum(Context context, Set<Uri> selectedPositions, ArrayList<Uri> mediaUris, boolean deleteAfterSave, StyleFilterUtil waterMaskUtil, FileOperationCallback callback) {
        if (selectedPositions.isEmpty()) {
            if (callback != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("请先选择要保存的媒体文件");
                callback.onOperationComplete(0, 0, arrayList);
                return;
            }
            return;
        }
        int[] iArr = {0};
        int[] iArr2 = {0};
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Uri> arrayList3 = new ArrayList(selectedPositions);
        int[] iArr3 = {0};
        for (Uri uri : arrayList3) {
            for (Uri uri2 : mediaUris) {
                if (Objects.equals(uri.getPath(), uri2.getPath())) {
                    waterMaskUtil.applyWaterMask(uri2.getPath(), "ic_watermask.png", WQStyleFilter.WatermarkPosition.BOTTOM_CENTER, xrf.dp2px(4.0f), KtImageUtils.INSTANCE.calculateImageValue(context, uri2), new C26811(context, iArr, deleteAfterSave, uri2, iArr2, iArr3, arrayList3, arrayList2, callback));
                }
            }
        }
    }

    public static void deleteSelectedMedia(final Uri mediaUri, final FileOperationCallback callback) {
        if (mediaUri != null) {
            final int[] iArr = {0};
            final ArrayList arrayList = new ArrayList();
            new Thread(new Runnable() { // from class: vw0
                @Override // java.lang.Runnable
                public final void run() {
                    BatchOperationUtil.lambda$deleteSelectedMedia$3(mediaUri, iArr, arrayList, callback);
                }
            }).start();
        } else if (callback != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("请先选择要删除的媒体文件");
            callback.onOperationComplete(0, 0, arrayList2);
        }
    }

    public static void saveSelectedMediaToAlbum(final Context context, final Uri mediaUri, final boolean deleteAfterSave, final FileOperationCallback callback) {
        if (mediaUri != null) {
            final int[] iArr = {0};
            final int[] iArr2 = {0};
            final ArrayList arrayList = new ArrayList();
            new Thread(new Runnable() { // from class: uw0
                @Override // java.lang.Runnable
                public final void run() {
                    BatchOperationUtil.lambda$saveSelectedMediaToAlbum$7(context, mediaUri, iArr, deleteAfterSave, iArr2, arrayList, callback);
                }
            }).start();
            return;
        }
        if (callback != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("请先选择要保存的媒体文件");
            callback.onOperationComplete(0, 0, arrayList2);
        }
    }
}
