package com.eyevue.glassapp.utils.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import p000.bth;
import p000.ck3;
import p000.df4;
import p000.e0g;
import p000.fg1;
import p000.gz6;
import p000.h59;
import p000.md8;
import p000.mu5;
import p000.pd8;
import p000.qy6;
import p000.scc;
import p000.u52;
import p000.ugg;
import p000.wc1;
import p000.x13;
import p000.y7e;
import p000.yfb;
import p000.zy2;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 1)
public final class KtImageUtils {
    public static final int $stable = 0;

    @yfb
    public static final KtImageUtils INSTANCE = new KtImageUtils();

    /* JADX INFO: renamed from: com.eyevue.glassapp.utils.photo.KtImageUtils$saveImageToMedia$1 */
    @ck3(m4009c = "com.eyevue.glassapp.utils.photo.KtImageUtils$saveImageToMedia$1", m4010f = "KtImageUtils.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C26841 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ qy6<scc<String, String>, bth> $block;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26841(Uri uri, FragmentActivity fragmentActivity, qy6<? super scc<String, String>, bth> qy6Var, Bitmap bitmap, zy2<? super C26841> zy2Var) {
            super(2, zy2Var);
            this.$uri = uri;
            this.$activity = fragmentActivity;
            this.$block = qy6Var;
            this.$bitmap = bitmap;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C26841(this.$uri, this.$activity, this.$block, this.$bitmap, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C26841) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            File file = new File(this.$uri.getPath());
            StringBuilder sb = new StringBuilder();
            sb.append("保存图片，原始地址：url:");
            sb.append(file.getPath());
            sb.append(",文件名字：");
            sb.append(mu5.getNameWithoutExtension(file));
            sb.append(",文件后缀:");
            sb.append(mu5.getExtension(file));
            File file2 = new File(this.$activity.getFilesDir(), "media/" + mu5.getNameWithoutExtension(file) + "_filter." + mu5.getExtension(file));
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                wc1.boxBoolean(parentFile.mkdirs());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                this.$bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                bth bthVar = bth.f14751a;
                u52.closeFinally(fileOutputStream, null);
                this.$block.invoke(new scc<>(Uri.fromFile(file2).toString(), file2.getName()));
                return bthVar;
            } finally {
            }
        }
    }

    private KtImageUtils() {
    }

    private final float calculateValue(int i) {
        return (float) (Math.rint((((double) ((int) Math.ceil(((double) i) * 0.147d))) / 165.0d) * 10.0d) / 10.0d);
    }

    private final InputStream getInputStream(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    return context.getContentResolver().openInputStream(uri);
                }
            } else if (scheme.equals("file")) {
                return new FileInputStream(new File(uri.getPath()));
            }
        }
        String path = uri.getPath();
        if (path != null) {
            return new FileInputStream(new File(path));
        }
        return null;
    }

    public final float calculateImageValue(@yfb Context context, @yfb Uri uri) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(uri, "imageUri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            InputStream inputStream = getInputStream(context, uri);
            if (inputStream == null) {
                return 1.0f;
            }
            BitmapFactory.decodeStream(inputStream, null, options);
            inputStream.close();
            int i = options.outWidth;
            if (i <= 0) {
                return 1.0f;
            }
            return calculateValue(i);
        } catch (Exception e) {
            e.printStackTrace();
            return 1.0f;
        }
    }

    public final void saveImageToMedia(@yfb FragmentActivity fragmentActivity, @yfb Uri uri, @yfb Bitmap bitmap, @yfb qy6<? super scc<String, String>, bth> qy6Var) {
        md8.checkNotNullParameter(fragmentActivity, "activity");
        md8.checkNotNullParameter(uri, "uri");
        md8.checkNotNullParameter(bitmap, "bitmap");
        md8.checkNotNullParameter(qy6Var, "block");
        try {
            fg1.launch$default(h59.getLifecycleScope(fragmentActivity), df4.getIO(), null, new C26841(uri, fragmentActivity, qy6Var, bitmap, null), 2, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
