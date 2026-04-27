package p000;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.appcompat.app.AppCompatActivity;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class mp1 implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: C */
    public InterfaceC9446i f61639C;

    /* JADX INFO: renamed from: F */
    public int f61640F;

    /* JADX INFO: renamed from: H */
    public int f61641H;

    /* JADX INFO: renamed from: M1 */
    public CamcorderProfile f61644M1;

    /* JADX INFO: renamed from: N */
    public int f61645N;

    /* JADX INFO: renamed from: Q */
    public MediaRecorder f61646Q;

    /* JADX INFO: renamed from: X */
    public int f61648X;

    /* JADX INFO: renamed from: Y */
    public int f61649Y;

    /* JADX INFO: renamed from: Z */
    public String f61650Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f61651Z1;

    /* JADX INFO: renamed from: a */
    public Camera f61652a;

    /* JADX INFO: renamed from: a2 */
    public byte[] f61653a2;

    /* JADX INFO: renamed from: b */
    public Camera.Parameters f61654b;

    /* JADX INFO: renamed from: c */
    public AppCompatActivity f61656c;

    /* JADX INFO: renamed from: d */
    public SurfaceView f61658d;

    /* JADX INFO: renamed from: e */
    public SurfaceHolder f61659e;

    /* JADX INFO: renamed from: m */
    public int f61661m;

    /* JADX INFO: renamed from: f */
    public int f61660f = 0;

    /* JADX INFO: renamed from: L */
    public int f61642L = 0;

    /* JADX INFO: renamed from: M */
    public File f61643M = null;

    /* JADX INFO: renamed from: V1 */
    public boolean f61647V1 = false;

    /* JADX INFO: renamed from: b2 */
    public SurfaceHolder.Callback f61655b2 = new SurfaceHolderCallbackC9441d();

    /* JADX INFO: renamed from: c2 */
    @igg({"HandlerLeak"})
    public Handler f61657c2 = new HandlerC9444g();

    /* JADX INFO: renamed from: mp1$a */
    public class C9438a implements Camera.ShutterCallback {
        public C9438a() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public void onShutter() {
        }
    }

    /* JADX INFO: renamed from: mp1$b */
    public class C9439b implements Camera.PictureCallback {
        public C9439b() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }

    /* JADX INFO: renamed from: mp1$c */
    public class C9440c implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f61664a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f61665b;

        public C9440c(boolean z, int i) {
            this.f61664a = z;
            this.f61665b = i;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (this.f61664a) {
                mp1.this.f61652a.startPreview();
            }
            mp1.this.f61639C.onTakePicture(bArr, camera);
            mp1.this.getPhotoPath(bArr, this.f61665b);
        }
    }

    /* JADX INFO: renamed from: mp1$d */
    public class SurfaceHolderCallbackC9441d implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC9441d() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C2473f.m4168e("sssd-宽", mp1.this.f61658d.getMeasuredWidth() + "*" + mp1.this.f61658d.getMeasuredHeight());
            if (mp1.this.f61652a == null) {
                mp1 mp1Var = mp1.this;
                mp1Var.openCamera(mp1Var.f61660f);
            }
            mp1.this.startPreview();
            mp1.this.getVideoSize();
            mp1.this.f61646Q = new MediaRecorder();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            mp1.this.releaseCamera();
        }
    }

    /* JADX INFO: renamed from: mp1$e */
    public class RunnableC9442e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f61668a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f61669b;

        public RunnableC9442e(byte[] bArr, int i) {
            this.f61668a = bArr;
            this.f61669b = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [java.io.FileOutputStream] */
        /* JADX WARN: Type inference failed for: r0v14, types: [android.os.Message] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.io.FileOutputStream] */
        /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Handler] */
        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ckg.formatTime(jCurrentTimeMillis);
            mp1.m17496k(mp1.this);
            File file = new File(mp1.this.f61643M, ckg.formatTime(jCurrentTimeMillis, ckg.formatRandom(mp1.this.f61642L) + ".jpg"));
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    if (mp1.this.f61639C != null) {
                        mp1.this.f61639C.onError();
                    }
                    e.printStackTrace();
                    return;
                }
            }
            try {
                ?? fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        fileOutputStream.write(this.f61668a);
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                    mp1 mp1Var = mp1.this;
                    mp1Var.rotateImageView(mp1Var.f61660f, this.f61669b, file.getAbsolutePath());
                    fileOutputStream = new Message();
                    ((Message) fileOutputStream).what = 1;
                    ((Message) fileOutputStream).obj = file.getAbsolutePath();
                    mp1.this.f61657c2.sendMessage(fileOutputStream);
                } finally {
                }
            } catch (FileNotFoundException e5) {
                e5.printStackTrace();
                if (mp1.this.f61639C != null) {
                    mp1.this.f61639C.onError();
                }
            }
        }
    }

    /* JADX INFO: renamed from: mp1$f */
    public class RunnableC9443f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f61671a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f61672b;

        public RunnableC9443f(byte[] bArr, int i) {
            this.f61671a = bArr;
            this.f61672b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Camera.Size previewSize = mp1.this.f61652a.getParameters().getPreviewSize();
            YuvImage yuvImage = new YuvImage(this.f61671a, 17, previewSize.width, previewSize.height, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, previewSize.width, previewSize.height), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ckg.formatTime(jCurrentTimeMillis);
            mp1.m17496k(mp1.this);
            File file = new File(mp1.this.f61643M, ckg.formatTime(jCurrentTimeMillis, ckg.formatRandom(mp1.this.f61642L) + ".jpg"));
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    if (mp1.this.f61639C != null) {
                        mp1.this.f61639C.onError();
                    }
                    e.printStackTrace();
                    return;
                }
            }
            mp1 mp1Var = mp1.this;
            mp1Var.rotateImageView(mp1Var.f61660f, this.f61672b, bitmapDecodeByteArray, file.getAbsolutePath());
            mp1 mp1Var2 = mp1.this;
            mp1Var2.saveAlbum(mp1Var2.f61656c, file);
            Message message = new Message();
            message.what = 1;
            message.obj = file.getAbsolutePath();
            mp1.this.f61657c2.sendMessage(message);
        }
    }

    /* JADX INFO: renamed from: mp1$g */
    public class HandlerC9444g extends Handler {
        public HandlerC9444g() {
        }

        @Override // android.os.Handler
        @igg({"NewApi"})
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            mp1.this.f61639C.getPhotoFile(message.obj.toString());
        }
    }

    /* JADX INFO: renamed from: mp1$h */
    public class C9445h implements Camera.AutoFocusCallback {
        public C9445h() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
        }
    }

    /* JADX INFO: renamed from: mp1$i */
    public interface InterfaceC9446i {
        void getPhotoFile(String str);

        void getVideoFile(String str);

        void onError();

        void onPreviewFrame(byte[] bArr, Camera camera);

        void onTakePicture(byte[] bArr, Camera camera);
    }

    public mp1(AppCompatActivity appCompatActivity, SurfaceView surfaceView) {
        this.f61656c = appCompatActivity;
        this.f61658d = surfaceView;
        this.f61659e = surfaceView.getHolder();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        appCompatActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f61640F = displayMetrics.widthPixels;
        this.f61641H = displayMetrics.heightPixels;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f61640F);
        sb.append("*");
        sb.append(this.f61641H);
        setUpFile();
        init();
    }

    private void fixScreenSize(int i, int i2) {
        float f;
        int i3 = this.f61641H;
        float f2 = i / i2;
        float f3 = this.f61640F;
        float f4 = i3;
        float f5 = f3 / f4;
        float f6 = 1.0f;
        if (f5 < f2) {
            float f7 = f2 / f5;
            f = 1.0f;
            f6 = f7;
        } else {
            f = f5 / f2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f6, f);
        matrix.postTranslate((f3 - (f3 * f6)) / 2.0f, (f4 - (f4 * f)) / 2.0f);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        this.f61658d.setTranslationX(fArr[2]);
        this.f61658d.setTranslationY(fArr[5]);
        this.f61658d.setScaleX(fArr[0]);
        this.f61658d.setScaleY(fArr[4]);
        this.f61658d.invalidate();
    }

    private Camera.Size getBestPreviewSize(int i, int i2) {
        float fMax = Math.max(i, i2) / Math.min(i, i2);
        Camera.Size size = null;
        float f = -1.0f;
        for (Camera.Size size2 : this.f61652a.getParameters().getSupportedPreviewSizes()) {
            float fAbs = Math.abs((Math.max(size2.width, size2.height) / Math.min(size2.width, size2.height)) - fMax);
            if (f < 0.0f) {
                size = size2;
                f = fAbs;
            }
            if (fAbs < f) {
                size = size2;
                f = fAbs;
            }
        }
        return size;
    }

    private static Camera.Size getOptimalSize(@efb List<Camera.Size> list, int i, int i2) {
        double d = ((double) i2) / ((double) i);
        Camera.Size size = null;
        double dAbs = Double.MAX_VALUE;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d) <= 0.1d && Math.abs(size2.height - i2) < dAbs2) {
                dAbs2 = Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - i2) < dAbs) {
                    size = size3;
                    dAbs = Math.abs(size3.height - i2);
                }
            }
        }
        return size;
    }

    private void getOpyimalPreviewSize() {
        List<Camera.Size> supportedPreviewSizes = this.f61654b.getSupportedPreviewSizes();
        int i = this.f61640F;
        int i2 = this.f61641H;
        double d = ((double) i) / ((double) i2);
        if (supportedPreviewSizes == null) {
            return;
        }
        double dAbs = Double.MAX_VALUE;
        Camera.Size size = null;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : supportedPreviewSizes) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d) <= 0.1d && Math.abs(size2.height - i2) < dAbs2) {
                dAbs2 = Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : supportedPreviewSizes) {
                if (Math.abs(size3.height - i2) < dAbs) {
                    size = size3;
                    dAbs = Math.abs(size3.height - i2);
                }
            }
        }
        this.f61654b.setPreviewSize(size.width, size.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPhotoPath(byte[] bArr, int i) {
        C2478k.getCachedPool().execute(new RunnableC9442e(bArr, i));
    }

    private void getPhotoPathbyPreviewFrame(byte[] bArr, int i) {
        C2478k.getCachedPool().execute(new RunnableC9443f(bArr, i));
    }

    private void initParameters(Camera camera) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f61654b = parameters;
            parameters.setPreviewFormat(17);
            Camera.Size bestPreviewSize = getBestPreviewSize(this.f61658d.getMeasuredWidth(), this.f61658d.getMeasuredHeight());
            this.f61654b.setPreviewSize(bestPreviewSize.width, bestPreviewSize.height);
            setPictureSize();
            if (isSupportFocus("continuous-picture")) {
                this.f61654b.setFocusMode("continuous-picture");
            } else if (isSupportFocus("auto")) {
                this.f61654b.setFocusMode("auto");
            }
            this.f61652a.setParameters(this.f61654b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isSupport(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportFocus(String str) {
        Iterator<String> it = this.f61654b.getSupportedFocusModes().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m17496k(mp1 mp1Var) {
        int i = mp1Var.f61642L;
        mp1Var.f61642L = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean openCamera(int i) {
        boolean zIsSupport = isSupport(i);
        if (zIsSupport) {
            try {
                Camera cameraOpen = Camera.open(i);
                this.f61652a = cameraOpen;
                initParameters(cameraOpen);
                Camera camera = this.f61652a;
                if (camera != null) {
                    camera.setPreviewCallback(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return zIsSupport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rotateImageView(int i, int i2, String str) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        if (i == 1 && i2 == 90) {
            matrix.postRotate(180.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
        if (i == 1) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(-1.0f, 1.0f);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
        }
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

    private void setCameraDisplayOrientation(AppCompatActivity appCompatActivity, int i, Camera camera) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = appCompatActivity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i3 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i2) % 360)) % 360 : ((cameraInfo.orientation - i2) + 360) % 360;
        this.f61661m = i3;
        camera.setDisplayOrientation(i3);
    }

    private void setPictureSize() {
        int i;
        int i2;
        List<Camera.Size> supportedPictureSizes = this.f61654b.getSupportedPictureSizes();
        Camera.Size previewSize = this.f61654b.getPreviewSize();
        float f = previewSize != null ? previewSize.width / previewSize.height : 0.0f;
        if (supportedPictureSizes != null) {
            int size = supportedPictureSizes.size();
            Camera.Size size2 = null;
            Camera.Size size3 = null;
            for (int i3 = 0; i3 < size; i3++) {
                Camera.Size size4 = supportedPictureSizes.get(i3);
                if (size3 == null || (size4.width >= size3.width && size4.height >= size3.height)) {
                    size3 = size4;
                }
                if (f > 0.0f && (i = size4.width) >= previewSize.width && (i2 = size4.height) >= previewSize.height && i / i2 == f && (size2 == null || (i >= size2.width && i2 >= size2.height))) {
                    size2 = size4;
                }
            }
            if (size2 == null) {
                size2 = size3;
            }
            this.f61654b.setPictureSize(size2.width, size2.height);
        }
    }

    private void setUpFile() {
        File externalFilesDir = this.f61656c.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        this.f61643M = externalFilesDir;
        if (externalFilesDir.exists() && this.f61643M.isDirectory()) {
            return;
        }
        try {
            try {
            } catch (Exception unused) {
                C2473f.m4168e("lttttt", "创建存放目录失败,请检查磁盘空间~");
                this.f61656c.finish();
                C2473f.m4168e("lttttt", "创建存放目录失败,请检查磁盘空间~");
            }
            if (this.f61643M.mkdirs()) {
                return;
            }
            C2473f.m4168e("lttttt", "创建存放目录失败,请检查磁盘空间~");
            this.f61656c.finish();
        } catch (Throwable th) {
            C2473f.m4168e("lttttt", "创建存放目录失败,请检查磁盘空间~");
            this.f61656c.finish();
            throw th;
        }
    }

    private ArrayList<RectF> transForm(Camera.Face[] faceArr) {
        Matrix matrix = new Matrix();
        if (this.f61660f == 1) {
            matrix.setScale(-1.0f, 1.0f);
        } else {
            matrix.setScale(1.0f, 1.0f);
        }
        matrix.postRotate(this.f61661m);
        matrix.postScale(this.f61658d.getWidth() / 2000.0f, this.f61658d.getHeight() / 2000.0f);
        matrix.postTranslate(this.f61658d.getWidth() / 2.0f, this.f61658d.getHeight() / 2.0f);
        ArrayList<RectF> arrayList = new ArrayList<>();
        for (Camera.Face face : faceArr) {
            RectF rectF = new RectF(face.rect);
            RectF rectF2 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            matrix.mapRect(rectF2, rectF);
            arrayList.add(rectF2);
        }
        return arrayList;
    }

    public void autoFoucus() {
        Camera camera = this.f61652a;
        if (camera == null) {
            camera.autoFocus(new C9445h());
        }
    }

    public int getMaxZoom() {
        Camera camera = this.f61652a;
        if (camera == null) {
            return -1;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported()) {
            return -1;
        }
        if (parameters.getMaxZoom() > 50) {
            return 50;
        }
        return parameters.getMaxZoom();
    }

    public String getVideoFilePath() {
        return this.f61650Z;
    }

    public void getVideoSize() {
        Camera.Parameters parameters = this.f61652a.getParameters();
        Camera.Size optimalVideoSize = ap1.getOptimalVideoSize(parameters.getSupportedVideoSizes(), parameters.getSupportedPreviewSizes(), this.f61658d.getWidth(), this.f61658d.getHeight());
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        this.f61644M1 = camcorderProfile;
        camcorderProfile.videoFrameWidth = optimalVideoSize.width;
        camcorderProfile.videoFrameHeight = optimalVideoSize.height;
    }

    public int getZoom() {
        return this.f61645N;
    }

    public void init() {
        this.f61659e.addCallback(this.f61655b2);
    }

    public boolean isFull() {
        return this.f61647V1;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        InterfaceC9446i interfaceC9446i = this.f61639C;
        if (interfaceC9446i != null) {
            interfaceC9446i.onPreviewFrame(bArr, camera);
        }
        this.f61653a2 = bArr;
    }

    public void releaseCamera() {
        Camera camera = this.f61652a;
        if (camera != null) {
            camera.stopPreview();
            this.f61652a.setPreviewCallback(null);
            this.f61652a.release();
            this.f61652a = null;
            this.f61657c2.removeMessages(1);
        }
        MediaRecorder mediaRecorder = this.f61646Q;
        if (mediaRecorder != null) {
            mediaRecorder.release();
            this.f61646Q = null;
        }
    }

    public void saveAlbum(Context context, File file) {
        OutputStream outputStreamOpenOutputStream;
        if (Build.VERSION.SDK_INT < 29) {
            ckg.saveAlbum(file.getAbsolutePath(), file.getName(), context);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (uriInsert == null || (outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert)) == null) {
                return;
            }
            byte[] bArr = new byte[1024];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    outputStreamOpenOutputStream.close();
                    bufferedInputStream.close();
                    return;
                }
                outputStreamOpenOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e) {
            InterfaceC9446i interfaceC9446i = this.f61639C;
            if (interfaceC9446i != null) {
                interfaceC9446i.onError();
            }
            e.printStackTrace();
        }
    }

    public void setCameraCallBack(InterfaceC9446i interfaceC9446i) {
        this.f61639C = interfaceC9446i;
    }

    public void setFrontOrBack(int i) {
        this.f61660f = i;
    }

    public void setFull(boolean z) {
        this.f61647V1 = z;
    }

    public void setPreviewSize(int i, int i2) {
        List<Camera.Size> supportedPreviewSizes = this.f61654b.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            int size = supportedPreviewSizes.size();
            if (i / i2 == 0.75f) {
                for (int i3 = 0; i3 < size; i3++) {
                    Camera.Size size2 = supportedPreviewSizes.get(i3);
                    float f = size2.width;
                    int i4 = size2.height;
                    if (f / i4 == 1.3333334f) {
                        this.f61654b.setPreviewSize(size2.width, i4);
                        return;
                    }
                }
                return;
            }
            Camera.Size size3 = null;
            Camera.Size size4 = null;
            Camera.Size size5 = null;
            Camera.Size size6 = null;
            for (int i5 = 0; i5 < size; i5++) {
                Camera.Size size7 = supportedPreviewSizes.get(i5);
                if (size6 == null || (size7.width >= size6.width && size7.height >= size6.height)) {
                    size6 = size7;
                }
                int i6 = size7.width;
                if (i6 == i2 && size7.height == i) {
                    size3 = size7;
                } else if (i6 == i2 || size7.height == i) {
                    if (size4 == null) {
                        size4 = size7;
                    } else if (i6 < i2 || size7.height < i) {
                        size5 = size7;
                    }
                }
            }
            if (size3 == null) {
                size3 = size4;
            }
            if (size3 != null) {
                size5 = size3;
            }
            if (size5 != null) {
                size6 = size5;
            }
            this.f61654b.setPreviewSize(size6.width, size6.height);
            C2473f.m4168e("lttttt", "预览界面:::" + size6.width + ":::" + size6.height);
            fixScreenSize(size6.height, size6.width);
        }
    }

    public void setZoom(int i) {
        Camera camera = this.f61652a;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters.isZoomSupported()) {
            parameters.setZoom(i);
            this.f61652a.setParameters(parameters);
            this.f61645N = i;
        }
    }

    public void startPreview() {
        try {
            this.f61652a.setPreviewDisplay(this.f61659e);
            setCameraDisplayOrientation(this.f61656c, this.f61660f, this.f61652a);
            this.f61652a.startPreview();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startRecord(String str, String str2) {
        this.f61652a.unlock();
        if (this.f61646Q == null) {
            this.f61646Q = new MediaRecorder();
        }
        this.f61646Q.setCamera(this.f61652a);
        this.f61646Q.setAudioSource(5);
        this.f61646Q.setVideoSource(1);
        this.f61646Q.setOutputFormat(this.f61644M1.fileFormat);
        this.f61646Q.setVideoEncodingBitRate(5242880);
        this.f61646Q.setVideoEncoder(2);
        this.f61646Q.setAudioEncoder(0);
        MediaRecorder mediaRecorder = this.f61646Q;
        CamcorderProfile camcorderProfile = this.f61644M1;
        mediaRecorder.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        if (this.f61660f == 1) {
            int i = this.f61661m;
            if (i == 270 || i == 90 || i == 180) {
                this.f61646Q.setOrientationHint(180);
            } else {
                this.f61646Q.setOrientationHint(0);
            }
        } else if (this.f61661m == 90) {
            this.f61646Q.setOrientationHint(90);
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        MediaRecorder mediaRecorder2 = this.f61646Q;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(".mp4");
        mediaRecorder2.setOutputFile(sb.toString());
        File file2 = new File(str + str3 + str2 + ".mp4");
        if (file2.exists()) {
            file2.delete();
        }
        this.f61650Z = str + str3 + str2 + ".mp4";
        this.f61646Q.setPreviewDisplay(this.f61658d.getHolder().getSurface());
        try {
            this.f61646Q.prepare();
            this.f61646Q.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopPreview() {
        Camera camera = this.f61652a;
        if (camera != null) {
            camera.stopPreview();
        }
    }

    public void stopRecord() {
        MediaRecorder mediaRecorder = this.f61646Q;
        if (mediaRecorder != null) {
            mediaRecorder.release();
            this.f61646Q = null;
        }
        this.f61639C.getVideoFile(this.f61650Z);
        Camera camera = this.f61652a;
        if (camera != null) {
            camera.release();
        }
        openCamera(this.f61660f);
        startPreview();
    }

    public void switchCamera() {
        releaseCamera();
        int numberOfCameras = (this.f61660f + 1) % Camera.getNumberOfCameras();
        this.f61660f = numberOfCameras;
        openCamera(numberOfCameras);
        startPreview();
    }

    public void takePicture(int i, boolean z) {
        Camera camera = this.f61652a;
        if (camera != null) {
            camera.takePicture(new C9438a(), new C9439b(), new C9440c(z, i));
        }
    }

    public void takePictureByPreviewFrame() {
        stopPreview();
        getPhotoPathbyPreviewFrame(this.f61653a2, 90);
    }

    public void turnLight(boolean z) {
        Camera.Parameters parameters;
        Camera camera = this.f61652a;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        parameters.setFlashMode(z ? "torch" : bk3.f13924e);
        this.f61652a.setParameters(parameters);
    }

    public void update(SurfaceView surfaceView) {
        this.f61659e = surfaceView.getHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rotateImageView(int i, int i2, Bitmap bitmap, String str) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        if (i == 1 && i2 == 90) {
            matrix.postRotate(180.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (i == 1) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(-1.0f, 1.0f);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
        }
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
}
