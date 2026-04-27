package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e27 implements d27 {

    /* JADX INFO: renamed from: a */
    public final uae f31590a;

    /* JADX INFO: renamed from: b */
    public final l35<b27> f31591b;

    /* JADX INFO: renamed from: c */
    public final caf f31592c;

    /* JADX INFO: renamed from: d */
    public final caf f31593d;

    /* JADX INFO: renamed from: e27$a */
    public class C5055a extends l35<b27> {
        public C5055a(uae uaeVar) {
            super(uaeVar);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR REPLACE INTO `gptAiChat` (`id`,`defaultCharacters`,`reasoningResult`,`result`,`type`,`multipleOptions`,`voicePath`,`msgId`,`voiceTime`,`messageTime`,`isPause`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, b27 b27Var) {
            bggVar.bindLong(1, b27Var.getId());
            if (b27Var.getDefaultCharacters() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, b27Var.getDefaultCharacters());
            }
            if (b27Var.getReasoningResult() == null) {
                bggVar.bindNull(3);
            } else {
                bggVar.bindString(3, b27Var.getReasoningResult());
            }
            if (b27Var.getResult() == null) {
                bggVar.bindNull(4);
            } else {
                bggVar.bindString(4, b27Var.getResult());
            }
            bggVar.bindLong(5, b27Var.getType());
            bggVar.bindLong(6, b27Var.getMultipleOptions());
            if (b27Var.getVoicePath() == null) {
                bggVar.bindNull(7);
            } else {
                bggVar.bindString(7, b27Var.getVoicePath());
            }
            if (b27Var.getMsgId() == null) {
                bggVar.bindNull(8);
            } else {
                bggVar.bindString(8, b27Var.getMsgId());
            }
            bggVar.bindLong(9, b27Var.getVoiceTime());
            bggVar.bindLong(10, b27Var.getMessageTime());
            bggVar.bindLong(11, b27Var.isPause() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: e27$b */
    public class C5056b extends caf {
        public C5056b(uae uaeVar) {
            super(uaeVar);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM gptAiChat WHERE messageTime = ?";
        }
    }

    /* JADX INFO: renamed from: e27$c */
    public class C5057c extends caf {
        public C5057c(uae uaeVar) {
            super(uaeVar);
        }

        @Override // p000.caf
        public String createQuery() {
            return "DELETE FROM gptAiChat";
        }
    }

    public e27(uae uaeVar) {
        this.f31590a = uaeVar;
        this.f31591b = new C5055a(uaeVar);
        this.f31592c = new C5056b(uaeVar);
        this.f31593d = new C5057c(uaeVar);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.d27
    public void deleteAll() {
        this.f31590a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f31593d.acquire();
        this.f31590a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f31590a.setTransactionSuccessful();
        } finally {
            this.f31590a.endTransaction();
            this.f31593d.release(bggVarAcquire);
        }
    }

    @Override // p000.d27
    public void deleteSelectData(long j) {
        this.f31590a.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.f31592c.acquire();
        bggVarAcquire.bindLong(1, j);
        this.f31590a.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.f31590a.setTransactionSuccessful();
        } finally {
            this.f31590a.endTransaction();
            this.f31592c.release(bggVarAcquire);
        }
    }

    @Override // p000.d27
    public List<b27> getAll() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM gptAiChat", 0);
        this.f31590a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f31590a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "defaultCharacters");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "reasoningResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "msgId");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                b27 b27Var = new b27();
                b27Var.setId(cursorQuery.getInt(columnIndexOrThrow));
                b27Var.setDefaultCharacters(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                b27Var.setReasoningResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                b27Var.setResult(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                b27Var.setType(cursorQuery.getInt(columnIndexOrThrow5));
                b27Var.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow6));
                b27Var.setVoicePath(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                b27Var.setMsgId(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                int i = columnIndexOrThrow;
                b27Var.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow9));
                b27Var.setMessageTime(cursorQuery.getLong(columnIndexOrThrow10));
                b27Var.setPause(cursorQuery.getInt(columnIndexOrThrow11) != 0);
                arrayList.add(b27Var);
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.d27
    public List<b27> getLatestTen() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM gptAiChat ORDER BY messageTime DESC LIMIT 50", 0);
        this.f31590a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f31590a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "defaultCharacters");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "reasoningResult");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "msgId");
            int columnIndexOrThrow9 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow10 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow11 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                b27 b27Var = new b27();
                b27Var.setId(cursorQuery.getInt(columnIndexOrThrow));
                b27Var.setDefaultCharacters(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                b27Var.setReasoningResult(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                b27Var.setResult(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                b27Var.setType(cursorQuery.getInt(columnIndexOrThrow5));
                b27Var.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow6));
                b27Var.setVoicePath(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                b27Var.setMsgId(cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8));
                int i = columnIndexOrThrow;
                b27Var.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow9));
                b27Var.setMessageTime(cursorQuery.getLong(columnIndexOrThrow10));
                b27Var.setPause(cursorQuery.getInt(columnIndexOrThrow11) != 0);
                arrayList.add(b27Var);
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // p000.d27
    public void insert(b27 b27Var) {
        this.f31590a.assertNotSuspendingTransaction();
        this.f31590a.beginTransaction();
        try {
            this.f31591b.insert(b27Var);
            this.f31590a.setTransactionSuccessful();
        } finally {
            this.f31590a.endTransaction();
        }
    }
}
