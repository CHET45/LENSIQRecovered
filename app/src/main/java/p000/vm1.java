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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class vm1 {

    /* JADX INFO: renamed from: g */
    public static final String f91679g = "cached_content_index.exi";

    /* JADX INFO: renamed from: h */
    public static final int f91680h = 10485760;

    /* JADX INFO: renamed from: a */
    public final HashMap<String, tm1> f91681a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<String> f91682b;

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f91683c;

    /* JADX INFO: renamed from: d */
    public final SparseBooleanArray f91684d;

    /* JADX INFO: renamed from: e */
    public InterfaceC14164c f91685e;

    /* JADX INFO: renamed from: f */
    @hib
    public InterfaceC14164c f91686f;

    /* JADX INFO: renamed from: vm1$a */
    public static final class C14162a implements InterfaceC14164c {

        /* JADX INFO: renamed from: e */
        public static final String f91687e = "ExoPlayerCacheIndex";

        /* JADX INFO: renamed from: f */
        public static final int f91688f = 1;

        /* JADX INFO: renamed from: g */
        public static final String f91689g = "id";

        /* JADX INFO: renamed from: h */
        public static final String f91690h = "key";

        /* JADX INFO: renamed from: i */
        public static final String f91691i = "metadata";

        /* JADX INFO: renamed from: j */
        public static final int f91692j = 0;

        /* JADX INFO: renamed from: k */
        public static final int f91693k = 1;

        /* JADX INFO: renamed from: l */
        public static final int f91694l = 2;

        /* JADX INFO: renamed from: m */
        public static final String f91695m = "id = ?";

        /* JADX INFO: renamed from: n */
        public static final String[] f91696n = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: o */
        public static final String f91697o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";

        /* JADX INFO: renamed from: a */
        public final si3 f91698a;

        /* JADX INFO: renamed from: b */
        public final SparseArray<tm1> f91699b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public String f91700c;

        /* JADX INFO: renamed from: d */
        public String f91701d;

        public C14162a(si3 si3Var) {
            this.f91698a = si3Var;
        }

        private void addOrUpdateRow(SQLiteDatabase sQLiteDatabase, tm1 tm1Var) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            vm1.writeContentMetadata(tm1Var.getMetadata(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(tm1Var.f85297a));
            contentValues.put("key", tm1Var.f85298b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) u80.checkNotNull(this.f91701d), null, contentValues);
        }

        public static void delete(si3 si3Var, long j) throws oi3 {
            delete(si3Var, Long.toHexString(j));
        }

        private void deleteRow(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((String) u80.checkNotNull(this.f91701d), "id = ?", new String[]{Integer.toString(i)});
        }

        private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor getCursor() {
            return this.f91698a.getReadableDatabase().query((String) u80.checkNotNull(this.f91701d), f91696n, null, null, null, null, null);
        }

        private static String getTableName(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        private void initializeTable(SQLiteDatabase sQLiteDatabase) throws oi3 {
            x4i.setVersion(sQLiteDatabase, 1, (String) u80.checkNotNull(this.f91700c), 1);
            dropTable(sQLiteDatabase, (String) u80.checkNotNull(this.f91701d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f91701d + C2473f.f17566z + "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // p000.vm1.InterfaceC14164c
        public boolean exists() throws oi3 {
            try {
                return x4i.getVersion(this.f91698a.getReadableDatabase(), 1, (String) u80.checkNotNull(this.f91700c)) != -1;
            } catch (SQLException e) {
                throw new oi3(e);
            }
        }

        @Override // p000.vm1.InterfaceC14164c
        public void initialize(long j) {
            String hexString = Long.toHexString(j);
            this.f91700c = hexString;
            this.f91701d = getTableName(hexString);
        }

        @Override // p000.vm1.InterfaceC14164c
        public void load(HashMap<String, tm1> map, SparseArray<String> sparseArray) throws IOException {
            u80.checkState(this.f91699b.size() == 0);
            try {
                if (x4i.getVersion(this.f91698a.getReadableDatabase(), 1, (String) u80.checkNotNull(this.f91700c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f91698a.getWritableDatabase();
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
                        tm1 tm1Var = new tm1(cursor.getInt(0), (String) u80.checkNotNull(cursor.getString(1)), vm1.readContentMetadata(new DataInputStream(new ByteArrayInputStream(cursor.getBlob(2)))));
                        map.put(tm1Var.f85298b, tm1Var);
                        sparseArray.put(tm1Var.f85297a, tm1Var.f85298b);
                    } finally {
                    }
                }
                cursor.close();
            } catch (SQLiteException e) {
                map.clear();
                sparseArray.clear();
                throw new oi3(e);
            }
        }

        @Override // p000.vm1.InterfaceC14164c
        public void onRemove(tm1 tm1Var, boolean z) {
            if (z) {
                this.f91699b.delete(tm1Var.f85297a);
            } else {
                this.f91699b.put(tm1Var.f85297a, null);
            }
        }

        @Override // p000.vm1.InterfaceC14164c
        public void onUpdate(tm1 tm1Var) {
            this.f91699b.put(tm1Var.f85297a, tm1Var);
        }

        @Override // p000.vm1.InterfaceC14164c
        public void storeFully(HashMap<String, tm1> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f91698a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    initializeTable(writableDatabase);
                    Iterator<tm1> it = map.values().iterator();
                    while (it.hasNext()) {
                        addOrUpdateRow(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f91699b.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e) {
                throw new oi3(e);
            }
        }

        @Override // p000.vm1.InterfaceC14164c
        public void storeIncremental(HashMap<String, tm1> map) throws IOException {
            if (this.f91699b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f91698a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.f91699b.size(); i++) {
                    try {
                        tm1 tm1VarValueAt = this.f91699b.valueAt(i);
                        if (tm1VarValueAt == null) {
                            deleteRow(writableDatabase, this.f91699b.keyAt(i));
                        } else {
                            addOrUpdateRow(writableDatabase, tm1VarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f91699b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new oi3(e);
            }
        }

        @Override // p000.vm1.InterfaceC14164c
        public void delete() throws oi3 {
            delete(this.f91698a, (String) u80.checkNotNull(this.f91700c));
        }

        private static void delete(si3 si3Var, String str) throws oi3 {
            try {
                String tableName = getTableName(str);
                SQLiteDatabase writableDatabase = si3Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    x4i.removeVersion(writableDatabase, 1, str);
                    dropTable(writableDatabase, tableName);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                throw new oi3(e);
            }
        }
    }

    /* JADX INFO: renamed from: vm1$b */
    public static class C14163b implements InterfaceC14164c {

        /* JADX INFO: renamed from: h */
        public static final int f91702h = 2;

        /* JADX INFO: renamed from: i */
        public static final int f91703i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f91704j = 1;

        /* JADX INFO: renamed from: a */
        public final boolean f91705a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Cipher f91706b;

        /* JADX INFO: renamed from: c */
        @hib
        public final SecretKeySpec f91707c;

        /* JADX INFO: renamed from: d */
        @hib
        public final SecureRandom f91708d;

        /* JADX INFO: renamed from: e */
        public final sb0 f91709e;

        /* JADX INFO: renamed from: f */
        public boolean f91710f;

        /* JADX INFO: renamed from: g */
        @hib
        public f9e f91711g;

        public C14163b(File file, @hib byte[] bArr, boolean z) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            u80.checkState((bArr == null && z) ? false : true);
            if (bArr != null) {
                u80.checkArgument(bArr.length == 16);
                try {
                    cipher = vm1.getCipher();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                u80.checkArgument(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f91705a = z;
            this.f91706b = cipher;
            this.f91707c = secretKeySpec;
            this.f91708d = z ? new SecureRandom() : null;
            this.f91709e = new sb0(file);
        }

        private int hashCachedContent(tm1 tm1Var, int i) {
            int i2;
            int iHashCode;
            int iHashCode2 = (tm1Var.f85297a * 31) + tm1Var.f85298b.hashCode();
            if (i < 2) {
                long contentLength = ow2.getContentLength(tm1Var.getMetadata());
                i2 = iHashCode2 * 31;
                iHashCode = (int) (contentLength ^ (contentLength >>> 32));
            } else {
                i2 = iHashCode2 * 31;
                iHashCode = tm1Var.getMetadata().hashCode();
            }
            return i2 + iHashCode;
        }

        private tm1 readCachedContent(int i, DataInputStream dataInputStream) throws IOException {
            kt3 contentMetadata;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                qw2 qw2Var = new qw2();
                qw2.setContentLength(qw2Var, j);
                contentMetadata = kt3.f55283f.copyWithMutationsApplied(qw2Var);
            } else {
                contentMetadata = vm1.readContentMetadata(dataInputStream);
            }
            return new tm1(i2, utf, contentMetadata);
        }

        private boolean readFile(HashMap<String, tm1> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f91709e.exists()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f91709e.openRead());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream2.readInt();
                    if (i >= 0 && i <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f91706b == null) {
                                x0i.closeQuietly(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f91706b.init(2, (Key) x0i.castNonNull(this.f91707c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f91706b));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f91705a) {
                            this.f91710f = true;
                        }
                        int i2 = dataInputStream2.readInt();
                        int iHashCachedContent = 0;
                        for (int i3 = 0; i3 < i2; i3++) {
                            tm1 cachedContent = readCachedContent(i, dataInputStream2);
                            map.put(cachedContent.f85298b, cachedContent);
                            sparseArray.put(cachedContent.f85297a, cachedContent.f85298b);
                            iHashCachedContent += hashCachedContent(cachedContent, i);
                        }
                        int i4 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (i4 == iHashCachedContent && z) {
                            x0i.closeQuietly(dataInputStream2);
                            return true;
                        }
                        x0i.closeQuietly(dataInputStream2);
                        return false;
                    }
                    x0i.closeQuietly(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        x0i.closeQuietly(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        x0i.closeQuietly(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private void writeCachedContent(tm1 tm1Var, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(tm1Var.f85297a);
            dataOutputStream.writeUTF(tm1Var.f85298b);
            vm1.writeContentMetadata(tm1Var.getMetadata(), dataOutputStream);
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
        private void writeFile(HashMap<String, tm1> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamStartWrite = this.f91709e.startWrite();
                f9e f9eVar = this.f91711g;
                if (f9eVar == null) {
                    this.f91711g = new f9e(outputStreamStartWrite);
                } else {
                    f9eVar.reset(outputStreamStartWrite);
                }
                f9e f9eVar2 = this.f91711g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(f9eVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iHashCachedContent = 0;
                    dataOutputStream2.writeInt(this.f91705a ? 1 : 0);
                    if (this.f91705a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) x0i.castNonNull(this.f91708d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) x0i.castNonNull(this.f91706b)).init(1, (Key) x0i.castNonNull(this.f91707c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(f9eVar2, this.f91706b));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (tm1 tm1Var : map.values()) {
                        writeCachedContent(tm1Var, dataOutputStream2);
                        iHashCachedContent += hashCachedContent(tm1Var, 2);
                    }
                    dataOutputStream2.writeInt(iHashCachedContent);
                    this.f91709e.endWrite(dataOutputStream2);
                    x0i.closeQuietly(null);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    x0i.closeQuietly(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // p000.vm1.InterfaceC14164c
        public void delete() {
            this.f91709e.delete();
        }

        @Override // p000.vm1.InterfaceC14164c
        public boolean exists() {
            return this.f91709e.exists();
        }

        @Override // p000.vm1.InterfaceC14164c
        public void initialize(long j) {
        }

        @Override // p000.vm1.InterfaceC14164c
        public void load(HashMap<String, tm1> map, SparseArray<String> sparseArray) {
            u80.checkState(!this.f91710f);
            if (readFile(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f91709e.delete();
        }

        @Override // p000.vm1.InterfaceC14164c
        public void onRemove(tm1 tm1Var, boolean z) {
            this.f91710f = true;
        }

        @Override // p000.vm1.InterfaceC14164c
        public void onUpdate(tm1 tm1Var) {
            this.f91710f = true;
        }

        @Override // p000.vm1.InterfaceC14164c
        public void storeFully(HashMap<String, tm1> map) throws Throwable {
            writeFile(map);
            this.f91710f = false;
        }

        @Override // p000.vm1.InterfaceC14164c
        public void storeIncremental(HashMap<String, tm1> map) throws Throwable {
            if (this.f91710f) {
                storeFully(map);
            }
        }
    }

    /* JADX INFO: renamed from: vm1$c */
    public interface InterfaceC14164c {
        void delete() throws IOException;

        boolean exists() throws IOException;

        void initialize(long j);

        void load(HashMap<String, tm1> map, SparseArray<String> sparseArray) throws IOException;

        void onRemove(tm1 tm1Var, boolean z);

        void onUpdate(tm1 tm1Var);

        void storeFully(HashMap<String, tm1> map) throws IOException;

        void storeIncremental(HashMap<String, tm1> map) throws IOException;
    }

    public vm1(si3 si3Var) {
        this(si3Var, null, null, false, false);
    }

    private tm1 addNew(String str) {
        int iM24063d = m24063d(this.f91682b);
        tm1 tm1Var = new tm1(iM24063d, str);
        this.f91681a.put(str, tm1Var);
        this.f91682b.put(iM24063d, str);
        this.f91684d.put(iM24063d, true);
        this.f91685e.onUpdate(tm1Var);
        return tm1Var;
    }

    @fdi
    /* JADX INFO: renamed from: d */
    public static int m24063d(SparseArray<String> sparseArray) {
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
    public static void delete(si3 si3Var, long j) throws oi3 {
        C14162a.delete(si3Var, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"GetInstance"})
    public static Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (x0i.f95978a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static boolean isIndexFile(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kt3 readContentMetadata(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException("Invalid value size: " + i3);
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = x0i.f95983f;
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
        return new kt3(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeContentMetadata(kt3 kt3Var, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = kt3Var.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void applyContentMetadataMutations(String str, qw2 qw2Var) {
        tm1 orAdd = getOrAdd(str);
        if (orAdd.applyMetadataMutations(qw2Var)) {
            this.f91685e.onUpdate(orAdd);
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).f85297a;
    }

    @hib
    public tm1 get(String str) {
        return this.f91681a.get(str);
    }

    public Collection<tm1> getAll() {
        return Collections.unmodifiableCollection(this.f91681a.values());
    }

    public ow2 getContentMetadata(String str) {
        tm1 tm1Var = get(str);
        return tm1Var != null ? tm1Var.getMetadata() : kt3.f55283f;
    }

    @hib
    public String getKeyForId(int i) {
        return this.f91682b.get(i);
    }

    public Set<String> getKeys() {
        return this.f91681a.keySet();
    }

    public tm1 getOrAdd(String str) {
        tm1 tm1Var = this.f91681a.get(str);
        return tm1Var == null ? addNew(str) : tm1Var;
    }

    @xqi
    public void initialize(long j) throws IOException {
        InterfaceC14164c interfaceC14164c;
        this.f91685e.initialize(j);
        InterfaceC14164c interfaceC14164c2 = this.f91686f;
        if (interfaceC14164c2 != null) {
            interfaceC14164c2.initialize(j);
        }
        if (this.f91685e.exists() || (interfaceC14164c = this.f91686f) == null || !interfaceC14164c.exists()) {
            this.f91685e.load(this.f91681a, this.f91682b);
        } else {
            this.f91686f.load(this.f91681a, this.f91682b);
            this.f91685e.storeFully(this.f91681a);
        }
        InterfaceC14164c interfaceC14164c3 = this.f91686f;
        if (interfaceC14164c3 != null) {
            interfaceC14164c3.delete();
            this.f91686f = null;
        }
    }

    public void maybeRemove(String str) {
        tm1 tm1Var = this.f91681a.get(str);
        if (tm1Var != null && tm1Var.isEmpty() && tm1Var.isFullyUnlocked()) {
            this.f91681a.remove(str);
            int i = tm1Var.f85297a;
            boolean z = this.f91684d.get(i);
            this.f91685e.onRemove(tm1Var, z);
            if (z) {
                this.f91682b.remove(i);
                this.f91684d.delete(i);
            } else {
                this.f91682b.put(i, null);
                this.f91683c.put(i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeEmpty() {
        quh it = dy7.copyOf((Collection) this.f91681a.keySet()).iterator();
        while (it.hasNext()) {
            maybeRemove((String) it.next());
        }
    }

    @xqi
    public void store() throws IOException {
        this.f91685e.storeIncremental(this.f91681a);
        int size = this.f91683c.size();
        for (int i = 0; i < size; i++) {
            this.f91682b.remove(this.f91683c.keyAt(i));
        }
        this.f91683c.clear();
        this.f91684d.clear();
    }

    public vm1(@hib si3 si3Var, @hib File file, @hib byte[] bArr, boolean z, boolean z2) {
        u80.checkState((si3Var == null && file == null) ? false : true);
        this.f91681a = new HashMap<>();
        this.f91682b = new SparseArray<>();
        this.f91683c = new SparseBooleanArray();
        this.f91684d = new SparseBooleanArray();
        C14162a c14162a = si3Var != null ? new C14162a(si3Var) : null;
        C14163b c14163b = file != null ? new C14163b(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (c14162a == null || (c14163b != null && z2)) {
            this.f91685e = (InterfaceC14164c) x0i.castNonNull(c14163b);
            this.f91686f = c14162a;
        } else {
            this.f91685e = c14162a;
            this.f91686f = c14163b;
        }
    }
}
