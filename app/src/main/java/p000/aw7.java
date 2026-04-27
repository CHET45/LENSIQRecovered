package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.support.common.FileUtil;
import org.tensorflow.lite.support.common.TensorOperator;
import org.tensorflow.lite.support.common.ops.NormalizeOp;
import org.tensorflow.lite.support.image.ImageOperator;
import org.tensorflow.lite.support.image.ImageProcessor;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.image.ops.ResizeOp;

/* JADX INFO: loaded from: classes8.dex */
@dwf({"SMAP\nImageUpscaleHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUpscaleHelper.kt\nwatchfun/image/ImageUpscaleHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,769:1\n1747#2,3:770\n1549#2:780\n1620#2,3:781\n12643#3,3:773\n11075#3:776\n11410#3,3:777\n12643#3,3:784\n*S KotlinDebug\n*F\n+ 1 ImageUpscaleHelper.kt\nwatchfun/image/ImageUpscaleHelper\n*L\n65#1:770,3\n142#1:780\n142#1:781,3\n136#1:773,3\n140#1:776\n140#1:777,3\n542#1:784,3\n*E\n"})
public final class aw7 {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C1626a f11994f = new C1626a(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f11995g = "ImageUpscaleHelper";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f11996h = "real_esrgan_general_x4v3-real-esrgan-general-x4v3-w8a8.tflite";

    /* JADX INFO: renamed from: i */
    public static final int f11997i = 1280;

    /* JADX INFO: renamed from: j */
    public static final float f11998j = 0.0039040877f;

    /* JADX INFO: renamed from: k */
    public static final float f11999k = 0.005090102f;

    /* JADX INFO: renamed from: l */
    public static final int f12000l = 25;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f12001a;

    /* JADX INFO: renamed from: b */
    @gib
    public Interpreter f12002b;

    /* JADX INFO: renamed from: c */
    @yfb
    public EnumC1627b f12003c;

    /* JADX INFO: renamed from: d */
    public boolean f12004d;

    /* JADX INFO: renamed from: e */
    public boolean f12005e;

    /* JADX INFO: renamed from: aw7$a */
    public static final class C1626a {
        public /* synthetic */ C1626a(jt3 jt3Var) {
            this();
        }

        private C1626a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: aw7$b */
    public static final class EnumC1627b {

        /* JADX INFO: renamed from: a */
        public static final EnumC1627b f12006a = new EnumC1627b("CPU", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC1627b f12007b = new EnumC1627b("NNAPI", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC1627b[] f12008c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ v35 f12009d;

        private static final /* synthetic */ EnumC1627b[] $values() {
            return new EnumC1627b[]{f12006a, f12007b};
        }

        static {
            EnumC1627b[] enumC1627bArr$values = $values();
            f12008c = enumC1627bArr$values;
            f12009d = x35.enumEntries(enumC1627bArr$values);
        }

        private EnumC1627b(String str, int i) {
        }

        @yfb
        public static v35<EnumC1627b> getEntries() {
            return f12009d;
        }

        public static EnumC1627b valueOf(String str) {
            return (EnumC1627b) Enum.valueOf(EnumC1627b.class, str);
        }

        public static EnumC1627b[] values() {
            return (EnumC1627b[]) f12008c.clone();
        }
    }

    /* JADX INFO: renamed from: aw7$c */
    public static final class C1628c {

        /* JADX INFO: renamed from: a */
        @gib
        public final Bitmap f12010a;

        /* JADX INFO: renamed from: b */
        public final long f12011b;

        /* JADX INFO: renamed from: c */
        @gib
        public final String f12012c;

        public C1628c(@gib Bitmap bitmap, long j, @gib String str) {
            this.f12010a = bitmap;
            this.f12011b = j;
            this.f12012c = str;
        }

        public static /* synthetic */ C1628c copy$default(C1628c c1628c, Bitmap bitmap, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = c1628c.f12010a;
            }
            if ((i & 2) != 0) {
                j = c1628c.f12011b;
            }
            if ((i & 4) != 0) {
                str = c1628c.f12012c;
            }
            return c1628c.copy(bitmap, j, str);
        }

        @gib
        public final Bitmap component1() {
            return this.f12010a;
        }

        public final long component2() {
            return this.f12011b;
        }

        @gib
        public final String component3() {
            return this.f12012c;
        }

        @yfb
        public final C1628c copy(@gib Bitmap bitmap, long j, @gib String str) {
            return new C1628c(bitmap, j, str);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1628c)) {
                return false;
            }
            C1628c c1628c = (C1628c) obj;
            return md8.areEqual(this.f12010a, c1628c.f12010a) && this.f12011b == c1628c.f12011b && md8.areEqual(this.f12012c, c1628c.f12012c);
        }

        @gib
        public final Bitmap getBitmap() {
            return this.f12010a;
        }

        @gib
        public final String getErrorMessage() {
            return this.f12012c;
        }

        public final long getInferenceTime() {
            return this.f12011b;
        }

        public int hashCode() {
            Bitmap bitmap = this.f12010a;
            int iHashCode = (((bitmap == null ? 0 : bitmap.hashCode()) * 31) + Long.hashCode(this.f12011b)) * 31;
            String str = this.f12012c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @yfb
        public String toString() {
            return "UpscaleResult(bitmap=" + this.f12010a + ", inferenceTime=" + this.f12011b + ", errorMessage=" + this.f12012c + ')';
        }
    }

    /* JADX INFO: renamed from: aw7$d */
    @ck3(m4009c = "watchfun.image.ImageUpscaleHelper$processImage$2", m4010f = "ImageUpscaleHelper.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1629d extends ugg implements gz6<x13, zy2<? super C1628c>, Object> {

        /* JADX INFO: renamed from: a */
        public int f12013a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bitmap f12015c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<Float, bth> f12016d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1629d(Bitmap bitmap, qy6<? super Float, bth> qy6Var, zy2<? super C1629d> zy2Var) {
            super(2, zy2Var);
            this.f12015c = bitmap;
            this.f12016d = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return aw7.this.new C1629d(this.f12015c, this.f12016d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super C1628c> zy2Var) {
            return ((C1629d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Bitmap bitmapProcessTiledImage;
            Tensor inputTensor;
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f12013a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                Interpreter interpreter = aw7.this.f12002b;
                int[] iArrShape = (interpreter == null || (inputTensor = interpreter.getInputTensor(0)) == null) ? null : inputTensor.shape();
                if (iArrShape == null) {
                    return new C1628c(null, 0L, "无法获取输入张量形状");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("输入张量形状: ");
                String string = Arrays.toString(iArrShape);
                md8.checkNotNullExpressionValue(string, "toString(this)");
                sb.append(string);
                Log.i(aw7.f11995g, sb.toString());
                int i = iArrShape[1];
                int i2 = iArrShape[2];
                Log.i(aw7.f11995g, "输入图像尺寸: " + this.f12015c.getWidth() + 'x' + this.f12015c.getHeight());
                if (this.f12015c.getWidth() == i2 && this.f12015c.getHeight() == i) {
                    Log.i(aw7.f11995g, "处理单块（精确的模型输入尺寸）");
                    bitmapProcessTiledImage = aw7.this.processSingleTile(this.f12015c, i, i2);
                    qy6<Float, bth> qy6Var = this.f12016d;
                    if (qy6Var != null) {
                        qy6Var.invoke(wc1.boxFloat(100.0f));
                    }
                } else {
                    Log.i(aw7.f11995g, (char) 23545 + this.f12015c.getWidth() + 'x' + this.f12015c.getHeight() + "图像使用基于瓦片的处理");
                    bitmapProcessTiledImage = aw7.this.processTiledImage(this.f12015c, i, i2, this.f12016d);
                }
                return new C1628c(bitmapProcessTiledImage, SystemClock.uptimeMillis() - jUptimeMillis, null);
            } catch (Exception e) {
                Log.e(aw7.f11995g, "图像处理失败", e);
                return new C1628c(null, 0L, "处理失败: " + e.getMessage());
            }
        }
    }

    public aw7(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        this.f12001a = context;
        this.f12003c = EnumC1627b.f12006a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Bitmap m2707a(aw7 aw7Var, Bitmap bitmap, int i, int i2, qy6 qy6Var, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            qy6Var = null;
        }
        return aw7Var.processTiledImage(bitmap, i, i2, qy6Var);
    }

    private final Bitmap createPaddedTile(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == i && height == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        if (width < i) {
            for (int i3 = width; i3 < i; i3++) {
                for (int i4 = 0; i4 < height; i4++) {
                    bitmapCreateBitmap.setPixel(i3, i4, bitmap.getPixel(width - 1, i4));
                }
            }
        }
        if (height < i2) {
            for (int i5 = height; i5 < i2; i5++) {
                for (int i6 = 0; i6 < i; i6++) {
                    int iMin = Math.min(height - 1, i5);
                    int iMin2 = Math.min(width - 1, i6);
                    bitmapCreateBitmap.setPixel(i6, i5, (iMin2 >= width || iMin >= height) ? bitmapCreateBitmap.getPixel(iMin2, iMin) : bitmap.getPixel(iMin2, iMin));
                }
            }
        }
        return bitmapCreateBitmap;
    }

    private final Bitmap extractRelevantPortion(Bitmap bitmap, int i, int i2) {
        int i3 = i * 4;
        int i4 = i2 * 4;
        if (bitmap.getWidth() == i3 && bitmap.getHeight() == i4) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, Math.min(i3, bitmap.getWidth()), Math.min(i4, bitmap.getHeight()));
        md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ boolean initializeModel$default(aw7 aw7Var, String str, EnumC1627b enumC1627b, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            enumC1627b = EnumC1627b.f12007b;
        }
        return aw7Var.initializeModel(str, enumC1627b);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isKnownProblematicDevice() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            if (r0 == 0) goto L11
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            p000.md8.checkNotNullExpressionValue(r0, r1)
            if (r0 != 0) goto L13
        L11:
            java.lang.String r0 = ""
        L13:
            java.lang.String r2 = android.os.Build.MODEL
            if (r2 == 0) goto L20
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            p000.md8.checkNotNullExpressionValue(r2, r1)
        L20:
            java.lang.String r1 = "ZTE"
            java.util.List r1 = p000.k82.listOf(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L37
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L37
            goto L50
        L37:
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r4 = 2
            r5 = 0
            boolean r2 = p000.m9g.contains$default(r0, r2, r3, r4, r5)
            if (r2 == 0) goto L3b
            r3 = 1
        L50:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.aw7.isKnownProblematicDevice():boolean");
    }

    private final boolean isNNAPISupported() {
        try {
            MappedByteBuffer mappedByteBufferLoadMappedFile = FileUtil.loadMappedFile(this.f12001a, "real_esrgan_general_x4v3-real-esrgan-general-x4v3-w8a8.tflite");
            md8.checkNotNullExpressionValue(mappedByteBufferLoadMappedFile, "loadMappedFile(...)");
            Interpreter.Options options = new Interpreter.Options();
            options.setNumThreads(1);
            options.setUseNNAPI(true);
            new Interpreter(mappedByteBufferLoadMappedFile, options).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final Bitmap nhwcQuantizedUint8ArrayToBitmap(byte[] bArr, int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr = new int[i2 * i];
        float[] fArr = new float[bArr.length];
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            fArr[i4] = kpd.coerceIn(((255 & bArr[i4]) - 25) * 0.005090102f, 0.0f, 1.0f);
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i5 * i2;
                int i8 = i7 + i6;
                int i9 = (i7 * i3) + (i6 * i3);
                iArr[i8] = Color.argb(255, (int) kpd.coerceIn(fArr[i9] * 255.0f, 0.0f, 255.0f), (int) kpd.coerceIn(fArr[i9 + 1] * 255.0f, 0.0f, 255.0f), (int) kpd.coerceIn(fArr[i9 + 2] * 255.0f, 0.0f, 255.0f));
            }
        }
        bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object processImage$default(aw7 aw7Var, Bitmap bitmap, qy6 qy6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            qy6Var = null;
        }
        return aw7Var.processImage(bitmap, qy6Var, zy2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v23 */
    private final Bitmap processQuantizedRealESRGAN(TensorImage tensorImage) throws Exception {
        Interpreter interpreter = this.f12002b;
        md8.checkNotNull(interpreter);
        ?? r2 = false;
        int[] iArrShape = interpreter.getOutputTensor(0).shape();
        StringBuilder sb = new StringBuilder();
        sb.append("量化输出张量形状: ");
        String string = Arrays.toString(iArrShape);
        md8.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        Log.i(f11995g, sb.toString());
        md8.checkNotNull(iArrShape);
        int i = iArrShape[0];
        int i2 = iArrShape[1];
        int i3 = iArrShape[2];
        int i4 = iArrShape[3];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * i2 * i3 * i4);
        Interpreter interpreter2 = this.f12002b;
        md8.checkNotNull(interpreter2);
        int[] iArrShape2 = interpreter2.getInputTensor(0).shape();
        int i5 = iArrShape2[1] * iArrShape2[2] * iArrShape2[3];
        ByteBuffer byteBufferOrder = tensorImage.getBuffer().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
        byteBufferOrder.rewind();
        FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
        int iRemaining = floatBufferAsFloatBuffer.remaining();
        float[] fArr = new float[iRemaining];
        floatBufferAsFloatBuffer.get(fArr);
        byte[] bArr = new byte[i5];
        int iMin = Math.min(iRemaining, i5);
        int i6 = 0;
        while (i6 < iMin) {
            bArr[i6] = (byte) kpd.coerceIn((int) (kpd.coerceIn(fArr[i6], 0.0f, 1.0f) * 255.0f), 0, 255);
            i6++;
            r2 = false;
        }
        byte b = r2;
        while (iRemaining < i5) {
            bArr[iRemaining] = b;
            iRemaining++;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i5);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("🔄 开始执行TFLite推理，使用代理: ");
        sb2.append(this.f12003c);
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            Interpreter interpreter3 = this.f12002b;
            if (interpreter3 != null) {
                interpreter3.run(byteBufferAllocateDirect, byteBufferAllocate);
            }
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("✅ TFLite推理完成，耗时: ");
            sb3.append(jUptimeMillis2);
            sb3.append("ms");
            byteBufferAllocate.rewind();
            int iRemaining2 = byteBufferAllocate.remaining();
            byte[] bArr2 = new byte[iRemaining2];
            byteBufferAllocate.rewind();
            byteBufferAllocate.get(bArr2);
            if (iRemaining2 == 0) {
                Log.e(f11995g, "❌ 输出数组为空 - 量化模型推理失败");
                throw new IllegalStateException("量化模型推理产生空输出");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("📊 输出数组大小: ");
            sb4.append(iRemaining2);
            sb4.append(" bytes, 预期: ");
            sb4.append(i2);
            sb4.append('x');
            sb4.append(i3);
            sb4.append('x');
            sb4.append(i4);
            int i7 = b;
            for (int i8 = b; i8 < iRemaining2; i8++) {
                if ((bArr2[i8] & 255) != 0) {
                    i7++;
                }
            }
            float f = (i7 / iRemaining2) * 100;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("📊 输出数据非零像素: ");
            sb5.append(i7);
            sb5.append(" / ");
            sb5.append(iRemaining2);
            sb5.append(" (");
            l7g l7gVar = l7g.f56714a;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            md8.checkNotNullExpressionValue(str, "format(format, *args)");
            sb5.append(str);
            sb5.append("%)");
            if (f < 1.0f) {
                Log.w(f11995g, "⚠️ 警告: 输出数据几乎全为0，可能表示推理失败或NNAPI不兼容");
            }
            return nhwcQuantizedUint8ArrayToBitmap(bArr2, i2, i3, i4);
        } catch (Exception e) {
            Log.e(f11995g, "❌ TFLite推理失败: " + e.getMessage(), e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap processSingleTile(Bitmap bitmap, int i, int i2) {
        TensorImage tensorImageProcess = new ImageProcessor.Builder().add((ImageOperator) new ResizeOp(i, i2, ResizeOp.ResizeMethod.BILINEAR)).add((TensorOperator) new NormalizeOp(0.0f, 255.0f)).build().process(TensorImage.fromBitmap(bitmap));
        md8.checkNotNull(tensorImageProcess);
        return processQuantizedRealESRGAN(tensorImageProcess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap processTiledImage(Bitmap bitmap, int i, int i2, qy6<? super Float, bth> qy6Var) {
        qy6<? super Float, bth> qy6Var2;
        int i3;
        qy6<? super Float, bth> qy6Var3 = qy6Var;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width * 4, height * 4, Bitmap.Config.ARGB_8888);
        md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        int i4 = i - 16;
        int iMax = Math.max(1, (((width - 16) + i4) - 1) / i4);
        int iMax2 = Math.max(1, (((height - 16) + i4) - 1) / i4);
        int i5 = iMax * iMax2;
        String str = f11995g;
        Log.i(f11995g, "处理" + iMax + 'x' + iMax2 + "个重叠瓦片（总计" + i5 + "个tiles），重叠=16px，图像" + width + 'x' + height);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iMax2) {
            int i9 = i6;
            while (i9 < iMax) {
                int i10 = iMax;
                int iMax3 = Math.max(i6, i9 * i4);
                int i11 = iMax2;
                int iMax4 = Math.max(i6, i7 * i4);
                int iMin = Math.min(width, iMax3 + i);
                int i12 = width;
                int iMin2 = Math.min(height, iMax4 + i);
                int i13 = height;
                int i14 = iMin - iMax3;
                int i15 = i4;
                int i16 = iMin2 - iMax4;
                String str2 = str;
                int i17 = i5;
                if (i14 < 32 || i16 < 32) {
                    qy6Var2 = qy6Var;
                    i3 = i17;
                    StringBuilder sb = new StringBuilder();
                    sb.append("跳过小瓦片 (");
                    sb.append(i9);
                    sb.append(C4584d2.f28238g);
                    sb.append(i7);
                    sb.append("): ");
                    sb.append(i14);
                    sb.append('x');
                    sb.append(i16);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("处理重叠瓦片 (");
                    sb2.append(i9);
                    sb2.append(C4584d2.f28238g);
                    sb2.append(i7);
                    sb2.append("): ");
                    sb2.append(iMax3);
                    sb2.append(C4584d2.f28238g);
                    sb2.append(iMax4);
                    sb2.append(" -> ");
                    sb2.append(iMin);
                    sb2.append(C4584d2.f28238g);
                    sb2.append(iMin2);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, iMax3, iMax4, i14, i16);
                    md8.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
                    Bitmap bitmapProcessSingleTile = processSingleTile(createPaddedTile(bitmapCreateBitmap2, i, i), i, i);
                    Bitmap bitmapExtractRelevantPortion = extractRelevantPortion(bitmapProcessSingleTile, i14, i16);
                    writeProcessedTileToOutput(bitmapExtractRelevantPortion, bitmapCreateBitmap, iMax3 * 4, iMax4 * 4);
                    bitmapCreateBitmap2.recycle();
                    bitmapProcessSingleTile.recycle();
                    bitmapExtractRelevantPortion.recycle();
                    i8++;
                    i3 = i17;
                    float f = ((i8 / i3) * 75.0f) + 25.0f;
                    qy6Var2 = qy6Var;
                    if (qy6Var2 != null) {
                        qy6Var2.invoke(Float.valueOf(f));
                    }
                }
                i9++;
                i5 = i3;
                qy6Var3 = qy6Var2;
                iMax = i10;
                iMax2 = i11;
                width = i12;
                height = i13;
                i4 = i15;
                str = str2;
                i6 = 0;
            }
            i7++;
            qy6Var3 = qy6Var3;
            iMax = iMax;
            iMax2 = iMax2;
            i6 = 0;
        }
        Log.i(str, "瓦片处理完成。输出尺寸: " + bitmapCreateBitmap.getWidth() + 'x' + bitmapCreateBitmap.getHeight());
        return bitmapCreateBitmap;
    }

    private final boolean testNnapiQuality() {
        boolean z;
        boolean z2;
        if (this.f12004d) {
            return this.f12005e;
        }
        try {
            Log.i(f11995g, "🔬 开始NNAPI质量测试...");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
            md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            for (int i = 0; i < 128; i++) {
                for (int i2 = 0; i2 < 128; i2++) {
                    int i3 = ((i2 + i) / 2) % 256;
                    paint.setColor(Color.rgb(i3, i3, i3));
                    canvas.drawPoint(i2, i, paint);
                }
            }
            TensorImage tensorImageProcess = new ImageProcessor.Builder().add((ImageOperator) new ResizeOp(128, 128, ResizeOp.ResizeMethod.BILINEAR)).add((TensorOperator) new NormalizeOp(0.0f, 255.0f)).build().process(TensorImage.fromBitmap(bitmapCreateBitmap));
            Interpreter interpreter = this.f12002b;
            md8.checkNotNull(interpreter);
            int[] iArrShape = interpreter.getOutputTensor(0).shape();
            md8.checkNotNull(iArrShape);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iArrShape[0] * iArrShape[1] * iArrShape[2] * iArrShape[3]);
            Interpreter interpreter2 = this.f12002b;
            md8.checkNotNull(interpreter2);
            int[] iArrShape2 = interpreter2.getInputTensor(0).shape();
            int i4 = iArrShape2[1] * iArrShape2[2] * iArrShape2[3];
            ByteBuffer byteBufferOrder = tensorImageProcess.getBuffer().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
            byteBufferOrder.rewind();
            FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
            int iRemaining = floatBufferAsFloatBuffer.remaining();
            float[] fArr = new float[iRemaining];
            floatBufferAsFloatBuffer.get(fArr);
            byte[] bArr = new byte[i4];
            int iMin = Math.min(iRemaining, i4);
            for (int i5 = 0; i5 < iMin; i5++) {
                bArr[i5] = (byte) kpd.coerceIn((int) (kpd.coerceIn(fArr[i5], 0.0f, 1.0f) * 255.0f), 0, 255);
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i4);
            byteBufferAllocateDirect.put(bArr);
            byteBufferAllocateDirect.rewind();
            Interpreter interpreter3 = this.f12002b;
            if (interpreter3 != null) {
                interpreter3.run(byteBufferAllocateDirect, byteBufferAllocate);
            }
            byteBufferAllocate.rewind();
            int iRemaining2 = byteBufferAllocate.remaining();
            byte[] bArr2 = new byte[iRemaining2];
            byteBufferAllocate.get(bArr2);
            int i6 = 0;
            for (int i7 = 0; i7 < iRemaining2; i7++) {
                if ((bArr2[i7] & 255) != 0) {
                    i6++;
                }
            }
            float f = (i6 / iRemaining2) * 100;
            ArrayList arrayList = new ArrayList(iRemaining2);
            for (int i8 = 0; i8 < iRemaining2; i8++) {
                arrayList.add(Float.valueOf(bArr2[i8] & 255));
            }
            float fAverageOfFloat = (float) v82.averageOfFloat(arrayList);
            ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue() - fAverageOfFloat;
                arrayList2.add(Float.valueOf(fFloatValue * fFloatValue));
            }
            double dSqrt = Math.sqrt(v82.averageOfFloat(arrayList2));
            StringBuilder sb = new StringBuilder();
            sb.append("📊 NNAPI测试结果 - 非零像素: ");
            l7g l7gVar = l7g.f56714a;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            md8.checkNotNullExpressionValue(str, "format(format, *args)");
            sb.append(str);
            sb.append("%, 标准差: ");
            String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dSqrt)}, 1));
            md8.checkNotNullExpressionValue(str2, "format(format, *args)");
            sb.append(str2);
            Log.i(f11995g, sb.toString());
            if (f <= 50.0f || dSqrt <= 10.0d) {
                z = false;
                z2 = true;
            } else {
                z2 = true;
                z = true;
            }
            this.f12004d = z2;
            this.f12005e = z;
            if (z) {
                Log.i(f11995g, "✅ NNAPI质量测试通过，输出有效");
            } else {
                Log.w(f11995g, "⚠️ NNAPI质量测试失败，输出无效或质量差");
            }
            return z;
        } catch (Exception e) {
            Log.e(f11995g, "❌ NNAPI质量测试异常: " + e.getMessage(), e);
            this.f12004d = true;
            this.f12005e = false;
            return false;
        }
    }

    private final void writeProcessedTileToOutput(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        new Canvas(bitmap2).drawBitmap(bitmap, i, i2, (Paint) null);
    }

    public final void cleanup() {
        Interpreter interpreter = this.f12002b;
        if (interpreter != null) {
            interpreter.close();
        }
        this.f12002b = null;
    }

    @yfb
    public final List<EnumC1627b> getAvailableDelegates() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC1627b.f12006a);
        if (Build.VERSION.SDK_INT >= 27 && isNNAPISupported()) {
            arrayList.add(EnumC1627b.f12007b);
        }
        return arrayList;
    }

    public final boolean initializeModel(@gib String str, @yfb EnumC1627b enumC1627b) {
        String string;
        Tensor outputTensor;
        Tensor inputTensor;
        md8.checkNotNullParameter(enumC1627b, "delegate");
        Interpreter interpreter = this.f12002b;
        if (interpreter != null) {
            interpreter.close();
        }
        this.f12004d = false;
        this.f12005e = false;
        if (str == null) {
            str = "real_esrgan_general_x4v3-real-esrgan-general-x4v3-w8a8.tflite";
        }
        try {
            MappedByteBuffer mappedByteBufferLoadMappedFile = FileUtil.loadMappedFile(this.f12001a, str);
            md8.checkNotNullExpressionValue(mappedByteBufferLoadMappedFile, "loadMappedFile(...)");
            Log.i(f11995g, "成功创建TFLite缓冲区，模型: " + str);
            Log.i(f11995g, "设备信息: " + Build.MANUFACTURER + ' ' + Build.MODEL + ", Android " + Build.VERSION.RELEASE);
            StringBuilder sb = new StringBuilder();
            sb.append("请求的代理类型: ");
            sb.append(enumC1627b);
            Log.i(f11995g, sb.toString());
            EnumC1627b enumC1627b2 = EnumC1627b.f12007b;
            if (enumC1627b == enumC1627b2 && isKnownProblematicDevice()) {
                Log.w(f11995g, "⚠️ 检测到已知NNAPI问题设备，自动切换到CPU模式");
                enumC1627b = EnumC1627b.f12006a;
            }
            Interpreter.Options options = new Interpreter.Options();
            options.setNumThreads(4);
            options.setUseNNAPI(enumC1627b == enumC1627b2);
            try {
                this.f12003c = enumC1627b;
                this.f12002b = new Interpreter(mappedByteBufferLoadMappedFile, options);
                Log.i(f11995g, "✅ 成功初始化TFLite解释器，使用代理: " + enumC1627b);
                Interpreter interpreter2 = this.f12002b;
                String string2 = null;
                int[] iArrShape = (interpreter2 == null || (inputTensor = interpreter2.getInputTensor(0)) == null) ? null : inputTensor.shape();
                Interpreter interpreter3 = this.f12002b;
                int[] iArrShape2 = (interpreter3 == null || (outputTensor = interpreter3.getOutputTensor(0)) == null) ? null : outputTensor.shape();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("模型输入形状: ");
                if (iArrShape != null) {
                    string = Arrays.toString(iArrShape);
                    md8.checkNotNullExpressionValue(string, "toString(this)");
                } else {
                    string = null;
                }
                sb2.append(string);
                sb2.append(", 输出形状: ");
                if (iArrShape2 != null) {
                    string2 = Arrays.toString(iArrShape2);
                    md8.checkNotNullExpressionValue(string2, "toString(this)");
                }
                sb2.append(string2);
                Log.i(f11995g, sb2.toString());
                if (enumC1627b == enumC1627b2 && !testNnapiQuality()) {
                    Log.w(f11995g, "⚠️ NNAPI质量测试失败，自动回退到CPU模式");
                    Interpreter interpreter4 = this.f12002b;
                    if (interpreter4 != null) {
                        interpreter4.close();
                    }
                    Interpreter.Options options2 = new Interpreter.Options();
                    options2.setNumThreads(4);
                    options2.setUseNNAPI(false);
                    this.f12003c = EnumC1627b.f12006a;
                    this.f12002b = new Interpreter(mappedByteBufferLoadMappedFile, options2);
                    Log.i(f11995g, "✅ 成功回退到CPU模式");
                }
            } catch (Exception e) {
                Log.e(f11995g, "❌ 使用代理 " + enumC1627b + " 初始化失败: " + e.getMessage(), e);
                if (enumC1627b != EnumC1627b.f12007b) {
                    throw e;
                }
                Log.w(f11995g, "⚠️ NNAPI不支持或初始化失败，尝试回退到CPU模式");
                Interpreter.Options options3 = new Interpreter.Options();
                options3.setNumThreads(4);
                options3.setUseNNAPI(false);
                this.f12003c = EnumC1627b.f12006a;
                this.f12002b = new Interpreter(mappedByteBufferLoadMappedFile, options3);
                Log.i(f11995g, "✅ 成功回退到CPU模式");
            }
            return true;
        } catch (Exception e2) {
            Log.e(f11995g, "❌ TensorFlow Lite初始化完全失败: " + e2.getMessage(), e2);
            return false;
        }
    }

    @gib
    public final Object processImage(@yfb Bitmap bitmap, @gib qy6<? super Float, bth> qy6Var, @yfb zy2<? super C1628c> zy2Var) {
        return this.f12002b == null ? new C1628c(null, 0L, "模型未初始化") : dg1.withContext(df4.getIO(), new C1629d(bitmap, qy6Var, null), zy2Var);
    }

    @gib
    public final Bitmap resizeTo512(@yfb Bitmap bitmap) {
        md8.checkNotNullParameter(bitmap, "bitmap");
        try {
            if (bitmap.getWidth() <= 512) {
                return null;
            }
            return Bitmap.createScaledBitmap(bitmap, 512, (int) (512 * (bitmap.getHeight() / bitmap.getWidth())), true);
        } catch (Exception e) {
            Log.e(f11995g, "调整图像尺寸失败", e);
            return null;
        }
    }

    @gib
    public final Bitmap resizeUpscaledImage(@yfb Bitmap bitmap, int i, int i2) {
        md8.checkNotNullParameter(bitmap, "upscaledBitmap");
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Log.i(f11995g, "恢复图像尺寸：从" + width + 'x' + height + (char) 21040 + i + 'x' + i2);
            if (width == i && height == i2) {
                Log.i(f11995g, "尺寸已匹配，无需调整");
                return bitmap;
            }
            if (i <= width && i2 <= height) {
                Log.i(f11995g, "使用高质量多步降采样算法");
                Bitmap bitmap2 = bitmap;
                while (true) {
                    if (width <= i && height <= i2) {
                        break;
                    }
                    int iMax = width > i ? Math.max(i, (int) (((double) width) * 0.5d)) : width;
                    int iMax2 = height > i2 ? Math.max(i2, (int) (((double) height) * 0.5d)) : height;
                    StringBuilder sb = new StringBuilder();
                    sb.append("降采样步骤: ");
                    sb.append(width);
                    sb.append('x');
                    sb.append(height);
                    sb.append(" -> ");
                    sb.append(iMax);
                    sb.append('x');
                    sb.append(iMax2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                    md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setFilterBitmap(true);
                    paint.setAntiAlias(true);
                    paint.setDither(false);
                    canvas.drawBitmap(bitmap2, new Rect(0, 0, width, height), new Rect(0, 0, iMax, iMax2), paint);
                    if (!md8.areEqual(bitmap2, bitmap)) {
                        bitmap2.recycle();
                    }
                    if (iMax == i && iMax2 == i2) {
                        height = iMax2;
                        bitmap2 = bitmapCreateBitmap;
                        width = iMax;
                        break;
                    }
                    height = iMax2;
                    bitmap2 = bitmapCreateBitmap;
                    width = iMax;
                }
                if (width != i || height != i2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("最后微调: ");
                    sb2.append(width);
                    sb2.append('x');
                    sb2.append(height);
                    sb2.append(" -> ");
                    sb2.append(i);
                    sb2.append('x');
                    sb2.append(i2);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    md8.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                    Paint paint2 = new Paint();
                    paint2.setFilterBitmap(true);
                    paint2.setAntiAlias(true);
                    paint2.setDither(false);
                    canvas2.drawBitmap(bitmap2, new Rect(0, 0, width, height), new Rect(0, 0, i, i2), paint2);
                    if (!md8.areEqual(bitmap2, bitmap)) {
                        bitmap2.recycle();
                    }
                    bitmap2 = bitmapCreateBitmap2;
                }
                Log.i(f11995g, "✅ 高质量降采样完成: " + i + 'x' + i2);
                return bitmap2;
            }
            Log.i(f11995g, "执行放大操作（不推荐，可能降低质量）");
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        } catch (Exception e) {
            Log.e(f11995g, "调整放大图像尺寸失败", e);
            return null;
        }
    }
}
