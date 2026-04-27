package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ti7 {
    public static String createFilePath(Context context, String... dirNames) {
        File externalFilesDir;
        if (context == null || dirNames == null || dirNames.length == 0 || (externalFilesDir = context.getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(externalFilesDir.getPath());
        int i = 0;
        if (sb.toString().endsWith(pj4.f71071b)) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(pj4.f71071b)));
        }
        int length = dirNames.length;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = dirNames[i];
            sb.append(pj4.f71071b);
            sb.append(str);
            File file = new File(sb.toString());
            if ((!file.exists() || file.isFile()) && !file.mkdir()) {
                Log.w("jieli", "create dir failed. filePath = " + ((Object) sb));
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public static Bitmap createScaleBitmap(String path, int targetWidth, int targetHeight) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path);
        if (bitmapDecodeFile == null) {
            return null;
        }
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        if (width == targetWidth && height == targetHeight) {
            return bitmapDecodeFile;
        }
        float fMin = Math.min((targetWidth * 1.0f) / width, (targetHeight * 1.0f) / height);
        Matrix matrix = new Matrix();
        matrix.postScale(fMin, fMin, 0.0f, 0.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(targetWidth, targetHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(1);
        canvas.drawBitmap(bitmapDecodeFile, matrix, paint);
        return bitmapCreateBitmap;
    }

    public static String getDeviceName(BluetoothDevice device) {
        if (device == null) {
            return null;
        }
        String name = device.getName();
        return name == null ? device.getAddress() : name;
    }

    public static String getFileNameByPath(String filePath) {
        if (filePath == null) {
            return null;
        }
        int iLastIndexOf = filePath.lastIndexOf(pj4.f71071b);
        return iLastIndexOf > -1 ? filePath.substring(iLastIndexOf + 1) : filePath;
    }

    public static String obtainUpdateFilePath(String dirPath, String suffix) {
        File[] fileArrListFiles;
        String strObtainUpdateFilePath = null;
        if (dirPath == null) {
            return null;
        }
        File file = new File(dirPath);
        if (!file.exists()) {
            return null;
        }
        if (file.isFile()) {
            if (dirPath.endsWith(suffix)) {
                return dirPath;
            }
            return null;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                strObtainUpdateFilePath = obtainUpdateFilePath(file2.getPath(), suffix);
                if (strObtainUpdateFilePath != null) {
                    break;
                }
            }
        }
        return strObtainUpdateFilePath;
    }
}
