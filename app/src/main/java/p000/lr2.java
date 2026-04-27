package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class lr2 {

    /* JADX INFO: renamed from: h */
    public static final String f58498h = "ConnectTrial";

    /* JADX INFO: renamed from: i */
    public static final Pattern f58499i = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* JADX INFO: renamed from: j */
    public static final Pattern f58500j = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");

    /* JADX INFO: renamed from: a */
    @efb
    public final cn4 f58501a;

    /* JADX INFO: renamed from: b */
    @efb
    public final bd1 f58502b;

    /* JADX INFO: renamed from: c */
    public boolean f58503c;

    /* JADX INFO: renamed from: d */
    @h78(from = -1)
    public long f58504d;

    /* JADX INFO: renamed from: e */
    @hib
    public String f58505e;

    /* JADX INFO: renamed from: f */
    @hib
    public String f58506f;

    /* JADX INFO: renamed from: g */
    public int f58507g;

    public lr2(@efb cn4 cn4Var, @efb bd1 bd1Var) {
        this.f58501a = cn4Var;
        this.f58502b = bd1Var;
    }

    @hib
    private static String findEtag(zk4.InterfaceC16164a interfaceC16164a) {
        return interfaceC16164a.getResponseHeaderField(q0i.f72720g);
    }

    @hib
    private static String findFilename(zk4.InterfaceC16164a interfaceC16164a) throws IOException {
        return parseContentDisposition(interfaceC16164a.getResponseHeaderField("Content-Disposition"));
    }

    private static long findInstanceLength(zk4.InterfaceC16164a interfaceC16164a) {
        long contentRangeFoInstanceLength = parseContentRangeFoInstanceLength(interfaceC16164a.getResponseHeaderField("Content-Range"));
        if (contentRangeFoInstanceLength != -1) {
            return contentRangeFoInstanceLength;
        }
        if (!parseTransferEncoding(interfaceC16164a.getResponseHeaderField("Transfer-Encoding"))) {
            q0i.m19916w(f58498h, "Transfer-Encoding isn't chunked but there is no valid instance length found either!");
        }
        return -1L;
    }

    @hib
    private static String parseContentDisposition(String str) throws IOException {
        String strGroup;
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = f58499i.matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = f58500j.matcher(str);
                strGroup = matcher2.find() ? matcher2.group(1) : null;
            }
            if (strGroup != null && strGroup.contains("../")) {
                throw new tm4("The filename [" + strGroup + "] from the response is not allowable, because it contains '../', which can raise the directory traversal vulnerability");
            }
            return strGroup;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    private static long parseContentRangeFoInstanceLength(@hib String str) {
        if (str == null) {
            return -1L;
        }
        String[] strArrSplit = str.split(pj4.f71071b);
        if (strArrSplit.length >= 2) {
            try {
                return Long.parseLong(strArrSplit[1]);
            } catch (NumberFormatException unused) {
                q0i.m19916w(f58498h, "parse instance length failed with " + str);
            }
        }
        return -1L;
    }

    private static boolean parseTransferEncoding(@hib String str) {
        return str != null && str.equals(q0i.f72724k);
    }

    /* JADX INFO: renamed from: a */
    public boolean m16318a(long j, @efb zk4.InterfaceC16164a interfaceC16164a) {
        String responseHeaderField;
        if (j != -1) {
            return false;
        }
        String responseHeaderField2 = interfaceC16164a.getResponseHeaderField("Content-Range");
        return (responseHeaderField2 == null || responseHeaderField2.length() <= 0) && !parseTransferEncoding(interfaceC16164a.getResponseHeaderField("Transfer-Encoding")) && (responseHeaderField = interfaceC16164a.getResponseHeaderField("Content-Length")) != null && responseHeaderField.length() > 0;
    }

    /* JADX INFO: renamed from: b */
    public void m16319b() throws IOException {
        zk4 zk4VarCreate = e0c.with().connectionFactory().create(this.f58501a.getUrl());
        cm4 cm4VarDispatch = e0c.with().callbackDispatcher().dispatch();
        try {
            zk4VarCreate.setRequestMethod("HEAD");
            Map<String, List<String>> headerMapFields = this.f58501a.getHeaderMapFields();
            if (headerMapFields != null) {
                q0i.addUserRequestHeaderField(headerMapFields, zk4VarCreate);
            }
            cm4VarDispatch.connectTrialStart(this.f58501a, zk4VarCreate.getRequestProperties());
            zk4.InterfaceC16164a interfaceC16164aExecute = zk4VarCreate.execute();
            cm4VarDispatch.connectTrialEnd(this.f58501a, interfaceC16164aExecute.getResponseCode(), interfaceC16164aExecute.getResponseHeaderFields());
            this.f58504d = q0i.parseContentLength(interfaceC16164aExecute.getResponseHeaderField("Content-Length"));
            zk4VarCreate.release();
        } catch (Throwable th) {
            zk4VarCreate.release();
            throw th;
        }
    }

    public void executeTrial() throws IOException {
        e0c.with().downloadStrategy().inspectNetworkOnWifi(this.f58501a);
        e0c.with().downloadStrategy().inspectNetworkAvailable();
        zk4 zk4VarCreate = e0c.with().connectionFactory().create(this.f58501a.getUrl());
        try {
            if (!q0i.isEmpty(this.f58502b.getEtag())) {
                zk4VarCreate.addHeader("If-Match", this.f58502b.getEtag());
            }
            zk4VarCreate.addHeader("Range", "bytes=0-0");
            Map<String, List<String>> headerMapFields = this.f58501a.getHeaderMapFields();
            if (headerMapFields != null) {
                q0i.addUserRequestHeaderField(headerMapFields, zk4VarCreate);
            }
            cm4 cm4VarDispatch = e0c.with().callbackDispatcher().dispatch();
            cm4VarDispatch.connectTrialStart(this.f58501a, zk4VarCreate.getRequestProperties());
            zk4.InterfaceC16164a interfaceC16164aExecute = zk4VarCreate.execute();
            this.f58501a.setRedirectLocation(interfaceC16164aExecute.getRedirectLocation());
            q0i.m19913d(f58498h, "task[" + this.f58501a.getId() + "] redirect location: " + this.f58501a.getRedirectLocation());
            this.f58507g = interfaceC16164aExecute.getResponseCode();
            this.f58503c = isAcceptRange(interfaceC16164aExecute);
            this.f58504d = findInstanceLength(interfaceC16164aExecute);
            this.f58505e = findEtag(interfaceC16164aExecute);
            this.f58506f = findFilename(interfaceC16164aExecute);
            Map<String, List<String>> responseHeaderFields = interfaceC16164aExecute.getResponseHeaderFields();
            if (responseHeaderFields == null) {
                responseHeaderFields = new HashMap<>();
            }
            cm4VarDispatch.connectTrialEnd(this.f58501a, this.f58507g, responseHeaderFields);
            boolean zM16318a = m16318a(this.f58504d, interfaceC16164aExecute);
            zk4VarCreate.release();
            if (zM16318a) {
                m16319b();
            }
        } catch (Throwable th) {
            zk4VarCreate.release();
            throw th;
        }
    }

    public long getInstanceLength() {
        return this.f58504d;
    }

    public int getResponseCode() {
        return this.f58507g;
    }

    @hib
    public String getResponseEtag() {
        return this.f58505e;
    }

    @hib
    public String getResponseFilename() {
        return this.f58506f;
    }

    public boolean isAcceptRange() {
        return this.f58503c;
    }

    public boolean isChunked() {
        return this.f58504d == -1;
    }

    public boolean isEtagOverdue() {
        return (this.f58502b.getEtag() == null || this.f58502b.getEtag().equals(this.f58505e)) ? false : true;
    }

    private static boolean isAcceptRange(@efb zk4.InterfaceC16164a interfaceC16164a) throws IOException {
        if (interfaceC16164a.getResponseCode() == 206) {
            return true;
        }
        return "bytes".equals(interfaceC16164a.getResponseHeaderField("Accept-Ranges"));
    }
}
