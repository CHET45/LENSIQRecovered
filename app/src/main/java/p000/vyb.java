package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.iflytek.aikit.core.AiHelper;
import com.iflytek.aikit.core.C3818a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.Future;
import p000.C15145xj;
import p000.bzb;

/* JADX INFO: loaded from: classes6.dex */
public class vyb {

    /* JADX INFO: renamed from: i */
    public static final int f92666i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f92667j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f92668k = 2;

    /* JADX INFO: renamed from: l */
    public static final String f92669l = "e0e26945b";

    /* JADX INFO: renamed from: m */
    public static final String f92670m = "OfflineRecognizer";

    /* JADX INFO: renamed from: a */
    public C9910nk f92671a;

    /* JADX INFO: renamed from: c */
    public bzb.InterfaceC2119h f92673c;

    /* JADX INFO: renamed from: d */
    public iyb f92674d;

    /* JADX INFO: renamed from: e */
    public Future<?> f92675e;

    /* JADX INFO: renamed from: f */
    public long f92676f;

    /* JADX INFO: renamed from: b */
    public StringBuilder f92672b = new StringBuilder();

    /* JADX INFO: renamed from: h */
    public InterfaceC13077tk f92678h = new C14300a();

    /* JADX INFO: renamed from: g */
    public Handler f92677g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: vyb$a */
    public class C14300a implements InterfaceC13077tk {
        public C14300a() {
        }

        @Override // p000.InterfaceC13077tk
        public void onError(int i, int i2, String str, Object obj) {
        }

        @Override // p000.InterfaceC13077tk
        public void onEvent(int i, int i2, List<C15699yk> list, Object obj) {
        }

        @Override // p000.InterfaceC13077tk
        public void onResult(int i, List<C15699yk> list, Object obj) {
            if (list == null || list.size() <= 0) {
                return;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                byte[] value = list.get(i2).getValue();
                if (value != null) {
                    int status = list.get(i2).getStatus();
                    StringBuilder sb = new StringBuilder();
                    sb.append("onResult: status ");
                    sb.append(status);
                    if (status == 2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onRecognizeVadTimeOut: ");
                        sb2.append(System.currentTimeMillis() - vyb.this.f92676f);
                        if (vyb.this.f92673c != null) {
                            vyb.this.f92673c.onRecognizeVadTimeOut();
                        }
                    } else {
                        vyb.this.f92676f = System.currentTimeMillis();
                    }
                    String key = list.get(i2).getKey();
                    int value2 = list.get(i2).getType().getValue();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onResult: key ");
                    sb3.append(key);
                    sb3.append(",type ");
                    sb3.append(value2);
                    sb3.append(", handleID ");
                    sb3.append(i);
                    try {
                        String str = (vyb.this.f92674d != null ? vyb.this.f92674d.getRecognizeLanguageType() : 0) == 0 ? new String(value, "GBK") : new String(value, "UTF-8");
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onResult: ");
                        sb4.append(str);
                        if (!key.equals("pgs") && key.equals("plain")) {
                            if (!TextUtils.isEmpty(str)) {
                                str = str.replaceAll("\\[.*?\\]", "");
                            }
                            vyb.this.f92672b.append(str);
                            if (vyb.this.f92673c != null) {
                                vyb.this.f92673c.onRecognizeResult(vyb.this.f92672b.toString(), str);
                            }
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: vyb$b */
    public class RunnableC14301b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f92680a;

        public RunnableC14301b(String str) {
            this.f92680a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            vyb.this.writePcmFileData(this.f92680a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writePcmFileData(String str) {
        EnumC0304al enumC0304al = EnumC0304al.BEGIN;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] stream = readStream(str);
            StringBuilder sb = new StringBuilder();
            sb.append("writePcmFileData: readStream ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            if (stream != null && stream.length > 44) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                dyb.getInstance().getBufferSizeInBytes();
                write(enumC0304al, stream);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("writePcmFileData: write data ");
                sb2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                write(EnumC0304al.END, new byte[0]);
                return;
            }
            Log.e(f92670m, "pcm 当前文件大小异常！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelWritePcmFileData() {
        Future<?> future = this.f92675e;
        if (future == null || future.isDone()) {
            return;
        }
        this.f92675e.cancel(true);
        this.f92675e = null;
    }

    public void clearData() {
        cancelWritePcmFileData();
        clearPlainStringBuilder();
    }

    public void clearPlainStringBuilder() {
        this.f92672b.setLength(0);
    }

    public void end() {
        AiHelper.getInst().end(this.f92671a);
        cancelWritePcmFileData();
        clearPlainStringBuilder();
    }

    public void engineUnInit() {
        AiHelper.getInst().engineUnInit(f92669l);
        cancelWritePcmFileData();
    }

    public void read() {
        try {
            int i = AiHelper.getInst().read(f92669l, this.f92671a);
            if (i != 0) {
                Log.e(f92670m, "start read failed" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] readStream(String str) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[10240];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (-1 == i) {
                byteArrayOutputStream.close();
                fileInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public void registerListener() {
        AiHelper.getInst().registerListener(f92669l, this.f92678h);
    }

    public void setFromLanguage(iyb iybVar) {
        this.f92674d = iybVar;
        start();
    }

    public void setOfflineSdkListener(bzb.InterfaceC2119h interfaceC2119h) {
        this.f92673c = interfaceC2119h;
    }

    public void start() {
        C3818a.a aVarBuilder = C3818a.builder();
        aVarBuilder.param("languageType", this.f92674d.getRecognizeLanguageType());
        aVarBuilder.param("vadOn", true);
        aVarBuilder.param("rltSep", "blank");
        aVarBuilder.param("vadEnergyThreshold", 9);
        aVarBuilder.param("vadThreshold", 0.1332d);
        aVarBuilder.param("vadSpeechEnd", 150000);
        aVarBuilder.param("vadResponsetime", 170000);
        aVarBuilder.param("vadLinkOn", false);
        aVarBuilder.param("pureEnglish", false);
        aVarBuilder.param("outputType", 1);
        aVarBuilder.param("puncCache", false);
        if (iyb.PT.getRecognizeLanguageType() == this.f92674d.getRecognizeLanguageType() || iyb.VI.getRecognizeLanguageType() == this.f92674d.getRecognizeLanguageType() || iyb.HI.getRecognizeLanguageType() == this.f92674d.getRecognizeLanguageType()) {
            aVarBuilder.param("postprocOn", false);
        } else {
            aVarBuilder.param("postprocOn", true);
        }
        aVarBuilder.param("vadEndGap", 40);
        C9910nk c9910nkStart = AiHelper.getInst().start(f92669l, aVarBuilder.build(), null);
        this.f92671a = c9910nkStart;
        if (c9910nkStart.isSuccess()) {
            return;
        }
        Log.e(f92670m, "recognize ERROR::START | handle code:" + this.f92671a.getCode());
    }

    public void write(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            this.f92675e = ezb.postOnBackgroundThread(new RunnableC14301b(str));
        }
    }

    public void write(EnumC0304al enumC0304al, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("write: status ");
        sb.append(enumC0304al.name());
        C3818a.a aVarBuilder = C3818a.builder();
        try {
            C15145xj.a aVarData = C15145xj.get("input").encoding(C15145xj.f98130j).data(bArr);
            aVarData.status(enumC0304al);
            aVarBuilder.payload(aVarData.valid());
            int iWrite = AiHelper.getInst().write(aVarBuilder.build(), this.f92671a);
            if (iWrite != 0) {
                Log.e(f92670m, "recognize write failed " + iWrite);
            } else {
                read();
            }
        } catch (Exception e) {
            Log.e(f92670m, "recognize write: " + e.toString());
        }
    }
}
