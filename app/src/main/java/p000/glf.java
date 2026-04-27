package p000;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
public class glf extends zh4 {

    /* JADX INFO: renamed from: c */
    public Context f40151c;

    /* JADX INFO: renamed from: d */
    public Uri f40152d;

    public glf(@hib zh4 zh4Var, Context context, Uri uri) {
        super(zh4Var);
        this.f40151c = context;
        this.f40152d = uri;
    }

    @Override // p000.zh4
    public boolean canRead() {
        return jj4.canRead(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public boolean canWrite() {
        return jj4.canWrite(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public zh4 createDirectory(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.zh4
    public zh4 createFile(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.zh4
    public boolean delete() {
        try {
            return DocumentsContract.deleteDocument(this.f40151c.getContentResolver(), this.f40152d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p000.zh4
    public boolean exists() {
        return jj4.exists(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    @hib
    public String getName() {
        return jj4.getName(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    @hib
    public String getType() {
        return jj4.getType(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public Uri getUri() {
        return this.f40152d;
    }

    @Override // p000.zh4
    public boolean isDirectory() {
        return jj4.isDirectory(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public boolean isFile() {
        return jj4.isFile(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public boolean isVirtual() {
        return jj4.isVirtual(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public long lastModified() {
        return jj4.lastModified(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public long length() {
        return jj4.length(this.f40151c, this.f40152d);
    }

    @Override // p000.zh4
    public zh4[] listFiles() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.zh4
    public boolean renameTo(String str) {
        throw new UnsupportedOperationException();
    }
}
