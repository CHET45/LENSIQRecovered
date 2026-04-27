package p000;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class pq0 {
    private static String generateCacheString(String str) {
        if (str == null) {
            return null;
        }
        return System.currentTimeMillis() + "#" + str;
    }

    public static String getCacheData(String str) throws Throwable {
        try {
            String fileContent = getFileContent(str);
            return !TextUtils.isEmpty(fileContent) ? fileContent.substring(fileContent.indexOf(35) + 1) : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String[] getCacheDataTime(String str) throws Throwable {
        String[] strArr = new String[2];
        try {
            String fileContent = getFileContent(str);
            if (!TextUtils.isEmpty(fileContent)) {
                int iIndexOf = fileContent.indexOf(35);
                String strSubstring = fileContent.substring(0, iIndexOf);
                String strSubstring2 = fileContent.substring(iIndexOf + 1);
                strArr[0] = strSubstring;
                strArr[1] = strSubstring2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strArr;
    }

    private static File getCacheFile(String str) {
        return new File(o8e.getAppContext().getCacheDir(), String.valueOf(str.hashCode()));
    }

    private static String getFileContent(String str) throws Throwable {
        BufferedReader bufferedReader;
        IOException e;
        StringBuilder sb;
        File cacheFile = getCacheFile(str);
        setLastModified(cacheFile, System.currentTimeMillis());
        StringBuilder sb2 = null;
        BufferedReader bufferedReader2 = null;
        if (cacheFile.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(cacheFile));
                try {
                    try {
                        sb = new StringBuilder();
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    sb.append(line);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        e = e4;
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    sb = null;
                }
            } catch (IOException e7) {
                bufferedReader = null;
                e = e7;
                sb = null;
            } catch (Throwable th2) {
                th = th2;
            }
            sb2 = sb;
        }
        return sb2 == null ? "" : sb2.toString();
    }

    public static void putToCache(String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        File cacheFile = getCacheFile(str);
        if (cacheFile.exists()) {
            cacheFile.delete();
        }
        String strGenerateCacheString = generateCacheString(str2);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(cacheFile));
                    try {
                        bufferedWriter2.write(strGenerateCacheString);
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                    } catch (IOException e) {
                        e = e;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        if (bufferedWriter != null) {
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.flush();
                                bufferedWriter.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean setLastModified(File file, long j) {
        return file.setLastModified(j);
    }
}
