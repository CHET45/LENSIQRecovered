package p000;

import android.net.ConnectivityManager;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.cn4;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class bn4 {

    /* JADX INFO: renamed from: c */
    public static final String f14176c = "DownloadStrategy";

    /* JADX INFO: renamed from: d */
    public static final long f14177d = 1048576;

    /* JADX INFO: renamed from: e */
    public static final long f14178e = 5242880;

    /* JADX INFO: renamed from: f */
    public static final long f14179f = 52428800;

    /* JADX INFO: renamed from: g */
    public static final long f14180g = 104857600;

    /* JADX INFO: renamed from: h */
    public static final Pattern f14181h = Pattern.compile(".*\\\\|/([^\\\\|/|?]*)\\??");

    /* JADX INFO: renamed from: a */
    public Boolean f14182a = null;

    /* JADX INFO: renamed from: b */
    public ConnectivityManager f14183b = null;

    /* JADX INFO: renamed from: bn4$b */
    public static class C1955b {

        /* JADX INFO: renamed from: a */
        @efb
        public zk4.InterfaceC16164a f14186a;

        /* JADX INFO: renamed from: b */
        @efb
        public bd1 f14187b;

        /* JADX INFO: renamed from: c */
        public int f14188c;

        public C1955b(@efb zk4.InterfaceC16164a interfaceC16164a, int i, @efb bd1 bd1Var) {
            this.f14186a = interfaceC16164a;
            this.f14187b = bd1Var;
            this.f14188c = i;
        }

        public void inspect() throws IOException {
            h61 block = this.f14187b.getBlock(this.f14188c);
            int responseCode = this.f14186a.getResponseCode();
            c8e preconditionFailedCause = e0c.with().downloadStrategy().getPreconditionFailedCause(responseCode, block.getCurrentOffset() != 0, this.f14187b, this.f14186a.getResponseHeaderField(q0i.f72720g));
            if (preconditionFailedCause != null) {
                throw new d8e(preconditionFailedCause);
            }
            if (e0c.with().downloadStrategy().isServerCanceled(responseCode, block.getCurrentOffset() != 0)) {
                throw new d3f(responseCode, block.getCurrentOffset());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String m3251a(@hib String str, @efb cn4 cn4Var) throws IOException {
        if (!q0i.isEmpty(str)) {
            return str;
        }
        String url = cn4Var.getUrl();
        Matcher matcher = f14181h.matcher(url);
        String strMd5 = null;
        while (matcher.find()) {
            strMd5 = matcher.group(1);
        }
        if (q0i.isEmpty(strMd5)) {
            strMd5 = q0i.md5(url);
        }
        if (strMd5 != null) {
            return strMd5;
        }
        throw new IOException("Can't find valid filename.");
    }

    public int determineBlockCount(@efb cn4 cn4Var, long j) {
        if (cn4Var.getSetConnectionCount() != null) {
            return cn4Var.getSetConnectionCount().intValue();
        }
        if (j < 1048576) {
            return 1;
        }
        if (j < 5242880) {
            return 2;
        }
        if (j < f14179f) {
            return 3;
        }
        return j < 104857600 ? 4 : 5;
    }

    @hib
    public c8e getPreconditionFailedCause(int i, boolean z, @efb bd1 bd1Var, @hib String str) {
        String etag = bd1Var.getEtag();
        if (i == 412) {
            return c8e.RESPONSE_PRECONDITION_FAILED;
        }
        if (!q0i.isEmpty(etag) && !q0i.isEmpty(str) && !str.equals(etag)) {
            return c8e.RESPONSE_ETAG_CHANGED;
        }
        if (i == 201 && z) {
            return c8e.RESPONSE_CREATED_RANGE_NOT_FROM_0;
        }
        if (i == 205 && z) {
            return c8e.RESPONSE_RESET_RANGE_NOT_FROM_0;
        }
        return null;
    }

    public boolean inspectAnotherSameInfo(@efb cn4 cn4Var, @efb bd1 bd1Var, long j) {
        gd1 gd1VarBreakpointStore;
        bd1 bd1VarFindAnotherInfoFromCompare;
        if (!cn4Var.isFilenameFromResponse() || (bd1VarFindAnotherInfoFromCompare = (gd1VarBreakpointStore = e0c.with().breakpointStore()).findAnotherInfoFromCompare(cn4Var, bd1Var)) == null) {
            return false;
        }
        gd1VarBreakpointStore.remove(bd1VarFindAnotherInfoFromCompare.getId());
        if (bd1VarFindAnotherInfoFromCompare.getTotalOffset() <= e0c.with().downloadStrategy().reuseIdledSameInfoThresholdBytes()) {
            return false;
        }
        if ((bd1VarFindAnotherInfoFromCompare.getEtag() != null && !bd1VarFindAnotherInfoFromCompare.getEtag().equals(bd1Var.getEtag())) || bd1VarFindAnotherInfoFromCompare.getTotalLength() != j || bd1VarFindAnotherInfoFromCompare.getFile() == null || !bd1VarFindAnotherInfoFromCompare.getFile().exists()) {
            return false;
        }
        bd1Var.reuseBlocks(bd1VarFindAnotherInfoFromCompare);
        q0i.m19913d(f14176c, "Reuse another same info: " + bd1Var);
        return true;
    }

    public void inspectFilenameFromResume(@efb String str, @efb cn4 cn4Var) {
        if (q0i.isEmpty(cn4Var.getFilename())) {
            cn4Var.getFilenameHolder().m3252a(str);
        }
    }

    public void inspectNetworkAvailable() throws UnknownHostException {
        if (this.f14182a == null) {
            this.f14182a = Boolean.valueOf(q0i.checkPermission(it3.f48185b));
        }
        if (this.f14182a.booleanValue()) {
            if (this.f14183b == null) {
                this.f14183b = (ConnectivityManager) e0c.with().context().getSystemService("connectivity");
            }
            if (!q0i.isNetworkAvailable(this.f14183b)) {
                throw new UnknownHostException("network is not available!");
            }
        }
    }

    public void inspectNetworkOnWifi(@efb cn4 cn4Var) throws IOException {
        if (this.f14182a == null) {
            this.f14182a = Boolean.valueOf(q0i.checkPermission(it3.f48185b));
        }
        if (cn4Var.isWifiRequired()) {
            if (!this.f14182a.booleanValue()) {
                throw new IOException("required for access network state but don't have the permission of Manifest.permission.ACCESS_NETWORK_STATE, please declare this permission first on your AndroidManifest, so we can handle the case of downloading required wifi state.");
            }
            if (this.f14183b == null) {
                this.f14183b = (ConnectivityManager) e0c.with().context().getSystemService("connectivity");
            }
            if (q0i.isNetworkNotOnWifiType(this.f14183b)) {
                throw new qbb();
            }
        }
    }

    public boolean isServerCanceled(int i, boolean z) {
        if (i == 206 || i == 200) {
            return i == 200 && z;
        }
        return true;
    }

    public boolean isUseMultiBlock(boolean z) {
        if (e0c.with().outputStreamFactory().supportSeek()) {
            return z;
        }
        return false;
    }

    public C1955b resumeAvailableResponseCheck(zk4.InterfaceC16164a interfaceC16164a, int i, bd1 bd1Var) {
        return new C1955b(interfaceC16164a, i, bd1Var);
    }

    public long reuseIdledSameInfoThresholdBytes() {
        return 10240L;
    }

    public void validFilenameFromResponse(@hib String str, @efb cn4 cn4Var, @efb bd1 bd1Var) throws IOException {
        if (q0i.isEmpty(cn4Var.getFilename())) {
            String strM3251a = m3251a(str, cn4Var);
            if (q0i.isEmpty(cn4Var.getFilename())) {
                synchronized (cn4Var) {
                    try {
                        if (q0i.isEmpty(cn4Var.getFilename())) {
                            cn4Var.getFilenameHolder().m3252a(strM3251a);
                            bd1Var.getFilenameHolder().m3252a(strM3251a);
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public boolean validFilenameFromStore(@efb cn4 cn4Var) {
        String responseFilename = e0c.with().breakpointStore().getResponseFilename(cn4Var.getUrl());
        if (responseFilename == null) {
            return false;
        }
        cn4Var.getFilenameHolder().m3252a(responseFilename);
        return true;
    }

    public void validInfoOnCompleted(@efb cn4 cn4Var, @efb an4 an4Var) {
        long length;
        bd1 afterCompleted = an4Var.getAfterCompleted(cn4Var.getId());
        if (afterCompleted == null) {
            afterCompleted = new bd1(cn4Var.getId(), cn4Var.getUrl(), cn4Var.getParentFile(), cn4Var.getFilename());
            if (q0i.isUriContentScheme(cn4Var.getUri())) {
                length = q0i.getSizeFromContentUri(cn4Var.getUri());
            } else {
                File file = cn4Var.getFile();
                if (file == null) {
                    q0i.m19916w(f14176c, "file is not ready on valid info for task on complete state " + cn4Var);
                    length = 0;
                } else {
                    length = file.length();
                }
            }
            long j = length;
            afterCompleted.addBlock(new h61(0L, j, j));
        }
        cn4.C2403c.setBreakpointInfo(cn4Var, afterCompleted);
    }

    /* JADX INFO: renamed from: bn4$a */
    public static class C1954a {

        /* JADX INFO: renamed from: a */
        public volatile String f14184a;

        /* JADX INFO: renamed from: b */
        public final boolean f14185b = false;

        public C1954a() {
        }

        /* JADX INFO: renamed from: a */
        public void m3252a(@efb String str) {
            this.f14184a = str;
        }

        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return true;
            }
            if (obj instanceof C1954a) {
                return this.f14184a == null ? ((C1954a) obj).f14184a == null : this.f14184a.equals(((C1954a) obj).f14184a);
            }
            return false;
        }

        @hib
        public String get() {
            return this.f14184a;
        }

        public int hashCode() {
            if (this.f14184a == null) {
                return 0;
            }
            return this.f14184a.hashCode();
        }

        public boolean isFilenameProvidedByConstruct() {
            return this.f14185b;
        }

        public C1954a(@efb String str) {
            this.f14184a = str;
        }
    }
}
