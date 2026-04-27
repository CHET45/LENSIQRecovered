package com.eyevue.glassapp.utils.photo;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import cn.watchfun.stylefilter.WQStyleFilter;
import com.eyevue.glassapp.utils.photo.StyleFilterUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p000.bth;
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
@ck3(m4009c = "com.eyevue.glassapp.utils.photo.StyleFilterUtil$applyStyleFilter$1$1", m4010f = "StyleFilterUtil.kt", m4011i = {}, m4012l = {49}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
public final class StyleFilterUtil$applyStyleFilter$1$1 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ qy6<StyleFilterUtil.StyleFilterResult, bth> $block;
    final /* synthetic */ String $cubePath;
    final /* synthetic */ Bitmap $originBitmap;
    int label;

    /* JADX INFO: renamed from: com.eyevue.glassapp.utils.photo.StyleFilterUtil$applyStyleFilter$1$1$1 */
    @ck3(m4009c = "com.eyevue.glassapp.utils.photo.StyleFilterUtil$applyStyleFilter$1$1$1", m4010f = "StyleFilterUtil.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C26851 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ qy6<StyleFilterUtil.StyleFilterResult, bth> $block;
        final /* synthetic */ String $cubePath;
        final /* synthetic */ Bitmap $originBitmap;
        final /* synthetic */ long $startTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26851(FragmentActivity fragmentActivity, Bitmap bitmap, String str, long j, qy6<? super StyleFilterUtil.StyleFilterResult, bth> qy6Var, zy2<? super C26851> zy2Var) {
            super(2, zy2Var);
            this.$activity = fragmentActivity;
            this.$originBitmap = bitmap;
            this.$cubePath = str;
            this.$startTime = j;
            this.$block = qy6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C26851(this.$activity, this.$originBitmap, this.$cubePath, this.$startTime, this.$block, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C26851) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) throws IOException {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            File file = new File(this.$activity.getCacheDir(), "temp_input_" + System.currentTimeMillis() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.$originBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            WQStyleFilter styleFilter = StyleFilterUtil.Companion.getStyleFilter();
            md8.checkNotNull(styleFilter);
            WQStyleFilter.FilterResult filterResultApplyStyleFilterFast = styleFilter.applyStyleFilterFast(this.$cubePath, file.getAbsolutePath(), null, true);
            file.delete();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.$startTime;
            if (!filterResultApplyStyleFilterFast.getSuccess()) {
                qy6<StyleFilterUtil.StyleFilterResult, bth> qy6Var = this.$block;
                String errorMessage = filterResultApplyStyleFilterFast.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                qy6Var.invoke(new StyleFilterUtil.StyleFilterResult(-1, errorMessage, null, jCurrentTimeMillis, null, 20, null));
            } else if (filterResultApplyStyleFilterFast.getOutputBitmap() != null) {
                this.$block.invoke(new StyleFilterUtil.StyleFilterResult(0, null, filterResultApplyStyleFilterFast.getOutputBitmap(), jCurrentTimeMillis, null, 18, null));
            } else {
                this.$block.invoke(new StyleFilterUtil.StyleFilterResult(-1, "unknown error", null, jCurrentTimeMillis, null, 20, null));
            }
            return bth.f14751a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StyleFilterUtil$applyStyleFilter$1$1(FragmentActivity fragmentActivity, Bitmap bitmap, String str, qy6<? super StyleFilterUtil.StyleFilterResult, bth> qy6Var, zy2<? super StyleFilterUtil$applyStyleFilter$1$1> zy2Var) {
        super(2, zy2Var);
        this.$activity = fragmentActivity;
        this.$originBitmap = bitmap;
        this.$cubePath = str;
        this.$block = qy6Var;
    }

    @Override // p000.tq0
    public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
        return new StyleFilterUtil$applyStyleFilter$1$1(this.$activity, this.$originBitmap, this.$cubePath, this.$block, zy2Var);
    }

    @Override // p000.gz6
    public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
        return ((StyleFilterUtil$applyStyleFilter$1$1) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
    }

    @Override // p000.tq0
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            y7e.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            m13 io2 = df4.getIO();
            C26851 c26851 = new C26851(this.$activity, this.$originBitmap, this.$cubePath, jCurrentTimeMillis, this.$block, null);
            this.label = 1;
            if (dg1.withContext(io2, c26851, this) == coroutine_suspended) {
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
