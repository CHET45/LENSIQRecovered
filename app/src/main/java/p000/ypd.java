package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ypd extends vq0 {

    /* JADX INFO: renamed from: m */
    public static final String f102616m = "rawresource";

    /* JADX INFO: renamed from: f */
    public final Resources f102617f;

    /* JADX INFO: renamed from: g */
    public final String f102618g;

    /* JADX INFO: renamed from: h */
    @hib
    public Uri f102619h;

    /* JADX INFO: renamed from: i */
    @hib
    public AssetFileDescriptor f102620i;

    /* JADX INFO: renamed from: j */
    @hib
    public InputStream f102621j;

    /* JADX INFO: renamed from: k */
    public long f102622k;

    /* JADX INFO: renamed from: l */
    public boolean f102623l;

    /* JADX INFO: renamed from: ypd$a */
    public static class C15759a extends rh3 {
        @Deprecated
        public C15759a(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public C15759a(Throwable th) {
            super(th, 2000);
        }

        public C15759a(@hib String str, @hib Throwable th, int i) {
            super(str, th, i);
        }
    }

    public ypd(Context context) {
        super(false);
        this.f102617f = context.getResources();
        this.f102618g = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws C15759a {
        this.f102619h = null;
        try {
            try {
                InputStream inputStream = this.f102621j;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f102621j = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f102620i;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C15759a(null, e, 2000);
                    }
                } finally {
                    this.f102620i = null;
                    if (this.f102623l) {
                        this.f102623l = false;
                        m24113c();
                    }
                }
            } catch (Throwable th) {
                this.f102621j = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f102620i;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f102620i = null;
                        if (this.f102623l) {
                            this.f102623l = false;
                            m24113c();
                        }
                        throw th;
                    } finally {
                        this.f102620i = null;
                        if (this.f102623l) {
                            this.f102623l = false;
                            m24113c();
                        }
                    }
                } catch (IOException e2) {
                    throw new C15759a(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C15759a(null, e3, 2000);
        }
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f102619h;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws C15759a {
        int identifier;
        String str;
        Uri uriNormalizeScheme = yh3Var.f101485a.normalizeScheme();
        this.f102619h = uriNormalizeScheme;
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme()) || (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) u80.checkNotNull(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) u80.checkNotNull(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C15759a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C15759a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
            String strSubstring = (String) u80.checkNotNull(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith(pj4.f71071b)) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + g1i.f38277c;
            }
            sb.append(str);
            sb.append(strSubstring);
            identifier = this.f102617f.getIdentifier(sb.toString(), "raw", this.f102618g);
            if (identifier == 0) {
                throw new C15759a("Resource not found.", null, 2005);
            }
        }
        m24114d(yh3Var);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f102617f.openRawResourceFd(identifier);
            this.f102620i = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C15759a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f102621j = fileInputStream;
            if (length != -1) {
                try {
                    if (yh3Var.f101491g > length) {
                        throw new C15759a(null, null, 2008);
                    }
                } catch (C15759a e) {
                    throw e;
                } catch (IOException e2) {
                    throw new C15759a(null, e2, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(yh3Var.f101491g + startOffset) - startOffset;
            if (jSkip != yh3Var.f101491g) {
                throw new C15759a(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f102622k = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f102622k = size;
                    if (size < 0) {
                        throw new C15759a(null, null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.f102622k = j;
                if (j < 0) {
                    throw new rh3(2008);
                }
            }
            long jMin = yh3Var.f101492h;
            if (jMin != -1) {
                long j2 = this.f102622k;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.f102622k = jMin;
            }
            this.f102623l = true;
            m24115e(yh3Var);
            long j3 = yh3Var.f101492h;
            return j3 != -1 ? j3 : this.f102622k;
        } catch (Resources.NotFoundException e3) {
            throw new C15759a(null, e3, 2005);
        }
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws C15759a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f102622k;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C15759a(null, e, 2000);
            }
        }
        int i3 = ((InputStream) x0i.castNonNull(this.f102621j)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f102622k == -1) {
                return -1;
            }
            throw new C15759a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f102622k;
        if (j2 != -1) {
            this.f102622k = j2 - ((long) i3);
        }
        m24112b(i3);
        return i3;
    }
}
