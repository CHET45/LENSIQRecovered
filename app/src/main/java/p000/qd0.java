package p000;

import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.ReturnCode;
import com.blankj.utilcode.util.C2473f;
import io.reactivex.Observable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class qd0 {

    /* JADX INFO: renamed from: a */
    public static final String f74011a = "AudioConverter";

    /* JADX INFO: renamed from: qd0$a */
    public class C11433a implements oxb<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11434b f74012a;

        public C11433a(InterfaceC11434b interfaceC11434b) {
            this.f74012a = interfaceC11434b;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            InterfaceC11434b interfaceC11434b = this.f74012a;
            if (interfaceC11434b != null) {
                interfaceC11434b.onAudioConverted(false);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
        }

        @Override // p000.oxb
        public void onNext(Boolean bool) {
            InterfaceC11434b interfaceC11434b = this.f74012a;
            if (interfaceC11434b != null) {
                interfaceC11434b.onAudioConverted(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: qd0$b */
    public interface InterfaceC11434b {
        void onAudioConverted(boolean z);
    }

    public static Boolean convertPCMToMP3(String str, String str2, int i, int i2, int i3, String str3) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                Log.e(f74011a, "Error: Input file $pcmFilePath not found!");
                return Boolean.FALSE;
            }
            double length = file.length();
            StringBuilder sb = new StringBuilder();
            sb.append("  Estimated duration: ");
            sb.append(String.format("%.2f", Float.valueOf((float) (length / (((double) (i * i2)) * (((double) i3) / 8.0d))))));
            sb.append(" seconds");
            File parentFile = new File(str2).getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                Log.e(f74011a, "Failed to create output directory: " + parentFile.getAbsolutePath());
                return Boolean.FALSE;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("-y");
            arrayList.add("-f");
            arrayList.add("s16le");
            arrayList.add("-ar");
            arrayList.add(String.valueOf(i));
            arrayList.add("-ac");
            arrayList.add(String.valueOf(i2));
            arrayList.add("-i");
            arrayList.add(str);
            arrayList.add("-codec:a");
            arrayList.add(amc.f2088w);
            arrayList.add("-b:a");
            arrayList.add(str3);
            arrayList.add("-id3v2_version");
            arrayList.add(k95.f53092Z4);
            arrayList.add("-write_id3v1");
            arrayList.add("1");
            arrayList.add(str2);
            if (!executeFFmpegCommand(arrayList).booleanValue()) {
                Log.e(f74011a, "✗ Error during conversion");
                return Boolean.FALSE;
            }
            File file2 = new File(str2);
            if (!file2.exists()) {
                Log.e(f74011a, "✗ Output file was not created");
                return Boolean.FALSE;
            }
            double length2 = file2.length();
            float f = (float) ((1.0d - (length2 / length)) * 100.0d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("✓ Output size: ");
            sb2.append(String.format("%.1f", Double.valueOf(length2 / 1024.0d)));
            sb2.append(" KB");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("✓ Compression ratio: ");
            sb3.append(String.format("%.1f", Float.valueOf(f)));
            sb3.append(yv7.f103133a);
            return Boolean.TRUE;
        } catch (Exception e) {
            Log.e(f74011a, "Error converting file: " + e.getMessage(), e);
            return Boolean.FALSE;
        }
    }

    private static Boolean executeFFmpegCommand(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (i == list.size() - 1) {
                    sb.append(str);
                } else {
                    sb.append(str);
                    sb.append(C2473f.f17566z);
                }
            }
            return Boolean.valueOf(ReturnCode.isSuccess(FFmpegKit.execute(sb.toString()).getReturnCode()));
        } catch (Exception e) {
            Log.e(f74011a, "Error executing FFmpeg command: " + e.getMessage(), e);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$pcm2mp3$0(String str, String str2, mob mobVar) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        Boolean boolConvertPCMToMP3 = convertPCMToMP3(str2, str, 44100, 1, 16, "128k");
        if (boolConvertPCMToMP3.booleanValue()) {
            File file2 = new File(str2);
            if (file2.exists()) {
                file2.delete();
            }
        }
        mobVar.onNext(boolConvertPCMToMP3);
        mobVar.onComplete();
    }

    public static void pcm2mp3(final String str, final String str2, InterfaceC11434b interfaceC11434b) {
        Observable.create(new dsb() { // from class: pd0
            @Override // p000.dsb
            public final void subscribe(mob mobVar) throws Exception {
                qd0.lambda$pcm2mp3$0(str2, str, mobVar);
            }
        }).subscribeOn(npe.m18057io()).observeOn(C2062bv.mainThread()).subscribe(new C11433a(interfaceC11434b));
    }
}
