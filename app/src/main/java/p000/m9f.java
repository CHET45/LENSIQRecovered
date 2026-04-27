package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class m9f {
    public static void shareMp3File(Context context, File mp3File) {
        try {
            new File(context.getExternalFilesDir(null), amc.f2088w);
            if (!mp3File.exists()) {
                Toast.makeText(context, "MP3文件不存在", 0).show();
                return;
            }
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", mp3File);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("audio/*");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, "分享MP3"));
        } catch (IllegalArgumentException e) {
            Log.e("ShareMP3", "分享失败: " + e.getMessage());
            Toast.makeText(context, "分享失败: " + e.getMessage(), 0).show();
        }
    }

    public static void shareTextContent(Context context, String text) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        context.startActivity(Intent.createChooser(intent, "分享到"));
    }

    public static void shareTextFile(Context context, String fileName, String content) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.close();
            Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".fileProvider", file);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, fileName));
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(context, "创建分享文件失败", 0).show();
        }
    }
}
