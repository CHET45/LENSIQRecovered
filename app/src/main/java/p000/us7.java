package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class us7 {

    /* JADX INFO: renamed from: a */
    public static final int f89027a = 262144;

    /* JADX INFO: renamed from: b */
    public static final int f89028b = 30;

    /* JADX INFO: renamed from: c */
    public static final int f89029c = 4096;

    /* JADX INFO: renamed from: d */
    public static final float f89030d = 3.0f;

    private static void adjustDimensions(int i, int i2) {
        if (i > i2) {
            Math.min(i, (int) (i2 * 3.0f));
        } else {
            Math.min(i2, (int) (i * 3.0f));
        }
    }

    private static int calculateSampleSize(int i, int i2) {
        int i3 = 1;
        while (true) {
            if (i <= 4096 && i2 <= 4096) {
                break;
            }
            i /= 2;
            i2 /= 2;
            i3 *= 2;
        }
        while (Math.min(i, i2) < 30) {
            i *= 2;
            i2 *= 2;
            i3 /= 2;
        }
        return Math.max(1, i3);
    }

    private static boolean checkAspectRatio(int i, int i2) {
        return ((float) Math.max(i, i2)) / ((float) Math.min(i, i2)) <= 3.0f;
    }

    public static File compressImage(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (!checkAspectRatio(i, i2)) {
                adjustDimensions(i, i2);
            }
            int iCalculateSampleSize = calculateSampleSize(i, i2);
            options.inJustDecodeBounds = false;
            options.inSampleSize = iCalculateSampleSize;
            return saveCompressedImage(resizeBitmap(BitmapFactory.decodeFile(file.getAbsolutePath(), options)), file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] inputStream2ByteArr(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    inputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Bitmap resizeBitmap(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 4096 && height <= 4096 && Math.min(width, height) >= 30) {
            return bitmap;
        }
        float fMin = width > height ? Math.min(4096.0f / width, 4096.0f / height) : Math.min(4096.0f / height, 4096.0f / width);
        Matrix matrix = new Matrix();
        matrix.postScale(fMin, fMin);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void rotateImageView(int i, String str) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmapCreateBitmap.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static File saveCompressedImage(Bitmap bitmap, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        File file2 = new File(file.getParent() + pj4.f71071b + xt5.getFileNameNoExtension(file) + "Compressed.jpg");
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable th2) {
            fileOutputStream = fileOutputStream2;
            th = th2;
        }
        try {
            int i = 100;
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            while (true) {
                fileOutputStream2 = fileOutputStream;
                if (file2.length() <= 262144 || i <= 10) {
                    break;
                }
                fileOutputStream2.close();
                fileOutputStream = new FileOutputStream(file2);
                i -= 10;
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            }
            fileOutputStream2.close();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return file2;
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public static File saveImage(Bitmap bitmap, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public static File compressImage(byte[] bArr, File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (!checkAspectRatio(i, i2)) {
                adjustDimensions(i, i2);
            }
            int iCalculateSampleSize = calculateSampleSize(i, i2);
            options.inJustDecodeBounds = false;
            options.inSampleSize = iCalculateSampleSize;
            return saveCompressedImage(resizeBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options)), file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
