package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.watchfun.aichatmodule.C3998R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import p000.C1922bk;
import p000.C2133c;
import p000.a32;
import p000.tf0;

/* JADX INFO: renamed from: hk */
/* JADX INFO: loaded from: classes6.dex */
public class C6875hk {

    /* JADX INFO: renamed from: u */
    public static final int f43838u = 20;

    /* JADX INFO: renamed from: v */
    public static final int f43839v = 1000;

    /* JADX INFO: renamed from: w */
    public static final int f43840w = 1000;

    /* JADX INFO: renamed from: x */
    public static final int f43841x = 30;

    /* JADX INFO: renamed from: y */
    public static final int f43842y = 10000;

    /* JADX INFO: renamed from: z */
    public static final String f43843z = "WebSocketHelper";

    /* JADX INFO: renamed from: a */
    public WebSocket f43844a;

    /* JADX INFO: renamed from: b */
    public Handler f43845b;

    /* JADX INFO: renamed from: c */
    public OkHttpClient f43846c;

    /* JADX INFO: renamed from: d */
    public boolean f43847d;

    /* JADX INFO: renamed from: e */
    public boolean f43848e;

    /* JADX INFO: renamed from: f */
    public f f43849f;

    /* JADX INFO: renamed from: g */
    public AtomicBoolean f43850g;

    /* JADX INFO: renamed from: h */
    public String f43851h;

    /* JADX INFO: renamed from: i */
    public int f43852i;

    /* JADX INFO: renamed from: j */
    public boolean f43853j;

    /* JADX INFO: renamed from: k */
    public Timer f43854k;

    /* JADX INFO: renamed from: l */
    public boolean f43855l;

    /* JADX INFO: renamed from: m */
    public Context f43856m;

    /* JADX INFO: renamed from: n */
    public String f43857n;

    /* JADX INFO: renamed from: o */
    public String f43858o;

    /* JADX INFO: renamed from: p */
    public String f43859p;

    /* JADX INFO: renamed from: q */
    public boolean f43860q;

    /* JADX INFO: renamed from: r */
    public long f43861r;

    /* JADX INFO: renamed from: s */
    public String f43862s;

    /* JADX INFO: renamed from: t */
    public String f43863t;

    /* JADX INFO: renamed from: hk$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!C6875hk.this.f43855l || System.currentTimeMillis() - C6875hk.this.f43861r < 10000) {
                return;
            }
            C6875hk.this.f43855l = false;
            if (C6875hk.this.f43849f != null) {
                C6875hk.this.f43849f.onServerResponseTimeout();
            }
        }
    }

    /* JADX INFO: renamed from: hk$c */
    public class c implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f43866a;

        public c(String str) {
            this.f43866a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains("ai_chat_" + this.f43866a);
        }
    }

    /* JADX INFO: renamed from: hk$d */
    public class d implements Comparator<File> {
        public d() {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return Integer.compare(C6875hk.this.extractIndex(file.getName()), C6875hk.this.extractIndex(file2.getName()));
        }
    }

    /* JADX INFO: renamed from: hk$e */
    public class e implements FilenameFilter {
        public e() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains("ai_chat_");
        }
    }

    /* JADX INFO: renamed from: hk$f */
    public interface f {
        void onClosed(int i);

        void onFailure();

        void onMessage(C2337ck c2337ck);

        void onMessageBytes(byte[] bArr);

        void onOpen();

        void onServerResponseTimeout();

        void onSpeechStarted();

        void onSpeechStoped();

        void onVoiceTranscribe(C4826dk c4826dk);
    }

    /* JADX INFO: renamed from: hk$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public static final C6875hk f43870a = new C6875hk(null);

        private g() {
        }
    }

    public /* synthetic */ C6875hk(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int extractIndex(String str) {
        int iLastIndexOf = str.lastIndexOf(p43.f69617m);
        int iLastIndexOf2 = str.lastIndexOf(".");
        if (iLastIndexOf != -1 && iLastIndexOf2 != -1 && iLastIndexOf < iLastIndexOf2) {
            try {
                return Integer.parseInt(str.substring(iLastIndexOf + 1, iLastIndexOf2));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static C6875hk getInstance() {
        return g.f43870a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startVoiceRecord$0(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startVoiceRecord$1(byte[] bArr, int i, int i2) {
        send(bArr);
    }

    private File saveFile(Context context, String str, byte[] bArr) throws IOException {
        if (context == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("saveFile: msgId ");
        sb.append(str);
        sb.append(", datas.length ");
        sb.append(bArr.length);
        File file = new File(context.getFilesDir(), "aivoice");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "ai_chat_" + str + p43.f69617m + this.f43852i + ".mp3");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                try {
                    channel.write(ByteBuffer.wrap(bArr));
                    channel.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e2) {
            Log.e(f43843z, "saveFile: " + e2);
        }
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startReconnect() {
        if (this.f43847d) {
            return;
        }
        this.f43847d = true;
        this.f43845b.postDelayed(new Runnable() { // from class: ek
            @Override // java.lang.Runnable
            public final void run() {
                this.f33233a.connect();
            }
        }, 1000L);
        zi9.m26850d(f43843z, "将在 1 秒后尝试重连");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVoiceRecord(boolean z, String str) {
        if (!z || TextUtils.isEmpty(str)) {
            tf0.getInstance().startRecord(new tf0.InterfaceC13006c() { // from class: gk
                @Override // p000.tf0.InterfaceC13006c
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f39970a.lambda$startVoiceRecord$1(bArr, i, i2);
                }
            });
        } else {
            tf0.getInstance().startRecord(str, new tf0.InterfaceC13006c() { // from class: fk
                @Override // p000.tf0.InterfaceC13006c
                public final void recordOfByte(byte[] bArr, int i, int i2) {
                    this.f36881a.lambda$startVoiceRecord$0(bArr, i, i2);
                }
            });
        }
    }

    public void cacheAudioFile(String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cacheAudioFile: ");
        sb.append(bArr.length);
        try {
            if (!TextUtils.equals(str, this.f43851h)) {
                this.f43852i = 0;
                this.f43851h = str;
            }
            this.f43852i++;
            saveFile(this.f43856m, str, bArr);
        } catch (IOException e2) {
            Log.e(f43843z, "cacheAudioFile: " + e2);
        }
    }

    public void cancel() {
        this.f43853j = false;
        WebSocket webSocket = this.f43844a;
        if (webSocket != null) {
            try {
                webSocket.cancel();
            } catch (Exception e2) {
                zi9.m26852e(f43843z, "cancel: " + e2);
            }
        }
    }

    public void close() {
        this.f43853j = false;
        WebSocket webSocket = this.f43844a;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "Activity destroyed");
            } catch (Exception e2) {
                zi9.m26852e(f43843z, "close: " + e2);
            }
        }
    }

    public void connect() {
        this.f43853j = true;
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        this.f43844a = this.f43846c.newWebSocket(new Request.Builder().url(this.f43859p).addHeader("x-request-appid", this.f43857n).addHeader("x-request-timestamp", strValueOf).addHeader("x-request-sign", iq9.stringToMD5(this.f43857n + this.f43858o + strValueOf)).build(), new b());
    }

    public void dealOverCountCacheVoiceFile(Context context) {
        if (context == null) {
            return;
        }
        File file = new File(context.getFilesDir(), "aivoice");
        if (!file.exists()) {
            file.mkdirs();
        }
        File[] fileArrListFiles = file.listFiles(new e());
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                String strReplace = name.substring(0, name.lastIndexOf(p43.f69617m)).replace("ai_chat_", "");
                if (!arrayList.contains(strReplace)) {
                    arrayList.add(strReplace);
                }
            }
            Collections.sort(arrayList);
            if (arrayList.size() > 20) {
                Arrays.sort(fileArrListFiles);
                List listSubList = arrayList.subList(0, arrayList.size() - 19);
                for (int i = 0; i < listSubList.size(); i++) {
                    String str = (String) listSubList.get(i);
                    for (File file3 : fileArrListFiles) {
                        String name2 = file3.getName();
                        if (name2.contains(str)) {
                            file3.delete();
                            StringBuilder sb = new StringBuilder();
                            sb.append("dealOverCountCacheVoiceFile: delFile ");
                            sb.append(name2);
                        }
                    }
                }
            }
        }
    }

    public File[] getAiVoiceFiles(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(this.f43856m.getFilesDir(), "aivoice");
        if (!file.exists()) {
            file.mkdirs();
        }
        File[] fileArrListFiles = file.listFiles(new c(str));
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            Arrays.sort(fileArrListFiles, new d());
        }
        return fileArrListFiles;
    }

    public String getAppName(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Unknown");
    }

    public String getCacheAudioFilePath(String str) {
        return this.f43856m.getFilesDir().getAbsolutePath() + File.separator + "ai_chat_" + str + ".mp3";
    }

    public String getHostName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = new URL(str).getHost();
            StringBuilder sb = new StringBuilder();
            sb.append("getHostName: ");
            sb.append(host);
            return host;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String getPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            StringBuilder sb = new StringBuilder();
            sb.append("path: ");
            sb.append(path);
            return path;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String getProtocol(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String protocol = new URL(str).getProtocol();
            StringBuilder sb = new StringBuilder();
            sb.append("protocol: ");
            sb.append(protocol);
            return protocol;
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str, String str2, String str3) {
        init(context, str, str2, str3, false);
    }

    public boolean isConnected() {
        return this.f43848e;
    }

    public boolean isVoiceSpeechStart() {
        return this.f43850g.get();
    }

    public void release() {
        tf0.getInstance().stopRecord();
        this.f43849f = null;
        cancel();
        Handler handler = this.f43845b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void send(byte[] bArr) {
        if (!isConnected()) {
            k3h.showToastShort(this.f43856m.getString(C3998R.string.loading_no_net_view_text_hint));
            zi9.m26850d(f43843z, "send bytes fail, because not connected");
        } else if (this.f43844a != null) {
            this.f43844a.send(ByteString.m18742of(bArr));
        }
    }

    public void sendChatCmd(C2133c c2133c) {
        if (!this.f43848e) {
            k3h.showToastShort(this.f43856m.getString(C3998R.string.loading_no_net_view_text_hint));
            return;
        }
        dealOverCountCacheVoiceFile(this.f43856m);
        if (c2133c != null) {
            c2133c.setCommand("chat");
            String json = sc7.toJson(c2133c);
            zi9.m26850d(f43843z, "sendChatCmd: " + json);
            this.f43844a.send(json);
            this.f43855l = true;
            this.f43861r = System.currentTimeMillis();
        }
    }

    public void sendConfig(C7323ik c7323ik) {
        if (c7323ik != null) {
            if (c7323ik.getSampleRate() == 0) {
                c7323ik.setSampleRate(44100);
            }
            String json = sc7.toJson(c7323ik);
            zi9.m26850d(f43843z, "sendConfig: " + json);
            this.f43844a.send(json);
        }
    }

    public void sendStartVoiceCmd() {
        C2133c c2133c = new C2133c();
        c2133c.setCommand("startSpeech");
        String json = sc7.toJson(c2133c);
        zi9.m26850d(f43843z, "sendStartVoiceCmd: " + json);
        this.f43844a.send(json);
        this.f43850g.set(true);
    }

    public void sendStopVoiceCmd() {
        tf0.getInstance().stopRecord();
        C2133c c2133c = new C2133c();
        c2133c.setCommand("stopSpeech");
        String json = sc7.toJson(c2133c);
        zi9.m26850d(f43843z, "sendStopVoiceCmd: " + json);
        this.f43844a.send(json);
        this.f43850g.set(false);
    }

    public void setVoiceSpeechStart(boolean z) {
        this.f43850g.set(z);
    }

    public void setWebSocketListener(f fVar) {
        this.f43849f = fVar;
    }

    private C6875hk() {
        this.f43847d = false;
        this.f43850g = new AtomicBoolean(false);
        this.f43853j = true;
        this.f43862s = "ai.watchfunai.com";
        this.f43863t = "wss://" + this.f43862s + "/ws/v1/chat";
        this.f43846c = new OkHttpClient.Builder().dns(new kg7()).pingInterval(30L, TimeUnit.SECONDS).build();
        this.f43845b = new Handler();
        this.f43854k = new Timer();
        this.f43854k.schedule(new a(), 0L, 1000L);
    }

    public void init(Context context, String str, String str2, String str3, boolean z) {
        if (context == null) {
            zi9.m26852e(f43843z, "init fail, because context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            zi9.m26852e(f43843z, "init fail, because appId is empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            zi9.m26852e(f43843z, "init fail, because appSecret is empty");
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            zi9.m26852e(f43843z, "init fail, because webSocketUrl is empty");
            return;
        }
        this.f43856m = context.getApplicationContext();
        this.f43857n = str;
        this.f43858o = str2;
        this.f43859p = str3;
        this.f43860q = z;
    }

    /* JADX INFO: renamed from: hk$b */
    public class b extends WebSocketListener {
        public b() {
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            super.onClosed(webSocket, i, str);
            StringBuilder sb = new StringBuilder();
            sb.append("appName=");
            C6875hk c6875hk = C6875hk.this;
            sb.append(c6875hk.getAppName(c6875hk.f43856m));
            sb.append(" reqHost=");
            C6875hk c6875hk2 = C6875hk.this;
            sb.append(c6875hk2.getHostName(c6875hk2.f43859p));
            sb.append(" reqUrl=");
            C6875hk c6875hk3 = C6875hk.this;
            sb.append(c6875hk3.getPath(c6875hk3.f43859p));
            sb.append(" reqProtol=");
            C6875hk c6875hk4 = C6875hk.this;
            sb.append(c6875hk4.getProtocol(c6875hk4.f43859p));
            sb.append(" resCode=");
            sb.append(i);
            sb.append(" resMsg=");
            sb.append(str);
            sb.append(" action=closed");
            zi9.m26850d(C6875hk.f43843z, sb.toString());
            C6875hk.this.f43848e = false;
            C6875hk.this.f43847d = false;
            if (C6875hk.this.f43849f != null) {
                C6875hk.this.f43849f.onClosed(i);
            }
            if (C6875hk.this.f43853j) {
                C6875hk.this.startReconnect();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            super.onFailure(webSocket, th, response);
            StringBuilder sb = new StringBuilder();
            sb.append("appName=");
            C6875hk c6875hk = C6875hk.this;
            sb.append(c6875hk.getAppName(c6875hk.f43856m));
            sb.append(" reqHost=");
            C6875hk c6875hk2 = C6875hk.this;
            sb.append(c6875hk2.getHostName(c6875hk2.f43859p));
            sb.append(" reqUrl=");
            C6875hk c6875hk3 = C6875hk.this;
            sb.append(c6875hk3.getPath(c6875hk3.f43859p));
            sb.append(" reqProtol=");
            C6875hk c6875hk4 = C6875hk.this;
            sb.append(c6875hk4.getProtocol(c6875hk4.f43859p));
            sb.append(" resCode=null resMsg=");
            sb.append(th.getMessage());
            sb.append(" action=failed");
            zi9.m26850d(C6875hk.f43843z, sb.toString());
            C6875hk.this.f43848e = false;
            C6875hk.this.f43847d = false;
            if (C6875hk.this.f43849f != null) {
                C6875hk.this.f43849f.onFailure();
            }
            if ((th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketTimeoutException) || ((th instanceof IOException) && th.getMessage() != null && (th.getMessage().contains(a32.C0034g.f248b) || th.getMessage().contains("TIMED_OUT") || th.getMessage().contains("Unable to resolve host") || th.getMessage().contains("No address associated with hostname")))) {
                C6875hk c6875hk5 = C6875hk.this;
                c6875hk5.f43859p = c6875hk5.f43863t;
            }
            if (C6875hk.this.f43853j) {
                C6875hk.this.startReconnect();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(@efb WebSocket webSocket, @efb ByteString byteString) {
            super.onMessage(webSocket, byteString);
            byte[] byteArray = byteString.toByteArray();
            zi9.m26850d(C6875hk.f43843z, "收到服务器消息: 字节长度 " + byteArray.length);
            if (C6875hk.this.f43849f != null) {
                C6875hk.this.f43849f.onMessageBytes(byteArray);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            super.onOpen(webSocket, response);
            StringBuilder sb = new StringBuilder();
            sb.append("appName=");
            C6875hk c6875hk = C6875hk.this;
            sb.append(c6875hk.getAppName(c6875hk.f43856m));
            sb.append(" reqHost=");
            C6875hk c6875hk2 = C6875hk.this;
            sb.append(c6875hk2.getHostName(c6875hk2.f43859p));
            sb.append(" reqUrl=");
            C6875hk c6875hk3 = C6875hk.this;
            sb.append(c6875hk3.getPath(c6875hk3.f43859p));
            sb.append(" reqProtol=");
            C6875hk c6875hk4 = C6875hk.this;
            sb.append(c6875hk4.getProtocol(c6875hk4.f43859p));
            sb.append(" resCode=1000 resMsg=null action=open");
            zi9.m26850d(C6875hk.f43843z, sb.toString());
            C6875hk.this.f43848e = true;
            C6875hk.this.f43847d = false;
            if (C6875hk.this.f43849f != null) {
                C6875hk.this.f43849f.onOpen();
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            C2337ck c2337ck;
            C4826dk c4826dk;
            super.onMessage(webSocket, str);
            zi9.m26850d(C6875hk.f43843z, "收到服务器消息: " + str);
            C6875hk.this.f43861r = System.currentTimeMillis();
            if (TextUtils.isEmpty(str) || (c2337ck = (C2337ck) sc7.fromJson(str, C2337ck.class)) == null) {
                return;
            }
            if (TextUtils.equals(c2337ck.getType(), "speechStarted")) {
                if (!C6875hk.this.f43860q) {
                    C6875hk.this.startVoiceRecord(false, "");
                }
                if (C6875hk.this.f43849f != null) {
                    C6875hk.this.f43849f.onSpeechStarted();
                    return;
                }
                return;
            }
            if (TextUtils.equals(c2337ck.getType(), C1922bk.b.f13909m)) {
                if (C6875hk.this.f43849f != null) {
                    C6875hk.this.f43849f.onSpeechStoped();
                }
            } else {
                if (TextUtils.equals(c2337ck.getType(), "chatMessage")) {
                    if (TextUtils.equals(c2337ck.getStatus(), C2337ck.f16773h)) {
                        C6875hk.this.f43855l = false;
                    }
                    if (C6875hk.this.f43849f != null) {
                        C6875hk.this.f43849f.onMessage(c2337ck);
                        return;
                    }
                    return;
                }
                if (!TextUtils.equals(c2337ck.getType(), "transcribe") || (c4826dk = (C4826dk) sc7.fromJson(str, C4826dk.class)) == null || C6875hk.this.f43849f == null) {
                    return;
                }
                C6875hk.this.f43849f.onVoiceTranscribe(c4826dk);
            }
        }
    }

    public void sendChatCmd(List<C2133c.b> list, String str) {
        if (!this.f43848e) {
            k3h.showToastShort(this.f43856m.getString(C3998R.string.loading_no_net_view_text_hint));
            return;
        }
        C2133c c2133c = new C2133c();
        C2133c.a aVar = new C2133c.a();
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            arrayList.addAll(list);
        }
        C2133c.b bVar = new C2133c.b();
        bVar.setRole("user");
        bVar.setContent(str);
        arrayList.add(bVar);
        aVar.setMessages(arrayList);
        aVar.setEnableSearch(true);
        c2133c.setData(aVar);
        getInstance().sendChatCmd(c2133c);
    }
}
