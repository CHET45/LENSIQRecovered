package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.blankj.utilcode.util.C2473f;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class um1 {

    /* JADX INFO: renamed from: g */
    public static final String f88427g = "cached_content_index.exi";

    /* JADX INFO: renamed from: h */
    public static final int f88428h = 10485760;

    /* JADX INFO: renamed from: a */
    public final HashMap<String, sm1> f88429a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<String> f88430b;

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f88431c;

    /* JADX INFO: renamed from: d */
    public final SparseBooleanArray f88432d;

    /* JADX INFO: renamed from: e */
    public InterfaceC13595c f88433e;

    /* JADX INFO: renamed from: f */
    @hib
    public InterfaceC13595c f88434f;

    /* JADX INFO: renamed from: um1$a */
    public static final class C13593a implements InterfaceC13595c {

        /* JADX INFO: renamed from: e */
        public static final String f88435e = "ExoPlayerCacheIndex";

        /* JADX INFO: renamed from: f */
        public static final int f88436f = 1;

        /* JADX INFO: renamed from: g */
        public static final String f88437g = "id";

        /* JADX INFO: renamed from: h */
        public static final String f88438h = "key";

        /* JADX INFO: renamed from: i */
        public static final String f88439i = "metadata";

        /* JADX INFO: renamed from: j */
        public static final int f88440j = 0;

        /* JADX INFO: renamed from: k */
        public static final int f88441k = 1;

        /* JADX INFO: renamed from: l */
        public static final int f88442l = 2;

        /* JADX INFO: renamed from: m */
        public static final String f88443m = "id = ?";

        /* JADX INFO: renamed from: n */
        public static final String[] f88444n = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: o */
        public static final String f88445o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";

        /* JADX INFO: renamed from: a */
        public final ti3 f88446a;

        /* JADX INFO: renamed from: b */
        public final SparseArray<sm1> f88447b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public String f88448c;

        /* JADX INFO: renamed from: d */
        public String f88449d;

        public C13593a(ti3 ti3Var) {
            this.f88446a = ti3Var;
        }

        private void addOrUpdateRow(SQLiteDatabase sQLiteDatabase, sm1 sm1Var) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            um1.writeContentMetadata(sm1Var.getMetadata(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(sm1Var.f82210a));
            contentValues.put("key", sm1Var.f82211b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) v80.checkNotNull(this.f88449d), null, contentValues);
        }

        public static void delete(ti3 ti3Var, long j) throws pi3 {
            delete(ti3Var, Long.toHexString(j));
        }

        private void deleteRow(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((String) v80.checkNotNull(this.f88449d), "id = ?", new String[]{Integer.toString(i)});
        }

        private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor getCursor() {
            return this.f88446a.getReadableDatabase().query((String) v80.checkNotNull(this.f88449d), f88444n, null, null, null, null, null);
        }

        private static String getTableName(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        private void initializeTable(SQLiteDatabase sQLiteDatabase) throws pi3 {
            y4i.setVersion(sQLiteDatabase, 1, (String) v80.checkNotNull(this.f88448c), 1);
            dropTable(sQLiteDatabase, (String) v80.checkNotNull(this.f88449d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f88449d + C2473f.f17566z + "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // p000.um1.InterfaceC13595c
        public boolean exists() throws pi3 {
            try {
                return y4i.getVersion(this.f88446a.getReadableDatabase(), 1, (String) v80.checkNotNull(this.f88448c)) != -1;
            } catch (SQLException e) {
                throw new pi3(e);
            }
        }

        @Override // p000.um1.InterfaceC13595c
        public void initialize(long j) {
            String hexString = Long.toHexString(j);
            this.f88448c = hexString;
            this.f88449d = getTableName(hexString);
        }

        @Override // p000.um1.InterfaceC13595c
        public void load(HashMap<String, sm1> map, SparseArray<String> sparseArray) throws IOException {
            v80.checkState(this.f88447b.size() == 0);
            try {
                if (y4i.getVersion(this.f88446a.getReadableDatabase(), 1, (String) v80.checkNotNull(this.f88448c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f88446a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        initializeTable(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursor = getCursor();
                while (cursor.moveToNext()) {
                    try {
                        sm1 sm1Var = new sm1(cursor.getInt(0), (String) v80.checkNotNull(cursor.getString(1)), um1.readContentMetadata(new DataInputStream(new ByteArrayInputStream(cursor.getBlob(2)))));
                        map.put(sm1Var.f82211b, sm1Var);
                        sparseArray.put(sm1Var.f82210a, sm1Var.f82211b);
                    } finally {
                    }
                }
                cursor.close();
            } catch (SQLiteException e) {
                map.clear();
                sparseArray.clear();
                throw new pi3(e);
            }
        }

        @Override // p000.um1.InterfaceC13595c
        public void onRemove(sm1 sm1Var, boolean z) {
            if (z) {
                this.f88447b.delete(sm1Var.f82210a);
            } else {
                this.f88447b.put(sm1Var.f82210a, null);
            }
        }

        @Override // p000.um1.InterfaceC13595c
        public void onUpdate(sm1 sm1Var) {
            this.f88447b.put(sm1Var.f82210a, sm1Var);
        }

        @Override // p000.um1.InterfaceC13595c
        public void storeFully(HashMap<String, sm1> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f88446a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    initializeTable(writableDatabase);
                    Iterator<sm1> it = map.values().iterator();
                    while (it.hasNext()) {
                        addOrUpdateRow(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f88447b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e) {
                throw new pi3(e);
            }
        }

        @Override // p000.um1.InterfaceC13595c
        public void storeIncremental(HashMap<String, sm1> map) throws IOException {
            if (this.f88447b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f88446a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.f88447b.size(); i++) {
                    try {
                        sm1 sm1VarValueAt = this.f88447b.valueAt(i);
                        if (sm1VarValueAt == null) {
                            deleteRow(writableDatabase, this.f88447b.keyAt(i));
                        } else {
                            addOrUpdateRow(writableDatabase, sm1VarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f88447b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new pi3(e);
            }
        }

        @Override // p000.um1.InterfaceC13595c
        public void delete() throws pi3 {
            delete(this.f88446a, (String) v80.checkNotNull(this.f88448c));
        }

        private static void delete(ti3 ti3Var, String str) throws pi3 {
            try {
                String tableName = getTableName(str);
                SQLiteDatabase writableDatabase = ti3Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    y4i.removeVersion(writableDatabase, 1, str);
                    dropTable(writableDatabase, tableName);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                throw new pi3(e);
            }
        }
    }

    /* JADX INFO: renamed from: um1$b */
    public static class C13594b implements InterfaceC13595c {

        /* JADX INFO: renamed from: h */
        public static final int f88450h = 2;

        /* JADX INFO: renamed from: i */
        public static final int f88451i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f88452j = 1;

        /* JADX INFO: renamed from: a */
        public final boolean f88453a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Cipher f88454b;

        /* JADX INFO: renamed from: c */
        @hib
        public final SecretKeySpec f88455c;

        /* JADX INFO: renamed from: d */
        @hib
        public final SecureRandom f88456d;

        /* JADX INFO: renamed from: e */
        public final rb0 f88457e;

        /* JADX INFO: renamed from: f */
        public boolean f88458f;

        /* JADX INFO: renamed from: g */
        @hib
        public g9e f88459g;

        public C13594b(File file, @hib byte[] bArr, boolean z) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            v80.checkState((bArr == null && z) ? false : true);
            if (bArr != null) {
                v80.checkArgument(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                v80.checkArgument(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f88453a = z;
            this.f88454b = cipher;
            this.f88455c = secretKeySpec;
            this.f88456d = z ? new SecureRandom() : null;
            this.f88457e = new rb0(file);
        }

        private int hashCachedContent(sm1 sm1Var, int i) {
            int i2;
            int iHashCode;
            int iHashCode2 = (sm1Var.f82210a * 31) + sm1Var.f82211b.hashCode();
            if (i < 2) {
                long contentLength = pw2.getContentLength(sm1Var.getMetadata());
                i2 = iHashCode2 * 31;
                iHashCode = (int) (contentLength ^ (contentLength >>> 32));
            } else {
                i2 = iHashCode2 * 31;
                iHashCode = sm1Var.getMetadata().hashCode();
            }
            return i2 + iHashCode;
        }

        private sm1 readCachedContent(int i, DataInputStream dataInputStream) throws IOException {
            lt3 contentMetadata;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                rw2 rw2Var = new rw2();
                rw2.setContentLength(rw2Var, j);
                contentMetadata = lt3.f58675f.copyWithMutationsApplied(rw2Var);
            } else {
                contentMetadata = um1.readContentMetadata(dataInputStream);
            }
            return new sm1(i2, utf, contentMetadata);
        }

        private boolean readFile(HashMap<String, sm1> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f88457e.exists()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f88457e.openRead());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream2.readInt();
                    if (i >= 0 && i <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f88454b == null) {
                                t0i.closeQuietly(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f88454b.init(2, (Key) t0i.castNonNull(this.f88455c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f88454b));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f88453a) {
                            this.f88458f = true;
                        }
                        int i2 = dataInputStream2.readInt();
                        int iHashCachedContent = 0;
                        for (int i3 = 0; i3 < i2; i3++) {
                            sm1 cachedContent = readCachedContent(i, dataInputStream2);
                            map.put(cachedContent.f82211b, cachedContent);
                            sparseArray.put(cachedContent.f82210a, cachedContent.f82211b);
                            iHashCachedContent += hashCachedContent(cachedContent, i);
                        }
                        int i4 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (i4 == iHashCachedContent && z) {
                            t0i.closeQuietly(dataInputStream2);
                            return true;
                        }
                        t0i.closeQuietly(dataInputStream2);
                        return false;
                    }
                    t0i.closeQuietly(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        t0i.closeQuietly(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        t0i.closeQuietly(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private void writeCachedContent(sm1 sm1Var, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(sm1Var.f82210a);
            dataOutputStream.writeUTF(sm1Var.f82211b);
            um1.writeContentMetadata(sm1Var.getMetadata(), dataOutputStream);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void writeFile(HashMap<String, sm1> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamStartWrite = this.f88457e.startWrite();
                g9e g9eVar = this.f88459g;
                if (g9eVar == null) {
                    this.f88459g = new g9e(outputStreamStartWrite);
                } else {
                    g9eVar.reset(outputStreamStartWrite);
                }
                g9e g9eVar2 = this.f88459g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(g9eVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iHashCachedContent = 0;
                    dataOutputStream2.writeInt(this.f88453a ? 1 : 0);
                    if (this.f88453a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) t0i.castNonNull(this.f88456d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) t0i.castNonNull(this.f88454b)).init(1, (Key) t0i.castNonNull(this.f88455c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(g9eVar2, this.f88454b));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (sm1 sm1Var : map.values()) {
                        writeCachedContent(sm1Var, dataOutputStream2);
                        iHashCachedContent += hashCachedContent(sm1Var, 2);
                    }
                    dataOutputStream2.writeInt(iHashCachedContent);
                    this.f88457e.endWrite(dataOutputStream2);
                    t0i.closeQuietly(null);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    t0i.closeQuietly(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // p000.um1.InterfaceC13595c
        public void delete() {
            this.f88457e.delete();
        }

        @Override // p000.um1.InterfaceC13595c
        public boolean exists() {
            return this.f88457e.exists();
        }

        @Override // p000.um1.InterfaceC13595c
        public void initialize(long j) {
        }

        @Override // p000.um1.InterfaceC13595c
        public void load(HashMap<String, sm1> map, SparseArray<String> sparseArray) {
            v80.checkState(!this.f88458f);
            if (readFile(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f88457e.delete();
        }

        @Override // p000.um1.InterfaceC13595c
        public void onRemove(sm1 sm1Var, boolean z) {
            this.f88458f = true;
        }

        @Override // p000.um1.InterfaceC13595c
        public void onUpdate(sm1 sm1Var) {
            this.f88458f = true;
        }

        @Override // p000.um1.InterfaceC13595c
        public void storeFully(HashMap<String, sm1> map) throws Throwable {
            writeFile(map);
            this.f88458f = false;
        }

        @Override // p000.um1.InterfaceC13595c
        public void storeIncremental(HashMap<String, sm1> map) throws Throwable {
            if (this.f88458f) {
                storeFully(map);
            }
        }
    }

    /* JADX INFO: renamed from: um1$c */
    public interface InterfaceC13595c {
        void delete() throws IOException;

        boolean exists() throws IOException;

        void initialize(long j);

        void load(HashMap<String, sm1> map, SparseArray<String> sparseArray) throws IOException;

        void onRemove(sm1 sm1Var, boolean z);

        void onUpdate(sm1 sm1Var);

        void storeFully(HashMap<String, sm1> map) throws IOException;

        void storeIncremental(HashMap<String, sm1> map) throws IOException;
    }

    public um1(ti3 ti3Var) {
        this(ti3Var, null, null, false, false);
    }

    private sm1 addNew(String str) {
        int iM23425c = m23425c(this.f88430b);
        sm1 sm1Var = new sm1(iM23425c, str);
        this.f88429a.put(str, sm1Var);
        this.f88430b.put(iM23425c, str);
        this.f88432d.put(iM23425c, true);
        this.f88433e.onUpdate(sm1Var);
        return sm1Var;
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static int m23425c(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    @xqi
    public static void delete(ti3 ti3Var, long j) throws pi3 {
        C13593a.delete(ti3Var, j);
    }

    public static boolean isIndexFile(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static lt3 readContentMetadata(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException("Invalid value size: " + i3);
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = t0i.f83321f;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new lt3(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeContentMetadata(lt3 lt3Var, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = lt3Var.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void applyContentMetadataMutations(String str, rw2 rw2Var) {
        sm1 orAdd = getOrAdd(str);
        if (orAdd.applyMetadataMutations(rw2Var)) {
            this.f88433e.onUpdate(orAdd);
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).f82210a;
    }

    @hib
    public sm1 get(String str) {
        return this.f88429a.get(str);
    }

    public Collection<sm1> getAll() {
        return Collections.unmodifiableCollection(this.f88429a.values());
    }

    public pw2 getContentMetadata(String str) {
        sm1 sm1Var = get(str);
        return sm1Var != null ? sm1Var.getMetadata() : lt3.f58675f;
    }

    @hib
    public String getKeyForId(int i) {
        return this.f88430b.get(i);
    }

    public Set<String> getKeys() {
        return this.f88429a.keySet();
    }

    public sm1 getOrAdd(String str) {
        sm1 sm1Var = this.f88429a.get(str);
        return sm1Var == null ? addNew(str) : sm1Var;
    }

    @xqi
    public void initialize(long j) throws IOException {
        InterfaceC13595c interfaceC13595c;
        this.f88433e.initialize(j);
        InterfaceC13595c interfaceC13595c2 = this.f88434f;
        if (interfaceC13595c2 != null) {
            interfaceC13595c2.initialize(j);
        }
        if (this.f88433e.exists() || (interfaceC13595c = this.f88434f) == null || !interfaceC13595c.exists()) {
            this.f88433e.load(this.f88429a, this.f88430b);
        } else {
            this.f88434f.load(this.f88429a, this.f88430b);
            this.f88433e.storeFully(this.f88429a);
        }
        InterfaceC13595c interfaceC13595c3 = this.f88434f;
        if (interfaceC13595c3 != null) {
            interfaceC13595c3.delete();
            this.f88434f = null;
        }
    }

    public void maybeRemove(String str) {
        sm1 sm1Var = this.f88429a.get(str);
        if (sm1Var != null && sm1Var.isEmpty() && sm1Var.isFullyUnlocked()) {
            this.f88429a.remove(str);
            int i = sm1Var.f82210a;
            boolean z = this.f88432d.get(i);
            this.f88433e.onRemove(sm1Var, z);
            if (z) {
                this.f88430b.remove(i);
                this.f88432d.delete(i);
            } else {
                this.f88430b.put(i, null);
                this.f88431c.put(i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeEmpty() {
        quh it = dy7.copyOf((Collection) this.f88429a.keySet()).iterator();
        while (it.hasNext()) {
            maybeRemove((String) it.next());
        }
    }

    @xqi
    public void store() throws IOException {
        this.f88433e.storeIncremental(this.f88429a);
        int size = this.f88431c.size();
        for (int i = 0; i < size; i++) {
            this.f88430b.remove(this.f88431c.keyAt(i));
        }
        this.f88431c.clear();
        this.f88432d.clear();
    }

    public um1(@hib ti3 ti3Var, @hib File file, @hib byte[] bArr, boolean z, boolean z2) {
        v80.checkState((ti3Var == null && file == null) ? false : true);
        this.f88429a = new HashMap<>();
        this.f88430b = new SparseArray<>();
        this.f88431c = new SparseBooleanArray();
        this.f88432d = new SparseBooleanArray();
        C13593a c13593a = ti3Var != null ? new C13593a(ti3Var) : null;
        C13594b c13594b = file != null ? new C13594b(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (c13593a == null || (c13594b != null && z2)) {
            this.f88433e = (InterfaceC13595c) t0i.castNonNull(c13594b);
            this.f88434f = c13593a;
        } else {
            this.f88433e = c13593a;
            this.f88434f = c13594b;
        }
    }
}
