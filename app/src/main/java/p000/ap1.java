package p000;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class ap1 {

    /* JADX INFO: renamed from: a */
    public static final int f11474a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f11475b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f11476c = 153600;

    /* JADX INFO: renamed from: d */
    public static final double f11477d = 0.15d;

    /* JADX INFO: renamed from: e */
    public static final String f11478e = "CameraHelper";

    /* JADX INFO: renamed from: ap1$a */
    public class C1537a implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        public int compare(Camera.Size size, Camera.Size size2) {
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Log.w(f11478e, "Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList<Camera.Size> arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new C1537a());
        if (Log.isLoggable(f11478e, 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size : arrayList) {
                sb.append(size.width);
                sb.append('x');
                sb.append(size.height);
                sb.append(' ');
            }
            Log.i(f11478e, "Supported preview sizes: " + ((Object) sb));
        }
        int i = point.x;
        int i2 = point.y;
        double d = i > i2 ? ((double) i) / ((double) i2) : ((double) i2) / ((double) i);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Camera.Size size2 = (Camera.Size) arrayList.get(0);
                    Point point2 = new Point(size2.width, size2.height);
                    Log.i(f11478e, "Using largest suitable preview size: " + point2);
                    return point2;
                }
                Camera.Size previewSize2 = parameters.getPreviewSize();
                if (previewSize2 == null) {
                    throw new IllegalStateException("Parameters contained no preview size!");
                }
                Point point3 = new Point(previewSize2.width, previewSize2.height);
                Log.i(f11478e, "No suitable preview sizes, using default: " + point3);
                return point3;
            }
            Camera.Size size3 = (Camera.Size) it.next();
            int i3 = size3.width;
            int i4 = size3.height;
            if (i3 * i4 < 153600) {
                it.remove();
            } else {
                boolean z = i3 < i4;
                int i5 = z ? i4 : i3;
                int i6 = z ? i3 : i4;
                if (Math.abs((((double) i5) / ((double) i6)) - d) > 0.15d) {
                    it.remove();
                } else if (i5 == point.x && i6 == point.y) {
                    Point point4 = new Point(i3, i4);
                    Log.i(f11478e, "Found preview size exactly matching screen size: " + point4);
                    return point4;
                }
            }
        }
    }

    public static Camera getDefaultBackFacingCameraInstance() {
        return getDefaultCamera(0);
    }

    @omg(9)
    private static Camera getDefaultCamera(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return Camera.open(i2);
            }
        }
        return null;
    }

    public static Camera getDefaultCameraInstance() {
        return Camera.open();
    }

    public static Camera getDefaultFrontFacingCameraInstance() {
        return getDefaultCamera(1);
    }

    public static Camera.Size getOptimalVideoSize(List<Camera.Size> list, List<Camera.Size> list2, int i, int i2) {
        double d = ((double) i) / ((double) i2);
        if (list == null) {
            list = list2;
        }
        double dAbs = Double.MAX_VALUE;
        Camera.Size size = null;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d) <= 0.1d && Math.abs(size2.height - i2) < dAbs2 && list2.contains(size2)) {
                dAbs2 = Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - i2) < dAbs && list2.contains(size3)) {
                    size = size3;
                    dAbs = Math.abs(size3.height - i2);
                }
            }
        }
        return size;
    }

    public static File getOutputMediaFile(int i) {
        if (!Environment.getExternalStorageState().equalsIgnoreCase("mounted")) {
            return null;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "CameraSample");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        if (i == 1) {
            return new File(file.getPath() + File.separator + "IMG_" + str + ".jpg");
        }
        if (i != 2) {
            return null;
        }
        return new File(file.getPath() + File.separator + "VID_" + str + ".mp4");
    }
}
