package com.eyevue.glassapp.utils.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import com.eyevue.common.C2531R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p000.p43;

/* JADX INFO: loaded from: classes4.dex */
public class ImageUtils {
    private static final String TAG = "ImageUtils";

    /* JADX WARN: Removed duplicated region for block: B:38:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean copyFileFromResource(android.content.Context r3, int r4, java.io.File r5) {
        /*
            r0 = 0
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.io.IOException -> L2a
            java.io.InputStream r3 = r3.openRawResource(r4)     // Catch: java.io.IOException -> L2a
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L1d
        L12:
            int r1 = r3.read(r5)     // Catch: java.lang.Throwable -> L1d
            r2 = -1
            if (r1 == r2) goto L1f
            r4.write(r5, r0, r1)     // Catch: java.lang.Throwable -> L1d
            goto L12
        L1d:
            r5 = move-exception
            goto L2e
        L1f:
            r4.flush()     // Catch: java.lang.Throwable -> L1d
            r4.close()     // Catch: java.lang.Throwable -> L2c
            r3.close()     // Catch: java.io.IOException -> L2a
            r3 = 1
            return r3
        L2a:
            r3 = move-exception
            goto L42
        L2c:
            r4 = move-exception
            goto L37
        L2e:
            r4.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L2c
        L36:
            throw r5     // Catch: java.lang.Throwable -> L2c
        L37:
            if (r3 == 0) goto L41
            r3.close()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.io.IOException -> L2a
        L41:
            throw r4     // Catch: java.io.IOException -> L2a
        L42:
            java.lang.String r4 = "ImageUtils"
            java.lang.String r5 = "Error copying file"
            android.util.Log.e(r4, r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.utils.photo.ImageUtils.copyFileFromResource(android.content.Context, int, java.io.File):boolean");
    }

    private static void copyFilesFromResources(Context context, int[] resIds, String prefix, String extension) {
        File mediaDirectory = FileUtils.getMediaDirectory(context);
        if (!mediaDirectory.exists()) {
            mediaDirectory.mkdirs();
        }
        for (int i : resIds) {
            String str = prefix + p43.f69617m + i + extension;
            File file = new File(mediaDirectory, str);
            if (file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Media file already exists: ");
                sb.append(str);
            } else if (copyFileFromResource(context, i, file)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successfully copied: ");
                sb2.append(str);
            } else {
                Log.e(TAG, "Failed to copy: " + str);
            }
        }
    }

    public static void copyMediaFromAssetsToPrivateStorage(Context context) {
        copyFilesFromResources(context, new int[]{C2531R.drawable.image1, C2531R.drawable.image2, C2531R.drawable.image3, C2531R.drawable.image4, C2531R.drawable.image5}, "images", ".jpg");
    }

    public static String encodeImageToBase64(byte[] imageBytes) {
        if (imageBytes == null || imageBytes.length == 0) {
            return null;
        }
        return Base64.encodeToString(imageBytes, 2);
    }

    public static Bitmap getBitmapFromResource(Context context, int resId) {
        return BitmapFactory.decodeResource(context.getResources(), resId);
    }

    public static boolean saveBitmapToPrivateStorage(Context context, Bitmap bitmap, String fileName) {
        File mediaDirectory = FileUtils.getMediaDirectory(context);
        if (!mediaDirectory.exists()) {
            mediaDirectory.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(mediaDirectory, fileName));
            try {
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return zCompress;
            } finally {
            }
        } catch (IOException e) {
            Log.e(TAG, "Error saving bitmap", e);
            return false;
        }
    }

    public static String saveByteToJpegFile(Context context, ByteArrayOutputStream byteArrayOutputStream, String fileName) {
        File mediaDirectory = FileUtils.getMediaDirectory(context);
        if (!mediaDirectory.exists()) {
            mediaDirectory.mkdirs();
        }
        File file = new File(mediaDirectory, fileName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }

    public static String saveImage(Context context, byte[] imageBytes, String fileName) {
        if (imageBytes == null) {
            return null;
        }
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, fileName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(imageBytes);
                String absolutePath = file2.getAbsolutePath();
                fileOutputStream.close();
                return absolutePath;
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
