package p000;

import android.util.Log;
import com.iflytek.aikit.core.AiHelper;
import com.iflytek.aikit.core.C3818a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.bzb;

/* JADX INFO: loaded from: classes6.dex */
public class fzb {

    /* JADX INFO: renamed from: k */
    public static String f38064k = null;

    /* JADX INFO: renamed from: l */
    public static final String f38065l = "ed4f63e83";

    /* JADX INFO: renamed from: m */
    public static final String f38066m = "OfflineTransfer";

    /* JADX INFO: renamed from: a */
    public C9910nk f38067a;

    /* JADX INFO: renamed from: c */
    public bzb.InterfaceC2119h f38069c;

    /* JADX INFO: renamed from: d */
    public String f38070d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f38071e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f38072f;

    /* JADX INFO: renamed from: b */
    public StringBuilder f38068b = new StringBuilder();

    /* JADX INFO: renamed from: g */
    public List<String> f38073g = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: h */
    public StringBuilder f38074h = new StringBuilder();

    /* JADX INFO: renamed from: i */
    public StringBuilder f38075i = new StringBuilder();

    /* JADX INFO: renamed from: j */
    public InterfaceC13077tk f38076j = new C6041a();

    /* JADX INFO: renamed from: fzb$a */
    public class C6041a implements InterfaceC13077tk {
        public C6041a() {
        }

        @Override // p000.InterfaceC13077tk
        public void onError(int i, int i2, String str, Object obj) {
            Log.e(fzb.f38066m, "onError ERROR::" + str + ",err code:" + i2);
        }

        @Override // p000.InterfaceC13077tk
        public void onEvent(int i, int i2, List<C15699yk> list, Object obj) {
            Log.i(fzb.f38066m, "OnEvent event code:" + i2);
            if (i2 == EnumC14606wi.AEE_EVENT_END.getValue()) {
                AiHelper.getInst().end(fzb.this.f38067a);
                if (fzb.this.f38073g.size() > 0) {
                    String str = (String) fzb.this.f38073g.get(0);
                    fzb fzbVar = fzb.this;
                    fzbVar.f38067a = fzbVar.start(str);
                    fzb fzbVar2 = fzb.this;
                    fzbVar2.doTranslate(fzbVar2.f38074h.toString());
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onEvent: 翻译结果：");
                sb.append(fzb.this.f38068b.toString());
                if (fzb.this.f38069c != null) {
                    fzb.this.f38069c.onTranslateResult(fzb.this.f38068b.toString(), fzb.this.f38075i.toString());
                }
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
                    String str = new String(value);
                    if (fzb.this.f38073g.size() > 0) {
                        fzb.this.f38074h.append(str);
                    } else {
                        fzb.this.f38075i.append(str);
                        fzb.this.f38068b.append(str);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("trans onResult: ");
                    sb.append(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void doTranslate(String str) {
        if (this.f38073g.size() == 0) {
            return;
        }
        String str2 = this.f38073g.get(0);
        this.f38073g.remove(0);
        StringBuilder sb = new StringBuilder();
        sb.append("transfer type:");
        sb.append(str2);
        sb.append(",text: ");
        sb.append(str);
        C9910nk c9910nk = this.f38067a;
        if (c9910nk == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doTranslate: handle is null for type: ");
            sb2.append(str2);
            return;
        }
        if (c9910nk.getCode() != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("start失败:");
            sb3.append(this.f38067a.getCode());
            return;
        }
        C3818a.a aVarBuilder = C3818a.builder();
        aVarBuilder.payload(C4839dl.get("txt").data(str).valid());
        int iWrite = AiHelper.getInst().write(aVarBuilder.build(), this.f38067a);
        if (iWrite != 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("translate write失败:");
            sb4.append(iWrite);
            if (iWrite == 18307) {
                this.f38072f = false;
                Log.e(f38066m, "doTranslate: 18307错误码，表示引擎未启动，需要重新启动引擎");
                engineStart();
                translate(str);
            }
        }
    }

    private void engineStart() {
        String str = this.f38070d;
        if (str == null || str.length() < 4) {
            return;
        }
        this.f38073g.clear();
        if (this.f38070d.startsWith("cn") || this.f38070d.endsWith("cn")) {
            this.f38073g.add(this.f38070d);
            this.f38067a = start(this.f38070d);
            return;
        }
        String str2 = this.f38070d.substring(0, 2) + "cn";
        String str3 = "cn" + this.f38070d.substring(2, 4);
        StringBuilder sb = new StringBuilder();
        sb.append("translate: transTypeOne ");
        sb.append(str2);
        sb.append(", transTypeTwo ");
        sb.append(str3);
        this.f38073g.add(str2);
        this.f38073g.add(str3);
        this.f38067a = start(str2);
    }

    public void clearTranslateStringBuilder() {
        this.f38068b.setLength(0);
        this.f38074h.setLength(0);
        this.f38075i.setLength(0);
    }

    public void end() {
        AiHelper.getInst().end(this.f38067a);
        clearTranslateStringBuilder();
    }

    public void engineInit() {
        C3818a.a aVarBuilder = C3818a.builder();
        aVarBuilder.param("res_dir", f38064k + "/resource");
        aVarBuilder.param("log_level", ufh.f87914a);
        int iEngineInit = AiHelper.getInst().engineInit(f38065l, aVarBuilder.build());
        if (iEngineInit == 0) {
            this.f38071e = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("offlineTransfer engineInitFailed:");
        sb.append(iEngineInit);
    }

    public void engineUnInit() {
        if (this.f38071e) {
            AiHelper.getInst().engineUnInit(f38065l);
        }
        this.f38071e = false;
        clearTranslateStringBuilder();
    }

    public void initInfo() {
        f38064k = zyb.f106503a + "itrans";
    }

    public void registerListener() {
        AiHelper.getInst().registerListener(f38065l, this.f38076j);
        engineInit();
    }

    public void setOfflineSdkListener(bzb.InterfaceC2119h interfaceC2119h) {
        this.f38069c = interfaceC2119h;
    }

    public void setTransType(String str) {
        this.f38070d = str;
        this.f38072f = false;
    }

    public C9910nk start(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("transfer start type:");
        sb.append(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C3818a.a aVarBuilder = C3818a.builder();
        aVarBuilder.param(v23.f89724e, "type=" + str);
        aVarBuilder.param("translateType", str);
        C9910nk c9910nkStart = AiHelper.getInst().start(f38065l, aVarBuilder.build(), null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("transfer engine start time : ");
        sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        if (c9910nkStart == null || c9910nkStart.getCode() != 0) {
            Log.e(f38066m, "offlineTransfer start failed: " + c9910nkStart.getCode() + ", type: " + str);
        } else {
            Log.e(f38066m, "offlineTransfer start success, type: " + str);
        }
        return c9910nkStart;
    }

    public synchronized void translate(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("translate: transType:");
        sb.append(this.f38070d);
        sb.append(",text:");
        sb.append(str);
        this.f38074h.setLength(0);
        this.f38075i.setLength(0);
        engineStart();
        doTranslate(str);
    }
}
