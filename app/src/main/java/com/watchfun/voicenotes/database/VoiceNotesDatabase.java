package com.watchfun.voicenotes.database;

import android.content.Context;
import p000.mi3;
import p000.ova;
import p000.p7e;
import p000.tae;
import p000.uae;
import p000.wfg;

/* JADX INFO: loaded from: classes7.dex */
@mi3(entities = {VoiceNotesBean.class}, version = 2)
public abstract class VoiceNotesDatabase extends uae {
    private static volatile VoiceNotesDatabase INSTANCE;
    public static final ova MIGRATION_1_2 = new ova(1, 2) { // from class: com.watchfun.voicenotes.database.VoiceNotesDatabase.1
        @Override // p000.ova
        public void migrate(wfg wfgVar) {
            wfgVar.execSQL("ALTER TABLE voicenotes ADD COLUMN id TEXT");
        }
    };

    @p7e({p7e.EnumC10826a.f69934a})
    public static VoiceNotesDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (VoiceNotesDatabase.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = (VoiceNotesDatabase) tae.databaseBuilder(context.getApplicationContext(), VoiceNotesDatabase.class, "voicenotes").addMigrations(MIGRATION_1_2).allowMainThreadQueries().build();
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public abstract VoiceNotesDao messageDao();
}
