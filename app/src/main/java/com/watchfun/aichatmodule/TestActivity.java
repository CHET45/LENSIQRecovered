package com.watchfun.aichatmodule;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p000.C2133c;
import p000.C2337ck;
import p000.C4826dk;
import p000.C6875hk;
import p000.C7323ik;
import p000.hib;
import p000.xt5;

/* JADX INFO: loaded from: classes6.dex */
public class TestActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b */
    public static final String f25059b = "OuHQBNvFcVEhLwLH68C3Xw";

    /* JADX INFO: renamed from: c */
    public static final String f25060c = "hwk2NWJkJot1mnalBjkrajygJLELfuBllQPqStu9RpQ";

    /* JADX INFO: renamed from: d */
    public static final String f25061d = "ai.watchfun.cn";

    /* JADX INFO: renamed from: e */
    public static String f25062e = "wss://ai.watchfun.cn/ws/v1/chat";

    /* JADX INFO: renamed from: a */
    public Handler f25063a;

    /* JADX INFO: renamed from: com.watchfun.aichatmodule.TestActivity$a */
    public class RunnableC3999a implements Runnable {
        public RunnableC3999a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7323ik c7323ik = new C7323ik();
            c7323ik.setCommand("config");
            c7323ik.setSourceLanguage("zh-CN");
            C6875hk.getInstance().sendConfig(c7323ik);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichatmodule.TestActivity$b */
    public class RunnableC4000b implements Runnable {
        public RunnableC4000b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2133c c2133c = new C2133c();
            C2133c.b bVar = new C2133c.b();
            ArrayList arrayList = new ArrayList();
            C2133c.a aVar = new C2133c.a();
            bVar.setRole("user");
            bVar.setContent("android");
            arrayList.add(bVar);
            aVar.setMessages(arrayList);
            c2133c.setData(aVar);
            C6875hk.getInstance().sendChatCmd(c2133c);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.aichatmodule.TestActivity$c */
    public class C4001c implements C6875hk.f {
        public C4001c() {
        }

        @Override // p000.C6875hk.f
        public void onClosed(int i) {
        }

        @Override // p000.C6875hk.f
        public void onFailure() {
        }

        @Override // p000.C6875hk.f
        public void onMessage(C2337ck c2337ck) {
        }

        @Override // p000.C6875hk.f
        public void onMessageBytes(byte[] bArr) throws Throwable {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            String str = TestActivity.this.getFilesDir() + "/ppt.mp3";
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            TestActivity.saveByteBufferToPCMFile(byteBufferWrap, str);
        }

        @Override // p000.C6875hk.f
        public void onOpen() {
        }

        @Override // p000.C6875hk.f
        public void onServerResponseTimeout() {
        }

        @Override // p000.C6875hk.f
        public void onSpeechStarted() {
        }

        @Override // p000.C6875hk.f
        public void onSpeechStoped() {
        }

        @Override // p000.C6875hk.f
        public void onVoiceTranscribe(C4826dk c4826dk) {
        }
    }

    public static String saveByteBufferToPCMFile(ByteBuffer byteBuffer, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File fileByPath = xt5.getFileByPath(str);
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileByPath, true);
                try {
                    fileOutputStream2.getChannel().write(byteBuffer);
                    fileOutputStream2.close();
                    String absolutePath = fileByPath.getAbsolutePath();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return absolutePath;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@hib Bundle bundle) {
        super.onCreate(bundle);
        this.f25063a = new Handler();
        C6875hk.getInstance().init(this, f25059b, f25060c, f25062e);
        C6875hk.getInstance().connect();
        this.f25063a.postDelayed(new RunnableC3999a(), 2000L);
        this.f25063a.postDelayed(new RunnableC4000b(), 4500L);
        C6875hk.getInstance().setWebSocketListener(new C4001c());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f25063a;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
    }
}
