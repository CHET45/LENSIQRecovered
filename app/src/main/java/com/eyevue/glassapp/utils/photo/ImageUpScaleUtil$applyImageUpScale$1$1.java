package com.eyevue.glassapp.utils.photo;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.eyevue.glassapp.utils.photo.ImageUpScaleUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p000.bth;
import p000.bw7;
import p000.ck3;
import p000.df4;
import p000.dg1;
import p000.gz6;
import p000.m13;
import p000.md8;
import p000.pd8;
import p000.qy6;
import p000.ugg;
import p000.x13;
import p000.y7e;
import p000.zy2;

/* JADX INFO: loaded from: classes4.dex */
@ck3(m4009c = "com.eyevue.glassapp.utils.photo.ImageUpScaleUtil$applyImageUpScale$1$1", m4010f = "ImageUpScaleUtil.kt", m4011i = {}, m4012l = {48}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
public final class ImageUpScaleUtil$applyImageUpScale$1$1 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ qy6<ImageUpScaleUtil.ImageUpScaleResult, bth> $block;
    final /* synthetic */ bw7.EnumC2079b $delegate;
    final /* synthetic */ Bitmap $originBitmap;
    final /* synthetic */ qy6<Float, bth> $progressCallback;
    final /* synthetic */ boolean $resizeAfterUpscale;
    final /* synthetic */ float $resizePercent;
    final /* synthetic */ boolean $saveAfterUpscaled;
    int label;
    final /* synthetic */ ImageUpScaleUtil this$0;

    /* JADX INFO: renamed from: com.eyevue.glassapp.utils.photo.ImageUpScaleUtil$applyImageUpScale$1$1$1 */
    @ck3(m4009c = "com.eyevue.glassapp.utils.photo.ImageUpScaleUtil$applyImageUpScale$1$1$1", m4010f = "ImageUpScaleUtil.kt", m4011i = {0}, m4012l = {58}, m4013m = "invokeSuspend", m4014n = {"tempFile"}, m4015s = {"L$0"})
    public static final class C26831 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ qy6<ImageUpScaleUtil.ImageUpScaleResult, bth> $block;
        final /* synthetic */ bw7.EnumC2079b $delegate;
        final /* synthetic */ Bitmap $originBitmap;
        final /* synthetic */ qy6<Float, bth> $progressCallback;
        final /* synthetic */ boolean $resizeAfterUpscale;
        final /* synthetic */ float $resizePercent;
        final /* synthetic */ boolean $saveAfterUpscaled;
        final /* synthetic */ long $startTime;
        Object L$0;
        int label;
        final /* synthetic */ ImageUpScaleUtil this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26831(ImageUpScaleUtil imageUpScaleUtil, FragmentActivity fragmentActivity, Bitmap bitmap, boolean z, float f, boolean z2, bw7.EnumC2079b enumC2079b, qy6<? super Float, bth> qy6Var, long j, qy6<? super ImageUpScaleUtil.ImageUpScaleResult, bth> qy6Var2, zy2<? super C26831> zy2Var) {
            super(2, zy2Var);
            this.this$0 = imageUpScaleUtil;
            this.$activity = fragmentActivity;
            this.$originBitmap = bitmap;
            this.$saveAfterUpscaled = z;
            this.$resizePercent = f;
            this.$resizeAfterUpscale = z2;
            this.$delegate = enumC2079b;
            this.$progressCallback = qy6Var;
            this.$startTime = j;
            this.$block = qy6Var2;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C26831(this.this$0, this.$activity, this.$originBitmap, this.$saveAfterUpscaled, this.$resizePercent, this.$resizeAfterUpscale, this.$delegate, this.$progressCallback, this.$startTime, this.$block, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C26831) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) throws IOException {
            File file;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                bw7 bw7Var = this.this$0.imageUpscaler;
                if (!(bw7Var != null ? bw7.initialize$default(bw7Var, null, null, 3, null) : false)) {
                    this.$block.invoke(new ImageUpScaleUtil.ImageUpScaleResult(-1, "image upscale sdk init fail", null, 0L, 12, null));
                    return bth.f14751a;
                }
                File file2 = new File(this.$activity.getCacheDir(), "temp_input_" + System.currentTimeMillis() + ".png");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                this.$originBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                bw7 bw7Var2 = this.this$0.imageUpscaler;
                md8.checkNotNull(bw7Var2);
                String absolutePath = file2.getAbsolutePath();
                md8.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                boolean z = this.$saveAfterUpscaled;
                float f = this.$resizePercent;
                boolean z2 = this.$resizeAfterUpscale;
                bw7.EnumC2079b enumC2079b = this.$delegate;
                qy6<Float, bth> qy6Var = this.$progressCallback;
                this.L$0 = file2;
                this.label = 1;
                Object objUpscaleImage = bw7Var2.upscaleImage(absolutePath, z, f, z2, enumC2079b, qy6Var, this);
                if (objUpscaleImage == coroutine_suspended) {
                    return coroutine_suspended;
                }
                file = file2;
                obj = objUpscaleImage;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) this.L$0;
                y7e.throwOnFailure(obj);
            }
            bw7.C2080c c2080c = (bw7.C2080c) obj;
            file.delete();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.$startTime;
            if (!c2080c.getSuccess()) {
                qy6<ImageUpScaleUtil.ImageUpScaleResult, bth> qy6Var2 = this.$block;
                String errorMessage = c2080c.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                qy6Var2.invoke(new ImageUpScaleUtil.ImageUpScaleResult(-1, errorMessage, null, jCurrentTimeMillis, 4, null));
            } else if (c2080c.getOutputBitmap() != null) {
                this.$block.invoke(new ImageUpScaleUtil.ImageUpScaleResult(0, null, c2080c.getOutputBitmap(), jCurrentTimeMillis, 2, null));
            } else {
                this.$block.invoke(new ImageUpScaleUtil.ImageUpScaleResult(-1, "unknown error", null, jCurrentTimeMillis, 4, null));
            }
            return bth.f14751a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageUpScaleUtil$applyImageUpScale$1$1(ImageUpScaleUtil imageUpScaleUtil, FragmentActivity fragmentActivity, Bitmap bitmap, boolean z, float f, boolean z2, bw7.EnumC2079b enumC2079b, qy6<? super Float, bth> qy6Var, qy6<? super ImageUpScaleUtil.ImageUpScaleResult, bth> qy6Var2, zy2<? super ImageUpScaleUtil$applyImageUpScale$1$1> zy2Var) {
        super(2, zy2Var);
        this.this$0 = imageUpScaleUtil;
        this.$activity = fragmentActivity;
        this.$originBitmap = bitmap;
        this.$saveAfterUpscaled = z;
        this.$resizePercent = f;
        this.$resizeAfterUpscale = z2;
        this.$delegate = enumC2079b;
        this.$progressCallback = qy6Var;
        this.$block = qy6Var2;
    }

    @Override // p000.tq0
    public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
        return new ImageUpScaleUtil$applyImageUpScale$1$1(this.this$0, this.$activity, this.$originBitmap, this.$saveAfterUpscaled, this.$resizePercent, this.$resizeAfterUpscale, this.$delegate, this.$progressCallback, this.$block, zy2Var);
    }

    @Override // p000.gz6
    public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
        return ((ImageUpScaleUtil$applyImageUpScale$1$1) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
    }

    @Override // p000.tq0
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            y7e.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            m13 io2 = df4.getIO();
            C26831 c26831 = new C26831(this.this$0, this.$activity, this.$originBitmap, this.$saveAfterUpscaled, this.$resizePercent, this.$resizeAfterUpscale, this.$delegate, this.$progressCallback, jCurrentTimeMillis, this.$block, null);
            this.label = 1;
            if (dg1.withContext(io2, c26831, this) == coroutine_suspended) {
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
