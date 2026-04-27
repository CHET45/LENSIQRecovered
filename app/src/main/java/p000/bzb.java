package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.iflytek.aikit.core.AbstractC3820c;
import com.iflytek.aikit.core.AiHelper;
import com.platon.offlinesdk.C3880R;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import p000.dyb;

/* JADX INFO: loaded from: classes6.dex */
public class bzb {

    /* JADX INFO: renamed from: w */
    public static final String f15273w = "OfflineSdkManager";

    /* JADX INFO: renamed from: a */
    public int f15274a;

    /* JADX INFO: renamed from: b */
    public Context f15275b;

    /* JADX INFO: renamed from: c */
    public Handler f15276c;

    /* JADX INFO: renamed from: d */
    public vyb f15277d;

    /* JADX INFO: renamed from: e */
    public fzb f15278e;

    /* JADX INFO: renamed from: f */
    public gzb f15279f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f15280g;

    /* JADX INFO: renamed from: h */
    public iyb f15281h;

    /* JADX INFO: renamed from: i */
    public iyb f15282i;

    /* JADX INFO: renamed from: j */
    public List<InterfaceC2119h> f15283j;

    /* JADX INFO: renamed from: k */
    public String f15284k;

    /* JADX INFO: renamed from: l */
    public String f15285l;

    /* JADX INFO: renamed from: m */
    public String f15286m;

    /* JADX INFO: renamed from: n */
    public File f15287n;

    /* JADX INFO: renamed from: o */
    public boolean f15288o;

    /* JADX INFO: renamed from: p */
    public boolean f15289p;

    /* JADX INFO: renamed from: q */
    public String f15290q;

    /* JADX INFO: renamed from: r */
    public String f15291r;

    /* JADX INFO: renamed from: s */
    public String f15292s;

    /* JADX INFO: renamed from: t */
    public String f15293t;

    /* JADX INFO: renamed from: u */
    public String f15294u;

    /* JADX INFO: renamed from: v */
    public k03 f15295v;

    /* JADX INFO: renamed from: bzb$a */
    public class C2112a implements InterfaceC2119h {
        public C2112a() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void offlineResourceMissing() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onAuthResult(int i) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeResult(String str, String str2) {
            bzb.this.f15292s = str;
            bzb.this.f15294u = str2;
            bzb.getInstance().translate(str2, false);
            for (InterfaceC2119h interfaceC2119h : bzb.this.f15283j) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onRecognizeResult(str, bzb.this.f15294u);
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeVadTimeOut() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTranslateResult(String str, String str2) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsConvertMp3Finish(String str) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsResult(String str) {
        }
    }

    /* JADX INFO: renamed from: bzb$b */
    public class C2113b implements InterfaceC2119h {
        public C2113b() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void offlineResourceMissing() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onAuthResult(int i) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeResult(String str, String str2) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeVadTimeOut() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTranslateResult(String str, String str2) {
            bzb.this.f15291r = str;
            bzb.this.f15293t = str2;
            bzb.getInstance().runTts(str2);
            for (InterfaceC2119h interfaceC2119h : bzb.this.f15283j) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onTranslateResult(str, str2);
                }
            }
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsConvertMp3Finish(String str) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsResult(String str) {
        }
    }

    /* JADX INFO: renamed from: bzb$c */
    public class C2114c implements InterfaceC2119h {
        public C2114c() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void offlineResourceMissing() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onAuthResult(int i) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeResult(String str, String str2) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onRecognizeVadTimeOut() {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTranslateResult(String str, String str2) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsConvertMp3Finish(String str) {
        }

        @Override // p000.bzb.InterfaceC2119h
        public void onTtsResult(String str) {
            bzb.this.f15287n = new File(str);
            if (!bzb.this.f15280g && bzb.this.f15289p && bzb.this.f15287n != null && bzb.this.f15287n.exists()) {
                hh0.getInstance().startPlay(bzb.this.f15287n.getAbsolutePath());
            }
            for (InterfaceC2119h interfaceC2119h : bzb.this.f15283j) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onTtsResult(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: bzb$d */
    public class C2115d implements k03 {
        public C2115d() {
        }

        @Override // p000.uh0
        public void onAuthStateChange(t45 t45Var, int i) {
            Log.i(bzb.f15273w, "core listener code:" + i);
            for (InterfaceC2119h interfaceC2119h : bzb.this.f15283j) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onAuthResult(i);
                }
            }
            int i2 = C2117f.f15303a[t45Var.ordinal()];
            if (i2 == 1) {
                bzb.this.f15274a = i;
                if (i == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onAuthStateChange: SDK授权失败，授权码为: ");
                sb.append(bzb.this.f15274a);
                return;
            }
            if (i2 != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onAuthStateChange: SDK状态：其他错误");
                sb2.append(i);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onAuthStateChange: SDK状态：HTTP认证结果");
                sb3.append(i);
            }
        }
    }

    /* JADX INFO: renamed from: bzb$e */
    public class RunnableC2116e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f15300a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC3820c.d f15301b;

        public RunnableC2116e(Context context, AbstractC3820c.d dVar) {
            this.f15300a = context;
            this.f15301b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AiHelper.getInst().initEntry(this.f15300a, this.f15301b);
        }
    }

    /* JADX INFO: renamed from: bzb$f */
    public static /* synthetic */ class C2117f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15303a;

        static {
            int[] iArr = new int[t45.values().length];
            f15303a = iArr;
            try {
                iArr[t45.AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15303a[t45.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: bzb$g */
    public static class C2118g {

        /* JADX INFO: renamed from: a */
        public String f15304a;

        /* JADX INFO: renamed from: b */
        public String f15305b;

        /* JADX INFO: renamed from: c */
        public String f15306c;

        /* JADX INFO: renamed from: d */
        public String f15307d;

        /* JADX INFO: renamed from: bzb$g$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f15308a;

            /* JADX INFO: renamed from: b */
            public String f15309b;

            /* JADX INFO: renamed from: c */
            public String f15310c;

            public a apiKey(String str) {
                this.f15309b = str;
                return this;
            }

            public a apiSecret(String str) {
                this.f15310c = str;
                return this;
            }

            public a appId(String str) {
                this.f15308a = str;
                return this;
            }

            public C2118g build() {
                if (TextUtils.isEmpty(this.f15308a)) {
                    throw new IllegalArgumentException("appId cannot be null");
                }
                if (TextUtils.isEmpty(this.f15309b)) {
                    throw new IllegalArgumentException("apiKey cannot be null");
                }
                if (TextUtils.isEmpty(this.f15310c)) {
                    throw new IllegalArgumentException("apiSecret cannot be null");
                }
                return new C2118g(this, null);
            }
        }

        public /* synthetic */ C2118g(a aVar, C2112a c2112a) {
            this(aVar);
        }

        private C2118g(a aVar) {
            this.f15304a = aVar.f15308a;
            this.f15305b = aVar.f15309b;
            this.f15306c = aVar.f15310c;
        }
    }

    /* JADX INFO: renamed from: bzb$h */
    public interface InterfaceC2119h {
        void offlineResourceMissing();

        void onAuthResult(int i);

        void onRecognizeResult(String str, String str2);

        void onRecognizeVadTimeOut();

        void onTranslateResult(String str, String str2);

        void onTtsConvertMp3Finish(String str);

        void onTtsResult(String str);
    }

    /* JADX INFO: renamed from: bzb$i */
    public static class C2120i {

        /* JADX INFO: renamed from: a */
        public static final bzb f15311a = new bzb(null);

        private C2120i() {
        }
    }

    public /* synthetic */ bzb(C2112a c2112a) {
        this();
    }

    public static bzb getInstance() {
        return C2120i.f15311a;
    }

    private void initInfo(Context context) {
        if (context == null) {
            return;
        }
        this.f15284k = context.getResources().getString(C3880R.string.appId);
        this.f15285l = context.getResources().getString(C3880R.string.apiKey);
        this.f15286m = context.getResources().getString(C3880R.string.apiSecret);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recognizeStartRecord$0(byte[] bArr, int i, int i2) {
        if (dyb.getInstance().getStatus() == dyb.EnumC5015d.STATUS_START) {
            recognizeWrite(EnumC0304al.CONTINUE, bArr);
        }
    }

    private void setOfflineListener() {
        this.f15277d.setOfflineSdkListener(new C2112a());
        this.f15278e.setOfflineSdkListener(new C2113b());
        this.f15279f.setOfflineSdkListener(new C2114c());
    }

    public void engineInit() {
        this.f15277d.registerListener();
        this.f15278e.registerListener();
        this.f15279f.registerListener();
    }

    public void engineUninit() {
        dyb.getInstance().stopRecord();
        hh0.getInstance().stopPlay();
        this.f15277d.engineUnInit();
        this.f15278e.engineUnInit();
        this.f15279f.engineUnInit();
    }

    public int getAuthResult() {
        return this.f15274a;
    }

    public Context getContext() {
        return this.f15275b;
    }

    public fzb getOfflineTransfer() {
        return this.f15278e;
    }

    public void initDirs(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalFilesDir("").getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(zyb.f106504b);
        sb.append(str);
        zyb.f106503a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("initSDK: WORK_DIR = ");
        sb2.append(zyb.f106503a);
        zyb.f106505c = zyb.f106503a + "download/";
        StringBuilder sb3 = new StringBuilder();
        sb3.append("initSDK: DOWNLOAD_DIR = ");
        sb3.append(zyb.f106505c);
        zyb.f106506d = zyb.f106505c + "base/";
        zyb.f106507e = zyb.f106505c + "lan/";
        File file = new File(zyb.f106503a);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(zyb.f106505c);
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }

    public void initSDK(Context context) {
        initInfo(context);
        initSDK(context, new C2118g.a().appId(this.f15284k).apiKey(this.f15285l).apiSecret(this.f15286m).build());
    }

    public boolean isRecordStart() {
        return this.f15280g;
    }

    public void playPcm(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            return;
        }
        hh0.getInstance().startPlay(str);
    }

    public void recognizeEnd() {
        this.f15277d.end();
        this.f15278e.clearTranslateStringBuilder();
    }

    public void recognizeRead() {
        this.f15277d.read();
    }

    public void recognizeStart(String str) {
        this.f15277d.start();
        setTtsFileName(str);
    }

    public void recognizeStartRecord() {
        recognizeStartRecord("");
    }

    public void recognizeStopRecord() {
        if (!hzb.isFastClick() && this.f15280g) {
            this.f15280g = false;
            this.f15290q = dyb.getInstance().stopRecord();
            recognizeWrite(EnumC0304al.END, new byte[]{1});
            File file = this.f15287n;
            if (file == null || !file.exists()) {
                return;
            }
            if (!this.f15280g && this.f15289p) {
                hh0.getInstance().startPlay(this.f15287n.getAbsolutePath());
            }
            for (InterfaceC2119h interfaceC2119h : this.f15283j) {
                if (interfaceC2119h != null) {
                    interfaceC2119h.onRecognizeResult(this.f15292s, this.f15294u);
                    interfaceC2119h.onTranslateResult(this.f15291r, this.f15293t);
                    interfaceC2119h.onTtsResult(this.f15287n.getAbsolutePath());
                }
            }
        }
    }

    public void recognizeWrite(EnumC0304al enumC0304al, byte[] bArr) {
        this.f15277d.write(enumC0304al, bArr);
    }

    public void removeOfflineSdkListener(InterfaceC2119h interfaceC2119h) {
        this.f15283j.remove(interfaceC2119h);
    }

    public void runTts(String str) {
        this.f15279f.runTTS(str);
    }

    public void setLanguage(iyb iybVar, iyb iybVar2) {
        getInstance().engineUninit();
        getInstance().engineInit();
        this.f15281h = iybVar;
        this.f15282i = iybVar2;
        this.f15277d.setFromLanguage(iybVar);
        this.f15278e.setTransType(iybVar.getCode() + iybVar2.getCode());
        this.f15279f.setTtsLanguage(iybVar2);
    }

    public void setOfflineSdkListener(InterfaceC2119h interfaceC2119h) {
        if (this.f15283j.contains(interfaceC2119h)) {
            return;
        }
        this.f15283j.add(interfaceC2119h);
    }

    public void setPcmFilePath(String str) {
        this.f15290q = str;
    }

    public void setTtsFileName(String str) {
        this.f15279f.setTtsFileName(str);
    }

    public void setTtsPlayOnRecordStop(boolean z) {
        this.f15289p = z;
        if (z) {
            this.f15288o = false;
        }
    }

    public void setTtsPlayOnRecording(boolean z) {
        this.f15288o = z;
        if (z) {
            this.f15289p = false;
        }
        this.f15279f.setTtsPlayOnRecording(z);
    }

    public void stopPcmPlay() {
        hh0.getInstance().stopPlay();
    }

    public void translate(String str) {
        translate(str, true);
    }

    public void translateEnd() {
        this.f15278e.end();
    }

    public void translateStart(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15291r = "";
        this.f15292s = "";
        this.f15293t = "";
        this.f15294u = "";
        getInstance().stopPcmPlay();
        setTtsFileName(str2);
        translate(str);
    }

    public void writeFile(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Exception e) {
            Log.e(f15273w, "writeFile: " + e.toString());
        }
    }

    private bzb() {
        this.f15274a = -1;
        this.f15283j = new ArrayList();
        this.f15288o = false;
        this.f15289p = true;
        this.f15295v = new C2115d();
        this.f15276c = new Handler(Looper.getMainLooper());
        this.f15277d = new vyb();
        this.f15278e = new fzb();
        this.f15279f = new gzb();
        setOfflineListener();
    }

    public void recognizeStartRecord(String str) {
        if (hzb.isFastClick() || this.f15280g) {
            return;
        }
        this.f15280g = true;
        this.f15287n = null;
        this.f15291r = "";
        this.f15292s = "";
        this.f15293t = "";
        this.f15294u = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        recognizeEnd();
        StringBuilder sb = new StringBuilder();
        sb.append("recognizeEnd time ");
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        recognizeStart(System.currentTimeMillis() + "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("recognizeStart time ");
        sb2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        hh0.getInstance().stopPlay();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("stopPlay time ");
        sb3.append(System.currentTimeMillis() - jCurrentTimeMillis3);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            this.f15290q = zyb.f106503a + System.currentTimeMillis() + ".pcm";
        } else {
            this.f15290q = str;
        }
        dyb.getInstance().startRecord(this.f15290q, new dyb.InterfaceC5014c() { // from class: azb
            @Override // p000.dyb.InterfaceC5014c
            public final void recordOfByte(byte[] bArr, int i, int i2) {
                this.f12287a.lambda$recognizeStartRecord$0(bArr, i, i2);
            }
        });
        StringBuilder sb4 = new StringBuilder();
        sb4.append("startRecord time ");
        sb4.append(System.currentTimeMillis() - jCurrentTimeMillis4);
    }

    public void translate(String str, boolean z) {
        if (z) {
            this.f15278e.clearTranslateStringBuilder();
        }
        this.f15278e.translate(str);
    }

    public void initSDK(Context context, C2118g c2118g) {
        if (context == null) {
            throw new IllegalArgumentException("initSDK failed, context cannot be null");
        }
        if (c2118g != null) {
            this.f15275b = context;
            initDirs(context);
            this.f15278e.initInfo();
            this.f15279f.initInfo();
            AiHelper.getInst().setLogInfo(ii9.VERBOSE, 2, zyb.f106503a + "aikit/aeeLog.txt");
            AiHelper.getInst().setLogPath(zyb.f106503a + "aikit/aeeLog.txt");
            new Thread(new RunnableC2116e(context, AbstractC3820c.d.builder().appId(c2118g.f15304a).apiKey(c2118g.f15305b).apiSecret(c2118g.f15306c).workDir(zyb.f106503a).build())).start();
            AiHelper.getInst().registerListener(this.f15295v);
            return;
        }
        throw new IllegalArgumentException("initSDK failed, params cannot be null");
    }
}
