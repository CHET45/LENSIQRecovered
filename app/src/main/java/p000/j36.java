package p000;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import com.blankj.utilcode.util.C2479l;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class j36 {

    /* JADX INFO: renamed from: a */
    public static Camera f49485a;

    /* JADX INFO: renamed from: b */
    public static SurfaceTexture f49486b;

    private j36() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void destroy() {
        Camera camera = f49485a;
        if (camera == null) {
            return;
        }
        camera.release();
        f49486b = null;
        f49485a = null;
    }

    private static boolean init() {
        if (f49485a == null) {
            try {
                f49485a = Camera.open(0);
                f49486b = new SurfaceTexture(0);
            } catch (Throwable th) {
                Log.e("FlashlightUtils", "init failed: ", th);
                return false;
            }
        }
        if (f49485a != null) {
            return true;
        }
        Log.e("FlashlightUtils", "init failed.");
        return false;
    }

    public static boolean isFlashlightEnable() {
        return C2479l.getApp().getPackageManager().hasSystemFeature("android.hardware.camera.flash");
    }

    public static boolean isFlashlightOn() {
        if (init()) {
            return "torch".equals(f49485a.getParameters().getFlashMode());
        }
        return false;
    }

    public static void setFlashlightStatus(boolean z) {
        if (init()) {
            Camera.Parameters parameters = f49485a.getParameters();
            if (!z) {
                if (bk3.f13924e.equals(parameters.getFlashMode())) {
                    return;
                }
                parameters.setFlashMode(bk3.f13924e);
                f49485a.setParameters(parameters);
                return;
            }
            if ("torch".equals(parameters.getFlashMode())) {
                return;
            }
            try {
                f49485a.setPreviewTexture(f49486b);
                f49485a.startPreview();
                parameters.setFlashMode("torch");
                f49485a.setParameters(parameters);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
