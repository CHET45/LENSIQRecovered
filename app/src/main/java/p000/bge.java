package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import p000.uae;
import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
public final class bge implements xfg, e44 {

    /* JADX INFO: renamed from: C */
    public boolean f13696C;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f13697a;

    /* JADX INFO: renamed from: b */
    @gib
    public final String f13698b;

    /* JADX INFO: renamed from: c */
    @gib
    public final File f13699c;

    /* JADX INFO: renamed from: d */
    @gib
    public final Callable<InputStream> f13700d;

    /* JADX INFO: renamed from: e */
    public final int f13701e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final xfg f13702f;

    /* JADX INFO: renamed from: m */
    public ni3 f13703m;

    /* JADX INFO: renamed from: bge$a */
    public static final class C1885a extends xfg.AbstractC15046a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f13704d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1885a(int i, int i2) {
            super(i2);
            this.f13704d = i;
        }

        @Override // p000.xfg.AbstractC15046a
        public void onCreate(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
        }

        @Override // p000.xfg.AbstractC15046a
        public void onOpen(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
            int i = this.f13704d;
            if (i < 1) {
                wfgVar.setVersion(i);
            }
        }

        @Override // p000.xfg.AbstractC15046a
        public void onUpgrade(@yfb wfg wfgVar, int i, int i2) {
            md8.checkNotNullParameter(wfgVar, "db");
        }
    }

    public bge(@yfb Context context, @gib String str, @gib File file, @gib Callable<InputStream> callable, int i, @yfb xfg xfgVar) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(xfgVar, "delegate");
        this.f13697a = context;
        this.f13698b = str;
        this.f13699c = file;
        this.f13700d = callable;
        this.f13701e = i;
        this.f13702f = xfgVar;
    }

    private final void copyDatabaseFile(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f13698b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f13697a.getAssets().open(this.f13698b));
            md8.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f13699c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f13699c).getChannel();
            md8.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f13700d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                md8.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f13697a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        md8.checkNotNullExpressionValue(channel, "output");
        wt5.copy(readableByteChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        md8.checkNotNullExpressionValue(fileCreateTempFile, "intermediateFile");
        dispatchOnOpenPrepackagedDatabase(fileCreateTempFile, z);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final xfg createFrameworkOpenHelper(File file) {
        try {
            int version = pe3.readVersion(file);
            return new uw6().create(xfg.C15047b.f97667f.builder(this.f13697a).name(file.getAbsolutePath()).callback(new C1885a(version, kpd.coerceAtLeast(version, 1))).build());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z) {
        ni3 ni3Var = this.f13703m;
        if (ni3Var == null) {
            md8.throwUninitializedPropertyAccessException("databaseConfiguration");
            ni3Var = null;
        }
        if (ni3Var.f64652q == null) {
            return;
        }
        xfg xfgVarCreateFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            wfg writableDatabase = z ? xfgVarCreateFrameworkOpenHelper.getWritableDatabase() : xfgVarCreateFrameworkOpenHelper.getReadableDatabase();
            ni3 ni3Var2 = this.f13703m;
            if (ni3Var2 == null) {
                md8.throwUninitializedPropertyAccessException("databaseConfiguration");
                ni3Var2 = null;
            }
            uae.AbstractC13437f abstractC13437f = ni3Var2.f64652q;
            md8.checkNotNull(abstractC13437f);
            abstractC13437f.onOpenPrepackagedDatabase(writableDatabase);
            bth bthVar = bth.f14751a;
            u52.closeFinally(xfgVarCreateFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.f13697a.getDatabasePath(databaseName);
        ni3 ni3Var = this.f13703m;
        ni3 ni3Var2 = null;
        if (ni3Var == null) {
            md8.throwUninitializedPropertyAccessException("databaseConfiguration");
            ni3Var = null;
        }
        fdd fddVar = new fdd(databaseName, this.f13697a.getFilesDir(), ni3Var.f64655t);
        try {
            fdd.lock$default(fddVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    md8.checkNotNullExpressionValue(databasePath, "databaseFile");
                    copyDatabaseFile(databasePath, z);
                    fddVar.unlock();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                md8.checkNotNullExpressionValue(databasePath, "databaseFile");
                int version = pe3.readVersion(databasePath);
                if (version == this.f13701e) {
                    fddVar.unlock();
                    return;
                }
                ni3 ni3Var3 = this.f13703m;
                if (ni3Var3 == null) {
                    md8.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    ni3Var2 = ni3Var3;
                }
                if (ni3Var2.isMigrationRequired(version, this.f13701e)) {
                    fddVar.unlock();
                    return;
                }
                if (this.f13697a.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databasePath, z);
                    } catch (IOException e2) {
                        Log.w(tae.f84090b, "Unable to copy database file.", e2);
                    }
                } else {
                    Log.w(tae.f84090b, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                fddVar.unlock();
                return;
            } catch (IOException e3) {
                Log.w(tae.f84090b, "Unable to read database version.", e3);
                fddVar.unlock();
                return;
            }
        } catch (Throwable th) {
            fddVar.unlock();
            throw th;
        }
        fddVar.unlock();
        throw th;
    }

    @Override // p000.xfg, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f13696C = false;
    }

    @Override // p000.xfg
    @gib
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // p000.e44
    @yfb
    public xfg getDelegate() {
        return this.f13702f;
    }

    @Override // p000.xfg
    @yfb
    public wfg getReadableDatabase() {
        if (!this.f13696C) {
            verifyDatabaseFile(false);
            this.f13696C = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // p000.xfg
    @yfb
    public wfg getWritableDatabase() {
        if (!this.f13696C) {
            verifyDatabaseFile(true);
            this.f13696C = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(@yfb ni3 ni3Var) {
        md8.checkNotNullParameter(ni3Var, "databaseConfiguration");
        this.f13703m = ni3Var;
    }

    @Override // p000.xfg
    @c5e(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
