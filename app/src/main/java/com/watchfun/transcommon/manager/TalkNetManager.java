package com.watchfun.transcommon.manager;

import android.content.Context;
import android.util.Log;
import com.watchfun.transcommon.manager.RecordManger;
import java.io.File;
import java.io.IOException;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class TalkNetManager {
    private OnStateListener downloadFileFileStateListener;
    private RecordManger recordManger;
    private OnStateListener uploadFileStateListener;

    public interface OnStateListener {
        void onState(int i, String str);
    }

    public TalkNetManager() {
        RecordManger recordManger = new RecordManger();
        this.recordManger = recordManger;
        recordManger.setOnRecordingStoppedListener(new RecordManger.OnRecordingStoppedListener() { // from class: com.watchfun.transcommon.manager.TalkNetManager.1
            @Override // com.watchfun.transcommon.manager.RecordManger.OnRecordingStoppedListener
            public void onRecordingStopped(int i) {
                if (TalkNetManager.this.uploadFileStateListener != null) {
                    TalkNetManager.this.uploadFileStateListener.onState(i, "录音结束");
                }
            }
        });
    }

    public void setOnStateListener(OnStateListener onStateListener) {
        this.uploadFileStateListener = onStateListener;
    }

    public void startRecord(Context context) {
        try {
            this.recordManger.startRecordCreateFile(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File stopRecord(Context context, boolean z) {
        return this.recordManger.stopRecord(context, z);
    }

    public File stopRecordAndUpload(Context context) {
        yi9.m26090d("TalkNetManager", "stopRecordAndUpload");
        File fileStopRecord = this.recordManger.stopRecord(context, false);
        Log.e("TalkNetManager", "stopRecordAndUpload" + fileStopRecord);
        if (fileStopRecord == null || !fileStopRecord.exists() || fileStopRecord.length() == 0) {
            OnStateListener onStateListener = this.uploadFileStateListener;
            if (onStateListener == null) {
                return null;
            }
            onStateListener.onState(-1, "文件不存在或已经损坏");
            return null;
        }
        Log.e("TalkNetManager", "stopRecordAndUpload" + fileStopRecord);
        return fileStopRecord;
    }
}
