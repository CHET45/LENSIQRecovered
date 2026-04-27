package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.aw7;

/* JADX INFO: loaded from: classes8.dex */
@dwf({"SMAP\nImageUpscaler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUpscaler.kt\nwatchfun/image/ImageUpscaler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,679:1\n1549#2:680\n1620#2,3:681\n*S KotlinDebug\n*F\n+ 1 ImageUpscaler.kt\nwatchfun/image/ImageUpscaler\n*L\n484#1:680\n484#1:681,3\n*E\n"})
public final class bw7 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C2078a f15022g = new C2078a(null);

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f15023h = "ImageUpscaler";

    /* JADX INFO: renamed from: i */
    @yfb
    public static final String f15024i = "real_esrgan_general_x4v3-real-esrgan-general-x4v3-w8a8.tflite";

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f15025a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final rac f15026b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final aw7 f15027c;

    /* JADX INFO: renamed from: d */
    public boolean f15028d;

    /* JADX INFO: renamed from: e */
    public boolean f15029e;

    /* JADX INFO: renamed from: f */
    @gib
    public String f15030f;

    /* JADX INFO: renamed from: bw7$a */
    public static final class C2078a {
        public /* synthetic */ C2078a(jt3 jt3Var) {
            this();
        }

        private C2078a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: bw7$b */
    public static final class EnumC2079b {

        /* JADX INFO: renamed from: a */
        public static final EnumC2079b f15031a = new EnumC2079b("CPU", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC2079b f15032b = new EnumC2079b("NNAPI", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC2079b[] f15033c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ v35 f15034d;

        private static final /* synthetic */ EnumC2079b[] $values() {
            return new EnumC2079b[]{f15031a, f15032b};
        }

        static {
            EnumC2079b[] enumC2079bArr$values = $values();
            f15033c = enumC2079bArr$values;
            f15034d = x35.enumEntries(enumC2079bArr$values);
        }

        private EnumC2079b(String str, int i) {
        }

        @yfb
        public static v35<EnumC2079b> getEntries() {
            return f15034d;
        }

        public static EnumC2079b valueOf(String str) {
            return (EnumC2079b) Enum.valueOf(EnumC2079b.class, str);
        }

        public static EnumC2079b[] values() {
            return (EnumC2079b[]) f15033c.clone();
        }
    }

    /* JADX INFO: renamed from: bw7$c */
    public static final class C2080c {

        /* JADX INFO: renamed from: a */
        public final boolean f15035a;

        /* JADX INFO: renamed from: b */
        @gib
        public final Bitmap f15036b;

        /* JADX INFO: renamed from: c */
        public final long f15037c;

        /* JADX INFO: renamed from: d */
        @gib
        public final String f15038d;

        /* JADX INFO: renamed from: e */
        @gib
        public final String f15039e;

        public C2080c(boolean z, @gib Bitmap bitmap, long j, @gib String str, @gib String str2) {
            this.f15035a = z;
            this.f15036b = bitmap;
            this.f15037c = j;
            this.f15038d = str;
            this.f15039e = str2;
        }

        public static /* synthetic */ C2080c copy$default(C2080c c2080c, boolean z, Bitmap bitmap, long j, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c2080c.f15035a;
            }
            if ((i & 2) != 0) {
                bitmap = c2080c.f15036b;
            }
            Bitmap bitmap2 = bitmap;
            if ((i & 4) != 0) {
                j = c2080c.f15037c;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str = c2080c.f15038d;
            }
            String str3 = str;
            if ((i & 16) != 0) {
                str2 = c2080c.f15039e;
            }
            return c2080c.copy(z, bitmap2, j2, str3, str2);
        }

        public final boolean component1() {
            return this.f15035a;
        }

        @gib
        public final Bitmap component2() {
            return this.f15036b;
        }

        public final long component3() {
            return this.f15037c;
        }

        @gib
        public final String component4() {
            return this.f15038d;
        }

        @gib
        public final String component5() {
            return this.f15039e;
        }

        @yfb
        public final C2080c copy(boolean z, @gib Bitmap bitmap, long j, @gib String str, @gib String str2) {
            return new C2080c(z, bitmap, j, str, str2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2080c)) {
                return false;
            }
            C2080c c2080c = (C2080c) obj;
            return this.f15035a == c2080c.f15035a && md8.areEqual(this.f15036b, c2080c.f15036b) && this.f15037c == c2080c.f15037c && md8.areEqual(this.f15038d, c2080c.f15038d) && md8.areEqual(this.f15039e, c2080c.f15039e);
        }

        @gib
        public final String getErrorMessage() {
            return this.f15039e;
        }

        public final long getInferenceTime() {
            return this.f15037c;
        }

        @gib
        public final Bitmap getOutputBitmap() {
            return this.f15036b;
        }

        @gib
        public final String getSavedPath() {
            return this.f15038d;
        }

        public final boolean getSuccess() {
            return this.f15035a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        public int hashCode() {
            boolean z = this.f15035a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            Bitmap bitmap = this.f15036b;
            int iHashCode = (((i + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Long.hashCode(this.f15037c)) * 31;
            String str = this.f15038d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f15039e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @yfb
        public String toString() {
            return "UpscaleResult(success=" + this.f15035a + ", outputBitmap=" + this.f15036b + ", inferenceTime=" + this.f15037c + ", savedPath=" + this.f15038d + ", errorMessage=" + this.f15039e + ')';
        }
    }

    /* JADX INFO: renamed from: bw7$d */
    public /* synthetic */ class C2081d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15040a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f15041b;

        static {
            int[] iArr = new int[EnumC2079b.values().length];
            try {
                iArr[EnumC2079b.f15031a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2079b.f15032b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15040a = iArr;
            int[] iArr2 = new int[aw7.EnumC1627b.values().length];
            try {
                iArr2[aw7.EnumC1627b.f12006a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[aw7.EnumC1627b.f12007b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f15041b = iArr2;
        }
    }

    /* JADX INFO: renamed from: bw7$e */
    @ck3(m4009c = "watchfun.image.ImageUpscaler$initializeBlocking$1", m4010f = "ImageUpscaler.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2082e extends ugg implements gz6<x13, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f15042a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f15044c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ EnumC2079b f15045d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2082e(String str, EnumC2079b enumC2079b, zy2<? super C2082e> zy2Var) {
            super(2, zy2Var);
            this.f15044c = str;
            this.f15045d = enumC2079b;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return bw7.this.new C2082e(this.f15044c, this.f15045d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Boolean> zy2Var) {
            return ((C2082e) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f15042a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            boolean z = false;
            try {
                boolean zInitialize = bw7.this.initialize(this.f15044c, this.f15045d);
                StringBuilder sb = new StringBuilder();
                sb.append("ImageUpscaler blocking initialization: ");
                sb.append(zInitialize);
                z = zInitialize;
            } catch (Exception e) {
                Log.e(bw7.f15023h, "Error in blocking initialization", e);
            }
            return wc1.boxBoolean(z);
        }
    }

    /* JADX INFO: renamed from: bw7$f */
    @ck3(m4009c = "watchfun.image.ImageUpscaler$loadImageFromPath$2", m4010f = "ImageUpscaler.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nImageUpscaler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUpscaler.kt\nwatchfun/image/ImageUpscaler$loadImageFromPath$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,679:1\n1#2:680\n*E\n"})
    public static final class C2083f extends ugg implements gz6<x13, zy2<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: a */
        public int f15046a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f15047b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bw7 f15048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2083f(String str, bw7 bw7Var, zy2<? super C2083f> zy2Var) {
            super(2, zy2Var);
            this.f15047b = str;
            this.f15048c = bw7Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C2083f(this.f15047b, this.f15048c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super Bitmap> zy2Var) {
            return ((C2083f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f15046a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            Bitmap bitmapDecodeStream = null;
            try {
                if (!h9g.startsWith$default(this.f15047b, "content://", false, 2, null)) {
                    if (new File(this.f15047b).exists()) {
                        return BitmapFactory.decodeFile(this.f15047b);
                    }
                    try {
                        InputStream inputStreamOpen = this.f15048c.f15025a.getAssets().open(this.f15047b);
                        md8.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        return bitmapDecodeStream;
                    } catch (Exception e) {
                        Log.e(bw7.f15023h, "无法从assets加载图像: " + this.f15047b, e);
                        return null;
                    }
                }
                InputStream inputStreamOpenInputStream = this.f15048c.f15025a.getContentResolver().openInputStream(Uri.parse(this.f15047b));
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                try {
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                    u52.closeFinally(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream2;
                } finally {
                }
            } catch (Exception e2) {
                Log.e(bw7.f15023h, "加载图像失败: " + this.f15047b, e2);
                return bitmapDecodeStream;
            }
            Log.e(bw7.f15023h, "加载图像失败: " + this.f15047b, e2);
            return bitmapDecodeStream;
        }
    }

    /* JADX INFO: renamed from: bw7$g */
    @ck3(m4009c = "watchfun.image.ImageUpscaler$saveImageToDocuments$2", m4010f = "ImageUpscaler.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2084g extends ugg implements gz6<x13, zy2<? super String>, Object> {

        /* JADX INFO: renamed from: a */
        public int f15049a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f15050b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bitmap f15051c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2084g(String str, Bitmap bitmap, zy2<? super C2084g> zy2Var) {
            super(2, zy2Var);
            this.f15050b = str;
            this.f15051c = bitmap;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C2084g(this.f15050b, this.f15051c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super String> zy2Var) {
            return ((C2084g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f15049a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            try {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
                if (!externalStoragePublicDirectory.exists()) {
                    externalStoragePublicDirectory.mkdirs();
                }
                File file = new File(externalStoragePublicDirectory, this.f15050b + "_result_" + System.currentTimeMillis() + ".jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.f15051c.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    bth bthVar = bth.f14751a;
                    u52.closeFinally(fileOutputStream, null);
                    Log.i(bw7.f15023h, "图像已保存到: " + file.getAbsolutePath());
                    StringBuilder sb = new StringBuilder();
                    sb.append("输出文件大小: ");
                    l7g l7gVar = l7g.f56714a;
                    String str = String.format("%.2f", Arrays.copyOf(new Object[]{wc1.boxDouble(file.length() / 1048576.0d)}, 1));
                    md8.checkNotNullExpressionValue(str, "format(format, *args)");
                    sb.append(str);
                    sb.append(" MB (JPEG质量90%)");
                    Log.i(bw7.f15023h, sb.toString());
                    return file.getAbsolutePath();
                } finally {
                }
            } catch (Exception e) {
                Log.e(bw7.f15023h, "保存图像失败", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: bw7$h */
    @ck3(m4009c = "watchfun.image.ImageUpscaler", m4010f = "ImageUpscaler.kt", m4011i = {0, 0, 0, 0, 0, 0, 0}, m4012l = {213}, m4013m = "simulateSmoothProgress", m4014n = {"progressCallback", "startProgress", "endProgress", "targetDurationMs", "currentProgress", "totalProgress", "startTime"}, m4015s = {"L$0", "F$0", "F$1", "J$0", "F$2", "F$3", "J$1"})
    public static final class C2085h extends cz2 {

        /* JADX INFO: renamed from: C */
        public /* synthetic */ Object f15052C;

        /* JADX INFO: renamed from: H */
        public int f15054H;

        /* JADX INFO: renamed from: a */
        public float f15055a;

        /* JADX INFO: renamed from: b */
        public float f15056b;

        /* JADX INFO: renamed from: c */
        public float f15057c;

        /* JADX INFO: renamed from: d */
        public float f15058d;

        /* JADX INFO: renamed from: e */
        public long f15059e;

        /* JADX INFO: renamed from: f */
        public long f15060f;

        /* JADX INFO: renamed from: m */
        public Object f15061m;

        public C2085h(zy2<? super C2085h> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f15052C = obj;
            this.f15054H |= Integer.MIN_VALUE;
            return bw7.this.simulateSmoothProgress(0.0f, 0.0f, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: bw7$i */
    @ck3(m4009c = "watchfun.image.ImageUpscaler$upscaleImage$2", m4010f = "ImageUpscaler.kt", m4011i = {0, 1, 1, 1, 1, 2, 2, 2}, m4012l = {293, 400, 434}, m4013m = "invokeSuspend", m4014n = {"progressJob", "originalBitmap", "bitmapToProcess", "originalWidth", "originalHeight", "originalBitmap", "upscaleResult", "finalBitmap"}, m4015s = {"L$0", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2"})
    public static final class C2086i extends ugg implements gz6<x13, zy2<? super C2080c>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f15062C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ float f15063F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean f15064H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ EnumC2079b f15065L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ bw7 f15066M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ qy6<Float, bth> f15067N;

        /* JADX INFO: renamed from: a */
        public Object f15068a;

        /* JADX INFO: renamed from: b */
        public Object f15069b;

        /* JADX INFO: renamed from: c */
        public int f15070c;

        /* JADX INFO: renamed from: d */
        public int f15071d;

        /* JADX INFO: renamed from: e */
        public int f15072e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f15073f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ String f15074m;

        /* JADX INFO: renamed from: bw7$i$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f15075a;

            static {
                int[] iArr = new int[EnumC2079b.values().length];
                try {
                    iArr[EnumC2079b.f15031a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2079b.f15032b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f15075a = iArr;
            }
        }

        /* JADX INFO: renamed from: bw7$i$b */
        @ck3(m4009c = "watchfun.image.ImageUpscaler$upscaleImage$2$progressJob$1", m4010f = "ImageUpscaler.kt", m4011i = {}, m4012l = {289}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f15076a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ bw7 f15077b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qy6<Float, bth> f15078c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(bw7 bw7Var, qy6<? super Float, bth> qy6Var, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f15077b = bw7Var;
                this.f15078c = qy6Var;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f15077b, this.f15078c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f15076a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    bw7 bw7Var = this.f15077b;
                    qy6<Float, bth> qy6Var = this.f15078c;
                    this.f15076a = 1;
                    if (bw7Var.simulateSmoothProgress(0.0f, 25.0f, 4000L, qy6Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2086i(String str, boolean z, float f, boolean z2, EnumC2079b enumC2079b, bw7 bw7Var, qy6<? super Float, bth> qy6Var, zy2<? super C2086i> zy2Var) {
            super(2, zy2Var);
            this.f15074m = str;
            this.f15062C = z;
            this.f15063F = f;
            this.f15064H = z2;
            this.f15065L = enumC2079b;
            this.f15066M = bw7Var;
            this.f15067N = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C2086i c2086i = new C2086i(this.f15074m, this.f15062C, this.f15063F, this.f15064H, this.f15065L, this.f15066M, this.f15067N, zy2Var);
            c2086i.f15073f = obj;
            return c2086i;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super C2080c> zy2Var) {
            return ((C2086i) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x02bc A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:8:0x0024, B:95:0x036c, B:97:0x0375, B:99:0x0382, B:100:0x0389, B:15:0x0043, B:73:0x02b4, B:75:0x02bc, B:76:0x02bf, B:78:0x02c5, B:81:0x02d6, B:83:0x02e4, B:85:0x0314, B:87:0x0340, B:89:0x034e, B:91:0x0352, B:88:0x0345, B:18:0x0051, B:24:0x00c9, B:26:0x00cd, B:28:0x00ec, B:43:0x0182, B:45:0x01b5, B:58:0x0254, B:62:0x0264, B:66:0x026f, B:68:0x0289, B:69:0x0292, B:63:0x0267, B:64:0x026c, B:65:0x026d, B:21:0x005f), top: B:104:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x02c5 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:8:0x0024, B:95:0x036c, B:97:0x0375, B:99:0x0382, B:100:0x0389, B:15:0x0043, B:73:0x02b4, B:75:0x02bc, B:76:0x02bf, B:78:0x02c5, B:81:0x02d6, B:83:0x02e4, B:85:0x0314, B:87:0x0340, B:89:0x034e, B:91:0x0352, B:88:0x0345, B:18:0x0051, B:24:0x00c9, B:26:0x00cd, B:28:0x00ec, B:43:0x0182, B:45:0x01b5, B:58:0x0254, B:62:0x0264, B:66:0x026f, B:68:0x0289, B:69:0x0292, B:63:0x0267, B:64:0x026c, B:65:0x026d, B:21:0x005f), top: B:104:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02e4 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:8:0x0024, B:95:0x036c, B:97:0x0375, B:99:0x0382, B:100:0x0389, B:15:0x0043, B:73:0x02b4, B:75:0x02bc, B:76:0x02bf, B:78:0x02c5, B:81:0x02d6, B:83:0x02e4, B:85:0x0314, B:87:0x0340, B:89:0x034e, B:91:0x0352, B:88:0x0345, B:18:0x0051, B:24:0x00c9, B:26:0x00cd, B:28:0x00ec, B:43:0x0182, B:45:0x01b5, B:58:0x0254, B:62:0x0264, B:66:0x026f, B:68:0x0289, B:69:0x0292, B:63:0x0267, B:64:0x026c, B:65:0x026d, B:21:0x005f), top: B:104:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0382 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:8:0x0024, B:95:0x036c, B:97:0x0375, B:99:0x0382, B:100:0x0389, B:15:0x0043, B:73:0x02b4, B:75:0x02bc, B:76:0x02bf, B:78:0x02c5, B:81:0x02d6, B:83:0x02e4, B:85:0x0314, B:87:0x0340, B:89:0x034e, B:91:0x0352, B:88:0x0345, B:18:0x0051, B:24:0x00c9, B:26:0x00cd, B:28:0x00ec, B:43:0x0182, B:45:0x01b5, B:58:0x0254, B:62:0x0264, B:66:0x026f, B:68:0x0289, B:69:0x0292, B:63:0x0267, B:64:0x026c, B:65:0x026d, B:21:0x005f), top: B:104:0x0010 }] */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 986
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.bw7.C2086i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bw7$j */
    @ck3(m4009c = "watchfun.image.ImageUpscaler$upscaleImageBlocking$1", m4010f = "ImageUpscaler.kt", m4011i = {}, m4012l = {649}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2087j extends ugg implements gz6<x13, zy2<? super C2080c>, Object> {

        /* JADX INFO: renamed from: a */
        public int f15079a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f15080b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f15081c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f15082d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f15083e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ bw7 f15084f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ qy6<Float, bth> f15085m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2087j(String str, boolean z, float f, boolean z2, bw7 bw7Var, qy6<? super Float, bth> qy6Var, zy2<? super C2087j> zy2Var) {
            super(2, zy2Var);
            this.f15080b = str;
            this.f15081c = z;
            this.f15082d = f;
            this.f15083e = z2;
            this.f15084f = bw7Var;
            this.f15085m = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C2087j(this.f15080b, this.f15081c, this.f15082d, this.f15083e, this.f15084f, this.f15085m, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super C2080c> zy2Var) {
            return ((C2087j) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f15079a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Starting blocking upscale for: ");
                    sb.append(this.f15080b);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameters - saveAfterUpscaled: ");
                    sb2.append(this.f15081c);
                    sb2.append(", smallerImageByPercentage: ");
                    sb2.append(this.f15082d);
                    sb2.append(", resizeAfterUpscale: ");
                    sb2.append(this.f15083e);
                    bw7 bw7Var = this.f15084f;
                    String str = this.f15080b;
                    boolean z = this.f15081c;
                    float f = this.f15082d;
                    boolean z2 = this.f15083e;
                    EnumC2079b enumC2079b = EnumC2079b.f15032b;
                    qy6<Float, bth> qy6Var = this.f15085m;
                    this.f15079a = 1;
                    obj = bw7Var.upscaleImage(str, z, f, z2, enumC2079b, qy6Var, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                C2080c c2080c = (C2080c) obj;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Blocking upscale completed - success: ");
                sb3.append(c2080c.getSuccess());
                if (!c2080c.getSuccess()) {
                    Log.e(bw7.f15023h, "Blocking upscale failed: " + c2080c.getErrorMessage());
                    return c2080c;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Output bitmap size: ");
                Bitmap outputBitmap = c2080c.getOutputBitmap();
                sb4.append(outputBitmap != null ? wc1.boxInt(outputBitmap.getWidth()) : null);
                sb4.append('x');
                Bitmap outputBitmap2 = c2080c.getOutputBitmap();
                sb4.append(outputBitmap2 != null ? wc1.boxInt(outputBitmap2.getHeight()) : null);
                return c2080c;
            } catch (Exception e) {
                Log.e(bw7.f15023h, "Error in blocking upscale", e);
                return new C2080c(false, null, 0L, null, "Blocking upscale failed: " + e.getMessage());
            }
        }
    }

    public bw7(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        this.f15025a = context;
        rac racVar = new rac(context);
        this.f15026b = racVar;
        this.f15027c = new aw7(context);
        try {
            racVar.validate();
            this.f15029e = true;
            StringBuilder sb = new StringBuilder();
            sb.append("✅ SDK授权验证通过: ");
            sb.append(racVar.getCurrentPackageName());
        } catch (SecurityException e) {
            this.f15029e = false;
            Log.e(f15023h, "❌ SDK授权验证失败: " + e.getMessage());
            throw e;
        }
    }

    public static /* synthetic */ boolean initialize$default(bw7 bw7Var, String str, EnumC2079b enumC2079b, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            enumC2079b = EnumC2079b.f15032b;
        }
        return bw7Var.initialize(str, enumC2079b);
    }

    public static /* synthetic */ boolean initializeBlocking$default(bw7 bw7Var, String str, EnumC2079b enumC2079b, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            enumC2079b = EnumC2079b.f15032b;
        }
        return bw7Var.initializeBlocking(str, enumC2079b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadImageFromPath(String str, zy2<? super Bitmap> zy2Var) {
        return dg1.withContext(df4.getIO(), new C2083f(str, this, null), zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveImageToDocuments(Bitmap bitmap, String str, zy2<? super String> zy2Var) {
        return dg1.withContext(df4.getIO(), new C2084g(str, bitmap, null), zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cb -> B:28:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object simulateSmoothProgress(float r21, float r22, long r23, p000.qy6<? super java.lang.Float, p000.bth> r25, p000.zy2<? super p000.bth> r26) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bw7.simulateSmoothProgress(float, float, long, qy6, zy2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2080c upscaleImageBlocking$default(bw7 bw7Var, String str, boolean z, float f, boolean z2, qy6 qy6Var, int i, Object obj) {
        boolean z3 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            f = 0.75f;
        }
        float f2 = f;
        boolean z4 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            qy6Var = null;
        }
        return bw7Var.upscaleImageBlocking(str, z3, f2, z4, qy6Var);
    }

    public final void cleanup() {
        Log.i(f15023h, "清理图像增强器资源");
        this.f15027c.cleanup();
        this.f15028d = false;
        this.f15030f = null;
    }

    @yfb
    public final List<EnumC2079b> getAvailableDelegates() {
        EnumC2079b enumC2079b;
        List<aw7.EnumC1627b> availableDelegates = this.f15027c.getAvailableDelegates();
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(availableDelegates, 10));
        Iterator<T> it = availableDelegates.iterator();
        while (it.hasNext()) {
            int i = C2081d.f15041b[((aw7.EnumC1627b) it.next()).ordinal()];
            if (i == 1) {
                enumC2079b = EnumC2079b.f15031a;
            } else {
                if (i != 2) {
                    throw new ceb();
                }
                enumC2079b = EnumC2079b.f15032b;
            }
            arrayList.add(enumC2079b);
        }
        return arrayList;
    }

    public final boolean initialize(@gib String str, @yfb EnumC2079b enumC2079b) {
        aw7.EnumC1627b enumC1627b;
        md8.checkNotNullParameter(enumC2079b, "delegate");
        if (!this.f15029e) {
            throw new SecurityException("SDK未授权: 请使用有效的Context初始化ImageUpscaler");
        }
        if (str == null) {
            str = "real_esrgan_general_x4v3-real-esrgan-general-x4v3-w8a8.tflite";
        }
        try {
            Log.i(f15023h, "正在初始化图像增强器，模型: " + str + ", 代理: " + enumC2079b);
            int i = C2081d.f15040a[enumC2079b.ordinal()];
            if (i == 1) {
                enumC1627b = aw7.EnumC1627b.f12006a;
            } else {
                if (i != 2) {
                    throw new ceb();
                }
                enumC1627b = aw7.EnumC1627b.f12007b;
            }
            boolean zInitializeModel = this.f15027c.initializeModel(str, enumC1627b);
            if (!zInitializeModel) {
                Log.e(f15023h, "图像增强器初始化失败");
                return zInitializeModel;
            }
            this.f15028d = true;
            this.f15030f = str;
            Log.i(f15023h, "图像增强器初始化成功");
            return zInitializeModel;
        } catch (Exception e) {
            Log.e(f15023h, "初始化过程中发生异常", e);
            return false;
        }
    }

    @yn8
    public final boolean initializeBlocking() {
        return initializeBlocking$default(this, null, null, 3, null);
    }

    @gib
    public final Object upscaleImage(@yfb String str, boolean z, float f, boolean z2, @yfb EnumC2079b enumC2079b, @gib qy6<? super Float, bth> qy6Var, @yfb zy2<? super C2080c> zy2Var) {
        if (!this.f15029e) {
            throw new SecurityException("SDK未授权: 应用包名未在授权列表中");
        }
        if (this.f15028d) {
            return dg1.withContext(df4.getIO(), new C2086i(str, z, f, z2, enumC2079b, this, qy6Var, null), zy2Var);
        }
        Log.e(f15023h, "图像增强器未初始化，请先调用initialize()方法");
        return new C2080c(false, null, 0L, null, "图像增强器未初始化");
    }

    @yfb
    @yn8
    public final C2080c upscaleImageBlocking(@yfb String str) {
        md8.checkNotNullParameter(str, "imagePath");
        return upscaleImageBlocking$default(this, str, false, 0.0f, false, null, 30, null);
    }

    @yn8
    public final boolean initializeBlocking(@gib String str) {
        return initializeBlocking$default(this, str, null, 2, null);
    }

    @yfb
    @yn8
    public final C2080c upscaleImageBlocking(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "imagePath");
        return upscaleImageBlocking$default(this, str, z, 0.0f, false, null, 28, null);
    }

    @yn8
    public final boolean initializeBlocking(@gib String str, @yfb EnumC2079b enumC2079b) {
        md8.checkNotNullParameter(enumC2079b, "delegate");
        return ((Boolean) eg1.runBlocking$default(null, new C2082e(str, enumC2079b, null), 1, null)).booleanValue();
    }

    @yfb
    @yn8
    public final C2080c upscaleImageBlocking(@yfb String str, boolean z, float f) {
        md8.checkNotNullParameter(str, "imagePath");
        return upscaleImageBlocking$default(this, str, z, f, false, null, 24, null);
    }

    @yfb
    @yn8
    public final C2080c upscaleImageBlocking(@yfb String str, boolean z, float f, boolean z2) {
        md8.checkNotNullParameter(str, "imagePath");
        return upscaleImageBlocking$default(this, str, z, f, z2, null, 16, null);
    }

    @yfb
    @yn8
    public final C2080c upscaleImageBlocking(@yfb String str, boolean z, float f, boolean z2, @gib qy6<? super Float, bth> qy6Var) {
        md8.checkNotNullParameter(str, "imagePath");
        return (C2080c) eg1.runBlocking$default(null, new C2087j(str, z, f, z2, this, qy6Var, null), 1, null);
    }
}
