package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xpd extends wq0 {

    /* JADX INFO: renamed from: l */
    @Deprecated
    public static final String f98873l = "rawresource";

    /* JADX INFO: renamed from: f */
    public final Context f98874f;

    /* JADX INFO: renamed from: g */
    @hib
    public xh3 f98875g;

    /* JADX INFO: renamed from: h */
    @hib
    public AssetFileDescriptor f98876h;

    /* JADX INFO: renamed from: i */
    @hib
    public InputStream f98877i;

    /* JADX INFO: renamed from: j */
    public long f98878j;

    /* JADX INFO: renamed from: k */
    public boolean f98879k;

    /* JADX INFO: renamed from: xpd$a */
    public static class C15244a extends sh3 {
        @Deprecated
        public C15244a(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public C15244a(Throwable th) {
            super(th, 2000);
        }

        public C15244a(@hib String str, @hib Throwable th, int i) {
            super(str, th, i);
        }
    }

    public xpd(Context context) {
        super(false);
        this.f98874f = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    private static AssetFileDescriptor openAssetFileDescriptor(Context context, xh3 xh3Var) throws C15244a {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = xh3Var.f97800a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C15244a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = parseResourceId(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C15244a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) v80.checkNotNull(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith(pj4.f71071b)) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C15244a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = parseResourceId(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + g1i.f38277c + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new C15244a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new C15244a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new C15244a(null, e2, 2005);
        }
    }

    private static int parseResourceId(String str) throws C15244a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new C15244a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // p000.gh3
    public void close() throws C15244a {
        this.f98875g = null;
        try {
            try {
                InputStream inputStream = this.f98877i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f98877i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f98876h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C15244a(null, e, 2000);
                    }
                } finally {
                    this.f98876h = null;
                    if (this.f98879k) {
                        this.f98879k = false;
                        m24715c();
                    }
                }
            } catch (Throwable th) {
                this.f98877i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f98876h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f98876h = null;
                        if (this.f98879k) {
                            this.f98879k = false;
                            m24715c();
                        }
                        throw th;
                    } finally {
                        this.f98876h = null;
                        if (this.f98879k) {
                            this.f98879k = false;
                            m24715c();
                        }
                    }
                } catch (IOException e2) {
                    throw new C15244a(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C15244a(null, e3, 2000);
        }
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        xh3 xh3Var = this.f98875g;
        if (xh3Var != null) {
            return xh3Var.f97800a;
        }
        return null;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws C15244a {
        this.f98875g = xh3Var;
        m24716d(xh3Var);
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = openAssetFileDescriptor(this.f98874f, xh3Var);
        this.f98876h = assetFileDescriptorOpenAssetFileDescriptor;
        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f98876h.getFileDescriptor());
        this.f98877i = fileInputStream;
        if (length != -1) {
            try {
                if (xh3Var.f97806g > length) {
                    throw new C15244a(null, null, 2008);
                }
            } catch (C15244a e) {
                throw e;
            } catch (IOException e2) {
                throw new C15244a(null, e2, 2000);
            }
        }
        long startOffset = this.f98876h.getStartOffset();
        long jSkip = fileInputStream.skip(xh3Var.f97806g + startOffset) - startOffset;
        if (jSkip != xh3Var.f97806g) {
            throw new C15244a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f98878j = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f98878j = size;
                if (size < 0) {
                    throw new C15244a(null, null, 2008);
                }
            }
        } else {
            long j = length - jSkip;
            this.f98878j = j;
            if (j < 0) {
                throw new sh3(2008);
            }
        }
        long jMin = xh3Var.f97807h;
        if (jMin != -1) {
            long j2 = this.f98878j;
            if (j2 != -1) {
                jMin = Math.min(j2, jMin);
            }
            this.f98878j = jMin;
        }
        this.f98879k = true;
        m24717e(xh3Var);
        long j3 = xh3Var.f97807h;
        return j3 != -1 ? j3 : this.f98878j;
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws C15244a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f98878j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C15244a(null, e, 2000);
            }
        }
        int i3 = ((InputStream) t0i.castNonNull(this.f98877i)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f98878j == -1) {
                return -1;
            }
            throw new C15244a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f98878j;
        if (j2 != -1) {
            this.f98878j = j2 - ((long) i3);
        }
        m24714b(i3);
        return i3;
    }
}
