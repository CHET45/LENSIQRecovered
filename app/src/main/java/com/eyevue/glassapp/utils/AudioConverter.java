package com.eyevue.glassapp.utils;

import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.FFmpegSession;
import com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback;
import com.arthenica.ffmpegkit.ReturnCode;

/* JADX INFO: loaded from: classes4.dex */
public class AudioConverter {

    public interface ConversionCallback {
        void onFailure(String errorLog);

        void onSuccess(String outputMp3Path);
    }

    public static void convertWavToMp3(String inputWavPath, final String outputMp3Path, final ConversionCallback callback) {
        FFmpegKit.executeAsync(String.format("-y -i %s -codec:a libmp3lame -q:a 0 -ar 44100 -ac 2 %s", inputWavPath, outputMp3Path), new FFmpegSessionCompleteCallback() { // from class: com.eyevue.glassapp.utils.AudioConverter.1
            @Override // com.arthenica.ffmpegkit.FFmpegSessionCompleteCallback
            public void apply(FFmpegSession session) {
                if (ReturnCode.isSuccess(session.getReturnCode())) {
                    ConversionCallback conversionCallback = callback;
                    if (conversionCallback != null) {
                        conversionCallback.onSuccess(outputMp3Path);
                        return;
                    }
                    return;
                }
                String string = session.getAllLogs().toString();
                ConversionCallback conversionCallback2 = callback;
                if (conversionCallback2 != null) {
                    conversionCallback2.onFailure(string);
                }
            }
        });
    }
}
