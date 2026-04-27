package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000.vif;

/* JADX INFO: loaded from: classes6.dex */
public class wif implements wja, xif {

    /* JADX INFO: renamed from: a */
    public vif f94365a = null;

    /* JADX INFO: renamed from: wif$a */
    public class C14628a implements svi {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vif.InterfaceC14099c f94366a;

        public C14628a(vif.InterfaceC14099c interfaceC14099c) {
            this.f94366a = interfaceC14099c;
        }

        @Override // p000.svi
        public void onError(vxf vxfVar) {
            this.f94366a.onError(vxfVar.getErrorCode());
        }

        public void onFinish() {
            this.f94366a.onCompleted();
        }

        @Override // p000.svi
        public void onPause() {
            this.f94366a.onPause();
        }

        @Override // p000.svi
        public void onPercent(int i, int i2, int i3) {
        }

        @Override // p000.svi
        public void onResume() {
        }

        public void onStart() {
            this.f94366a.onStart();
        }

        @Override // p000.svi
        public void onStop() {
            this.f94366a.onStop();
        }
    }

    /* JADX INFO: renamed from: wif$b */
    public static class C14629b {

        /* JADX INFO: renamed from: a */
        public static final wif f94368a = new wif();

        private C14629b() {
        }
    }

    private uui getAudioParam() {
        uui uuiVar = new uui();
        uuiVar.f89188a = 16000;
        uuiVar.f89189b = 2;
        uuiVar.f89190c = 2;
        return uuiVar;
    }

    public static wif getInst() {
        return C14629b.f94368a;
    }

    private byte[] getPCMData(String str) {
        File file = new File(str);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) file.length()];
            try {
                fileInputStream.read(bArr);
                return bArr;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // p000.wja
    public void init(Context context, svi sviVar) {
        vif vifVar = this.f94365a;
        if (vifVar != null) {
            vifVar.stop();
            this.f94365a = null;
        }
        this.f94365a = new vif(sviVar);
        this.f94365a.setAudioParam(getAudioParam());
    }

    @Override // p000.wja
    public boolean isPlaying() {
        return false;
    }

    @Override // p000.wja
    public void pause() {
        vif vifVar = this.f94365a;
        if (vifVar != null) {
            vifVar.pause();
        }
    }

    @Override // p000.wja
    public void play() {
        vif vifVar = this.f94365a;
        if (vifVar != null) {
            vifVar.play();
        }
    }

    @Override // p000.wja
    public void release() {
        vif vifVar = this.f94365a;
        if (vifVar != null) {
            vifVar.release();
        }
    }

    @Override // p000.wja
    public void resume() {
        vif vifVar = this.f94365a;
        if (vifVar != null) {
            vifVar.resume();
        }
    }

    @Override // p000.wja
    public void stop() {
        vif vifVar = this.f94365a;
        if (vifVar != null) {
            vifVar.stop();
        }
    }

    @Override // p000.xif
    public boolean write(String str) {
        return write(getPCMData(str));
    }

    public void init(String str, vif.InterfaceC14099c interfaceC14099c) {
        init(getPCMData(str), interfaceC14099c);
    }

    @Override // p000.xif
    public boolean write(byte[] bArr) {
        this.f94365a.setDataSource(bArr);
        this.f94365a.prepare();
        return true;
    }

    public void init(byte[] bArr, vif.InterfaceC14099c interfaceC14099c) {
        init((Context) null, new C14628a(interfaceC14099c));
        write(bArr);
    }
}
