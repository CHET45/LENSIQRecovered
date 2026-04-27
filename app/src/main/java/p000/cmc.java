package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.bmc;

/* JADX INFO: loaded from: classes6.dex */
public class cmc implements wja, dmc {

    /* JADX INFO: renamed from: c */
    public Context f16962c;

    /* JADX INFO: renamed from: a */
    public mvi f16960a = null;

    /* JADX INFO: renamed from: b */
    public vui f16961b = null;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f16963d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public AtomicInteger f16964e = new AtomicInteger(100);

    /* JADX INFO: renamed from: cmc$a */
    public static class C2389a {

        /* JADX INFO: renamed from: a */
        public static cmc f16965a = new cmc();

        private C2389a() {
        }
    }

    private void doInitPlayer(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f16962c = applicationContext;
        if (this.f16960a == null) {
            this.f16960a = new mvi(applicationContext, 3, true, false, false);
        }
        this.f16963d.set(true);
    }

    public static cmc getInst() {
        return C2389a.f16965a;
    }

    @Override // p000.wja
    public void init(Context context, svi sviVar) {
        doInitPlayer(context);
        this.f16960a.setListener(sviVar);
    }

    public void initPlayer(Context context) {
        doInitPlayer(context);
    }

    public boolean isInit() {
        return this.f16963d.get();
    }

    @Override // p000.wja
    public boolean isPlaying() {
        mvi mviVar = this.f16960a;
        return mviVar != null && mviVar.getState() == 2;
    }

    @Override // p000.wja
    public void pause() {
        mvi mviVar = this.f16960a;
        if (mviVar != null) {
            mviVar.pause();
        }
    }

    @Override // p000.wja
    public void play() {
        mvi mviVar = this.f16960a;
        if (mviVar == null) {
            return;
        }
        if (mviVar.getState() == 2 || this.f16960a.getState() == 3) {
            this.f16960a.stop();
            SystemClock.sleep(200L);
        }
        try {
            this.f16960a.play(this.f16961b);
        } catch (IllegalThreadStateException e) {
            sui.m22261e("PcmPlayerHelper", "play:" + e.toString());
        }
    }

    @Override // p000.wja
    public void release() {
        this.f16962c = null;
        mvi mviVar = this.f16960a;
        if (mviVar != null) {
            mviVar.stop();
            this.f16960a.release();
        }
        this.f16960a = null;
        this.f16961b = null;
        this.f16963d.set(false);
    }

    public void resetBuffer(int i) {
        if (this.f16960a == null) {
            return;
        }
        vui vuiVar = this.f16961b;
        if (vuiVar == null) {
            this.f16961b = new vui(this.f16962c, 16000, i <= 0 ? 1 : i, null, 100);
        } else {
            vuiVar.reset(this.f16962c, 16000, i <= 0 ? 1 : i, null, 100);
            this.f16961b.deleteFile();
        }
    }

    public void resetPercent(int i) {
        if (this.f16963d.get()) {
            this.f16964e.set(i);
        }
    }

    @Override // p000.wja
    public void resume() {
        mvi mviVar = this.f16960a;
        if (mviVar != null) {
            mviVar.resume();
        }
    }

    public void setLocalDataSize(int i) {
        resetBuffer(1);
        this.f16961b.setMaxFileSize(i);
    }

    public synchronized int startPlay(bmc.InterfaceC1949a interfaceC1949a) {
        mvi mviVar = this.f16960a;
        if (mviVar == null) {
            return -1;
        }
        mviVar.setListener(interfaceC1949a);
        play();
        return 0;
    }

    @Override // p000.wja
    public void stop() {
        mvi mviVar = this.f16960a;
        if (mviVar != null) {
            mviVar.stop();
        }
        resetBuffer(0);
    }

    public boolean write(ArrayList<byte[]> arrayList, int i, int i2) {
        vui vuiVar = this.f16961b;
        if (vuiVar == null) {
            return false;
        }
        return vuiVar.writeStream(arrayList, this.f16964e.get(), i, i2);
    }

    @Override // p000.dmc
    public boolean write(byte[] bArr, int i, int i2) {
        if (this.f16961b == null) {
            return false;
        }
        ArrayList<byte[]> arrayList = new ArrayList<>();
        arrayList.add(bArr);
        return this.f16961b.writeStream(arrayList, this.f16964e.get(), i, i2);
    }
}
