package p000;

import android.media.AudioRecord;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2473f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class tf0 {

    /* JADX INFO: renamed from: f */
    public static final int f84470f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f84471g = 44100;

    /* JADX INFO: renamed from: h */
    public static final int f84472h = 16;

    /* JADX INFO: renamed from: i */
    public static final int f84473i = 2;

    /* JADX INFO: renamed from: a */
    public final String f84474a;

    /* JADX INFO: renamed from: b */
    public int f84475b;

    /* JADX INFO: renamed from: c */
    public AudioRecord f84476c;

    /* JADX INFO: renamed from: d */
    public EnumC13007d f84477d;

    /* JADX INFO: renamed from: e */
    public final List<String> f84478e;

    /* JADX INFO: renamed from: tf0$b */
    public static class C13005b {

        /* JADX INFO: renamed from: a */
        public static final tf0 f84479a = new tf0();

        private C13005b() {
        }
    }

    /* JADX INFO: renamed from: tf0$c */
    public interface InterfaceC13006c {
        void recordOfByte(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: tf0$d */
    public enum EnumC13007d {
        STATUS_NO_READY,
        STATUS_READY,
        STATUS_START,
        STATUS_PAUSE,
        STATUS_STOP
    }

    public static tf0 getInstance() {
        return C13005b.f84479a;
    }

    private byte[] normalizeAndConvertBuffer(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return new byte[0];
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float fAbs = Math.abs(fArr2[i]);
            if (fAbs > f) {
                f = fAbs;
            }
        }
        if (f > 1.0f) {
            float f2 = 1.0f / f;
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = fArr2[i2] * f2;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length * 4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asFloatBuffer().put(fArr2);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAudioData, reason: merged with bridge method [inline-methods] */
    public void lambda$startRecord$0(InterfaceC13006c interfaceC13006c) {
        int i = this.f84475b;
        byte[] bArr = new byte[i];
        this.f84477d = EnumC13007d.STATUS_START;
        while (this.f84477d == EnumC13007d.STATUS_START) {
            try {
                if (-3 != this.f84476c.read(bArr, 0, this.f84475b) && interfaceC13006c != null) {
                    interfaceC13006c.recordOfByte(bArr, 0, i);
                }
            } catch (Exception unused) {
                C2473f.m4168e("AudioRecorder", "audioRecord.read error");
            }
        }
    }

    public void cancel() {
        this.f84478e.clear();
        AudioRecord audioRecord = this.f84476c;
        if (audioRecord != null) {
            audioRecord.release();
            this.f84476c = null;
        }
        this.f84477d = EnumC13007d.STATUS_NO_READY;
    }

    @igg({"MissingPermission"})
    public void createAudio(int i, int i2, int i3, int i4) {
        this.f84475b = AudioRecord.getMinBufferSize(i2, i3, i3);
        this.f84476c = new AudioRecord(i, i2, i3, i4, this.f84475b);
    }

    @igg({"MissingPermission"})
    public void createDefaultAudio() {
        C2473f.m4167d("AudioRecorder", "bufferSizeInBytes = " + this.f84475b);
        this.f84476c = new AudioRecord(1, 44100, 16, 2, this.f84475b);
        this.f84477d = EnumC13007d.STATUS_READY;
    }

    public int getPcmFilesCount() {
        return this.f84478e.size();
    }

    public EnumC13007d getStatus() {
        return this.f84477d;
    }

    public void pauseRecord() {
        C2473f.m4167d("AudioRecorder", "===pauseRecord===");
        if (this.f84477d != EnumC13007d.STATUS_START) {
            throw new IllegalStateException("没有在录音");
        }
        this.f84476c.stop();
        this.f84477d = EnumC13007d.STATUS_PAUSE;
    }

    public void release() {
        C2473f.m4167d("AudioRecorder", "===release===");
        AudioRecord audioRecord = this.f84476c;
        if (audioRecord != null) {
            audioRecord.release();
            this.f84476c = null;
        }
        this.f84477d = EnumC13007d.STATUS_NO_READY;
    }

    public void startRecord(final InterfaceC13006c interfaceC13006c) {
        try {
            AudioRecord audioRecord = this.f84476c;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C2473f.m4168e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        EnumC13007d enumC13007d = this.f84477d;
        if (enumC13007d == EnumC13007d.STATUS_NO_READY) {
            C2473f.m4168e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (enumC13007d == EnumC13007d.STATUS_START) {
            C2473f.m4168e("AudioRecorder", "正在录音");
            return;
        }
        C2473f.m4167d("AudioRecorder", "===startRecord===" + this.f84476c.getState());
        try {
            this.f84476c.startRecording();
            qyg.postOnBackgroundThread(new Runnable() { // from class: pf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70580a.lambda$startRecord$0(interfaceC13006c);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void stopRecord() {
        C2473f.m4167d("AudioRecorder", "===stopRecord===");
        EnumC13007d enumC13007d = this.f84477d;
        if (enumC13007d == EnumC13007d.STATUS_NO_READY || enumC13007d == EnumC13007d.STATUS_READY) {
            C2473f.m4168e("AudioRecorder", "录音尚未开始");
            return;
        }
        AudioRecord audioRecord = this.f84476c;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f84477d = EnumC13007d.STATUS_STOP;
    }

    private tf0() {
        this.f84474a = "AudioRecorder";
        this.f84475b = 1024;
        this.f84477d = EnumC13007d.STATUS_NO_READY;
        this.f84478e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAudioData, reason: merged with bridge method [inline-methods] */
    public void lambda$startRecord$1(String str, InterfaceC13006c interfaceC13006c) {
        FileOutputStream fileOutputStream;
        int i = this.f84475b;
        byte[] bArr = new byte[i];
        if (TextUtils.isEmpty(str)) {
            fileOutputStream = null;
        } else {
            try {
                fileOutputStream = new FileOutputStream(new File(str), true);
            } catch (FileNotFoundException e) {
                C2473f.m4168e("AudioRecorder", e.getMessage());
                fileOutputStream = null;
            } catch (IllegalStateException e2) {
                C2473f.m4168e("AudioRecorder", e2.getMessage());
                throw new IllegalStateException(e2.getMessage());
            }
        }
        this.f84477d = EnumC13007d.STATUS_START;
        while (this.f84477d == EnumC13007d.STATUS_START) {
            try {
                if (-3 != this.f84476c.read(bArr, 0, this.f84475b, 0)) {
                    if (fileOutputStream != null) {
                        fileOutputStream.write(bArr);
                    }
                    if (interfaceC13006c != null) {
                        interfaceC13006c.recordOfByte(bArr, 0, i);
                    }
                }
            } catch (Exception unused) {
                C2473f.m4168e("AudioRecorder", "audioRecord.read error");
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                C2473f.m4168e("AudioRecorder", e3.getMessage());
            }
        }
    }

    public void startRecord(final String str, final InterfaceC13006c interfaceC13006c) {
        try {
            AudioRecord audioRecord = this.f84476c;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C2473f.m4168e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        EnumC13007d enumC13007d = this.f84477d;
        if (enumC13007d == EnumC13007d.STATUS_NO_READY) {
            C2473f.m4168e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (enumC13007d == EnumC13007d.STATUS_START) {
            C2473f.m4168e("AudioRecorder", "正在录音");
            return;
        }
        C2473f.m4167d("AudioRecorder", "===startRecord===" + this.f84476c.getState());
        try {
            this.f84476c.startRecording();
            qyg.postOnBackgroundThread(new Runnable() { // from class: lf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57418a.lambda$startRecord$1(str, interfaceC13006c);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
