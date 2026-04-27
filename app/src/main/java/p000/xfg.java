package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p000.vfg;

/* JADX INFO: loaded from: classes3.dex */
public interface xfg extends Closeable {

    /* JADX INFO: renamed from: xfg$a */
    public static abstract class AbstractC15046a {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f97664b = new a(null);

        /* JADX INFO: renamed from: c */
        @yfb
        public static final String f97665c = "SupportSQLite";

        /* JADX INFO: renamed from: a */
        @un8
        public final int f97666a;

        /* JADX INFO: renamed from: xfg$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private a() {
            }
        }

        public AbstractC15046a(int i) {
            this.f97666a = i;
        }

        private final void deleteDatabaseFile(String str) {
            if (h9g.equals(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = md8.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                vfg.C14039a.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public void onConfigure(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
        }

        public void onCorruption(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + wfgVar + ".path");
            if (!wfgVar.isOpen()) {
                String path = wfgVar.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = wfgVar.getAttachedDbs();
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            md8.checkNotNullExpressionValue(obj, "p.second");
                            deleteDatabaseFile((String) obj);
                        }
                    } else {
                        String path2 = wfgVar.getPath();
                        if (path2 != null) {
                            deleteDatabaseFile(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                wfgVar.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        }

        public abstract void onCreate(@yfb wfg wfgVar);

        public void onDowngrade(@yfb wfg wfgVar, int i, int i2) {
            md8.checkNotNullParameter(wfgVar, "db");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        public void onOpen(@yfb wfg wfgVar) {
            md8.checkNotNullParameter(wfgVar, "db");
        }

        public abstract void onUpgrade(@yfb wfg wfgVar, int i, int i2);
    }

    /* JADX INFO: renamed from: xfg$c */
    public interface InterfaceC15048c {
        @yfb
        xfg create(@yfb C15047b c15047b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @gib
    String getDatabaseName();

    @yfb
    wfg getReadableDatabase();

    @yfb
    wfg getWritableDatabase();

    @c5e(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);

    /* JADX INFO: renamed from: xfg$b */
    public static final class C15047b {

        /* JADX INFO: renamed from: f */
        @yfb
        public static final b f97667f = new b(null);

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final Context f97668a;

        /* JADX INFO: renamed from: b */
        @gib
        @un8
        public final String f97669b;

        /* JADX INFO: renamed from: c */
        @un8
        @yfb
        public final AbstractC15046a f97670c;

        /* JADX INFO: renamed from: d */
        @un8
        public final boolean f97671d;

        /* JADX INFO: renamed from: e */
        @un8
        public final boolean f97672e;

        /* JADX INFO: renamed from: xfg$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            @yfb
            public final Context f97673a;

            /* JADX INFO: renamed from: b */
            @gib
            public String f97674b;

            /* JADX INFO: renamed from: c */
            @gib
            public AbstractC15046a f97675c;

            /* JADX INFO: renamed from: d */
            public boolean f97676d;

            /* JADX INFO: renamed from: e */
            public boolean f97677e;

            public a(@yfb Context context) {
                md8.checkNotNullParameter(context, "context");
                this.f97673a = context;
            }

            @yfb
            public a allowDataLossOnRecovery(boolean z) {
                this.f97677e = z;
                return this;
            }

            @yfb
            public C15047b build() {
                String str;
                AbstractC15046a abstractC15046a = this.f97675c;
                if (abstractC15046a == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f97676d && ((str = this.f97674b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new C15047b(this.f97673a, this.f97674b, abstractC15046a, this.f97676d, this.f97677e);
            }

            @yfb
            public a callback(@yfb AbstractC15046a abstractC15046a) {
                md8.checkNotNullParameter(abstractC15046a, "callback");
                this.f97675c = abstractC15046a;
                return this;
            }

            @yfb
            public a name(@gib String str) {
                this.f97674b = str;
                return this;
            }

            @yfb
            public a noBackupDirectory(boolean z) {
                this.f97676d = z;
                return this;
            }
        }

        /* JADX INFO: renamed from: xfg$b$b */
        public static final class b {
            public /* synthetic */ b(jt3 jt3Var) {
                this();
            }

            @do8
            @yfb
            public final a builder(@yfb Context context) {
                md8.checkNotNullParameter(context, "context");
                return new a(context);
            }

            private b() {
            }
        }

        public C15047b(@yfb Context context, @gib String str, @yfb AbstractC15046a abstractC15046a, boolean z, boolean z2) {
            md8.checkNotNullParameter(context, "context");
            md8.checkNotNullParameter(abstractC15046a, "callback");
            this.f97668a = context;
            this.f97669b = str;
            this.f97670c = abstractC15046a;
            this.f97671d = z;
            this.f97672e = z2;
        }

        @do8
        @yfb
        public static final a builder(@yfb Context context) {
            return f97667f.builder(context);
        }

        public /* synthetic */ C15047b(Context context, String str, AbstractC15046a abstractC15046a, boolean z, boolean z2, int i, jt3 jt3Var) {
            this(context, str, abstractC15046a, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }
}
