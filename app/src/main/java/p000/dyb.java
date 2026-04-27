package p000;

import android.media.AudioRecord;
import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class dyb {

    /* JADX INFO: renamed from: i */
    public static final int f31303i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f31304j = 16000;

    /* JADX INFO: renamed from: k */
    public static final int f31305k = 16;

    /* JADX INFO: renamed from: l */
    public static final int f31306l = 2;

    /* JADX INFO: renamed from: a */
    public final String f31307a;

    /* JADX INFO: renamed from: b */
    public int f31308b;

    /* JADX INFO: renamed from: c */
    public AudioRecord f31309c;

    /* JADX INFO: renamed from: d */
    public AtomicReference<EnumC5015d> f31310d;

    /* JADX INFO: renamed from: e */
    public final List<String> f31311e;

    /* JADX INFO: renamed from: f */
    public Future<?> f31312f;

    /* JADX INFO: renamed from: g */
    public String f31313g;

    /* JADX INFO: renamed from: h */
    public InterfaceC5014c f31314h;

    /* JADX INFO: renamed from: dyb$b */
    public static class C5013b {

        /* JADX INFO: renamed from: a */
        public static final dyb f31315a = new dyb();

        private C5013b() {
        }
    }

    /* JADX INFO: renamed from: dyb$c */
    public interface InterfaceC5014c {
        void recordOfByte(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: dyb$d */
    public enum EnumC5015d {
        STATUS_NO_READY,
        STATUS_READY,
        STATUS_START,
        STATUS_PAUSE,
        STATUS_STOP
    }

    public static dyb getInstance() {
        return C5013b.f31315a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecord$0(InterfaceC5014c interfaceC5014c) {
        lambda$startRecord$1(this.f31313g, interfaceC5014c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecord$2() {
        readAudioData(this.f31314h);
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

    private void readAudioData(InterfaceC5014c interfaceC5014c) {
        int i = this.f31308b;
        byte[] bArr = new byte[i];
        this.f31310d.set(EnumC5015d.STATUS_START);
        C2473f.m4167d("AudioRecorder", "===readAudioData Status.STATUS_START===");
        while (this.f31310d.get() == EnumC5015d.STATUS_START) {
            try {
                int i2 = this.f31309c.read(bArr, 0, this.f31308b);
                C2473f.m4167d("AudioRecorder", "===audioRecord read data===" + this.f31310d);
                if (-3 != i2 && interfaceC5014c != null) {
                    interfaceC5014c.recordOfByte(bArr, 0, i);
                }
            } catch (Exception unused) {
                C2473f.m4168e("AudioRecorder", "audioRecord.read error");
            }
        }
    }

    public void cancel() {
        this.f31311e.clear();
        AudioRecord audioRecord = this.f31309c;
        if (audioRecord != null) {
            audioRecord.release();
            this.f31309c = null;
        }
        this.f31310d.set(EnumC5015d.STATUS_NO_READY);
    }

    @igg({"MissingPermission"})
    public void createAudio(int i, int i2, int i3, int i4) {
        this.f31308b = AudioRecord.getMinBufferSize(i2, i3, i3);
        this.f31309c = new AudioRecord(i, i2, i3, i4, this.f31308b);
    }

    @igg({"MissingPermission"})
    public void createDefaultAudio() {
        this.f31308b = AudioRecord.getMinBufferSize(16000, 16, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("bufferSizeInBytes = ");
        sb.append(this.f31308b);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("testBufferSize = ");
        sb2.append(1280);
        this.f31309c = new AudioRecord(1, 16000, 16, 2, this.f31308b);
        this.f31310d.set(EnumC5015d.STATUS_READY);
    }

    public int getBufferSizeInBytes() {
        return this.f31308b;
    }

    public int getPcmFilesCount() {
        return this.f31311e.size();
    }

    public EnumC5015d getStatus() {
        return this.f31310d.get();
    }

    public void pauseRecord() {
        C2473f.m4167d("AudioRecorder", "===pauseRecord===");
        if (this.f31310d.get() != EnumC5015d.STATUS_START) {
            throw new IllegalStateException("没有在录音");
        }
        this.f31309c.stop();
        this.f31310d.set(EnumC5015d.STATUS_PAUSE);
    }

    public void release() {
        C2473f.m4167d("AudioRecorder", "===release===");
        AudioRecord audioRecord = this.f31309c;
        if (audioRecord != null) {
            audioRecord.release();
            this.f31309c = null;
        }
        this.f31310d.set(EnumC5015d.STATUS_NO_READY);
    }

    public void startRecord(final InterfaceC5014c interfaceC5014c) {
        try {
            AudioRecord audioRecord = this.f31309c;
            if (audioRecord == null || audioRecord.getState() == 0) {
                Log.e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f31310d.get() == EnumC5015d.STATUS_NO_READY) {
            Log.e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (this.f31310d.get() == EnumC5015d.STATUS_START) {
            Log.e("AudioRecorder", "正在录音");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("===startRecord===");
        sb.append(this.f31309c.getState());
        try {
            this.f31309c.startRecording();
            this.f31314h = interfaceC5014c;
            this.f31312f = ezb.postOnBackgroundThread(new Runnable() { // from class: byb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15209a.lambda$startRecord$0(interfaceC5014c);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String stopRecord() {
        C2473f.m4167d("AudioRecorder", "===stopRecord===");
        if (this.f31310d.get() == EnumC5015d.STATUS_NO_READY || this.f31310d.get() == EnumC5015d.STATUS_READY) {
            C2473f.m4168e("AudioRecorder", "录音尚未开始");
        } else {
            this.f31310d.set(EnumC5015d.STATUS_STOP);
            AudioRecord audioRecord = this.f31309c;
            if (audioRecord != null) {
                try {
                    audioRecord.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            C2473f.m4167d("AudioRecorder", "===stopRecord===" + this.f31310d);
        }
        return this.f31313g;
    }

    private dyb() {
        this.f31307a = "AudioRecorder";
        this.f31308b = 1280;
        this.f31310d = new AtomicReference<>(EnumC5015d.STATUS_NO_READY);
        this.f31311e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAudioData, reason: merged with bridge method [inline-methods] */
    public void lambda$startRecord$1(String str, InterfaceC5014c interfaceC5014c) {
        FileOutputStream fileOutputStream;
        int i = this.f31308b;
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
        this.f31310d.set(EnumC5015d.STATUS_START);
        while (this.f31310d.get() == EnumC5015d.STATUS_START) {
            try {
                int i2 = this.f31309c.read(bArr, 0, this.f31308b, 0);
                C2473f.m4167d("AudioRecorder", "===audioRecord read data===" + this.f31309c.getState());
                if (-3 != i2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    byte[] bArrLinearResample = tg0.linearResample(bArr, 16000, 44100);
                    StringBuilder sb = new StringBuilder();
                    sb.append("linearResample: ");
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    if (fileOutputStream != null) {
                        fileOutputStream.write(bArrLinearResample);
                    }
                    if (interfaceC5014c != null) {
                        interfaceC5014c.recordOfByte(bArr, 0, i);
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

    public void startRecord(final String str, final InterfaceC5014c interfaceC5014c) {
        try {
            AudioRecord audioRecord = this.f31309c;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C2473f.m4168e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f31310d.get() == EnumC5015d.STATUS_NO_READY) {
            C2473f.m4168e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (this.f31310d.get() == EnumC5015d.STATUS_START) {
            C2473f.m4168e("AudioRecorder", "正在录音");
            return;
        }
        C2473f.m4167d("AudioRecorder", "===startRecord===" + this.f31309c.getState());
        this.f31313g = str;
        try {
            this.f31309c.startRecording();
            this.f31314h = interfaceC5014c;
            ezb.postOnBackgroundThread(new Runnable() { // from class: cyb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28055a.lambda$startRecord$1(str, interfaceC5014c);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void startRecord() {
        try {
            AudioRecord audioRecord = this.f31309c;
            if (audioRecord == null || audioRecord.getState() == 0) {
                Log.e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f31310d.get() == EnumC5015d.STATUS_NO_READY) {
            Log.e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (this.f31310d.get() == EnumC5015d.STATUS_START) {
            Log.e("AudioRecorder", "正在录音");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("===startRecord===");
        sb.append(this.f31309c.getState());
        try {
            this.f31309c.startRecording();
            ezb.postOnBackgroundThread(new Runnable() { // from class: ayb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12208a.lambda$startRecord$2();
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
