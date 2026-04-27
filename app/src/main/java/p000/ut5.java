package p000;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class ut5 {

    /* JADX INFO: renamed from: a */
    public static final String f89076a = "FileUtil";

    /* JADX INFO: renamed from: b */
    public static final String f89077b = "pics";

    public static boolean bitmapToFile(Bitmap bitmap, String str, int i) throws Throwable {
        if (bitmap != null && !TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream2);
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e5) {
                e = e5;
            }
        }
        return false;
    }

    private static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void cleanCache() {
        trimCache();
        trimCodeCache();
        trimExternalCache();
    }

    public static boolean createNewFile(File file) throws IOException {
        return file.createNewFile();
    }

    public static boolean deleteDir(File file) {
        if (file != null && file.isDirectory()) {
            for (String str : file.list()) {
                if (!deleteDir(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static void deleteFile(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            if (file.delete()) {
                Log.i("FileUtil", "delete file success! path" + file.getPath());
                return;
            }
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (file.delete()) {
                    Log.i("FileUtil", "delete empty file success!");
                    return;
                }
                return;
            }
            for (File file2 : fileArrListFiles) {
                deleteFile(file2);
            }
            if (file.delete()) {
                Log.i("FileUtil", "delete empty file success!");
            }
        }
    }

    public static String formatFileSize(long j) {
        if (j == 0) {
            return "0M";
        }
        return new DecimalFormat("0.00").format((j / 1024.0d) / 1024.0d) + "M";
    }

    public static File getFile(String str, String str2) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, str2);
        if (file2.exists()) {
            file2.delete();
        }
        file2.createNewFile();
        return file2;
    }

    public static String getFileSign(File file, String str, StringBuilder sb) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            sb.append("[getFileSign] signType is empty! signType:");
            sb.append(str);
            sb.append("\n");
            return "";
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "sha256":
                str2 = "SHA-256";
                break;
            case "md5":
                str2 = "MD5";
                break;
            case "sha1":
                str2 = lc2.f57149a;
                break;
            default:
                str2 = "";
                break;
        }
        if (TextUtils.isEmpty(str2)) {
            Log.e("FileUtil", "type undefined");
            sb.append("[getFileSign] type undefined!");
            sb.append("\n");
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                String strBytesToHexString = bytesToHexString(messageDigest.digest());
                                try {
                                    fileInputStream.close();
                                } catch (IOException e) {
                                    Log.e("FileUtil", "[MD5]Exception on closing MD5 input stream", e);
                                    sb.append("[getFileSign][MD5]Exception on closing MD5 input stream!");
                                    sb.append("\n");
                                }
                                return strBytesToHexString;
                            }
                            messageDigest.update(bArr, 0, i);
                        } catch (Exception e2) {
                            Log.e("FileUtil", "[MD5]Unable to process file for MD5", e2);
                            sb.append("[getFileSign][MD5]Unable to process file for MD5!");
                            sb.append("\n");
                            try {
                                fileInputStream.close();
                            } catch (IOException e3) {
                                Log.e("FileUtil", "[MD5]Exception on closing MD5 input stream", e3);
                                sb.append("[getFileSign][MD5]Exception on closing MD5 input stream!");
                                sb.append("\n");
                            }
                            return "";
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            Log.e("FileUtil", "[MD5]Exception on closing MD5 input stream", e4);
                            sb.append("[getFileSign][MD5]Exception on closing MD5 input stream!");
                            sb.append("\n");
                        }
                        throw th;
                    }
                }
            } catch (Exception e5) {
                Log.e("FileUtil", "[MD5]Exception while getting FileInputStream", e5);
                sb.append("[getFileSign][MD5]Exception while getting FileInputStream");
                sb.append("\n");
                return "";
            }
        } catch (NoSuchAlgorithmException e6) {
            Log.e("FileUtil", "[MD5]Exception while getting digest type: " + str2, e6);
            sb.append("[getFileSign][MD5]Exception while getting digest type: type");
            sb.append(str2);
            sb.append("error:");
            sb.append(e6.getMessage());
            sb.append("\n");
            return "";
        }
    }

    public static String getFileSignAgain(File file, String str, StringBuilder sb) {
        String str2;
        StringBuilder sb2;
        char[] cArr;
        byte[] bArrDigest;
        if (TextUtils.isEmpty(str)) {
            sb.append("[getFileSignAgain] signType is empty! signType:");
            sb.append(str);
            sb.append("\n");
            return "";
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "sha256":
                str2 = "SHA-256";
                break;
            case "md5":
                str2 = "MD5";
                break;
            case "sha1":
                str2 = lc2.f57149a;
                break;
            default:
                str2 = "";
                break;
        }
        if (TextUtils.isEmpty(str2)) {
            Log.e("FileUtil", "type undefined");
            sb.append("[getFileSignAgain] type undefined!");
            sb.append("\n");
            return "";
        }
        StringBuilder sb3 = null;
        try {
            cArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', sjc.f82029s, 'b', sjc.f82021k, 'd', 'e', 'f'};
            FileChannel channel = new FileInputStream(file).getChannel();
            long size = channel.size();
            int iCeil = (int) Math.ceil(size / 2.147483647E9d);
            MappedByteBuffer[] mappedByteBufferArr = new MappedByteBuffer[iCeil];
            long j = 0;
            long j2 = 2147483647L;
            int i = 0;
            while (i < iCeil) {
                long j3 = size - j;
                if (j3 < 2147483647L) {
                    j2 = j3;
                }
                int i2 = i;
                MappedByteBuffer[] mappedByteBufferArr2 = mappedByteBufferArr;
                mappedByteBufferArr2[i2] = channel.map(FileChannel.MapMode.READ_ONLY, j, j2);
                j += j2;
                i = i2 + 1;
                iCeil = iCeil;
                mappedByteBufferArr = mappedByteBufferArr2;
                size = size;
            }
            int i3 = iCeil;
            MappedByteBuffer[] mappedByteBufferArr3 = mappedByteBufferArr;
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            for (int i4 = 0; i4 < i3; i4++) {
                messageDigest.update(mappedByteBufferArr3[i4]);
            }
            bArrDigest = messageDigest.digest();
            sb2 = new StringBuilder(bArrDigest.length * 2);
        } catch (Exception e) {
            e = e;
        }
        try {
            for (byte b : bArrDigest) {
                char c = cArr[(b & 240) >> 4];
                char c2 = cArr[b & 15];
                sb2.append(c);
                sb2.append(c2);
            }
        } catch (Exception e2) {
            e = e2;
            sb3 = sb2;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("getFileMD5:error:");
            sb4.append(e.getMessage());
            sb.append("[getFileSignAgain] error:");
            sb.append(e.getMessage());
            sb.append("\n");
            sb2 = sb3;
        }
        return sb2 == null ? "" : sb2.toString();
    }

    public static long getFileSize(File file) {
        File[] fileArrListFiles = file.listFiles();
        long fileSize = 0;
        for (int i = 0; i < fileArrListFiles.length; i++) {
            fileSize += fileArrListFiles[i].isDirectory() ? getFileSize(fileArrListFiles[i]) : fileArrListFiles[i].length();
        }
        return fileSize;
    }

    public static String getSuffix(String str) {
        int iLastIndexOf;
        return (str == null || (iLastIndexOf = str.lastIndexOf(".")) == -1 || iLastIndexOf == 0 || iLastIndexOf == str.length() + (-1)) ? "" : str.substring(iLastIndexOf + 1).toLowerCase();
    }

    public static String getver(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(k95.f53074X4) || str.startsWith("v")) {
            str = str.substring(1);
        }
        if (str.length() <= 9) {
            return str;
        }
        return str.substring(0, 9) + "...";
    }

    public static boolean mkdirs(File file) {
        return file.mkdirs();
    }

    public static boolean renameTo(File file, File file2) {
        return file.renameTo(file2);
    }

    public static String saveByteBufferToPCMFile(ByteBuffer byteBuffer, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File fileByPath = xt5.getFileByPath(str);
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileByPath, true);
                try {
                    fileOutputStream2.getChannel().write(byteBuffer);
                    fileOutputStream2.close();
                    String absolutePath = fileByPath.getAbsolutePath();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return absolutePath;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static boolean setLastModified(File file, long j) {
        return file.setLastModified(j);
    }

    public static String streamToString(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString();
            }
            sb.append(line);
        }
    }

    private static String toHexString(byte[] bArr, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (z) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append(a43.f347l);
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String toMd5(byte[] bArr, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return toHexString(messageDigest.digest(), "", z);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean trimCache() {
        try {
            File cacheDir = iy2.getAppContext().getCacheDir();
            if (cacheDir == null || !cacheDir.isDirectory() || cacheDir.listFiles().length == 0) {
                return false;
            }
            return deleteDir(cacheDir);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean trimCodeCache() {
        try {
            File codeCacheDir = iy2.getAppContext().getCodeCacheDir();
            if (codeCacheDir == null || !codeCacheDir.isDirectory() || codeCacheDir.listFiles().length == 0) {
                return false;
            }
            return deleteDir(codeCacheDir);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean trimExternalCache() {
        try {
            File externalCacheDir = iy2.getAppContext().getExternalCacheDir();
            if (externalCacheDir == null || !externalCacheDir.isDirectory() || externalCacheDir.listFiles().length == 0) {
                return false;
            }
            return deleteDir(externalCacheDir);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
