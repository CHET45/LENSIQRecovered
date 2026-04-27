package com.eyevue.glassapp.utils.photo;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import com.watchfun.base.BaseApplication;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p000.igg;
import p000.qq9;

/* JADX INFO: loaded from: classes4.dex */
public class FileUtils {
    public static final int MEDIA_TYPE_ALL = 0;
    public static final int MEDIA_TYPE_AUDIO = 3;
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;

    private static void copyFile(File source, File target) throws IOException {
        FileChannel channel = new FileInputStream(source).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(target).getChannel();
            try {
                channel2.transferFrom(channel, 0L, channel.size());
                channel2.close();
                channel.close();
            } finally {
            }
        } catch (Throwable th) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void deleteAllFilterFiles(Context context) {
        File[] fileArrListFiles;
        File mediaDirectory = getMediaDirectory(context);
        if (!mediaDirectory.isDirectory() || (fileArrListFiles = mediaDirectory.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isFile() && file.getName().contains("_filter")) {
                Log.e("xtest", "准备删除的文件是：" + file.getPath());
                file.delete();
            }
        }
    }

    public static boolean deleteMedia(Uri mediaUri) {
        try {
            File file = new File(mediaUri.getPath());
            if (!file.exists()) {
                return false;
            }
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf > 0) {
                name = name.substring(0, iLastIndexOf);
            }
            if (name.endsWith("_filter")) {
                File file2 = new File(file.getPath().replace("_filter", ""));
                if (file2.exists()) {
                    file2.delete();
                }
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void ensureMediaDirectoryExists(Context context) {
        File mediaDirectory = getMediaDirectory(context);
        if (mediaDirectory.exists()) {
            return;
        }
        mediaDirectory.mkdirs();
    }

    @igg({"DefaultLocale"})
    public static String formatDuration(long durationMs) {
        long jRound = Math.round(durationMs / 1000.0f);
        int i = (int) (jRound / 3600);
        int i2 = (int) ((jRound % 3600) / 60);
        int i3 = (int) (jRound % 60);
        return i > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)) : String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String getFormattedDuration(String videoPath) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(videoPath);
                return formatDuration(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
            } catch (Exception e) {
                e.printStackTrace();
                String duration = formatDuration(0L);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return duration;
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public static File getMediaDirectory(Context context) {
        return new File(context.getFilesDir(), "media");
    }

    public static File getMediaDirectoryMp3(Context context) {
        File file = new File(context.getFilesDir(), "/mp3");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File getMediaDirectoryTemporary(Context context) {
        return new File(context.getFilesDir(), "media/temporary");
    }

    public static Uri getMediaNoFilterUriByName(Context context, String fileName, int filterType) {
        File mediaDirectory = getMediaDirectory(context);
        if (!mediaDirectory.isDirectory()) {
            return null;
        }
        File file = new File(mediaDirectory.getPath(), fileName);
        if (!file.isFile() || hasFilterFile(file) || qq9.f75117a.getBoolean(file.getName(), false) || isCurrentFilterFile(file)) {
            return null;
        }
        if (filterType == 0) {
            return Uri.fromFile(file);
        }
        if (filterType == 1 && isImageFile(file.getName())) {
            return Uri.fromFile(file);
        }
        if (filterType == 2 && isVideoFile(file.getName())) {
            return Uri.fromFile(file);
        }
        return null;
    }

    public static String getOtaOutputPath() {
        File file = new File(BaseApplication.getInstance().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "/ota");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static boolean hasEditFile(File file) {
        File parentFile;
        String strSubstring;
        if (file == null || !file.exists() || (parentFile = file.getParentFile()) == null) {
            return false;
        }
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            String strSubstring2 = name.substring(0, iLastIndexOf);
            strSubstring = name.substring(iLastIndexOf);
            name = strSubstring2;
        } else {
            strSubstring = "";
        }
        return new File(parentFile, "edit_" + name + "_filter" + strSubstring).exists();
    }

    public static boolean hasFilterFile(File file) {
        File parentFile;
        String strSubstring;
        if (file == null || !file.exists() || (parentFile = file.getParentFile()) == null) {
            return false;
        }
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            String strSubstring2 = name.substring(0, iLastIndexOf);
            strSubstring = name.substring(iLastIndexOf);
            name = strSubstring2;
        } else {
            strSubstring = "";
        }
        return new File(parentFile, name + "_filter" + strSubstring).exists();
    }

    public static boolean isAudioFile(String fileName) {
        String[] strArr = {".mp3", ".wav", ".aac"};
        String lowerCase = fileName.toLowerCase();
        for (int i = 0; i < 3; i++) {
            if (lowerCase.endsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCurrentFilterFile(File file) {
        if (file == null || !file.exists() || file.getParentFile() == null) {
            return false;
        }
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            name = name.substring(0, iLastIndexOf);
        }
        return name.endsWith("_filter");
    }

    public static boolean isImageFile(File file) {
        String[] strArr = {".jpg", ".jpeg", ".png"};
        String lowerCase = file.getName().toLowerCase();
        for (int i = 0; i < 3; i++) {
            if (lowerCase.endsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMediaFile(File file) {
        return isImageFile(file) || isVideoFile(file.getName()) || isAudioFile(file.getName());
    }

    public static boolean isThumbFile(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.getName().startsWith("ThumbnailDH-");
    }

    public static boolean isVideoFile(String fileName) {
        String[] strArr = {".mp4", ".avi", ".mov", ".mkv"};
        String lowerCase = fileName.toLowerCase();
        for (int i = 0; i < 4; i++) {
            if (lowerCase.endsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWaterMaskFile(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.getName().contains("_watermask");
    }

    public static ArrayList<Uri> loadMediaFromDirectory(Context context, int mediaType) {
        File[] fileArrListFiles;
        ArrayList<Uri> arrayList = new ArrayList<>();
        File mediaDirectory = getMediaDirectory(context);
        if (mediaDirectory.isDirectory() && (fileArrListFiles = mediaDirectory.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && !hasFilterFile(file) && !hasEditFile(file)) {
                    if (mediaType == 2 && isVideoFile(file.getName())) {
                        arrayList.add(Uri.fromFile(file));
                    } else if (mediaType == 3 && isAudioFile(file.getName())) {
                        arrayList.add(Uri.fromFile(file));
                    } else if (mediaType == 1 && isImageFile(file.getName())) {
                        arrayList.add(Uri.fromFile(file));
                    } else if (mediaType == 0 && isMediaFile(file)) {
                        arrayList.add(Uri.fromFile(file));
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<Uri> loadPhotoFromDirectory(Context context) {
        File[] fileArrListFiles;
        ArrayList<Uri> arrayList = new ArrayList<>();
        File mediaDirectory = getMediaDirectory(context);
        if (mediaDirectory.isDirectory() && (fileArrListFiles = mediaDirectory.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && !hasFilterFile(file) && !qq9.f75117a.getBoolean(file.getName(), false) && !isCurrentFilterFile(file) && isImageFile(file.getName())) {
                    arrayList.add(Uri.fromFile(file));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<Uri> loadPhotoNoWaterMaskFromDirectory(Context context) {
        File[] fileArrListFiles;
        ArrayList<Uri> arrayList = new ArrayList<>();
        File mediaDirectory = getMediaDirectory(context);
        if (mediaDirectory.isDirectory() && (fileArrListFiles = mediaDirectory.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && !isWaterMaskFile(file) && !isThumbFile(file) && isImageFile(file.getName())) {
                    arrayList.add(Uri.fromFile(file));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<Uri> loadVideoFromDirectory(Context context) {
        File[] fileArrListFiles;
        ArrayList<Uri> arrayList = new ArrayList<>();
        File mediaDirectory = getMediaDirectory(context);
        if (mediaDirectory.isDirectory() && (fileArrListFiles = mediaDirectory.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && !hasFilterFile(file) && !qq9.f75117a.getBoolean(file.getName(), false) && !isCurrentFilterFile(file) && isVideoFile(file.getName())) {
                    arrayList.add(Uri.fromFile(file));
                }
            }
        }
        return arrayList;
    }

    private static boolean saveAudio(Context context, String fileName, File sourceFile) {
        return Build.VERSION.SDK_INT >= 29 ? saveAudioWithMediaStore(context, fileName, sourceFile) : saveToExternalStorage(context, fileName, sourceFile, Environment.DIRECTORY_MUSIC);
    }

    private static boolean saveAudioWithMediaStore(Context context, String fileName, File sourceFile) {
        FileOutputStream fileOutputStream;
        byte[] bArr;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", fileName);
            contentValues.put("mime_type", "audio/mpeg");
            contentValues.put("relative_path", Environment.DIRECTORY_MUSIC);
            contentValues.put("is_pending", (Integer) 0);
            Uri uriInsert = context.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                FileInputStream fileInputStream = new FileInputStream(sourceFile);
                try {
                    fileOutputStream = (FileOutputStream) context.getContentResolver().openOutputStream(uriInsert);
                    try {
                        bArr = new byte[8192];
                    } finally {
                    }
                } finally {
                }
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriInsert));
                        fileOutputStream.close();
                        fileInputStream.close();
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean saveMediaToAlbum(Context context, Uri mediaUri) {
        File file = new File(mediaUri.getPath());
        if (!file.exists()) {
            return false;
        }
        String name = file.getName();
        return isVideoFile(name) ? saveVideoToAlbum(context, name, file) : isAudioFile(name) ? saveAudio(context, name, file) : savePhotoToAlbum(context, name, file);
    }

    private static boolean savePhotoToAlbum(Context context, String fileName, File sourceFile) {
        return Build.VERSION.SDK_INT >= 29 ? savePhotoToAlbumWithMediaStore(context, fileName, sourceFile) : saveToExternalStorage(context, fileName, sourceFile, Environment.DIRECTORY_PICTURES);
    }

    private static boolean savePhotoToAlbumWithMediaStore(Context context, String fileName, File sourceFile) {
        FileOutputStream fileOutputStream;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", fileName);
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("is_pending", (Integer) 0);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                FileInputStream fileInputStream = new FileInputStream(sourceFile);
                try {
                    fileOutputStream = (FileOutputStream) contentResolver.openOutputStream(uriInsert);
                } finally {
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriInsert));
                            fileOutputStream.close();
                            fileInputStream.close();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean saveToExternalStorage(Context context, String fileName, File sourceFile, String directoryType) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(directoryType), "MyApp");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, fileName);
            copyFile(sourceFile, file2);
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file2)));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean saveVideoToAlbum(Context context, String fileName, File sourceFile) {
        return Build.VERSION.SDK_INT >= 29 ? saveVideoToAlbumWithMediaStore(context, fileName, sourceFile) : saveToExternalStorage(context, fileName, sourceFile, Environment.DIRECTORY_MOVIES);
    }

    private static boolean saveVideoToAlbumWithMediaStore(Context context, String fileName, File sourceFile) {
        FileOutputStream fileOutputStream;
        byte[] bArr;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", fileName);
            contentValues.put("mime_type", "video/mp4");
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
            contentValues.put("is_pending", (Integer) 0);
            Uri uriInsert = context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                FileInputStream fileInputStream = new FileInputStream(sourceFile);
                try {
                    fileOutputStream = (FileOutputStream) context.getContentResolver().openOutputStream(uriInsert);
                    try {
                        bArr = new byte[8192];
                    } finally {
                    }
                } finally {
                }
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriInsert));
                        fileOutputStream.close();
                        fileInputStream.close();
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isImageFile(String file) {
        String[] strArr = {".jpg", ".jpeg", ".png"};
        String lowerCase = file.toLowerCase();
        for (int i = 0; i < 3; i++) {
            if (lowerCase.endsWith(strArr[i])) {
                return true;
            }
        }
        return false;
    }
}
