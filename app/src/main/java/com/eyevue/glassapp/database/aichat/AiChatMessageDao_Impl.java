package com.eyevue.glassapp.database.aichat;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.bb3;
import p000.bgg;
import p000.caf;
import p000.l35;
import p000.pe3;
import p000.uae;
import p000.xae;

/* JADX INFO: loaded from: classes4.dex */
public final class AiChatMessageDao_Impl implements AiChatMessageDao {
    private final uae __db;
    private final l35<AiChatMessage> __insertionAdapterOfAiChatMessage;
    private final caf __preparedStmtOfDeleteAll;
    private final caf __preparedStmtOfDeleteSelectData;

    public AiChatMessageDao_Impl(uae __db) {
        this.__db = __db;
        this.__insertionAdapterOfAiChatMessage = new l35<AiChatMessage>(__db) { // from class: com.eyevue.glassapp.database.aichat.AiChatMessageDao_Impl.1
            @Override // p000.caf
            public String createQuery() {
                return "INSERT OR REPLACE INTO `AiChat` (`id`,`msgId`,`msgType`,`messageTime`,`content`,`voicePath`,`imagePath`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            @Override // p000.l35
            public void bind(bgg stmt, AiChatMessage value) {
                stmt.bindLong(1, value.getId());
                if (value.getMsgId() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getMsgId());
                }
                stmt.bindLong(3, value.getMsgType());
                stmt.bindLong(4, value.getMessageTime());
                if (value.getContent() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getContent());
                }
                if (value.getVoicePath() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getVoicePath());
                }
                if (value.getImagePath() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getImagePath());
                }
            }
        };
        this.__preparedStmtOfDeleteSelectData = new caf(__db) { // from class: com.eyevue.glassapp.database.aichat.AiChatMessageDao_Impl.2
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM AiChat WHERE messageTime = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new caf(__db) { // from class: com.eyevue.glassapp.database.aichat.AiChatMessageDao_Impl.3
            @Override // p000.caf
            public String createQuery() {
                return "DELETE FROM AiChat";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.eyevue.glassapp.database.aichat.AiChatMessageDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.aichat.AiChatMessageDao
    public void deleteSelectData(final long messageTime) {
        this.__db.assertNotSuspendingTransaction();
        bgg bggVarAcquire = this.__preparedStmtOfDeleteSelectData.acquire();
        bggVarAcquire.bindLong(1, messageTime);
        this.__db.beginTransaction();
        try {
            bggVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteSelectData.release(bggVarAcquire);
        }
    }

    @Override // com.eyevue.glassapp.database.aichat.AiChatMessageDao
    public List<AiChatMessage> getAll() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM AiChat", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "msgId");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "msgType");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "content");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "imagePath");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                AiChatMessage aiChatMessage = new AiChatMessage();
                aiChatMessage.setId(cursorQuery.getInt(columnIndexOrThrow));
                aiChatMessage.setMsgId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                aiChatMessage.setMsgType(cursorQuery.getInt(columnIndexOrThrow3));
                aiChatMessage.setMessageTime(cursorQuery.getLong(columnIndexOrThrow4));
                aiChatMessage.setContent(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                aiChatMessage.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                aiChatMessage.setImagePath(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                arrayList.add(aiChatMessage);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.aichat.AiChatMessageDao
    public List<AiChatMessage> getLatestTen() {
        xae xaeVarAcquire = xae.acquire("SELECT * FROM AiChat ORDER BY messageTime DESC", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.__db, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "msgId");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "msgType");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "content");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "imagePath");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                AiChatMessage aiChatMessage = new AiChatMessage();
                aiChatMessage.setId(cursorQuery.getInt(columnIndexOrThrow));
                aiChatMessage.setMsgId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                aiChatMessage.setMsgType(cursorQuery.getInt(columnIndexOrThrow3));
                aiChatMessage.setMessageTime(cursorQuery.getLong(columnIndexOrThrow4));
                aiChatMessage.setContent(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                aiChatMessage.setVoicePath(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6));
                aiChatMessage.setImagePath(cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7));
                arrayList.add(aiChatMessage);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            xaeVarAcquire.release();
        }
    }

    @Override // com.eyevue.glassapp.database.aichat.AiChatMessageDao
    public void insert(final AiChatMessage message) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAiChatMessage.insert(message);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
