package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes6.dex */
public class abb implements Interceptor {

    /* JADX INFO: renamed from: e */
    public static final String f954e = "NetInterceptor";

    /* JADX INFO: renamed from: f */
    public static final int f955f = 5;

    /* JADX INFO: renamed from: g */
    public static final ExecutorService f956g = Executors.newFixedThreadPool(5);

    /* JADX INFO: renamed from: h */
    public static final int f957h = 1;

    /* JADX INFO: renamed from: i */
    public static final long f958i = 1000;

    /* JADX INFO: renamed from: a */
    public final boolean f959a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f960b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final boolean f961c;

    /* JADX INFO: renamed from: d */
    public final Context f962d;

    public abb(Context context, boolean z, boolean z2) {
        this.f962d = context;
        this.f959a = z;
        this.f961c = z2;
    }

    private void LogForRequest(Request request) {
        MediaType mediaTypeContentType;
        StringBuilder sb = new StringBuilder();
        try {
            String string = request.url().toString();
            sb.append("\n========Request(Start)=======\n");
            sb.append("Request->Method: ");
            sb.append(request.method());
            sb.append("\n");
            sb.append("Request->URL:");
            sb.append(string);
            sb.append("\n");
            Headers headers = request.headers();
            if (headers.size() > 0) {
                sb.append("Request->headers:\n");
                sb.append(headers);
            }
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody != null && (mediaTypeContentType = requestBodyBody.contentType()) != null) {
                if (isText(mediaTypeContentType)) {
                    sb.append("Request->parameter:");
                    sb.append(bodyToString(requestBodyBody, mediaTypeContentType));
                    sb.append("\n");
                } else {
                    sb.append("Request->parameter: RequestBody's content : maybe [file part] , too large too print , ignored! \n\n");
                }
            }
            sb.append("========Request(End)=======");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Response LogForResponse(Response response) {
        MediaType mediaTypeContentType;
        try {
            printResponseLog("========Response(Start)=======");
            Response responseBuild = response.newBuilder().build();
            printResponseLog("url : " + responseBuild.request().url());
            printResponseLog("code : " + responseBuild.code());
            printResponseLog("protocol : " + responseBuild.protocol());
            if (!TextUtils.isEmpty(responseBuild.message())) {
                printResponseLog("message : " + responseBuild.message());
            }
            ResponseBody responseBodyBody = responseBuild.body();
            if (responseBodyBody != null && (mediaTypeContentType = responseBodyBody.contentType()) != null) {
                printResponseLog("responseBody's contentType : " + mediaTypeContentType);
                if (isText(mediaTypeContentType)) {
                    String strString = responseBodyBody.string();
                    printResponseLog("responseBody's content: " + strString);
                    ResponseBody responseBodyCreate = ResponseBody.create(strString, mediaTypeContentType);
                    printResponseLog("========Response(End)=======");
                    return response.newBuilder().body(responseBodyCreate).build();
                }
                printResponseLog("responseBody's content :  maybe [file part] , too large too print , ignored!");
            }
            printResponseLog("========Response(End)=======");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    private String bodyToString(RequestBody requestBody, MediaType mediaType) {
        try {
            Buffer buffer = new Buffer();
            requestBody.writeTo(buffer);
            Charset charset = mediaType.charset(StandardCharsets.UTF_8);
            return charset != null ? buffer.readString(charset) : "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf A[EDGE_INSN: B:39:0x00cf->B:31:0x00cf BREAK  A[LOOP:0: B:3:0x0006->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private okhttp3.Response executeRequest(okhttp3.Interceptor.Chain r9, okhttp3.Request r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.abb.executeRequest(okhttp3.Interceptor$Chain, okhttp3.Request):okhttp3.Response");
    }

    private boolean isText(MediaType mediaType) {
        return mediaType.type().equals("text") || mediaType.subtype().equals("json") || mediaType.subtype().equals("xml") || mediaType.subtype().equals("html") || mediaType.subtype().equals("webviewhtml");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Response lambda$intercept$0(Interceptor.Chain chain, Request request) throws Exception {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing request on thread: ");
            sb.append(Thread.currentThread().getName());
            Response responseExecuteRequest = executeRequest(chain, request);
            if (responseExecuteRequest != null) {
                return responseExecuteRequest;
            }
            throw new IOException("executeRequest() returned null");
        } catch (Exception e) {
            Log.e(f954e, "Async task failed for URL: " + request.url(), e);
            throw e;
        }
    }

    private void printResponseLog(String str) {
        if (this.f961c) {
            Log.i(f954e, str);
        }
    }

    private Response processResponse(Response response) throws IOException {
        if (response == null) {
            throw new IOException("Response is null");
        }
        try {
            Response responseBuild = response.newBuilder().build();
            ResponseBody responseBodyBody = responseBuild.body();
            if (responseBodyBody == null) {
                Log.w(f954e, "Response body is null");
                return responseBuild;
            }
            return LogForResponse(responseBuild.newBuilder().body(ResponseBody.create(responseBodyBody.string(), responseBodyBody.contentType())).build());
        } catch (IOException e) {
            throw new IOException("Failed to process response body", e);
        }
    }

    private Request updateRequest(String str, Request.Builder builder, String str2) {
        RequestBody requestBodyBody = builder.build().body();
        return requestBodyBody != null ? builder.get().url(str).addHeader(go7.f40586w, str2).post(requestBodyBody).build() : builder.get().url(str).addHeader(go7.f40586w, str2).build();
    }

    @Override // okhttp3.Interceptor
    @efb
    public Response intercept(final Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String string = request.url().toString();
        Request.Builder builderNewBuilder = request.newBuilder();
        mi7.buildWebsocketHeader(builderNewBuilder);
        final Request requestUpdateRequest = updateRequest(string, builderNewBuilder, request.url().host());
        LogForRequest(requestUpdateRequest);
        ExecutorService executor = e30.getExecutor();
        if (executor.isShutdown() || executor.isTerminated()) {
            throw new IOException("Thread pool is unavailable");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Submitting request to thread pool. Active tasks: ");
        sb.append(((ThreadPoolExecutor) executor).getActiveCount());
        try {
            return processResponse((Response) executor.submit(new Callable() { // from class: zab
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f104634a.lambda$intercept$0(chain, requestUpdateRequest);
                }
            }).get());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Request interrupted", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException("Request failed", cause);
        }
    }
}
