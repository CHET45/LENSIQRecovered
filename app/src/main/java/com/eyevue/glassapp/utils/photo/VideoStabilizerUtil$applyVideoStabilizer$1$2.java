package com.eyevue.glassapp.utils.photo;

import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import cn.watchfun.videostabilizer.WQVideoStabilizer;
import com.eyevue.glassapp.utils.photo.VideoStabilizerUtil;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p000.bth;
import p000.ck3;
import p000.gv4;
import p000.gz6;
import p000.jvd;
import p000.md8;
import p000.mu5;
import p000.pd8;
import p000.qy6;
import p000.ugg;
import p000.x13;
import p000.y7e;
import p000.zy2;

/* JADX INFO: loaded from: classes4.dex */
@ck3(m4009c = "com.eyevue.glassapp.utils.photo.VideoStabilizerUtil$applyVideoStabilizer$1$2", m4010f = "VideoStabilizerUtil.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
public final class VideoStabilizerUtil$applyVideoStabilizer$1$2 extends ugg implements gz6<x13, zy2<? super bth>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ File $finalOutputFile;
    final /* synthetic */ File $originVideoFile;
    final /* synthetic */ jvd.C8121h<File> $outputFile;
    final /* synthetic */ qy6<VideoStabilizerUtil.VideoStabilizerResult, bth> $stabilizerResult;
    int label;
    final /* synthetic */ VideoStabilizerUtil this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoStabilizerUtil$applyVideoStabilizer$1$2(FragmentActivity fragmentActivity, jvd.C8121h<File> c8121h, File file, VideoStabilizerUtil videoStabilizerUtil, qy6<? super VideoStabilizerUtil.VideoStabilizerResult, bth> qy6Var, File file2, zy2<? super VideoStabilizerUtil$applyVideoStabilizer$1$2> zy2Var) {
        super(2, zy2Var);
        this.$activity = fragmentActivity;
        this.$outputFile = c8121h;
        this.$originVideoFile = file;
        this.this$0 = videoStabilizerUtil;
        this.$stabilizerResult = qy6Var;
        this.$finalOutputFile = file2;
    }

    @Override // p000.tq0
    public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
        return new VideoStabilizerUtil$applyVideoStabilizer$1$2(this.$activity, this.$outputFile, this.$originVideoFile, this.this$0, this.$stabilizerResult, this.$finalOutputFile, zy2Var);
    }

    @Override // p000.gz6
    public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
        return ((VideoStabilizerUtil$applyVideoStabilizer$1$2) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.io.File] */
    @Override // p000.tq0
    public final Object invokeSuspend(Object obj) throws IOException {
        pd8.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y7e.throwOnFailure(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        File file = new File(this.$activity.getFilesDir(), "stabilized_videos");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.$outputFile.f52110a = new File(file, mu5.getNameWithoutExtension(this.$originVideoFile) + "_stabilized_" + str + ".mp4");
        new File(file, mu5.getNameWithoutExtension(this.$originVideoFile) + "_vs_stabilized_" + str + ".mkv");
        Log.e("xtest", "本次视频防抖的原始视频：" + this.$originVideoFile.getAbsolutePath() + ",输出视频路径：" + this.$outputFile.f52110a.getAbsolutePath());
        WQVideoStabilizer wQVideoStabilizer = this.this$0.videoStabilizer;
        md8.checkNotNull(wQVideoStabilizer);
        if (wQVideoStabilizer.stabilizeVideoWithParams(this.$originVideoFile.getAbsolutePath(), this.$outputFile.f52110a.getAbsolutePath(), 10, 15, 10, 32, 2, 0.3f, 0.1f, 0.0f, gv4.f41446l, "keep", 1080, 8)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            Files.copy(this.$outputFile.f52110a.toPath(), this.$finalOutputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            this.$outputFile.f52110a.delete();
            qy6<VideoStabilizerUtil.VideoStabilizerResult, bth> qy6Var = this.$stabilizerResult;
            String absolutePath = this.$finalOutputFile.getAbsolutePath();
            md8.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            qy6Var.invoke(new VideoStabilizerUtil.VideoStabilizerResult(0, null, absolutePath, null, jCurrentTimeMillis2, 10, null));
        } else {
            this.$outputFile.f52110a.delete();
            qy6<VideoStabilizerUtil.VideoStabilizerResult, bth> qy6Var2 = this.$stabilizerResult;
            String absolutePath2 = this.$outputFile.f52110a.getAbsolutePath();
            md8.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
            WQVideoStabilizer wQVideoStabilizer2 = this.this$0.videoStabilizer;
            md8.checkNotNull(wQVideoStabilizer2);
            String lastError = wQVideoStabilizer2.getLastError();
            md8.checkNotNullExpressionValue(lastError, "getLastError(...)");
            qy6Var2.invoke(new VideoStabilizerUtil.VideoStabilizerResult(-1, lastError, absolutePath2, null, 0L, 24, null));
        }
        return bth.f14751a;
    }
}
