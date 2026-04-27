package p000;

import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class wi9 {

    /* JADX INFO: renamed from: a */
    public static final String f94320a = "LogUploader";

    /* JADX INFO: renamed from: b */
    public static final long f94321b = 33554432;

    /* JADX INFO: renamed from: d */
    public static final String f94323d = "Bearer tokenData-33fcfj4cdeaa4e3gd511b4a0a3d8";

    /* JADX INFO: renamed from: e */
    public static final String f94324e = "Basic d2F0Y2hmdW46bG9nZnVuQDIwMjUwNg==";

    /* JADX INFO: renamed from: i */
    public static final OkHttpClient f94328i;

    /* JADX INFO: renamed from: j */
    public static final Gson f94329j;

    /* JADX INFO: renamed from: k */
    public static EnumC14623e f94330k;

    /* JADX INFO: renamed from: l */
    public static C14622d f94331l;

    /* JADX INFO: renamed from: m */
    public static C14622d f94332m;

    /* JADX INFO: renamed from: c */
    public static final ExecutorService f94322c = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: f */
    public static final MediaType f94325f = MediaType.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: g */
    public static final MediaType f94326g = MediaType.parse("application/octet-stream");

    /* JADX INFO: renamed from: h */
    public static final MediaType f94327h = MediaType.parse("text/plain");

    /* JADX INFO: renamed from: wi9$a */
    public class C14619a implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f94333a;

        public C14619a(File file) {
            this.f94333a = file;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            Log.e(wi9.f94320a, "上传日志文件失败", iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            try {
                try {
                    String strString = response.body() != null ? response.body().string() : "";
                    StringBuilder sb = new StringBuilder();
                    sb.append("上传日志文件成功: ");
                    sb.append(strString);
                    JsonObject jsonObject = (JsonObject) wi9.f94329j.fromJson(strString, JsonObject.class);
                    if (jsonObject == null || !jsonObject.has("url")) {
                        Log.w(wi9.f94320a, "响应中未找到URL字段");
                    } else {
                        String asString = jsonObject.get("url").getAsString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("获取到文件URL: ");
                        sb2.append(asString);
                        wi9.uploadLogFileData(asString, this.f94333a);
                    }
                    response.close();
                } finally {
                }
            } catch (Exception e) {
                Log.e(wi9.f94320a, "解析响应JSON失败", e);
            }
        }
    }

    /* JADX INFO: renamed from: wi9$b */
    public class C14620b implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f94334a;

        public C14620b(File file) {
            this.f94334a = file;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            Log.e(wi9.f94320a, "上传URL到第二个接口失败", iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            try {
                try {
                    String strString = response.body() != null ? response.body().string() : "";
                    StringBuilder sb = new StringBuilder();
                    sb.append("上传URL到第二个接口成功: ");
                    sb.append(strString);
                    File file = this.f94334a;
                    if (file != null && file.exists()) {
                        boolean zDelete = this.f94334a.delete();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("日志文件删除结果: ");
                        sb2.append(zDelete);
                    }
                    response.close();
                } finally {
                }
            } catch (Exception e) {
                Log.e(wi9.f94320a, "处理第二个接口响应失败", e);
            }
        }
    }

    /* JADX INFO: renamed from: wi9$c */
    public class C14621c implements Callback {
        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            Log.e(wi9.f94320a, "上传埋点失败", iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            try {
                try {
                    String strString = response.body() != null ? response.body().string() : "";
                    StringBuilder sb = new StringBuilder();
                    sb.append("上传埋点成功: ");
                    sb.append(strString);
                    response.close();
                } finally {
                }
            } catch (Exception e) {
                Log.e(wi9.f94320a, "处理埋点响应失败", e);
            }
        }
    }

    /* JADX INFO: renamed from: wi9$d */
    public static class C14622d {

        /* JADX INFO: renamed from: a */
        public EnumC14623e f94335a;

        /* JADX INFO: renamed from: b */
        public String f94336b;

        /* JADX INFO: renamed from: c */
        public String f94337c;

        /* JADX INFO: renamed from: d */
        public String f94338d;

        /* JADX INFO: renamed from: e */
        public String f94339e;

        /* JADX INFO: renamed from: f */
        public String f94340f;

        /* JADX INFO: renamed from: g */
        public String f94341g;

        /* JADX INFO: renamed from: h */
        public String f94342h;

        /* JADX INFO: renamed from: i */
        public String f94343i;

        private C14622d() {
        }

        public /* synthetic */ C14622d(C14619a c14619a) {
            this();
        }
    }

    /* JADX INFO: renamed from: wi9$e */
    public enum EnumC14623e {
        LOG,
        EVENT
    }

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f94328i = builder.connectTimeout(10L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).retryOnConnectionFailure(true).build();
        f94329j = new Gson();
        f94330k = EnumC14623e.LOG;
    }

    public static String getValueEncoded(String str) {
        if (str == null) {
            return "null";
        }
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name()).replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            Log.e(f94320a, "编码参数失败", e);
            return str;
        }
    }

    public static void initEventConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(f94320a, "initEventConfig: baseFileUrl or uploadUrl is empty");
            return;
        }
        C14622d c14622d = new C14622d(null);
        f94332m = c14622d;
        c14622d.f94335a = EnumC14623e.EVENT;
        C14622d c14622d2 = f94332m;
        c14622d2.f94336b = str;
        c14622d2.f94337c = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = zi9.f105182a;
        }
        c14622d2.f94338d = str3;
        C14622d c14622d3 = f94332m;
        c14622d3.f94339e = str4;
        c14622d3.f94340f = str5;
        c14622d3.f94341g = str6;
        if (TextUtils.isEmpty(str7)) {
            str7 = "deviceName";
        }
        c14622d3.f94342h = str7;
        f94332m.f94343i = str8;
    }

    public static void initLogConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(f94320a, "initLogConfig: baseFileUrl or uploadUrl is empty");
            return;
        }
        C14622d c14622d = new C14622d(null);
        f94331l = c14622d;
        c14622d.f94335a = EnumC14623e.LOG;
        C14622d c14622d2 = f94331l;
        c14622d2.f94336b = str;
        c14622d2.f94337c = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = zi9.f105182a;
        }
        c14622d2.f94338d = str3;
        C14622d c14622d3 = f94331l;
        c14622d3.f94339e = str4;
        c14622d3.f94340f = str5;
        c14622d3.f94341g = str6;
        if (TextUtils.isEmpty(str7)) {
            str7 = "deviceName";
        }
        c14622d3.f94342h = str7;
        f94331l.f94343i = str8;
    }

    private static byte[] readFileBytesByChunk(File file) throws IOException {
        FileChannel fileChannelOpen = FileChannel.open(file.toPath(), StandardOpenOption.READ);
        try {
            long length = file.length();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) Math.min(length, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED));
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((int) length);
            while (fileChannelOpen.read(byteBufferAllocate) != -1) {
                byteBufferAllocate.flip();
                byteBufferAllocate2.put(byteBufferAllocate);
                byteBufferAllocate.clear();
            }
            byteBufferAllocate2.flip();
            byte[] bArr = new byte[byteBufferAllocate2.limit()];
            byteBufferAllocate2.get(bArr);
            fileChannelOpen.close();
            return bArr;
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static byte[] readFirstNBytes(File file, long j) throws IOException {
        FileChannel fileChannelOpen = FileChannel.open(file.toPath(), StandardOpenOption.READ);
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) Math.min(j, file.length()));
            int i = fileChannelOpen.read(byteBufferAllocate);
            byteBufferAllocate.flip();
            byte[] bArr = new byte[i > 0 ? i : 0];
            if (i > 0) {
                byteBufferAllocate.get(bArr);
            }
            fileChannelOpen.close();
            return bArr;
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void release() {
        ExecutorService executorService = f94322c;
        executorService.shutdown();
        try {
            if (executorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                return;
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            f94322c.shutdownNow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadEvent(String str) {
        try {
            if (f94332m == null) {
                Log.e(f94320a, "eventConfig is null");
                return;
            }
            String str2 = Build.VERSION.RELEASE;
            String valueEncoded = getValueEncoded(f94332m.f94338d);
            String valueEncoded2 = getValueEncoded(f94332m.f94342h);
            HashMap map = new HashMap();
            map.put(g55.f38799h, "content :" + str);
            f94328i.newCall(new Request.Builder().url(f94332m.f94337c).addHeader(go7.f40559n, f94324e).addHeader("appname", valueEncoded).addHeader("ostype", "android").addHeader("appversion", f94332m.f94343i).addHeader("os", str2).addHeader("phonebrand", Build.BRAND).addHeader("phonemodel", Build.MODEL).addHeader("uid", f94332m.f94339e).addHeader("mac", f94332m.f94341g).addHeader("devicename", valueEncoded2).addHeader("accept_language", f94332m.f94340f).post(RequestBody.create(f94329j.toJson(map), f94325f)).build()).enqueue(new C14621c());
        } catch (Exception e) {
            Log.e(f94320a, "构建埋点上传请求失败", e);
        }
    }

    public static void uploadEventAsync(final String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w(f94320a, "埋点内容为空，跳过上传");
        } else {
            f94322c.execute(new Runnable() { // from class: vi9
                @Override // java.lang.Runnable
                public final void run() {
                    wi9.uploadEvent(str);
                }
            });
        }
    }

    public static void uploadLogFileAsync(final File file) {
        StringBuilder sb = new StringBuilder();
        sb.append("准备异步上传日志文件: logConfig=");
        sb.append(f94331l != null);
        sb.append(", logFile=");
        sb.append(file);
        if (f94331l == null || file == null || !file.exists()) {
            Log.w(f94320a, "上传条件不满足：配置为空或文件不存在");
        } else {
            f94322c.execute(new Runnable() { // from class: ui9
                @Override // java.lang.Runnable
                public final void run() {
                    wi9.uploadLogFileDirect(file);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadLogFileData(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            Log.w(f94320a, "文件URL为空，跳过上传");
            return;
        }
        String str2 = Build.VERSION.RELEASE;
        String valueEncoded = getValueEncoded(f94331l.f94338d);
        String valueEncoded2 = getValueEncoded(f94331l.f94342h);
        HashMap map = new HashMap();
        map.put(g55.f38799h, "content :" + str);
        f94328i.newCall(new Request.Builder().url(f94331l.f94337c).addHeader(go7.f40559n, f94324e).addHeader("http_accept", "*/*").addHeader("ostype", "android").addHeader("appname", valueEncoded).addHeader("os", str2).addHeader("uid", f94331l.f94339e).addHeader("mac", f94331l.f94341g).addHeader("devicename", valueEncoded2).addHeader("phonebrand", Build.BRAND).addHeader("phonemodel", Build.MODEL).addHeader("appversion", f94331l.f94343i).addHeader("accept_language", f94331l.f94340f).post(RequestBody.create(f94329j.toJson(map), f94325f)).build()).enqueue(new C14620b(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadLogFileDirect(File file) {
        byte[] fileBytesByChunk;
        StringBuilder sb = new StringBuilder();
        sb.append("开始上传日志文件（带大小限制）: ");
        sb.append(file.getAbsolutePath());
        if (!file.canRead() || file.length() == 0) {
            Log.w(f94320a, "文件不可读或为空: " + file.getAbsolutePath());
            return;
        }
        try {
            if (file.length() > f94321b) {
                Log.w(f94320a, "文件超过32M限制，截取前32M上传：原大小=" + ((file.length() / 1024) / 1024) + "M");
                fileBytesByChunk = readFirstNBytes(file, f94321b);
            } else {
                fileBytesByChunk = readFileBytesByChunk(file);
            }
            try {
                f94328i.newCall(new Request.Builder().url(f94331l.f94336b).addHeader(go7.f40559n, f94323d).addHeader("http_accept", "*/*").addHeader("ostype", "android").addHeader("appname", getValueEncoded(f94331l.f94338d)).addHeader("os", Build.VERSION.RELEASE).addHeader("uid", f94331l.f94339e).addHeader("mac", f94331l.f94341g).addHeader("devicename", getValueEncoded(f94331l.f94342h)).addHeader("phonebrand", Build.BRAND).addHeader("phonemodel", Build.MODEL).addHeader("appversion", f94331l.f94343i).addHeader("accept_language", f94331l.f94340f).post(new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("logFile", file.getName(), RequestBody.create(fileBytesByChunk, f94326g)).build()).build()).enqueue(new C14619a(file));
            } catch (Exception e) {
                Log.e(f94320a, "构建上传请求失败", e);
            }
        } catch (IOException e2) {
            Log.e(f94320a, "读取文件内容失败", e2);
        }
    }
}
