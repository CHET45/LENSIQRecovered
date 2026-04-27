package com.watchfun.transcommon.manager;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.ReturnCode;
import com.watchfun.transcommon.manager.RecordManger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p000.lx2;
import p000.xnc;

/* JADX INFO: loaded from: classes6.dex */
public class RecordManger {
    private static final int AUDIO_FORMAT = 2;
    private static final int CHANNEL_CONFIG = 16;
    private static final int MAX_INITIAL_SILENCE_DURATION = 5000;
    private static final int MAX_SILENCE_DURATION = 1500;
    private static final int SAMPLE_RATE = 44100;
    private static final double SILENCE_THRESHOLD_DB = -66.0d;
    private static final String TAG = "RecordManager";
    private AudioRecord audioRecord;
    private ByteArrayOutputStream audioStream;
    private OutputStream outputStream;
    private File recordFile;
    private OnRecordingStoppedListener recordingStoppedListener;
    private boolean isRecording = false;
    int bufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);

    public interface OnRecordingStoppedListener {
        void onRecordingStopped(int i);
    }

    private double calculateRMS(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2 += 2) {
            int i3 = (bArr[i2] & 255) | (bArr[i2 + 1] << 8);
            j += (long) (i3 * i3);
        }
        return Math.sqrt(j / (((double) i) / 2.0d));
    }

    private void convertPCMToMP3(File file, File file2) {
        if (file == null || file2 == null) {
            Log.e(TAG, "PCM 转换为 MP3 失败");
            return;
        }
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (!ReturnCode.isSuccess(FFmpegKit.execute(String.format("-y -f s16le -ar %d -ac 1 -i %s %s", 44100, absolutePath, absolutePath2)).getReturnCode())) {
            Log.e(TAG, "PCM 转换为 MP3 失败");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PCM 转换为 MP3 成功:");
        sb.append(absolutePath2);
    }

    private File createMP3File(Context context) {
        File file = new File(context.getExternalFilesDir("trans").getAbsolutePath());
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "recorded_audio.mp3");
    }

    private File createRecordFile(Context context) {
        File file = new File(context.getExternalFilesDir("trans").getAbsolutePath());
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "wook.pcm");
    }

    private boolean isSilent(byte[] bArr, int i) {
        double dLog10 = Math.log10(calculateRMS(bArr, i) / 32768.0d) * 20.0d;
        Log.e(TAG, "isSilent Error in audio db =" + dLog10);
        return dLog10 < SILENCE_THRESHOLD_DB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyUser$0(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    private void notifyUser(final Context context, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ntd
            @Override // java.lang.Runnable
            public final void run() {
                RecordManger.lambda$notifyUser$0(context, str);
            }
        });
    }

    private void uploadFileToServer(File file) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeAudioToStream(Context context) {
        try {
            try {
                try {
                    int i = this.bufferSize;
                    byte[] bArr = new byte[i];
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean z = false;
                    long j = -1;
                    while (this.isRecording) {
                        int i2 = this.audioRecord.read(bArr, 0, i);
                        if (i2 > 0) {
                            this.outputStream.write(bArr, 0, i2);
                            boolean zIsSilent = isSilent(bArr, i2);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (z) {
                                if (!zIsSilent) {
                                    j = -1;
                                } else if (j == -1) {
                                    j = jCurrentTimeMillis2;
                                } else if (jCurrentTimeMillis2 - j > 1500) {
                                    stopRecord(context, false);
                                    OnRecordingStoppedListener onRecordingStoppedListener = this.recordingStoppedListener;
                                    if (onRecordingStoppedListener != null) {
                                        onRecordingStoppedListener.onRecordingStopped(0);
                                    }
                                    try {
                                        this.outputStream.flush();
                                        this.outputStream.close();
                                        return;
                                    } catch (IOException e) {
                                        Log.e(TAG, "关闭或刷新输出流时出错", e);
                                        return;
                                    }
                                }
                            } else {
                                if (zIsSilent && jCurrentTimeMillis2 - jCurrentTimeMillis > 5000) {
                                    stopRecord(context, false);
                                    notifyUser(context, "录音结束：您没有说话");
                                    OnRecordingStoppedListener onRecordingStoppedListener2 = this.recordingStoppedListener;
                                    if (onRecordingStoppedListener2 != null) {
                                        onRecordingStoppedListener2.onRecordingStopped(1);
                                    }
                                    try {
                                        this.outputStream.flush();
                                        this.outputStream.close();
                                        return;
                                    } catch (IOException e2) {
                                        Log.e(TAG, "关闭或刷新输出流时出错", e2);
                                        return;
                                    }
                                }
                                if (!zIsSilent) {
                                    z = true;
                                }
                            }
                        }
                    }
                    this.outputStream.flush();
                    this.outputStream.close();
                } catch (IOException e3) {
                    Log.e(TAG, "关闭或刷新输出流时出错", e3);
                }
            } catch (Exception e4) {
                Log.e(TAG, "Error in audio recording", e4);
                this.outputStream.flush();
                this.outputStream.close();
            }
        } finally {
        }
    }

    public void setOnRecordingStoppedListener(OnRecordingStoppedListener onRecordingStoppedListener) {
        this.recordingStoppedListener = onRecordingStoppedListener;
    }

    public void startRecordCreateFile(final Context context) throws IOException {
        if (lx2.checkSelfPermission(context, xnc.f98582G) != 0) {
            return;
        }
        AudioRecord audioRecord = new AudioRecord(7, 44100, 16, 2, this.bufferSize);
        this.audioRecord = audioRecord;
        if (audioRecord.getState() != 1) {
            AudioRecord audioRecord2 = this.audioRecord;
            if (audioRecord2 != null) {
                audioRecord2.release();
                this.audioRecord = null;
            }
            throw new IllegalStateException("AudioRecord 初始化失败");
        }
        this.recordFile = createRecordFile(context);
        this.outputStream = new FileOutputStream(this.recordFile);
        this.audioRecord.startRecording();
        this.isRecording = true;
        new Thread(new Runnable() { // from class: com.watchfun.transcommon.manager.RecordManger.1
            @Override // java.lang.Runnable
            public void run() {
                RecordManger.this.writeAudioToStream(context);
            }
        }).start();
    }

    public File stopRecord(Context context, boolean z) {
        OnRecordingStoppedListener onRecordingStoppedListener;
        this.isRecording = false;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.stop();
            this.audioRecord.release();
            this.audioRecord = null;
        }
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                Log.e(TAG, "关闭输出流失败", e);
            }
        }
        File fileCreateMP3File = createMP3File(context);
        convertPCMToMP3(this.recordFile, fileCreateMP3File);
        uploadFileToServer(fileCreateMP3File);
        if (z && (onRecordingStoppedListener = this.recordingStoppedListener) != null) {
            onRecordingStoppedListener.onRecordingStopped(0);
        }
        return fileCreateMP3File;
    }
}
