package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.MotionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class ckg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static void copyPicture(String str, String str2, String str3) throws Throwable {
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdir();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream((String) str);
                    try {
                        str = new FileOutputStream(str2 + str3);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = fileInputStream2.read(bArr);
                                if (i == -1) {
                                    fileInputStream2.close();
                                    str.close();
                                    return;
                                }
                                str.write(bArr, 0, i);
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            str = str;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (str != 0) {
                                str.close();
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileInputStream = fileInputStream2;
                            str = str;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (str != 0) {
                                str.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                    throw th;
                                }
                            }
                            if (str != 0) {
                                str.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        str = 0;
                    } catch (IOException e5) {
                        e = e5;
                        str = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        str = 0;
                    }
                } catch (FileNotFoundException e6) {
                    e = e6;
                    str = 0;
                } catch (IOException e7) {
                    e = e7;
                    str = 0;
                } catch (Throwable th3) {
                    th = th3;
                    str = 0;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String formatRandom(int i) {
        String str = i + "";
        if (str.length() == 1) {
            return "000" + str;
        }
        if (str.length() == 2) {
            return "00" + str;
        }
        if (str.length() != 3) {
            return str;
        }
        return a43.f347l + str;
    }

    public static String formatTime(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    public static String getPackageName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveAlbum(String str, String str2, Context context) {
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(), str, str2, (String) null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse(iei.f46708b + str)));
    }

    public static float twoPointDistance(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static String formatTime(long j, String str) {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(j)) + str;
    }
}
