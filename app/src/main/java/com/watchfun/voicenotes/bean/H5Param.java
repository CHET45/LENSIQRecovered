package com.watchfun.voicenotes.bean;

/* JADX INFO: loaded from: classes7.dex */
public class H5Param {

    public static class DeleteParam {

        /* JADX INFO: renamed from: id */
        public String f26446id;
    }

    public static class ExportDocumentParam extends ExportParam {
        public byte[] fileData;
    }

    public static class ExportParam {
        public String fileName;
        public String fileType;
    }

    public static class GenerateSummaryParam {

        /* JADX INFO: renamed from: id */
        public String f26447id;
        public String language;
        public String templateType;
    }

    public static class RenameParam {

        /* JADX INFO: renamed from: id */
        public String f26448id;
        public String name;
    }

    public static class SetLanParam {
        public String key;
        public String name;
    }
}
