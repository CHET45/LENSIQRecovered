package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.aikit.core.AiHelper;
import com.iflytek.aikit.core.C3818a;
import com.watchfun.callvideo.base.BaseCallActivity;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bzb;
import p000.hh0;

/* JADX INFO: loaded from: classes6.dex */
public class gzb {

    /* JADX INFO: renamed from: k */
    public static String f41860k = null;

    /* JADX INFO: renamed from: l */
    public static String f41861l = null;

    /* JADX INFO: renamed from: m */
    public static final String f41862m = "e09712bcb";

    /* JADX INFO: renamed from: n */
    public static final String f41863n = "OfflineTts";

    /* JADX INFO: renamed from: a */
    public bzb.InterfaceC2119h f41864a;

    /* JADX INFO: renamed from: c */
    public C9910nk f41866c;

    /* JADX INFO: renamed from: d */
    public String f41867d;

    /* JADX INFO: renamed from: e */
    public iyb f41868e;

    /* JADX INFO: renamed from: b */
    public int f41865b = 1001;

    /* JADX INFO: renamed from: f */
    public tsi f41869f = new tsi();

    /* JADX INFO: renamed from: g */
    public AtomicBoolean f41870g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public boolean f41871h = false;

    /* JADX INFO: renamed from: i */
    public InterfaceC13077tk f41872i = new C6663a();

    /* JADX INFO: renamed from: j */
    public Handler f41873j = new Handler(Looper.myLooper(), new C6664b());

    /* JADX INFO: renamed from: gzb$a */
    public class C6663a implements InterfaceC13077tk {
        public C6663a() {
        }

        @Override // p000.InterfaceC13077tk
        public void onError(int i, int i2, String str, Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("能力运行出错，错误码:");
            sb.append(i2);
            sb.append(",错误信息:");
            sb.append(str);
        }

        @Override // p000.InterfaceC13077tk
        public void onEvent(int i, int i2, List<C15699yk> list, Object obj) {
            if (i2 == EnumC14606wi.AEE_EVENT_END.getValue()) {
                gzb.this.f41873j.sendEmptyMessage(gzb.this.f41865b);
                return;
            }
            if (i2 == EnumC14606wi.AEE_EVENT_PROGRESS.getValue()) {
                int iBytesToInt = -1;
                int iBytesToInt2 = -1;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    C15699yk c15699yk = list.get(i3);
                    if (c15699yk.getKey().equals("progress_pos")) {
                        iBytesToInt = bjb.bytesToInt(c15699yk.getValue());
                    } else if (c15699yk.getKey().equals("progress_len")) {
                        iBytesToInt2 = bjb.bytesToInt(c15699yk.getValue());
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("handleID:");
                sb.append(i);
                sb.append("进度:");
                sb.append(iBytesToInt);
                sb.append(pj4.f71071b);
                sb.append(iBytesToInt2);
            }
        }

        @Override // p000.InterfaceC13077tk
        public void onResult(int i, List<C15699yk> list, Object obj) {
            if (list == null || list.size() <= 0) {
                return;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                byte[] value = list.get(i2).getValue();
                if (value != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onResult:handleID:");
                    sb.append(i);
                    sb.append(g1i.f38277c);
                    sb.append(list.get(i2).getKey());
                    gzb.this.makeOutPutDir();
                    fyb.writeFile(gzb.this.getOutFileName(), value);
                }
            }
        }
    }

    /* JADX INFO: renamed from: gzb$b */
    public class C6664b implements Handler.Callback {

        /* JADX INFO: renamed from: gzb$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f41876a;

            public a(String str) {
                this.f41876a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                File fileCreateMP3File = fyb.createMP3File(bzb.getInstance().getContext());
                fyb.convertPCMToMP3(new File(this.f41876a), fileCreateMP3File);
                if (gzb.this.f41864a != null) {
                    gzb.this.f41864a.onTtsConvertMp3Finish(fileCreateMP3File.getAbsolutePath());
                }
            }
        }

        public C6664b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message message) {
            if (message.what == gzb.this.f41865b) {
                C9910nk unused = gzb.this.f41866c;
                String str = gzb.f41861l + File.separator + "OutPut_" + gzb.this.f41867d + ".pcm";
                StringBuilder sb = new StringBuilder();
                sb.append("输出的文件路径为:");
                sb.append(str);
                hh0.getInstance().setSampleRate(hh0.EnumC6852c.SAMPLE_RATE_24k);
                if (gzb.this.f41871h) {
                    hh0.getInstance().startPlay(str);
                }
                if (gzb.this.f41864a != null) {
                    gzb.this.f41864a.onTtsResult(str);
                }
                ezb.postOnBackgroundThread(new a(str));
            }
            gzb.this.f41870g.set(false);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getOutFileName() {
        return f41861l + File.separator + "OutPut_" + this.f41867d + ".pcm";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeOutPutDir() {
        File file = new File(f41861l);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public void end() {
        if (this.f41866c != null) {
            AiHelper.getInst().end(this.f41866c);
        }
    }

    public void engineUnInit() {
        AiHelper.getInst().engineUnInit(f41862m);
    }

    public tsi getXttsParams() {
        return this.f41869f;
    }

    public void initInfo() {
        f41860k = zyb.f106503a + "xtts";
        f41861l = f41860k + File.separator + "output";
        makeOutPutDir();
    }

    public void registerListener() {
        AiHelper.getInst().registerListener(f41862m, this.f41872i);
    }

    public int runTTS(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("runTTS: isStart ");
        sb.append(this.f41870g.get());
        File file = new File(getOutFileName());
        if (file.exists()) {
            file.delete();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("runTTS: text:");
        sb2.append(str);
        sb2.append("vcn :");
        sb2.append(this.f41869f.f85798a);
        sb2.append(", pitch ");
        sb2.append(this.f41869f.f85800c);
        sb2.append(", language ");
        sb2.append(this.f41869f.f85799b);
        C3818a.a aVarBuilder = C3818a.builder();
        aVarBuilder.payload(C4839dl.get("text").data(str).valid());
        int iWrite = AiHelper.getInst().write(aVarBuilder.build(), this.f41866c);
        if (iWrite == 0) {
            return 1000;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("tts write失败:");
        sb3.append(iWrite);
        return 1003;
    }

    public void setOfflineSdkListener(bzb.InterfaceC2119h interfaceC2119h) {
        this.f41864a = interfaceC2119h;
    }

    public void setTtsFileName(String str) {
        this.f41867d = str;
    }

    public void setTtsLanguage(iyb iybVar) {
        this.f41868e = iybVar;
        this.f41869f.f85799b = iybVar.getTtsLanguageType();
        this.f41869f.f85798a = tsi.getVcn(this.f41868e.getTtsLanguageType());
        start();
    }

    public void setTtsPlayOnRecording(boolean z) {
        this.f41871h = z;
    }

    public void setXttsParams(tsi tsiVar) {
        if (tsiVar != null) {
            this.f41869f = tsiVar;
        }
    }

    public int start() {
        C3818a.a aVarBuilder = C3818a.builder();
        aVarBuilder.param("vcn", this.f41869f.f85798a);
        aVarBuilder.param(BaseCallActivity.f25142j2, this.f41869f.f85799b);
        aVarBuilder.param("textEncoding", "UTF-8");
        aVarBuilder.param("pitch", this.f41869f.f85800c);
        aVarBuilder.param("volume", this.f41869f.f85802e);
        aVarBuilder.param("speed", this.f41869f.f85801d);
        C9910nk c9910nkStart = AiHelper.getInst().start(f41862m, aVarBuilder.build(), null);
        this.f41866c = c9910nkStart;
        if (c9910nkStart.getCode() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tts start failed:");
        sb.append(this.f41866c.getCode());
        this.f41866c = null;
        return 1002;
    }
}
